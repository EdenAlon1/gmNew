package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqw extends edrw {
    private final Uri a;

    public edqw(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.edrw
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof edrw)) {
            return false;
        }
        edrw edrwVar = (edrw) obj;
        Uri uri = this.a;
        return uri == null ? edrwVar.a() == null : uri.equals(edrwVar.a());
    }

    public final int hashCode() {
        Uri uri = this.a;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "FetchResolvedPhotoUriResponse{uri=" + String.valueOf(this.a) + "}";
    }
}
