package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btt extends bbt {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ kfb b;
    final /* synthetic */ bgc c;
    private boolean d = true;

    public btt(AtomicBoolean atomicBoolean, kfb kfbVar, bgc bgcVar) {
        this.a = atomicBoolean;
        this.b = kfbVar;
        this.c = bgcVar;
    }

    @Override // defpackage.bbt
    public final void b(int i, bcd bcdVar) {
        Object c;
        if (this.d) {
            this.d = false;
            avw.a("VideoCapture", "cameraCaptureResult timestampNs = " + bcdVar.a() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        if (this.a.get() || (c = bcdVar.f().c("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) c).intValue() != this.b.hashCode() || !this.b.b(null) || this.a.getAndSet(true)) {
            return;
        }
        final bgc bgcVar = this.c;
        bjm.a().execute(new Runnable() { // from class: bts
            @Override // java.lang.Runnable
            public final void run() {
                bgcVar.p(btt.this);
            }
        });
    }
}
