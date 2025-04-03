package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkgc implements Runnable {
    final /* synthetic */ dkgd a;

    public dkgc(dkgd dkgdVar) {
        this.a = dkgdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dkho dkhoVar = dkho.INITIAL;
        while (this.a.a != dkho.STOPPED) {
            try {
                try {
                    if (dkhoVar == this.a.a) {
                        synchronized (this.a.b) {
                            try {
                                this.a.b.wait(15000L);
                            } catch (InterruptedException unused) {
                                dkty.q("Interrupted", new Object[0]);
                            }
                        }
                    } else {
                        dkhoVar = this.a.a;
                        dkty.c("Processing state: %s", dkhoVar);
                        if (dkhoVar == dkho.INITIAL) {
                            this.a.a = dkho.STARTING;
                        } else if (dkhoVar == dkho.STARTING) {
                            dkgd dkgdVar = this.a;
                            try {
                                dkgdVar.d();
                            } catch (Exception e) {
                                dkty.i(e, "Error while calling starting: %s", e.getMessage());
                                dkgdVar.c = e;
                                dkgdVar.a = dkho.STOPPING;
                            }
                            if (this.a.a == dkho.STARTING) {
                                this.a.a = dkho.RUNNING;
                                dkgd dkgdVar2 = this.a;
                                try {
                                    dkgdVar2.c();
                                } catch (Exception e2) {
                                    dkty.i(e2, "Error while calling started: %s", e2.getMessage());
                                    dkgdVar2.c = e2;
                                    dkgdVar2.a = dkho.STOPPING;
                                }
                            }
                        } else if (dkhoVar == dkho.RUNNING) {
                            dkgd dkgdVar3 = this.a;
                            try {
                                dkgdVar3.b();
                            } catch (Exception e3) {
                                dkty.i(e3, "Error while calling run: %s", e3.getMessage());
                                dkgdVar3.c = e3;
                                dkgdVar3.a = dkho.STOPPING;
                            }
                        } else if (dkhoVar == dkho.STOPPING) {
                            dkgd dkgdVar4 = this.a;
                            try {
                                try {
                                    dkty.c("On stopping", new Object[0]);
                                    Throwable th = dkgdVar4.c;
                                    if (th == null) {
                                        dkgdVar4.f();
                                    } else {
                                        dkgdVar4.g(th);
                                    }
                                } catch (Exception e4) {
                                    dkty.i(e4, "Error while calling stopping: %s", e4.getMessage());
                                    dkgdVar4.a = dkho.STOPPED;
                                }
                            } finally {
                                dkgdVar4.a = dkho.STOPPED;
                            }
                        }
                    }
                } catch (Exception e5) {
                    dkty.i(e5, "Error while running session: %s", e5.getMessage());
                }
            } finally {
                this.a.p();
            }
        }
    }
}
