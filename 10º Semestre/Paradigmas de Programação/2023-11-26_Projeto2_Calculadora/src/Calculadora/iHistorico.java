package Calculadora;

public interface iHistorico {
	
	  public void salvarCalculo(float n1, float n2, String op, float resultado);
	  public void limparCalculo();
	  public String listarCalculo();
	  
}
