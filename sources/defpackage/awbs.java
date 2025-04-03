package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbs {
    public final String a;
    public final awap b;
    public final String c;

    public /* synthetic */ awbs(String str, awap awapVar, String str2, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : awapVar;
        this.c = (i & 4) != 0 ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awbs)) {
            return false;
        }
        awbs awbsVar = (awbs) obj;
        return ffkj.e(this.a, awbsVar.a) && ffkj.e(this.b, awbsVar.b) && ffkj.e(this.c, awbsVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        awap awapVar = this.b;
        return (((hashCode * 31) + (awapVar != null ? awapVar.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "UploadIdentifiers(uploadId=" + this.a + ", processingId=" + this.b + ", transactionId=" + this.c + ")";
    }
}
