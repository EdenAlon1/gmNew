package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhy {
    public final bzge a;
    public final String b;
    public final String c;
    public final byyv d;
    public final int e;
    public final Instant f;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    private final long l;
    private final String m;
    private final String n;
    private final byzd o;

    public bzhy(long j, bzge bzgeVar, String str, String str2, String str3, String str4, byyv byyvVar, int i, byzd byzdVar, Instant instant) {
        this.l = j;
        this.a = bzgeVar;
        this.m = str;
        this.n = str2;
        this.b = str3;
        this.c = str4;
        this.d = byyvVar;
        this.e = i;
        this.o = byzdVar;
        this.f = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzhy)) {
            return false;
        }
        bzhy bzhyVar = (bzhy) obj;
        return this.l == bzhyVar.l && ffkj.e(this.a, bzhyVar.a) && ffkj.e(this.m, bzhyVar.m) && ffkj.e(this.n, bzhyVar.n) && ffkj.e(this.b, bzhyVar.b) && ffkj.e(this.c, bzhyVar.c) && this.d == bzhyVar.d && this.e == bzhyVar.e && this.o == bzhyVar.o && ffkj.e(this.f, bzhyVar.f) && ffkj.e(this.g, bzhyVar.g) && ffkj.e(this.h, bzhyVar.h) && ffkj.e(this.i, bzhyVar.i) && ffkj.e(this.j, bzhyVar.j) && ffkj.e(this.k, bzhyVar.k);
    }

    public final int hashCode() {
        long j = this.l;
        return (((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.a.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.o.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "GaiaDesktopItem(id=" + this.l + ", dittoIdContainer=" + this.a + ", destinationRegistrationId=" + this.m + ", desktopId=" + this.n + ", operatingSystem=" + this.b + ", operatingSystemVersion=" + this.c + ", desktopType=" + this.d + ", browserType=" + this.e + ", pairingType=" + this.o + ", lastConnectionTime=" + this.f + ", activeDusi=" + this.g + ", personalizedDisplayName=" + this.h + ", modelDisplayName=" + this.i + ", approximateLocationDisplayName=" + this.j + ", frontViewImageUrl=" + this.k + ")";
    }
}
