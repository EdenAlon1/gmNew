package defpackage;

import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxo extends ctvk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT");
    private final SubscriptionManager b;
    private final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ctxo(defpackage.ctxn r4, android.content.Context r5, int r6) {
        /*
            r3 = this;
            ctxm r0 = new ctxm
            ffbr r1 = r4.a
            java.lang.Object r1 = r1.b()
            ctxl r1 = (defpackage.ctxl) r1
            r1.getClass()
            ffbr r2 = r4.b
            java.lang.Object r2 = r2.b()
            ctwb r2 = (defpackage.ctwb) r2
            r2.getClass()
            ffbr r4 = r4.c
            java.lang.Object r4 = r4.b()
            ctwx r4 = (defpackage.ctwx) r4
            r4.getClass()
            r0.<init>(r1, r4, r6)
            r3.<init>(r0)
            r3.c = r6
            java.lang.Class<android.telephony.SubscriptionManager> r4 = android.telephony.SubscriptionManager.class
            java.lang.Object r4 = r5.getSystemService(r4)
            android.telephony.SubscriptionManager r4 = (android.telephony.SubscriptionManager) r4
            if (r4 != 0) goto L3d
            java.lang.Class<android.telephony.SubscriptionManager> r4 = android.telephony.SubscriptionManager.class
            java.lang.Object r4 = r5.getSystemService(r4)
            android.telephony.SubscriptionManager r4 = (android.telephony.SubscriptionManager) r4
        L3d:
            r3.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxo.<init>(ctxn, android.content.Context, int):void");
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final Optional h() {
        String phoneNumber;
        try {
            phoneNumber = this.b.getPhoneNumber(this.c);
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT", "getRawSelfNumber", 50, "TelephonySubscriptionInfoAsOfT.java")).t("getRawTelephonyPhoneNumber %s", cskt.b(phoneNumber));
            if (!TextUtils.isEmpty(phoneNumber)) {
                return Optional.of(phoneNumber);
            }
        } catch (IllegalStateException | SecurityException e) {
            enru enruVar = a;
            ensk j = enruVar.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar2 = (enrr) j;
            enrrVar2.W(1, TimeUnit.MINUTES);
            enrr enrrVar3 = (enrr) enrrVar2.g(e);
            enrrVar3.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT", "getRawSelfNumber", 60, "TelephonySubscriptionInfoAsOfT.java")).q("TelephonySubscriptionInfoAsOfT: getRawSelfNumber failed");
            if (e instanceof SecurityException) {
                ensk h2 = enruVar.h();
                h2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT", "getRawSelfNumber", 64, "TelephonySubscriptionInfoAsOfT.java")).q("TelephonySubscriptionInfoAsOfT: getRawSelfNumber fallback to super");
                return super.h();
            }
        }
        return Optional.empty();
    }
}
