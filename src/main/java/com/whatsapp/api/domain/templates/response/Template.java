package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.Component;
import com.whatsapp.api.domain.templates.type.Category;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonFormat.Feature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE;

/**
 * The type Data item.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonFormat(with = READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)
public record Template(

        @JsonProperty("components") List<Component<?>> components,

        @JsonProperty("name") String name,

        @JsonProperty("language") String language,

        @JsonProperty("id") String id,

        @JsonProperty("category") Category category,
        @JsonProperty("previous_category") Category previousCategory,
        @JsonProperty("status") TemplateStatus status
) {
}