package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djae extends dizc {
    private static volatile djae b;
    private static final Object e = new Object();
    public final djad a;

    protected djae() {
        super("RcsFileTransfer__");
        this.a = new djad(this);
    }

    public static int a() {
        return ((Integer) c().a.a.a()).intValue();
    }

    public static djae c() {
        if (b == null) {
            d();
        }
        return b;
    }

    static void d() {
        synchronized (e) {
            if (b == null) {
                b = new djae();
                b.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) c().a.c.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) c().a.d.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djad djadVar = this.a;
        return engw.u(djadVar.a, djadVar.b, djadVar.c, djadVar.d);
    }
}
