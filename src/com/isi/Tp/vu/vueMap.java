package com.isi.Tp.vu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.isi.Tp.controleur.iControleur;

public class vueMap extends JFrame implements MouseListener, ActionListener, iVue {
	// les attribus
	static JPanel pnJeux;
	static LabelMoussa lesCase;
	static JPanel choix;
	static iControleur monControleur;
	// ..............................................
	private static final long serialVersionUID = 1L;

	// mon constructeurs
	public vueMap() {

	}

	// mon Constructeurs
	public vueMap(iControleur Controleur) {
		monControleur = Controleur;
		monControleur.setVue(this);
		setSize(600, 600);
		setLayout(new GridLayout(3, 1));
		JButton unJoueur = new JButton("1 joueur");
		unJoueur.addActionListener(this);
		JButton deuxJoueur = new JButton("deux Joueurs");
		JButton enLingne = new JButton("jouer en ligne");
		add(unJoueur);
		add(deuxJoueur);
		add(enLingne);
		setVisible(true);
	}

	// mon main
	public static void main(String[] args) {

		new vueMap();

	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {

		String nomDeCase = (((LabelMoussa) e.getSource()).nom);
		System.out.println(nomDeCase);

	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	static class LabelMoussa extends JLabel {
		// les attributs

		private static final long serialVersionUID = 1L;
		// Attributs
		public String nom;

		public LabelMoussa(String nom) {
			super(nom);
			this.nom = nom;
		}

		public String[] Mescases = { nom };
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		new Jeux();
	}

	static public class Jeux extends JFrame {
		private static final long serialVersionUID = 1L;

		public Jeux() {

			setSize(700, 700);
			setLayout(new BorderLayout());
			pnJeux = new JPanel();
			choix = new JPanel();
			choix.setLayout(new BorderLayout());
			pnJeux.setLayout(new GridLayout(10, 10));

			// creation des jlabel pour le jeux
			String[] nomTableau = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
			for (int i = 1; i <= 10; i++) {
				String index = nomTableau[i - 1];
				
				for (int a = 1; a <= 10; a++) {
					lesCase = new LabelMoussa(index + a);
					lesCase.setBorder(new LineBorder(Color.BLACK));
					lesCase.addMouseListener(new vueMap());
					pnJeux.add(lesCase);
				}
			}
			// fin de la boucle
			JButton placeBateaux = new JButton("Placement des bateaux");
			choix.add(placeBateaux);
			add(choix);
			add(pnJeux);
			setVisible(true);
			monControleur.
			
		}
	}

	@Override
	public void jeux() {

	}

	@Override
	public void vueMap() {

	}
}
