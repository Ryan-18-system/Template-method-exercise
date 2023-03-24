package br.edu.ifpb.model;

public abstract class Loja {

    public  final void comprar(){
        this.selecionar();
        this.pagar();
        this.entregar();
    }
    protected abstract void selecionar();
    protected abstract  void pagar();
    protected abstract void entregar();
}
