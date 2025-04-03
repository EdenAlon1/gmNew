package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqvv {
    public final String a;
    public final Uri b;

    public aqvv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqvv)) {
            return false;
        }
        aqvv aqvvVar = (aqvv) obj;
        return ffkj.e(this.a, aqvvVar.a) && ffkj.e(this.b, aqvvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SelfParticipantProperties(fullName=" + this.a + ", profilePhotoUri=" + this.b + ")";
    }

    public aqvv(String str, Uri uri) {
        uri.getClass();
        this.a = str;
        this.b = uri;
    }

    public /* synthetic */ aqvv(byte[] bArr) {
        this("", Uri.EMPTY);
    }
}
