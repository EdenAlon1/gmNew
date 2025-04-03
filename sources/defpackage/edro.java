package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edro {
    public abstract edps a();

    public abstract edrp b();

    public abstract Integer c();

    public abstract Integer d();

    public abstract void e(Integer num);

    public abstract void f(Integer num);

    public final edrp g() {
        edps a = a();
        if (d() == null && c() == null) {
            int b = a.b();
            if (b > 0) {
                f(Integer.valueOf(b));
            }
            int a2 = a.a();
            if (a2 > 0) {
                e(Integer.valueOf(a2));
            }
        }
        return b();
    }
}
