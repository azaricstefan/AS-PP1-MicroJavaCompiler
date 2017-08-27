/**
 * 
 */
package rs.ac.bg.etf.pp1.as;

import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;
import rs.etf.pp1.symboltable.visitors.SymbolTableVisitor;

/**
 * @author Stefan
 *
 */
public class MojaTabela extends Tab {

	
	public static final Struct boolType = new Struct(Struct.Bool);
	
	public static void mojaInicijalizacija(){
		init();
		currentScope.addToLocals(new Obj(Obj.Type, "bool", boolType));
	}
}
