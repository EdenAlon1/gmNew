package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelu extends aelx {
    public Integer A;
    public CharSequence B;
    public String C;
    public String D;
    public String E;
    public String F;
    public Integer G;
    public Integer H;
    public enip I;
    public Boolean J;
    public String K;
    public Integer L;
    public int M;
    private aeki N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    public String a;
    private boolean aa;
    private boolean ab;
    public Typeface b;
    public Integer c;
    public Integer d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Typeface j;
    public Typeface k;
    public Typeface l;
    public Long m;
    public String n;
    public Integer o;
    public Integer p;
    public Integer q;
    public String r;
    public String s;
    public boolean t;
    public Integer u;
    public boolean v;
    public bduq w;
    public String x;
    public Integer y;
    public Integer z;

    public aelu() {
    }

    @Override // defpackage.aelx
    public final aely a() {
        aeki aekiVar;
        if (this.M == 131071 && (aekiVar = this.N) != null) {
            return new aelv(aekiVar, this.a, this.b, this.c, this.d, this.O, this.e, this.f, this.g, this.h, this.i, this.P, this.Q, this.R, this.S, this.T, this.j, this.k, this.l, this.U, this.m, this.V, this.W, this.n, this.o, this.p, this.q, this.X, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.Y, this.Z, this.B, this.aa, this.ab, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
        }
        StringBuilder sb = new StringBuilder();
        if (this.N == null) {
            sb.append(" bindData");
        }
        if ((this.M & 1) == 0) {
            sb.append(" typefaceStyle");
        }
        if ((this.M & 2) == 0) {
            sb.append(" maxLines");
        }
        if ((this.M & 4) == 0) {
            sb.append(" subjectVisibility");
        }
        if ((this.M & 8) == 0) {
            sb.append(" incoming");
        }
        if ((this.M & 16) == 0) {
            sb.append(" read");
        }
        if ((this.M & 32) == 0) {
            sb.append(" notificationBellVisibility");
        }
        if ((this.M & 64) == 0) {
            sb.append(" workProfileIconVisibility");
        }
        if ((this.M & 128) == 0) {
            sb.append(" containsVerifiedSmsParticipant");
        }
        if ((this.M & 256) == 0) {
            sb.append(" isReminderTextVisible");
        }
        if ((this.M & 512) == 0) {
            sb.append(" isReminderIconVisible");
        }
        if ((this.M & 1024) == 0) {
            sb.append(" isNudged");
        }
        if ((this.M & 2048) == 0) {
            sb.append(" isDarkMode");
        }
        if ((this.M & 4096) == 0) {
            sb.append(" addRtlPaddingAndShadow");
        }
        if ((this.M & 8192) == 0) {
            sb.append(" hasMediaPreviewVisible");
        }
        if ((this.M & 16384) == 0) {
            sb.append(" unreadBadgeVisibility");
        }
        if ((this.M & 32768) == 0) {
            sb.append(" pinIconVisibility");
        }
        if ((this.M & 65536) == 0) {
            sb.append(" isBirthday");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aelx
    public final void b(aeki aekiVar) {
        if (aekiVar == null) {
            throw new NullPointerException("Null bindData");
        }
        this.N = aekiVar;
    }

    @Override // defpackage.aelx
    public final void c(boolean z) {
        this.U = z;
        this.M |= 128;
    }

    @Override // defpackage.aelx
    public final void d(boolean z) {
        this.Y = z;
        this.M |= 8192;
    }

    @Override // defpackage.aelx
    public final void e(boolean z) {
        this.Q = z;
        this.M |= 8;
    }

    @Override // defpackage.aelx
    public final void f(boolean z) {
        this.ab = z;
        this.M |= 65536;
    }

    @Override // defpackage.aelx
    public final void g(boolean z) {
        this.X = z;
        this.M |= 1024;
    }

    @Override // defpackage.aelx
    public final void h(boolean z) {
        this.W = z;
        this.M |= 512;
    }

    @Override // defpackage.aelx
    public final void i(boolean z) {
        this.V = z;
        this.M |= 256;
    }

    @Override // defpackage.aelx
    public final void j() {
        this.S = 8;
        this.M |= 32;
    }

    @Override // defpackage.aelx
    public final void k(boolean z) {
        this.aa = z;
        this.M |= 32768;
    }

    @Override // defpackage.aelx
    public final void l(boolean z) {
        this.R = z;
        this.M |= 16;
    }

    @Override // defpackage.aelx
    public final void m(int i) {
        this.P = i;
        this.M |= 4;
    }

    @Override // defpackage.aelx
    public final void n(int i) {
        this.O = i;
        this.M |= 1;
    }

    @Override // defpackage.aelx
    public final void o(int i) {
        this.Z = i;
        this.M |= 16384;
    }

    @Override // defpackage.aelx
    public final void p(int i) {
        this.T = i;
        this.M |= 64;
    }

    public aelu(aely aelyVar) {
        aelv aelvVar = (aelv) aelyVar;
        this.N = aelvVar.a;
        this.a = aelvVar.b;
        this.b = aelvVar.c;
        this.c = aelvVar.d;
        this.d = aelvVar.e;
        this.O = aelvVar.f;
        this.e = aelvVar.g;
        this.f = aelvVar.h;
        this.g = aelvVar.i;
        this.h = aelvVar.j;
        this.i = aelvVar.k;
        this.P = aelvVar.l;
        this.Q = aelvVar.m;
        this.R = aelvVar.n;
        this.S = aelvVar.o;
        this.T = aelvVar.p;
        this.j = aelvVar.q;
        this.k = aelvVar.r;
        this.l = aelvVar.s;
        this.U = aelvVar.t;
        this.m = aelvVar.u;
        this.V = aelvVar.v;
        this.W = aelvVar.w;
        this.n = aelvVar.x;
        this.o = aelvVar.y;
        this.p = aelvVar.z;
        this.q = aelvVar.A;
        this.X = aelvVar.B;
        this.r = aelvVar.C;
        this.s = aelvVar.D;
        this.t = aelvVar.E;
        this.u = aelvVar.F;
        this.v = aelvVar.G;
        this.w = aelvVar.H;
        this.x = aelvVar.I;
        this.y = aelvVar.J;
        this.z = aelvVar.K;
        this.A = aelvVar.L;
        this.Y = aelvVar.M;
        this.Z = aelvVar.N;
        this.B = aelvVar.O;
        this.aa = aelvVar.P;
        this.ab = aelvVar.Q;
        this.C = aelvVar.R;
        this.D = aelvVar.S;
        this.E = aelvVar.T;
        this.F = aelvVar.U;
        this.G = aelvVar.V;
        this.H = aelvVar.W;
        this.I = aelvVar.X;
        this.J = aelvVar.Y;
        this.K = aelvVar.Z;
        this.L = aelvVar.aa;
        this.M = 131071;
    }
}
