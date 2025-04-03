package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiid {
    private static final String a = "fiid";
    private static fiic b;

    private fiid() {
    }

    public static fiic a(Context context, fihz fihzVar) {
        fiic fiicVar;
        synchronized (fiid.class) {
            if (b == null && Build.VERSION.SDK_INT >= 30) {
                boolean z = true;
                if (fihzVar != fihz.CRONET_SOURCE_PLATFORM && fihzVar != fihz.CRONET_SOURCE_PLAY_SERVICES) {
                    z = false;
                }
                if (fiie.a(context).getBoolean("android.net.http.EnableTelemetry", z)) {
                    try {
                        b = new filv();
                    } catch (Exception e) {
                        Log.e(a, "Exception creating an instance of CronetLoggerImpl", e);
                    }
                }
            }
            if (b == null) {
                b = new filf();
            }
            fiicVar = b;
        }
        return fiicVar;
    }
}
