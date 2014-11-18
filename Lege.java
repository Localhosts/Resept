/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

/*I denne oppgaven skal du programmere klassen Lege, som er en direkte subklasse til klassen Person.
I tillegg til datafeltene som klassen har arvet fra sin
superklasse skal Lege ha datafelt for følgende opplysninger:

Legens adresse
Legens telefonnummer
En variabel som viser om legen har lisens eller ikke.
(En lege som ikke har lisens har ikke lov til å skrive ut resepter)

En array av typen Resept.(Se skisse av klassen Resept foran i oppgaven.)
En konstant for det maskimale antall resepter (Resept-objekter) arrayen skal kunne inneholde. Konstantens verdi kan du sette til 100.
En variabel som holder rede på antall resepter (Resept-objekter) som arrayen til enhver tid inneholder
a) Her skal du gjøre to ting:

Skriv klassedefinisjonens første linje frem til {.
Programmer en konstruktør som mottar nødvendig informasjon via parametre og foretar nødvendig initialisering.
b) Her skal du gjøre to ting:

Programmer en get-metode for datafeltet som angir om legen har lisens eller ikke.
Programmer en toString-metode som returnerer alle opplysninger som er lagret om legen, samt alle reseptene vedkommende lege har skrevet ut.
c) Programmer Lege-metoden*/

public class Lege extends Person
{
	private String adresse, telefon;
	private boolean lisens;
	private static final int MAKSRESEPTER = 99;
	private Resept[] resepter;
	private int antResepter = 0;

	public Lege( String n, String fd, String adr, String tlf, int MAKSRESEPTER, boolean ok)
	{
		super( n, fd );
		this.adresse = adr;
		this.telefon = tlf;
		resepter = new Resept[MAKSRESEPTER];
		lisens = ok;
	}

	public boolean getLisens()
	{
		return lisens;
	}

	public String getAdresse()
	{
		return adresse;
	}

	public String getTelefon()
	{
		return telefon;
	}

	public String toString()
	{
		return "Opplysninger om legen: \n" + super.toString() + " " + lisens + "\n" + adresse + "\n" + telefon;
	}

  public String nyResept( Resept r )
  {
		for( int i = 0; i < resepter.length; i++ )
		{
  		if( r != null && antResepter < resepter.length )
			{
				resepter[antResepter++] = r;
				return "Resept: " + r; //noe ALLAH dette?
			}
		}return "Det er ikke plass til flere resepter";
  }
	//public String nyResept( int r ) Annen versjon?
	//{
	//	for (int i = 0; i < antResepter; i++)
	//	{
	//		if( resepter[i].getNr() == r )
	//		{
	//		return resepter[i].toString();
	// 		}
	//   return null; //ikke plass i arrayen
	//}

  public String utskrevneResepter()
  {
		String utskrevet = "";
		int i = 0;

		if ( resepter[i] != null )
		{
			for ( int j = 0; i <= resepter.length; j++ )
			{
				int ut = antResepter;
				utskrevet += "\n" + resepter[ut--];
			}return utskrevet;
   	}
    else
    	return "Legen har ikke registrert noen utskrevne resepter.";
}
	/*Annen versjon?
	public String utskrevneResepter()
  {
		String reseptliste = "";
		for( int i = 0; i < antResepter; i++)
			reseptliste += resepter[i].getUtlevert() + "\n";
		return reseptliste;
	}*/
	/*< Metoden skal returnere en tekst som inneholder informasjon om
      alle reseptene legen har skrevet ut. Reseptene skal skrives ut i
      omvendt kronologisk rekkefølge slik at de nyeste reseptene kommer
      første og de eldste sist. Hvis legen ikke har skrevet ut noen
      resepter, skal metoden returnere informasjon om det. >*/

}
