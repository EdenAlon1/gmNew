package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwd implements dlwf {
    public final Uri a;
    public final Uri b;
    public final String c;

    public dlwd(Uri uri, Uri uri2, String str) {
        this.a = uri;
        this.b = uri2;
        this.c = str;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlwd)) {
            return false;
        }
        dlwd dlwdVar = (dlwd) obj;
        return ffkj.e(this.a, dlwdVar.a) && ffkj.e(this.b, dlwdVar.b) && ffkj.e(this.c, dlwdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return ((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Loaded(uri=" + this.a + ", fallbackUri=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
