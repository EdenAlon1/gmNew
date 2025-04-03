package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizk extends dizc {
    private static volatile dizk b;
    private static final Object e = new Object();
    public final dizj a;

    private dizk() {
        super("Etouffee__");
        this.a = new dizj(this);
    }

    public static dizk a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dizk();
                b.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        return engw.r(this.a.a);
    }
}
