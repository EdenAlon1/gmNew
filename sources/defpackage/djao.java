package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djao extends dizc {
    private static volatile djao b;
    private static final Object e = new Object();
    public final djan a;

    private djao() {
        super("SipSettings__");
        this.a = new djan(this);
    }

    public static long a() {
        return ((Long) p().a.J.a()).longValue();
    }

    public static long c() {
        return ((Long) p().a.I.a()).longValue();
    }

    public static long d() {
        return ((Long) p().a.G.a()).longValue();
    }

    public static long n() {
        return ((Long) p().a.F.a()).longValue();
    }

    public static long o() {
        return ((Long) p().a.t.a()).longValue();
    }

    public static djao p() {
        if (b == null) {
            s();
        }
        return b;
    }

    public static String q() {
        return (String) p().a.M.a();
    }

    public static String r() {
        return (String) p().a.w.a();
    }

    static void s() {
        synchronized (e) {
            if (b == null) {
                b = new djao();
                b.l();
            }
        }
    }

    public static boolean t() {
        return ((Boolean) p().a.O.a()).booleanValue();
    }

    public static boolean u() {
        return ((Boolean) p().a.j.a()).booleanValue();
    }

    public static boolean v() {
        return ((Boolean) p().a.n.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) p().a.L.a()).booleanValue();
    }

    public static boolean x() {
        return ((Boolean) p().a.l.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djan djanVar = this.a;
        return engw.C(djanVar.a, djanVar.b, djanVar.c, djanVar.d, djanVar.e, djanVar.f, djanVar.g, djanVar.h, djanVar.i, djanVar.j, djanVar.k, djanVar.l, djanVar.m, djanVar.n, djanVar.o, djanVar.p, djanVar.q, djanVar.r, djanVar.s, djanVar.t, djanVar.u, djanVar.v, djanVar.w, djanVar.x, djanVar.y, djanVar.z, djanVar.A, djanVar.B, djanVar.C, djanVar.D, djanVar.E, djanVar.F, djanVar.G, djanVar.H, djanVar.I, djanVar.J, djanVar.K, djanVar.L, djanVar.M, djanVar.N, djanVar.O);
    }
}
