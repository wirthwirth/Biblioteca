public class Biblioteca {
    Livro [] livros = new Livro [3];
    public void listarLivros () {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].disponibilidade) {
                    System.out.println(livros[i].nome + " Disponivel para alugar!!");
                } else {
                    System.out.println(livros[i].nome + " Indisponivel para alugar!!");
                }
            }
        }
    }
        public void adicionarLivro (Livro livro1){
            for (int i = 0; i < livros.length; i++) {
                if (livros[i] == null) {
                    livros[i] = livro1;
                    break;
                }
            }
        }
    }
