
package olahraga;


public class main extends turunanabolahraga {
    
    public void tangkis(){
    super.menangkis();
    }
  
  public static void main (String[] args){
    turunanabolahraga to = new turunanabolahraga();
    prestasi pre = new prestasi ();
    pre.setturnamen("Indonesia open");
    pre.setjumlah(5);
    System.out.println(pre.getturnamen());
    System.out.println(pre.getjumlah());
    to.printNama();
    to.printClub();
    to.printposisi();
    to.menangkis();
    
}    
}
