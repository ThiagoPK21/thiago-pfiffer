import java.time.LocalDate;

/**
 * 4)<br>
 * 
 * Múltiplas responsabilidades na mesma classe.<br>
 * 
 * A classe Pedido cuida de:<br>
 * 
 * Dados do cliente (nome, email).<br>
 * 
 * Dados do produto (nome, preço).<br>
 * 
 * Lógica de cálculo (total do pedido).<br>
 * 
 * Apresentação (impressão no console).<br><br>
 * 
 * Isso viola o Princípio da Responsabilidade Única (SRP).
 * 
 * 
 * Os atributos não pertencem todos ao mesmo “conceito”:<br><br>
 * 
 * Cliente ≠ Produto ≠ Pedido.<br>
 * 
 * Alterações em cliente ou produto impactam diretamente o pedido.<br><br>
 * 
 * 
 * Não é possível reutilizar Cliente ou Produto em outro contexto.<br>
 * 
 * Se um cliente fizer vários pedidos, os dados ficam duplicados.<br>
 * 
 * Um produto não pode ser compartilhado entre pedidos.<br>
 * 
 */
public class Pedido {

	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	LocalDate horaCompra = LocalDate.now();

	public Pedido(Cliente cliente, Produto produto, int quantidade, LocalDate horaCompra) {
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.horaCompra = horaCompra;
	}

	public double calcularTotal() {
		return produto.getPrecoProduto() * quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getHoraCompra() {
		return horaCompra;
	}

	public void setHoraCompra(LocalDate horaCompra) {
		this.horaCompra = horaCompra;
	}

	public void imprimirResumo() {
		System.out.println("Cliente: " + cliente.getNomeCliente());
		System.out.println("Email: " + cliente.getEmailCliente());
		System.out.println("Produto: " + produto.getNomeProduto());
		System.out.println("Preço unitário: " + produto.getPrecoProduto());
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Total: " + calcularTotal());
		System.out.println("Horario da compra: " + horaCompra);
	}
}