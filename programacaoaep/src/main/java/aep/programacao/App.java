package aep.programacao;

public class App {
	public static void main(String[] args) {

		Aluno gabriel = new Aluno(1, "Gabriel");
		Aluno leonardo = new Aluno(2, "Leonardo");
		Aluno heloise = new Aluno(3, "Heloise");
		Aluno giovanni = new Aluno(4, "Giovanni");
		Aluno ton = new Aluno(5, "Ton");
		Aluno luana = new Aluno(6, "Luana");
		Aluno guilherme = new Aluno(7, "Guilherme");
		Aluno hugo = new Aluno(8, "Hugo");
		Aluno flavia = new Aluno(9, "Flavia");
		Aluno rafaela = new Aluno(10, "Rafaela");

		System.out.println(rafaela.getNome());
		System.out.println(rafaela.getRa());

		Disciplina mat = new Disciplina("Matematica");
		Disciplina port = new Disciplina("Portugues");
		Disciplina geo = new Disciplina("Geografia");
		Disciplina fis = new Disciplina("Fisica");
		Disciplina hist = new Disciplina("Historia");

		System.out.println(mat.getNome());

		Avaliação a1 = new Avaliação(gabriel, mat, 5f);
	}
}
