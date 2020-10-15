
package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LessonType {
    MATHEMATIC("Mathematic"),
    GEOGRAPHY("Geography"),
    TURKISH("Turkish"),
    ENGLISH("English"),
    SCIENCE("Science"),
    PHYSICS("Physics"),
    CHEMSTRY("Chemstry"),
    HISTORY("History")
    ;
    
    
    private String type;

    LessonType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
