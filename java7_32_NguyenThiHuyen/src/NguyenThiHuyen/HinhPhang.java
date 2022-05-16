
package NguyenThiHuyen;

/**
 *
 * @author Huyen
 */
public abstract class HinhPhang {
    public int soCanh;
    public int dsCanh[];
    
    public int tinhCV() {
        int cv = 0;
        for (int i=0; i<soCanh; i++)
            cv += dsCanh[0];
        return cv;
    };
    public abstract int tinhDT();
}
