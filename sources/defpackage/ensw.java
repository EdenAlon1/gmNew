package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ensw implements ensf {
    private final ensf a;
    private final Object b;

    public ensw(ensf ensfVar, Object obj) {
        this.a = ensfVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ensw)) {
            return false;
        }
        ensw enswVar = (ensw) obj;
        return this.a.equals(enswVar.a) && this.b.equals(enswVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
