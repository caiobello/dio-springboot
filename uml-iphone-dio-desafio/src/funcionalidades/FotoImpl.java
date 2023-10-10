package funcionalidades;

import interfaces.Foto;

public class FotoImpl implements Foto {
    @Override
    public void tirar() {
        System.out.println("Tirar Foto");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar Foto");
    }

    @Override
    public void exibir() {
        System.out.println("Exibir Foto");
    }
}
