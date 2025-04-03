package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmn {
    public final Uri a;
    public final Uri b;
    public final cjwi c;

    public aqmn(Uri uri, Uri uri2, cjwi cjwiVar) {
        cjwiVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.c = cjwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqmn)) {
            return false;
        }
        aqmn aqmnVar = (aqmn) obj;
        return ffkj.e(this.a, aqmnVar.a) && ffkj.e(this.b, aqmnVar.b) && this.c == aqmnVar.c;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.b;
        return (((hashCode * 31) + (uri2 != null ? uri2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RecipientPhotoImpl(highResolutionPhotoUri=" + this.a + ", thumbnailPhotoUri=" + this.b + ", source=" + this.c + ")";
    }
}
