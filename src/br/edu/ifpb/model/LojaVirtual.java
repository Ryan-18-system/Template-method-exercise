package br.edu.ifpb.model;

public class LojaVirtual extends  Loja{
    @Override
    protected void selecionar() {
        System.out.printf("Selecionando produtos de uma loja Virtual\n");
    }

    @Override
    protected void pagar() {
        System.out.printf("Pagando de uma loja Virtual\n");
    }

    @Override
    protected void entregar() {
        System.out.printf("Entregando produtos de uma loja Virtual\n");
    }
}
