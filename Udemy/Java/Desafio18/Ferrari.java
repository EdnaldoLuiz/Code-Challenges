package Desafio18;

public class Ferrari extends Carro {

Ferrari() {
		super(300);
}

Ferrari(int maxSpeed) {
	super(maxSpeed);
	delta = 15;
}

@Override
public int frear() {
velocidade -= 10;
if (velocidade >= 10) {
  System.out.println("Freiando, PRRRRR........");
  } else if (velocidade <=10 && velocidade >=0) {
  System.out.println("Parando.....");
  } else {
	  velocidade = 0;
	    System.out.println("Carro parado!");
  }
  return velocidade;
}

}
