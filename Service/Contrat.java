package Service;

import java.util.*;

/**
 * 
 */
public class Contrat {

    /**
     * Default constructor
     */
    public Contrat() {
    }

    /**
     * 
     */
    private void numContrat;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private Date dateDebut;

    /**
     * 
     */
    private Date dateFin;

    /**
     * 
     */
    public Client proprietaire;

    /**
     * 
     */
    public Personne beneficiaires;

    /**
     * 
     */
    public Formule formule;

    /**
     * 
     */
    public Set<FormuleOption> optionsSupplementaires;


}