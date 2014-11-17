/*
Navn (studentnummer):
* Nicolai Olsen  (s181082)
* Vidar Vasrud (s159718)
* Adrian Moen (s236368)
Klasse: HINGDATA14HA
*/

/*< import-setninger >*/
public class Apotek extends JFrame implements ActionListener
{
  private Pasientregister pasienter;
  private JTextField pNavnFelt, pFødtFelt, reseptNrFelt;
  private JTextArea reseptOmråde;
  private JButton finnResepter, registrerUtlevert;

  public Apotek( String apotek, Pasientregister p )
  {
    super( apotek + " apotek " );
    pasienter = p;
		pNavneFelt = new JTextField ( 30 );
		pFødtFelt = new JTextField ( 32 );
		reseptNrFelt = new JTextField ( 40 );
		reseptOmråde = new JTextArea( 20, 35);
		reseptOmråde.setEditable (false);
		finnResepter = new JButton("Finn resepter");
		registrerUtlevert = new JButton("Registrert utlevert");

		finnResepter.addActionListener(Lytter);
		registrerUtlevert.addActionListener(Lytter);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Pasientdata (navn - ddmmåååå)"));
		c.add(pNavneFelt, pFødtFelt);
		c.add(finnResepter);
		c.add(new JLabel("Reseptens nummer"));
		c.add(registrerUtlevert);
		c.add(new JLabel("Resepter"));
		c.add(reseptOmråde);
		setSize( 410, 490);
		setVisible( true );

    /*< Oppretter alle komponentene og setter opp brukergrensesnittet. >*/

    /*< Oppretter et lytteobjekt og knytter knappene til lytteobjektet. >*/
  }

  public void finnResepter()
  {

  }

  public void registrertUtlevert()
  {
    /*< Ut fra pasientens navn, fødselsdato og reseptens nummer skal
      metoden registerere at medisinen som resepten foreskriver er
      utlevert. >*/
  }

  /*< private lytteklasse som fanger opp hedelsene i vinduet. >*/

}// end of class Apotek
/*a) Programmer metoden public void registrertUtlevert().*/
