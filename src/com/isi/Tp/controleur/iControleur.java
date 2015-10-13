package com.isi.Tp.controleur;

import com.isi.Tp.model.iModel;
import com.isi.Tp.vu.iVue;

public interface iControleur {
	void action();
	void setVue(iVue laVue);
	void Controleur(iModel monModel);
}
