package androidx.car.app.model.signin;

import android.net.Uri;
import defpackage.cfs;
import defpackage.cju;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class QRCodeSignInMethod implements cju {
    private final Uri mUri;

    private QRCodeSignInMethod() {
        this.mUri = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QRCodeSignInMethod) {
            return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    public Uri getUri() {
        Uri uri = this.mUri;
        uri.getClass();
        return uri;
    }

    public int hashCode() {
        return Objects.hash(this.mUri);
    }

    public QRCodeSignInMethod(Uri uri) {
        uri.getClass();
        this.mUri = uri;
    }
}
