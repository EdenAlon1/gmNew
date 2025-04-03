package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avxc extends avxe {
    private final Uri a;

    public avxc(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.avxs
    public final int b() {
        return 1;
    }

    @Override // defpackage.avxe, defpackage.avxs
    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avxs) {
            avxs avxsVar = (avxs) obj;
            if (avxsVar.b() == 1 && this.a.equals(avxsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{downloadUri=" + this.a.toString() + "}";
    }
}
