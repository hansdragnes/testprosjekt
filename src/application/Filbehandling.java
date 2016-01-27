package application;
import java.io.FileReader;

import javax.swing.JTextArea;
import java.io.*;

public class Filbehandling {
	JTextArea output=new JTextArea();

	public JTextArea visFil(String filnavn) throws IOException	{
		FileReader inntekst;

		try {
			inntekst=new FileReader(filnavn);
		}
		
		catch (FileNotFoundException e)	{
			output.setText("Finner ikke fil "+filnavn);
			return output;
		}
		
		output.setText("Innhold i fil "+filnavn+"\n");
		int i;
		do	{
				i=inntekst.read();
				if(i!=-1)
					output.append(String.valueOf((char)i));			
		} while (i!=-1);
		return output;
	}
}
