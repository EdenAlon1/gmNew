package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxtr extends dtrr {
    public long a;
    public azsu b;
    public String c;
    public Uri d;
    public boolean e;
    public boolean f;
    public long g;

    public bxtr() {
        super(bxve.f());
        this.b = null;
        this.e = true;
        this.f = false;
        this.g = 0L;
    }

    public final bxtp a() {
        bxtq bxtqVar = new bxtq();
        bxtqVar.aC(aB());
        bxtqVar.a = this.a;
        bxtqVar.b = this.b;
        bxtqVar.c = this.c;
        bxtqVar.d = this.d;
        bxtqVar.e = this.e;
        bxtqVar.f = this.f;
        bxtqVar.g = this.g;
        bxtqVar.cK = aC();
        return bxtqVar;
    }

    public final void b(boolean z) {
        aE(5);
        this.f = z;
    }

    public final void c(boolean z) {
        int i = this.aB;
        if (i < 60400) {
            dtub.w("is_self_profile_shareable", i);
        }
        aE(4);
        this.e = z;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(azsu azsuVar) {
        aE(1);
        this.b = azsuVar;
    }

    public final void f(Uri uri) {
        aE(3);
        this.d = uri;
    }

    public final void g(long j) {
        aE(6);
        this.g = j;
    }
}
