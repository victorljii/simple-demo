package com.example.messagingstompwebsocket;

/**
 * WebSocket 请求 POJO
 *
 * @date 2024/03/25
 */
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
