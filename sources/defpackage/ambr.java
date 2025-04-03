package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ambr implements ambn {
    private final String a;
    private final String b;
    private final String c;
    private final aoku d;
    private final String e;
    private final String f;
    private final Uri g;

    public ambr(String str, String str2, String str3, aoku aokuVar, String str4, String str5, Uri uri) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aokuVar;
        this.e = str4;
        this.f = str5;
        this.g = uri;
    }

    @Override // defpackage.ambn
    public final Uri a() {
        return this.g;
    }

    @Override // defpackage.ambn
    public final aoku b() {
        return this.d;
    }

    @Override // defpackage.ambn
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ambn
    public final String d() {
        return this.f;
    }

    @Override // defpackage.ambn
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ambr)) {
            return false;
        }
        ambr ambrVar = (ambr) obj;
        return ffkj.e(this.a, ambrVar.a) && ffkj.e(this.b, ambrVar.b) && ffkj.e(this.c, ambrVar.c) && ffkj.e(this.d, ambrVar.d) && ffkj.e(this.e, ambrVar.e) && ffkj.e(this.f, ambrVar.f) && ffkj.e(this.g, ambrVar.g);
    }

    @Override // defpackage.ambn
    public final String f() {
        return this.a;
    }

    @Override // defpackage.ambn
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        Uri uri = this.g;
        return (hashCode * 31) + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "IcingSearchContactEntry(id=" + this.a + ", lookupKey=" + this.b + ", displayName=" + this.c + ", destination=" + this.d + ", destinationType=" + this.e + ", displayDestination=" + this.f + ", uri=" + this.g + ")";
    }
}
