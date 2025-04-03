package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clyv {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public clyv(int i, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clyv)) {
            return false;
        }
        clyv clyvVar = (clyv) obj;
        return this.a == clyvVar.a && ffkj.e(this.b, clyvVar.b) && this.c == clyvVar.c && this.d == clyvVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + clyu.a(this.c)) * 31) + clyu.a(this.d);
    }

    public final String toString() {
        return "PhoneNumberInputData(simSlot=" + this.a + ", carrierName=" + this.b + ", isDefaultCall=" + this.c + ", isDefaultSms=" + this.d + ")";
    }
}
