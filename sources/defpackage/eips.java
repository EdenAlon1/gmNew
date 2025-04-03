package defpackage;

import android.content.Intent;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eips {
    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 29 ? intent.getBooleanExtra("firstRun", false) || intent.getBooleanExtra("preDeferredSetup", false) || intent.getBooleanExtra("deferredSetup", false) : intent.getBooleanExtra("isSetupFlow", false);
    }
}
