package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jps extends jpq {
    public final String a;

    public jps(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jps) && ffkj.e(this.a, ((jps) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}
