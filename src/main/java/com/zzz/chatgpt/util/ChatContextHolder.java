package com.zzz.chatgpt.util;

import com.zzz.chatgpt.entity.chat.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatContextHolder {

    private static Map<String, List<Message>> context = new HashMap<>();

    /**
     * 获取对话历史
     */
    public static List<Message> get(String id) {
        return context.computeIfAbsent(id, k -> new ArrayList<>());
    }


    /**
     * 添加对话
     */
    public static void add(String id, String msg) {
        Message message = Message.builder().content(msg).build();
        add(id, message);
    }


    /**
     * 添加对话
     */
    public static void add(String id, Message message) {
        List<Message> messages = context.computeIfAbsent(id, k -> new ArrayList<>());
        messages.add(message);
    }

    /**
     * 清除对话
     */
    public static void remove(String id) {
        context.remove(id);
    }
}
