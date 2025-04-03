package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfsw implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dfsz b;

    public dfsw(dfsz dfszVar, int i) {
        this.a = i;
        this.b = dfszVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h(this.a);
    }
}
