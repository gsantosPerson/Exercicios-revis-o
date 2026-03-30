
public class App {
    private String nome;
    private float versao;
    private int numDownloads;
    private float avaliacao;

    public App(String nome, float versao, int numDownloads, float avaliacao){
     this.nome = nome;
     this.versao = versao;
     this.numDownloads = numDownloads;
     this.avaliacao = avaliacao;   
    }

    public App(String nome, float versao){
        this.nome = nome;
        this.versao = versao;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Versão: "+this.versao);
        System.out.println("Número de donwloads: "+this.numDownloads);
        System.out.println("Avaliação: "+this.avaliacao);
    }
    public float atualizar(){
        return  this.versao++;
    }

    public void atualizar(float updateVersion, float avalizacao){
        System.out.println("Nova versão: "+(this.versao = updateVersion));
        System.out.println("Avaliação: "+(this.avaliacao = avalizacao));
    }

    public static void main(String[]args){
        App app = new App("Futbin", 1.5f, 100000, 4.8f);

        System.out.println("Informações iniciais: ");
        app.mostrarDetalhes();
        System.out.println("Versão atual: "+(app.atualizar()));

        app.mostrarDetalhes();
        app.atualizar(2.5f, 4.6f);
        app.mostrarDetalhes();
        app.atualizar();
    }

}
