package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmiz implements dmjb {
    private final Uri a;
    private final String b;
    private final ffix c;

    public dmiz(Uri uri, String str, ffix ffixVar) {
        uri.getClass();
        this.a = uri;
        this.b = str;
        this.c = ffixVar;
    }

    @Override // defpackage.dmjb
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.dmjb
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dmjb
    public final ffix c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmiz)) {
            return false;
        }
        dmiz dmizVar = (dmiz) obj;
        return ffkj.e(this.a, dmizVar.a) && ffkj.e(this.b, dmizVar.b) && ffkj.e(this.c, dmizVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Image(uri=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
