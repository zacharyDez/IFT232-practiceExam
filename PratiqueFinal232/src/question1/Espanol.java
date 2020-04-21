package question1;

import java.util.ArrayList;

public class Espanol extends Langue {
    @Override
    public String msgConnexion() {
        return "\"Por favor escribe su identification...\"";
    }

    @Override
    public String msgIntro() {
        return "Bienvenidos a TrioLingo!";
    }

    @Override
    public ArrayList<Lecon> getLecons() {
        return ServiceTrioLingo.getInstance().getCoursFrancais();
    }
}
