package devices.musicplayer;

public class AppleMusic implements MusicPlayer {
    protected String musicaSelecionada;

    public void tocar() {
        System.out.println("Start music: " + this.musicaSelecionada);
    }

    public void pausar() {
        System.out.println("Stop music: " + this.musicaSelecionada);
    }

    public void selecionarMusica( String musica ) {
        this.musicaSelecionada = musica;
        System.out.printf("Selected music: %s%n", this.musicaSelecionada);
    }    
}
