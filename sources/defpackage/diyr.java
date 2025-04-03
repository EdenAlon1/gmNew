package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyr extends dizc {
    private static volatile diyr e;
    public final diyq b;
    private static final Object f = new Object();
    public static final diyy a = dizd.a(149510230);

    private diyr() {
        super("BusinessInfoRetrieval__");
        this.b = new diyq(this);
    }

    public static diyr a() {
        if (e == null) {
            c();
        }
        return e;
    }

    static void c() {
        synchronized (f) {
            if (e == null) {
                e = new diyr();
                e.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().b.a.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        diyq diyqVar = this.b;
        return engw.C(diyqVar.a, diyqVar.b, diyqVar.c, diyqVar.d, diyqVar.e, diyqVar.f, diyqVar.g, diyqVar.h, diyqVar.i, diyqVar.j, diyqVar.k, diyqVar.l, new diyy[0]);
    }
}
