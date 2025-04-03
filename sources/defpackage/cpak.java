package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpak implements kz {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/sms/apns/BugleUserAgentInfoLoader");
    public String a;
    public String b;
    private final Context d;
    private final cpbs e;
    private boolean f;
    private final int g;

    public cpak(Context context, cpbs cpbsVar, int i) {
        this.d = context;
        this.e = cpbsVar;
        this.g = i;
    }

    private static String b(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace(' ', '_');
    }

    public final void a() {
        boolean z;
        if (this.f) {
            return;
        }
        synchronized (this) {
            z = false;
            if (!this.f) {
                TelephonyManager telephonyManager = (TelephonyManager) this.d.getSystemService("phone");
                if (telephonyManager != null) {
                    telephonyManager = telephonyManager.createForSubscriptionId(this.g);
                }
                if (this.e.a(this.g).b.getBoolean("useCustomUserAgent", false)) {
                    this.a = b(Build.MANUFACTURER) + "/" + b(Build.MODEL) + "/" + b("Android") + "-" + b(Build.VERSION.RELEASE) + "/" + b("Messages ".concat(String.valueOf(cvdd.a(this.d).a)));
                } else if (telephonyManager != null) {
                    this.a = telephonyManager.getMmsUserAgent();
                }
                if (telephonyManager != null) {
                    this.b = telephonyManager.getMmsUAProfUrl();
                }
                if (TextUtils.isEmpty(this.a)) {
                    this.a = "Messages ".concat(String.valueOf(cvdd.a(this.d).a));
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.b = "http://www.gstatic.com/android/sms/mms_ua_profile.xml";
                }
                z = true;
                this.f = true;
            }
        }
        if (z) {
            ensk h = c.h();
            h.Y(ente.a, "Bugle");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/sms/apns/BugleUserAgentInfoLoader", "load", 83, "BugleUserAgentInfoLoader.java")).D("Loaded user agent info: UA=%s, UAProfUrl=%s", this.a, this.b);
        }
    }
}
