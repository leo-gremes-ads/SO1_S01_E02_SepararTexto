package controller;

public class SeparadorDeTexto
{
    public SeparadorDeTexto()
    {
        super();
    }

    public void separarTexto(String texto, String separador)
    {
        String[] vetorPalavras = texto.split(separador);
        int tamanho = vetorPalavras.length;
        System.out.println("O texto foi dividido em " + tamanho + " partes");
        System.out.print("(");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("\"" + vetorPalavras[i] + "\"");
            if (i < tamanho  - 1)
                System.out.print(", ");
        }
        System.out.println(")");
    }
}
