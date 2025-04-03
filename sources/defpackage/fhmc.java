package defpackage;

import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhmc implements fhgl {
    final /* synthetic */ fhmd a;
    private boolean b;

    public fhmc(fhmd fhmdVar) {
        this.a = fhmdVar;
    }

    @Override // defpackage.fhgl
    public final fhhb a(fhiu fhiuVar) {
        synchronized (this.a.h) {
            fhmd fhmdVar = this.a;
            fhmdVar.j = false;
            fhmdVar.k = ((fhig) fhiuVar.a()).a.b;
            fhmdVar.l = ((fhig) fhiuVar.a()).d;
            fhmdVar.h.notifyAll();
            while (!this.b) {
                try {
                    this.a.h.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        fhgv fhgvVar = fhiuVar.c;
        fhgz fhgzVar = fhgvVar.d;
        if (fhgzVar instanceof fhmg) {
            fhgvVar = ((fhmg) fhgzVar).e(fhgvVar);
        }
        fhhb b = fhiuVar.b(fhgvVar);
        synchronized (this.a.h) {
            fhmd fhmdVar2 = this.a;
            fhmdVar2.i = b;
            fhmdVar2.url = b.a.a.g();
        }
        return b;
    }

    public final void b() {
        synchronized (this.a.h) {
            this.b = true;
            this.a.h.notifyAll();
        }
    }
}
