package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docv implements docy {
    public final ffix a;
    public final ffix b;
    private final Uri c;

    public docv(Uri uri, ffix ffixVar, ffix ffixVar2) {
        this.c = uri;
        this.a = ffixVar;
        this.b = ffixVar2;
        docr docrVar = docr.a;
    }

    @Override // defpackage.docy
    public final Uri a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof docv)) {
            return false;
        }
        docv docvVar = (docv) obj;
        return ffkj.e(this.c, docvVar.c) && ffkj.e(this.a, docvVar.a) && ffkj.e(this.b, docvVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LoadedImage(uri=" + this.c + ", onError=" + this.a + ", onClick=" + this.b + ")";
    }
}
