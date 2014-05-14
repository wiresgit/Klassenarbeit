package skonto;

public class Bank 
{
	public double rechnungsbetrag;
	public double skonto;
	public double zahlungsbetrag;

	public void setrechnungsbetrag(double rechnungsbetrag)
	{
	this.rechnungsbetrag = rechnungsbetrag;
	}
	public double getrechnungsbetrag()
	{
		return rechnungsbetrag;
	}
	public double berechneskonto()
	{
		skonto = rechnungsbetrag * 0.015;
		return skonto;
	}
	public double berechnezahlung()
	{
		zahlungsbetrag = (rechnungsbetrag - skonto);
		return zahlungsbetrag;
	}
}
