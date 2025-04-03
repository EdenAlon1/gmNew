package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jib {
    public final igz a;
    public final int b;

    public jib(igz igzVar, int i) {
        this.a = igzVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jib)) {
            return false;
        }
        jib jibVar = (jib) obj;
        return ffkj.e(this.a, jibVar.a) && this.b == jibVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
    }
}
