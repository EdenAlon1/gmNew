package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyk {
    public final dmyw a;
    public final boolean b;

    public cvyk() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvyk)) {
            return false;
        }
        cvyk cvykVar = (cvyk) obj;
        return ffkj.e(this.a, cvykVar.a) && this.b == cvykVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "FavoriteContactsUiData(rowUiData=" + this.a + ", loaded=" + this.b + ")";
    }

    public cvyk(dmyw dmywVar, boolean z) {
        this.a = dmywVar;
        this.b = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ cvyk(byte[] r3) {
        /*
            r2 = this;
            dmyw r3 = new dmyw
            int r0 = defpackage.engw.d
            engw r0 = defpackage.enou.a
            r0.getClass()
            java.lang.String r1 = ""
            r3.<init>(r1, r0)
            r0 = 0
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvyk.<init>(byte[]):void");
    }
}
