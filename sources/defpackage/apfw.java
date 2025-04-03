package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apfw extends apfy {
    public ConversationId a;
    public aqux b;
    public aqns c;
    public amtc d;
    public int e;
    public int f;
    private alyx h;
    private enin i;
    private enip j;
    private alxh k;
    private long l;
    private boolean m;
    private int n;
    private int o;
    private engw p;
    private azcr q;
    private eoxo r;
    private alxi s;
    private boolean t;
    private byte u;

    @Override // defpackage.apfy
    public final apfz a() {
        ConversationId conversationId;
        alyx alyxVar;
        alxh alxhVar;
        int i;
        engw engwVar;
        azcr azcrVar;
        eoxo eoxoVar;
        amtc amtcVar;
        alxi alxiVar;
        int i2;
        enin eninVar = this.i;
        if (eninVar != null) {
            this.j = eninVar.g();
        } else if (this.j == null) {
            this.j = enpd.a;
        }
        if (this.u == 31 && (conversationId = this.a) != null && (alyxVar = this.h) != null && (alxhVar = this.k) != null && (i = this.e) != 0 && (engwVar = this.p) != null && (azcrVar = this.q) != null && (eoxoVar = this.r) != null && (amtcVar = this.d) != null && (alxiVar = this.s) != null && (i2 = this.f) != 0) {
            return new apfx(conversationId, alyxVar, this.j, alxhVar, this.l, i, this.m, this.n, this.o, this.b, engwVar, azcrVar, this.c, eoxoVar, amtcVar, alxiVar, this.t, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if (this.h == null) {
            sb.append(" bestAvailableTransportFeatureSet");
        }
        if (this.k == null) {
            sb.append(" composeDisabledReason");
        }
        if ((this.u & 1) == 0) {
            sb.append(" maxMessageSizeBytes");
        }
        if (this.e == 0) {
            sb.append(" attachmentMode");
        }
        if ((this.u & 2) == 0) {
            sb.append(" locationSharingSupported");
        }
        if ((this.u & 4) == 0) {
            sb.append(" attachmentCountLimit");
        }
        if ((this.u & 8) == 0) {
            sb.append(" textLengthLimit");
        }
        if (this.p == null) {
            sb.append(" recipients");
        }
        if (this.q == null) {
            sb.append(" destinationToken");
        }
        if (this.r == null) {
            sb.append(" conversationProtocolConditions");
        }
        if (this.d == null) {
            sb.append(" palMode");
        }
        if (this.s == null) {
            sb.append(" conversationKind");
        }
        if ((this.u & 16) == 0) {
            sb.append(" wasRcsConversation");
        }
        if (this.f == 0) {
            sb.append(" encryptionAlgorithm");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.apfy
    public final enin b() {
        if (this.i == null) {
            if (this.j == null) {
                this.i = new enin();
            } else {
                enin eninVar = new enin();
                this.i = eninVar;
                eninVar.j(this.j);
                this.j = null;
            }
        }
        return this.i;
    }

    @Override // defpackage.apfy
    public final int c() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"attachmentMode\" has not been set");
    }

    @Override // defpackage.apfy
    public final void d(int i) {
        this.n = i;
        this.u = (byte) (this.u | 4);
    }

    @Override // defpackage.apfy
    public final void e(alyx alyxVar) {
        if (alyxVar == null) {
            throw new NullPointerException("Null bestAvailableTransportFeatureSet");
        }
        this.h = alyxVar;
    }

    @Override // defpackage.apfy
    public final void f(alxh alxhVar) {
        if (alxhVar == null) {
            throw new NullPointerException("Null composeDisabledReason");
        }
        this.k = alxhVar;
    }

    @Override // defpackage.apfy
    public final void g(alxi alxiVar) {
        if (alxiVar == null) {
            throw new NullPointerException("Null conversationKind");
        }
        this.s = alxiVar;
    }

    @Override // defpackage.apfy
    public final void h(eoxo eoxoVar) {
        if (eoxoVar == null) {
            throw new NullPointerException("Null conversationProtocolConditions");
        }
        this.r = eoxoVar;
    }

    @Override // defpackage.apfy
    public final void i(azcr azcrVar) {
        if (azcrVar == null) {
            throw new NullPointerException("Null destinationToken");
        }
        this.q = azcrVar;
    }

    @Override // defpackage.apfy
    public final void j(boolean z) {
        this.m = z;
        this.u = (byte) (this.u | 2);
    }

    @Override // defpackage.apfy
    public final void k(long j) {
        this.l = j;
        this.u = (byte) (this.u | 1);
    }

    @Override // defpackage.apfy
    public final void l(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null recipients");
        }
        this.p = engwVar;
    }

    @Override // defpackage.apfy
    public final void m(int i) {
        this.o = i;
        this.u = (byte) (this.u | 8);
    }

    @Override // defpackage.apfy
    public final void n(boolean z) {
        this.t = z;
        this.u = (byte) (this.u | 16);
    }
}
