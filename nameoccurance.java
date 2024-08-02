public class{
    public static void main(String[]args){
        String name="tejesh";
        HashMap<Character, integer> hs = new HashMap<Character,integer>();
        for(Character ch:name.toCharArray()){
            if(hs.containKey(ch)){
                hs.put(ch, hs.get(ch)+1);
            }
            else{
                hs.put(ch,1);
            }
        }
        System.out.println(hs);
    }
}