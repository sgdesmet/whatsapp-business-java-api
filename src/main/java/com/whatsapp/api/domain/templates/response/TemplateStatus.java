package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * <a
 * href="https://developers.facebook.com/docs/whatsapp/business-management-api/webhooks/components/#value-object">Documentation</a>
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
    REINSTATED,
    FLAGGED,
    @JsonEnumDefaultValue UNKNOWN
}
