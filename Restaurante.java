
public class Restaurante{
    private String nome;
    private String tipo;
    private int horario;
    private int capacidade;

    public Restaurante(String nome, String tipo, int horario, int capacidade){
        this.nome = nome; 
        this.tipo = tipo;
        this.horario = horario; 
        this.capacidade = capacidade;
    }

    public Restaurante(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void atualizarHorario(){
        this.horario = 21;
        System.out.println("Horario padrão: "+this.horario);
    }

    public void atualizarHorario(int novoHorario){
        this.horario = novoHorario;
        System.out.println("Novo horario: "+this.horario);
    }

    public static void main(String[]args){
        Restaurante restaurante = new Restaurante("Boibravo", "Fechada", 19, 5);

        restaurante.atualizarHorario();
        restaurante.atualizarHorario(15);
    }
}