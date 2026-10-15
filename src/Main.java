//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "O Pequeno Principe";
        livro.paginas = 288;
        livro.autor = "Antoine de Saint-Exupéry";
        livro.disponibilidade = true;

        Livro[] livros = new Livro[3];
        livros[0] = livro;
        livros[1] = new Livro();
        livros[1].nome = "Dom Casmurro";
        livros[1].paginas = 131;
        livros[1].autor = "Machado de Assis";
        livros[1].disponibilidade = false;

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.livros[0] = new Livro();
        biblioteca.livros[0].nome = "O Pequeno Principe";
        biblioteca.livros[0].paginas = 288;
        biblioteca.livros[0].autor = "Antoine de Saint-Exupéry" ;
        biblioteca.livros[0].disponibilidade = true;

        biblioteca.livros[1] = new Livro();
        biblioteca.livros[1].nome = "Dom Casmurro";
        biblioteca.livros[1].paginas = 131;
        biblioteca.livros[1].autor = "Machado de Assis";
        biblioteca.livros[1].disponibilidade = false;

        biblioteca.listarLivros();
    }
}