import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("hello world", "java programming", "title case example"));
        
        System.out.print("Original ArrayList: " + stringList);
        
        for(int i=0; i < stringList.size(); i++){
            String originalString = stringList.get(i);
            String titleString = convertToTitleCase(originalString);
            stringList.set(i, titleString); // update the ArrayList
        }
        
        System.out.print("Title-cased ArrayList : " + stringList);
    }
    
    public static String convertToTitleCase(String text) {
        if(text == null || text.isEmpty()) {
            return text;
        }
        
        StringBuilder titleCaseBuilder = new StringBuilder();
        boolean capitalizeNext = true;
        
        for(char c : text.toCharArray()) {
            if(Character.isWhitespace(c)) {
                titleCaseBuilder.append(c);
                capitalizeNext = true;
            } else if(capitalizeNext) {
                titleCaseBuilder.append(Character.toTitleCase(c));
                capitalizeNext = false;
            } else {
                titleCaseBuilder.append(Character.toLowerCase(c));
            }
        }
        return titleCaseBuilder.toString();
    }
}
