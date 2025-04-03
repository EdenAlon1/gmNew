package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ble implements avi {
    public final avi a;
    public final Object b = new Object();
    public avj c;
    private boolean d;

    public ble(avi aviVar) {
        this.a = aviVar;
    }

    @Override // defpackage.avi
    public final void a(long j, avj avjVar) {
        ffcu ffcuVar;
        avjVar.getClass();
        synchronized (this.b) {
            this.d = true;
            this.c = avjVar;
        }
        avi aviVar = this.a;
        if (aviVar != null) {
            aviVar.a(j, new avj() { // from class: bld
                @Override // defpackage.avj
                public final void a() {
                    ble bleVar = ble.this;
                    synchronized (bleVar.b) {
                        if (bleVar.c == null) {
                            avw.f("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        bleVar.d();
                    }
                }
            });
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            avw.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            d();
        }
    }

    @Override // defpackage.avi
    public final void b() {
        c();
    }

    public final void c() {
        ffcu ffcuVar;
        synchronized (this.b) {
            if (this.d) {
                avi aviVar = this.a;
                if (aviVar != null) {
                    aviVar.b();
                    ffcuVar = ffcu.a;
                } else {
                    ffcuVar = null;
                }
                if (ffcuVar == null) {
                    avw.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                avw.f("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
            }
            this.d = false;
        }
    }

    public final void d() {
        synchronized (this.b) {
            avj avjVar = this.c;
            if (avjVar != null) {
                avjVar.a();
            }
            this.c = null;
        }
    }
}
