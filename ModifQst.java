public class ModifQst extends MenuItem{
    public ModifQst(){
        name="Modifier Question Secrète";
    }

    public void Action(){
        if(action1_done==true){
        int i=-1;
        AdresseMail adr=new AdresseMail();
       System.out.println("entrer l'adresse mail pour changer votre question secrète");
        adr.Saisir();
        do {
            i++;
        } while (!AdresseMail.Egal(v.v.elementAt(i).getAdresse(),adr) && i<v.taille());
       v.v.elementAt(i).ChangerQuestion();
       v.Affiche();}else{
        super.Action();
       }

    }
}
