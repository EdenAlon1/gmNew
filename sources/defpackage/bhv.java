package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhv {
    public static Context a(Context context) {
        String attributionTag;
        String attributionTag2;
        Context createAttributionContext;
        int deviceId;
        int deviceId2;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 34) {
            deviceId = context.getDeviceId();
            deviceId2 = applicationContext.getDeviceId();
            if (deviceId != deviceId2) {
                applicationContext = applicationContext.createDeviceContext(deviceId);
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            attributionTag = context.getAttributionTag();
            attributionTag2 = applicationContext.getAttributionTag();
            if (!Objects.equals(attributionTag, attributionTag2)) {
                createAttributionContext = applicationContext.createAttributionContext(attributionTag);
                return createAttributionContext;
            }
        }
        return applicationContext;
    }
}
