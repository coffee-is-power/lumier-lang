package org.lumier.ir;

public enum Type {
    Integer,
    String;
    public static Type fromKeyword(String keyword) {
        switch (keyword) {
            case "int":
                return Integer;
            case "str":
                return String;
            default:
                throw new RuntimeException("Unknown type " + keyword);
        }
    }
}
