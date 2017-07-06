
package olahraga;



public abstract class abstrakolahraga extends pelatih {
   
    
    protected String getNama() {
    return nama ;
    }
    protected String getClub(){
    return club ;
    }
    protected String getposisi() {
    return posisi ;
    }
    protected abstract void printNama();
    
    protected abstract void printClub();
    
    protected abstract void printposisi();
}
