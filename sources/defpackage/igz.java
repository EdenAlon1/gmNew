package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igz {
    public static final igy a;
    public static int b;
    public static final Object c;
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final iih i;
    public final long j;
    public final int k;
    public final boolean l;
    public final int m;

    static {
        igy igyVar = new igy();
        a = igyVar;
        c = igyVar;
    }

    public igz(String str, float f, float f2, float f3, float f4, iih iihVar, long j, int i, boolean z, int i2) {
        this.d = str;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = iihVar;
        this.j = j;
        this.k = i;
        this.l = z;
        this.m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igz)) {
            return false;
        }
        igz igzVar = (igz) obj;
        if (!ffkj.e(this.d, igzVar.d) || !jzq.b(this.e, igzVar.e) || !jzq.b(this.f, igzVar.f) || this.g != igzVar.g || this.h != igzVar.h || !ffkj.e(this.i, igzVar.i)) {
            return false;
        }
        long j = this.j;
        long j2 = igzVar.j;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ibk.b(this.k, igzVar.k) && this.l == igzVar.l;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.d.hashCode() * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i.hashCode();
        long j = ibw.a;
        return (((((hashCode * 31) + ffco.a(this.j)) * 31) + this.k) * 31) + (true != this.l ? 1237 : 1231);
    }
}
