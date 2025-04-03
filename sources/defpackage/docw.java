package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docw implements docy {
    public final String a;
    public final ffix b;
    public final ffix c;
    private final Uri d;

    public docw(Uri uri, String str, ffix ffixVar, ffix ffixVar2) {
        this.d = uri;
        this.a = str;
        this.b = ffixVar;
        this.c = ffixVar2;
        docr docrVar = docr.a;
    }

    @Override // defpackage.docy
    public final Uri a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof docw)) {
            return false;
        }
        docw docwVar = (docw) obj;
        return ffkj.e(this.d, docwVar.d) && ffkj.e(this.a, docwVar.a) && ffkj.e(this.b, docwVar.b) && ffkj.e(this.c, docwVar.c);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        String str = this.a;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LoadedVideo(uri=" + this.d + ", duration=" + this.a + ", onError=" + this.b + ", onClick=" + this.c + ")";
    }
}
