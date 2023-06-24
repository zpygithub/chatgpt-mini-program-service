package com.zzz.chatgpt.entity.chat;

import com.zzz.chatgpt.entity.billing.Usage;

import java.util.List;

import lombok.Data;

/**
 * chat答案类
 */
@Data
public class ChatCompletionResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<ChatChoice> choices;
    private Usage usage;
}
