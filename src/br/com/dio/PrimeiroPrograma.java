package br.com.dio;
import br.com.dio.model.Gato;
import java.util.Objects;

public class PrimeiroPrograma {
    private static String nome;
    private static Object numPaginas;

    public static void mains(String[]args){
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 360);
        System.out.println(livro1);
       /* int a = 5;
        int b = 2;
        System.out.println("Hello World!" + (a+b));*/
    }
}
class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }
}
