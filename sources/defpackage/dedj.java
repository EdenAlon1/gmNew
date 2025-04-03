package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedj {
    public final Uri a;
    public final String b;
    public final String[] c;

    public dedj(Uri uri, String str, String[] strArr) {
        uri.getClass();
        this.a = uri;
        this.b = str;
        this.c = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dedj)) {
            return false;
        }
        dedj dedjVar = (dedj) obj;
        return ffkj.e(this.a, dedjVar.a) && ffkj.e(this.b, dedjVar.b) && ffkj.e(this.c, dedjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String[] strArr = this.c;
        return hashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        return "FileInfoQueryParameterList(uri=" + this.a + ", selection=" + this.b + ", selectionArgs=" + Arrays.toString(this.c) + ")";
    }
}
