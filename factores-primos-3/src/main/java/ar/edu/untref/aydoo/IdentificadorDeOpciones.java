package ar.edu.untref.aydoo;

public class IdentificadorDeOpciones {

	private String numeroAFactorizar = "";
	private String format = "";
	private String sort = "";
	private String output = "";
	
	public IdentificadorDeOpciones(String[] args) {
		
		String parametroAEvaluar;
		
		if (args.length > 0){		
			this.numeroAFactorizar = args[0];
			for (int i = 1; i < args.length; i++){
				parametroAEvaluar = args[i].substring(0, 3).toUpperCase();
				switch (parametroAEvaluar) {
					case "--F":
						this.format = args[i];
						break;
					case "--S":
						this.sort = args[i];
			        	break;
			        case "--O":
			        	this.output = args[i];
			        	break;					
				}
			}
		}
	}

	public Integer getNumeroAFactorizar() {
		
		Integer numeroAFactorizar = 0;	
		if (this.numeroAFactorizar != ""){
			numeroAFactorizar =  Integer.parseInt(this.numeroAFactorizar);
		}
		return numeroAFactorizar;
	
	}
	
	public String getFormat() {
		return format;
	}

	public String getSort() {
		return sort;
	}

	public String getOutput() {
		return output;
	}	

}
