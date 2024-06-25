public class stackBasic {
 
        int[]st;
    
        int tos=-1;
        int size=0;
   
    
        public stackBasic(){
            st=new int[5];
        }
    
    
        public  stackBasic(int size){
            st=new int[size];
        }
    
    
        public  boolean isEmpty(){
            if(tos==-1){
                return true;
            }
    
            return false;
        }
    
        public boolean isFull(){
            if(tos==st.length-1){
                return true;
    
            }
            return false;
        }
        public void push(int data) throws Exception {
           // boolean check=isFull();
            if (isFull()){
                throw new Exception("overflow");
    //        if(check==true){
    //            System.out.println("stack is full");
           }else{
                tos=tos+1;
                st[tos]=data;
                size++;
    
            }
        }
    
        public int pop() throws Exception{
            int val=0;
            // if you want to remove else statement than you can remove but not remove code lines.
            if(isEmpty()){
                throw new Exception("underFlow");
            }else{
                val=st[tos];
                tos=tos-1;
                size--;
    
            }
            return val;
        }
    
        public int peek() throws Exception{
            if(isEmpty()){
                throw new Exception("underFlow");
            }
            return st[tos];
        }
        public static void main(String[] args) throws Exception {
            stackBasic s=new stackBasic();
            System.out.println(s.isEmpty());
            s.push(1);
            s.push(2);
            System.out.println(s.isFull());
            s.push(3);
            s.push(4);
            s.push(5);
            System.out.println(s.isFull());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.peek());
    
    
        }
    }

