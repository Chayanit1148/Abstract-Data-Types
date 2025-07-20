import java.util.ArrayList;

public class IntegerSet {
    private String x ; 

      ArrayList<Integer> Numbers ; //Rep
        // Rep Invariant (RI):
        //  - number must not contain duplicate integer.
        //  - number in number must be sorted in ascending order.
        //  - number in Number must not be null .
        //
        // Abstraction Function (AF):
        //  - AF(number) = the set of integer in the ArrayList<Integer> Number.

      public IntegerSet(){
       
        Numbers = new ArrayList<>() ;
        checkRep(); 
    }
      private void checkRep() {
        for(Integer Numbers : Numbers){
            if(Numbers == null) // ไม่มีจำนวนเต็ม 
            {
                 throw new RuntimeException("Rep invariant violated !") ;
            }
        }
        for(int i = 0 ; i <Numbers.size() - 1 ; i++) // เรียงน้อยไปมาก
        {
            if(i> 0 && Numbers.get(i) >+ Numbers.get(i+1)) {
                throw new RuntimeException("Rep invariant violated !") ;
            }
        }
        }
        /** เพิ่มจำนวนเต็มเข้าเซต
         @param x จำนวนเต็มที่ต้องการเพิ่ม */
      public void add(Integer x) {
         if (!this.contains(x)) {
        checkRep();
        return ;
      }
      int insertIndex = 0 ;
      for (int i  = 0 ; i < Numbers.size() ; i ++){
        if (x < Numbers.get(i)) {
            insertIndex  = 1 ;
            break ; // พบตำแหน่งที่คสรแทรกแล้ว ออกจารลูป
        }
        insertIndex = i + 1 ; // ถ้า x มากกว่าหรือเท่ากับ  element ปัจจุบัน ให้เลื่อนตำแหน่งไปเรื่อยๆ
      }
      //  แทรก x  ที่พบตำแหน่ง
      Numbers.add(insertIndex,x);
      checkRep();
    }
    /**
     * ตรวจสอบว่ามีจำนวนเต็มนี้อยู่ในเซตหรือไม่
     * @param x ตัวอักษรที่ต้องการตรวจสอบ
     * @return true หากมี x อยู่ในเซต ม false หากไม่มี
     */
    private boolean contains(Integer x) {
        return Numbers.contains(x);
    }
    /**คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเวต
     */
    public int size() {
        return Numbers.size();
    }
      public String toString(){
        if (Numbers.isEmpty()){
            return "{}";
        } 
        StringBuilder sb = new StringBuilder("{") ;
        for (int i = 0 ; i < Numbers.size(); i ++) 
        {
            sb.append(Numbers.get(i));
            if(i < Numbers.size()-1);
            sb.append(",")
;        }
        sb.append("}");
          return sb.toString();
      }

    }
    
    



