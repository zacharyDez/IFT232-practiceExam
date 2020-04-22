package question2;

public class JournalSyntaxe extends JournalErreurs {
    @Override
    public void update(Object o){
        CompilerError error = super.cast(o);
        if(error.getType()==CompilerError.TYPE_SYNTAXE)
            super.update(o);
    }
}
