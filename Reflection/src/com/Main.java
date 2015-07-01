package com;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	
	public static void main(String args[]) {
		
		Object arquivoFromReflection = null;
		
		try {
			arquivoFromReflection = Class.forName("Arquivo").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Nome da Classe: " + arquivoFromReflection.getClass().getName());
		
		System.out.println();
		System.out.println("Metodos: ");
		for (Method m : arquivoFromReflection.getClass().getMethods()) {
			System.out.println(m.getName() + ", ");
		}
		
		System.out.println();
		System.out.println("Atributos: ");
		for (Field f : arquivoFromReflection.getClass().getDeclaredFields()) {
			System.out.println(f.getName() + ", ");
		}
	}
}