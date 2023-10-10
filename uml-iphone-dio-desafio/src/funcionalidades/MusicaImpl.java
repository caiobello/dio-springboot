package funcionalidades;

import interfaces.Musica;

public class MusicaImpl implements Musica {
    @Override
    public void tocar() {
        System.out.println("Tocar Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Musica");
    }


}
