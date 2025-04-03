package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsw extends ejsy {
    public final Object a;
    public final ejsz b;

    public ejsw(Object obj, ejsz ejszVar) {
        this.a = obj;
        this.b = ejszVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejsw)) {
            return false;
        }
        ejsw ejswVar = (ejsw) obj;
        return ffkj.e(this.a, ejswVar.a) && ffkj.e(this.b, ejswVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        ejsz ejszVar = this.b;
        return (hashCode * 31) + (ejszVar != null ? ejszVar.hashCode() : 0);
    }

    public final String toString() {
        return "Rereading(staleResponse=" + this.a + ", cause=" + this.b + ")";
    }
}
