package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djas extends dizc {
    public static final /* synthetic */ int b = 0;
    private static volatile djas e;
    private static final Object f = new Object();
    public final djar a;

    private djas() {
        super("SocketSettings__");
        this.a = new djar(this);
    }

    public static long a() {
        return ((Long) c().a.a.a()).longValue();
    }

    public static djas c() {
        if (e == null) {
            d();
        }
        return e;
    }

    static void d() {
        synchronized (f) {
            if (e == null) {
                e = new djas();
                e.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djar djarVar = this.a;
        return engw.u(djarVar.a, djarVar.b, djarVar.c, djarVar.d);
    }
}
