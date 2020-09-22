package br.udesc.ppr55.sr.control.visitor;

import br.udesc.ppr55.sr.model.Player;

public interface IPlayerVisitor { 
	//Para manipular os contratos ou outras pe�as (caso fosse desejado) sempre se trataria de pegar o tamanho do array, ent�o optamos por retornar um int
	public int visit(Player contracts);
}
