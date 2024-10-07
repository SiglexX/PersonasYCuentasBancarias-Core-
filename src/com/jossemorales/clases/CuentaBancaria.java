package com.jossemorales.clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
	private double saldo;
	private Persona titular;
	private int numeroCuenta;
	private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
	
	public CuentaBancaria(double saldo, Persona titular) {
		this.saldo = saldo;
		this.titular = titular;
		this.numeroCuenta = generarNumeroCuenta();
		listaDeCuentasBancarias.add(this);
	}
	
    private int generarNumeroCuenta() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public static ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
		return listaDeCuentasBancarias;
	}

	public static void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> listaDeCuentasBancarias) {
		CuentaBancaria.listaDeCuentasBancarias = listaDeCuentasBancarias;
	}
	
    public void depositar(double monto) {
    	if(monto > 0) {
    		saldo += monto;
    		System.out.println("Usted depositó: " + monto);
    	} else {
    		System.out.println("Fondos insuficientes o inválidos");
    	}
    }
    
    public void retirar(double monto) {
    	if (monto > 0 && monto <= saldo) {
    		saldo -= monto;
    		System.out.println("Usted retiró: " + monto);
    	} else {
    		System.out.println("Fondos insuficientes para retiro");
    	}
    }
    
    public void despliegaInformacion() {
    	System.out.println("Número de cuenta: " + numeroCuenta);
    	System.out.println("Saldo: " + saldo);
    	System.out.println("Titular: ");
    	titular.despliegaInformacion();
    	System.out.println();
    }
    
    public static void imprimeInformacionDeTodasLasCuenas() {
    	System.out.println("Información de todas las cuentas: ");
    	for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
    		cuenta.despliegaInformacion();
    	}
    }
}
