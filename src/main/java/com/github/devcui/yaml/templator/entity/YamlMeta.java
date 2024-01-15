package com.github.devcui.yaml.templator.entity;

import java.util.List;

public class YamlMeta {
    private String id;
    private String parentKeyId;
    private String key;
    private String title;
    private String comment;
    private String type;
    private List<YamlMeta> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentKeyId() {
        return parentKeyId;
    }

    public void setParentKeyId(String parentKeyId) {
        this.parentKeyId = parentKeyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "YamlMeta{" +
                "id='" + id + '\'' +
                ", parentKeyId='" + parentKeyId + '\'' +
                ", key='" + key + '\'' +
                ", title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                ", type='" + type + '\'' +
                ", children=" + children +
                '}';
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<YamlMeta> getChildren() {
        return children;
    }

    public void setChildren(List<YamlMeta> children) {
        this.children = children;
    }
}
