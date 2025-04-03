package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uec extends ufk {
    public Size a;
    public boolean b;
    public Uri c;
    public Uri d;
    public String e;
    public byte f;
    public int g;
    private String i;
    private Uri j;
    private eohh k;
    private long l;
    private boolean m;
    private Optional n;
    private byza o;

    public uec() {
        this.n = Optional.empty();
    }

    @Override // defpackage.ufk
    public final GalleryContent a() {
        if (this.f == 7 && this.i != null && this.j != null && this.k != null && this.a != null && this.o != null && this.g != 0) {
            return new ueq(this.i, this.j, this.k, this.a, this.l, this.m, this.b, this.c, this.n, this.o, this.d, this.e, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" contentType");
        }
        if (this.j == null) {
            sb.append(" uri");
        }
        if (this.k == null) {
            sb.append(" contentSource");
        }
        if (this.a == null) {
            sb.append(" size");
        }
        if ((this.f & 1) == 0) {
            sb.append(" mediaModifiedTimestamp");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isResizable");
        }
        if ((this.f & 4) == 0) {
            sb.append(" saveToExternalStorage");
        }
        if (this.o == null) {
            sb.append(" mediaSendType");
        }
        if (this.g == 0) {
            sb.append(" displayState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ufk
    public final eohh b() {
        eohh eohhVar = this.k;
        if (eohhVar != null) {
            return eohhVar;
        }
        throw new IllegalStateException("Property \"contentSource\" has not been set");
    }

    @Override // defpackage.ufk
    public final Optional c() {
        return (this.f & 2) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.m));
    }

    @Override // defpackage.ufk
    public final String d() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"contentType\" has not been set");
    }

    @Override // defpackage.ufk
    public final void e(eohh eohhVar) {
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.k = eohhVar;
    }

    @Override // defpackage.ufk
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.i = str;
    }

    @Override // defpackage.ufk
    public final void g(long j) {
        this.n = Optional.of(Long.valueOf(j));
    }

    @Override // defpackage.ufk
    public final void h(boolean z) {
        this.m = z;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.ufk
    public final void i(long j) {
        this.l = j;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.ufk
    public final void j(byza byzaVar) {
        if (byzaVar == null) {
            throw new NullPointerException("Null mediaSendType");
        }
        this.o = byzaVar;
    }

    @Override // defpackage.ufk
    public final void k(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.j = uri;
    }

    public uec(GalleryContent galleryContent) {
        this.n = Optional.empty();
        this.i = galleryContent.b();
        this.j = galleryContent.e();
        this.k = galleryContent.i();
        this.a = galleryContent.f();
        this.l = galleryContent.a();
        this.m = galleryContent.l();
        this.b = galleryContent.m();
        this.c = galleryContent.d();
        this.n = galleryContent.j();
        this.o = galleryContent.h();
        this.d = galleryContent.c();
        this.e = galleryContent.k();
        this.g = galleryContent.n();
        this.f = (byte) 7;
    }
}
