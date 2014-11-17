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
	private Resept[] resepter;

	public Lege( String adr, String tlf)
	{
		this.adresse = adr;
		this.telefon = tlf;
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
		return "Opplysninger om legen: \n" + super.toString() + "\n" + getAdresse()+ "\n" + getTelefon();
	}

  public String nyResept( Resept r )
  {
    /*< Metoden mottar en resept som parameter og setter den, om mulig,
      inn i arrayen av resepter. Hvis dette gikk bra, skal metoden returnere
      informasjon om selve resepten, og i motsatt fall skal den returnere
      informasjon om at det ikke var plass i arrayen. >*/
        if( r != null && antResepter < resepter.length ) {
        	resepter[antResepter++] = r;
                return r;
        }
        else
        	return "Det er ikke plass til flere resepter";
  }

  public String utskrevneResepter()
  {
    /*< Metoden skal returnere en tekst som inneholder informasjon om
      alle reseptene legen har skrevet ut. Reseptene skal skrives ut i
      omvendt kronologisk rekkefølge slik at de nyeste reseptene kommer
      første og de eldste sist. Hvis legen ikke har skrevet ut noen
      resepter, skal metoden returnere informasjon om det. >*/
	if ( resepter.length != null ) {
		for ( int i = 0; i <= resepter.length; i++ ) {
                	int ut = antResepter;
                	String utskrevet += "\n" + resepter[ut--];
             	}
             	return utskrevet;
        }
    	else
        	return "Legen har ikke registrert noen utskrevne resepter.";
  }
}
