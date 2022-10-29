package org.example.codex.enums;
public enum LexemeForms {
    ACCENT("form"),
    NOACCENT("formNoAccent"),
    UTF8("formUtf8General");
    final String field;

    LexemeForms(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
