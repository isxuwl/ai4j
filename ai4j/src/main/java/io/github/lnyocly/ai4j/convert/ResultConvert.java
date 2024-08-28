package io.github.lnyocly.ai4j.convert;

import io.github.lnyocly.ai4j.platform.openai.chat.entity.ChatCompletionResponse;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

/**
 * @Author cly
 * @Description 处理结果输出 其它模型格式--->统一的OpenAi格式
 * @Date 2024/8/12 1:05
 */
public interface ResultConvert<T> {
    EventSourceListener convertEventSource(EventSourceListener eventSourceListener);
    ChatCompletionResponse convertChatCompletionResponse(T t);
}
