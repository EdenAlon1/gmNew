package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqs {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;

    public ajqs(bton btonVar) {
        String s = btonVar.s();
        s.getClass();
        long k = btonVar.k();
        String r = btonVar.r();
        String q = btonVar.q();
        boolean v = btonVar.v();
        this.a = s;
        this.b = k;
        this.c = r;
        this.d = q;
        this.e = v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajqs)) {
            return false;
        }
        ajqs ajqsVar = (ajqs) obj;
        return ffkj.e(this.a, ajqsVar.a) && this.b == ajqsVar.b && ffkj.e(this.c, ajqsVar.c) && ffkj.e(this.d, ajqsVar.d) && this.e == ajqsVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + hashCode2) * 31;
        String str2 = this.d;
        return ((i + (str2 != null ? str2.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "LinkPreview(triggerUrlString=" + this.a + ", expirationTimeMsEpoch=" + this.b + ", linkTitle=" + this.c + ", linkImageUrlString=" + this.d + ", linkPreviewFailed=" + this.e + ")";
    }
}
