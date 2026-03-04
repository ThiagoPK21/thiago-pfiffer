/**
 * 3) <br>
 * 
 * A classe concentra múltiplas responsabilidades:<br>
 * 
 * Dados do aluno.<br>
 * 
 * Dados do professor.<br>
 * 
 * Cálculo de média.<br>
 * 
 * Impressão de boletim.<br> <br>
 * 
 * Viola o Princípio da Responsabilidade Única (SRP).<br>
 * 
 * Dificulta manutenção, testes e reutilização do código.
 */
public class SistemaEscolar {

	public void imprimirBoletim(Aluno aluno, Professor prof, Notas notas) {
		System.out.println("Aluno: " + aluno.getNomeAluno());
		System.out.println("Professor: " + prof.getNomeProfessor());
		System.out.println("Disciplina: " + prof.getDisciplina());
		System.out.println("Sala: " + aluno.getSala());
		System.out.println("Média: " + notas.calcularMedia());
	}
}