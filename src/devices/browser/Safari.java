package devices.browser;

public class Safari implements Browser {
    protected String url;

    public void exibirPagina( String url ) {
        this.url = url;
        System.out.printf("Open uri: %s%n", this.url);
    }

    public void adicionarNovaAba() {
        System.out.println("Open new tab");
    }

    public void atualizarPagina() {
        System.out.printf("Update page %s%n", this.url);

    }
    
}
