package exercicios;

public class Curso {
    private String nome;
    private float cargaHoraria;
    private String areaConhecimento;
    private String nomeProfessor;

    public Curso(String nome, float cargaHoraria, String areaConhecimento, String nomeProfessor){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.areaConhecimento = areaConhecimento;
        this.nomeProfessor = nomeProfessor;
    }

    public void exebirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Carga horária: "+this.cargaHoraria);
        System.out.println("Area de conhecimento: "+this.areaConhecimento);
        System.out.println("Nome do professor: "+this.nomeProfessor);
    }
    
    public Curso(String nome, float cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public static void main(String[]args){
        Curso curso = new Curso("Ciência da computação", 23f, "IA", "Marcos");
        Curso curso2 = new Curso("Direito", 46f);
        curso.exebirDetalhes();
        curso2.exebirDetalhes();
    }
}