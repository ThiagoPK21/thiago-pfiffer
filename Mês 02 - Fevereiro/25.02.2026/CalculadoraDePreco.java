
/**
 * 1)<br>
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.<br>
 * 
 * Violação do princípio aberto/fechado.<br>
 * 
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco {

	public static double calcularImposto(double preco, double imposto) {
		double resultado = preco;
		resultado = resultado + (preco * imposto);
		return resultado;
	}

	public static double calcularDesconto(double preco, double desconoto){
		double resultado = preco;
		resultado = resultado - (preco * desconoto);
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(calcularImposto(100, 0.25));
		System.out.println(calcularDesconto(100, 0.10));
	}
}
