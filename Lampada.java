package exercicios;

import java.util.Scanner;

public class Lampada {
    private float potencia;
    private String cor;
    private boolean status;
    private String marca;

    public Lampada(float potencia, String cor, boolean status, String marca){
        this.potencia = potencia;
        this.cor = cor;
        this.status = status;
        this.marca = marca;
    }

    public Lampada(String cor, boolean status){
        this.cor = cor;
        this.status = status;
    }

    public void alterarStatus(){
        this.status = !this.status;
        if(this.status == true){
            System.out.println("Estado autal: ligada");
        }
        else{
            System.out.println("Estado atual: desligada");
        }
    }

    public void alterarEntrada(boolean inputEstado){
        if(inputEstado == true){
            System.out.println("Lâmpada ligada");
        }
        else{
            System.out.println("Lâmpada desligada");
        }
    }

    public static void main(String[]args){
        Lampada lampada = new Lampada(35f, "Amarela", false, "generica");
        Scanner input = new Scanner(System.in);
        lampada.alterarStatus();    
        
        System.out.println("true - ligada\nfalse - desligada");
        boolean inputEstado = input.nextBoolean(); 

        lampada.alterarEntrada(inputEstado);

        input.close();
    }
}
