package defpackage;

import android.telephony.PhoneNumberUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxv {
    public static final entd a = entd.c("BugleRcs");
    public final ckxr b;

    public ckxv(ckxr ckxrVar) {
        this.b = ckxrVar;
    }

    public static String a(eica eicaVar) {
        if (eicaVar.b() != 1) {
            String a2 = eicaVar.a();
            String str = null;
            try {
                String e = ((eeiq) new eenb(a2).e()).e();
                if (e != null) {
                    if (PhoneNumberUtils.isGlobalPhoneNumber(e)) {
                        str = e;
                    }
                }
            } catch (eeje | ClassCastException e2) {
                ((ensz) ((ensz) ((ensz) a.j()).g(e2)).h("com/google/android/apps/messaging/shared/rcs/groups/notify/ProcessRcsGroupNotifyScheduler", "extractPhoneNumberSipUri", 137, "ProcessRcsGroupNotifyScheduler.java")).t("Failed to parse phone number out of SIP schemed Uri: %s", cskt.b(a2));
            }
            if (str != null) {
                return str;
            }
        }
        return eicaVar.a();
    }
}
