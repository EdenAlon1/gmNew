package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvu {
    public final Uri a;
    public final cjwi b;
    public final boolean c;

    public /* synthetic */ cjvu(Uri uri, cjwi cjwiVar, boolean z, int i) {
        cjwiVar = (i & 2) != 0 ? cjwi.PROFILE_PEOPLE_SHARING_SOURCE : cjwiVar;
        boolean z2 = (i & 4) == 0;
        cjwiVar.getClass();
        this.a = uri;
        this.b = cjwiVar;
        this.c = z & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjvu)) {
            return false;
        }
        cjvu cjvuVar = (cjvu) obj;
        return ffkj.e(this.a, cjvuVar.a) && this.b == cjvuVar.b && this.c == cjvuVar.c;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return ((((uri == null ? 0 : uri.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "DefaultProfilePhoto(uri=" + this.a + ", source=" + this.b + ", hasPhoto=" + this.c + ")";
    }
}
