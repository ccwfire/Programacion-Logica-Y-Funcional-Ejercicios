

public class Jugador 
{	//ATRIBUTOS
	String Nombre;
	int Lanzamientos, Puntaje;
	PAR_DADOS misDados;

	//CONSTRUCTOR
    public Jugador() //cabecera del constructor
    {	Nombre="";
    	Lanzamientos=0;
    	Puntaje=0;
    	misDados = new PAR_DADOS();
    }
    
    public void setNombre(String valor) //cabecera del metodo
    {	Nombre = valor;
    }
    
    public void setLanzamientos(int valor)
    {	Lanzamientos = valor;
    }
    
    public void jugar()
    {	Puntaje = Puntaje + misDados.LANZAR();
    	Lanzamientos -= 1;
    }
    
    public int resultados()
    {	return Puntaje;
    }
    
    public String imprimir()
    {	String mensaje;
    	mensaje= "Nombre=" + Nombre + "\n" + 
    			 "Lanzamientos Restantes=" + Lanzamientos + "\n" + 
    			 "Puntos Acumulados=" + Puntaje;
    	return mensaje;
    }
}//fin de la clase