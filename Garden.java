import javax.swing.*;
import java.awt.*;

class Garden extends JFrame
{
	Container contentPane = getContentPane();

	JPanel center = new JPanel();
	JPanel north = new JPanel();
	JPanel east = new JPanel();
	JPanel south = new JPanel();
	JPanel west = new JPanel();


	public Garden()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );		
		
		String[] centerStrings = {"garden tips", "garden supplies", "garden plants", "flowers, garden plants", "fruit trees, garden plants", "vegetables"};
		center.add(new JComboBox(centerStrings) ); 
 
    	north.add(new JButton("Contact Info"));
    	
    	south.add(new JCheckBox("Garden tools"));
    	south.add(new JCheckBox("Fertilizer"));
    	south.add(new JCheckBox("pest control"));
    	
    	east.add(new JButton("Gardening Tips"));
    	
    	west.add(new JRadioButton("flowers"));
    	west.add(new JRadioButton("grass"));
    	west.add(new JRadioButton("trees"));
		
		Font f = new Font("Verdana",Font.ITALIC,12);
	    JTextField tf = new JTextField("Blue font, italics");
	    tf.setFont(f);
	    tf.setForeground(Color.blue);
		

		contentPane.add("North", north ); 
		contentPane.add("Center", center); 
		contentPane.add("West", west); 
		contentPane.add("South", south);
		contentPane.add("East", east);

		setVisible( true );
	}
	

	public static void main( String[] args ) 
	{
		Garden gui = new Garden() ;
	}	
}
