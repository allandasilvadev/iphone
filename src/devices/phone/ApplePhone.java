package devices.phone;

public class ApplePhone implements Phone {
    protected String numeroSelecionado;

    public void ligar(String numero) {
        this.numeroSelecionado = numero;
        System.out.printf("ligando para: %s%n", this.numeroSelecionado);
    }

    public void atender() {
        System.out.println("atendendo telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }
    
}
