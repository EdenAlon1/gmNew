package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bje implements Runnable {
    final /* synthetic */ bjf a;

    public bje(bjf bjfVar) {
        this.a = bjfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.c.a.getAndSet(null) != null) {
            bjf bjfVar = this.a;
            bjfVar.a.removeCallbacks(bjfVar.c);
        }
    }
}
