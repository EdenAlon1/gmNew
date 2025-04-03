package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmg extends cbnh {
    public ConversationIdType a;
    public String b;
    public String c;
    public fbuk d;
    public String e;
    private MessageIdType f;
    private boolean g;
    private long h;
    private Optional i = Optional.empty();
    private int j;
    private fbuk k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private Long q;
    private boolean r;
    private byte s;

    @Override // defpackage.cbnh
    public final cbnh a(MessageIdType messageIdType) {
        this.f = messageIdType;
        return this;
    }

    @Override // defpackage.cbnh
    public final cbni b() {
        MessageIdType messageIdType;
        ConversationIdType conversationIdType;
        if (this.s == 15 && (messageIdType = this.f) != null && (conversationIdType = this.a) != null) {
            return new cbmh(messageIdType, conversationIdType, this.b, this.g, this.h, this.c, this.i, this.j, this.d, this.e, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" messageId");
        }
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if ((this.s & 1) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if ((this.s & 2) == 0) {
            sb.append(" receivedTimestamp");
        }
        if ((this.s & 4) == 0) {
            sb.append(" participantSubId");
        }
        if ((this.s & 8) == 0) {
            sb.append(" isStarred");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cbnh
    public final void c(ConversationIdType conversationIdType) {
        this.a = conversationIdType;
    }

    @Override // defpackage.cbnh
    public final void d(boolean z) {
        this.g = z;
        this.s = (byte) (this.s | 1);
    }

    @Override // defpackage.cbnh
    public final void e(boolean z) {
        this.r = z;
        this.s = (byte) (this.s | 8);
    }

    @Override // defpackage.cbnh
    public final void f(fbuk fbukVar) {
        this.k = fbukVar;
    }

    @Override // defpackage.cbnh
    public final void g(String str) {
        this.l = str;
    }

    @Override // defpackage.cbnh
    public final void h(String str) {
        this.o = str;
    }

    @Override // defpackage.cbnh
    public final void i(Long l) {
        this.q = l;
    }

    @Override // defpackage.cbnh
    public final void j(String str) {
        this.p = str;
    }

    @Override // defpackage.cbnh
    public final void k(String str) {
        this.m = str;
    }

    @Override // defpackage.cbnh
    public final void l(String str) {
        this.n = str;
    }

    @Override // defpackage.cbnh
    public final void m(String str) {
        this.c = str;
    }

    @Override // defpackage.cbnh
    public final void n(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null participantMessagingIdentity");
        }
        this.i = optional;
    }

    @Override // defpackage.cbnh
    public final void o(String str) {
        this.b = str;
    }

    @Override // defpackage.cbnh
    public final void p(int i) {
        this.j = i;
        this.s = (byte) (this.s | 4);
    }

    @Override // defpackage.cbnh
    public final void q(long j) {
        this.h = j;
        this.s = (byte) (this.s | 2);
    }
}
