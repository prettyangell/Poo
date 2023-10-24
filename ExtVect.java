import java.util.Scanner;;
public class ExtVect extends MenuItem {
    Scanner Input= new Scanner(System.in);
    public ExtVect(){
        super();
        name="Extraire Vecteur pour un site donné";
    }

    public void Action(){

        if(action1_done==true){
        String s;
        System.out.println("veuillez entrez le nom de site :");
        s=Input.nextLine();
        VectProfil v1=new VectProfil();
        v1=VectProfil.Extraire(v,s);
        v1.Afficher();}else{
            super.Action();
        }
    }
}
