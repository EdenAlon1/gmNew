package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwn implements dnwq {
    public final Uri a;
    public final Boolean b;
    public final String c;
    public final Uri d;
    private final dnwk e;

    public /* synthetic */ dnwn(Uri uri, Boolean bool, String str, dnwk dnwkVar, Uri uri2, int i) {
        dnwkVar = (i & 8) != 0 ? dnwk.a : dnwkVar;
        int i2 = i & 2;
        str = (i & 4) != 0 ? null : str;
        bool = i2 != 0 ? null : bool;
        uri2 = (i & 16) != 0 ? null : uri2;
        uri.getClass();
        dnwkVar.getClass();
        this.a = uri;
        this.b = bool;
        this.c = str;
        this.e = dnwkVar;
        this.d = uri2;
    }

    @Override // defpackage.dnwq
    public final dnwk a() {
        return this.e;
    }

    @Override // defpackage.dnwq
    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnwn)) {
            return false;
        }
        dnwn dnwnVar = (dnwn) obj;
        return ffkj.e(this.a, dnwnVar.a) && ffkj.e(this.b, dnwnVar.b) && ffkj.e(this.c, dnwnVar.c) && this.e == dnwnVar.e && ffkj.e(this.d, dnwnVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31;
        Uri uri = this.d;
        return hashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "Glide(uri=" + this.a + ", forceClipToCircle=" + this.b + ", signature=" + this.c + ", monogramBadge=" + this.e + ", fallbackUri=" + this.d + ")";
    }
}
