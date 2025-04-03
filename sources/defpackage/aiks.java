package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiks implements aihs {
    public final Uri a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;

    public aiks(Uri uri, String str, String str2, long j, boolean z) {
        str.getClass();
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiks)) {
            return false;
        }
        aiks aiksVar = (aiks) obj;
        return ffkj.e(this.a, aiksVar.a) && ffkj.e(this.b, aiksVar.b) && ffkj.e(this.c, aiksVar.c) && this.d == aiksVar.d && this.e == aiksVar.e;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        int i = true != this.e ? 1237 : 1231;
        long j = this.d;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + i;
    }

    public final String toString() {
        return "FileViewer(fileUri=" + this.a + ", contentType=" + this.b + ", fileName=" + this.c + ", fileSize=" + this.d + ", saveUnsupportedFile=" + this.e + ")";
    }
}
