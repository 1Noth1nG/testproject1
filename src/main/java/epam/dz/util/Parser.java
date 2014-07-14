package epam.dz.util;

import epam.dz.entity.AbstractCompoundTextPart;
import epam.dz.entity.CompoundTextPart;
import epam.dz.entity.Paragraph;
import epam.dz.entity.TextPart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Parser extends AbstractCompoundTextPart {
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    private final Map<String, String> regexes = new HashMap<>();

    public  Parser(String text) {
        regexes.put("Paragraph","\n\r");
        regexes.put("Sentence","(?<=[.!?])+[\\\" \\\"]");
        regexes.put("Word","\\w+");
        regexes.put("Symbol","");
linkedHashMap.put(1,"Paragraph");
        linkedHashMap.put(2,"Sentence");
        linkedHashMap.put(3,"Word");
        linkedHashMap.put(4,"Symbol");
    }
    public <T extends CompoundTextPart> T parse(Class<T> compoundClass, Class<? extends TextPart> partClass, String source) {


        String regex = regexes.get(compoundClass);
        String[] strings = source.split(regex);
    return null;}
}
