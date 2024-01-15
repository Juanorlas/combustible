package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner leerDato= new Scanner(System.in);

        System.out.print("Ingrese Su Nombre: ");
        String nombreUsuario =leerDato.nextLine();
        System.out.print("Marca Del Carro: ");
        String marcaVehiculo =leerDato.nextLine();
        System.out.print("Señor: "+nombreUsuario+" Ingrese El Numero de Kilometros a Recorrer: ");
        double distanciaKilometros=leerDato.nextDouble();
        System.out.print("Ingrese El Consumo De Combustible Del Vehiculo(Litros/100km): ");
        double consumoVehiculo=leerDato.nextDouble();
        System.out.print("Ingrese El Precio De Litro De Combustible: ");
        double costoLitro= leerDato.nextDouble();
        double gastoTotal=(((consumoVehiculo/100)*costoLitro)*distanciaKilometros);
        System.out.print("El costo total es de: $"+gastoTotal);
    }
}

//Manuela Orlas Rengifo
//Juan Diego Orlas Rengifo