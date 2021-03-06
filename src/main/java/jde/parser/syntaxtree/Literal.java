//
// Generated by JTB 1.1.2
//

package jde.parser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> &lt;INTEGER_LITERAL&gt;
 *       | &lt;FLOATING_POINT_LITERAL&gt;
 *       | &lt;CHARACTER_LITERAL&gt;
 *       | &lt;STRING_LITERAL&gt;
 *       | BooleanLiteral()
 *       | NullLiteral()
 * </PRE>
 */
public class Literal implements Node {
   public NodeChoice f0;

   public Literal(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(jde.parser.visitor.Visitor v) {
      v.visit(this);
   }
}

