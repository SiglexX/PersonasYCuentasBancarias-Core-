package com.jossemorales;

import com.jossemorales.clases.Persona;
import com.jossemorales.clases.CuentaBancaria;

public class Aplicacion {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Josse", 23);
		Persona persona2 = new Persona("Jenn", 24);
		Persona persona3 = new Persona("Celmira", 43);
		
		CuentaBancaria cuenta1 = new CuentaBancaria(2000.0, persona1);
		CuentaBancaria cuenta2 = new CuentaBancaria(1500.0, persona2);
		CuentaBancaria cuenta3 = new CuentaBancaria(3000.0, persona3);
		
		cuenta1.depositar(1000.0);
		cuenta1.retirar(1500.0);
		
		cuenta2.depositar(500);
		cuenta2.retirar(3000);
		
		cuenta3.depositar(3000);
		cuenta3.retirar(1000);
		
		System.out.println("");
		System.out.println("Saldo actual: ");
		System.out.println("Cuenta de Josse:" + cuenta1.getSaldo());
		System.out.println("-------------------------");
		System.out.println("Cuenta de Jenn:" + cuenta2.getSaldo());
		System.out.println("-------------------------");
		System.out.println("Cuenta de Celmira:" + cuenta3.getSaldo());
		
		System.out.println("");
		CuentaBancaria.imprimeInformacionDeTodasLasCuenas();
	}

}
