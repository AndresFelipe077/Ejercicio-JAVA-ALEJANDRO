package main;
import java.util.Scanner;

import clases.*;

public class Main {

	public static void main(String[] args) {

		//Menu
		int opcion;
		
		do {
			opcion = menu();
		}while(opcion != 5);	
		
		
	}
	
	private static int menu() {
		int opcion = 0;
		Scanner entrada = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		System.out.println("Seleccione una de las siguientes opciones: ");
		System.out.println("1. Formula");
		System.out.println("2. Funcion par e impar");
		System.out.println("3. Vector numeros multiplos random");
		System.out.println("4. Estudiante");
		System.out.println("5. Salir");
		
		do {
			opcion = entrada.nextInt();
			switch(opcion)
			{
				case 1:
					//1) calcular formula  X^2 + (B*X)+C  donde x sea un numero > 2
					
					System.err.println("Opcion *FORMULA*");
					
					int x, b, c;
					System.out.println("Escribe el valor de x: ");
					x = num.nextInt();
					System.out.println("Escribe el valor de b: ");
					b = num.nextInt();
					System.out.println("Escribe el valor de c: ");
					c = num.nextInt();
					
					if(x <= 2)
					{
						System.out.println("Por favor x tiene que ser mayor a 2");
					}
					else
					{
						int resultado = x*x + (b*x) + c;
						System.out.println(resultado);
					}
					break;
				case 2:
					System.err.println("Opcion *Funcion par e impar*");
					System.out.println("Escribe un valor: ");
					int valor = num.nextInt();
					System.out.println(numParImpar(valor));
					if(numParImpar(valor))
					{
						System.err.println("***El numero es par***");
					}
					else
					{
						System.err.println("***El numero NO es par***");
					}
					break;
				case 3:
					//3)hacer un programa que permita llenar un vector con numeros aleatorios
					//y me permita recorrerlo diciendo que numeros son multiplois de 2.
					System.err.println("Opcion *Vector numeros multiplos random*");
					int vectorNumAleatorios[] = new int[10];
			 		
					for(int i = 0; i < vectorNumAleatorios.length; i++)
					{
						int numRandom = (int)(Math.random() * 11 + 1);
						vectorNumAleatorios[i] = numRandom;
						System.out.println(vectorNumAleatorios[i]);
						if(vectorNumAleatorios[i] % 2 == 0)
						{
							System.out.println("mult");
						}
						
					}
					break;
				case 4:
					//4) Realizar un programa que permita crear un vector de objetos de clase estudiante
					//donde el estudiante tenga dos atributos:


					//nombre 
					//edad
					//y peso

					//de lo anterior necesito crear un procedimiento quye me diga cuales estudiantes son:

					//a) mayores de 8 años.
					//b) los que tienen rango de edad entre 12 y 15 años.
					System.err.println("Opcion *Estudiante*");
					estudianteAtributo();
					break;
				case 5:
					System.err.println("Haz salido");
					break;
			}
			
			if(opcion < 1 || opcion > 5)
			{
				System.out.println("Opcion incorrecta");
			}
			
		}while(opcion < 1 || opcion > 5);
		return opcion;
	}

	public static boolean numParImpar(int num)
	{
		return num % 2 == 0;
	}

	public static void estudianteAtributo()
	{
		Estudiante e1 = new Estudiante("Andres", 10, 45.6);
		Estudiante e2 = new Estudiante("Smith", 13, 120);
		Estudiante e3 = new Estudiante("Nico", 50, 47);
		Estudiante e4 = new Estudiante("Alejandro", 4, 20);
		Estudiante e5 = new Estudiante("Paz", 11, 70);
		Estudiante e6 = new Estudiante("Petro", 25, 50);
		
		Estudiante vectorEstudiante[] = new Estudiante[6];
		
		vectorEstudiante[0] = e1;
		vectorEstudiante[1] = e2;
		vectorEstudiante[2] = e3;
		vectorEstudiante[3] = e4;
		vectorEstudiante[4] = e5;
		vectorEstudiante[5] = e6;
		
		for(int i = 0; i < vectorEstudiante.length; i++)
		{
			if(vectorEstudiante[i].getEdad() > 8)
			{
				System.err.println("Tiene mas de 8 años");
				e1.mostrar(vectorEstudiante[i]);
			}
			if(vectorEstudiante[i].getEdad() > 12 && vectorEstudiante[i].getEdad() < 15)
			{
				System.err.println("Su edad esta entre 12 y 15");
				e1.mostrar(vectorEstudiante[i]);
			}
		}//Fin for
		
		
	}
	
}
