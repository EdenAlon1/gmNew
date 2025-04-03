package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwh implements dlwj {
    public final Uri a;
    public final Uri b;
    public final String c;

    public dlwh(Uri uri, Uri uri2, String str) {
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
        if (!(obj instanceof dlwh)) {
            return false;
        }
        dlwh dlwhVar = (dlwh) obj;
        return ffkj.e(this.a, dlwhVar.a) && ffkj.e(this.b, dlwhVar.b) && ffkj.e(this.c, dlwhVar.c);
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
