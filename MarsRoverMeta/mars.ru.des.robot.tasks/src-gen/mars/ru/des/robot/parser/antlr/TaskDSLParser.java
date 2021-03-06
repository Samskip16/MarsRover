/*
 * generated by Xtext 2.15.0
 */
package mars.ru.des.robot.parser.antlr;

import com.google.inject.Inject;
import mars.ru.des.robot.parser.antlr.internal.InternalTaskDSLParser;
import mars.ru.des.robot.services.TaskDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TaskDSLParser extends AbstractAntlrParser {

	@Inject
	private TaskDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTaskDSLParser createParser(XtextTokenStream stream) {
		return new InternalTaskDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DSL";
	}

	public TaskDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TaskDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
