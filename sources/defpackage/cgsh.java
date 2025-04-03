package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsh implements cgsk {
    public final String a;
    private final int b;
    private final fipy c;
    private final fipy d;

    public cgsh(int i, fipy fipyVar, fipy fipyVar2, String str) {
        this.b = i;
        this.c = fipyVar;
        this.d = fipyVar2;
        this.a = str;
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
        if (!(obj instanceof cgsh)) {
            return false;
        }
        cgsh cgshVar = (cgsh) obj;
        return this.b == cgshVar.b && ffkj.e(this.c, cgshVar.c) && ffkj.e(this.d, cgshVar.d) && ffkj.e(this.a, cgshVar.a);
    }

    public final int hashCode() {
        int hashCode = (this.b * 31) + this.c.hashCode();
        fipy fipyVar = this.d;
        return (((hashCode * 31) + (fipyVar == null ? 0 : fipyVar.hashCode())) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Image(startPosition=" + this.b + ", node=" + this.c + ", closingChild=" + this.d + ", url=" + this.a + ")";
    }
}
