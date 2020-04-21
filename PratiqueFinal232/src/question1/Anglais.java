package question1;

import java.util.ArrayList;

public class Anglais extends Langue {
    @Override
    public String msgConnexion() {
        return "Please enter your username...";
    }

    @Override
    public String msgIntro() {
        return "Welcome to TrioLingo!";
    }

    @Override
    public ArrayList<Lecon> getLecons() {
        return ServiceTrioLingo.getInstance().getCoursAnglais();
    }
}
