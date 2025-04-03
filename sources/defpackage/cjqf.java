package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqf {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final baow f;

    public cjqf(String str, int i, boolean z, String str2, int i2, baow baowVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = i2;
        this.f = baowVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjqf)) {
            return false;
        }
        cjqf cjqfVar = (cjqf) obj;
        return ffkj.e(this.a, cjqfVar.a) && this.b == cjqfVar.b && this.c == cjqfVar.c && ffkj.e(this.d, cjqfVar.d) && this.e == cjqfVar.e && ffkj.e(this.f, cjqfVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TelephonyData(subject=" + this.a + ", subId=" + this.b + ", replyPathPresent=" + this.c + ", smsc=" + this.d + ", protocolIdentifier=" + this.e + ", rawSmsMessagingAddress=" + this.f + ")";
    }
}
