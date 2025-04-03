package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahs extends CameraDevice.StateCallback {
    ScheduledFuture a;
    final /* synthetic */ ahu b;
    private final Executor c;
    private final ScheduledExecutorService d;
    private ahr e;
    private final ahp f;

    public ahs(ahu ahuVar, Executor executor, ScheduledExecutorService scheduledExecutorService, long j) {
        this.b = ahuVar;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.f = new ahp(this, j);
    }

    final void a() {
        this.f.d();
    }

    final void b() {
        ksw.c(this.e == null);
        ksw.c(this.a == null);
        ahp ahpVar = this.f;
        if (ahpVar.c() >= ahpVar.b()) {
            ahpVar.d();
            avw.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f.b() + "ms without success.");
            this.b.M(4, null, false);
            return;
        }
        this.e = new ahr(this, this.c);
        this.b.q("Attempting camera re-open in " + this.f.a() + "ms: " + this.e + " activeResuming = " + this.b.x);
        this.a = this.d.schedule(this.e, (long) this.f.a(), TimeUnit.MILLISECONDS);
    }

    final boolean c() {
        if (this.a == null) {
            return false;
        }
        ahu ahuVar = this.b;
        ahr ahrVar = this.e;
        Objects.toString(ahrVar);
        ahuVar.q("Cancelling scheduled re-open: ".concat(String.valueOf(ahrVar)));
        this.e.a = true;
        this.e = null;
        this.a.cancel(false);
        this.a = null;
        return true;
    }

    final boolean d() {
        ahu ahuVar = this.b;
        if (!ahuVar.x) {
            return false;
        }
        int i = ahuVar.i;
        return i == 1 || i == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.b.q("CameraDevice.onClosed()");
        CameraDevice cameraDevice2 = this.b.h;
        Objects.toString(cameraDevice);
        ksw.d(cameraDevice2 == null, "Unexpected onClose callback on camera device: ".concat(String.valueOf(cameraDevice)));
        int i = this.b.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 5) {
            ksw.c(this.b.J());
            this.b.p();
            return;
        }
        if (i2 != 6 && i2 != 7) {
            int i3 = this.b.A;
            Objects.toString(aho.a(i3));
            throw new IllegalStateException("Camera closed while in state: ".concat(aho.a(i3)));
        }
        ahu ahuVar = this.b;
        int i4 = ahuVar.i;
        if (i4 == 0) {
            ahuVar.D(false);
        } else {
            ahuVar.q("Camera closed due to error: ".concat(ahu.j(i4)));
            b();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.q("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(android.hardware.camera2.CameraDevice r11, int r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahs.onError(android.hardware.camera2.CameraDevice, int):void");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.b.q("CameraDevice.onOpened()");
        ahu ahuVar = this.b;
        ahuVar.h = cameraDevice;
        ahuVar.i = 0;
        a();
        int i = this.b.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 5) {
            ksw.c(this.b.J());
            this.b.h.close();
            this.b.h = null;
        } else {
            if (i2 != 6 && i2 != 7 && i2 != 8) {
                int i3 = this.b.A;
                Objects.toString(aho.a(i3));
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(aho.a(i3)));
            }
            this.b.K(10);
            ahu ahuVar2 = this.b;
            cameraDevice.getId();
            ahu ahuVar3 = this.b;
            ahuVar3.p.a(ahuVar3.h.getId());
            ahuVar2.q.f();
            this.b.y();
        }
    }
}
