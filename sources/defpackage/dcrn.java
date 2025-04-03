package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcrn implements Runnable {
    final /* synthetic */ dcrr a;

    public dcrn(dcrr dcrrVar) {
        this.a = dcrrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.g == 8) {
            return;
        }
        this.a.g(false);
        dcrr dcrrVar = this.a;
        dcrrVar.i = dcrrVar.k;
        dcrrVar.j = dcrrVar.l;
        dcrrVar.g = 0;
        dcrr dcrrVar2 = this.a;
        dcrrVar2.k(dcrrVar2.i, dcrrVar2.j);
        this.a.o = false;
    }
}
