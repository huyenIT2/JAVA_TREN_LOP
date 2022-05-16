
package De2;

/**
 *
 * @author Huyen
 */
public abstract class Hinh2Chieu {
    public String maHinh;
    public int dsCanh[];
    
    public abstract float tinhDT();
    public abstract void input();
    public abstract void output();
    
    public int tinhCV() {
        int cv = 0;
        for (int i=0; i<dsCanh.length; i++)
            cv += dsCanh[0];
        return cv;
    }
}
