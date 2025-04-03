package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksh {
    public static Intent a(String str, String str2) {
        return c("com.google.android.ims", str, str2);
    }

    public static Intent b(String str) {
        return c("com.google.android.apps.messaging", "com.google.android.ims.service.JibeService", str);
    }

    private static Intent c(String str, String str2, String str3) {
        Intent intent = new Intent(str3);
        intent.setComponent(new ComponentName(str, str2));
        return intent;
    }
}
