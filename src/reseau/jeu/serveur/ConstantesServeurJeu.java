package reseau.jeu.serveur;

/**
 * Cet interface contient l'ensemble des constantes necessaires au protocole de
 * dialogue entre le client et le serveur de jeu.
 * 
 * @author Pierre-Do
 */
public interface ConstantesServeurJeu
{
	/**
	 * Démarrage de la partie
	 */
	public final int START = 100;
	/**
	 * Arrêt de la partie
	 */
	public final int STOP = 101;
	
	/**
	 * Message à destination de tous les joueurs
	 */
	public final int A_TOUS = 150;
	
	/**
	 * Message en provenance du serveur de jeu
	 */
	public final int DU_SERVEUR = 151;

	/**
	 * Code de succès
	 */
	public final int OK = 200;
	/**
	 * Code pour quitter la partie
	 */
	public final int QUITTER = 201;
	/**
	 * Type de message : un message texte
	 */
	public final int MSG = 301;
	
	/**
	 * Type de message : état d'un joueur
	 */
	public final int JOUEUR = 302;
	
	/**
	 * Type de message : état d'une créature
	 */
	public final int CREATURE = 303;
	
	/**
	 * Type de message : état d'une animation
	 */
	public final int ANIMATION = 304;
	
	/**
	 * Type de message : vague de création
	 */
	public final int VAGUE = 305;
	
	/**
	 * Type de message : état de la partie
	 */
	public final int PARTIE = 306;
	
	/**
	 * Type de message : nouvelle tour
	 */
	public final int TOUR_AJOUT = 307;
	
	/**
	 * Type de message : suppression d'une tour
	 */
	public final int TOUR_SUPRESSION = 308;
	
	/**
	 * Type de message : amélioration d'une tour
	 */
	public final int TOUR_AMELIORATION = 309;
	
	/**
	 * Type de message : vente tour
	 */
	public final int TOUR_VENTE = 310;
	
	/**
	 * Type de message : un objet
	 */
	public final int OBJET = 350;
	
	/**
	 * Code d'erreur : pas assez d'argent
	 */
	public final int ARGENT_INSUFFISANT = 400; //ou PAUVRE, a choix :P
	
	/**
	 * Code d'erreur : mauvaise position de l'objet
	 */
	public final int ZONE_INACCESSIBLE = 401;
	
	/**
	 * Code d'erreur : chemin bloqué
	 */
	public final int CHEMIN_BLOQUE = 402;

	/**
     * Code d'erreur : Niveau max de la tour atteint
     */
    public final int NIVEAU_MAX_ATTEINT = 403;
	
	/**
	 * Code d'erreur : erreur quelconque
	 */
	public final int ERREUR = 404;
	
	/**
	 * Changement d'état de la partie : en pause
	 */
	public final int EN_PAUSE = 501;
	
	/**
	 * Changement d'état de la partie : en jeu
	 */
	public final int EN_JEU = 502;
	
	
}
