package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adus extends aduy {
    private final engw a;
    private final SpannableString b;
    private final ConversationIdType c;

    public adus(engw engwVar, SpannableString spannableString, ConversationIdType conversationIdType) {
        this.a = engwVar;
        this.b = spannableString;
        this.c = conversationIdType;
    }

    @Override // defpackage.aduy
    public final SpannableString a() {
        return this.b;
    }

    @Override // defpackage.aduy
    public final ConversationIdType b() {
        return this.c;
    }

    @Override // defpackage.aduy
    public final engw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aduy) {
            aduy aduyVar = (aduy) obj;
            if (enkr.h(this.a, aduyVar.c()) && this.b.equals(aduyVar.a()) && this.c.equals(aduyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ConversationIdType conversationIdType = this.c;
        SpannableString spannableString = this.b;
        return "ProblematicConversation{problematicMessages=" + String.valueOf(this.a) + ", conversationName=" + spannableString.toString() + ", conversationId=" + conversationIdType.toString() + "}";
    }
}
