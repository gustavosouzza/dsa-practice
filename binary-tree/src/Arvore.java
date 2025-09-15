public class Arvore {
    No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecurivo(raiz, valor);
    }

    public No inserirRecurivo(No atual, int valor) {
        if (atual == null) {
            atual = new No();
            atual.valor = valor;
            return atual;

        } else if (valor < atual.valor) {
            atual.esquerda = inserirRecurivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecurivo(atual.direita, valor);
        }
        return atual;
    }

    public No buscarRecursiva(No atual, int valor) {
        if (atual == null) {
            return null;
        } else if (valor == atual.valor) {
            return atual;
        } else if (valor < atual.valor) {
            return buscarRecursiva(atual.esquerda, valor);
        } else {
            return buscarRecursiva(atual.direita, valor);
        }
    }

    public No removerValor(No atual, int valor) {
        if (atual == null) {
            return null;
        } else if (valor < atual.valor) {
            atual.esquerda = removerValor(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = removerValor(atual.direita, valor);
        } else {
            if (atual.esquerda == null) return atual.direita;
            if (atual.direita == null) return atual.esquerda;

            No temp = encontrarMinimo(atual.direita);
            atual.valor = temp.valor;
            atual.direita = removerValor(atual.direita, temp.valor);

        }
        return atual;
    }

    private No encontrarMinimo(No atual) {
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }

    public int Altura(No no) {
        if (no == null) {
            System.out.println("A arvore esta vazia");
        } else {
            int alturaEsq = Altura(no.esquerda);
            int alturaDir = Altura(no.direita);

            return Math.max(alturaEsq, alturaDir) + 1;
        }
        return 0;
    }
}