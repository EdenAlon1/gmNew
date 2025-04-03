package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uet extends ufn {
    public String a;
    public Size b;
    public String c;
    private Uri d;
    private eohh e;
    private double f;
    private double g;
    private byte h;

    @Override // defpackage.ufn
    public final ufo a() {
        String str;
        Uri uri;
        eohh eohhVar;
        Size size;
        String str2;
        if (this.h == 3 && (str = this.a) != null && (uri = this.d) != null && (eohhVar = this.e) != null && (size = this.b) != null && (str2 = this.c) != null) {
            return new ueu(str, uri, eohhVar, size, str2, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contentType");
        }
        if (this.d == null) {
            sb.append(" uri");
        }
        if (this.e == null) {
            sb.append(" contentSource");
        }
        if (this.b == null) {
            sb.append(" size");
        }
        if (this.c == null) {
            sb.append(" captionText");
        }
        if ((this.h & 1) == 0) {
            sb.append(" longitude");
        }
        if ((this.h & 2) == 0) {
            sb.append(" latitude");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ufn
    public final void b(eohh eohhVar) {
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.e = eohhVar;
    }

    @Override // defpackage.ufn
    public final void c(double d) {
        this.g = d;
        this.h = (byte) (this.h | 2);
    }

    @Override // defpackage.ufn
    public final void d(double d) {
        this.f = d;
        this.h = (byte) (this.h | 1);
    }

    @Override // defpackage.ufn
    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.d = uri;
    }
}
