package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzc {
    public final xze a;
    public final Uri b;

    public xzc(xze xzeVar, Uri uri) {
        this.a = xzeVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzc)) {
            return false;
        }
        xzc xzcVar = (xzc) obj;
        return ffkj.e(this.a, xzcVar.a) && ffkj.e(this.b, xzcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        Uri uri = this.b;
        String d = uri != null ? cskw.d(uri) : null;
        return "DraftAttachmentContent(mapiContent=" + this.a + ", originalUri=" + d + ")";
    }
}
