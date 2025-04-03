package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uen extends ufh {
    public eohh a;
    private String b;
    private Uri c;
    private String d;
    private long e;
    private byte f;

    @Override // defpackage.ufh
    public final ufi a() {
        String str;
        Uri uri;
        eohh eohhVar;
        String str2;
        if (this.f == 1 && (str = this.b) != null && (uri = this.c) != null && (eohhVar = this.a) != null && (str2 = this.d) != null) {
            return new ueo(str, uri, eohhVar, str2, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" contentType");
        }
        if (this.c == null) {
            sb.append(" uri");
        }
        if (this.a == null) {
            sb.append(" contentSource");
        }
        if (this.d == null) {
            sb.append(" fileName");
        }
        if (this.f == 0) {
            sb.append(" fileSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ufh
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = str;
    }

    @Override // defpackage.ufh
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null fileName");
        }
        this.d = str;
    }

    @Override // defpackage.ufh
    public final void d(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    @Override // defpackage.ufh
    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.c = uri;
    }
}
