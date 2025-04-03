package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizs extends dizc {
    private static volatile dizs a;
    private static final Object b = new Object();
    private final dizr e;

    private dizs() {
        super("MultiSimSettings__");
        this.e = new dizr(this);
    }

    public static dizs a() {
        if (a == null) {
            c();
        }
        return a;
    }

    static void c() {
        synchronized (b) {
            if (a == null) {
                a = new dizs();
                a.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        return engw.r(this.e.a);
    }
}
