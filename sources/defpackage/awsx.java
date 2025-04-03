package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsx extends awtk {
    public final awui a;
    public final ConversationIdType b;
    public final Instant c;
    public final eigd d;

    public awsx(awui awuiVar, ConversationIdType conversationIdType, Instant instant, eigd eigdVar) {
        this.a = awuiVar;
        this.b = conversationIdType;
        this.c = instant;
        this.d = eigdVar;
    }

    @Override // defpackage.awtk
    public final awui a() {
        return this.a;
    }

    @Override // defpackage.awtk
    public final ConversationIdType b() {
        return this.b;
    }

    @Override // defpackage.awtk
    public final eigd c() {
        return this.d;
    }

    @Override // defpackage.awtk
    public final Instant d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awtk) {
            awtk awtkVar = (awtk) obj;
            if (this.a.equals(awtkVar.a()) && this.b.equals(awtkVar.b()) && this.c.equals(awtkVar.d()) && this.d.equals(awtkVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eigd eigdVar = this.d;
        Instant instant = this.c;
        ConversationIdType conversationIdType = this.b;
        return "IsComposingInformation{sender=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", expiry=" + instant.toString() + ", status=" + eigdVar.toString() + "}";
    }
}
