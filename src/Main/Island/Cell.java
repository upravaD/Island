package Main.Island;

import java.util.ArrayList;
import java.util.List;

public enum Cell {

    cell0000(new ArrayList<>()),
    cell0001(new ArrayList<>()),
    cell0002(new ArrayList<>()),

    cell0100(new ArrayList<>()),
    cell0101(new ArrayList<>()),
    cell0102(new ArrayList<>()),

    cell0200(new ArrayList<>()),
    cell0201(new ArrayList<>()),
    cell0202(new ArrayList<>());

    private final List<Object> cell0000TEMP;

    Cell(List<Object> cell0000TEMP) {
        this.cell0000TEMP = cell0000TEMP;
    }

    public List<Object> toList() {
        return cell0000TEMP;
    }
}
