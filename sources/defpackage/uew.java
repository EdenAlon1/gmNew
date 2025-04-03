package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uew extends ufq {
    public String a;
    public apra b;
    private Uri c;
    private eohh d;
    private long e;
    private byte f;

    @Override // defpackage.ufq
    public final ufr a() {
        String str;
        Uri uri;
        eohh eohhVar;
        if (this.f == 1 && (str = this.a) != null && (uri = this.c) != null && (eohhVar = this.d) != null) {
            return new uex(str, uri, eohhVar, this.b, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contentType");
        }
        if (this.c == null) {
            sb.append(" uri");
        }
        if (this.d == null) {
            sb.append(" contentSource");
        }
        if (this.f == 0) {
            sb.append(" fileSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ufq
    public final void b(eohh eohhVar) {
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.d = eohhVar;
    }

    @Override // defpackage.ufq
    public final void c(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    @Override // defpackage.ufq
    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.c = uri;
    }
}
