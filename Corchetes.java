public class Corchetes{
    static int count = 0;
    static boolean flag = false;
    public static boolean isValid(String s){
       
           if ((s.length() % 2 != 0)){
            return false;
            }
           
           String vuelta = "";
           String [] parentesis = s.split("\\(\\)");
           if(parentesis.length != 1){
            for(String a : parentesis){
                vuelta += a;
            }
            count++;
            return isValid(vuelta);
        }
            String [] llaves = s.split("\\{\\}");
            if(llaves.length != 1){
            for(String a : llaves){
                vuelta += a;
            }
            count++;
            return isValid(vuelta);
        }
           String [] corchetes = s.split("\\[\\]");
           if(corchetes.length != 1){
           for(String a : corchetes){
               vuelta += a;
           }
           count++;
           return isValid(vuelta);
           } 
        
        if(s.length() == 0 && count != 0){
            return true;
        }
        if(parentesis.length == 1 && llaves.length == 1 && corchetes.length ==1){
            flag = false;
        }
        
        return flag;
    }

    
    public static void main(String[] args) {

        
        System.out.println(isValid("()()()"));
    }
}