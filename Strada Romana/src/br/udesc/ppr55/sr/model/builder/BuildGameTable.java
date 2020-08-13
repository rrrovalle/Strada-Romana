 /**
 * Concrete builder to create the game board
 * @author Rodrigo Valle e Robson de Jesus
 * @since 12/08/2020
 * @version 1.0
 */
package br.udesc.ppr55.sr.model.builder;
import java.util.ArrayList;
import java.util.Arrays;

import br.udesc.ppr55.sr.control.Bag;
import br.udesc.ppr55.sr.model.Piece;
import br.udesc.ppr55.sr.model.abstractFactory.AbstractPieceFactory;

public class BuildGameTable extends Builder {
	 
    @Override
    public void buildStradaBoard(AbstractPieceFactory factory) {
        tablePiece = new Piece[9][17];
        bag = new Bag();
        
        // Set the background tiles
        for( int line = 0; line < tablePiece.length; line++) {
            for( int column = 0; column < tablePiece[line].length; column++) {
                tablePiece[line][column] = factory.createGroundTile();
          }
        }
         
        // Add strada romana tiles
        tablePiece[2][0] = factory.createWagonTilePortus();
        tablePiece[3][0] = factory.createWagonTilePortus();
        tablePiece[4][0] = factory.createWagonTilePortus();
        tablePiece[5][0] = factory.createWagonTilePortus();
        tablePiece[6][0] = factory.createWagonTilePortus();
        
        tablePiece[2][1] = factory.createStradaTile();
        tablePiece[4][1] = factory.createStradaTile();
        tablePiece[6][1] = factory.createStradaTile();
        tablePiece[7][1] = factory.createLineTile();
        tablePiece[8][1] = factory.createCubeSpotTile();
        
        tablePiece[1][2] = factory.createInverseCubeTile();
        tablePiece[2][2] = factory.createLineTile();
        tablePiece[3][2] = factory.createStradaTile();
        tablePiece[5][2] = factory.createStradaTile();

        tablePiece[2][3] = factory.createStradaTile();
        tablePiece[4][3] = factory.createStradaTile();
        tablePiece[5][3] = factory.createLineTile();
        tablePiece[6][3] = factory.createCubeSpotTile();
        tablePiece[8][3] = factory.createWareSpotTile(1);
        
        tablePiece[0][4] = factory.createWareSpotTile(2);
        tablePiece[3][4] = factory.createStradaTile();
        tablePiece[5][4] = factory.createStradaTile();
        
        tablePiece[1][5] = factory.createInverseCubeTile();
        tablePiece[2][5] = factory.createLineTile();
        tablePiece[3][5] = factory.createStradaTile();
        tablePiece[5][5] = factory.createStradaTile();
        tablePiece[6][5] = factory.createLineTile();
        tablePiece[7][5] = factory.createCubeSpotTile();
        
        tablePiece[4][6] = factory.createRomaTile();
        tablePiece[6][6] = factory.createRomaTile();

        tablePiece[1][7] = factory.createInverseCubeTile();
        tablePiece[2][7] = factory.createLineTile();
        tablePiece[3][7] = factory.createRomaTile();
        tablePiece[5][7] = factory.createRomaTile();
        
        tablePiece[0][8] = factory.createWareSpotTile(3);
        tablePiece[3][8] = factory.createRomaTile();
        tablePiece[5][8] = factory.createRomaTile();
        tablePiece[6][8] = factory.createLineTile();
        tablePiece[7][8] = factory.createCubeSpotTile();
        
        tablePiece[4][9] = factory.createRomaTile();
        
        tablePiece[1][10] = factory.createInverseCubeTile();
        tablePiece[2][10] = factory.createLineTile();
        tablePiece[3][10] = factory.createRomaTile();
        tablePiece[5][10] = factory.createRomaTile();
        tablePiece[8][10] = factory.createWareSpotTile(4);
        
        tablePiece[2][11] = factory.createStradaTile();
        tablePiece[4][11] = factory.createStradaTile();
        tablePiece[6][11] = factory.createStradaTile();
        tablePiece[7][11] = factory.createLineTile();
        tablePiece[8][11] = factory.createCubeSpotTile();

        tablePiece[1][12] = factory.createInverseCubeTile();
        tablePiece[2][12] = factory.createLineTile();
        tablePiece[3][12] = factory.createStradaTile();
        tablePiece[5][12] = factory.createStradaTile();
        tablePiece[6][12] = factory.createLineTile();
        tablePiece[7][12] = factory.createCubeSpotTile();
        
        tablePiece[1][13] = factory.createInverseCubeTile(); 
        tablePiece[2][13] = factory.createLineTile();
        tablePiece[3][13] = factory.createStradaTile();
        tablePiece[5][13] = factory.createStradaTile();
        
        tablePiece[0][14] = factory.createWareSpotTile(5);
        tablePiece[4][14] = factory.createStradaTile();
        tablePiece[6][14] = factory.createStradaTile();
        tablePiece[8][14] = factory.createWareSpotTile(6);
        
        tablePiece[1][15] = factory.createInverseCubeTile();
        tablePiece[2][15] = factory.createLineTile();
        tablePiece[3][15] = factory.createStradaTile();
        tablePiece[5][15] = factory.createStradaTile();
        tablePiece[6][15] = factory.createLineTile();
        tablePiece[7][15] = factory.createCubeSpotTile();
        
        tablePiece[2][16] = factory.createWagonTileRoma();
        tablePiece[3][16] = factory.createWagonTileRoma();
        tablePiece[4][16] = factory.createWagonTileRoma();
        tablePiece[5][16] = factory.createWagonTileRoma();
        tablePiece[6][16] = factory.createWagonTileRoma();
        
        super.table.setGrid(tablePiece);
    }
    
