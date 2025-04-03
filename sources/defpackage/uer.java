package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uer extends ufl {
    public Size a;
    public Uri b;
    private String c;
    private Uri d;
    private eohh e;
    private String f;

    @Override // defpackage.ufl
    public final ufm a() {
        Uri uri;
        eohh eohhVar;
        Size size;
        String str;
        String str2 = this.c;
        if (str2 != null && (uri = this.d) != null && (eohhVar = this.e) != null && (size = this.a) != null && (str = this.f) != null) {
            return new ues(str2, uri, eohhVar, size, str, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" contentType");
        }
        if (this.d == null) {
            sb.append(" uri");
        }
        if (this.e == null) {
            sb.append(" contentSource");
        }
        if (this.a == null) {
            sb.append(" size");
        }
        if (this.f == null) {
            sb.append(" domain");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ufl
    public final void b(eohh eohhVar) {
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.e = eohhVar;
    }

    @Override // defpackage.ufl
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.c = str;
    }

    @Override // defpackage.ufl
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null domain");
        }
        this.f = str;
    }

    @Override // defpackage.ufl
    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.d = uri;
    }
}
