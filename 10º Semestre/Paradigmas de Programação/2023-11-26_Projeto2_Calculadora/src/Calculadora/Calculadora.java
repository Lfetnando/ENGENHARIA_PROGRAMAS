package Calculadora;

import javax.swing.JOptionPane;

public class Calculadora implements iCalculadora{
	Operacao operacao = new Operacao();
	Historico historico = new Historico();
	
	private int opcao;

	//CONSTRUTOR
	public Calculadora() {
		this.opcao = 0;
	}

	//ENCAPSULAMENTO
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	//MÉTODOS
	public void Operacoes() {
	
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "CALCULADORA \n\n"
																 + "Escolha uma operação:\n"
																 + "1 [+] Soma  \n"
																 + "2 [–] Subtracao \n"
																 + "3 [×] Multiplicacao \n"
																 + "4 [÷] Divisao   \n\n"
																 + "0 - Voltar"));	
	
		if(opcao < 0 || opcao > 4) {
			JOptionPane.showMessageDialog(null, "Opção inexistente!");
			Operacoes();
		}
		else if(opcao >= 1 && opcao <= 4) {
			Calcular(opcao);					
		}

	}

	public void Calcular(int opcao) {
	
		float n1, n2, resultado = 0;
		String operador = null;
	
			n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o 1° número:\n"));
			n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o 2° número:\n"));
	
			switch(opcao) {
	
			case 1:
				resultado = operacao.Soma(n1, n2);
				operador = "+";
				break;
			case 2:
				resultado = operacao.Subtracao(n1, n2);
				operador = "–";
				break;
			case 3:
				resultado = operacao.Multiplicacao(n1, n2);
				operador = "×";
				break;
			case 4:
				resultado = operacao.Divisao(n1, n2);
				operador = "÷";
				break;
		}
			
		historico.salvarCalculo(n1, n2, operador, resultado);
		JOptionPane.showMessageDialog(null, n1 +" " 
										  + operador +" " 
										  + n2 +" " 
										  + "=" +" " 
										  + resultado);
	}
	
	public void Historico() {
		String calculos = historico.listarCalculo();
		
		if(!calculos.isEmpty()) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, calculos + "\n"
																     + "\nLimpar Histórico?\n"
																     + "[1]SIM     [2]NAO"));
		
			if(opcao < 1 || opcao > 2) {
				JOptionPane.showMessageDialog(null, "Opção inexistente!");
			}
			else if(opcao == 1) {
				historico.limparCalculo();
			}
		}
	
	}

}
