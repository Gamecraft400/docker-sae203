import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;



public class genereVideo
{
    public static void main(String[] a)
    {
		File tabFichierVideo = new File("../Ressource/VIDEO");
		String[] tabFichier = tabFichierVideo.list();
		try
		{
			PrintWriter pw = new PrintWriter(new FileOutputStream("Resultat.html"));


			for (int cpt = 0; cpt < tabFichier.length; cpt++)
			{
				pw.println("<tr>");
				pw.println("\t<td class=\"memz\">" + tabFichier[cpt] + "</td>");
				pw.println("\t<td class=\"memz\"><video controls><source src=\"../Ressource/VIDEO/" + tabFichier[cpt] + " \" type=\"video/mp4\"></video></td>");
				pw.println("</tr>\n");
			}

				
			pw.close();
	    }
		 
	    catch (Exception e){ e.printStackTrace(); }

    }

}


