package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djaa extends dizc {
    public static volatile djaa a;
    private static final Object b = new Object();
    private final dizz e;

    private djaa() {
        super("RbmSpecificRcsOverrides__");
        this.e = new dizz(this);
    }

    public static void a() {
        synchronized (b) {
            if (a == null) {
                a = new djaa();
                a.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        return engw.r(this.e.a);
    }
}
