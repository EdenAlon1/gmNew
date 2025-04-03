package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bad {
    public final int a;
    bax b;
    public final avg c;
    public final Rect d;
    public final int e;
    public final int f;
    public final Matrix g;
    public final String h;
    final ListenableFuture j;
    public final bag l;
    public int k = -1;
    public final List i = new ArrayList();

    public bad(bdh bdhVar, bax baxVar, bag bagVar, ListenableFuture listenableFuture, int i) {
        this.a = i;
        this.b = baxVar;
        this.c = baxVar.g();
        this.f = baxVar.b();
        this.e = baxVar.c();
        this.d = baxVar.e();
        this.g = baxVar.d();
        this.l = bagVar;
        this.h = String.valueOf(bdhVar.hashCode());
        List<bdl> a = bdhVar.a();
        a.getClass();
        for (bdl bdlVar : a) {
            this.i.add(0);
        }
        this.j = listenableFuture;
    }

    final boolean a() {
        return this.l.f;
    }
}
