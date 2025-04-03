package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosi {
    public final djrm a;
    public final djrm b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public cosi(djrm djrmVar, djrm djrmVar2, int i, int i2) {
        this.a = djrmVar;
        this.b = djrmVar2;
        this.c = i;
        this.d = i2;
        this.e = djrn.a(djrmVar).a;
        this.f = djrn.a(djrmVar2).a;
    }

    public static final String a(String str) {
        if (str.length() <= 3) {
            return "";
        }
        String substring = str.substring(str.length() - 3);
        substring.getClass();
        return substring;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cosi)) {
            return false;
        }
        cosi cosiVar = (cosi) obj;
        return ffkj.e(this.a, cosiVar.a) && ffkj.e(this.b, cosiVar.b) && djrq.b(this.c, cosiVar.c) && djrq.b(this.d, cosiVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        int i = this.d;
        return "ComparisonLoggingEventDetails(simSubscriptionInfoRcsProvisioningId=" + this.a + ", simPreferencesRcsProvisioningId=" + this.b + ", simSubscriptionInfoSubId=" + djrq.a(this.c) + ", simPreferencesSubId=" + djrq.a(i) + ")";
    }
}
