package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class apl extends apk {
    public apl(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    @Override // defpackage.apo
    public void a(aqx aqxVar) {
        ksw.h(aqxVar.a());
        List b = aqxVar.b();
        if (b == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (aqxVar.d() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id = this.a.getId();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String c = ((aql) it.next()).a.c();
            if (c != null && !c.isEmpty()) {
                avw.f("CameraDeviceCompat", a.d(c, id, "Camera ", ": Camera doesn't support physicalCameraId ", ". Ignoring."));
            }
        }
        aow aowVar = new aow(aqxVar.d(), aqxVar.a());
        List b2 = aqxVar.b();
        Object obj = this.b;
        ksw.h(obj);
        aqk c2 = aqxVar.a.c();
        Handler handler = ((apn) obj).a;
        try {
            if (c2 != null) {
                this.a.createReprocessableCaptureSessionByConfigurations((InputConfiguration) c2.b(), aqx.c(b2), aowVar, handler);
            } else {
                if (aqxVar.a.a() != 1) {
                    this.a.createCaptureSessionByOutputConfigurations(aqx.c(b2), aowVar, handler);
                    return;
                }
                CameraDevice cameraDevice = this.a;
                ArrayList arrayList = new ArrayList(b2.size());
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((aql) it2.next()).a());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, aowVar, handler);
            }
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }
}
