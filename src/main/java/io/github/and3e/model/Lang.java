package io.github.and3e.model;

public class Lang {
    private Long id;
    private String welcameMsg;
    private String code;

    public Lang(Long id, String welcameMsg, String code) {
        this.id = id;
        this.welcameMsg = welcameMsg;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getWelcameMsg() {
        return welcameMsg;
    }

    public String getCode() {
        return code;
    }
}
