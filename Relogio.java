package exercicios;

public class Relogio{
    private String horaAtual;
    private String formato;
    private boolean statusAlarme;

    public Relogio(){
        this.horaAtual = "05:00";
    }

    public Relogio(String horaAtual, String formato, boolean status){
        this.horaAtual = horaAtual;
        this.formato = formato;
        this.statusAlarme = status;
    }

    public void ajustarHorario(){
        this.horaAtual = "00:00";
        System.out.println("Horario atual: "+this.horaAtual);
    }

    public void ajustarHorario(String novoHorario){
        this.horaAtual = novoHorario;
        System.out.println("Horario atual: "+this.horaAtual);
    }

    public static void main(String[]args){
        Relogio relogio = new Relogio("15:00", "12h", false);

        relogio.ajustarHorario();
        relogio.ajustarHorario("23:00");
        relogio.ajustarHorario();
    }
}