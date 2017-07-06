
package olahraga;


public class turunanabolahraga extends abstrakolahraga {

    @Override
    protected void printNama() {
        System.out.println(super.getNama());
    }
    

    @Override
    protected void printClub() {
        System.out.println(super.getClub());
    }
    

    @Override
    protected void printposisi() {
        System.out.println(super.getposisi());

    }
  
}
