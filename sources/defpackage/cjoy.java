package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjoy {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final Instant j;
    public final int k;

    public cjoy(String str, int i, boolean z, String str2, int i2, String str3, String str4, boolean z2, String str5, Instant instant, int i3) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = i2;
        this.f = str3;
        this.g = str4;
        this.h = z2;
        this.i = str5;
        this.j = instant;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjoy)) {
            return false;
        }
        cjoy cjoyVar = (cjoy) obj;
        return ffkj.e(this.a, cjoyVar.a) && this.b == cjoyVar.b && this.c == cjoyVar.c && ffkj.e(this.d, cjoyVar.d) && this.e == cjoyVar.e && ffkj.e(this.f, cjoyVar.f) && ffkj.e(this.g, cjoyVar.g) && this.h == cjoyVar.h && ffkj.e(this.i, cjoyVar.i) && ffkj.e(this.j, cjoyVar.j) && this.k == cjoyVar.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.d;
        return ((((((((((((((((((hashCode + this.b) * 31) + cjox.a(this.c)) * 31) + str.hashCode()) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + cjox.a(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k;
    }

    public final String toString() {
        return "RawSmsData(subject=" + this.a + ", subId=" + this.b + ", replyPathPresent=" + this.c + ", smsc=" + this.d + ", protocolIdentifier=" + this.e + ", originatingAddress=" + this.f + ", displayOriginatingAddress=" + this.g + ", isEmail=" + this.h + ", messageText=" + this.i + ", sentTimestamp=" + this.j + ", messageClass=" + ((Object) eopm.b(this.k)) + ")";
    }
}
