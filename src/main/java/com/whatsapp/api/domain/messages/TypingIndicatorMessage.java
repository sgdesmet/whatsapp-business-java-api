package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * To mark the message as read, you must first create Read message object
 *
 * @see <a href="https://developers.facebook.com/docs/whatsapp/cloud-api/guides/mark-message-as-read">API documentation
 * - messages</a>
 */
public class TypingIndicatorMessage extends ReadMessage {

    @JsonProperty("typing_indicator")
    private final TypingIndicator typingIndicator = new TypingIndicator( "text" );

    public TypingIndicatorMessage(String messageId) {
        super( messageId );
    }

    public TypingIndicator getTypingIndicator() {
        return typingIndicator;
    }

    public record TypingIndicator(String type) {
    }

}
