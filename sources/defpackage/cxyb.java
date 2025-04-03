package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyb extends cxyk {
    public final cxyi a;
    public final boolean b;
    public final int c;

    public cxyb(int i, cxyi cxyiVar, boolean z) {
        this.c = i;
        this.a = cxyiVar;
        this.b = z;
    }

    @Override // defpackage.cxyk
    public final cxyi a() {
        return this.a;
    }

    @Override // defpackage.cxyk
    public final cxyj b() {
        return new cxya(this);
    }

    @Override // defpackage.cxyk
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.cxyk
    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxyk) {
            cxyk cxykVar = (cxyk) obj;
            if (this.c == cxykVar.d() && this.a.equals(cxykVar.a()) && this.b == cxykVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? "NOT_ELIGIBLE" : "ELIGIBLE" : "LOADING";
        cxyi cxyiVar = this.a;
        boolean z = this.b;
        return "SelectionParams{eligibility=" + str + ", priority=" + cxyiVar.toString() + ", hasBeenShown=" + z + "}";
    }
}
