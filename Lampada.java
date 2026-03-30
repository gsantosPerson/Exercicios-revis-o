public class Lampada{
    private float potencia;
    private String corLuz;
    private boolean status;
    private String marca;

    public Lampada(float potencia, String corLuz, boolean status, String marca){
        this.potencia = potencia;
        this.corLuz = corLuz;
        this.status = status;
        this.marca = marca;
    }

    public Lampada(String corLuz, float potencia, String marca, boolean status){
        this.corLuz = corLuz;
        this.potencia = potencia;
        this.marca = marca;
        this.status = status;
    }

    public void alterarStatus(){
        this.status = !this.status;
        if(this.status){
            System.out.println("Ligada");
        }
        else
            System.out.println("Desligada");
    }

    public void alterarStatus(boolean alterarManualmente){
        this.status = alterarManualmente;
        
        if(alterarManualmente){
            
            System.out.println("Status: ligada");
        }
        else{
            
            System.out.println("Status: desligada");
        }
        
    }


    public static void main(String[]args){
        Lampada lampada = new Lampada("Amarela", 55f, "Genérica", true);
        System.out.println("Estado inicial: "+lampada.status);
        lampada.alterarStatus();
        lampada.alterarStatus();
        lampada.alterarStatus(false);

    }
}