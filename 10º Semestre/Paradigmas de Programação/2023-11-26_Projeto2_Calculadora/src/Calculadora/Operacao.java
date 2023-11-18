package Calculadora;

public class Operacao implements iOperacao {

	private float resultado;

		
	//CONSTRUTOR
	public Operacao() {
		this.resultado = 0;
	}
	
	//ENCAPSULAMENTO
	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	//MÉTODOS

	public float Soma(float n1, float n2) {
		return resultado = n1 + n2;
	}
	
	public float Subtracao(float n1, float n2) {
		return resultado = n1 - n2;
	}
	
	public float Multiplicacao(float n1, float n2) {
		return resultado = n1 * n2;
	}
	
	public float Divisao(float n1, float n2) {
		return resultado = n1 / n2;
	}


	
}	
