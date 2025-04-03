package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhf {
    public final mtl a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public mhf(mtl mtlVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        lti.a(!z3 || z);
        lti.a(!z2 || z);
        lti.a(true);
        this.a = mtlVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = false;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final mhf a(long j) {
        return j == this.c ? this : new mhf(this.a, this.b, j, this.d, this.e, this.h, this.i, this.j);
    }

    public final mhf b(long j) {
        return j == this.b ? this : new mhf(this.a, j, this.c, this.d, this.e, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mhf mhfVar = (mhf) obj;
            if (this.b == mhfVar.b && this.c == mhfVar.c && this.d == mhfVar.d && this.e == mhfVar.e && this.h == mhfVar.h && this.i == mhfVar.i && this.j == mhfVar.j) {
                mtl mtlVar = this.a;
                mtl mtlVar2 = mhfVar.a;
                int i = lvf.a;
                if (Objects.equals(mtlVar, mtlVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((((((((hashCode * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
