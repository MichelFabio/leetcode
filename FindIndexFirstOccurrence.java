public class FindIndexFirstOccurrence {
    public int strStr(String haystack, String needle) {
        String [] s = haystack.split(needle);
        int index = -1;
        if (haystack.equals(needle)){
            index = 0;
        }else if (haystack.contains(needle) && s.length >= 1){
            index = s[0].length();
        }else if(haystack.contains(needle) && s.length == 0){
            index = 0;
        }
        return index;
    }

    public static void main(String[] args) {
        FindIndexFirstOccurrence f = new FindIndexFirstOccurrence();
        System.out.println(f.strStr("mmm","m"));
    }
}
