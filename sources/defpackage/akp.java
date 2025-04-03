package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akp implements bjt {
    final /* synthetic */ akt a;

    public akp(akt aktVar) {
        this.a = aktVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        synchronized (this.a.a) {
            this.a.c.e();
            int i = this.a.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if ((i2 == 4 || i2 == 5 || i2 == 6) && !(th instanceof CancellationException)) {
                avw.g("CaptureSession", "Opening session with fail " + ((Object) akr.a(this.a.j)), th);
                this.a.g();
            }
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
