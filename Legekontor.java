/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

/*< import-setninger>*/

public class Legekontor extends JFrame
{
  private Lege legen;
  private Pasientregister pasienter;
  private JTextField pNavnFelt, pFødtFelt;
  private JTextArea utskrift, editor;
  private JButton nyPasient, finnPasient, sendResept, alleResepter;

  public Legekontor( Lege l, Pasientregister p )
  {
    super( "LEGE " + l.toString() );
    legen = l;
    pasienter = p;

    /*< Oppretter alle skjermkomponentene og setter opp brukergrensesnittet. >*/

    /*< Oppretter et lytteobjekt og knytter knappene til lytteobjektet. >*/
  }


  public void alleResepter()
  {
   /* < Metoden skal i tekstområdet "utskrift" skrive ut alle reseptene
      legen har forskrevet. >*/
  }

  public void nyPasient()
  {
   /* < Metoden skal registrere en ny pasient i Pasientregisteret. >*/
  }

  public void finnPasient()
  {
    /*< Metoden skal i tekstområdet "utskrift" skrive ut informasjon
      om en ønsket pasient, forutsatt at både pasientens navn og
      fødselsdato er skrevet inn. Hvis imidlertid det kun er
      fødselsdatoen som er skrevet inn, skal metoden skrive ut
      opplysninger om alle pasienter som er født på denne datoen.
      Hvis det ikke finnes noen slik(e) pasient(er), skal metoden gi
      beskjed om det.  >*/
  }

  public void sendResept()
  {
    /*< Ut fra informasjonen som legen har skrevet inn i vinduets
      tekstfelt og tekstområdet "editor", skal metoden lage
      en resept. Hvis pasienten som resepten skal skrives ut til
      ikke finnes i pasientregisteret, må pasienten først registeres.
      Resepten skal inneholde informasjon om pasienten og legen, samt
      den teksten  som legen har skrevet inn i tekstområdet "editor".
      (Her vil det stå  opplysninger om medisin, mengde og dosering m.m )
      Den nye resepten skal så lagres i både legens  og pasientens
      Resept-array. >*/
  }

   /*< private lytteklasse som skal fange opp hedelsene i vinduet. >*/

}// end of class Legekontor
/*a) Programmer metoden public void alleResepter().

b) Programmer metoden public void nyPasient().

c) Programmer metoden public void finnPasient().

d) Programmer metoden public void sendResept().

e) Programmer den private lytteklassen slik at den fanger opp klikkene på knappene og sørger for at de tilhørende oppgavene blir utført.*/
