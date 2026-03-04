public class Aluno {

    private String nomeAluno;
    private String sala;

    public Aluno(String nomeAluno, String sala) {
        this.nomeAluno = nomeAluno;
        this.sala = sala;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", sala='" + sala + '\'' +
                '}';
    }
}
