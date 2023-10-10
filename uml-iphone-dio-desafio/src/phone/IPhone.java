package phone;

import funcionalidades.BrowserImpl;
import funcionalidades.FotoImpl;
import funcionalidades.MusicaImpl;
import funcionalidades.TelefoneImpl;

public class IPhone {

    public static void main(String[] args){
        System.out.println("Exibindo as funcionalidades do IPhone do Desafio POO");
        System.out.println("");
        System.out.println("Utilizando a Classe TelefoneImpl");
        TelefoneImpl telefone = new TelefoneImpl();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("");
        System.out.println("Utilizando a Classe BrowserImpl");
        BrowserImpl browser = new BrowserImpl();
        browser.exibirPagina();
        browser.adicionarNovaAba();
        browser.atualizarPagina();

        System.out.println("");
        System.out.println("Utilizando a Classe MusicaImpl");
        MusicaImpl musica = new MusicaImpl();
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();

        System.out.println("");
        System.out.println("Utilizando a Classe FotoImpl");
        FotoImpl foto = new FotoImpl();
        foto.tirar();
        foto.apagar();
        foto.exibir();


    }
}
