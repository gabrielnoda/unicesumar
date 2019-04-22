package aep.programacao;

public class Avaliação {
	private Aluno aluno;
	private Disciplina disciplina;
	private float nota;
	
	public Avaliação(Aluno aluno, Disciplina disciplina, float nota) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}

	public float getNota() {
		return nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}
}
