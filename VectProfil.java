import java.util.Collections;
import java.util.Scanner;
//import java.util.*;  
import java.util.Vector;


public class VectProfil  {
/////////////////////////////////////////////////////Scanner////////////////////////////////
    Scanner input= new Scanner(System.in);
    

////////////////////////////////////les attributs///////////////////////////////    
    Vector <Profil> v =  new  Vector<Profil>();



 //////////////////////////////////////constructeurs///////////////////
    public  VectProfil(){}





/////////////////////////////////////////////////////// les methodes ////////////////////////////////////
    public void Remplir() {
        System.out.println("veuillez saisir le nombre de profil à saisir :");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Profil p = new Profil();
            System.out.println("veuillez entrer les informations du profil numero "+(i+1));
            p.Saisir();
            v.add(p);
        }
    }



    public int taille(){//retourn la taille du vecteur
        return v.size();
    }



    public Profil elementAt(int i){//retourne le profile à l'indice i
        return v.elementAt(i);
    }




    public void Afficher(){
        if(v.isEmpty()){
            System.out.println("le vecteur est vide");
        }
        else{
            for (int i = 0; i <v.size(); i++) {
                 Profil p = new Profil();
                p=v.elementAt(i) ;
                System.out.println("profile "+(i+1));
                System.out.println(p.toString());
            }
        }
    }


    public void Affiche(){//demande si vous voulez afficher avant d'afficher (utilise la methode afficher())
        char s;
        System.out.println("voulez vous afficher votre vecteur ? y/n :");
        do{
            s=Character.toLowerCase(input.next().charAt(0));
            switch (s) {
                case 'y':
                    Afficher();
                    break;
                case 'n':
                    break;
                default:
                    System.out.println("voulez vous afficher votre vecteur ? y/n :");
                    break;
            }
        }while(s!='y'&& s!='n');
    }




    
    public boolean Existe(Profil p){
        return(v.contains(p));
    }



    public void Ajouter(Profil p){//ajoute un profil a un vectour en verifiant qu'il nexiste pas deja
        if (!this.Existe(p)){
            v.add(p);
        }else {
            System.out.println("l'élément existe déjà");
        }
    }

    
    
    
    public void trierParNom(){
        Collections.sort(v);
    }




    public void trierParDate(){
        int j;
        Profil p=new Profil();//pour pouvoir faire la permutation entre deux profil sans les perdre
        for(int i=0; i<v.size();){
            j=i+1;
            while(j!=v.size()-1){
                if(v.elementAt(i).getDate_naissance().Compare(v.elementAt(j).getDate_naissance())==1){
                    p=v.elementAt(i);
                    v.set(i, v.elementAt(j));
                    v.set(j, p);
                    j++;
                }
                else{
                    j++;
                }
            }
        }
    }




    public void trierParAdresse(){
        int j,i=0;
        Profil p=new Profil();//pour pouvoir faire la permutation entre deux profil sans les perdre
        for(i=0; i<v.size();){
            j=i+1;
            while(j!=v.size()-1){
                if(v.elementAt(i).getAdresse().Compare(v.elementAt(j).getAdresse())==-1){
                    p=v.elementAt(i);
                    v.set(i, v.elementAt(j));
                    v.set(j, p);
                    j++;
                }
                else{
                    j++;
                }
            }
        }
    }



    public void Supprimer(AdresseMail adr){
        for(int i=0;i<v.size();i++){
            if(AdresseMail.Egal(adr,v.elementAt(i).getAdresse()))
                v.removeElementAt(i); 
            
        }
    }



    public VectProfil Extraire(String S){
        AdresseMail adr=new AdresseMail();
        adr.setNomSite(AdresseMail.NomSite.valueOf(S));
        VectProfil v1=new VectProfil(); 
        for(int i=0;i<v.size();i++){
            if(adr.memeSite( v.elementAt(i).getAdresse()))
            v1.Ajouter(v.elementAt(i));
            
        }
        return v1;
    }




    public static VectProfil Extraire(VectProfil v,String s){
        VectProfil v1 = new VectProfil();
        AdresseMail adr=new AdresseMail();
        adr.setNomSite(AdresseMail.NomSite.valueOf(s));
        for(int i=0;i<v.taille();i++){
            if(adr.memeSite(v.elementAt(i).getAdresse()))
            v1.Ajouter(v.v.elementAt(i));
        }
        return v1;

    }


}
