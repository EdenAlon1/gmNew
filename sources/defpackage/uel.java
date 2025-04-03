package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uel extends uff {
    public Size a;
    private String b;
    private Uri c;
    private eohh d;
    private String e;

    @Override // defpackage.uff
    public final ufg a() {
        Uri uri;
        eohh eohhVar;
        Size size;
        String str;
        String str2 = this.b;
        if (str2 != null && (uri = this.c) != null && (eohhVar = this.d) != null && (size = this.a) != null && (str = this.e) != null) {
            return new uem(str2, uri, eohhVar, size, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" contentType");
        }
        if (this.c == null) {
            sb.append(" uri");
        }
        if (this.d == null) {
            sb.append(" contentSource");
        }
        if (this.a == null) {
            sb.append(" size");
        }
        if (this.e == null) {
            sb.append(" stickerName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.uff
    public final void b(eohh eohhVar) {
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.d = eohhVar;
    }

    @Override // defpackage.uff
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = str;
    }

    @Override // defpackage.uff
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null stickerName");
        }
        this.e = str;
    }

    @Override // defpackage.uff
    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.c = uri;
    }
}
