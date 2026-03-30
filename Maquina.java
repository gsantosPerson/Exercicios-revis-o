public class Maquina {
    private float capacidade;
    private float nivelDeAgua;
    private String tipoDeCafe;
    private boolean statusFuncionamento;

  
    public Maquina(){
        this.capacidade = 100;
        this.nivelDeAgua = 100;
        this.tipoDeCafe = "Expresso";
        this.statusFuncionamento = true;
    }


    public Maquina(float capacidade, String tipoDeCafe){
        this.capacidade = capacidade;
        this.tipoDeCafe = tipoDeCafe;
        this.nivelDeAgua = capacidade;
        this.statusFuncionamento = true;
    }

    public void fazerCafe(){
        if(statusFuncionamento && nivelDeAgua >= 10){
            nivelDeAgua -= 10;
            System.out.println("Café padrão preparado!");
        } else {
            System.out.println("Não foi possível fazer café.");
        }
    }

    public void fazerCafe(String tipoDeCafe, float quantidadeAgua){
        if(statusFuncionamento && nivelDeAgua >= quantidadeAgua){
            this.tipoDeCafe = tipoDeCafe;
            nivelDeAgua -= quantidadeAgua;
            System.out.println("Café " + tipoDeCafe + " preparado!");
        } else {
            System.out.println("Água insuficiente ou máquina desligada.");
        }
    }

    public static void main(String[]args){
        Maquina maquina = new Maquina(100, "Expresso");
        maquina.fazerCafe();
        maquina.fazerCafe("Puro", 50f);
    }

}