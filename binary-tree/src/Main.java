//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(12);
        arvore.raiz = arvore.removerValor(arvore.raiz, 10);
        No resultado = arvore.buscarRecursiva(arvore.raiz, 4);
        if (resultado == null) {
            System.out.println("Valor nao encontrado na arvore.");
        } else {
            System.out.println("Valor " + resultado.valor + " encontrado na arvore.");
        }
        int h = arvore.Altura(arvore.raiz);
        System.out.println(h);
    }


}