package defpackage;

import android.content.Context;
import android.telephony.CarrierConfigManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvn {
    private static volatile dkvn b;
    public final CarrierConfigManager a;

    protected dkvn(Context context) {
        this.a = (CarrierConfigManager) context.getSystemService("carrier_config");
    }

    public static dkvn a(Context context) {
        if (b == null) {
            synchronized (dkvn.class) {
                if (b == null) {
                    b = new dkvn(context);
                }
            }
        }
        return b;
    }
}
