package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwyq extends dtrr {
    public Uri a;
    public Uri b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    public bwyq() {
        super(bxad.a().P());
    }

    public final bwyo a() {
        bwyp bwypVar = new bwyp();
        bwypVar.aC(aB());
        bwypVar.a = this.a;
        bwypVar.b = this.b;
        bwypVar.c = this.c;
        bwypVar.d = this.d;
        bwypVar.e = this.e;
        bwypVar.f = this.f;
        bwypVar.g = this.g;
        bwypVar.cK = aC();
        return bwypVar;
    }

    public final void b(Uri uri) {
        aE(1);
        this.b = uri;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(int i) {
        aE(5);
        this.f = i;
    }

    public final void e(String str) {
        aE(3);
        this.d = str;
    }

    public final void f(Uri uri) {
        aE(0);
        this.a = uri;
    }

    public final void g(int i) {
        aE(4);
        this.e = i;
    }
}
