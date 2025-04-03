package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docx implements docy {
    public final docr a;
    public final Uri b;
    public final Float c;
    public final ffix d;

    public docx(docr docrVar, Uri uri, Float f, ffix ffixVar) {
        docrVar.getClass();
        this.a = docrVar;
        this.b = uri;
        this.c = f;
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
        if (!(obj instanceof docx)) {
            return false;
        }
        docx docxVar = (docx) obj;
        return this.a == docxVar.a && ffkj.e(this.b, docxVar.b) && ffkj.e(this.c, docxVar.c) && ffkj.e(this.d, docxVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Float f = this.c;
        return ((hashCode2 + (f != null ? f.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Loading(type=" + this.a + ", uri=" + this.b + ", progress=" + this.c + ", onClick=" + this.d + ")";
    }
}
