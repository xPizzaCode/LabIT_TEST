/*
        Codice scrito da Guido Gonnella per la prova di laboratorio di informatica.
        


        27 Febbraio 2018, Castellana Grotte.
*/
package compitogonnella27feb2018;

public class Pizzeria {
    private String nome;
    private String Ubicazione;
    private String numTelefono;
    private String closeDay;
    private int numTavoli;
    private int numPosti;
    private float orarioApertura;
    private float orarioChiusura;
    private int gestioneTavoli [];

//metodi costruttori
    
    public Pizzeria(String nome, String Ubicazione, String numTelefono, String closeDay, int numTavoli, int numPosti, float orarioApertura, float orarioChiusura) {
        this.nome = nome;
        this.Ubicazione = Ubicazione;
        this.numTelefono = numTelefono;
        this.closeDay = closeDay;
        this.numTavoli = numTavoli;
        this.numPosti = numPosti;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.gestioneTavoli=new int[numTavoli];

    }

    public Pizzeria(String nome, String Ubicazione, String numTelefono, int numTavoli, int numPosti) {
        this.gestioneTavoli = new int[numTavoli];
        this.nome = nome;
        this.Ubicazione = Ubicazione;
        this.numTelefono = numTelefono;
        this.numTavoli = numTavoli;
        this.numPosti = numPosti;
        this.closeDay="Sempre aperto";
        this.orarioApertura=19;
        this.orarioChiusura=24;
        this.gestioneTavoli=new int[numTavoli];
    }
    
    //metodi get e set
    
    public String getNome() {
        return nome;
    }
    public String getUbicazione() {
        return Ubicazione;
    }
    public String getNumTelefono() {
        return numTelefono;
    }
    public String getCloseDay() {
        return closeDay;
    }
    public int getNumTavoli() {
        return numTavoli;
    }
    public int getNumPosti() {
        return numPosti;
    }
    public float getOrarioApertura() {
        return orarioApertura;
    }
    public float getOrariohiusura() {
        return orarioChiusura;
    }

    public void setCloseDay(String closeDay) {
        this.closeDay = closeDay;
    }
    
    public void setGestioneTavoli(int[] gestioneTavoli) {
        this.gestioneTavoli = gestioneTavoli;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUbicazione(String Ubicazione) {
        this.Ubicazione = Ubicazione;
    }
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    public void setNumTavoli(int numTavoli) {
        this.numTavoli = numTavoli;
    }
    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }
    public void setOrarioApertura(float orarioApertura) {
        if(orarioApertura<0||orarioApertura>24)System.out.println("impossibile");
        else this.orarioApertura = orarioApertura;
    }
    public void setOrariohiusura(float orariohiusura) {
        this.orarioChiusura = orariohiusura;
    }

    //altri metodi
    
    public void infoPizzeria() {
         System.out.println("Pizzeria \n\n" + " nome=" + nome + ",\n Ubicazione=" + Ubicazione + ",\n numTelefono=" + numTelefono + ",\n closeDay=" + closeDay + ",\n numTavoli=" + numTavoli + ",\n numPosti=" + numPosti + ",\n orarioApertura=" + orarioApertura + ",\n orarioChiusura=" + orarioChiusura+"\n\n\n\n");
    }
    
    public void changeCloseDay(String closeDay){
        this.closeDay=closeDay;
    }
 
    public void prenotazione (int tavolo, int postiDesiderati){
        if(postiDesiderati+postiOccupati()>numPosti){
            System.out.println("Prenotazione non disponibile");
        }
        else{
            if(gestioneTavoli[tavolo]!=0){
                System.out.println("Tavolo gia' occupato");
            }
            else{
                this.gestioneTavoli[tavolo]=postiDesiderati;
                System.out.println("Prenotazione effettuata.");
            }
        }    
    }
    
    private int postiOccupati(){
        int postiOccupati=0;
        for(int i=0; i<gestioneTavoli.length; i++){
            postiOccupati+=gestioneTavoli[i];
        }
        return postiOccupati;
    }
    
    private int tavoliOccupati(){
        int cont=0;
        
        for(int i=0; i<gestioneTavoli.length; i++){
            if(gestioneTavoli[i]!=0){
                cont++;
            }
        }
        
        return cont;
    }  
    
    public void liberaTavoli(int Tavolo) {
        gestioneTavoli[Tavolo]=0;
    }
    
    private int tavoliLiberi(){
        int cont=0;
        for(int i=0; i<gestioneTavoli.length; i++){
            if(gestioneTavoli[i]==0) cont++;
        }
        return cont;
    }
    
    private int postiLiberi(){
        if(numPosti-postiOccupati()<0){
            return 0;
        }
        else {
            return numPosti-postiOccupati();
        }
    }
    
    public void postiETavoliLiberi(){
        System.out.println("Sono liberi "+tavoliLiberi()+" tavoli per un totale di "+postiLiberi()+" posti.");
    }
  
}