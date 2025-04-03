package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpax {
    public static int a() {
        if (emuz.e("MOTOROLA", Build.MANUFACTURER) || emuz.e("MOTOROLA", Build.BRAND)) {
            return R.xml.motorola_config_override;
        }
        if (ctib.b()) {
            return R.xml.huawei_config_override;
        }
        if (ctib.c()) {
            return R.xml.lge_config_override;
        }
        return Integer.MIN_VALUE;
    }
}
