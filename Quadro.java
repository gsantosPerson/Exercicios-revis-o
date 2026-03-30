
public class Quadro {
    private String titulo;
    private String artista;
    private int ano;
    private String tecnica;

    public Quadro(String titulo, String artista, int ano, String tecnica){
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
        this.tecnica = tecnica;
    }

    public Quadro(String titulo, String artista){
        this.titulo = titulo;
        this.artista = artista;
    }

    public void exibirObra(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Artista: "+this.artista);
        System.out.println("Ano: "+this.ano);
        System.out.println("Técnica: "+this.tecnica);
    }

    public void exibirResumido(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Artista: "+this.artista);
    }

    public static void main(String[]args){
        Quadro quadro = new Quadro("Noite estrelada", "Van Gogh", 1920, "Óleo");
        System.out.println("Informações completas: ");
        quadro.exibirObra();
        System.out.println("Informações resumidas: ");
        quadro.exibirResumido();
    }
}
