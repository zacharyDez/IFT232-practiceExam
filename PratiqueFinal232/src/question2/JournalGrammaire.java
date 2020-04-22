package question2;

public class JournalGrammaire extends JournalErreurs {
    @Override
    public void update(Object o){
        CompilerError error = super.cast(o);
        if(error.getType()==CompilerError.TYPE_GRAMMAIRE)
            super.update(o);
    }
}
