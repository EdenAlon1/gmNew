package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doct implements docy {
    public final docr a;
    public final ffix b;
    private final Uri c;

    public doct(docr docrVar, Uri uri, ffix ffixVar) {
        docrVar.getClass();
        this.a = docrVar;
        this.c = uri;
        this.b = ffixVar;
    }

    @Override // defpackage.docy
    public final Uri a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doct)) {
            return false;
        }
        doct doctVar = (doct) obj;
        return this.a == doctVar.a && ffkj.e(this.c, doctVar.c) && ffkj.e(this.b, doctVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.c;
        return ((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.a + ", uri=" + this.c + ", onClick=" + this.b + ")";
    }
}
