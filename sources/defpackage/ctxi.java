package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import j$.util.Optional;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxi extends ctvk {
    private static final cskc a = cskc.g("Bugle", "TelephonySubscriptionInfoAsOfQ");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ");
    private final int c;
    private final TelephonyManager d;
    private final SubscriptionManager e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ctxi(defpackage.ctxh r3, defpackage.ctwx r4, android.content.Context r5, int r6) {
        /*
            r2 = this;
            ctxg r0 = new ctxg
            ffbr r1 = r3.a
            java.lang.Object r1 = r1.b()
            ctxf r1 = (defpackage.ctxf) r1
            r1.getClass()
            ffbr r3 = r3.b
            java.lang.Object r3 = r3.b()
            ctwx r3 = (defpackage.ctwx) r3
            r3.getClass()
            r0.<init>(r1, r3, r6)
            r2.<init>(r0)
            android.telephony.TelephonyManager r3 = r4.a(r6)
            r2.d = r3
            java.lang.Class<android.telephony.SubscriptionManager> r3 = android.telephony.SubscriptionManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.telephony.SubscriptionManager r3 = (android.telephony.SubscriptionManager) r3
            if (r3 != 0) goto L36
            java.lang.Class<android.telephony.SubscriptionManager> r3 = android.telephony.SubscriptionManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.telephony.SubscriptionManager r3 = (android.telephony.SubscriptionManager) r3
        L36:
            r2.e = r3
            r2.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxi.<init>(ctxh, ctwx, android.content.Context, int):void");
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final int d() {
        return this.d.getSimState();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final Optional f() {
        SmsManager e = e();
        try {
            Method declaredMethod = e.getClass().getDeclaredMethod("getAllMessagesFromIcc", new Class[0]);
            declaredMethod.setAccessible(true);
            return Optional.ofNullable((List) declaredMethod.invoke(e, new Object[0]));
        } catch (Exception e2) {
            enrr j = a.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) j.g(e2)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getAllSimMessages", 187, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: getAllSimMessages: system api not found");
            return Optional.empty();
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String k() {
        int slotIndex;
        try {
            slotIndex = SubscriptionManager.getSlotIndex(this.c);
            if (slotIndex == -1) {
                enrr k = a.k();
                k.W(1, TimeUnit.MINUTES);
                ((enrr) ((enrr) k.g(eldx.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getDeviceId", 100, "TelephonySubscriptionInfoAsOfQ.java")).r("TelephonySubscriptionInfoAsOfQ: Invalid slot index, returning empty id for subId: %d", this.c);
                return "";
            }
            String b2 = emxe.b(this.d.getDeviceId(slotIndex));
            if (b2.isEmpty()) {
                enrr k2 = a.k();
                k2.W(1, TimeUnit.MINUTES);
                k2.Y(csux.t, Integer.valueOf(this.c));
                ((enrr) ((enrr) k2.g(eldx.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getDeviceId", 113, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: deviceId is empty. Does TelephonyManager have necessary permissions?");
            }
            return b2;
        } catch (SecurityException e) {
            enrr k3 = a.k();
            k3.W(1, TimeUnit.MINUTES);
            k3.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) k3.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getDeviceId", 123, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: failed to get deviceId, is Messages the default SMS app?");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
    @Override // defpackage.ctvk, defpackage.ctwy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l() {
        /*
            r8 = this;
            java.lang.String r0 = "getActiveSubscriptionInfo"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ"
            java.lang.String r2 = "TelephonySubscriptionInfoAsOfQ.java"
            r3 = 0
            android.telephony.SubscriptionManager r4 = r8.e     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            int r5 = r8.c     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            android.telephony.SubscriptionInfo r4 = r4.getActiveSubscriptionInfo(r5)     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            if (r4 != 0) goto L7f
            enru r5 = defpackage.ctxi.b     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            ensk r5 = r5.h()     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            enrr r5 = (defpackage.enrr) r5     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            r6 = 263(0x107, float:3.69E-43)
            ensk r5 = r5.h(r1, r0, r6, r2)     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            enrr r5 = (defpackage.enrr) r5     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            java.lang.String r6 = "getActiveSubscriptionInfo(): empty sub info for %s."
            int r7 = r8.c     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            r5.r(r6, r7)     // Catch: java.lang.RuntimeException -> L29 java.lang.SecurityException -> L58
            goto L7f
        L29:
            r4 = move-exception
            cskc r5 = defpackage.ctxi.a
            enrr r5 = r5.k()
            r6 = 10
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r5.W(r6, r7)
            int r6 = r8.c
            ensn r7 = defpackage.csux.t
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.Y(r7, r6)
            ensk r4 = r5.g(r4)
            enrr r4 = (defpackage.enrr) r4
            r5 = 275(0x113, float:3.85E-43)
            ensk r0 = r4.h(r1, r0, r5, r2)
            enrr r0 = (defpackage.enrr) r0
            int r1 = r8.c
            java.lang.String r2 = "TelephonySubscriptionInfoAsOfQ: getActiveSubscriptionInfo: system exception for %s."
            r0.r(r2, r1)
            goto L7e
        L58:
            r4 = move-exception
            cskc r5 = defpackage.ctxi.a
            enrr r5 = r5.k()
            r6 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MINUTES
            r5.W(r6, r7)
            java.lang.RuntimeException r4 = defpackage.eldx.b(r4)
            ensk r4 = r5.g(r4)
            enrr r4 = (defpackage.enrr) r4
            r5 = 268(0x10c, float:3.76E-43)
            ensk r0 = r4.h(r1, r0, r5, r2)
            enrr r0 = (defpackage.enrr) r0
            int r1 = r8.c
            java.lang.String r2 = "TelephonySubscriptionInfoAsOfQ: getActiveSubscriptionInfo: no access %s."
            r0.r(r2, r1)
        L7e:
            r4 = r3
        L7f:
            if (r4 != 0) goto L82
            goto L8d
        L82:
            android.os.ParcelUuid r0 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r0 == 0) goto L8d
            java.lang.String r0 = r0.toString()
            return r0
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxi.l():java.lang.String");
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String m() {
        return this.d.getNetworkCountryIso();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String n() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String u(Context context) {
        try {
            String b2 = emxe.b(this.d.getSubscriberId());
            if (b2.isEmpty()) {
                enrr k = a.k();
                k.W(1, TimeUnit.MINUTES);
                k.Y(csux.t, Integer.valueOf(this.c));
                ((enrr) ((enrr) k.g(eldx.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getSubscriberId", 145, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: subscriberId is empty. Does TelephonyManager have necessary permissions?");
            }
            return b2;
        } catch (SecurityException e) {
            enrr k2 = a.k();
            k2.W(1, TimeUnit.MINUTES);
            k2.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) k2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getSubscriberId", 155, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: failed to get subscriberId, is Messages the default SMS app?");
            return "";
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean v(int i) {
        Object invoke;
        SmsManager e = e();
        try {
            Method declaredMethod = e.getClass().getDeclaredMethod("deleteMessageFromIcc", Integer.TYPE);
            declaredMethod.setAccessible(true);
            invoke = declaredMethod.invoke(e, Integer.valueOf(i));
        } catch (Exception e2) {
            enrr j = a.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.c));
            ((enrr) ((enrr) j.g(e2)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "deleteSimMessage", 227, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: deleteSimMessage: system api not found");
        }
        if (invoke != null) {
            return ((Boolean) invoke).booleanValue();
        }
        enrr k = a.k();
        k.W(10, TimeUnit.SECONDS);
        k.Y(csux.t, Integer.valueOf(this.c));
        ((enrr) ((enrr) k.g(eldx.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "deleteSimMessage", 218, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: deleteSimMessage: deleteMessageFromIcc returned null.");
        return false;
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean w() {
        return this.d.hasIccCard();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean x() {
        boolean isDataEnabled;
        isDataEnabled = this.d.isDataEnabled();
        return isDataEnabled;
    }
}
