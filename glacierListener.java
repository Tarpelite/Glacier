// Generated from glacier.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link glacierParser}.
 */
public interface glacierListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link glacierParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(glacierParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(glacierParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(glacierParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(glacierParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(glacierParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(glacierParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(glacierParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(glacierParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#binOp}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(glacierParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#binOp}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(glacierParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(glacierParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(glacierParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(glacierParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(glacierParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(glacierParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(glacierParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(glacierParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(glacierParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#kind}.
	 * @param ctx the parse tree
	 */
	void enterKind(glacierParser.KindContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#kind}.
	 * @param ctx the parse tree
	 */
	void exitKind(glacierParser.KindContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#globalId}.
	 * @param ctx the parse tree
	 */
	void enterGlobalId(glacierParser.GlobalIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#globalId}.
	 * @param ctx the parse tree
	 */
	void exitGlobalId(glacierParser.GlobalIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#localId}.
	 * @param ctx the parse tree
	 */
	void enterLocalId(glacierParser.LocalIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#localId}.
	 * @param ctx the parse tree
	 */
	void exitLocalId(glacierParser.LocalIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(glacierParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(glacierParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link glacierParser#realNumber}.
	 * @param ctx the parse tree
	 */
	void enterRealNumber(glacierParser.RealNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link glacierParser#realNumber}.
	 * @param ctx the parse tree
	 */
	void exitRealNumber(glacierParser.RealNumberContext ctx);
}