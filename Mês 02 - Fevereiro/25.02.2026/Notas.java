import java.util.Arrays;

public class Notas {

    private Professor professor;
    private Aluno aluno;
    private double[] notas;

    public Notas(Professor professor, Aluno aluno, double[] notas) {
        this.professor = professor;
        this.aluno = aluno;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "professor=" + professor +
                ", aluno=" + aluno +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
