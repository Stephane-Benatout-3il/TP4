public class FactureManager {

    /**
     * fonction qui retourne le prix total d'une facture
     *
     * @param typeProduit
     * @param quantite
     * @param prixUnitaire
     * @return double
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        double maReduc = getReduction(typeProduit);
        total = applyReduction(total, maReduc);

        if (total > 1000) {
            total = applyReduction(total, 0.05);|
        }

        return total;
    }

    /**
     * fonction qui calcul la reduction à appliquer
     *
     * @param total
     * @param reduc
     * @return double
     */
    private double applyReduction(double total, double reduc) {
        return (1 - reduc) * total;
    }

    /**
     * fonction qui retourne la valeur de la réduction
     *
     * @param type
     * @return double
     */
    private double getReduction(String type) {
        if (type.equals("Alimentaire")) {
            return 0.05;
        } else if (type.equals("Electronique")) {
            return 0.1;
        } else if (type.equals("Luxe")) {
            return 0.15;
        }
    }
}
