package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docs implements docy {
    public final docr a;
    public final Uri b;
    public final String c;
    public final ffix d;

    public docs(docr docrVar, Uri uri, String str, ffix ffixVar) {
        docrVar.getClass();
        this.a = docrVar;
        this.b = uri;
        this.c = str;
        this.d = ffixVar;
    }

    @Override // defpackage.docy
    public final Uri a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof docs)) {
            return false;
        }
        docs docsVar = (docs) obj;
        return this.a == docsVar.a && ffkj.e(this.b, docsVar.b) && ffkj.e(this.c, docsVar.c) && ffkj.e(this.d, docsVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.c;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Downloadable(type=" + this.a + ", uri=" + this.b + ", label=" + this.c + ", onClick=" + this.d + ")";
    }
}
