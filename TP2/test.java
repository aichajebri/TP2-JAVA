package TP2;

public class test {

	public static void main(String[] args) {
	employe E1 = new employe(1, "salma" , 1000, 1);
	employe E2 = new employe(2,"salima" , 1200, 1);
	employe E3 = new employe(3,"soulaima" , 1500, 1);
	Departement IT = new Departement();
	IT.ajoutEmploye(E1);
    IT.ajoutEmploye(E2);
    IT.retirerEmploye(E3);
    IT.afficheDep();
    IT.existeE(14415432);
    IT.getEmplSalMax();
    
	}

}
