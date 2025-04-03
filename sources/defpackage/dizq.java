package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizq extends dizc {
    private static volatile dizq b;
    private static final Object e = new Object();
    public final dizp a;

    private dizq() {
        super("MsrpSettings__");
        this.a = new dizp(this);
    }

    public static int a() {
        return ((Integer) c().a.b.a()).intValue();
    }

    public static dizq c() {
        if (b == null) {
            d();
        }
        return b;
    }

    static void d() {
        synchronized (e) {
            if (b == null) {
                b = new dizq();
                b.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) c().a.a.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) c().a.j.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) c().a.g.a()).booleanValue();
    }

    public static boolean q() {
        return ((Boolean) c().a.f.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        dizp dizpVar = this.a;
        return engw.z(dizpVar.a, dizpVar.b, dizpVar.c, dizpVar.e, dizpVar.f, dizpVar.g, dizpVar.h, dizpVar.i, dizpVar.j);
    }
}
