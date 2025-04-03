package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mf implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ int c;
    final /* synthetic */ mh d;

    public mf(mh mhVar, List list, List list2, int i) {
        this.d = mhVar;
        this.a = list;
        this.b = list2;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.c.execute(new me(this, mv.a(new md(this))));
    }
}
