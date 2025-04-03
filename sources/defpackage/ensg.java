package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ensg implements Runnable {
    final /* synthetic */ ensf a;
    final /* synthetic */ ensh b;

    public ensg(ensh enshVar, ensf ensfVar) {
        this.a = ensfVar;
        this.b = enshVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.remove(this.a);
    }
}
