package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ram {
    public final rkc a;

    public ram() {
        this(250L);
    }

    public final Object a(Object obj, int i, int i2) {
        rkc rkcVar = this.a;
        ral a = ral.a(obj, i, i2);
        Object h = rkcVar.h(a);
        a.b();
        return h;
    }

    public final void b(Object obj, int i, int i2, Object obj2) {
        this.a.i(ral.a(obj, i, i2), obj2);
    }

    public ram(long j) {
        this.a = new rak(j);
    }
}
