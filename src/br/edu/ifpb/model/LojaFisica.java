package br.edu.ifpb.model;

public class LojaFisica extends Loja{

    private Boolean isEmbalar;

    public LojaFisica(Boolean isEmbalar) {
        this.isEmbalar = isEmbalar;
    }

    @Override
    protected void selecionar() {
        System.out.printf("Selecionando produtos de uma loja Física\n");
    }

    @Override
    protected void pagar() {
        System.out.printf("Efetuando Pagamento na loja Física\n");
    }

    @Override
    protected void entregar() {
        if(isEmbalar){
            System.out.printf("Embalando pedido da loja física e entregando ao cliente\n");
        }else{
            System.out.printf("Não precisa de embalo, o pedido está sendo entrege\n");
        }
    }
}
