package be.vdab.xml.services;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

class DefaultKwadraatService implements KwadraatService {
    @Override
    public int kwadraat(int getal) {
        return getal*getal;
    }
}
