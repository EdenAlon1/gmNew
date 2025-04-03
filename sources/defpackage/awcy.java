package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcy {
    public final awbt a;
    public final Uri b;
    public final awup c;

    public awcy(awbt awbtVar, Uri uri, awup awupVar) {
        this.a = awbtVar;
        this.b = uri;
        this.c = awupVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awcy)) {
            return false;
        }
        awcy awcyVar = (awcy) obj;
        return ffkj.e(this.a, awcyVar.a) && ffkj.e(this.b, awcyVar.b) && ffkj.e(this.c, awcyVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        awup awupVar = this.c;
        return hashCode2 + (awupVar != null ? awupVar.hashCode() : 0);
    }

    public final String toString() {
        return "UploadResumeInfo(transferHandle=" + this.a + ", fileUri=" + this.b + ", contentType=" + this.c + ")";
    }
}
