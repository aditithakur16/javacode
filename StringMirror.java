public class StringMirror {
    
        public static String stringMirror(String s) {
            
            StringBuilder ans = new StringBuilder() ;
            ans.append(s.charAt(0));
            for(int i=1; i < s.length(); i++)
            {
                //curr ch if higher, break,we need smallest. 
                if(s.charAt(i-1) > s.charAt(i) || (i>1 && s.charAt(i)==s.charAt(i-1))) 
                ans.append(s.charAt(i));
                
                else break;
            }
            String curr = ans.toString();
            
            return curr+ ans.reverse().toString();
        }
}
