/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

/*< import-setninger>*/

public class Legekontor extends JFrame implements ActionListener
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
    pNavneFelt = new JTextField ( 30 );
   	pFødtFelt = new JTextField ( 32 );
   	utskrift = new JTextArea( 20, 35);
   	utskrift.setEditable (false);
   	editor = new JTextArea( 20, 35);
   	editor.setEditable (true);
   	nyPasient = new JButton("Ny pasient");
   	finnPasient = new JButton("Finn pasient");
   	sendResept = new JButton("Send resept");
   	alleResepter = new JButton("Alle utskrevede resepter");

   	nyPasient.addActionListener(Lytter);
		finnPasient.addActionListener(Lytter);
		SendResept.addActionListener(Lytter);
		AlleResepter.addActionListener(Lytter);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Pasientdata (navn - ddmmåååå)"));
		c.add(pNavneFelt, pFødtFelt);
		c.add(nyPasient);
		c.add(finnPasient);
		c.add(sendResept);
		c.add(alleResepter);
		c.add(new JLabel("Resept-editor"));
		c.add(editor);
		c.add(new JScrollPane(editor));
		c.add(new JLabel("Resepter"));
		c.add(utskrift);
		setSize( 410, 490);
		setVisible( true );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
    		String navn = pNavnFelt.getText();
		String fødselsdato = pFødtFelt.getText();

		Pasiens ny_Pasient = new Pasient(navn, fødselsdato);

		boolean ok = pasienter.nyPasient(ny_Pasient);

		if(ok)
			utskrift.setText(ny_Pasient.toString() + "\n er registrert");
		else utskrift.setText("Registeret er fullt");
   /* < Metoden skal registrere en ny pasient i Pasientregisteret. >*/
  }

  public void finnPasient()
  {
    		String navn = pNavnFelt.getText();
		String fødselsdato = pFødtFelt.getText();
		String pasientdata = pasienter.finnPasient(navn, dato);
		String fødselsdata = pasienter[].finnPasient(dato);
		if(fødselsdato != null)
			{
				if(navn != null && fødselsdato != null)
				{
					utskrift.setText(pasientdata);
				}
				else
					utskrift.setText("Finner ikke pasienten " + navn + " " + fødselsdato);
			}
		else if
			utskrift.setText(fødselsdata);
		}
		return utskrift.setText("Det finnes ingen pasienter med det fødselsnummeret");
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

	public void actionPerformed(ActionEvent Lytter)
	{
		if(Lytter.getSource() == nyPasient)
		  nyPasient();
		else if(Lytter.getSource() == finnPasient)
		  finnPasient();
		else if(Lytter.getSource() == sendResept)
		  sendResept();
		else if(Lytter.getSource() == alleResepter)
		   alleResepter();
	}
   /*< private lytteklasse som skal fange opp hedelsene i vinduet. >*/

}// end of class Legekontor
/*a) Programmer metoden public void alleResepter().

b) Programmer metoden public void nyPasient().

c) Programmer metoden public void finnPasient().

d) Programmer metoden public void sendResept().

e) Programmer den private lytteklassen slik at den fanger opp klikkene på knappene og sørger for at de tilhørende oppgavene blir utført.*/
