package view;

import java.util.Scanner;

import controller.SeparadorDeTexto;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        SeparadorDeTexto st = new SeparadorDeTexto();
        System.out.print("Insira o texto: ");
        String texto = s.nextLine();
        System.out.print("Insira o separador: ");
        String separador = s.nextLine();
        System.out.println();
        st.separarTexto(texto, separador);
        System.out.println();
        s.close();
    }    
}