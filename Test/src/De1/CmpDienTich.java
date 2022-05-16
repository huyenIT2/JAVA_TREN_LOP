/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import java.util.Comparator;

/**
 *
 * @author Huyen
 */
public class CmpDienTich implements Comparator<HinhCN>{

    @Override
    public int compare(HinhCN o1, HinhCN o2) {
        if (o1.tinhDT() > o2.tinhDT()) 
            return 1;
        else if (o1.tinhDT() < o2.tinhDT())
            return -1;
        return 0;
    }
    
}
