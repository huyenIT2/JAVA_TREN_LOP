
package De1;

import java.util.Comparator;

/**
 *
 * @author Huyen
 */
public class HinhCNCmpDienTich implements Comparator<HinhCN>{

    @Override
    public int compare(HinhCN o1, HinhCN o2) {
        if(o1.tinhDT()< o2.tinhDT())
            return -1;
        else if(o1.tinhDT()> o2.tinhDT())
            return 1;
        else return 0;
    }   
}
