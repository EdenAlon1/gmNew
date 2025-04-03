package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgxs {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 0;
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
