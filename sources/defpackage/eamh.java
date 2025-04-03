package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamh {
    public final int a;
    public final String b;

    public eamh(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eamh)) {
            return false;
        }
        eamh eamhVar = (eamh) obj;
        return this.a == eamhVar.a && ffkj.e(this.b, eamhVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RegistrationState(registrationStatus=" + this.a + ", environment=" + this.b + ")";
    }
}
