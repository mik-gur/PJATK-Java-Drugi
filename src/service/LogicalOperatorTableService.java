package service;

import entity.LogicalOperatorTable;

public class LogicalOperatorTableService {

    private LogicalOperatorTable table = new LogicalOperatorTable(true, false);
    public void print() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "P", "Q", "AND", "OR", "XOR", "NOT");
        System.out.printf("%-10b %-10b %-10b %-10b %-10b %-10b\n", table.isP(), table.isP(), and(table.isP(),table.isP()), or(table.isP(),table.isP()), xor(table.isP(),table.isP()), not(!table.isQ()));
        System.out.printf("%-10b %-10b %-10b %-10b %-10b %-10b\n", table.isP(), table.isQ(), and(table.isP(),table.isQ()), or(table.isP(),table.isQ()), xor(table.isP(),table.isQ()), not(!table.isQ()));
        System.out.printf("%-10b %-10b %-10b %-10b %-10b %-10b\n", table.isQ(), table.isP(), and(table.isQ(),table.isP()), or(table.isQ(),table.isP()), xor(table.isQ(),table.isP()), not(!table.isP()));
        System.out.printf("%-10b %-10b %-10b %-10b %-10b %-10b\n", table.isQ(), table.isQ(), and(table.isQ(),table.isQ()), or(table.isQ(),table.isQ()), xor(table.isQ(),table.isQ()), not(!table.isP()));
        System.out.println("");
    }
    private boolean and(boolean p, boolean q) {
        return p && q;
    }

    private boolean or(boolean p, boolean q) {
        return  p || q;
    }

    private boolean xor(boolean p, boolean q) {
        return p ^ q;
    }

    private boolean not(boolean p){
        return !p;
    }
}
