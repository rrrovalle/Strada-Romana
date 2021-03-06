 /**
 * Interface Observed Class
 * @author Rodrigo Valle e Robson de Jesus
 * @since 12/08/2020
 * @version 1.0
 */

package br.udesc.ppr55.sr.control.observer;
import br.udesc.ppr55.sr.model.abstractFactory.PieceFactory;
import br.udesc.ppr55.sr.model.composite.Card;

import java.util.List;
 
import br.udesc.ppr55.sr.model.abstractFactory.AbstractPieceFactory;

public interface IObserved {
	
	public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);   
    public void notifyPlayerPanelUpdate(int score, int gold, int vp, int cubes, int wareTiles, int contracts, int cards);  
    public void notifyStart(); 
    public void notifyBoardUpdate();
    public void notifyEndGame();
    public void notifyPassButton(boolean isEnabled);
    public void notifyBagSize(int size) ;
    public void notifyMessage(String message);
    public String getPiece(int col, int row); 
    public void setFactory(PieceFactory factory);
    public AbstractPieceFactory getFactory();
    public void notifyDeckPanel(List<Card> cards);
    public void notifyChooseWagon();
    public void notifyFeaturePanel();
    public void startGame();  
}
