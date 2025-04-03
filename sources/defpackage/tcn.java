package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;
import com.google.android.apps.messaging.cloudstore.fi.FiAccountConfirmationActivity;
import com.google.android.apps.messaging.cloudstore.fi.FiSettingsActivity;
import com.google.android.apps.messaging.cloudstore.fi.FiSettingsRedirectActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcn {
    public static final Intent a(Context context) {
        return ((Boolean) csgj.q.e()).booleanValue() ? e(context, FiSettingsRedirectActivity.class) : e(context, FiAccountActivity.class);
    }

    public static final Intent b(Context context) {
        return ((Boolean) csgj.q.e()).booleanValue() ? e(context, FiSettingsRedirectActivity.class) : e(context, FiAccountConfirmationActivity.class);
    }

    public static final Intent c(Context context) {
        return ((Boolean) csgj.q.e()).booleanValue() ? e(context, FiSettingsRedirectActivity.class) : e(context, FiSettingsActivity.class);
    }

    public static final Intent d(Context context) {
        return e(context, FiSettingsRedirectActivity.class);
    }

    private static Intent e(Context context, Class cls) {
        return akuv.c(context, cls, "android.intent.action.VIEW").a();
    }
}
