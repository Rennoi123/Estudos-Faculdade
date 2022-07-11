	import javax.swing.JOptionPane;
	
	public class Baralho {
	    //Atributos
	    private String[] naipe = {"Ouro","Espada","Copas","Paus"};
			    private String[] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			    private String[] carta = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	    //Método GerarCartas
	    public void inicializaCartas() {
	    	for (int i=0; i<52; i++) { 
	    		this.carta[i] = "";
	    	}
	    }
	    
	    	 
	    public void gerarCartas(){
	        int i=0;
	        for (int n = 0; n < 4; n++) {
	            for (int v = 0; v < 13; v++) {
	                 this.carta[i] = valor[v] + " de " + naipe[n];
	                i++;
	            }
	        }
	    }
	
	    public void imprimeBaralho() {
	        String msg = " " ;
	        for(int i = 0;i < 52; i++){
	            msg=msg + this.carta[i] + " ";
	            if(i==12 || i==25 || i==38){
	                msg=msg + "\n";
	            }
	        }
	        JOptionPane.showMessageDialog(null,msg);
	    }
	}
	
