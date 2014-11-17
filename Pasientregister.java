/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

public class Pasientregister
{
  private Pasient[] pasienter;
  //private int antall;

  public Pasientregister( Pasient[] p )
  {
    pasienter =  p;
    //antall = 0;
  }

  public boolean nyPasient( Pasient p )
  {
    for( int i = 0; i < pasienter.length; i++ )
    {
			if( pasienter[i] == null )
			{
				pasienter[i] = p;
				return true;
			}
		}return false;
	
	/*		if( antall < pasienter.length )
		{
			pasienter[ antall ] = p;
			antall++;
			return true;
		}
		else
			return false;*/

    /*< Metoden setter, hvis mulig, inn Pasient-objektet p på første ledige
      plass i arrayen. Returverdien indikerer om dette var mulig eller ikke.>*/
  }
  public Pasient finnPasient( String navn,  String dato )
  {
		for( int i = 0; i < pasienter.length; i++ )
		{
			if( pasient[i] != null )
			{
				return pasient[i];
			}
		}return null;
   	/*< Metoden returnerer, hvis mulig, Pasient-objektet med
      fødselsdato og  navn lik parametrene dato og navn.
      Hvis et slikt objekt ikke finnes returnerer metoden null.
      NB! Denne metoden skal du ikke programmere! >*/
  }
/*				for (int i = 0; i < pasienter.length; i++)
				{
					if (pasienter[i].getFødselsdato() == dato)
						{
							return pasienter[i].toString();
						}
				}
				return null;*/
  public Pasient[] finnPasient( String dato )
  {


    /*< Metoden skal returnere array som inneholder alle pasientene
      som har fødselsdato lik parameteren dato. Arrayens lengde skal
      være nøyaktig lik det antall Pasient-objekter som har en slik
      fødselsdato. Dvs. I arrayen som returneres skal ingen
      array-elementer være lik null.) Hvis det ikke finnes noen
      pasienter med denne fødselsdatoen, skal metoden returnere null. >*/
  }
} // end of class Pasientregister
