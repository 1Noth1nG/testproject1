package epam.dz.entity;

import java.util.List;

public class AbstractCompoundTextPart<E extends TextPart> implements CompoundTextPart<E> {
    private List<E> elements;

    @Override
    public String toSourceString() {
        StringBuilder sb = new StringBuilder();
        for (E element : elements) sb.append(element.toSourceString());
        return sb.toString();
    }

    @Override
    public void add(E element) {
        elements.add(element);
    }

}
