package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dugb extends dugd {
    private final String a;
    private final emxc b;

    public dugb(String str, emxc emxcVar) {
        this.a = str;
        this.b = emxcVar;
    }

    @Override // defpackage.dugd
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dugd
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dugd) {
            dugd dugdVar = (dugd) obj;
            if (this.a.equals(dugdVar.b()) && this.b.equals(dugdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ElementId{key=" + this.a + ", timestampMicros=" + String.valueOf(this.b) + "}";
    }
}
