package funcionalidades;

import interfaces.Telefone;

public class TelefoneImpl implements Telefone {
    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Inicia Correio de voz");
    }
}
