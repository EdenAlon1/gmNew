package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxb extends ctvk {
    private static final emyl a = cfvl.w("log_anomaly_in_sub");
    private static final entd b = entd.c("Bugle");
    private static final cskc c = cskc.g("Bugle", "TelephonySubscriptionInfoAsOfLMR1");
    private final TelephonyManager d;
    private final int e;
    private final ctwh f;
    private final SubscriptionManager g;
    private final ctwb h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ctxb(defpackage.ctxa r4, defpackage.ctwh r5, defpackage.ctwb r6, defpackage.ctwx r7, android.content.Context r8, int r9) {
        /*
            r3 = this;
            ctwz r0 = new ctwz
            ffbr r1 = r4.a
            java.lang.Object r1 = r1.b()
            android.content.Context r1 = (android.content.Context) r1
            r1.getClass()
            ffbr r2 = r4.b
            java.lang.Object r2 = r2.b()
            ctvx r2 = (defpackage.ctvx) r2
            r2.getClass()
            ffbr r4 = r4.c
            java.lang.Object r4 = r4.b()
            ctwx r4 = (defpackage.ctwx) r4
            r4.getClass()
            r0.<init>(r1, r4, r9)
            r3.<init>(r0)
            android.telephony.TelephonyManager r4 = r7.a(r9)
            r3.d = r4
            r3.e = r9
            r3.f = r5
            java.lang.Class<android.telephony.SubscriptionManager> r4 = android.telephony.SubscriptionManager.class
            java.lang.Object r4 = r8.getSystemService(r4)
            android.telephony.SubscriptionManager r4 = (android.telephony.SubscriptionManager) r4
            if (r4 != 0) goto L41
            android.telephony.SubscriptionManager r4 = android.telephony.SubscriptionManager.from(r8)
        L41:
            r3.g = r4
            r3.h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxb.<init>(ctxa, ctwh, ctwb, ctwx, android.content.Context, int):void");
    }

    private static int B(int i) {
        try {
            Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(new Object(), Integer.valueOf(i));
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
            return -1;
        } catch (Exception e) {
            enrr j = c.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(i));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getSlotId", 241, "TelephonySubscriptionInfoAsOfLMR1.java")).t("TelephonySubscriptionInfoAsOfLMR1: SubscriptionManager.%s not found", "getSlotIndex");
            return -1;
        }
    }

    private final SubscriptionInfo C() {
        try {
            SubscriptionInfo activeSubscriptionInfo = this.g.getActiveSubscriptionInfo(this.e);
            if (activeSubscriptionInfo == null) {
                csjb c2 = c.c();
                c2.I("getActiveSubscriptionInfo(): empty sub info for");
                c2.m(this.e);
                c2.r();
            }
            return activeSubscriptionInfo;
        } catch (SecurityException e) {
            enrr j = c.j();
            j.W(1, TimeUnit.MINUTES);
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getActiveSubscriptionInfo", 435, "TelephonySubscriptionInfoAsOfLMR1.java")).r("TelephonySubscriptionInfoAsOfLMR1: getActiveSubscriptionInfo: no access for subId=%s", this.e);
            return null;
        } catch (Exception e2) {
            enrr j2 = c.j();
            j2.W(10, TimeUnit.SECONDS);
            ((enrr) ((enrr) j2.g(e2)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getActiveSubscriptionInfo", 441, "TelephonySubscriptionInfoAsOfLMR1.java")).r("TelephonySubscriptionInfoAsOfLMR1: getActiveSubscriptionInfo: system exception for subId=%s", this.e);
            return null;
        }
    }

    private final Object D(String str, int i) {
        try {
            Method declaredMethod = this.d.getClass().getDeclaredMethod(str, Integer.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(this.d, Integer.valueOf(i));
        } catch (Exception e) {
            enrr k = c.k();
            k.W(10, TimeUnit.SECONDS);
            k.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) k.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "invokeHiddenOnTelephonyManager", 132, "TelephonySubscriptionInfoAsOfLMR1.java")).t("TelephonySubscriptionInfoAsOfLMR1: No %s method on telephony manager", str);
            throw new NoSuchMethodException(a.a(str, "No ", " method"));
        }
    }

    private final Object E(String str, int i) {
        return D(str, B(i));
    }

    private final Object F(String str) {
        return D(str, this.e);
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final int[] A() {
        int i;
        int i2;
        SubscriptionInfo C = C();
        if (C != null) {
            i = C.getMcc();
            i2 = C.getMnc();
        } else {
            i = 0;
            i2 = 0;
        }
        return new int[]{i, i2};
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final int a() {
        SubscriptionInfo C = C();
        if (C == null) {
            return 0;
        }
        return C.getIconTint();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final int c() {
        boolean isEmbedded;
        SubscriptionInfo C = C();
        if (C == null) {
            return -1;
        }
        int simSlotIndex = C.getSimSlotIndex();
        if (simSlotIndex < 0 && ((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            ensz enszVar = (ensz) b.j();
            enszVar.aa(ensy.FULL);
            ensz enszVar2 = (ensz) enszVar.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getSimSlotIndex", 357, "TelephonySubscriptionInfoAsOfLMR1.java");
            Integer valueOf = Integer.valueOf(this.e);
            Integer valueOf2 = Integer.valueOf(simSlotIndex);
            boolean z = false;
            if (ctid.b) {
                isEmbedded = C.isEmbedded();
                if (isEmbedded) {
                    z = true;
                }
            }
            enszVar2.J("Active sub has invalid slotIndex: subId=%s, slotIndex=%s, isESIM=%s", valueOf, valueOf2, Boolean.valueOf(z));
        }
        return simSlotIndex;
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final int d() {
        try {
            return ((Integer) E("getSimState", this.e)).intValue();
        } catch (NoSuchMethodException e) {
            csjb b2 = c.b();
            b2.I("TelephonyManager.getSimState not found");
            b2.s(e);
            return 0;
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final Optional f() {
        SmsManager e = e();
        try {
            Method declaredMethod = e.getClass().getDeclaredMethod("getAllMessagesFromIcc", new Class[0]);
            declaredMethod.setAccessible(true);
            return Optional.ofNullable((List) declaredMethod.invoke(e, new Object[0]));
        } catch (Exception e2) {
            enrr j = c.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) j.g(e2)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getAllSimMessages", 281, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: getAllSimMessages: system api not found");
            return Optional.empty();
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final Optional g() {
        return Optional.ofNullable(e().getCarrierConfigValues());
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final Optional h() {
        SubscriptionInfo C = C();
        if (C != null) {
            String number = C.getNumber();
            return TextUtils.isEmpty(number) ? Optional.empty() : Optional.of(number);
        }
        ensz enszVar = (ensz) b.j();
        enszVar.W(1, TimeUnit.MINUTES);
        ensz enszVar2 = (ensz) enszVar.g(eldx.c());
        enszVar2.Y(csux.t, Integer.valueOf(this.e));
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getRawSelfNumber", 484, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: subInfo is null");
        return Optional.empty();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final CharSequence i() {
        SubscriptionInfo C = C();
        return C == null ? "" : C.getCarrierName();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final CharSequence j() {
        SubscriptionInfo C = C();
        return C == null ? "" : C.getDisplayName();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String k() {
        try {
            return emxe.b(this.d.getDeviceId(B(this.e)));
        } catch (Exception e) {
            enrr j = c.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getDeviceId", 219, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Missing permissions, returning empty device id");
            return "";
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String m() {
        try {
            try {
                return (String) F("getNetworkCountryIsoForSubscription");
            } catch (NoSuchMethodException unused) {
                return (String) F("getNetworkCountryIso");
            }
        } catch (NoSuchMethodException e) {
            enrr j = c.j();
            j.W(1, TimeUnit.MINUTES);
            j.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getNetworkCountry", 197, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Platform does not have API to get network country");
            return "";
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String n() {
        try {
            return (String) F("getNetworkOperatorName");
        } catch (NoSuchMethodException e) {
            enrr j = c.j();
            j.W(1, TimeUnit.MINUTES);
            j.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getNetworkOperatorName", 150, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Platform does not have API to get network operator");
            return null;
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String o() {
        CharSequence charSequence;
        TelephonyManager createForSubscriptionId;
        CharSequence simCarrierIdName;
        TelephonyManager createForSubscriptionId2;
        String str;
        TelephonyManager telephonyManager = this.d;
        int i = this.e;
        SubscriptionInfo C = C();
        if (C != null) {
            ctwh ctwhVar = this.f;
            String str2 = null;
            if (ctib.b()) {
                ContentResolver contentResolver = ctwhVar.b.getContentResolver();
                if (contentResolver != null && ctwhVar.c.l()) {
                    createForSubscriptionId2 = telephonyManager.createForSubscriptionId(i);
                    try {
                        str = createForSubscriptionId2.getSubscriberId();
                    } catch (SecurityException e) {
                        enrr k = ctwh.a.k();
                        k.W(1, TimeUnit.MINUTES);
                        ((enrr) ((enrr) k.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionNameHelper", "getSubscriberId", 161, "SubscriptionNameHelper.java")).q("SubscriptionNameHelper: telephonyManagerForSubscriptionId failed to getSubscriberId");
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        ctwh.a.n("Subscriber ID is null. Cannot access subscription name");
                    } else {
                        charSequence = Settings.Global.getString(contentResolver, "sim_card_name_".concat(String.valueOf(ctwh.a(str))));
                        if (TextUtils.isEmpty(charSequence)) {
                            charSequence = Settings.Global.getString(contentResolver, "sim_card_name_".concat(String.valueOf(str)));
                            csjb d = ctwh.a.d();
                            d.I("Non-encoded subscriber name discovered:");
                            d.I(charSequence);
                            d.r();
                        } else {
                            csjb d2 = ctwh.a.d();
                            d2.I("Subscriber name discovered:");
                            d2.I(charSequence);
                            d2.r();
                        }
                        csjb d3 = ctwh.a.d();
                        d3.I("Subscription name determined as:");
                        d3.I(charSequence);
                        d3.A("manufacturer", Build.MANUFACTURER);
                        d3.r();
                    }
                }
                charSequence = null;
                csjb d32 = ctwh.a.d();
                d32.I("Subscription name determined as:");
                d32.I(charSequence);
                d32.A("manufacturer", Build.MANUFACTURER);
                d32.r();
            } else {
                charSequence = null;
            }
            if (ctwh.c(charSequence)) {
                charSequence = C.getDisplayName();
                csjb d4 = ctwh.a.d();
                d4.I("Fall back to subInfo.getDisplayName:");
                d4.I(charSequence);
                d4.r();
            }
            if (ctid.b && ctwh.c(charSequence)) {
                if (!ctid.f || ctwhVar.b.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                    createForSubscriptionId = telephonyManager.createForSubscriptionId(i);
                    simCarrierIdName = createForSubscriptionId.getSimCarrierIdName();
                    if (simCarrierIdName != null) {
                        str2 = simCarrierIdName.toString();
                    }
                }
                csjb d5 = ctwh.a.d();
                d5.I("Fall back to mvno name:");
                d5.I(str2);
                d5.r();
                charSequence = str2;
            }
            if (ctib.d() && ctwh.c(charSequence)) {
                charSequence = C.getCarrierName();
                if (!TextUtils.isEmpty(charSequence)) {
                    csjb d6 = ctwh.a.d();
                    d6.I("Fall back to carrier name for Samsung:");
                    d6.I(charSequence);
                    d6.r();
                    return charSequence.toString();
                }
            }
            if (ctwh.c(charSequence)) {
                csjb d7 = ctwh.a.d();
                d7.I("Current subscription name is system default:");
                d7.I(charSequence);
                d7.r();
                charSequence = ctwh.b(telephonyManager, i);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = C.getCarrierName();
                csjb d8 = ctwh.a.d();
                d8.I("Fell back to carrier name:");
                d8.I(charSequence);
                d8.r();
            }
            if (!TextUtils.isEmpty(charSequence)) {
                return charSequence.toString();
            }
        }
        return ctwh.b(telephonyManager, i);
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String p() {
        SubscriptionInfo C = C();
        return C == null ? "" : C.getCountryIso();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String q() {
        try {
            try {
                return (String) F("getSimOperatorNameForSubscription");
            } catch (NoSuchMethodException unused) {
                return (String) F("getSimOperatorName");
            }
        } catch (NoSuchMethodException e) {
            enrr j = c.j();
            j.W(1, TimeUnit.MINUTES);
            j.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getSimOperatorName", 103, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Platform does not have API to get sim operator");
            return null;
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String r() {
        return this.h.g().t(A());
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String s() {
        SubscriptionInfo C = C();
        if (C != null) {
            return C.getIccId();
        }
        csjb c2 = c.c();
        c2.I("getSimSerialNumber: system returned empty sub info for ");
        c2.m(this.e);
        c2.r();
        return "";
    }

    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String u(Context context) {
        try {
            return emxe.b((String) F("getSubscriberId"));
        } catch (NoSuchMethodException e) {
            csjb b2 = c.b();
            b2.I("Platform does not have API to get subscriber id");
            b2.s(e);
            return "";
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean v(int i) {
        SmsManager e = e();
        try {
            Method declaredMethod = e.getClass().getDeclaredMethod("deleteMessageFromIcc", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(e, Integer.valueOf(i));
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception e2) {
            enrr j = c.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) j.g(e2)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "deleteSimMessage", 312, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: deleteSimMessage: system api not found");
        }
        return false;
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean w() {
        try {
            return ((Boolean) E("hasIccCard", this.e)).booleanValue();
        } catch (NoSuchMethodException e) {
            csjb b2 = c.b();
            b2.I("TelephonyManager.hasIccCard not found");
            b2.s(e);
            return false;
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean x() {
        try {
            Method declaredMethod = this.d.getClass().getDeclaredMethod("getDataEnabled", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this.d, Integer.valueOf(this.e));
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Exception e) {
            enrr j = c.j();
            j.W(10, TimeUnit.SECONDS);
            j.Y(csux.t, Integer.valueOf(this.e));
            ((enrr) ((enrr) j.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "isMobileDataEnabled", 177, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: isMobileDataEnabled: system api not found");
            return false;
        }
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean y() {
        return this.g.isNetworkRoaming(this.e);
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final boolean z() {
        return C() != null;
    }
}
