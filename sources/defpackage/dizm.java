package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizm extends dizc {
    private static volatile dizm b;
    private static final Object e = new Object();
    public final dizl a;

    private dizm() {
        super("InstanceIdInProvisioning__");
        this.a = new dizl(this);
    }

    public static dizm a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dizm();
                b.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        return engw.r(this.a.a);
    }
}
