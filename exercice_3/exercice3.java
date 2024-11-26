public class StockManager {

    /**
     * procédure qui affiche la le nom d'in produit et son stock
     *
     * @param typeOperation
     * @param produit
     * @param quantite
     * @param stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {

        if (typeOperation.equals("ajout")) {
            stock = getNewStock(quantite, stock);
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);

        } else if (typeOperation.equals("retrait")) {
            if (stock >= quantite) {
                stock = getNewStock(-quantite, stock);
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }

        } else {
            System.out.println("Opération inconnue.");
        }
    }

    /**
     * fonction qui retourne le nouveau stock
     *
     * @param quantite
     * @param stock
     * @return
     */
    private int getNewStock(int quantite, int stock) {
        return quantite + stock;
    }
}
