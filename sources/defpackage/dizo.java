package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizo extends dizc {
    private static volatile dizo b;
    private static final Object e = new Object();
    public final dizn a;

    private dizo() {
        super("JibeServiceLifecyclePercents__");
        this.a = new dizn(this);
    }

    public static dizo a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dizo();
                b.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        dizn diznVar = this.a;
        return engw.w(diznVar.a, diznVar.b, diznVar.c, diznVar.d, diznVar.e, diznVar.f);
    }
}
