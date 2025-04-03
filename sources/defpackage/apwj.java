package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apwj implements alxz {
    private final String a;
    private final Uri d;
    private final String e;
    private final Uri f;
    private final boolean i;
    private final String b = null;
    private final String c = null;
    private final boolean g = false;
    private final boolean h = false;

    public apwj(String str, Uri uri, String str2, Uri uri2, boolean z) {
        this.a = str;
        this.d = uri;
        this.e = str2;
        this.f = uri2;
        this.i = z;
    }

    @Override // defpackage.alxz
    public final Uri a() {
        return this.d;
    }

    @Override // defpackage.alxz
    public final Uri b() {
        return this.f;
    }

    @Override // defpackage.alxz
    public final String c() {
        return this.e;
    }

    @Override // defpackage.alxz
    public final String d() {
        return null;
    }

    @Override // defpackage.alxz
    public final String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apwj)) {
            return false;
        }
        apwj apwjVar = (apwj) obj;
        if (!ffkj.e(this.a, apwjVar.a)) {
            return false;
        }
        String str = apwjVar.b;
        if (!ffkj.e(null, null)) {
            return false;
        }
        String str2 = apwjVar.c;
        if (!ffkj.e(null, null) || !ffkj.e(this.d, apwjVar.d) || !ffkj.e(this.e, apwjVar.e) || !ffkj.e(this.f, apwjVar.f)) {
            return false;
        }
        boolean z = apwjVar.g;
        boolean z2 = apwjVar.h;
        return this.i == apwjVar.i;
    }

    @Override // defpackage.alxz
    public final String f() {
        return this.a;
    }

    @Override // defpackage.alxz
    public final boolean g() {
        return this.i;
    }

    @Override // defpackage.alxz
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.d;
        int hashCode2 = uri == null ? 0 : uri.hashCode();
        int i = hashCode * 29791;
        String str2 = this.e;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i2 = i + hashCode2;
        Uri uri2 = this.f;
        return (((((((((i2 * 31) + hashCode3) * 31) + (uri2 == null ? 0 : uri2.hashCode())) * 31) + apwi.a(false)) * 31) + apwi.a(false)) * 31) + apwi.a(this.i);
    }

    @Override // defpackage.alxz
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return "BugleMessagePreview(linkTitle=" + this.a + ", linkDescription=null, linkDomain=null, linkImageUrl=" + this.d + ", linkCanonicalUrlString=" + this.e + ", linkTargetUrl=" + this.f + ", linkPreviewPrevented=false, linkPreviewFailed=false, isExpired=" + this.i + ")";
    }
}
