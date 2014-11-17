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
  private int antall;
  private static final int MAX = 99;
  /*< En konstant MAX lik 100 for det maskimale antall
    resepter arrayen kan inneholde >*/

public Pasient (String n, String fd)
	{
		super(n, fd);
		resepter = new Resept[MAX];
		antall = 0;
	}
  
  /*< Konstruktør som mottar pasientens navn og fødselsdato
    som parametre og foretar nødvendig initialisering. >*/

  public boolean nyResept( Resept ny  )
  {
		if ( antall < MAX )
		{
			resepter[ antall ] = ny;
			antall++;
			return true;
		}
		else
			return false;
  }
    /*< Metoden setter en ny resept inn i pasientens resept-array.
      NB! Denne metoden skal du ikke programmere!>*/


  public String finnResept( int n )
  {
		for( int i = 0; i < antall; i++ )  //resepter.length???
		{
			if ( resepter[i].getNr() == n )
			{
				return resepter[i].toString();
			}
		}
		return null; //Fant ikke resepten
  }
    /*< Metoden returnerer resepten med reseptnummer lik parameteren n.
      Hvis en slik ikke finnes, skal metoden returnere null. >*/
 
 	public String toString()
  {
		String journal = "";
		int antIkkeAvhentet = 0;

		for (int i = 0 ; i < antall; i++ )
		{
			if( resepter[i] != null )
			{
				journal += resepter[i] .toString() + "\n";

				if( !resepter[i].getUtlevert() )
					antIkkeAvhentet++;
			}

			journal =	super.toString() + " " + "\nhar " +
								(antIkkeAvhentet == 0 ? "ingen" : antIkkeAvhentet) +
								" uavhentede resepter";

		}return journal;
  
  /*public String toString()
  {
		return super.toString() + "\n" + "\n" +
						"antall uavhentede resepter " + resepter.toString();
   
    < Metoden skal returnere all informasjon om pasienten og
      vedkommendes resepter. Det skal fremgå av teksten om
      medisinene reseptene foreskriver  er utlevert eller ikke,
      samt hvor mange resepter som ikke er avhentet. >
  }*/

} // end of class Pasient
/*a) Programmer metoden public Resept finnResept( int n ).

b) Programmer metoden public String toString().*/
