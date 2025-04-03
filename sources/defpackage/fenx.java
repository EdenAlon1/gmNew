package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenx implements Runnable {
    final /* synthetic */ fekh a;
    final /* synthetic */ boolean b;
    final /* synthetic */ feoi c;

    public fenx(feoi feoiVar, fekh fekhVar, boolean z) {
        this.a = fekhVar;
        this.b = z;
        this.c = feoiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.o.c(this.a, this.b);
    }
}
