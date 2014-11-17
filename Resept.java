/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

public class Resept
{
  private boolean utlevert = false;
  private String tekst;
  //private Calendar dato;
  private Pasient pasient;
  private Lege lege;
  private int nr;
  private static int nesteNr = 0;

	public Resept(String t, Pasient p, Lege l, int nesteNr)
	{
		this.tekst = t;
		this.pasient = p;
		this.lege = l;
		this.nr = nesteNr;
		nesteNr++;
	}//		tekst = t;
	//	nr = nesteNr;
	//	pasient = new Pasient();
	//	lege = new Lege();
      /*< Konstruktøren mottar reseptens tekst, legen og pasienten som parametre.
    Resepten blir tildelt et unikt nummer, datoen for opprettelsen
    av resepten blir registert, i tillegg til at annen nødvendig initialisering
    blir foretatt. >*/

	public int nr()
  {

	}

  	//<!!!!>
  	//  Resepten blir tildelt et unikt nummer, datoen for opprettelsen
  	//  av resepten blir registert, i tillegg til at annen nødvendig initialisering
  	//  blir foretatt. >
  	
	public boolean getUtlevert()
	{
		return utlevert;
	}

	public int getNr()
	{
		return nr;
	}

  public void registrerUtlevert()
  {
		utlevert = true;
  }
  //{
	//if (utlevert != false)
	//{
	//utlevert = true;
	//	}
	
  public String toString()
  {
    return "Returntekst fra klassen Resept";
   	//return "Resept nummer: " + nr + "\n" + "Utlevert: " + utlevert;
   	//Mangler info om resept
    /*< Metoden returnerer en tekst som innholder all informasjon på resepten,
      samt opplysninger om medisinen resepten foreskriver er utlevert eller
      ikke. >*/
  }

}  // end of class Resept
