package com.github.devcui.yaml.templator.vo;

import com.github.devcui.yaml.templator.entity.YamlMeta;

public class YamlParam {
    private YamlMeta meta;
    private String json;

    public YamlMeta getMeta() {
        return meta;
    }

    public void setMeta(YamlMeta meta) {
        this.meta = meta;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "YamlParam{" +
                "meta=" + meta +
                ", json='" + json + '\'' +
                '}';
    }
}
