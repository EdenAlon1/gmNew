package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ciso extends citq {
    public String a;
    public ConversationIdType b;
    public IconCompat c;
    private ConversationId g;
    private String h;
    private boolean i;
    private int k;
    private byte l;
    private Optional j = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();

    @Override // defpackage.citq
    public final citr a() {
        String str;
        ConversationIdType conversationIdType;
        ConversationId conversationId;
        String str2;
        if (this.l == 3 && (str = this.a) != null && (conversationIdType = this.b) != null && (conversationId = this.g) != null && (str2 = this.h) != null) {
            return new cisp(str, conversationIdType, conversationId, str2, this.i, this.j, this.k, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" shortcutId");
        }
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if (this.g == null) {
            sb.append(" mapiConversationId");
        }
        if (this.h == null) {
            sb.append(" conversationLabel");
        }
        if ((this.l & 1) == 0) {
            sb.append(" isGroup");
        }
        if ((this.l & 2) == 0) {
            sb.append(" shortcutRank");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.citq
    public final void b(Optional optional) {
        this.d = optional;
    }

    @Override // defpackage.citq
    public final void c(IconCompat iconCompat) {
        this.c = iconCompat;
    }

    @Override // defpackage.citq
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null conversationLabel");
        }
        this.h = str;
    }

    @Override // defpackage.citq
    public final void e(boolean z) {
        this.i = z;
        this.l = (byte) (this.l | 1);
    }

    @Override // defpackage.citq
    public final void f(ConversationId conversationId) {
        if (conversationId == null) {
            throw new NullPointerException("Null mapiConversationId");
        }
        this.g = conversationId;
    }

    @Override // defpackage.citq
    public final void g(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null otherParticipantMessagingIdentity");
        }
        this.j = optional;
    }

    @Override // defpackage.citq
    public final void h(int i) {
        this.k = i;
        this.l = (byte) (this.l | 2);
    }
}
