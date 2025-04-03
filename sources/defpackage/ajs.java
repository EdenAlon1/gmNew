package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajs {
    public static CaptureRequest a(bdk bdkVar, CameraDevice cameraDevice, Map map, boolean z, arx arxVar) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List e = bdkVar.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((bdy) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        bcd bcdVar = bdkVar.k;
        if (bdkVar.f == 5 && bcdVar != null && (bcdVar.b() instanceof TotalCaptureResult)) {
            avw.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) bcdVar.b());
        } else {
            avw.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            int i = bdkVar.f;
            if (i == 5) {
                createCaptureRequest = cameraDevice.createCaptureRequest(true != z ? 2 : 1);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(i);
            }
        }
        e(createCaptureRequest, bdkVar.f, arxVar);
        c(bdkVar, createCaptureRequest);
        Integer b = b(bdkVar);
        if (b != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, b);
        }
        if (bdkVar.e.s(bdk.a)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) bdkVar.e.l(bdk.a));
        }
        if (bdkVar.e.s(bdk.b)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) bdkVar.e.l(bdk.b)).byteValue()));
        }
        d(createCaptureRequest, bdkVar.e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            createCaptureRequest.addTarget((Surface) it2.next());
        }
        createCaptureRequest.setTag(bdkVar.j);
        return createCaptureRequest.build();
    }

    static Integer b(bdk bdkVar) {
        if (bdkVar.b() == 1 || bdkVar.c() == 1) {
            return 0;
        }
        if (bdkVar.b() == 2) {
            return 2;
        }
        return bdkVar.c() == 2 ? 1 : null;
    }

    public static void c(bdk bdkVar, CaptureRequest.Builder builder) {
        if (bdkVar.d().equals(bgr.g)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, bdkVar.d());
    }

    public static void d(CaptureRequest.Builder builder, bdp bdpVar) {
        asm b = asl.a(bdpVar).b();
        for (bdn bdnVar : bfy.f(b)) {
            Object b2 = bdnVar.b();
            try {
                builder.set((CaptureRequest.Key) b2, bfy.b(b, bdnVar));
            } catch (IllegalArgumentException unused) {
                Objects.toString(b2);
                avw.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: ".concat(String.valueOf(b2)));
            }
        }
    }

    public static void e(CaptureRequest.Builder builder, int i, arx arxVar) {
        Map unmodifiableMap;
        if (i == 3) {
            if (arxVar.a) {
                HashMap hashMap = new HashMap();
                hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
                unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
            }
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            if (i == 4 && arxVar.b) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap2);
            }
            unmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }
}
