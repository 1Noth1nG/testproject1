package epam.dz.entity;


import java.util.ArrayList;
import java.util.List;

public class Symbol extends Word implements SentencePart {
    List<String> symbols = new ArrayList<String>();
    private String symbol;

    public Symbol(String symbol) {
        this.symbol = symbol;
        if (!symbol.equals(null))
            symbols.add(symbol);
        else symbols.add(" ");
    }

    public void setSymbol(String symbol) {

    }

    @Override
    public String toString() {
        return "Symbol{" +
                "symbol='" + symbol + '\'' +
                '}';
    }
}
