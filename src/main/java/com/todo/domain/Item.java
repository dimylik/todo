package com.todo.domain;

public class Item {

    private String id;
    private String value;
    private boolean status;

    public Item() {
    }

    public Item(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void switchStatus() {
        this.status = !this.status;
    }
}
