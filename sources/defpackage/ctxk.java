package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxk extends ctvk {
    private static final cskc a = cskc.g("Bugle", "TelephonySubscriptionInfoAsOfR");
    private final ctwb b;

    public ctxk(ctxj ctxjVar, ctwb ctwbVar, int i) {
        super(ctxjVar.a(i));
        this.b = ctwbVar;
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String t() {
        String smscAddress;
        try {
            smscAddress = e().getSmscAddress();
            return emxe.b(smscAddress);
        } catch (SecurityException e) {
            enrr k = a.k();
            k.W(1, TimeUnit.MINUTES);
            ((enrr) ((enrr) k.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfR", "getSmsc", 44, "TelephonySubscriptionInfoAsOfR.java")).q("TelephonySubscriptionInfoAsOfR: Failed to get smscAddress, is Messages the default SMS app?");
            return "";
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean v(int i) {
        return this.b.t() ? this.b.d.getContentResolver().delete(Uri.parse(a.h(i, "content://sms/icc/")), null, null) > 0 : super.v(i);
    }
}
