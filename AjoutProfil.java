public class AjoutProfil extends MenuItem {
    public AjoutProfil(){
        super();
        name="Ajouter Profil ";
    }
    public void Action(){
        if(action1_done==true){
        Profil P=new Profil();
        P.Saisir();
        v.Ajouter(P);
        v.Affiche();}
        else{
            super.Action();
        }
    }
}
