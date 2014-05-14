package skonto;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Startklasse 
{

	public static void main(String[] args) 
	{
		Bank b1;
		b1 = new Bank();
		Date heute = new Date();
		SimpleDateFormat heuteform = new SimpleDateFormat("dd.MM.yyyy");
		
		b1.setrechnungsbetrag(1000);
		
		System.out.println("Ihr Rechnungsbetrag: " + b1.rechnungsbetrag);
		System.out.println("Ihr Skontosatz: 1.5%");
		System.out.println("Ihr Skontobetrag: " + b1.berechneskonto());
		System.out.println("Ihr Zahlungsbetrag: " + b1.berechnezahlung());
		System.out.println("Rechnungsdatum: "+ heuteform.format(heute));

	}

}
