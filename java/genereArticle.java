import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileReader;

import iut.algo.Decomposeur;


public class genereArticle
{
    public static void main(String[] a)
    {
        PrintWriter pw;
		Scanner sc;
		Decomposeur dec;
		FileOutputStream fos;
		FileReader fr;

		try
		{
			fr  = new FileReader ( "infoVideo.data" );
			sc  = new Scanner ( fr );
			fos = new FileOutputStream("resultat.html");
			pw = new PrintWriter(fos);
			
			while (sc.hasNextLine())
			{
				dec = new Decomposeur(sc.nextLine());
                pw.println("<li class=\"memz\">" + dec.getString(0) + "<iframe src=\"" + dec.getString(1)+ "\" title=\"YouTube video player\" frameborder=\"0\" allowfullscreen></iframe></li>");
		    }
		   	fr.close();
		   	pw.close();
	    }
	    catch (Exception e){ e.printStackTrace(); }

    }

}


