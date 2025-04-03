package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feox implements Runnable {
    final /* synthetic */ feqc a;

    public feox(feqc feqcVar) {
        this.a = feqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.H.a(2, "Entering SHUTDOWN state");
        this.a.p.a(fdyc.SHUTDOWN);
    }
}
