package ifs;

public class If_Switch {

	public static void main(String[] args) {
		
		int mesNum;
		String mesText = "Marzo";

		if (mesText == "Enero")
		        mesNum = 1;
		else if (mesText == "Febrero")
		        mesNum = 2;
		else if (mesText == "Marzo")
		        mesNum = 3;
		else if (mesText == "Abril")
		        mesNum = 4;
		else if (mesText == "Mayo")
		        mesNum = 5;
		else if (mesText == "Junio")
		        mesNum = 6;
		else if (mesText == "Julio")
		        mesNum = 7;
		else if (mesText == "Agosto")
		        mesNum = 8;
		else if (mesText == "Septiembre")
		        mesNum = 9;
		else if (mesText == "Octubre")
		        mesNum = 10;
		else if (mesText == "Noviembre") 
		        mesNum = 11;
		else if (mesText == "Diciembre")
		        mesNum = 12;
		else
		    mesNum = 0;

		System.out.println(mesNum);
		
	}
	
}
