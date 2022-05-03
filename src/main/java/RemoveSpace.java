public class RemoveSpace {

    public  String removeSpace(String str) {
        String result = "";
        if (str.isEmpty()) {
            return "String was empty";
        }

        result = str.trim();

        if (!str.equals(result)) {
            return "All Spaces was deleted";
        }
        return "There were not spaces";
    }
}
