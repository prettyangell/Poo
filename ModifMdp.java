public class ModifMdp extends MenuItem {
    public ModifMdp(){
        super();
        name="Modifier Mot de passe ";

    }

    public void Action(){

        if(action1_done==true){
        int i=(-1);
        AdresseMail adr=new AdresseMail();
        System.out.println("entrer l'adresse mail pour changer votre mot de passe");
        adr.Saisir();
        do{
            i++;
        }while(!AdresseMail.Egal(adr,v.elementAt(i).getAdresse()) && i<v.taille());
        v.elementAt(i).ChangerMotdePass();
        v.Affiche();
       }else{super.Action();}
    }
}
