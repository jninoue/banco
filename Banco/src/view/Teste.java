package view;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Teste {

	public static void main(String[] args) {
		Cliente felicity = new Cliente(
				"Felicity Jones",
				"felicity@gmail.com",
				"123.123.456.748",
				Utils.stringParaData("17/05/1981"));
		
		Cliente angelina = new Cliente(
				"Angelina Jolie",
				"angelina@gmail.com",
				"723.823.659.748",
				Utils.stringParaData("23/02/1979"));
		
		
		System.out.println(felicity);
		System.out.println();
		
		//System.out.println(angelina);
		
		Conta c101 = new Conta(felicity);
		Conta c102 = new Conta(angelina);
		
		c101.setLimite(200.0);
		c101.depositar(500.0);
		//c102.depositar(500.0);
		
		//c101.sacar(600.0);
		c101.transferir(c102, 800.0);
		System.out.println(c101);
		System.out.println(c102);

	}

}
