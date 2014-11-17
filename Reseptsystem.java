/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

public class Reseptsystem
{
  private Pasientregister pasienter;
  private Legeregister legene;

  public Reseptsystem( int antPasienter, int antLeger )  // Kan oppgis
  {
    legene = new  Legeregister( opprettLegeArray( antLeger ) );
    pasienter = new Pasientregister( opprettPasientArray(antPasienter) );// kan droppes
    opprettLegekontor();
    opprettApotek();
  }

  public  Lege[] opprettLegeArray( int antLeger )
  {
    /*< Metoden returnerer er array med Lege-objekter.  Antallet objekter
      er lik arrayens lengde. NB! Denne metoden skal du ikke programmere! >*/
  }

  public  Pasient[]  opprettPasientArray(int antPasienter)
  {
    /*< Metoden returnerer er array med Pasient-objekter. Antallet objekter
      er lik arrayens lengde. NB! Denne metoden skal du ikke programmere! >*/
  }

  public void opprettLegekontor()
  {
    /*< Metoden skal opprette like mange legekontor (Legekontor-objekter)
      som leger i Legeregisteret. >*/
  }

  public void opprettApotek()
  {
    /*< Metoden skal opprette 4 apotek (Apotek-objekter) med følgende
      navn:  "Svanen", "Sfinksen", "Vitus" og "Løven". >*/
  }

}// end of class Reseptsystem
/*a) Programmer metoden public void opprettLegekontor().

b) Programmer metoden public void opprettApotek().*/
