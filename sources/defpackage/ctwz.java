package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctwz implements ctwy {
    private static final cskc a = cskc.g("Bugle", "TelephonySubscriptionInfoAsOfL");
    private final Context b;
    private final int c;
    private final TelephonyManager d;
    private ConnectivityManager e;

    public ctwz(Context context, ctwx ctwxVar, int i) {
        this.b = context;
        this.c = i;
        this.d = ctwxVar.a(i);
    }

    @Override // defpackage.ctwy
    public final int[] A() {
        int i;
        String simOperator = this.d.getSimOperator();
        int i2 = 0;
        try {
            i = Integer.parseInt(simOperator.substring(0, 3));
        } catch (Exception e) {
            e = e;
            i = 0;
        }
        try {
            i2 = Integer.parseInt(simOperator.substring(3));
        } catch (Exception e2) {
            e = e2;
            csjb e3 = a.e();
            e3.I("getMccMnc: invalid string ");
            e3.I(simOperator);
            e3.s(e);
            return new int[]{i, i2};
        }
        return new int[]{i, i2};
    }

    @Override // defpackage.ctwy
    public final int a() {
        return 0;
    }

    @Override // defpackage.ctwy
    public final int b() {
        return 0;
    }

    @Override // defpackage.ctwy
    public final int c() {
        return 0;
    }

    @Override // defpackage.ctwy
    public final int d() {
        return 0;
    }

    @Override // defpackage.ctwy
    public final SmsManager e() {
        return SmsManager.getSmsManagerForSubscriptionId(this.c);
    }

    @Override // defpackage.ctwy
    public final Optional f() {
        a.r("TelephonySubscriptionInfoAsOfL.getAllSimMessages: not implemented");
        return Optional.of(new ArrayList());
    }

    @Override // defpackage.ctwy
    public final Optional g() {
        return Optional.ofNullable(e().getCarrierConfigValues());
    }

    @Override // defpackage.ctwy
    public final Optional h() {
        try {
            String line1Number = this.d.getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                return Optional.of(line1Number);
            }
        } catch (SecurityException | UnsupportedOperationException e) {
            enrr j = a.j();
            j.W(1, TimeUnit.MINUTES);
            j.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getRawSelfNumber", 174, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty self raw number");
        }
        return Optional.empty();
    }

    @Override // defpackage.ctwy
    public final CharSequence i() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ctwy
    public final CharSequence j() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ctwy
    public final String k() {
        try {
            return emxe.b(this.d.getDeviceId());
        } catch (Exception e) {
            enrr j = a.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getDeviceId", 230, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty device id");
            return "";
        }
    }

    @Override // defpackage.ctwy
    public final String l() {
        return null;
    }

    @Override // defpackage.ctwy
    public final String m() {
        return this.d.getNetworkCountryIso();
    }

    @Override // defpackage.ctwy
    public final String n() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ctwy
    public final String o() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ctwy
    public final String p() {
        return emxe.b(this.d.getSimCountryIso());
    }

    @Override // defpackage.ctwy
    public final String q() {
        return this.d.getSimOperatorName();
    }

    @Override // defpackage.ctwy
    public final String r() {
        return this.d.getSimOperator();
    }

    @Override // defpackage.ctwy
    public final String s() {
        try {
            return this.d.getSimSerialNumber();
        } catch (Exception e) {
            enrr j = a.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getSimSerialNumber", 149, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty SIM serial number");
            return "";
        }
    }

    @Override // defpackage.ctwy
    public final String t() {
        return "";
    }

    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.ctwy
    public final String u(Context context) {
        try {
            return emxe.b(this.d.getSubscriberId());
        } catch (Exception e) {
            enrr j = a.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getSubscriberId", 245, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty subscriber id");
            return "";
        }
    }

    @Override // defpackage.ctwy
    public final boolean v(int i) {
        a.r("TelephonySubscriptionInfoAsOfL.deleteSimMessage: not implemented");
        return false;
    }

    @Override // defpackage.ctwy
    public final boolean w() {
        int i = this.c;
        emxf.n(i == -1, "Default subscription must be %s", i);
        return this.d.hasIccCard();
    }

    @Override // defpackage.ctwy
    public final boolean x() {
        Boolean bool = false;
        if (this.e == null) {
            this.e = (ConnectivityManager) this.b.getSystemService("connectivity");
        }
        try {
            Method declaredMethod = this.e.getClass().getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            bool = (Boolean) declaredMethod.invoke(this.e, new Object[0]);
        } catch (Exception e) {
            enrr j = a.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "isMobileDataEnabled", 210, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: isMobileDataEnabled: system api not found");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.ctwy
    public final boolean y() {
        return this.d.isNetworkRoaming();
    }

    @Override // defpackage.ctwy
    public final boolean z() {
        return this.d.getSimState() != 1;
    }
}
