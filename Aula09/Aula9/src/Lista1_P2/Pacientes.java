package Lista1_P2;

public class Pacientes {
	
	    int primeiro, ultimo, tamanho, qtdeElementos;
	    String pacientes[];
	    
	    public Pacientes() {
	        primeiro = ultimo = -1;
	        qtdeElementos = 0;
	        tamanho = 100;
	        pacientes = new String[tamanho];    
	    }
	    
	    public boolean cheia() {
	        if(qtdeElementos == tamanho-1) {
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean vazia() {
	        if(qtdeElementos == 0) {
	            return true;
	        }
	        return false;
	    }    
	    
	    public void adicionar (String paciente) {
	        if(!cheia()) {
	            if(primeiro==-1) {
	                primeiro=0;
	            }
	            ultimo++;
	            pacientes[ultimo] = paciente;
	            qtdeElementos++;
	        }
	    }
	    
	    public void chamar() {
	    	if (!vazia()) {
	    		System.out.println(pacientes[primeiro]);
	    	}else {
	    		System.out.println("Não há pacientes na fila");
	    	}
	    	
	        if(!vazia()) {
	            primeiro ++;
	            qtdeElementos--;
	        }
	    }
	    
	    public void proximo() {
	    	System.out.println(pacientes[primeiro]);

	    }
	    
	    public void mostrar() {
	    	
	    	System.out.println("Existe(m) " + (qtdeElementos+1) + " pessoa(s) na fila de espera");

	        
	    }



	}



