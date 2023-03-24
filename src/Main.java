import br.edu.ifpb.model.Loja;
import br.edu.ifpb.model.LojaFisica;
import br.edu.ifpb.model.LojaVirtual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Loja loja = null;
        System.out.printf("Escolha 1 para loja física e 2 para loja virtual\n");
        Integer tipoDeLoja = console.nextInt();
        if (tipoDeLoja == 1) {
            System.out.print("Digite 1 para embalar seu pedido e 2 para não\n");
            Integer isEmbalar = console.nextInt();
            if (isEmbalar == 1) {
                loja = new LojaFisica(true);
            } else {
                loja = new LojaFisica(false);
            }
        } else {
            loja = new LojaVirtual();
        }
        loja.comprar();
    }
}