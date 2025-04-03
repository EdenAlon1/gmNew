package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aof implements any {
    public final apd a;
    public final Executor b;
    final bma c;
    public boolean d = false;
    public boolean e = false;
    public boolean f;
    public boolean g;
    awt h;
    public bdy i;
    aoe j;

    public aof(apd apdVar, Executor executor) {
        boolean z;
        this.f = false;
        this.g = false;
        this.a = apdVar;
        this.b = executor;
        int[] iArr = (int[]) apdVar.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.f = z;
        this.g = ara.a(ZslDisablerQuirk.class) != null;
        this.c = new bma(new aob());
    }

    public static final Map d(apd apdVar) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) apdVar.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            avw.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = ".concat(String.valueOf(e.getMessage())));
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new bhu(true));
                hashMap.put(Integer.valueOf(i), inputSizes[0]);
            }
        }
        return hashMap;
    }

    @Override // defpackage.any
    public final avr a() {
        try {
            return (avr) this.c.a();
        } catch (NoSuchElementException unused) {
            avw.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    public final void b() {
        awt awtVar = this.h;
        if (awtVar != null) {
            awtVar.h();
            this.h = null;
        }
        aoe aoeVar = this.j;
        if (aoeVar != null) {
            aoeVar.a();
            this.j = null;
        }
        c();
        bdy bdyVar = this.i;
        if (bdyVar != null) {
            bdyVar.d();
            this.i = null;
        }
    }

    public final void c() {
        while (true) {
            bma bmaVar = this.c;
            if (bmaVar.c()) {
                return;
            } else {
                ((avr) bmaVar.a()).close();
            }
        }
    }
}
