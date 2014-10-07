import java.util.Scanner;

import com.zubiri.geometria.*;

//CLASSPATH=:/home/zubiri/ProyectosJava; export CLASSPATH

public class OperacionesGeometricas {

	public static void main (String[] args) {

	String seleccion;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\nDe que figura quieres hacer los cálculos? Escribe 'circulo' o 'rectangulo'");

	seleccion = sc.next();


	if(seleccion.equalsIgnoreCase("circulo")){
	//System.out.println("has elegido circulo");

	float numero1, resultadoArea, resultadoCircun;

	System.out.print("\ningresa un número: ");
	numero1 = sc.nextFloat();

	Circulo operaciones = new Circulo(numero1);

	resultadoArea = operaciones.Area();
	resultadoCircun = operaciones.Circu();

	System.out.println("\nEl resultado del AREA es: " + resultadoArea);
	System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircun);
	
	System.out.println("\n\nEGUN ONA IZAN!!\n");

	}


	else if (seleccion.equals("rectangulo")){
	//System.out.println("has elegido rectangulo");

	  double altura = 0, base = 0;
          double result = 0;
		
          System.out.print("Estamos trabajando con un rectangulo");

          System.out.print("\ningresa la altura: ");
          altura = sc.nextFloat();

	  System.out.print("\ningresa la base: ");
          base = sc.nextFloat();

	  Rectangulo rectangulo = new Rectangulo(base, altura);

	  result =  rectangulo.area();
	  System.out.println("El area del rectangulo: " + result); 
			
	  result =  rectangulo.perimetro();
	  System.out.println("El perimetro del rectangulo: " + result); 


	}
	else{
	System.out.println("Error no has elegido la figura correcta");
	}

}
}
