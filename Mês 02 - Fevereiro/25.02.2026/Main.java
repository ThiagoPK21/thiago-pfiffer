import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        Cliente c1 = new Cliente("osmar", "osmarsensual@gmail.com");
//        Produto p1 = new Produto("Queijo", "vinte e dois", 15);
//        Pedido e1 = new Pedido(c1, p1, 3, LocalDate.now());
//
//        e1.imprimirResumo();

        double[] nota = {3, 6, 9};
        SistemaEscolar se = new SistemaEscolar();

        Aluno a1 = new Aluno("Osmar Jr", "C3P0");
        Professor p1 = new Professor("Crash bandicoot", "Biologia", 160);
        Notas n1 = new Notas(p1, a1, nota);
        System.out.println(n1.calcularMedia());
        se.imprimirBoletim(a1, p1, n1);

    }
}
