package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyo extends tyr {
    public ConversationIdType a;
    public String b;
    public String c;
    public String d;
    public String f;
    public String g;
    private byyt h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private long o;
    private int p;
    private boolean q;
    private cpxu r;
    private boolean s;
    private ayhd t;
    private boolean u;
    private amny v;
    private short x;
    public Optional e = Optional.empty();
    private Optional w = Optional.empty();

    @Override // defpackage.tyr
    public final tys a() {
        byyt byytVar;
        ConversationIdType conversationIdType;
        cpxu cpxuVar;
        ayhd ayhdVar;
        amny amnyVar;
        if (this.x == 2047 && (byytVar = this.h) != null && (conversationIdType = this.a) != null && (cpxuVar = this.r) != null && (ayhdVar = this.t) != null && (amnyVar = this.v) != null) {
            return new typ(byytVar, conversationIdType, this.i, this.j, this.k, this.l, this.m, this.b, this.c, this.d, this.n, this.e, this.o, this.p, this.q, this.f, this.g, cpxuVar, this.s, ayhdVar, this.u, amnyVar, this.w);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" archiveStatus");
        }
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if ((this.x & 1) == 0) {
            sb.append(" conversationType");
        }
        if ((this.x & 2) == 0) {
            sb.append(" shouldEncryptDrafts");
        }
        if ((this.x & 4) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if ((this.x & 8) == 0) {
            sb.append(" includeEmailAddress");
        }
        if ((this.x & 16) == 0) {
            sb.append(" joinState");
        }
        if ((this.x & 32) == 0) {
            sb.append(" nameIsAutomatic");
        }
        if ((this.x & 64) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.x & 128) == 0) {
            sb.append(" sendMode");
        }
        if ((this.x & 256) == 0) {
            sb.append(" isValid");
        }
        if (this.r == null) {
            sb.append(" smsThreadId");
        }
        if ((this.x & 512) == 0) {
            sb.append(" awaitingReverseSync");
        }
        if (this.t == null) {
            sb.append(" errorState");
        }
        if ((this.x & 1024) == 0) {
            sb.append(" hasBeenE2ee");
        }
        if (this.v == null) {
            sb.append(" conversationParentalApprovalStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.tyr
    public final void b(byyt byytVar) {
        if (byytVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.h = byytVar;
    }

    @Override // defpackage.tyr
    public final void c(boolean z) {
        this.s = z;
        this.x = (short) (this.x | 512);
    }

    @Override // defpackage.tyr
    public final void d(amny amnyVar) {
        if (amnyVar == null) {
            throw new NullPointerException("Null conversationParentalApprovalStatus");
        }
        this.v = amnyVar;
    }

    @Override // defpackage.tyr
    public final void e(int i) {
        this.i = i;
        this.x = (short) (this.x | 1);
    }

    @Override // defpackage.tyr
    public final void f(ayhd ayhdVar) {
        if (ayhdVar == null) {
            throw new NullPointerException("Null errorState");
        }
        this.t = ayhdVar;
    }

    @Override // defpackage.tyr
    public final void g(boolean z) {
        this.u = z;
        this.x = (short) (this.x | 1024);
    }

    @Override // defpackage.tyr
    public final void h(boolean z) {
        this.k = z;
        this.x = (short) (this.x | 4);
    }

    @Override // defpackage.tyr
    public final void i(boolean z) {
        this.l = z;
        this.x = (short) (this.x | 8);
    }

    @Override // defpackage.tyr
    public final void j(boolean z) {
        this.q = z;
        this.x = (short) (this.x | 256);
    }

    @Override // defpackage.tyr
    public final void k(int i) {
        this.m = i;
        this.x = (short) (this.x | 16);
    }

    @Override // defpackage.tyr
    public final void l(boolean z) {
        this.n = z;
        this.x = (short) (this.x | 32);
    }

    @Override // defpackage.tyr
    public final void m(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null rcsGroupLastSyncTimestamp");
        }
        this.w = optional;
    }

    @Override // defpackage.tyr
    public final void n(long j) {
        this.o = j;
        this.x = (short) (this.x | 64);
    }

    @Override // defpackage.tyr
    public final void o(int i) {
        this.p = i;
        this.x = (short) (this.x | 128);
    }

    @Override // defpackage.tyr
    public final void p(boolean z) {
        this.j = z;
        this.x = (short) (this.x | 2);
    }

    @Override // defpackage.tyr
    public final void q(cpxu cpxuVar) {
        if (cpxuVar == null) {
            throw new NullPointerException("Null smsThreadId");
        }
        this.r = cpxuVar;
    }
}
