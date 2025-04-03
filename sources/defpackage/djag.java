package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djag extends dizc {
    private static volatile djag b;
    private static final Object e = new Object();
    public final djaf a;

    private djag() {
        super("RcsGroupManagementFlags__");
        this.a = new djaf(this);
    }

    public static djag a() {
        if (b == null) {
            c();
        }
        return b;
    }

    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new djag();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    public static boolean n() {
        return ((Boolean) a().a.c.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djaf djafVar = this.a;
        return engw.t(djafVar.a, djafVar.b, djafVar.c);
    }
}
