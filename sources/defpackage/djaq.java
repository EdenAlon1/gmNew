package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djaq extends dizc {
    private static volatile djaq a;
    private static final Object b = new Object();
    private final djap e;

    private djaq() {
        super("SmsSharing__");
        this.e = new djap(this);
    }

    public static djaq a() {
        if (a == null) {
            c();
        }
        return a;
    }

    static void c() {
        synchronized (b) {
            if (a == null) {
                a = new djaq();
                a.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().e.a.a()).booleanValue();
    }

    public static boolean n() {
        return ((Boolean) a().e.b.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) a().e.c.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) a().e.d.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djap djapVar = this.e;
        return engw.u(djapVar.a, djapVar.b, djapVar.c, djapVar.d);
    }
}
