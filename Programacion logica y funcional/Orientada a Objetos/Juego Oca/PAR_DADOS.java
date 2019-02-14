import javax.swing.JOptionPane;

//DEFINICION DE LA CLASE
public class PAR_DADOS 
{	//DEFINICION DE ATRIBUTOS O MIEMBROS DE CLASE
	int dado1_val, dado2_val, puntos;
	
	//CONSTRUCTOR INICIALIZA LOS ATRIBUTOS POR DEFAULT
    public PAR_DADOS() 
    {	dado1_val=0;
    	dado2_val=0;
    	puntos=0;
    }
    //METODOS O FUNCIONES
    public int LANZAR()
    {	//devuelve un valor aleatorio entre 1 y 6
    	//Math.random() devuelve un valor decimal entre 0 y 1
    	dado1_val = 1+(int)(Math.random()*6);
    	dado2_val = 1+(int) (Math.random()*6);
    	puntos = dado1_val+dado2_val;
    	return puntos;
    }
    
    public void LEVANTAR()
    {	dado1_val=0;
    	dado2_val=0;
    	puntos=0;
    }
    
    public String IMPRIMIR()
    {	String mensaje;
    	mensaje="DADO 1=" + dado1_val + "\n" +
    			"DADO 2=" + dado2_val + "\n" +
    			"PUNTOS=" + puntos;
    	return mensaje;
    }
    
    //METODO PRINCIPAL PARA PROBAR EL OBJETO
    /*
    public static void main (String[] args) 
    {	//DEFINIMOS LAS VARIABLES DEL OBJETO PAR_DADOS
    	PAR_DADOS dadoOca,otroDado,TercerDado;
    	//CREAMOS EL OBJETO
    	dadoOca=new PAR_DADOS();
    	otroDado=new PAR_DADOS();
    	TercerDado=new PAR_DADOS();
    	
    	int valor;
    	JOptionPane.showMessageDialog(null,"Lanzando DADO");
    	valor = dadoOca.LANZAR();
    	JOptionPane.showMessageDialog(null,dadoOca.IMPRIMIR());
    	JOptionPane.showMessageDialog(null,"Levantando DADO");
    	dadoOca.LEVANTAR();
    	JOptionPane.showMessageDialog(null,dadoOca.IMPRIMIR());
	}
	*/
}//fin de la clase