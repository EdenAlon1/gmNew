package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embw extends ernr implements Runnable {
    public final errj a;

    public embw(errj errjVar, embx embxVar) {
        this.a = errjVar;
        errjVar.b(embxVar, erpp.a);
        erqt.r(errjVar, new embv(this), erpp.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
