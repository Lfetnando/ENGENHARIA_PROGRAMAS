package Calculadora;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

public class Historico implements iHistorico{

	private ArrayList<String> historico;

	public Historico() {
		historico = new ArrayList<String>();
	}
	
	public void salvarCalculo(float n1, float n2, String op, float resultado)	{
		historico.add(n1+" "+ op+" " + n2+" " + "="+" " + resultado);
	}
	
	public String listarCalculo() {
		Iterator<String> iterator = historico.iterator();
		String calculos = "";
		
		if(historico.size()==0) {
			JOptionPane.showMessageDialog(null, "HISTÓRICO VAZIO");
		}
		else {
				while(iterator.hasNext()) {
					calculos += iterator.next() + "\n";
				}
		}
		return calculos;
		
	}
	
	public void limparCalculo(){
		historico.clear();
	}
}
