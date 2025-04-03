package defpackage;

import android.telephony.SmsManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class la {
    public static int a(int i) {
        if (i == -1) {
            i = SmsManager.getDefaultSmsSubscriptionId();
        }
        if (i < 0) {
            return -1;
        }
        return i;
    }
}
