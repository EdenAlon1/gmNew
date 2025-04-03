package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amfn extends amij {
    private boolean A;
    private amtc B;
    private amny C;
    private boolean D;
    private boolean E;
    private boolean F;
    private ckte G;
    private cfmh H;
    private azcr I;
    public ConversationId a;
    public String b;
    public String c;
    public String d;
    public aqux e;
    public Uri f;
    public String g;
    public Instant h;
    public cjcn i;
    public ampp j;
    public boolean k;
    public boolean l;
    public short m;
    private boolean n;
    private byyt o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private ayhd w;
    private int x;
    private eoxn y;
    private long z;

    public amfn() {
    }

    @Override // defpackage.amij
    public final amik a() {
        ConversationId conversationId;
        byyt byytVar;
        ayhd ayhdVar;
        eoxn eoxnVar;
        cjcn cjcnVar;
        amtc amtcVar;
        amny amnyVar;
        ckte ckteVar;
        cfmh cfmhVar;
        azcr azcrVar;
        if (this.m == -1 && (conversationId = this.a) != null && (byytVar = this.o) != null && (ayhdVar = this.w) != null && (eoxnVar = this.y) != null && (cjcnVar = this.i) != null && (amtcVar = this.B) != null && (amnyVar = this.C) != null && (ckteVar = this.G) != null && (cfmhVar = this.H) != null && (azcrVar = this.I) != null) {
            return new amfo(conversationId, this.n, byytVar, this.p, this.q, this.r, this.s, this.t, this.b, this.u, this.v, ayhdVar, this.x, eoxnVar, this.c, this.d, this.e, this.f, this.z, this.g, this.h, cjcnVar, this.j, this.A, amtcVar, amnyVar, this.D, this.E, this.F, ckteVar, cfmhVar, azcrVar, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if ((this.m & 1) == 0) {
            sb.append(" nameIsAutomatic");
        }
        if (this.o == null) {
            sb.append(" archiveStatus");
        }
        if ((this.m & 2) == 0) {
            sb.append(" deleted");
        }
        if ((this.m & 4) == 0) {
            sb.append(" isUnread");
        }
        if ((this.m & 8) == 0) {
            sb.append(" isEncrypted");
        }
        if ((this.m & 16) == 0) {
            sb.append(" wasPreviouslyEncrypted");
        }
        if ((this.m & 32) == 0) {
            sb.append(" canRequestManualSatelliteConnection");
        }
        if ((this.m & 64) == 0) {
            sb.append(" conversationType");
        }
        if ((this.m & 128) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if (this.w == null) {
            sb.append(" errorState");
        }
        if ((this.m & 256) == 0) {
            sb.append(" joinState");
        }
        if (this.y == null) {
            sb.append(" sendMode");
        }
        if ((this.m & 512) == 0) {
            sb.append(" rcsChatSessionId");
        }
        if (this.i == null) {
            sb.append(" conversationMuteThreshold");
        }
        if ((this.m & 1024) == 0) {
            sb.append(" sessionAllowsRevocation");
        }
        if (this.B == null) {
            sb.append(" palMode");
        }
        if (this.C == null) {
            sb.append(" parentalApprovalStatus");
        }
        if ((this.m & 2048) == 0) {
            sb.append(" canRemovePeople");
        }
        if ((this.m & 4096) == 0) {
            sb.append(" canUpdateGroupName");
        }
        if ((this.m & 8192) == 0) {
            sb.append(" canUpdateGroupIcon");
        }
        if (this.G == null) {
            sb.append(" mmsGroupUpgradeStatus");
        }
        if (this.H == null) {
            sb.append(" encryptionProtocol");
        }
        if (this.I == null) {
            sb.append(" destinationToken");
        }
        if ((this.m & 16384) == 0) {
            sb.append(" longPressActionsEnabled");
        }
        if ((this.m & 32768) == 0) {
            sb.append(" shouldShowSimName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.amij
    public final void b(byyt byytVar) {
        if (byytVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.o = byytVar;
    }

    @Override // defpackage.amij
    public final void c(boolean z) {
        this.D = z;
        this.m = (short) (this.m | 2048);
    }

    @Override // defpackage.amij
    public final void d() {
        this.t = true;
        this.m = (short) (this.m | 32);
    }

    @Override // defpackage.amij
    public final void e(boolean z) {
        this.F = z;
        this.m = (short) (this.m | 8192);
    }

    @Override // defpackage.amij
    public final void f(boolean z) {
        this.E = z;
        this.m = (short) (this.m | 4096);
    }

    @Override // defpackage.amij
    public final void g(int i) {
        this.u = i;
        this.m = (short) (this.m | 64);
    }

    @Override // defpackage.amij
    public final void h(boolean z) {
        this.p = z;
        this.m = (short) (this.m | 2);
    }

    @Override // defpackage.amij
    public final void i(azcr azcrVar) {
        if (azcrVar == null) {
            throw new NullPointerException("Null destinationToken");
        }
        this.I = azcrVar;
    }

    @Override // defpackage.amij
    public final void j(cfmh cfmhVar) {
        if (cfmhVar == null) {
            throw new NullPointerException("Null encryptionProtocol");
        }
        this.H = cfmhVar;
    }

    @Override // defpackage.amij
    public final void k(ayhd ayhdVar) {
        if (ayhdVar == null) {
            throw new NullPointerException("Null errorState");
        }
        this.w = ayhdVar;
    }

    @Override // defpackage.amij
    public final void l(boolean z) {
        this.v = z;
        this.m = (short) (this.m | 128);
    }

    @Override // defpackage.amij
    public final void m(boolean z) {
        this.r = z;
        this.m = (short) (this.m | 8);
    }

    @Override // defpackage.amij
    public final void n(boolean z) {
        this.q = z;
        this.m = (short) (this.m | 4);
    }

    @Override // defpackage.amij
    public final void o(int i) {
        this.x = i;
        this.m = (short) (this.m | 256);
    }

    @Override // defpackage.amij
    public final void p(ckte ckteVar) {
        if (ckteVar == null) {
            throw new NullPointerException("Null mmsGroupUpgradeStatus");
        }
        this.G = ckteVar;
    }

    @Override // defpackage.amij
    public final void q(boolean z) {
        this.n = z;
        this.m = (short) (this.m | 1);
    }

    @Override // defpackage.amij
    public final void r(amtc amtcVar) {
        if (amtcVar == null) {
            throw new NullPointerException("Null palMode");
        }
        this.B = amtcVar;
    }

    @Override // defpackage.amij
    public final void s(amny amnyVar) {
        if (amnyVar == null) {
            throw new NullPointerException("Null parentalApprovalStatus");
        }
        this.C = amnyVar;
    }

    @Override // defpackage.amij
    public final void t(long j) {
        this.z = j;
        this.m = (short) (this.m | 512);
    }

    @Override // defpackage.amij
    public final void u(eoxn eoxnVar) {
        if (eoxnVar == null) {
            throw new NullPointerException("Null sendMode");
        }
        this.y = eoxnVar;
    }

    @Override // defpackage.amij
    public final void v(boolean z) {
        this.A = z;
        this.m = (short) (this.m | 1024);
    }

    @Override // defpackage.amij
    public final void w(boolean z) {
        this.s = z;
        this.m = (short) (this.m | 16);
    }

    public amfn(amik amikVar) {
        amfo amfoVar = (amfo) amikVar;
        this.a = amfoVar.a;
        this.n = amfoVar.b;
        this.o = amfoVar.c;
        this.p = amfoVar.d;
        this.q = amfoVar.e;
        this.r = amfoVar.f;
        this.s = amfoVar.g;
        this.t = amfoVar.h;
        this.b = amfoVar.i;
        this.u = amfoVar.j;
        this.v = amfoVar.k;
        this.w = amfoVar.l;
        this.x = amfoVar.m;
        this.y = amfoVar.n;
        this.c = amfoVar.o;
        this.d = amfoVar.p;
        this.e = amfoVar.q;
        this.f = amfoVar.r;
        this.z = amfoVar.s;
        this.g = amfoVar.t;
        this.h = amfoVar.u;
        this.i = amfoVar.v;
        this.j = amfoVar.w;
        this.A = amfoVar.x;
        this.B = amfoVar.y;
        this.C = amfoVar.z;
        this.D = amfoVar.A;
        this.E = amfoVar.B;
        this.F = amfoVar.C;
        this.G = amfoVar.D;
        this.H = amfoVar.E;
        this.I = amfoVar.F;
        this.k = amfoVar.G;
        this.l = amfoVar.H;
        this.m = (short) -1;
    }
}
