/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

public class Person
{
  private String navn;
  private String fødselsdato;

    public Person(String n, String f)
    {
        this.navn = n;
        this.fødselsdato = f;
    }

    public String getNavn()
    {
        return navn;
    }

    public String getFødselsdato()
    {
        return fødselsdato;
    }

  public String toString()
  {
    String tekstp;
    tekstp = "Navn: " + getNavn() + "\nFødselsdato" + getFødselsdato() + "\n";
    return tekstp;
      /*< Metoden skal returnere navn og fødselsdato i form av tekst. >*/
  }
} // end of class Person
