package Commands;

import Entities.Menu_Option;
import Entities.TheDocument;

public class ToggleIndentCommand implements Menu_Option {
	
	private TheDocument doc;
	public ToggleIndentCommand(TheDocument theDocument){
		doc = theDocument;
	}
	@Override
	public void execute() {
		doc.toggleIndent();
	}

	@Override
	public void execute(Object obj) {}

}
