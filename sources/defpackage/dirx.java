package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirx extends Thread {
    final /* synthetic */ diry a;

    public dirx(diry diryVar) {
        this.a = diryVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.b.abort();
    }
}
