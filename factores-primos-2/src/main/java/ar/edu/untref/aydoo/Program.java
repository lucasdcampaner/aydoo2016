package ar.edu.untref.aydoo;

import java.util.List;

public class Program{

	public static final void main(String[] args){
		
    	String impresionConFormato = "";
    	int numeroAFactorizar = Integer.parseInt(args[0]);
    	String formatoImpresion = "";
    	if (args.length > 1) {
    		formatoImpresion = args[1]; 
    	}
    	FactoresPrimos factoresPrimos = new FactoresPrimos();
    	List<Integer> listaDeFactoresPrimos = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
    		
    	switch (formatoImpresion.toUpperCase()) {
    	
	        case "":
	        	impresionConFormato = factoresPrimos.imprimirEnFormatoPretty(numeroAFactorizar, listaDeFactoresPrimos);
	        	break;
	    	case "--FORMAT=PRETTY":
	        	impresionConFormato = factoresPrimos.imprimirEnFormatoPretty(numeroAFactorizar, listaDeFactoresPrimos);
	        	break;
	        case "--FORMAT=QUIET":
	        	impresionConFormato = factoresPrimos.imprimirEnFormatoQuiet(listaDeFactoresPrimos);
	        	break;
	        default:
	        	impresionConFormato = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
	    		break;
        }    	
    	System.out.println(impresionConFormato);
	}
	
}
