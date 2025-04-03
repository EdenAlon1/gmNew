package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsi implements cgsk {
    public final int a;
    public final String b;
    private final fipy c;
    private final fipy d;

    public cgsi(int i, fipy fipyVar, fipy fipyVar2, String str) {
        this.a = i;
        this.c = fipyVar;
        this.d = fipyVar2;
        this.b = str;
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
        if (!(obj instanceof cgsi)) {
            return false;
        }
        cgsi cgsiVar = (cgsi) obj;
        return this.a == cgsiVar.a && ffkj.e(this.c, cgsiVar.c) && ffkj.e(this.d, cgsiVar.d) && ffkj.e(this.b, cgsiVar.b);
    }

    public final int hashCode() {
        int hashCode = (this.a * 31) + this.c.hashCode();
        fipy fipyVar = this.d;
        return (((hashCode * 31) + (fipyVar == null ? 0 : fipyVar.hashCode())) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Link(startPosition=" + this.a + ", node=" + this.c + ", closingChild=" + this.d + ", embeddedText=" + this.b + ")";
    }
}
