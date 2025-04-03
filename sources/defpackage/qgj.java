package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgj extends qgk {
    private final String a;
    private final String b;
    private final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qgj() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgj.<init>():void");
    }

    @Override // defpackage.qgk
    public final float a(qci qciVar) {
        String str = this.b;
        if (str == null) {
            return 1.0f;
        }
        qht c = qciVar.c(str);
        return ffmk.e((c != null ? c.b + 0.0f : 0.0f) / qciVar.k, 0.0f, 1.0f);
    }

    @Override // defpackage.qgk
    public final float b(qci qciVar) {
        String str = this.a;
        if (str == null) {
            return 0.0f;
        }
        qht c = qciVar.c(str);
        return ffmk.e((c != null ? c.b : 0.0f) / qciVar.k, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgj)) {
            return false;
        }
        qgj qgjVar = (qgj) obj;
        if (!ffkj.e(this.a, qgjVar.a) || !ffkj.e(this.b, qgjVar.b)) {
            return false;
        }
        boolean z = qgjVar.c;
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + 1231;
    }

    public final String toString() {
        return "Markers(min=" + this.a + ", max=" + this.b + ", maxInclusive=true)";
    }

    public /* synthetic */ qgj(String str, String str2, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : str2;
        this.c = true;
    }
}
