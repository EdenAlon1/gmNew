package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dumf {
    public static final boolean a;
    public static final boolean b;

    static {
        boolean z = false;
        a = "robolectric".equals(Build.FINGERPRINT) || Build.FINGERPRINT == null;
        try {
            Class.forName("com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner");
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }
}
