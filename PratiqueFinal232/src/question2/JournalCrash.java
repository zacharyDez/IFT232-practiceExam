package question2;

public class JournalCrash extends JournalErreurs{
    private boolean hasCrashed=false;

    @Override
    public void update(Object o){
        CompilerError error = super.cast(o);
        if(error.getType()==CompilerError.TYPE_CRASH)
            super.update(o);
    }


    @Override
    public boolean checkVeto(Object o) {
        if(hasCrashed)
            return false;

        if(cast(o).getType()==CompilerError.TYPE_CRASH) {
            hasCrashed = true;
        }
        else
            return true;

        return false;
    }

}
