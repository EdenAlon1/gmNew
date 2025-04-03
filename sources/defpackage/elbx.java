package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elbx {
    public final elci a;
    public final ffbr b;
    public final elae c;
    public final int d = 2;

    public elbx(elci elciVar, final ffbr ffbrVar, Set set) {
        this.a = elciVar;
        this.c = elae.d(set);
        this.b = new ffbr() { // from class: elbf
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return elae.e(elae.d((Set) ffbrVar.b()), elbx.this.c);
            }
        };
    }

    public final ekzm a(Class cls, String str) {
        return b(cls.getSimpleName() + ": " + str);
    }

    public final ekzm b(String str) {
        return this.a.b(str, (elae) this.b.b(), this.d);
    }

    public final ekzm c(String str, elae elaeVar) {
        return this.a.b(str, elae.e((elae) this.b.b(), elaeVar), this.d);
    }

    public final ekzm d(String str) {
        return c(str, elad.a);
    }

    public final ekzm e(long j, long j2) {
        return this.a.c((elae) this.b.b(), j, j2, this.d);
    }

    public final elav f(String str) {
        return !ekyf.v() ? g(str, elad.a) : new elav() { // from class: elbd
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        };
    }

    public final elas g(String str, elae elaeVar) {
        return this.a.d(str, elae.e((elae) this.b.b(), elaeVar), this.d);
    }
}
