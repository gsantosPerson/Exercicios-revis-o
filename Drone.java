package exercicios;

public class Drone {
    private String modelo;
    private float peso;
    private float autonomia;
    private boolean status;

    public Drone(String modelo, float peso, float autonomia, boolean status){
        this.modelo = modelo;
        this.peso = peso;
        this.autonomia = autonomia;
        this.status = status;
    }

    public Drone(String modelo, float peso){
        this.modelo = modelo;
        this.peso = peso;
    }

    public void voar(){
        this.status = !this.status;

        if(this.status == true)
            System.out.println("Voo ativado");
            else
                System.out.println("Voo desativado");
    }

    public void voar(float duracao){
        this.status = !this.status;

        if(this.status == true)
            System.out.println("Voo ativado");
            else
                System.out.println("Voo desativado");

            System.out.println("Tempo de voo vestimado: "+duracao);
    }

    public static void main(String[]args){
        Drone drone = new Drone("Pro", 23f, 8f, false);

        drone.voar();
        drone.voar();
        drone.voar(12f);
    }
}
