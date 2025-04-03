package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqo {
    public final ConversationId a;
    public final String b;
    public final engw c;
    public final int d = 3;
    private final boolean e;

    public cvqo(ConversationId conversationId, String str, engw engwVar, boolean z) {
        this.a = conversationId;
        this.b = str;
        this.c = engwVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvqo)) {
            return false;
        }
        cvqo cvqoVar = (cvqo) obj;
        if (!ffkj.e(this.a, cvqoVar.a) || !ffkj.e(this.b, cvqoVar.b) || !ffkj.e(this.c, cvqoVar.c) || this.e != cvqoVar.e) {
            return false;
        }
        int i = cvqoVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + 3;
    }

    public final String toString() {
        return "ForGroupRename(conversationId=" + this.a + ", groupName=" + this.b + ", participants=" + this.c + ", isRcs=" + this.e + ", contactPickerSource=" + ((Object) Integer.toString(2)) + ")";
    }
}
