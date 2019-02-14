import javax.swing.*;

public class JUEGO_OCA 
{
	public static void main (String[] args) 
	{	Jugador luis,mario;
		luis = new Jugador();
		mario= new Jugador();
		
		int cantidad;
		String mensaje="¿cuantos lanzamientos para el juego?";
		cantidad= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		
		luis.setNombre("Luis Noh");
		mario.setNombre("Mario Ramirez");
		luis.setLanzamientos(cantidad);
		mario.setLanzamientos(cantidad);
		
		for (int i = 0; i<cantidad; i++) 
		{	JOptionPane.showMessageDialog(null,"Turno de " + luis.imprimir());
			luis.jugar();
			JOptionPane.showMessageDialog(null,luis.misDados.IMPRIMIR());
			JOptionPane.showMessageDialog(null,"Turno de " + mario.imprimir());
			mario.jugar();
			JOptionPane.showMessageDialog(null,mario.misDados.IMPRIMIR());
		}
		
		JOptionPane.showMessageDialog(null,"Resultado=\n" + luis.imprimir());
		JOptionPane.showMessageDialog(null,"Resultado=\n" + mario.imprimir());
		
	}
    
}