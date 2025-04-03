package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijz implements aihs {
    public final long a;
    public final String b;
    public final String c = "com.whatsapp";
    public final ffji d;

    public aijz(long j, String str, ffji ffjiVar) {
        this.a = j;
        this.b = str;
        this.d = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aijz)) {
            return false;
        }
        aijz aijzVar = (aijz) obj;
        return this.a == aijzVar.a && ffkj.e(this.b, aijzVar.b) && ffkj.e(this.c, aijzVar.c) && ffkj.e(this.d, aijzVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Cp2ThirdPartyService(rowId=" + this.a + ", mimeType=" + this.b + ", packageName=" + this.c + ", onStarted=" + this.d + ")";
    }
}
