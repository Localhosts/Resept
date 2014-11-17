/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718) //Assface??
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
	}
      /*< Konstruktøren mottar reseptens tekst, legen og pasienten som parametre.
    Resepten blir tildelt et unikt nummer, datoen for opprettelsen
    av resepten blir registert, i tillegg til at annen nødvendig initialisering
    blir foretatt. >*/

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

  public String toString()
  {
    return "Returntekst fra klassen Resept";
    /*< Metoden returnerer en tekst som innholder all informasjon på resepten,
      samt opplysninger om medisinen resepten foreskriver er utlevert eller
      ikke. >*/
  }

}  // end of class Resept
