import java.util.Scanner;
import java.util.Vector;
// import java.MenuItem;

public class ProgProfil {
    Scanner Input= new Scanner(System.in);
    public static void menu(){
        Scanner Input= new Scanner(System.in);
        int n=0;
        Vector<MenuItem> v=new Vector<MenuItem>();//un vecteur qui va contenir les options du menu
        v.add(new CreationVect());
        v.add(new AjoutProfil());
        v.add(new AfficheVect());
        v.add(new ModifMdp());
        v.add(new ModifQst());
        v.add(new ExtVect());
        do{
        for (int i=0; i<v.size();i++){
            System.out.println("|   "+(i+1)+":"+v.elementAt(i).name+"   \n");
        }//l'affichage du menu 
        System.out.println("veuillez choisir l'une des option ci-dessus");
        n=Input.nextInt();
        try{v.elementAt(n-1).Action();}catch(ArrayIndexOutOfBoundsException e){}//pour eviter les erreurs de type ArrayIndexOutOfBoundsException
        }while(n!=7);//le choix de l'option 
        Input.close();

    }
    



    public static void main(String []args) {
        menu();
    }
}