
package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum BloodType {
    APLUS("A+"),
    BPLUS("B+"),
    ZEROPLUS("0+"),
    ABPLUS("AB+"),
    AMIN("A-"),
    BMIN("B-"),
    ZEROMIN("0-");
    
    
    private String type;

    BloodType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
