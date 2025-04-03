package defpackage;

import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsa {
    public static final cfup a;

    static {
        cfvl.e(cfvl.b, "within_num_hours_for_valid_fi", 24);
        a = cfvl.i(cfvl.b, "enable_imessage_banner", false);
    }

    public static eagn a() {
        String str;
        String str2;
        eagk eagkVar = new eagk();
        eagkVar.c = Build.MANUFACTURER + " " + Build.MODEL;
        eagkVar.d = 86400000L;
        short s = eagkVar.k;
        eagkVar.e = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
        eagkVar.l = 1;
        eagkVar.k = (short) (s | 3);
        eagkVar.a(false);
        short s2 = eagkVar.k;
        eagkVar.h = 7;
        eagkVar.i = true;
        eagkVar.j = true;
        eagkVar.k = (short) (s2 | 504);
        eagkVar.a = "messages";
        eagkVar.b = "357317899610";
        eagkVar.a(true);
        eagkVar.f = "AIzaSyCB5sc4sgRVObMraVTM-ymBkANcjiQXcV0";
        if (eagkVar.k == 511 && (str = eagkVar.a) != null && eagkVar.l != 0 && (str2 = eagkVar.c) != null) {
            return new eagl(str, eagkVar.b, str2, eagkVar.d, eagkVar.e, eagkVar.f, eagkVar.g, eagkVar.h, eagkVar.i, eagkVar.j);
        }
        StringBuilder sb = new StringBuilder();
        if (eagkVar.a == null) {
            sb.append(" clientId");
        }
        if (eagkVar.l == 0) {
            sb.append(" defaultEnvironment");
        }
        if (eagkVar.c == null) {
            sb.append(" deviceName");
        }
        if ((1 & eagkVar.k) == 0) {
            sb.append(" registrationStalenessTimeMs");
        }
        if ((eagkVar.k & 2) == 0) {
            sb.append(" disableEntrypoints");
        }
        if ((eagkVar.k & 4) == 0) {
            sb.append(" useDefaultFirebaseApp");
        }
        if ((eagkVar.k & 8) == 0) {
            sb.append(" useFirebaseReceiver");
        }
        if ((eagkVar.k & 16) == 0) {
            sb.append(" enableEndToEndEncryption");
        }
        if ((eagkVar.k & 32) == 0) {
            sb.append(" periodRegistrationIntervalDays");
        }
        if ((eagkVar.k & 64) == 0) {
            sb.append(" enableGrowthKitIfExists");
        }
        if ((eagkVar.k & 128) == 0) {
            sb.append(" enableInAppPushFlow");
        }
        if ((eagkVar.k & 256) == 0) {
            sb.append(" allowedFromEmbargoedCountries");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    static /* synthetic */ ListenableFuture b() {
        return adhu.a() ? elfo.e(dvus.a("OG_MENU_PROMO_ENABLED", 1)) : elfo.e(dvus.a("OG_MENU_PROMO_ENABLED", 0));
    }

    static /* synthetic */ ListenableFuture c() {
        return adhu.a() ? elfo.e(dvus.a("USING_GAIA_UX_ENABLED", 1)) : elfo.e(dvus.a("USING_GAIA_UX_ENABLED", 0));
    }
}
