package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjx {
    public final CharSequence a;
    public final long b;

    public dsjx(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsjx)) {
            return false;
        }
        dsjx dsjxVar = (dsjx) obj;
        if (!ffkj.e(this.a, dsjxVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = dsjxVar.b;
        long j3 = ibw.a;
        return ffcp.a(j, j2);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = ibw.a;
        return hashCode + ffco.a(this.b);
    }

    public final String toString() {
        return "TextPlaceholder(value=" + ((Object) this.a) + ", color=" + ibw.g(this.b) + ")";
    }
}
