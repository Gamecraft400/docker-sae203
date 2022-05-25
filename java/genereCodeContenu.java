import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;



public class genereCodeContenu
{
    public static void main(String[] a)
    {
		File tabFichierImage = new File("../html/ressource/image");
		File tabFichierVideo = new File("../html/ressource/video");
		String[] tabFichier = tabFichierImage.list();
		try
		{
			PrintWriter pw = new PrintWriter(new FileOutputStream("Resultat.html"));


			for (int cpt = 0; cpt < tabFichier.length; cpt++)
			{
				pw.println("<tr>");
				pw.println("\t<td class=\"memz\"><img src=\"../html/ressource/image/" + tabFichier[cpt] + "\"></td>");
				pw.println("</tr>\n");
			}

			tabFichier = tabFichierVideo.list();

			for (int cpt = 0; cpt < tabFichier.length; cpt++)
			{
				pw.println("<tr>");
				pw.println("\t<td class=\"memz\"><video controls><source src=\"../html/ressource/video/" + tabFichier[cpt] + " \" type=\"video/mp4\"></video></td>");
				pw.println("</tr>\n");
			}
				
			pw.close();
	    }
		 
	    catch (Exception e){ e.printStackTrace(); }

    }

}


