package br.com.stream.impl;


public class Main {
	
	    public static void main(String[] args) {
	        /*
	         * Para executar, altere a Stream abaixo (aAbBABacafe) para a Stream de desejada.
	         */
	        char resul = LocalizaVogal.primeiroCaracter(new CaracterStream("aAbBABacafe"));
	        if(resul != LocalizaVogal.VAZIO) {
	            System.out.println("\nCaracter encontrado: " + resul);
	        } else {
	            System.out.println("\nCaracter nao localizado.");
	        }
	    }
	}


