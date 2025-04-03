package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class cisp extends citr {
    private final String a;
    private final ConversationIdType b;
    private final ConversationId c;
    private final String d;
    private final boolean e;
    private final Optional f;
    private final int g;
    private final IconCompat h;
    private final Optional i;
    private final Optional j;
    private final Optional k;

    public cisp(String str, ConversationIdType conversationIdType, ConversationId conversationId, String str2, boolean z, Optional optional, int i, IconCompat iconCompat, Optional optional2, Optional optional3, Optional optional4) {
        this.a = str;
        this.b = conversationIdType;
        this.c = conversationId;
        this.d = str2;
        this.e = z;
        this.f = optional;
        this.g = i;
        this.h = iconCompat;
        this.i = optional2;
        this.j = optional3;
        this.k = optional4;
    }

    @Override // defpackage.citr
    public final int a() {
        return this.g;
    }

    @Override // defpackage.citr
    public final IconCompat b() {
        return this.h;
    }

    @Override // defpackage.citr
    public final ConversationId c() {
        return this.c;
    }

    @Override // defpackage.citr
    public final ConversationIdType d() {
        return this.b;
    }

    @Override // defpackage.citr
    public final Optional e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        IconCompat iconCompat;
        if (obj == this) {
            return true;
        }
        if (obj instanceof citr) {
            citr citrVar = (citr) obj;
            if (this.a.equals(citrVar.j()) && this.b.equals(citrVar.d()) && this.c.equals(citrVar.c()) && this.d.equals(citrVar.i()) && this.e == citrVar.k() && this.f.equals(citrVar.g()) && this.g == citrVar.a() && ((iconCompat = this.h) != null ? iconCompat.equals(citrVar.b()) : citrVar.b() == null) && this.i.equals(citrVar.e()) && this.j.equals(citrVar.f()) && this.k.equals(citrVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.citr
    public final Optional f() {
        return this.j;
    }

    @Override // defpackage.citr
    public final Optional g() {
        return this.f;
    }

    @Override // defpackage.citr
    public final Optional h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
        IconCompat iconCompat = this.h;
        return (((((((((hashCode * 1000003) ^ this.g) * 1000003) ^ (iconCompat == null ? 0 : iconCompat.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.citr
    public final String i() {
        return this.d;
    }

    @Override // defpackage.citr
    public final String j() {
        return this.a;
    }

    @Override // defpackage.citr
    public final boolean k() {
        return this.e;
    }

    public final String toString() {
        Optional optional = this.k;
        Optional optional2 = this.j;
        Optional optional3 = this.i;
        IconCompat iconCompat = this.h;
        Optional optional4 = this.f;
        ConversationId conversationId = this.c;
        return "ConversationSpecificNotificationInfo{shortcutId=" + this.a + ", conversationId=" + this.b.toString() + ", mapiConversationId=" + conversationId.toString() + ", conversationLabel=" + this.d + ", isGroup=" + this.e + ", otherParticipantMessagingIdentity=" + String.valueOf(optional4) + ", shortcutRank=" + this.g + ", conversationIcon=" + String.valueOf(iconCompat) + ", bubbleClickInteractionInfo=" + String.valueOf(optional3) + ", bubbleSwipeInteractionInfo=" + String.valueOf(optional2) + ", peopleInConversation=" + String.valueOf(optional) + "}";
    }
}
