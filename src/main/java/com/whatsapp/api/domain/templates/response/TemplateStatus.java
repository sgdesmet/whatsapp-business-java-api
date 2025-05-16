package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * Date: 03/01/2024 Time: 17:23
 *
 * @author sgdesmet
 */
public enum TemplateStatus {

    APPROVED,
    IN_APPEAL,
    PENDING,
    REJECTED,
    PENDING_DELETION,
    DELETED,
    DISABLED,
    PAUSED,
    LIMIT_EXCEEDED,
    @JsonEnumDefaultValue UNKNOWN

}
