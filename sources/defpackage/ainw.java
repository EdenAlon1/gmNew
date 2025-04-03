package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainw {
    public final String a;
    public final Uri b;

    public ainw(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ainw)) {
            return false;
        }
        ainw ainwVar = (ainw) obj;
        return ffkj.e(this.a, ainwVar.a) && ffkj.e(this.b, ainwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TypedUri(contentType=" + this.a + ", uri=" + this.b + ")";
    }
}
