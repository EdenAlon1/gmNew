package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyn implements dyh {
    public final long a;
    private final jzn b;
    private final /* synthetic */ dyi c = dyi.a;

    public dyn(jzn jznVar, long j) {
        this.b = jznVar;
        this.a = j;
    }

    @Override // defpackage.dyh
    public final hvi a(hvi hviVar, huo huoVar) {
        return this.c.a(hviVar, huoVar);
    }

    @Override // defpackage.dyh
    public final hvi b(hvi hviVar) {
        return this.c.b(hviVar);
    }

    public final float c() {
        long j = this.a;
        if (jzk.h(j)) {
            return this.b.ek(jzk.a(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final float d() {
        long j = this.a;
        if (jzk.i(j)) {
            return this.b.ek(jzk.b(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyn)) {
            return false;
        }
        dyn dynVar = (dyn) obj;
        return ffkj.e(this.b, dynVar.b) && jzk.g(this.a, dynVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + jzi.a(this.a);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.b + ", constraints=" + ((Object) jzk.e(this.a)) + ')';
    }
}
