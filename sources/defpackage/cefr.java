package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cefr {
    public final int a;
    public final int b;
    public final pot c;
    public final int d;
    private final boolean e;

    public cefr(int i, boolean z, int i2, pot potVar, int i3) {
        this.a = i;
        this.e = z;
        this.b = i2;
        this.c = potVar;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cefr)) {
            return false;
        }
        cefr cefrVar = (cefr) obj;
        return this.a == cefrVar.a && this.e == cefrVar.e && this.b == cefrVar.b && ffkj.e(this.c, cefrVar.c) && this.d == cefrVar.d;
    }

    public final int hashCode() {
        boolean z = this.e;
        return (((((((this.a * 31) + (true != z ? 1237 : 1231)) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "CmsRestoreContext(cmsFeatureId=" + this.a + ", isBackupKeyFromFolsom=" + this.e + ", priorAttemptCount=" + this.b + ", workData=" + this.c + ", accountId=" + this.d + ")";
    }
}
