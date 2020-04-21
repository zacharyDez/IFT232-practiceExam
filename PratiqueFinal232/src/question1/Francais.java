package question1;

import java.util.ArrayList;

public class Francais extends Langue {
    @Override
    public String msgConnexion() {
        return "Veuillez entre votre mot de passe...";
    }

    @Override
    public String msgIntro() {
        return "Bienvenue � TrioLingo!";
    }

    @Override
    public ArrayList<Lecon> getLecons() {
        return ServiceTrioLingo.getInstance().getCoursFrancais();
    }
}
