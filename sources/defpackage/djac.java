package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djac extends dizc {
    private static volatile djac b;
    private static final Object e = new Object();
    public final djab a;

    private djac() {
        super("RcsCpmFlags__");
        this.a = new djab(this);
    }

    public static djac a() {
        if (b == null) {
            c();
        }
        return b;
    }

    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new djac();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    public static boolean n() {
        return ((Boolean) a().a.d.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        djab djabVar = this.a;
        return engw.v(djabVar.a, djabVar.b, djabVar.c, djabVar.d, djabVar.e);
    }
}
