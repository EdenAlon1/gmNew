package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apd {
    public final String a;
    public final apc b;
    private final Map c = new HashMap();
    private aqa d = null;

    public apd(CameraCharacteristics cameraCharacteristics, String str) {
        this.b = Build.VERSION.SDK_INT >= 28 ? new apb(cameraCharacteristics) : new apc(cameraCharacteristics);
        this.a = str;
    }

    public final int a() {
        CameraCharacteristics.Key key;
        Integer num = null;
        if (d() && Build.VERSION.SDK_INT >= 35) {
            key = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
            num = (Integer) c(key);
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final aqa b() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.d = new aqa(streamConfigurationMap, new arl(this.a));
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.d;
    }

    public final Object c(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return this.b.a(key);
        }
        synchronized (this) {
            Object obj = this.c.get(key);
            if (obj != null) {
                return obj;
            }
            Object a = this.b.a(key);
            if (a != null) {
                this.c.put(key, a);
            }
            return a;
        }
    }

    public final boolean d() {
        Boolean bool = (Boolean) c(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }
}
