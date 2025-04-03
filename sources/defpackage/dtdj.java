package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdj {
    public final dtdi a;
    public final dtdh b;

    public dtdj(dtdi dtdiVar, dtdh dtdhVar) {
        this.a = dtdiVar;
        this.b = dtdhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtdj)) {
            return false;
        }
        dtdj dtdjVar = (dtdj) obj;
        return ffkj.e(this.a, dtdjVar.a) && ffkj.e(this.b, dtdjVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dtdh dtdhVar = this.b;
        return hashCode + (dtdhVar == null ? 0 : dtdhVar.hashCode());
    }

    public final String toString() {
        return "ReactiveSpanResolver(rowSpanCountResolver=" + this.a + ", itemSpanSizeResolver=" + this.b + ")";
    }

    public /* synthetic */ dtdj(dtdi dtdiVar) {
        this(dtdiVar, null);
    }
}
