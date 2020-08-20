 /**
 * Interface IStradaController
 * @author Rodrigo Valle e Robson de Jesus
 * @since 12/08/2020
 * @version 1.0
 */
package br.udesc.ppr55.sr.control; 
import javax.swing.JPanel;

import br.udesc.ppr55.sr.control.observer.Observed; 
import br.udesc.ppr55.sr.model.abstractFactory.AbstractPieceFactory;
import br.udesc.ppr55.sr.model.abstractFactory.PieceFactory; 

public interface IStradaController extends Observed {
    
	public void initializeBoard();    
    public void createPlayerPanel(String n1, String n2); 
    public void restartPlayerPanel(JPanel pane);  
    public String getPiece(int col, int row); 
    public void setFactory(PieceFactory factory);
    public void setRadio();
    public AbstractPieceFactory getFactory();
    public void initializeRadio();
    public void playRadio();
    public void stopRadio();
    public void addWagon();
    public void addCubeAndWareTiles();
    public void removeWagonTile();
    public void startGame();  
    public int getScreenSize();
    public void setScreenSize(int size); 
    
    public void moveWagon(int icol,int irow, int finalColumn, int finalRow);
    public void controlPlayerTurn();
    public void passPlay();  
    
    public void gameFlow(int icol,int irow, int finalColumn, int finalRow);
    public boolean checkMovement( int icol, int finalColumn);
    
}
