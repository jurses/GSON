package p1;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		
		System.out.print("Apellidos: ");
		String surname = sc.nextLine();
		
		System.out.print("Edad: ");
		int age = sc.nextInt();
		
		Persona fulano = new Persona();
		fulano.setInfo(name, surname, age);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String s_json = gson.toJson(fulano);
		System.out.println(s_json);
		
		sc.close();
	}

}
