package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjoc extends cjod {
    public final cjoe a;
    public final cjmd b;

    public cjoc(cjoe cjoeVar, cjmd cjmdVar) {
        this.a = cjoeVar;
        this.b = cjmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjoc)) {
            return false;
        }
        cjoc cjocVar = (cjoc) obj;
        return ffkj.e(this.a, cjocVar.a) && ffkj.e(this.b, cjocVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Request(sendingMessageData=" + this.a + ", chatApiData=" + this.b + ")";
    }
}
