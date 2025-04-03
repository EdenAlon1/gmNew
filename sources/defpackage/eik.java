package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eik {
    public abstract eln b();

    public final int c() {
        return b().b;
    }

    public final Object d(int i) {
        ehv a = b().a(i);
        return ((eij) a.c).b().invoke(Integer.valueOf(i - a.a));
    }

    public final Object e(int i) {
        Object invoke;
        ehv a = b().a(i);
        int i2 = i - a.a;
        ffji a2 = ((eij) a.c).a();
        return (a2 == null || (invoke = a2.invoke(Integer.valueOf(i2))) == null) ? new eht(i) : invoke;
    }
}
