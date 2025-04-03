package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eush implements eusl {
    private final int a;
    private final eusk b;

    public eush(int i, eusk euskVar) {
        this.a = i;
        this.b = euskVar;
    }

    @Override // defpackage.eusl
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return eusl.class;
    }

    @Override // defpackage.eusl
    public final eusk b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eusl)) {
            return false;
        }
        eusl euslVar = (eusl) obj;
        return this.a == euslVar.a() && this.b.equals(euslVar.b());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
