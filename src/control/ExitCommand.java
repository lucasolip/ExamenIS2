package control;

import static java.lang.System.exit;

public class ExitCommand implements Command {

    @Override
    public void execute() {
        exit(0);
    }
    
}
