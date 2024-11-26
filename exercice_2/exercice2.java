public class GestionnaireNotes {

    /**
     * procédure qui affiche les notes puis la moyenne
     *
     * @param nomEtudiant
     * @param notes
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

        double moyenne = getMoyen(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * fonction qui calcule la moyenne
     *
     * @param notes
     * @return double
     */
    private double getMoyen(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }
}