package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idl extends ibq {
    public final long a;

    public idl(long j) {
        this.a = j;
    }

    @Override // defpackage.ibq
    public final void a(long j, ict ictVar, float f) {
        long f2;
        ictVar.i(1.0f);
        if (f == 1.0f) {
            f2 = this.a;
        } else {
            long j2 = this.a;
            f2 = iby.f(ibw.d(j2), ibw.c(j2), ibw.b(j2), ibw.a(j2) * f, ibw.f(j2));
        }
        ictVar.k(f2);
        if (((iba) ictVar).c != null) {
            ictVar.n(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idl)) {
            return false;
        }
        long j = this.a;
        long j2 = ((idl) obj).a;
        long j3 = ibw.a;
        return ffcp.a(j, j2);
    }

    public final int hashCode() {
        long j = ibw.a;
        return ffco.a(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) ibw.g(this.a)) + ')';
    }
}
