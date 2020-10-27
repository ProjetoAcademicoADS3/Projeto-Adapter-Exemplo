 package br.com.rogerio.adapter;

/**
 *
 * @author roger
 */
public class AdapterImpressora implements IimprimirNotaFiscal {

    ImpressoraDoRogerio objeto = new ImpressoraDoRogerio();

    @Override
    public String imprimirNotaFiscal(NotaFiscal objNota) {
        String str = "Nota Fiscal \n";
        str +=  objNota.getDados() + "\n";
        return objeto.escreverNaImpressoraBotaFiscal(str);
    }
}
