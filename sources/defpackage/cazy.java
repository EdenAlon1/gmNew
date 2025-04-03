package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazy {
    public final String a;
    public final Uri b;

    public cazy(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cazy)) {
            return false;
        }
        cazy cazyVar = (cazy) obj;
        return ffkj.e(this.a, cazyVar.a) && ffkj.e(this.b, cazyVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        return (hashCode * 31) + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "VCardDetails(displayName=" + this.a + ", avatarUri=" + this.b + ")";
    }
}
