package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azvv {
    public final int a;
    public final String b;
    public final aoku c;
    public final String d;
    public final String e;

    public azvv(int i, String str, aoku aokuVar, String str2, String str3) {
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = aokuVar;
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        aoku aokuVar = this.c;
        if (aokuVar == null) {
            return null;
        }
        String o = aokuVar.o();
        if (o.length() == 0) {
            return null;
        }
        return o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azvv)) {
            return false;
        }
        azvv azvvVar = (azvv) obj;
        return this.a == azvvVar.a && ffkj.e(this.b, azvvVar.b) && ffkj.e(this.c, azvvVar.c) && ffkj.e(this.d, azvvVar.d) && ffkj.e(this.e, azvvVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.a * 31) + this.b.hashCode();
        aoku aokuVar = this.c;
        return (((((hashCode * 31) + (aokuVar == null ? 0 : aokuVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TelephonySubscription(subId=" + this.a + ", simSerialNumber=" + this.b + ", telephonyPhoneNumber=" + this.c + ", displayName=" + this.d + ", provisioningId=" + this.e + ")";
    }

    public /* synthetic */ azvv(int i, String str, aoku aokuVar, String str2, int i2) {
        this(i, str, aokuVar, (i2 & 8) != 0 ? "" : str2, "");
    }
}
