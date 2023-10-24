import java.util.Scanner;
public class Date{
/////////////////////////////////////////Scanner////////////////////////////////


    Scanner sc= new Scanner(System.in);



////////////////////////////////////les attributs///////////////////////////////
    enum Mois{janvier,fevrier,mars,avril,mai,juin,juillet,aout,septembre,octobre,novembre,decembre}

    private int jours,annee;
    private Mois mois;

 ///////////////////////////////////////////constructeurs/////////////////////////


    public Date(){};

    public  Date(int j,String m,int a){
        jours=j;
        annee=a;       
        mois=Mois.valueOf(m);
    }





 ///////////////////////////////les getters et setters//////////////////////////

    public int getjours(){
    
        return jours;
    }


    public Mois getmois() {
        return mois;
    }


    public int getannee() {
        return annee;
    }


    public void setannee(int A){
        annee=A;
    }


   public void setmois(String m){
       mois=Mois.valueOf(m);
   }


    public void setjour(int j){
        jours=j;
    }








 //////////////////////////////////////// les methodes/////////////////////////////////
    public boolean Verif(){//verif si une date est correcte
        //System.out.println("le mois est "+(mois.ordinal()+1));
        
        if (mois.ordinal()<=6 && mois.ordinal()!=1){
            if(mois.ordinal()%2==0){
                //de janvier a juillet les mois avec l'indice pair doivent avoir max 31
                if(jours <=31){
                    return true;
                }
            }
            else{
                //de janvier a juillet les mois avec l'indice impair doivent avoir max 30
                if(jours<=30){
                    return true;
                }
            }
        }
        else if( mois.ordinal()>=6){
            //de juillet a decembre les mois avec l'indice pair doivent avoir max 30
            if(mois.ordinal()%2==0){
                if(jours <=30){
                    return true;
                }
            }
            else{
                //de juillet a decembre les mois avec l'indice impair doivent avoir max 31
                if(jours<=31){
                    return true;
                }
            }
        }
        else{
            //si l'annee est bisextile le nombre de  jours ne doit pas depasser 29
            if(jours==29 && Bissextile()){
                return true;
            }
            //sinon le nombre de jours ne doit pas depasser 28
            else if(jours==28 && !Bissextile()){
                return true;
            }
        
        }
        return false;
    }




    public boolean Bissextile(){//verif si une annee est bisextile :266 jours (on en besoin dans la methode verif)
        return annee%4==0 && annee%100!=0;
    }



    
    
    public void Saisir(){
        System.out.println("jour/mois/annee");
    do{ 
        jours=sc.nextInt();
        sc.nextLine();//on doit ajouter ce scanner car le nextInt ne prend pas les espace et donc c'est le Scanner d'apres qui la prend commme entrée

        String s=sc.nextLine();
        
        mois=Mois.valueOf(s);
       


        annee=sc.nextInt();
        if(Verif()==false){
            System.out.println("veuillez re-saisir une date correcte : ");
        }
        }while (Verif()==false);

    }



    
    
    public String Afficher(){
        return(jours+"/"+mois.toString()+"/"+annee);
    }






    
    public int Compare(Date d){//compare deux dates et retourne 0 si elle sont identiques sinon si la premiere est inferieure à la deuxieme elle retourne -1 sinon 1
        if (d.Verif()){
            if(this.annee<d.annee){
                return -1;
            }
            else if (d.annee<this.annee){
                return 1;
            }
            else{
                if(this.mois.ordinal()<d.mois.ordinal()){
                    return -1;
                }
                else if(this.mois.ordinal()>d.mois.ordinal()){
                    return 1;
                }

                else{
                    if (this.jours<d.jours){
                        return -1;
                    }
                    else if (d.jours<this.jours){
                        return 1;
                    }
                    else{
                        return 0 ;
                    }

                }          
            }
        }
        return 2;// 2 étant une valeur donnée si la date est fausse
    }



}