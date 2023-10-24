public class CreationVect extends MenuItem {


    public CreationVect(){
        super();
        name="Créer Vecteur de profils et le remplir ";//le nom de l'option
    }


    @Override
    public void Action(){//l'action de l'option
        v=new VectProfil();
        v.Remplir();
        v.Affiche();
        CreationVect.action1_done=true;//on change la vleur de ce boolean pour pouvoir mettre une condition dans les autres classe
        
    }
}
