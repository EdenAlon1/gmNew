package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmat implements dmba {
    public final qgw a;
    public final float b;
    public final int c;
    public final String d;
    public final dmci e;

    public dmat(qgw qgwVar, float f, int i, String str, dmci dmciVar) {
        this.a = qgwVar;
        this.b = f;
        this.c = i;
        this.d = str;
        this.e = dmciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmat)) {
            return false;
        }
        dmat dmatVar = (dmat) obj;
        return ffkj.e(this.a, dmatVar.a) && Float.compare(this.b, dmatVar.b) == 0 && this.c == dmatVar.c && ffkj.e(this.d, dmatVar.d) && ffkj.e(this.e, dmatVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Animation(lottie=" + this.a + ", scale=" + this.b + ", count=" + this.c + ", contentDescription=" + this.d + ", style=" + this.e + ")";
    }
}
