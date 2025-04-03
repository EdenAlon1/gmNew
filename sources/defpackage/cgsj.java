package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsj implements cgsk {
    public final int a;
    public final dlus b;
    private final fipy c;
    private final fipy d;
    private final String e;

    public /* synthetic */ cgsj(int i, dlus dlusVar, fipy fipyVar, fipy fipyVar2) {
        dlusVar.getClass();
        this.a = i;
        this.b = dlusVar;
        this.c = fipyVar;
        this.d = fipyVar2;
        this.e = null;
    }

    @Override // defpackage.cgsk
    public final fipy a() {
        return this.d;
    }

    @Override // defpackage.cgsk
    public final fipy b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgsj)) {
            return false;
        }
        cgsj cgsjVar = (cgsj) obj;
        if (this.a != cgsjVar.a || this.b != cgsjVar.b || !ffkj.e(this.c, cgsjVar.c) || !ffkj.e(this.d, cgsjVar.d)) {
            return false;
        }
        String str = cgsjVar.e;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fipy fipyVar = this.d;
        return ((hashCode * 31) + (fipyVar == null ? 0 : fipyVar.hashCode())) * 31;
    }

    public final String toString() {
        return "Standard(startPosition=" + this.a + ", type=" + this.b + ", node=" + this.c + ", closingChild=" + this.d + ", embeddedText=null)";
    }
}
