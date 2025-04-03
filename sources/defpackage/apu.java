package defpackage;

import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apu {
    public final apt a;
    private final Map b = new ArrayMap(4);

    public apu(apt aptVar) {
        this.a = aptVar;
    }

    public final apd a(String str) {
        apd apdVar;
        synchronized (this.b) {
            apdVar = (apd) this.b.get(str);
            if (apdVar == null) {
                try {
                    apd apdVar2 = new apd(this.a.a(str), str);
                    this.b.put(str, apdVar2);
                    apdVar = apdVar2;
                } catch (AssertionError e) {
                    throw new aog(e.getMessage(), e);
                }
            }
        }
        return apdVar;
    }

    public final void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.a.c(str, executor, stateCallback);
    }
}
