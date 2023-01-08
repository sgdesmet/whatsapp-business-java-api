package com.whatsapp.api.domain.webhook.cloudapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @param listReply   Used on Webhooks related to List Messages
 *                    Contains a list {@link ListReply} object.
 * @param type        Contains the type of interactive object. Supported options are:<ul>
 *                    <li>button_reply: for responses of Reply Buttons.</li>
 *                    <li>list_reply: for responses to List Messages and other interactive objects.</li></ul>
 * @param buttonReply Used on Webhooks related to Reply Buttons.
 *                    Contains a {@link ButtonReply} reply object.
 */
public record Interactive(

        @JsonProperty("list_reply") ListReply listReply,

        @JsonProperty("type") String type,

        @JsonProperty("button_reply") ButtonReply buttonReply) {

}