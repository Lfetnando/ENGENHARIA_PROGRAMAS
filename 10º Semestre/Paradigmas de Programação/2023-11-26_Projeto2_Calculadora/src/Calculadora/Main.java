package Calculadora;

import javax.swing.JOptionPane;

public class Main{

	public static void main(String[] args) {
		int opcao = 0;
		boolean continuar = true;
		
		Calculadora calculadora = new Calculadora();
				
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "CALCULADORA \n\n"
					 												 + "Escolha uma opção:\n"
					 												 + "[1] OPERAÇÃO  \n"
					 												 + "[2] HISTÓRICO \n\n"
					 												 + "[0] Encerrar"));

			if(opcao < 0 || opcao > 2) {
				JOptionPane.showMessageDialog(null, "Opção inexistente!");	
			}
			else {
				
				switch(opcao) {
					
				case 1:
					calculadora.Operacoes();
					break;
				case 2:
					calculadora.Historico();
					break;
				case 0:
					continuar = false;
					break;
				}
					
			}

			
		}while(continuar);
		
	
	}

}
