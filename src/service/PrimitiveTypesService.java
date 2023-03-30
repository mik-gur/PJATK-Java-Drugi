package service;

import entity.PrimitiveTypes;

public class PrimitiveTypesService {

    private PrimitiveTypes primitiveTypes = new PrimitiveTypes();
    public void print() {
        System.out.println("Primitive types in Java: ");
        System.out.println("short s = " + primitiveTypes.getS());
        System.out.println("int i = " + primitiveTypes.getI());
        System.out.println("long l = " + primitiveTypes.getL());
        System.out.println("float f = " + primitiveTypes.getF());
        System.out.println("double d = " + primitiveTypes.getD());
        System.out.println("char c = " + primitiveTypes.getC());
        System.out.println("String str = " + primitiveTypes.getStr());
        System.out.println("boolean b = " + primitiveTypes.isB());
        System.out.println("");
    }
}
