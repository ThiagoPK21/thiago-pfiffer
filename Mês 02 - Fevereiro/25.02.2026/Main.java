import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("osmar", "osmarsensual@gmail.com");
        Produto p1 = new Produto("Queijo", "vinte e dois", 15);
        Pedido e1 = new Pedido(c1,p1,3, LocalDate.now());

        e1.imprimirResumo();
    }
}
