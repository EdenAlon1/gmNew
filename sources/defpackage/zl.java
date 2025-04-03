package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zl {
    final zk a;
    final zj b = new zj();

    public zl(zk zkVar) {
        this.a = zkVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        zk zkVar = this.a;
        int d = zkVar.d();
        int c = zkVar.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            zk zkVar2 = this.a;
            View e = zkVar2.e(i5);
            this.b.c(d, c, zkVar2.b(e), this.a.a(e));
            this.b.b();
            this.b.a(i3);
            zj zjVar = this.b;
            if (zjVar.d()) {
                return e;
            }
            if (i4 != 0) {
                zjVar.b();
                this.b.a(i4);
                if (this.b.d()) {
                    view = e;
                }
            }
            i5 += i2 > i ? 1 : -1;
        }
        return view;
    }

    public final boolean b(View view) {
        zj zjVar = this.b;
        zk zkVar = this.a;
        zjVar.c(zkVar.d(), zkVar.c(), zkVar.b(view), zkVar.a(view));
        this.b.b();
        this.b.a(24579);
        return this.b.d();
    }
}
