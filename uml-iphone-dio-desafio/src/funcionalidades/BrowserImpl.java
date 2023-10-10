package funcionalidades;

import interfaces.Browser;

public class BrowserImpl implements Browser {


    @Override
    public void exibirPagina() {
        System.out.println("Exibir Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");
    }
}
