package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizy extends dizc {
    private static volatile dizy a;
    private static final Object b = new Object();
    private final dizx e;

    private dizy() {
        super("RbmRichCards__");
        this.e = new dizx(this);
    }

    public static dizy a() {
        if (a == null) {
            c();
        }
        return a;
    }

    static void c() {
        synchronized (b) {
            if (a == null) {
                a = new dizy();
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

    @Override // defpackage.dizc
    protected final engw b() {
        dizx dizxVar = this.e;
        return engw.s(dizxVar.a, dizxVar.b);
    }
}
