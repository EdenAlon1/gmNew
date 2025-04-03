package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apnk extends apon {
    public String a;
    public apra b;
    private Uri c;

    @Override // defpackage.apon
    public final apoo a() {
        Uri uri;
        String str = this.a;
        if (str != null && (uri = this.c) != null) {
            return new apnl(str, uri, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contentType");
        }
        if (this.c == null) {
            sb.append(" uri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.apon
    public final void b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.c = uri;
    }
}
