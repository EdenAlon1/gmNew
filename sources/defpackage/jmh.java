package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmh {
    public final jmi a;
    public final int b;
    public final int c;

    public jmh(jmi jmiVar, int i, int i2) {
        this.a = jmiVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmh)) {
            return false;
        }
        jmh jmhVar = (jmh) obj;
        return ffkj.e(this.a, jmhVar.a) && this.b == jmhVar.b && this.c == jmhVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
