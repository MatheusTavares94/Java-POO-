package BalancoTrimestral2;


public class A {
	
	
	public static void main(String[] args) {
	
		BalancoTrimestral2 t1= new BalancoTrimestral2();
		t1.gastosJaneiro=15000;
		t1.gastosFevereiro=23000;
		t1.gastosMarco=17000;	
		t1.gastosTrimestre = t1.gastosJaneiro + t1.gastosFevereiro + t1.gastosMarco;
		t1.gastos();
		
		
	}
}

