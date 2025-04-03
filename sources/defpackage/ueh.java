package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueh extends uez {
    public Size a;
    public int b;
    private String c;
    private Uri d;
    private eohh e;
    private Optional f = Optional.empty();
    private long g;
    private boolean h;
    private boolean i;
    private epsw j;
    private byte k;

    @Override // defpackage.uez
    public final ufa a() {
        String str;
        Uri uri;
        eohh eohhVar;
        Size size;
        epsw epswVar;
        if (this.k == 7 && (str = this.c) != null && (uri = this.d) != null && (eohhVar = this.e) != null && (size = this.a) != null && (epswVar = this.j) != null && this.b != 0) {
            return new uei(str, uri, eohhVar, size, this.f, this.g, this.h, this.i, epswVar);
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
        if ((this.k & 1) == 0) {
            sb.append(" mediaModifiedTimestamp");
        }
        if ((this.k & 2) == 0) {
            sb.append(" isResizable");
        }
        if ((this.k & 4) == 0) {
            sb.append(" saveToExternalStorage");
        }
        if (this.j == null) {
            sb.append(" captureInfo");
        }
        if (this.b == 0) {
            sb.append(" displayState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.uez
    public final eohh b() {
        eohh eohhVar = this.e;
        if (eohhVar != null) {
            return eohhVar;
        }
        throw new IllegalStateException("Property \"contentSource\" has not been set");
    }

    @Override // defpackage.uez
    public final Optional c() {
        return (this.k & 2) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.h));
    }

    @Override // defpackage.uez
    public final Optional d() {
        return (this.k & 4) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.i));
    }

    @Override // defpackage.uez
    public final void e(epsw epswVar) {
        if (epswVar == null) {
            throw new NullPointerException("Null captureInfo");
        }
        this.j = epswVar;
    }

    @Override // defpackage.uez
    public final void f(eohh eohhVar) {
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.e = eohhVar;
    }

    @Override // defpackage.uez
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.c = str;
    }

    @Override // defpackage.uez
    public final void h(long j) {
        this.f = Optional.of(Long.valueOf(j));
    }

    @Override // defpackage.uez
    public final void i(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 2);
    }

    @Override // defpackage.uez
    public final void j(long j) {
        this.g = j;
        this.k = (byte) (this.k | 1);
    }

    @Override // defpackage.uez
    public final void k(boolean z) {
        this.i = z;
        this.k = (byte) (this.k | 4);
    }

    @Override // defpackage.uez
    public final void l(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.d = uri;
    }
}
