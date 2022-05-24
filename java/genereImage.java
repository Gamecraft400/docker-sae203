import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;



public class genereImage
{
    public static void main(String[] a)
    {
		File tabFichierImage = new File("../Ressource/IMAGE");
		String[] tabFichier = tabFichierImage.list();
		try
		{
			PrintWriter pw = new PrintWriter(new FileOutputStream("Resultat.html"));


			for (int cpt = 0; cpt < tabFichier.length; cpt++)
			{
				pw.println("<tr>");
				pw.println("\t<td class=\"memz\">" + tabFichier[cpt] + "</td>");
				pw.println("\t<td class=\"memz\"><img src=\"../Ressource/IMAGE/" + tabFichier[cpt] + "\"></td>");
				pw.println("</tr>\n");
			}

				
			pw.close();
	    }
		 
	    catch (Exception e){ e.printStackTrace(); }

    }

}


