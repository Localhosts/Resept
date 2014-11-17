/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

public class Pasient extends Person /*< arver klassen Person >*/
{
  private Resept[] resepter;
  private int antall = 0;
  /*< En konstant MAX lik 100 for det maskimale antall
    resepter arrayen kan inneholde >*/

  /*< Konstruktør som mottar pasientens navn og fødselsdato
    som parametre og foretar nødvendig initialisering. >*/

  public boolean nyResept( Resept ny  )
  {
    /*< Metoden setter en ny resept inn i pasientens resept-array.
      NB! Denne metoden skal du ikke programmere!>*/
  }

  public Resept finnResept( int n )
  {
    /*< Metoden returnerer resepten med reseptnummer lik parameteren n.
      Hvis en slik ikke finnes, skal metoden returnere null. >*/
  }

  public String toString()
  {
    /*< Metoden skal returnere all informasjon om pasienten og
      vedkommendes resepter. Det skal fremgå av teksten om
      medisinene reseptene foreskriver  er utlevert eller ikke,
      samt hvor mange resepter som ikke er avhentet. >*/
  }

} // end of class Pasient
/*a) Programmer metoden public Resept finnResept( int n ).

b) Programmer metoden public String toString().*/
