 /**
 * Game Bag Controller Class
 * @author Rodrigo Valle e Robson de Jesus
 * @since 12/08/2020
 * @version 1.0
 */

package br.udesc.ppr55.sr.control.gameBag; 
import br.udesc.ppr55.sr.model.Piece;
import br.udesc.ppr55.sr.model.composite.Card;
import br.udesc.ppr55.sr.model.composite.WagonCard;

public class Bag extends AbstractBag { 
	
	/* create pieces */ 
	@Override
	public Piece getPortusWagon(){
		shufflePieces(wagonsPortus);
		Piece p = wagonsPortus.get(random.nextInt(wagonsPortus.size()));  
		wagonsPortus.remove(p); 
		bagSize--;
		return p;
	}

	@Override
	public Piece getRomaWagon(){ 
		shufflePieces(wagonsRoma);
		Piece r = wagonsRoma.get(random.nextInt(wagonsRoma.size()));  
		wagonsRoma.remove(r); 
		bagSize--;
		return r;
	} 
	
	@Override
	public Piece getRandomWareTile(int number) {
		shufflePieces(first);
		Piece random = first.get(0);
		random.setPlace(number);
		first.remove(0);
		bagSize--;
		return random;
	}

	// starts the first turn with 30 ware tiles
	@Override
	public Piece getWareTile(int number){
		shufflePieces(wareTiles);
		Piece wt = wareTiles.get(random.nextInt(wareTiles.size()));   
		wt.setPlace(number);
		wareTiles.remove(wt);
		bagSize--;
		return wt;	
	}

	// starts the first turn with 22 cubes
	@Override
	public Piece getCube(){ 
		shufflePieces(cubes);
		Piece c = cubes.get(random.nextInt(cubes.size()));  
		cubes.remove(c); 
		bagSize--;
		return c;
	}
	
	@Override
	public Piece getAltCube(){  
		shufflePieces(altCubes);
		Piece ac = altCubes.get(random.nextInt(altCubes.size()));  
		altCubes.remove(ac); 
		bagSize--;
		return ac;
	}
	
	@Override
	public Piece removeCard() {
		shuffleCards(wagonsDeck);
		Card card = wagonsDeck.get(random.nextInt(wagonsDeck.size()));
		//discard.setWagon(card.getCard());
		wagonsDeck.remove(card);
		bagSize--;
		return discard;
	} 
	
	@Override
	public String toString() {
		return "Bag [cubes=" + cubes.size() + ", altCubes=" + altCubes.size() + ", wareTiles=" + wareTiles.size() + ", wagonsRoma="
				+ wagonsRoma.size() + ", wagonsPortus=" + wagonsPortus.size() + ", wagonsDeck=" + wagonsDeck.size() + ", discard=" + discard
				+ ", bagSize=" + bagSize + ", random=" + random + "]";
	}
	
}
