package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyok implements Runnable {
    final /* synthetic */ dyol a;

    public dyok(dyol dyolVar) {
        this.a = dyolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.s();
        long b = fdpe.a.get().b();
        dyol dyolVar = this.a;
        dyolVar.m.postDelayed(dyolVar.t, b);
    }
}
