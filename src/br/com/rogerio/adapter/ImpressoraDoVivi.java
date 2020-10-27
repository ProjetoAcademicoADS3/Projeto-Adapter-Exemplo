/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.adapter;

/**
 *
 * @author roger
 */
public class ImpressoraDoVivi implements IimprimirNotaFiscal {

    @Override
    public String imprimirNotaFiscal(NotaFiscal objeto) {
        return "Impressora do VIVI \n Dados da Nota Fiscal \n"
                + objeto.getDados();
    }

}
