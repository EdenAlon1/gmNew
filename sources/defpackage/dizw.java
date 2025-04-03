package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizw extends dizc {
    private static volatile dizw b;
    private static final Object e = new Object();
    public final dizv a;

    private dizw() {
        super("RbmInteropVodafonePlatform__");
        this.a = new dizv(this);
    }

    public static dizw a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dizw();
                b.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        dizv dizvVar = this.a;
        return engw.s(dizvVar.a, dizvVar.b);
    }
}
