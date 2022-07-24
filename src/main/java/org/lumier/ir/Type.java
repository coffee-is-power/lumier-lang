package org.lumier.ir;

public enum Type {
    Integer, String, Boolean;

    public static Type fromKeyword(String keyword) {
        switch (keyword) {
            case "int":
                return Integer;
            case "str":
                return String;
            case "bool":
                return Boolean;
            default:
                throw new RuntimeException("Unknown type " + keyword);
        }
    }
}
