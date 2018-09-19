
/**
 *
 * @author sudarakas
 */
public class TowerOfHannoi {
    int count = 1;
    public void movedis(int i,String src,String dest){
        System.out.println("Step No: "+count+" --> Move disk "+i+" from rod "+src+" to rod "+dest);
        count ++;
    }
    public void twHannoi(int i,String src,String dest,String aux){
        if(i == 1){
            movedis(i,src,dest);
        }
        else{
            twHannoi((i-1),src,aux,dest);
            movedis((i),src,dest);
            twHannoi((i-1), aux,dest, src);
        }
        
    }
    
    public static void main(String[] args) {
        TowerOfHannoi test = new TowerOfHannoi();
        test.twHannoi(8,"A","C","B");
    }
}
