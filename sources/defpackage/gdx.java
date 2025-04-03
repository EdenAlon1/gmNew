package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gdx(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static /* synthetic */ gdx d(gdx gdxVar, long j, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j = gdxVar.a;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = gdxVar.b;
        }
        long j5 = j2;
        long j6 = (i & 4) != 0 ? gdxVar.c : 0L;
        if ((i & 8) != 0) {
            j3 = gdxVar.d;
        }
        return gdxVar.c(j4, j5, j6, j3);
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final gdx c(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new gdx(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gdx)) {
            return false;
        }
        long j = this.a;
        gdx gdxVar = (gdx) obj;
        long j2 = gdxVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, gdxVar.b) && ffcp.a(this.c, gdxVar.c) && ffcp.a(this.d, gdxVar.d);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.d;
        return (((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j2);
    }
}
