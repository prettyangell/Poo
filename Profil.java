
import java.util.Scanner;


public class Profil implements Comparable<Profil>{//la classe Comparable contient la methode compareTo qu'on va modifier
/////////////////////////////////////////////////////Scanner////////////////////////////////
    Scanner input=new Scanner(System.in);

////////////////////////////////////les attributs///////////////////////////////    
    private String nom,prenom,mot_de_passe,reponse,question;
    private String numero;
    private Date date_naissance;
    private AdresseMail adresse;





 //////////constructeurs/////////////////
    public  Profil(){};
    

    public  Profil(String nom,String p,String m,String q,String r,String num,Date d,AdresseMail a){
        this.nom=nom;
        prenom=p;
        mot_de_passe=m;
        question=q;
        reponse=r;
        numero=num;
        date_naissance=d;
        adresse=a;
    }






 ///////////////////////////////getters and setters///////////
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    
    public void setAdresse(AdresseMail adresse) {
        this.adresse = adresse;
    }

    
    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    
    public void setQuestion(String question) {
        this.question = question;
    }

    
    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    
    public String getNom() {
        return nom;
    }
     
    
    public String getPrenom() {
        return prenom;
    }

    
    public String getNumero() {
        return numero;
    }

    
    public Date getDate_naissance() {
        return date_naissance;
    }

    
    public AdresseMail getAdresse() {
        return adresse;
    }

    
    public String getMot_de_passe() {
        return mot_de_passe;
    }

   
    public String getQuestion() {
        return question;
    }

   
    public String getReponse() {
        return reponse;
    }
 





/////////////////////////////////////////////////////// les methodes ////////////////////////////////////

    public void Saisir(){
        System.out.println("veuillez saisir votre nom :");
        nom=input.nextLine();
        

        System.out.println("veuillez saisir votre prenom :");
        prenom=input.nextLine();
        
        
        System.out.println("veuillez saisir votre date de naissance :");
        Date d =new Date();
        date_naissance=d;
        date_naissance.Saisir();

        System.out.println("veuillez saisir votre numero de telephone :");
        do{
        
        numero=input.nextLine();
        if(numero.length()!=10){
            System.out.println("veuilez re-saisir un numero correcte de 10 chiffres");
        }
        }while(numero.length()!=10);//verifier que le numero contient 10 chiffres
        
        
        System.out.println("veuillez saisir votre adresse mail :");
        AdresseMail a=new AdresseMail();
        adresse=a;
        adresse.Saisir();


        System.out.println("veuillez saisir votre mot de passe :");
        mot_de_passe=input.nextLine();



        System.out.println("veuillez saisir votre question :");
        do{
        question=input.nextLine();
        if(!question.endsWith("?")){
            System.out.println("veuillez re-ecrire une question : ");
        }
        }while(!question.endsWith("?"));//verif que la question se termine avec un point d'interogation
        

        System.out.println("veuillez repondre a cette question "+question+":");
        reponse=input.nextLine();
    
    }
    



    
    @Override 
    public String toString(){
        return("nom : "+nom+"\nprénom :"+prenom+"\ndate de naissance : "+date_naissance.Afficher()+"\nnumero de telephone : "+numero+"\nadresse mail : "+adresse.toString()+"\nmot de passe : "+mot_de_passe+"\nquestion secrète:"+question+"\n la réponse à la question est: "+reponse);

    }






    public void ChangerMotdePass(){
        input.next();
        System.out.println("veuillez entrer votre nouveau mot de passe:");
        this.mot_de_passe=input.nextLine();
    }




    
    public void ChangerQuestion(){
        input.next();
        System.out.println("veuillez entrer votre nouvelle question secrète:");
        this.question=input.nextLine();


    }

   
   
   
    @Override
    public int compareTo(Profil p){//compare deux profil par rapport au nom  (cette sera utiliser pour la methode trier par nom (sort))
        if(this.nom.equals(p.nom)){
            return 0;
        }
        else{
            for ( int i= 0; i <  Math.min(this.nom.length(),p.nom.length());) {
                        
                if ( Character.compare(Character.toLowerCase(this.nom.charAt(i)), Character.toLowerCase(p.nom.charAt(i)))>0){
                    return 1;
                }

                else if(Character.compare(Character.toLowerCase(this.nom.charAt(i)), Character.toLowerCase(p.nom.charAt(i)))<0 ){
                    return -1;
                }
                
                
                else{
                    i++;
                }
            }
            return 0;

        }
    }
    


    
}
