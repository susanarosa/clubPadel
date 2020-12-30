/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubpadel;

import java.util.Scanner;

/**
 *
 * @author Soro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el código de socio: ");
        int codigoSocio = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Introduce nombre y apellidos: ");
        String nomApeSocio = sc.nextLine();
        
        System.out.print("Introduce la edad: ");
        byte edadSocio = sc.nextByte();
        sc.nextLine();
        
        System.out.print("Introduce un teléfono: ");
        String telSocio = sc.nextLine();
        
        System.out.print("Introduce un correo-e: ");
        String correoESocio = sc.nextLine();
        
        System.out.print("¿Los padres son socios? (S/N)");
        char respuesta = sc.next().charAt(0);
        sc.nextLine();
        
        boolean padresSocios;
        if (respuesta == 's' || respuesta == 'S') 
            padresSocios = true;
        else
            padresSocios = false;
        
        SocioClubPadel socio1 = new SocioClubPadel(codigoSocio,nomApeSocio,edadSocio, telSocio, correoESocio, padresSocios);
        socio1.setDireccion("Calle Huerto Molino, 6");
        SocioClubPadel socio2 = new SocioClubPadel(123, "Perico", (byte)45, "87854565", "pepe@slkdfjs", true);
        socio2.setDireccion("Calle Camino Real, 15");
        System.out.println(socio1.toString());
        System.out.println(socio2.toString());
         }
    
}
