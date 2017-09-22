
public class Test {
public static void main(String[] args){
	
	int   hoursWorked, payRate, days, gross, paye;
    double nssf, netpay  ;
    gross = 26 * 50000;
    paye = (5 / 100) * gross;
    nssf = (10 / 100) * gross;
    netpay = gross - (paye + nssf);
    
    System.out.println("Gross: " + gross );
    System.out.println("Paye: " + paye );
    System.out.println("NSSf: " + nssf );
    System.out.println("Net Pay: " + netpay );
}
}
