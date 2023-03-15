import java.io.*;
//Ecriture - Création : fichier texte
class Ecriture
{
public static void main(String[] args)
{
try
{
BufferedWriter etudiants=new BufferedWriter(new FileWriter("Etudiants.txt",true));
etudiants.write("3 Daniel LEGROS Lille");
etudiants.newLine();
etudiants.write("1 Jospin GAMBIALA Calavi yeahh");
etudiants.newLine();
etudiants.close();
}
catch (IOException err)
{System.out.println("Erreur :\n"+err);}
} // Fin main()
} // Fin classe
