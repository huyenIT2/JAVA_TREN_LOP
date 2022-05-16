package SinhVienDemo;

//minh họa bẫy lỗi lan truyền
public class BayLoi {
    public static void main(String[ ] args){
         System.out.println("Goi phuong thuc A()");
            A();                        
    }
    public static void A(){ 
         B();
    }
    public static void B(){    
        C();    
    }
    public static void C(){         
       try{
        float a = 2/0;    
       }
       catch (Exception c){
           System.out.println(c.getMessage());
           System.out.print("ctr có lỗi. liên hệ với ncc");
       }
    }
    }
