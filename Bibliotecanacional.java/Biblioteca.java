package BibliotecaNacional.java;

public class Biblioteca {
    public static void main(String[] args) {
        Autor robert = new Autor();
        robert.nome = "Robert Cecil Martin";
        robert.nacionalidade = "Brasileiro";

        Livro codigoLimpo = new Livro();
        codigoLimpo.titulo = "Barrados no Baile 2 ";
        codigoLimpo.anoPublicacao = 2023;
        codigoLimpo.autor = robert;
        
        System.out.println("\nO livro " + codigoLimpo.titulo + " foi escrito por " + codigoLimpo.autor.nome + " que é " + codigoLimpo.autor.nacionalidade);
    }
    
}
/*package Biblioteca;

public class biblioTeca {
    public static void main(String[] args) {
        
        Autor robert = new Autor();
        robert.nome = "Robert Celino";
        robert.nacionalidade = "Brasileiro";

        Livro codigoLimpo = new Livro();
        codigoLimpo.titulo = "Codigo Limpo";
        codigoLimpo.anoPublicacao = 2008;
        codigoLimpo.autor = robert;

        System.out.println("\nO livro " + codigoLimpo.titulo + " foi escrito por " + codigoLimpo.autor.nome + " que é " + codigoLimpo.autor.nacionalidade);
        
    }
} */