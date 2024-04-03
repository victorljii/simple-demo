package com.example.messagingstompwebsocket;

/**
 * WebSocket 响应 POJO
 *
 * @date 2024/03/25
 */
public class Greeting {

    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
