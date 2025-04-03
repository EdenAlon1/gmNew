package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cypq {
    public final engw a;

    public cypq() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cypq) && ffkj.e(this.a, ((cypq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DescriptionUiData(items=" + this.a + ")";
    }

    public cypq(engw engwVar) {
        engwVar.getClass();
        this.a = engwVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cypq(byte[] bArr) {
        this(enou.a);
        int i = engw.d;
    }
}
