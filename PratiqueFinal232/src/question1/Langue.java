package question1;

import java.util.ArrayList;

public abstract class Langue {

    public static final int LANGUE_ANGLAIS = 0;
    public static final int LANGUE_FRANCAIS = 1;
    public static final int LANGUE_ESPAGNOL = 2;

    public abstract String msgConnexion();

    public abstract String msgIntro();

    public abstract ArrayList<Lecon> getLecons();

    public static Langue getLangue(int langCode) {
        switch (langCode) {
            case LANGUE_ANGLAIS:
                return new Anglais();
            case LANGUE_FRANCAIS:
                return new Francais();
            case LANGUE_ESPAGNOL:
                return new Espanol();
        }
        return null;
    }
}
