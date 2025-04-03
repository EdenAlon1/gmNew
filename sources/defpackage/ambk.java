package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ambk implements ambn {
    public final aoku a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;

    public ambk(String str, String str2, String str3, aoku aokuVar, String str4, Uri uri) {
        str.getClass();
        str4.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = aokuVar;
        this.e = str4;
        this.f = uri;
    }

    @Override // defpackage.ambn
    public final Uri a() {
        return this.f;
    }

    @Override // defpackage.ambn
    public final aoku b() {
        return this.a;
    }

    @Override // defpackage.ambn
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ambn
    public final /* synthetic */ String d() {
        return this.a.G().toString();
    }

    @Override // defpackage.ambn
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ambk)) {
            return false;
        }
        ambk ambkVar = (ambk) obj;
        return ffkj.e(this.b, ambkVar.b) && ffkj.e(this.c, ambkVar.c) && ffkj.e(this.d, ambkVar.d) && ffkj.e(this.a, ambkVar.a) && ffkj.e(this.e, ambkVar.e) && ffkj.e(this.f, ambkVar.f);
    }

    @Override // defpackage.ambn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.ambn
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
        Uri uri = this.f;
        return (hashCode * 31) + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "DefaultSearchContactEntry(id=" + this.b + ", lookupKey=" + this.c + ", displayName=" + this.d + ", destination=" + this.a + ", destinationType=" + this.e + ", photo=" + this.f + ")";
    }
}
