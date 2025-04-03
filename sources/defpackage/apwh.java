package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apwh {
    private String a;
    private Uri b;
    private String c;
    private Uri d;
    private boolean e;
    private short f;

    public final apwj a() {
        return new apwj(this.a, this.b, this.c, this.d, (((~this.f) & 256) == 0) & this.e);
    }

    public final void b(boolean z) {
        this.e = z;
        this.f = (short) (this.f | 256);
    }

    public final void c(String str) {
        this.c = str;
        this.f = (short) (this.f | 16);
    }

    public final void d(Uri uri) {
        this.b = uri;
        this.f = (short) (this.f | 8);
    }

    public final void e(Uri uri) {
        this.d = uri;
        this.f = (short) (this.f | 32);
    }

    public final void f(String str) {
        this.a = str;
        this.f = (short) (this.f | 1);
    }
}
