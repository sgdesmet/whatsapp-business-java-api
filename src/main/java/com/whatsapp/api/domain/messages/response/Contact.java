package com.whatsapp.api.domain.messages.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Contact.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record Contact(

        @JsonProperty("input") String input,

        /// The phone number
        @JsonProperty("wa_id") String waId,

        /// The BSUID
        @JsonProperty("user_id") String userId

) {
}
