package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjow {
    public final String a;
    public final aoku b;
    public final Instant c;
    public final Instant d;
    public final cjqf e;
    public final int f;
    private final azsu g;

    public cjow(azsu azsuVar, String str, aoku aokuVar, Instant instant, Instant instant2, int i, cjqf cjqfVar) {
        this.g = azsuVar;
        this.a = str;
        this.b = aokuVar;
        this.c = instant;
        this.d = instant2;
        this.f = i;
        this.e = cjqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjow)) {
            return false;
        }
        cjow cjowVar = (cjow) obj;
        return ffkj.e(this.g, cjowVar.g) && ffkj.e(this.a, cjowVar.a) && ffkj.e(this.b, cjowVar.b) && ffkj.e(this.c, cjowVar.c) && ffkj.e(this.d, cjowVar.d) && this.f == cjowVar.f && ffkj.e(this.e, cjowVar.e);
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ParsedSmsData(myIdentity=" + this.g + ", messageText=" + this.a + ", sender=" + this.b + ", messageSentTimestamp=" + this.c + ", messageReceivedTimestamp=" + this.d + ", messageClass=" + ((Object) eopm.b(this.f)) + ", telephonyData=" + this.e + ")";
    }
}
