package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizu extends dizc {
    private static volatile dizu b;
    private static final Object e = new Object();
    public final dizt a;

    protected dizu() {
        super("Rbm__");
        this.a = new dizt(this);
    }

    public static dizu a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dizu();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    @Override // defpackage.dizc
    protected final engw b() {
        dizt diztVar = this.a;
        return engw.s(diztVar.a, diztVar.b);
    }
}
