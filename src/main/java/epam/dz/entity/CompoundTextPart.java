package epam.dz.entity;

public interface CompoundTextPart<E extends TextPart> {

    public String toSourceString();

    void add(E element);
}
