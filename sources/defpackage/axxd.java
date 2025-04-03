package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axxd {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final Long h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;
    public final Integer p;
    public final long q;

    public axxd(long j, long j2, String str, String str2, String str3, long j3, String str4, Long l, String str5, String str6, String str7, int i, String str8, String str9, String str10, Integer num, long j4) {
        str2.getClass();
        str4.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j3;
        this.g = str4;
        this.h = l;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = i;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = num;
        this.q = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axxd)) {
            return false;
        }
        axxd axxdVar = (axxd) obj;
        return this.a == axxdVar.a && this.b == axxdVar.b && ffkj.e(this.c, axxdVar.c) && ffkj.e(this.d, axxdVar.d) && ffkj.e(this.e, axxdVar.e) && this.f == axxdVar.f && ffkj.e(this.g, axxdVar.g) && ffkj.e(this.h, axxdVar.h) && ffkj.e(this.i, axxdVar.i) && ffkj.e(this.j, axxdVar.j) && ffkj.e(this.k, axxdVar.k) && this.l == axxdVar.l && ffkj.e(this.m, axxdVar.m) && ffkj.e(this.n, axxdVar.n) && ffkj.e(this.o, axxdVar.o) && ffkj.e(this.p, axxdVar.p) && this.q == axxdVar.q;
    }

    public final int hashCode() {
        int a = (((((((((((axxc.a(this.a) * 31) + axxc.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + axxc.a(this.f)) * 31) + this.g.hashCode();
        Long l = this.h;
        int hashCode = ((a * 31) + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.l) * 31;
        String str4 = this.m;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.p;
        return ((hashCode7 + (num != null ? num.hashCode() : 0)) * 31) + axxc.a(this.q);
    }

    public final String toString() {
        return "RawContact(_id=" + this.a + ", contactId=" + this.b + ", lookupKey=" + this.c + ", sortKey=" + this.d + ", phonebookLabel=" + this.e + ", phonebookBucket=" + this.f + ", displayName=" + this.g + ", nameRawContactId=" + this.h + ", number=" + this.i + ", normalizedNumber=" + this.j + ", emailAddress=" + this.k + ", contactType=" + this.l + ", contactTypeLabel=" + this.m + ", photoUri=" + this.n + ", photoThumbnailUri=" + this.o + ", photoFileId=" + this.p + ", lastUpdatedTimestamp=" + this.q + ")";
    }
}
