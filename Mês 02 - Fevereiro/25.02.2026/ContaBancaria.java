import com.sun.tools.javac.Main;

/**
 * 2)<br>
 * Os atributos titular e saldo não estão encapsulados, violando o encapsulamento.<br>
 * 
 * Qualquer classe pode alterar o saldo diretamente (conta.saldo = -1000).<br>
 * 
 * Não há validação para valores negativos em depositar e sacar.<br>
 * 
 * A classe não protege seus invariantes (ex: saldo não deveria ser negativo).
 */
public class ContaBancaria {

	private String titular;
	private double saldo;

	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if(valor <= 0){
			throw new IllegalArgumentException("O valor não pode ser negativo");
		}
		else {
			saldo += valor;
		}
	}

	public void sacar(double valor) {
		if(valor > saldo){
			throw new IllegalArgumentException("O valor não pode ser maior que o saldo");
		}
		else if (valor <= 0){
			throw new IllegalArgumentException("O valor não pode ser menor ou igual a zero");
		}
		else {
			saldo -= valor;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(titular.isBlank()){
			throw new IllegalArgumentException("O nome não pode ficar vazio");
		}
		else {
			this.titular = titular;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria{" +
				"titular='" + titular + '\'' +
				", saldo=" + saldo +
				'}';
	}

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("osmar", 2000);
		c1.depositar(500);
		c1.sacar(1500);
		System.out.println(c1.toString());
	}
}