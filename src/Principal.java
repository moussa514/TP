import com.isi.Tp.controleur.Controleur;
import com.isi.Tp.controleur.iControleur;
import com.isi.Tp.model.Model;
import com.isi.Tp.model.iModel;
import com.isi.Tp.vu.iVue;
import com.isi.Tp.vu.vueMap;

public class Principal {

	public static void main(String[] args) {
		iModel monModel = new Model("Model");
		iControleur monControleur = new Controleur(monModel);
		iVue maVue = new vueMap(monControleur);
	}

}
