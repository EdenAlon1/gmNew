package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoc extends CameraCaptureSession.StateCallback {
    final /* synthetic */ aoe a;

    public aoc(aoe aoeVar) {
        this.a = aoeVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            aoe aoeVar = this.a;
            ImageWriter newInstance = ImageWriter.newInstance(inputSurface, 1);
            if (aoeVar.b.get()) {
                if (aoeVar.a != null) {
                    avw.f("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    aoeVar.a.close();
                }
                aoeVar.a = newInstance;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
    }
}
