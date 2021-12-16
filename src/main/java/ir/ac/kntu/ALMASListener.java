package ir.ac.kntu;// Generated from ALMAS.g by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ALMASParser}.
 */
public interface ALMASListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ALMASParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ALMASParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ALMASParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ALMASParser.ProgramContext ctx);
}
