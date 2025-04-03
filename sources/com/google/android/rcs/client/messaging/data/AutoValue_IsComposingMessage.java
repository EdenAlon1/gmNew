package com.google.android.rcs.client.messaging.data;

import defpackage.eigd;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_IsComposingMessage extends IsComposingMessage {
    private final eigd a;
    private final Optional b;
    private final Optional c;

    public AutoValue_IsComposingMessage(eigd eigdVar, Optional optional, Optional optional2) {
        this.a = eigdVar;
        this.b = optional;
        this.c = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.data.IsComposingMessage
    public final eigd a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.IsComposingMessage
    public final Optional b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.IsComposingMessage
    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IsComposingMessage) {
            IsComposingMessage isComposingMessage = (IsComposingMessage) obj;
            if (this.a.equals(isComposingMessage.a()) && this.b.equals(isComposingMessage.b()) && this.c.equals(isComposingMessage.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "IsComposingMessage{state=" + this.a.toString() + ", refresh=" + String.valueOf(optional2) + ", timestamp=" + String.valueOf(optional) + "}";
    }
}
