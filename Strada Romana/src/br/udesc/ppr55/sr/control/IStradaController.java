package br.udesc.ppr55.sr.control; 
 
import javax.swing.JPanel;

import br.udesc.ppr55.sr.control.observer.Observed;
import br.udesc.ppr55.sr.model.abstractFactory.AbstractPieceFactory;
import br.udesc.ppr55.sr.model.abstractFactory.PieceFactory;

/**
 * Interface to control the game
 * @author Rodrigo Valle
 */
public interface IStradaController extends Observed {
    
	public void initializeBoard();   
	public void initializeBag();
    public void createPlayerPanel(String n1, String n2); 
    public void restartPlayerPanel(JPanel pane);  
    public String getPiece(int col, int row);
    public String getWagon(int col, int row);
    public void setFactory(PieceFactory factory);
    public void setRadio();
    public AbstractPieceFactory getFactory();
    public void initializeRadio();
    public void playRadio();
    public void stopRadio();
    
}
