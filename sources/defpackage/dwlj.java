package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlj {
    public final jsw a;

    public dwlj(jsw jswVar) {
        this.a = jswVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwlj) && ffkj.e(this.a, ((dwlj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GoogleSansFlexConfig(variationSettings=" + this.a + ")";
    }
}
