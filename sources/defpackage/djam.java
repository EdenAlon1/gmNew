package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djam extends dizc {
    private static volatile djam b;
    private static final Object e = new Object();
    public final djal a;

    protected djam() {
        super("SimStateTrackerSettings__");
        this.a = new djal(this);
    }

    public static djam a() {
        if (b == null) {
            c();
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("SimStateTrackerSettings flags are not initialized!");
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new djam();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.d.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djal djalVar = this.a;
        return engw.v(djalVar.a, djalVar.b, djalVar.c, djalVar.d, djalVar.e);
    }
}