	 @Override
	 public void buildWagonsRoma(AbstractPieceFactory factory) {
		 wagonsRoma = new ArrayList<>();
		 wagonsRoma.addAll(Arrays.asList(factory.createBallioWagon(true), factory.createDemetriusWagon(true),
					factory.createCanopitesWagon(true), factory.createCurculioWagon(true),
					factory.createHamilcarWagon(true), factory.createMaccusWagon(true),
					factory.createPersaWagon(true), factory.createPlotusWagon(true),
					factory.createPseudolusWagon(true), factory.createHerenniusWagon(true)
					)); 

		
		super.bag.setWagonRomaList(wagonsRoma);
	 }
	 
	 @Override
	 public void buildWagonsPortus(AbstractPieceFactory factory) {
		 wagonsPortus = new ArrayList<>(); 
		 wagonsPortus.addAll(Arrays.asList(factory.createBallioWagon(false), factory.createDemetriusWagon(false),
					factory.createCanopitesWagon(false), factory.createCurculioWagon(false),
					factory.createHamilcarWagon(false), factory.createMaccusWagon(false),
					factory.createPersaWagon(false), factory.createPlotusWagon(false),
					factory.createPseudolusWagon(false), factory.createHerenniusWagon(false)
		 			));
  
		super.bag.setWagonPortusList(wagonsPortus);
	 }
	 
