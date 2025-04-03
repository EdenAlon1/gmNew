package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class apz implements apt {
    final CameraManager a;
    final Object b;

    public apz(Context context, Object obj) {
        this.a = (CameraManager) context.getSystemService("camera");
        this.b = obj;
    }

    @Override // defpackage.apt
    public CameraCharacteristics a(String str) {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }

    @Override // defpackage.apt
    public Set b() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.apt
    public void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        ksw.h(executor);
        ksw.h(stateCallback);
        try {
            this.a.openCamera(str, new api(executor, stateCallback), ((apy) this.b).b);
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }

    @Override // defpackage.apt
    public void d(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        aps apsVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        Object obj = this.b;
        if (availabilityCallback != null) {
            synchronized (((apy) obj).a) {
                apsVar = (aps) ((apy) obj).a.get(availabilityCallback);
                if (apsVar == null) {
                    apsVar = new aps(executor, availabilityCallback);
                    ((apy) obj).a.put(availabilityCallback, apsVar);
                }
            }
        } else {
            apsVar = null;
        }
        this.a.registerAvailabilityCallback(apsVar, ((apy) obj).b);
    }

    @Override // defpackage.apt
    public void e(CameraManager.AvailabilityCallback availabilityCallback) {
        aps apsVar;
        if (availabilityCallback != null) {
            Object obj = this.b;
            synchronized (((apy) obj).a) {
                apsVar = (aps) ((apy) obj).a.remove(availabilityCallback);
            }
        } else {
            apsVar = null;
        }
        if (apsVar != null) {
            synchronized (apsVar.b) {
                apsVar.c = true;
            }
        }
        this.a.unregisterAvailabilityCallback(apsVar);
    }

    @Override // defpackage.apt
    public final String[] f() {
        try {
            return this.a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }
}
