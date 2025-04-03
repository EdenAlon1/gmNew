package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizi extends dizc {
    private static volatile dizi b;
    private static final Object e = new Object();
    public final dizh a;

    private dizi() {
        super("DiagnosticSettings__");
        this.a = new dizh(this);
    }

    public static dizi a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dizi();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.d.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        dizh dizhVar = this.a;
        return engw.v(dizhVar.a, dizhVar.b, dizhVar.c, dizhVar.d, dizhVar.e);
    }
}
