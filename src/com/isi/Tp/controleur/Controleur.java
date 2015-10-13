package com.isi.Tp.controleur;

import com.isi.Tp.model.iModel;
import com.isi.Tp.vu.iVue;

public class Controleur implements iControleur {
	private iModel monModel;
	private iVue laVue;

	public  Controleur(iModel monModel) {
		this.monModel = monModel;
	}

	public void action() {

	}

	@Override
	public void setVue(iVue laVue) {
		this.laVue = laVue;
	}

	@Override
	public void Controleur(iModel monModel) {
		// TODO Auto-generated method stub
		
	}
}
