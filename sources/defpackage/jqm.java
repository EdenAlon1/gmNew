package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jqm implements jqp {
    public abstract int a(int i);

    @Override // defpackage.jqp
    public final int b(int i) {
        return a(i);
    }

    @Override // defpackage.jqp
    public final int c(int i) {
        int a = a(i);
        if (a == -1 || a(a) == -1) {
            return -1;
        }
        return a;
    }

    public abstract int d(int i);

    @Override // defpackage.jqp
    public final int e(int i) {
        int d = d(i);
        if (d == -1 || d(d) == -1) {
            return -1;
        }
        return d;
    }

    @Override // defpackage.jqp
    public final int f(int i) {
        return d(i);
    }
}
