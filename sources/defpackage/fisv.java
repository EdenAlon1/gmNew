package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisv extends fisz {
    final fird a;
    final firk b;
    final firl c;
    final boolean d;
    final firl e;
    final firl f;

    public fisv(fird firdVar, firk firkVar, firl firlVar, firl firlVar2, firl firlVar3) {
        super(firdVar.p());
        if (!firdVar.u()) {
            throw new IllegalArgumentException();
        }
        this.a = firdVar;
        this.b = firkVar;
        this.c = firlVar;
        this.d = fisx.O(firlVar);
        this.e = firlVar2;
        this.f = firlVar3;
    }

    private final int x(long j) {
        int a = this.b.a(j);
        long j2 = a;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return a;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        return this.a.a(this.b.d(j));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.fird
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long e(long j, int i) {
        if (this.d) {
            long x = x(j);
            return this.a.e(j + x, i) - x;
        }
        return this.b.m(this.a.e(this.b.d(j), i), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fisv) {
            fisv fisvVar = (fisv) obj;
            if (this.a.equals(fisvVar.a) && this.b.equals(fisvVar.b) && this.c.equals(fisvVar.c) && this.e.equals(fisvVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long f(long j) {
        return this.a.f(this.b.d(j));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long g(long j) {
        if (this.d) {
            long x = x(j);
            return this.a.g(j + x) - x;
        }
        return this.b.m(this.a.g(this.b.d(j)), j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        long h = this.a.h(this.b.d(j), i);
        long m = this.b.m(h, j);
        if (a(m) == i) {
            return m;
        }
        firp firpVar = new firp(h, this.b.c);
        firo firoVar = new firo(this.a.p(), Integer.valueOf(i), firpVar.getMessage());
        firoVar.initCause(firpVar);
        throw firoVar;
    }

    public final int hashCode() {
        firk firkVar = this.b;
        return firkVar.hashCode() ^ this.a.hashCode();
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long i(long j, String str, Locale locale) {
        return this.b.m(this.a.i(this.b.d(j), str, locale), j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String k(int i, Locale locale) {
        return this.a.k(i, locale);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String l(long j, Locale locale) {
        return this.a.l(this.b.d(j), locale);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String m(int i, Locale locale) {
        return this.a.m(i, locale);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String n(long j, Locale locale) {
        return this.a.n(this.b.d(j), locale);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl q() {
        return this.c;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl r() {
        return this.f;
    }

    @Override // defpackage.fird
    public final firl s() {
        return this.e;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        return this.a.t(this.b.d(j));
    }

    @Override // defpackage.fird
    public final void v() {
    }
}
