package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dclv extends dcqb {
    public Uri a;
    public String b;
    private int c;
    private int d;
    private long e;
    private byte f;

    @Override // defpackage.dcqb
    public final dcqc a() {
        Uri uri;
        String str;
        if (this.f == 7 && (uri = this.a) != null && (str = this.b) != null) {
            return new dclw(uri, this.c, this.d, this.e, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" uri");
        }
        if ((this.f & 1) == 0) {
            sb.append(" width");
        }
        if ((this.f & 2) == 0) {
            sb.append(" height");
        }
        if ((this.f & 4) == 0) {
            sb.append(" durationMillis");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dcqb
    public final void b(long j) {
        this.e = j;
        this.f = (byte) (this.f | 4);
    }

    @Override // defpackage.dcqb
    public final void c(int i) {
        this.d = i;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.dcqb
    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.a = uri;
    }

    @Override // defpackage.dcqb
    public final void e(int i) {
        this.c = i;
        this.f = (byte) (this.f | 1);
    }
}
