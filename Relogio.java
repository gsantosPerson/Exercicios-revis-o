package exercicios;

import java.util.Scanner;

public class Relogio {
    private String horaAtual ;
    private String formato;
    private boolean status;

    public Relogio(){
        this.horaAtual = "15:00";
        this.formato = "12h";
        this.status = true;
    }

    public Relogio(String horaAtual, String formato, boolean status){
        this.horaAtual = horaAtual;
        this.formato = formato;
        this.status = status;
    }

    public Relogio(String horaAtual, boolean status){
        this.horaAtual = horaAtual;
        this.status = status;
    } 

    public void ajutarHorario(){
        this.horaAtual = "00:00";
        System.out.println("Horario atual: "+this.horaAtual);
    }

    public void ajustarHorario(String novoHorario){
        System.out.println("Novo horário: "+ (this.horaAtual = novoHorario));
    }
    public static void main(String[]args){
       Relogio relogio = new Relogio();
       Relogio relogia2 = new Relogio("16:00", "24", false); 

       relogio.ajutarHorario();
       relogio.ajustarHorario("22:00");
    }
}
