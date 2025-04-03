package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djak extends dizc {
    public static volatile djak a;
    private static final Object e = new Object();
    public final djaj b;

    private djak() {
        super("RcsSettings__");
        this.b = new djaj(this);
    }

    public static djak a() {
        if (a == null) {
            d();
        }
        return a;
    }

    public static String c() {
        return (String) a().b.c.a();
    }

    static void d() {
        synchronized (e) {
            if (a == null) {
                a = new djak();
                a.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) a().b.f.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) a().b.r.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) a().b.p.a()).booleanValue();
    }

    public static boolean q() {
        return ((Boolean) a().b.a.a()).booleanValue();
    }

    public static boolean r() {
        return ((Boolean) a().b.w.a()).booleanValue();
    }

    public static boolean s() {
        return ((Boolean) a().b.n.a()).booleanValue();
    }

    public static boolean t() {
        return ((Boolean) a().b.m.a()).booleanValue();
    }

    public static boolean u() {
        return ((Boolean) a().b.g.a()).booleanValue();
    }

    public static boolean v() {
        return ((Boolean) a().b.b.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) a().b.q.a()).booleanValue();
    }

    public static boolean x() {
        return ((Boolean) a().b.i.a()).booleanValue();
    }

    public static boolean y() {
        return ((Boolean) a().b.l.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djaj djajVar = this.b;
        return engw.C(djajVar.a, djajVar.b, djajVar.c, djajVar.d, djajVar.e, djajVar.h, djajVar.i, djajVar.j, djajVar.k, djajVar.l, djajVar.m, djajVar.n, djajVar.o, djajVar.p, djajVar.q, djajVar.r, djajVar.s, djajVar.t, djajVar.u, djajVar.v, djajVar.w, djajVar.x);
    }
}
