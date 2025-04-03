package defpackage;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chho {
    public final errl a;

    public chho(errl errlVar) {
        this.a = errlVar;
    }

    public static int a(Context context) {
        UsageStatsManager usageStatsManager;
        int appStandbyBucket;
        if (Build.VERSION.SDK_INT < 28 || (usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats")) == null) {
            return 0;
        }
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        return appStandbyBucket;
    }

    public static int b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return 0;
        }
        return powerManager.isIgnoringBatteryOptimizations(context.getPackageName()) ? 2 : 1;
    }
}
