package aep.programacao;

public class Avalia��o {
	private Aluno aluno;
	private Disciplina disciplina;
	private float nota;
	
	public Avalia��o(Aluno aluno, Disciplina disciplina, float nota) {
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
