package defpackage;

import android.content.Context;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvq {
    private static volatile dkvq b;
    public final SubscriptionManager a;

    private dkvq(Context context) {
        this.a = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
    }

    public static dkvq b(Context context) {
        if (b == null) {
            synchronized (dkvq.class) {
                if (b == null) {
                    b = new dkvq(context);
                }
            }
        }
        return b;
    }

    public final SubscriptionInfo a(int i) {
        try {
            return this.a.getActiveSubscriptionInfo(i);
        } catch (SecurityException e) {
            throw new dkvd("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final List c() {
        try {
            return this.a.getActiveSubscriptionInfoList();
        } catch (SecurityException e) {
            throw new dkvd("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final List d(ParcelUuid parcelUuid) {
        List subscriptionsInGroup;
        try {
            subscriptionsInGroup = this.a.getSubscriptionsInGroup(parcelUuid);
            return subscriptionsInGroup;
        } catch (SecurityException e) {
            throw new dkvd("READ_PHONE_STATE permission is missing.", e);
        }
    }

    @Deprecated(since = "R")
    public final void e(SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener) {
        try {
            this.a.addOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
        } catch (SecurityException e) {
            throw new dkvd("READ_PHONE_STATE permission is missing.", e);
        }
    }
}
