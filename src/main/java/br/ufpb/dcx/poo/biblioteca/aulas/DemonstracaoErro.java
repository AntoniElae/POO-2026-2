package br.ufpb.dcx.poo.biblioteca.aulas;
import br.ufpb.dcx.poo.biblioteca.Fabrica;
import br.ufpb.dcx.poo.biblioteca.contrato.Biblioteca;
import br.ufpb.dcx.poo.biblioteca.contrato.ItemView;
import br.ufpb.dcx.poo.biblioteca.contrato.excecoes.BibliotecaException;

import java.sql.SQLOutput;

public class DemonstracaoErro {
    public static void main(String[] args) throws BibliotecaException {
        Biblioteca biblioteca = Fabrica.novaBiblioteca();
        biblioteca.acervo().cadastrarItem("L1", "POO em Java",
                "Ayla", "livro", 2020);
        String codigo = new StringBuilder("L").append(1).toString();

        System.out.println("Comparacao usando equals: " + codigo.equals("L1") );
        System.out.println("Comparacao usando ==: " + (codigo == "L1") );

        biblioteca.acervo().cadastrarItem(codigo, "Engenharia Moderna",
                "Kleyton", "livro", 2026);
        
    }
}