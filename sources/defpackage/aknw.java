package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aknw {
    public final Uri a;
    public final String b;

    public aknw(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aknw)) {
            return false;
        }
        aknw aknwVar = (aknw) obj;
        return ffkj.e(this.a, aknwVar.a) && ffkj.e(this.b, aknwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DeleteQuery(uri=" + this.a + ", where=" + this.b + ")";
    }
}
