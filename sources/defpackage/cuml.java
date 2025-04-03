package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuml {
    public final int a;
    public final int b;
    public final String c;

    public cuml(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuml)) {
            return false;
        }
        cuml cumlVar = (cuml) obj;
        return this.a == cumlVar.a && this.b == cumlVar.b && ffkj.e(this.c, cumlVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Annotation(start=" + this.a + ", end=" + this.b + ", type=" + this.c + ")";
    }
}
