package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cshq {
    private final axeu a;
    private final axeu b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cshq() {
        /*
            r1 = this;
            axeu r0 = defpackage.axeu.UNSPECIFIED_STATUS
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cshq.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cshq)) {
            return false;
        }
        cshq cshqVar = (cshq) obj;
        return this.a == cshqVar.a && this.b == cshqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FeatureOverlapStatus(multiDeviceStatus=" + this.a + ", backupAndRestoreStatus=" + this.b + ")";
    }

    public cshq(axeu axeuVar, axeu axeuVar2) {
        axeuVar.getClass();
        axeuVar2.getClass();
        this.a = axeuVar;
        this.b = axeuVar2;
    }
}
