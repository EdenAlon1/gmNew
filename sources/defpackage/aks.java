package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aks extends ams {
    final /* synthetic */ akt a;

    public aks(akt aktVar) {
        this.a = aktVar;
    }

    @Override // defpackage.ams
    public final void a(amt amtVar) {
        synchronized (this.a.a) {
            akt aktVar = this.a;
            int i = aktVar.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                case 2:
                case 3:
                case 7:
                    throw new IllegalStateException(agn.a(this, "onConfigureFailed() should not be possible in state: "));
                case 1:
                    avw.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                    break;
                case 4:
                case 5:
                case 6:
                    aktVar.g();
                    break;
            }
            avw.c("CaptureSession", agn.a(this, "CameraCaptureSession.onConfigureFailed() "));
        }
    }

    @Override // defpackage.ams
    public final void b(amt amtVar) {
        synchronized (this.a.a) {
            akt aktVar = this.a;
            int i = aktVar.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 7:
                    throw new IllegalStateException(agn.a(this, "onConfigured() should not be possible in state: "));
                case 4:
                    amtVar.n();
                    break;
                case 5:
                    aktVar.d = amtVar;
                    break;
                case 6:
                    aktVar.m(8);
                    this.a.d = amtVar;
                    avw.a("CaptureSession", "Attempting to send capture request onConfigured");
                    akt aktVar2 = this.a;
                    aktVar2.o(aktVar2.e);
                    this.a.i();
                    break;
            }
            avw.a("CaptureSession", agn.a(this, "CameraCaptureSession.onConfigured() mState="));
        }
    }

    @Override // defpackage.ams
    public final void c(amt amtVar) {
        synchronized (this.a.a) {
            int i = this.a.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                throw new IllegalStateException(agn.a(this, "onReady() should not be possible in state: "));
            }
            avw.a("CaptureSession", agn.a(this, "CameraCaptureSession.onReady() "));
        }
    }

    @Override // defpackage.ams
    public final void d(amt amtVar) {
        synchronized (this.a.a) {
            if (this.a.j == 1) {
                throw new IllegalStateException(agn.a(this, "onSessionFinished() should not be possible in state: "));
            }
            avw.a("CaptureSession", "onSessionFinished()");
            this.a.g();
        }
    }
}
