package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crhm extends crhp {
    private final ConversationIdType a;
    private final int b;
    private final boolean c;

    public crhm(ConversationIdType conversationIdType, int i, boolean z) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.crhp
    public final int a() {
        return this.b;
    }

    @Override // defpackage.crhp
    public final ConversationIdType b() {
        return this.a;
    }

    @Override // defpackage.crhp
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crhp) {
            crhp crhpVar = (crhp) obj;
            if (this.a.equals(crhpVar.b()) && this.b == crhpVar.a() && this.c == crhpVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationSettingsInput{conversationId=" + this.a.toString() + ", joinState=" + this.b + ", hasRbmBotRecipient=" + this.c + "}";
    }
}
