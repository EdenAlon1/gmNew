package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feye implements Runnable {
    final /* synthetic */ feyg a;

    public feye(feyg feygVar) {
        this.a = feygVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feyg feygVar = this.a;
        feygVar.l.execute(feygVar.n);
        synchronized (this.a.j) {
            feyg feygVar2 = this.a;
            feygVar2.u = Alert.DURATION_SHOW_INDEFINITELY;
            feygVar2.r();
        }
    }
}