	 @Override
	 public void buildWareTiles(AbstractPieceFactory factory) {
		 wareTiles = new ArrayList<>();
		 /* Add ware tiles into the list */
		 wareTiles.addAll(Arrays.asList(factory.createBlueWareTile(),factory.createBlueWareTile(),
										factory.createBlueWareTile(),factory.createBlueWareTile(),
										factory.createBlueWareTile(),factory.createBlueWareTile(),
										
										 factory.createBrownWareTile(),factory.createBrownWareTile(),
										 factory.createBrownWareTile(),factory.createBrownWareTile(),
										 factory.createBrownWareTile(),factory.createBrownWareTile(), 
										 
											factory.createGreenWareTile(),factory.createGreenWareTile(),
											factory.createGreenWareTile(),factory.createGreenWareTile(),
											factory.createGreenWareTile(),factory.createGreenWareTile(), 
											
												factory.createRedWareTile(),factory.createRedWareTile(),
												factory.createRedWareTile(),factory.createRedWareTile(),
												factory.createRedWareTile(),factory.createRedWareTile(), 
												
													factory.createWhiteWareTile(),factory.createWhiteWareTile(),
													factory.createWhiteWareTile(),factory.createWhiteWareTile(),
													factory.createWhiteWareTile(),factory.createWhiteWareTile(), 
													
														factory.createYellowWareTile(),factory.createYellowWareTile(),
														factory.createYellowWareTile(),factory.createYellowWareTile(),
														factory.createYellowWareTile(),factory.createYellowWareTile()
				 									)); 
		 super.bag.setWareTileList(wareTiles);
	 }
	 
	 @Override
	 public void buildCubes(AbstractPieceFactory factory) {
		 cubes = new ArrayList<>();
		 /* Add cubes into the list */
		 cubes.addAll(Arrays.asList(factory.createBlueCube(1),factory.createBlueCube(1),
				 	factory.createBlueCube(1),factory.createBlueCube(1),
				 	factory.createBlueCube(1),factory.createBlueCube(1),
					
					 factory.createBrownCube(1),	factory.createBrownCube(1),
					 factory.createBrownCube(1),factory.createBrownCube(1),
					 factory.createBrownCube(1),factory.createBrownCube(1),
					 
						factory.createGreenCube(1),factory.createGreenCube(1),
						factory.createGreenCube(1),factory.createGreenCube(1),
						factory.createGreenCube(1),factory.createGreenCube(1), 
						
							factory.createRedCube(1),factory.createRedCube(1),
							factory.createRedCube(1),factory.createRedCube(1),
							factory.createRedCube(1),factory.createRedCube(1), 
							
								factory.createWhiteCube(1),factory.createWhiteCube(1),
								factory.createWhiteCube(1),factory.createWhiteCube(1),
								factory.createWhiteCube(1),factory.createWhiteCube(1), 
								
									factory.createYellowCube(1),factory.createYellowCube(1),
									factory.createYellowCube(1),factory.createYellowCube(1),
									factory.createYellowCube(1),factory.createYellowCube(1)
								));
		 
		 super.bag.setCubeList(cubes);
	}
	 
	 @Override
	 public void buildAltCubes(AbstractPieceFactory factory) {
		 altCubes = new ArrayList<>();
		 /* Add cubes into the list */
		 altCubes.addAll(Arrays.asList(factory.createBlueCube(2),factory.createBlueCube(2),
				 	factory.createBlueCube(2),factory.createBlueCube(2),
				 	factory.createBlueCube(2),factory.createBlueCube(2),
					
					 factory.createBrownCube(2),	factory.createBrownCube(2),
					 factory.createBrownCube(2),factory.createBrownCube(2),
					 factory.createBrownCube(2),factory.createBrownCube(2),
					 
						factory.createGreenCube(2),factory.createGreenCube(2),
						factory.createGreenCube(2),factory.createGreenCube(2),
						factory.createGreenCube(2),factory.createGreenCube(2), 
						
							factory.createRedCube(2),factory.createRedCube(2),
							factory.createRedCube(2),factory.createRedCube(2),
							factory.createRedCube(2),factory.createRedCube(2), 
							
								factory.createWhiteCube(2),factory.createWhiteCube(2),
								factory.createWhiteCube(2),factory.createWhiteCube(2),
								factory.createWhiteCube(2),factory.createWhiteCube(2), 
								
									factory.createYellowCube(2),factory.createYellowCube(2),
									factory.createYellowCube(2),factory.createYellowCube(2),
									factory.createYellowCube(2),factory.createYellowCube(2)
								));
		 
		 super.bag.setAltCubeList(altCubes);
	} 
}
