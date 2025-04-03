package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pud implements Runnable {
    final /* synthetic */ pyj a;
    final /* synthetic */ pue b;

    public pud(pue pueVar, pyj pyjVar) {
        this.b = pueVar;
        this.a = pyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ppt.c().a(pue.a, "Scheduling work ".concat(this.a.c));
        this.b.b.c(this.a);
    }
}
