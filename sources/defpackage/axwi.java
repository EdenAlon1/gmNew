package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwi {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final Uri o;
    public final Uri p;
    public final Integer q;
    public final String r;
    public final String s;
    public final Instant t;
    public final Collection u;

    public axwi(long j, long j2, String str, String str2, String str3, String str4, long j3, String str5, String str6, String str7, String str8, String str9, int i, String str10, Uri uri, Uri uri2, Integer num, String str11, String str12, Instant instant, Collection collection) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j3;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = i;
        this.n = str10;
        this.o = uri;
        this.p = uri2;
        this.q = num;
        this.r = str11;
        this.s = str12;
        this.t = instant;
        this.u = collection;
        if (!((str9 != null) ^ (str7 != null))) {
            throw new IllegalArgumentException("Contact is missing a destination");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axwi)) {
            return false;
        }
        axwi axwiVar = (axwi) obj;
        return this.a == axwiVar.a && this.b == axwiVar.b && ffkj.e(this.c, axwiVar.c) && ffkj.e(this.d, axwiVar.d) && ffkj.e(this.e, axwiVar.e) && ffkj.e(this.f, axwiVar.f) && this.g == axwiVar.g && ffkj.e(this.h, axwiVar.h) && ffkj.e(this.i, axwiVar.i) && ffkj.e(this.j, axwiVar.j) && ffkj.e(this.k, axwiVar.k) && ffkj.e(this.l, axwiVar.l) && this.m == axwiVar.m && ffkj.e(this.n, axwiVar.n) && ffkj.e(this.o, axwiVar.o) && ffkj.e(this.p, axwiVar.p) && ffkj.e(this.q, axwiVar.q) && ffkj.e(this.r, axwiVar.r) && ffkj.e(this.s, axwiVar.s) && ffkj.e(this.t, axwiVar.t) && ffkj.e(this.u, axwiVar.u);
    }

    public final int hashCode() {
        int a = (((((((((axwh.a(this.a) * 31) + axwh.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        String str = this.h;
        int a2 = ((((a * 31) + axwh.a(this.g)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode4 = (((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.m) * 31;
        String str6 = this.n;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Uri uri = this.o;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.p;
        int hashCode7 = (hashCode6 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Integer num = this.q;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.r;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.s;
        return ((((hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.t.hashCode()) * 31) + this.u.hashCode();
    }

    public final String toString() {
        return "Cp2Contact(_id=" + this.a + ", contactId=" + this.b + ", lookupKey=" + this.c + ", displayName=" + this.d + ", sortKey=" + this.e + ", phonebookLabel=" + this.f + ", phonebookBucket=" + this.g + ", givenName=" + this.h + ", familyName=" + this.i + ", number=" + this.j + ", normalizedNumber=" + this.k + ", emailAddress=" + this.l + ", contactType=" + this.m + ", contactTypeLabel=" + this.n + ", photo=" + this.o + ", photoThumbnail=" + this.p + ", photoFileId=" + this.q + ", birthday=" + this.r + ", anniversary=" + this.s + ", lastUpdatedTimestamp=" + this.t + ", thirdPartyServices=" + this.u + ")";
    }
}
