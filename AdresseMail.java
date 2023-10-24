import java.util.Scanner;


public class AdresseMail {
////////////////////////////////////////////////Scanner////////////////////////////////
    Scanner Input= new Scanner(System.in);


/////////////////////////////////////////les attributs///////////////////////////////
    public enum NomSite{gmail,yahoo,outlook,hotmail,protonmail}


    private NomSite nomSite;
    private String nomUser,extension;
    

 /////////////////////////////////////////constructeurs/////////////////////
    public  AdresseMail(){};

    public  AdresseMail(String nu,String ex,NomSite ns){
        
        this.extension=ex;
        this.nomSite=ns;
        this.nomUser=nu;
    }



 /////////////getters and setters//////////
    public String getExtension() {
        return extension;
    }

    
    public NomSite getNomSite() {
        return nomSite;
    }

    
    public String getNomUser() {
        return nomUser;
    }
    
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    
    public void setNomSite(NomSite nomSite) {
        this.nomSite = nomSite;
    }
    
    
    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    
    
//////////////////////////////////////// les methodes/////////////////////////////////




    public void Saisir(){
        System.out.println("sous la forme user@site.extension");
        String s;
        do{ 
            s=Input.nextLine();
            if(!s.contains("@") && !s.contains("@")){
                System.out.println("veuillez re-saisir une adresse correcte");
            }
        }while(!(s.contains("@") && s.contains(".")));//verif si l'adresse contien @ et le . 
            
        setNomUser(s.substring(0,(s.indexOf('@'))));//recupère le nom user aprtir du String 

        try{setNomSite(NomSite.valueOf(s.substring((s.indexOf('@')+1),s.indexOf('.'))));}catch (IllegalArgumentException ex) {}//pour eviter les erreur de type IllegalArgumentException 

        setExtension(s.substring((s.indexOf('.')+1),s.length()));//recupère l'extension aprtir du String 
        
    }







    @Override   public String toString(){
        return (nomUser+"@"+nomSite+"."+extension);
    }


    
    public void Afficher(){
        System.out.println(toString());
    }



    public boolean memeSite(AdresseMail A){//comapre deux adresse et retourne vrai si elle sont domiciliée au meme site sinon faux
        if(this.nomSite==A.nomSite  && this.extension==A.extension){
            return true;
        }
        return false;
    } 


   
   
    public static boolean Egal(AdresseMail A1, AdresseMail A2){//compare entre deux adresse complete
        if(A1.memeSite(A2)  &&  A1.nomUser==A2.nomUser && A1.extension==A2.extension){
            return true;    
        }
            return false;
    }


   
    public boolean Egal(AdresseMail A){
        if(this.memeSite(A)  &&  this.nomUser==A.nomUser && this.extension==A.extension){
            return true;    
        }
            return false;
    }

    
   
    public static int Compare(AdresseMail A1,AdresseMail A2){//compare est retourn 1 si la 1ere est avant la 2eme sinon si la 2eme est avant la 1ere alors elle retourne -1 sinon 0
        int i;
        if(AdresseMail.Egal(A1,A2)){
            return 0;
        }
        else{


            
            if(A1.nomUser.equals(A2.nomUser)){
                
                if(A1.nomSite.toString().equals(A2.nomSite.toString())){
                    return 0;
                }
                
                else{
                    
                    for ( i= 0; i <  Math.min(A1.nomSite.toString().length(),A2.nomSite.toString().length());) {
                        
                        if ( Character.toLowerCase(A1.nomSite.toString().charAt(i)) <  Character.toLowerCase(A2.nomSite.toString().charAt(i))){
                            return 1;
                        }

                        else if( Character.toLowerCase(A2.nomSite.toString().charAt(i)) <  Character.toLowerCase(A1.nomSite.toString().charAt(i))){
                            return -1;
                        }
                        
                        
                        else{
                            i++;
                        }
                    }
                    return 0;
                }
            }

            else{

                for (i= 0; i < Math.min(A1.nomUser.length(),A2.nomUser.length());) {

                        if ( Character.toLowerCase(A1.nomUser.charAt(i)) <  Character.toLowerCase(A2.nomUser.charAt(i))){
                            return 1;
                        }

                        else if( Character.toLowerCase(A2.nomUser.charAt(i)) <  Character.toLowerCase(A1.nomUser.charAt(i))){
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


    
   
    public  int Compare(AdresseMail A2){
        int i;
        if(this.Egal(A2)){
            return 0;
        }
        else{
            
            
            if(this.nomUser.equals(A2.nomUser)){
                
                if(this.nomSite.toString().equals(A2.nomSite.toString())){
                    return 0;
                }
                
                else{
                    
                    for ( i= 0; i <  Math.min(this.nomSite.toString().length(),A2.nomSite.toString().length());) {
                        
                        if ( Character.toLowerCase(this.nomSite.toString().charAt(i)) <  Character.toLowerCase(A2.nomSite.toString().charAt(i))){
                            return 1;
                        }

                        else if( Character.toLowerCase(this.nomSite.toString().charAt(i)) >  Character.toLowerCase(A2.nomSite.toString().charAt(i))){
                            return -1;
                        }
                        
                        else{
                            i++;
                        }
                    }
                    return 0;
                }
            }

            else{

                for (i= 0; i < Math.min(this.nomUser.length(),A2.nomUser.length());) {

                        if ( Character.toLowerCase(this.nomUser.charAt(i)) <  Character.toLowerCase(A2.nomUser.charAt(i))){
                            return 1;
                        }

                        else if( Character.toLowerCase(A2.nomUser.charAt(i)) <  Character.toLowerCase(this.nomUser.charAt(i))){
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
}
