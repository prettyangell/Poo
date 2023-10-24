public class MenuItem {//la classe menuitem va heriter des "option" du menu 
    protected String name;//le nom va contenir l'option
    protected static boolean action1_done=false;//on va l'utiliser pour etre sur que le vecteur a ete cree avant de choisir les autres options
    protected static VectProfil v;

    protected MenuItem(){};

    public  void Action(){
        System.out.println("vous ne pouvez pas effectuez cette operation puisque vous n'avez pas de vecteur :)");
    }


}
