package epam.dz.util;

import epam.dz.entity.AbstractCompoundTextPart;
import epam.dz.entity.CompoundTextPart;
import epam.dz.entity.TextPart;

import java.util.HashMap;
import java.util.Map;

public class Parser extends AbstractCompoundTextPart {
    Map<String, String> compoundclass = new HashMap<String, String>();
    private final Map<String, String> regexes = new HashMap<>();

    public Parser(String text) {
        regexes.put("Paragraph", "\n\r");
        regexes.put("Sentence", "(?<=[.!?])+[\\\" \\\"]");
        regexes.put("Word", "\\w+");
        regexes.put("Symbol", "");
        compoundclass.put("Text", "Paragraph");
        compoundclass.put("Paragraph", "Sentence");
        compoundclass.put("Sentence", "Word");
        compoundclass.put("Word", "Symbol");


    }

    public <T extends CompoundTextPart> T parse(String compoundClass, String partClass, String source) {
        CompoundTextPart result = null;
        String regex = regexes.get(compoundClass);
        String[] strings = source.split(regex);
        String nextcompoundClass = compoundclass.get(compoundClass);
        String nextpartClass = compoundclass.get(partClass);
        if (!compoundclass.get(partClass).isEmpty()) {

            for (String partString : strings) {
                CompoundTextPart compound = parse(nextcompoundClass, nextpartClass, partString);
                result.add((TextPart) compound);
            }

        }
        return null;


    }


}
