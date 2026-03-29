package exercicios;

import java.util.Scanner;

public class Restaurante {
    private String nome;
    private String cozinha;
    private float horario;
    private int capacidade;
    

    public Restaurante(String nome, String cozinha, float horario, int capacidade){
        this.nome = nome;
        this.cozinha = cozinha;
        this.horario = horario;
        this.capacidade = capacidade;
    }

    public Restaurante(String nome, String cozinha){
        this.nome = nome;
        this.cozinha = cozinha;
    }

    public void atualizarHorario(){
        System.out.println("Horário padrão: "+(this.horario = 25f));
    }

    public void atualizarHorario(float novoHorario){
        System.out.println("Horário personalizado: "+(this.horario = novoHorario));
    }

    public static void main(String[]args){
        Restaurante restaurante = new Restaurante("boi", "completa", 24f, 50);
    Scanner input = new Scanner(System.in);

        restaurante.atualizarHorario();

        System.out.println("Horário personalizado: ");
        float novoHorario = input.nextFloat();

       restaurante.atualizarHorario(novoHorario);
        input.close();
    }
}
