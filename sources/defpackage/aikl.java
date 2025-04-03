package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikl implements aihu {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    public aikl(Uri uri, String str, int i, String str2, boolean z) {
        str.getClass();
        this.a = uri;
        this.b = str;
        this.e = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aikl)) {
            return false;
        }
        aikl aiklVar = (aikl) obj;
        return ffkj.e(this.a, aiklVar.a) && ffkj.e(this.b, aiklVar.b) && this.e == aiklVar.e && ffkj.e(this.c, aiklVar.c) && this.d == aiklVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((hashCode * 31) + this.e) * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.c;
        String d = cskw.d(this.a);
        CharSequence c = str != null ? cskw.c(str) : null;
        int i = this.e;
        String str2 = this.b;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder("DirectSendViewer(uri=");
        sb.append(d);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", primaryButtonType=");
        sb.append((Object) (i != 1 ? "ADD" : "SEND"));
        sb.append(", textCaption=");
        sb.append((Object) c);
        sb.append(", useEncryptedIcon=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
