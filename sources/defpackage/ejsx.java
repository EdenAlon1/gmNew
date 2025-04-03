package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsx extends ejsy {
    public final Object a;
    public final ejsz b;

    public ejsx(Object obj, ejsz ejszVar) {
        this.a = obj;
        this.b = ejszVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejsx)) {
            return false;
        }
        ejsx ejsxVar = (ejsx) obj;
        return ffkj.e(this.a, ejsxVar.a) && ffkj.e(this.b, ejsxVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "StaleRead(staleResponse=" + this.a + ", cause=" + this.b + ")";
    }
}
