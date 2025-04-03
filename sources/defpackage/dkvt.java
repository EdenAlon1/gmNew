package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvt {
    private static volatile dkvt b;
    public final TelephonyManager a;

    public dkvt(TelephonyManager telephonyManager) {
        this.a = telephonyManager;
    }

    public static dkvt g(Context context) {
        if (b == null) {
            synchronized (dkvt.class) {
                if (b == null) {
                    b = new dkvt((TelephonyManager) context.getSystemService("phone"));
                }
            }
        }
        return b;
    }

    public final int a() {
        int dataNetworkType;
        dataNetworkType = this.a.getDataNetworkType();
        return dataNetworkType;
    }

    public final int b() {
        try {
            return this.a.getDataState();
        } catch (SecurityException e) {
            dkty.i(e, "Got SecurityException for getDataState, this shouldn't happen!", new Object[0]);
            return Build.VERSION.SDK_INT >= 29 ? -1 : 0;
        }
    }

    public final int c() {
        return this.a.getNetworkType();
    }

    public final int d() {
        int simCarrierId;
        try {
            simCarrierId = this.a.getSimCarrierId();
            return simCarrierId;
        } catch (SecurityException e) {
            throw new dkvd("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final TelephonyManager e(int i) {
        TelephonyManager createForSubscriptionId;
        try {
            createForSubscriptionId = this.a.createForSubscriptionId(i);
            return createForSubscriptionId;
        } catch (SecurityException e) {
            throw new dkvd("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final dkvt f(int i) {
        TelephonyManager createForSubscriptionId;
        createForSubscriptionId = this.a.createForSubscriptionId(i);
        if (createForSubscriptionId == null) {
            return null;
        }
        return new dkvt(createForSubscriptionId);
    }

    public final String h() {
        try {
            return this.a.getGroupIdLevel1();
        } catch (SecurityException e) {
            throw new dkvd(e);
        }
    }

    public final String i() {
        try {
            return this.a.getLine1Number();
        } catch (SecurityException e) {
            throw new dkvd("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final String j() {
        return this.a.getNetworkOperator();
    }

    public final String k() {
        return this.a.getNetworkOperatorName();
    }

    public final String l() {
        return this.a.getSimCountryIso();
    }

    public final String m() {
        return this.a.getSimOperator();
    }

    public final String n() {
        try {
            return this.a.getSimSerialNumber();
        } catch (SecurityException e) {
            throw new dkvd("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
        }
    }
}
