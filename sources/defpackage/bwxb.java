package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwxb extends dtrr {
    public String a;
    public Uri b;
    public String c;
    public int d;
    public int e;
    public long f;

    public bwxb() {
        super(bwyj.a().P());
    }

    public final bwwz a() {
        bwxa bwxaVar = new bwxa();
        bwxaVar.aC(aB());
        bwxaVar.a = this.a;
        bwxaVar.b = this.b;
        bwxaVar.c = this.c;
        bwxaVar.d = this.d;
        bwxaVar.e = this.e;
        bwxaVar.f = this.f;
        bwxaVar.cK = aC();
        return bwxaVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(Uri uri) {
        aE(1);
        this.b = uri;
    }

    public final void d(int i) {
        aE(4);
        this.e = i;
    }

    public final void e(long j) {
        aE(5);
        this.f = j;
    }

    public final void f(String str) {
        aE(0);
        this.a = str;
    }

    public final void g(int i) {
        aE(3);
        this.d = i;
    }
}
