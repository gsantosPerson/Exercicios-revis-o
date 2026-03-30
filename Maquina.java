public class Maquina {
    private float capacidade;
    private float nivelDeAgua;
    private String tipoDeCafe;
    private boolean StatusFuncionamento;

    public Maquina(float capacidade, float nivelDeAgua, String tipoDeCafe, boolean statusFuncionamento){
        this.capacidade = capacidade;
        this.nivelDeAgua = nivelDeAgua;
        this.tipoDeCafe = tipoDeCafe;
        this.StatusFuncionamento = statusFuncionamento;
    }

    public Maquina(float capacidade, String tipoDeCafe){
        this.capacidade = capacidade;
        this.tipoDeCafe = tipoDeCafe;
        this.nivelDeAgua = 0;
        this.StatusFuncionamento = false;
    }

    public void fazerCafe(){
        System.out.println("Capacidade: "+(this.capacidade = 14f));
        System.out.println("Nível da água: "+(this.nivelDeAgua = 100f));
        System.out.println("Tipo de café: "+(this.tipoDeCafe = "Expresso"));

        if(this.StatusFuncionamento)
            System.out.println("Status da máquina: Ligada");
        else
            System.out.println("Status da máquina: Desligada");
        
    }

    public void fazerCafe(String tipoDeCafe, float nivelDeAgua){
        System.out.println("Tipo de café: "+(this.tipoDeCafe = tipoDeCafe));
        System.out.println("Nível da água: "+(this.nivelDeAgua = nivelDeAgua));
    }

    public static void main(String[]args){
        Maquina maquina = new Maquina(5f, 90f, "Mocca", true);

        maquina.fazerCafe();
        maquina.fazerCafe("Puro", 50f);
    }


}
