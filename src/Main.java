//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.nome = "O Pequeno Principe";
        livro1.paginas = 288;
        livro1.autor = "Antoine de Saint-Exupéry";
        livro1.disponibilidade = true;

        biblioteca.adicionarLivro(livro1);

        Livro livro2 = new Livro();
        livro2.nome = "Dom Casmurro";
        livro2.paginas = 131;
        livro2.autor = "Machado de Assis";
        livro2.disponibilidade = false;

        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();
    }
}