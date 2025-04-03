package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtsd {
    public static dtsb m() {
        dtqs dtqsVar = new dtqs();
        dtqsVar.b = new Supplier() { // from class: dtrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        };
        dtqsVar.g(false);
        dtqsVar.e = 8;
        dtqsVar.d(false);
        dtqsVar.e(false);
        dtqsVar.l(false);
        dtqsVar.k(false);
        dtqsVar.c = new dtsc() { // from class: dtsa
        };
        dtqsVar.f(false);
        dtqsVar.i(0);
        return dtqsVar;
    }

    public abstract int a();

    public abstract dtsc b();

    public abstract String c();

    public abstract Supplier d();

    public abstract Supplier e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l();
}
