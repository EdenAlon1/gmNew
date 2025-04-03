package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akq extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ akt a;

    public akq(akt aktVar) {
        this.a = aktVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.a.a) {
            bgk bgkVar = this.a.e;
            if (bgkVar == null) {
                return;
            }
            bdk bdkVar = bgkVar.g;
            avw.a("CaptureSession", "Submit FLASH_MODE_OFF request");
            akt aktVar = this.a;
            bdi bdiVar = new bdi();
            bdiVar.b = bdkVar.f;
            Iterator it = bdkVar.e().iterator();
            while (it.hasNext()) {
                bdiVar.g((bdy) it.next());
            }
            bdiVar.f(bdkVar.e);
            afl aflVar = new afl();
            aflVar.d(CaptureRequest.FLASH_MODE, 0);
            bdiVar.f(aflVar.a());
            aktVar.h(Collections.singletonList(bdiVar.b()));
        }
    }
}
