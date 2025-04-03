package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrs {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public lph g = lph.a;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
    }

    public final int a(int i) {
        return this.g.a(i).b;
    }

    public final int b(long j) {
        lph lphVar = this.g;
        long j2 = this.d;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = lphVar.b;
        int i2 = lphVar.b;
        return -1;
    }

    public final int c(long j) {
        lph lphVar = this.g;
        int i = lphVar.b;
        lphVar.b();
        return -1;
    }

    public final int d(int i) {
        return this.g.a(i).a();
    }

    public final long e(int i, int i2) {
        lpg a = this.g.a(i);
        if (a.b != -1) {
            return a.f[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            lrs lrsVar = (lrs) obj;
            Object obj2 = this.a;
            Object obj3 = lrsVar.a;
            int i = lvf.a;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.b, lrsVar.b) && this.c == lrsVar.c && this.d == lrsVar.d && this.e == lrsVar.e && this.f == lrsVar.f && Objects.equals(this.g, lrsVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return lvf.z(this.e);
    }

    public final boolean g(int i) {
        return !this.g.a(i).c();
    }

    public final void h(int i) {
        long j = this.g.a(i).a;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j = this.d;
        long j2 = this.e;
        return (((((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final void i() {
        long j = this.g.c;
    }

    public final void j() {
        int i = this.g.d;
    }

    public final void k(int i) {
        boolean z = this.g.a(i).i;
    }

    public final void l(Object obj, Object obj2, int i, long j, long j2, lph lphVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = lphVar;
        this.f = z;
    }

    public final void m() {
        int i = this.g.b;
    }

    public final void n(Object obj, Object obj2, long j, long j2) {
        l(obj, obj2, 0, j, j2, lph.a, false);
    }

    public final void o(int i) {
        m();
        if (i == -1) {
            this.g.b();
        }
    }
}
