import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import java.lang.Math.*;

public class Calculator implements ActionListener
{
	Frame f;
	TextField tf;
	Button b[][]= {{new Button ("%"),new Button("CE"),new Button("C"),new Button("Backspace"),new Button("\u00F7")},
					{new Button("\u221A"),new Button("7"),new Button("8"),new Button("9"),new Button("\u00D7")},
					{new Button("x\u00B2"),new Button("4"),new Button("5"),new Button("6"),new Button("-")},
					{new Button("x\u00B3"),new Button("1"),new Button("2"),new Button("3"),new Button("+")},
					{new Button("1/x"),new Button("\u00B1"),new Button("0"),new Button("."),new Button("=")}};
	String s1="";
	float f2=0;
	float f3 = 1;

	Calculator(String s )
	{
	tf=new TextField();
	f= new Frame(s);
	
	int x=250,y=100,width_=100,height_=100;
			
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
		b[i][j].setBounds(x,y,width_,height_);
		f.add(b[i][j]);
		x=x+100;
		}
	y=y+100;
	x=250;	
	}
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
	(b[i][j]).addActionListener(this);
		}
	}
			
	Toolkit t=f.getToolkit();
	Dimension screensize= t.getScreenSize();
	int width=screensize.width*8/10;
	int height=screensize.height*8/10;
	f.setBounds(width/8,height/8,width,height);
	
	
	tf.setBounds(250,50,500,50);
	f.add(tf);
	f.setBackground(Color.BLACK);
	f.addWindowListener(new WindowEventListener());
	f.setLayout(null);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()== b[1][1])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "7");
			s1= s1.concat("7");
			}
			else
			{
			tf.setText("7");
			s1= s1.concat("7");
			}

				
		}
		if(e.getSource()==b[1][2])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "8");
			s1= s1.concat("8");
			}
			else
			{
				
			tf.setText("8");
			s1= s1.concat("7");
			}
		}
		if(e.getSource()== b[1][3])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "9");
			s1= s1.concat("9");
			}
			else
			{
				
			tf.setText("9");
			s1= s1.concat("9");
			}
		}
		if(e.getSource()== b[2][1])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "4");
			s1= s1.concat("4");
			}
			else
			{
				
			tf.setText("4");
			s1= s1.concat("4");
			}
		}
		if(e.getSource()== b[2][2])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "5");
			s1= s1.concat("5");
			}
			else
			{
				
			tf.setText("5");
			s1= s1.concat("5");
			}
		}
		if(e.getSource()== b[2][3])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "6");
			s1= s1.concat("6");
			}
			else
			{
				
			tf.setText("6");
			s1= s1.concat("6");
			}
		}
		if(e.getSource()== b[3][1])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "1");
			s1= s1.concat("1");
			}
			else
			{
				
			tf.setText("1");
			s1= s1.concat("1");
			}
		}
		if(e.getSource()== b[3][2])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "2");
			s1= s1.concat("2");
			}
			else
			{
				
			tf.setText("2");
			s1= s1.concat("2");
			}
		}
		if(e.getSource()== b[3][3])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "3");
			s1= s1.concat("3");
			}
			else
			{
				
			tf.setText("3");
			s1= s1.concat("3");
			}
		}
		if(e.getSource()== b[4][2])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "0");
			s1= s1.concat("0");
			}
			else
			{
				
			tf.setText("0");
			s1= s1.concat("0");
			}
		}
		if(e.getSource()== b[3][4])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "+");
			s1= s1.concat("+");
			}
			
			
		}
		if(e.getSource()== b[2][4])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "-");
			s1= s1.concat("-");
			}
			
			
		}
		if(e.getSource()== b[1][4])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "\u00D7");
			s1= s1.concat("\u00D7");
			}
			
			
		}
		if(e.getSource()== b[0][4])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "\u00F7");
			s1= s1.concat("\u00F7");

			}
			
			
		}
		if(e.getSource()== b[0][2])
		{
			if(tf.getText()!= null)
			{
				
				
			tf.setText("");
			s1="";
			}
			
			
		}
		if(e.getSource()== b[4][3])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + ".");
			s1= s1.concat(".");
			}
			
			
		}
		if(e.getSource()== b[0][0])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "%");
			s1= s1.concat("%");
			}
			
			
		}
		if(e.getSource()== b[1][0])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText(  "\u221A" + s1);
			s1= s1.concat("\u221A");
			}
			
			
		}
		if(e.getSource()== b[2][0])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "\u00B2");
			s1= s1.concat("\u00B2");
			}
			
			
		}
		if(e.getSource()== b[3][0])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( s1 + "\u00B3");
			s1= s1.concat("\u00B3");
			}
			
			
		}
		if(e.getSource()== b[4][0])
		{
			if(tf.getText()!= null)
			{
				s1=tf.getText();
				
			tf.setText( "1/" + s1);
					s1=tf.getText();
			
		
			}
		}
		
		if(e.getSource()==b[0][3])
		{
			s1=tf.getText();
			s1 = s1.substring(0, s1.length()-1);
			tf.setText(s1);
		}
		
		if(e.getSource()== b[4][1])
		{
			if(tf.getText()!= null)
			{
					
					s1=tf.getText();
					float f = Float.parseFloat(s1);
					float fnegation = -(f);
					String s = Float.toString(fnegation);
					tf.setText(s);
				
			}
		}
		if(e.getSource()== b[0][1])
		{
			if(tf.getText()!= null)
			{
					

					tf.setText("0");
				
			}
		}
		if(e.getSource()==b[4][4])
		{
			
				if(s1.contains("+"))
				{	f2=0;
					s1=tf.getText();
					String[] parts = s1.split("[+]");
					float f1[] = new float[parts.length];
					for(int i=0;i<parts.length;i++)
					{
						f1[i] = Float.parseFloat(parts[i]);
						if(parts[i]!= "+")
						f2 = f2 + f1[i];
					}
					String s = Float.toString(f2);
					tf.setText(s);
				}
				
				if(s1.contains("-"))
				{
					String[] parts = s1.split("[-]");
					float f1[] = new float[parts.length];
					for(int i=0;i<parts.length;i++)
					{
						f1[i] = Float.parseFloat(parts[i]);
						
					}
					for(int i=0;i<parts.length-1;i++)
					{
						f1[i+1] = f1[i] - f1[i+1];
					}
					String s = Float.toString(f1[parts.length-1]);
					tf.setText(s);
				}
				
				if(s1.contains("\u00D7"))
				{
					f3=1;
					String[] parts = s1.split("[\u00D7]");
					float f1[] = new float[parts.length];
					for(int i=0;i<parts.length;i++)
					{
						f1[i] = Float.parseFloat(parts[i]);
						f3 = f3 * f1[i];
					}
					String s = Float.toString(f3);
					tf.setText(s);
				}
				
				if(s1.contains("\u00F7"))
				{
				String[] parts = s1.split("\u00F7");
				float f1[] = new float[parts.length];
					for(int i=0;i<parts.length;i++)
					{
						f1[i] = Float.parseFloat(parts[i]);
						
					}
					for(int i=0;i<parts.length-1;i++)
					{
						f1[i+1] = f1[i] / f1[i+1];
					}
					String s = Float.toString(f1[parts.length-1]);
					tf.setText(s);
				}

				if(s1.contains("\u00B2"))
				{
					s1 = s1.substring(0,1);
					int f = Integer.parseInt(s1);
					int fsquare = f*f;
					String s = Float.toString(fsquare);
					tf.setText(s);
				}
				
				if(s1.contains("\u00B3"))
				{
					s1 = s1.substring(0,1);
					int f = Integer.parseInt(s1);
					int fsquare = f*f*f;
					String s = Float.toString(fsquare);
					tf.setText(s);
				}
				
				
				if(s1.contains("%"))
				{
					s1=tf.getText();
					String[] parts = s1.split("[%]");
						String s2 = parts[0];
					float f = Float.parseFloat(s2);
					float fpercent =f/100;
						String s3=parts[1];
						 float p = Float.parseFloat(s3);
						float ans = fpercent * p;
						String s = Float.toString(ans);
								tf.setText(s);
				
				}
				
				if(s1.contains("1/"))
				{
					s1 = s1.substring(2);
					System.out.println(s1);
					double d = Double.parseDouble(s1);
					double div = 1/d;
					String s = Double.toString(div);
					tf.setText(s);
				}
				if(s1.contains("\u221A"))
				{
					s1 = s1.substring(1);
					double d = Double.parseDouble(s1);
					double sqrt = Math.sqrt(d);
					String s = Double.toString(sqrt);
					tf.setText(s);
				}
		}
		
		
	}	
	
	public static void main(String[] s)
	{
		new Calculator("CASIO");
	}
}
class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e1)
	{
		System.exit(0);
	}
}
