package compitogonnella27feb2018;
import java.io.*;
public class CompitoGonnella27feb2018 {
    public static void main(String[] args) {
        BufferedReader tast =new BufferedReader(new InputStreamReader(System.in));
        
        

        try{
            Pizzeria p1=new Pizzeria("", "", "", "", 0, 0, 0, 0);
            
            System.out.println("Inserisci il nome della pizzeria ");
            p1.setNome(tast.readLine());
            System.out.println("Inserisci l'ubicazione ");
            p1.setUbicazione(tast.readLine());
            System.out.println("Inserisci il numero di telefono " );
            p1.setNumTelefono(tast.readLine());
            System.out.println("Inserisci il giorno di chiusura ");
            p1.setCloseDay(tast.readLine());
            System.out.println("Inserisci numero tavoli ");
            p1.setNumTavoli(Integer.parseInt(tast.readLine()));
            System.out.println("Inserisci numero posti ");
            p1.setNumPosti(Integer.parseInt(tast.readLine()));
            System.out.println("Inserisci orario apertura ");
            p1.setOrarioApertura(Float.parseFloat(tast.readLine()));
            System.out.println("Inserisci Orario chiusura ");
            p1.setOrariohiusura(Float.parseFloat(tast.readLine()));
            
            p1.infoPizzeria();
            p1.postiETavoliLiberi();
            
            System.out.println("Vuoi prenotare un tavolo? Rispondi Y o N");
            if(tast.readLine().equals("Y")){
                System.out.println("prenota un tavolo\nInserisci il numero del tavolo e il numero dei posti desiderati");
                p1.prenotazione(Integer.parseInt(tast.readLine()), Integer.parseInt(tast.readLine()));
            }
            
            
            System.out.println("Vuoi liberare un tavolo? Rispondi Y o N");
            if(tast.readLine().equals("Y")){
                System.out.println("Inserire il numero del tavolo da liberare");
                p1.liberaTavoli(Integer.parseInt(tast.readLine()));
            }
        }
        catch(Exception e){
            System.out.println("errore: "+e);
        }
       
    }
    
}
