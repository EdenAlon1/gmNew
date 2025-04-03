package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dynw implements Runnable {
    public final /* synthetic */ dyol a;

    public /* synthetic */ dynw(dyol dyolVar) {
        this.a = dyolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long a = fdpz.a.get().a();
        final long a2 = fdpz.a();
        final dyol dyolVar = this.a;
        erqt.l(new Runnable() { // from class: dynx
            @Override // java.lang.Runnable
            public final void run() {
                dyol.this.u(a2);
            }
        }, dyolVar.c);
        dyolVar.m.postDelayed(new dynw(dyolVar), a);
    }
}
