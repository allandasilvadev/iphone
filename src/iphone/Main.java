package iphone;

import devices.browser.Safari;
import devices.musicplayer.AppleMusic;
import devices.phone.ApplePhone;

public class Main {

    public static void main( String[] args ) {
        Safari browser = new Safari();
        AppleMusic music = new AppleMusic();
        ApplePhone phone = new ApplePhone();

        browser.exibirPagina("https://google.com.br");
        browser.adicionarNovaAba();
        browser.atualizarPagina();
        System.out.println();

        music.selecionarMusica("minha musica");
        music.tocar();
        music.pausar();
        System.out.println();

        phone.ligar("11 2222-4444");
        phone.atender();
        phone.iniciarCorreioVoz();

    }
    
}
