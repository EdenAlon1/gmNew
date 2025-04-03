package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjlu {
    public final azcr a;
    public final azhq b;

    public cjlu(azcr azcrVar, azhq azhqVar) {
        azcrVar.getClass();
        this.a = azcrVar;
        this.b = azhqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjlu)) {
            return false;
        }
        cjlu cjluVar = (cjlu) obj;
        return ffkj.e(this.a, cjluVar.a) && ffkj.e(this.b, cjluVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        azhq azhqVar = this.b;
        return hashCode + (azhqVar == null ? 0 : azhqVar.hashCode());
    }

    public final String toString() {
        return "PrimitiveTokens(destination=" + this.a + ", groupContext=" + this.b + ")";
    }
}
