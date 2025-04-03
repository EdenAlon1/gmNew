package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwx {
    public static final cskc a = cskc.g("Bugle", "TelephonyManagerFactory");
    private final Context b;
    private final cnq c = new ctww(this);

    public ctwx(Context context) {
        this.b = context;
    }

    public final TelephonyManager a(int i) {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.c(Integer.valueOf(i));
        telephonyManager.getClass();
        return telephonyManager;
    }

    public final TelephonyManager b() {
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService(TelephonyManager.class);
        telephonyManager.getClass();
        return telephonyManager;
    }
}
