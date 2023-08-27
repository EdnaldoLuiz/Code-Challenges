package Desafio19;


public class TesteCarro {

	  public static void main(String[] args163) {

	  Carro carro = new Civic();
	  carro.acelerar();
	
	  carro.frear();
	  carro.frear();

	  carro.frear();
	  carro.frear();
	  
	  Carro ferrari = new Ferrari(300);
	  ferrari.acelerar();
	  
	  System.out.println(ferrari.acelerar() + "Km/h");
	  System.out.println(ferrari.acelerar() + "Km/h");
	  System.out.println(ferrari.frear() + "Km/h");
	  System.out.println(ferrari.acelerar() + "Km/h");
	  System.out.println(ferrari.frear() + "Km/h");

	 
	  System.out.println(ferrari.acelerar() + "Km/h");
	  System.out.println(ferrari.acelerar() + "Km/h");
	  System.out.println(ferrari.acelerar() + "Km/h");
	  System.out.println(ferrari.frear() + "Km/h");
	  System.out.println(ferrari.acelerar() + "Km/h");





	  }
}

	