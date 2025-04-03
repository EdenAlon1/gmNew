package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqf {
    public final aqe a;

    public aqf(aqe aqeVar) {
        this.a = aqeVar;
    }

    public static aqf b(apd apdVar) {
        CameraCharacteristics.Key key;
        aqf aqfVar = null;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles m453m = ja$$ExternalSyntheticApiModelOutline0.m453m(apdVar.c(key));
            if (m453m != null) {
                ksw.d(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
                aqfVar = new aqf(new aqg(m453m));
            }
        }
        return aqfVar == null ? aqh.a : aqfVar;
    }

    public final DynamicRangeProfiles a() {
        ksw.d(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.a.a();
    }

    public final Set c() {
        return this.a.c();
    }
}
