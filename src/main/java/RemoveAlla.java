public class RemoveAlla {
    public  String removeAlla(String str){
        if(str.length() == 0){
            return "Invalid";
        }
        return str.replaceAll("a", "").trim();
    }
}
