package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtn extends egtq {
    public final String a;
    public final Object b;
    public final boolean c;
    public final ewke d;
    public final boolean e;
    public final boolean f;
    public final Uri g;
    public final boolean h;
    private final String i;
    private final boolean j;

    public egtn(String str, Object obj, String str2, boolean z, ewke ewkeVar, boolean z2, boolean z3, boolean z4, Uri uri, boolean z5) {
        uri.getClass();
        this.a = str;
        this.b = obj;
        this.i = str2;
        this.c = z;
        this.d = ewkeVar;
        this.e = z2;
        this.f = z3;
        this.j = z4;
        this.g = uri;
        this.h = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egtn)) {
            return false;
        }
        egtn egtnVar = (egtn) obj;
        return ffkj.e(this.a, egtnVar.a) && ffkj.e(this.b, egtnVar.b) && ffkj.e(this.i, egtnVar.i) && this.c == egtnVar.c && this.d == egtnVar.d && this.e == egtnVar.e && this.f == egtnVar.f && this.j == egtnVar.j && ffkj.e(this.g, egtnVar.g) && this.h == egtnVar.h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.i.hashCode()) * 31) + egtm.a(this.c)) * 31) + this.d.hashCode();
        Uri uri = this.g;
        boolean z = this.j;
        return (((((((((hashCode * 31) + egtm.a(this.e)) * 31) + egtm.a(this.f)) * 31) + egtm.a(z)) * 31) + uri.hashCode()) * 31) + egtm.a(this.h);
    }

    public final String toString() {
        return "Ready(name=" + this.a + ", avatarGlideModel=" + this.b + ", accountName=" + this.i + ", locked=" + this.c + ", infoMessage=" + this.d + ", hasAnyGooglePhotos=" + this.e + ", isDefaultPhoto=" + this.f + ", isOffline=" + this.j + ", cameraUri=" + this.g + ", remoteStateLoadDone=" + this.h + ")";
    }
}
