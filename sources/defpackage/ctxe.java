package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.telephony.CarrierConfigManager;
import android.telephony.TelephonyManager;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxe extends ctvk {
    private static final cskc a = cskc.g("Bugle", "TelephonySubscriptionInfoAsOfM");
    private final CarrierConfigManager b;
    private final TelephonyManager c;
    private final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ctxe(defpackage.ctxc r8, defpackage.ctwx r9, android.content.Context r10, int r11) {
        /*
            r7 = this;
            ctxb r0 = new ctxb
            ffbr r1 = r8.a
            java.lang.Object r1 = r1.b()
            ctxa r1 = (defpackage.ctxa) r1
            r1.getClass()
            ffbr r2 = r8.b
            java.lang.Object r2 = r2.b()
            ctwh r2 = (defpackage.ctwh) r2
            r2.getClass()
            ffbr r3 = r8.c
            java.lang.Object r3 = r3.b()
            ctwb r3 = (defpackage.ctwb) r3
            r3.getClass()
            ffbr r4 = r8.d
            java.lang.Object r4 = r4.b()
            ctwx r4 = (defpackage.ctwx) r4
            r4.getClass()
            ffbr r8 = r8.e
            java.lang.Object r8 = r8.b()
            r5 = r8
            android.content.Context r5 = (android.content.Context) r5
            r5.getClass()
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.<init>(r0)
            android.telephony.TelephonyManager r8 = r9.a(r6)
            r7.c = r8
            java.lang.Class<android.telephony.CarrierConfigManager> r8 = android.telephony.CarrierConfigManager.class
            java.lang.Object r8 = r10.getSystemService(r8)
            android.telephony.CarrierConfigManager r8 = (android.telephony.CarrierConfigManager) r8
            r8.getClass()
            r7.b = r8
            r7.d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxe.<init>(ctxc, ctwx, android.content.Context, int):void");
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final Optional g() {
        return Optional.ofNullable(this.b.getConfigForSubId(this.d)).map(new Function() { // from class: ctxd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Bundle((PersistableBundle) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String q() {
        return this.c.getSimOperatorName();
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final String u(Context context) {
        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            enrr k = a.k();
            k.W(1, TimeUnit.MINUTES);
            k.Y(csux.t, Integer.valueOf(this.d));
            ((enrr) ((enrr) k.g(eldx.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfM", "getSubscriberId", 64, "TelephonySubscriptionInfoAsOfM.java")).q("TelephonySubscriptionInfoAsOfM: Missing permissions, returning empty subscriber id");
            return "";
        }
        try {
            return emxe.b(this.c.getSubscriberId());
        } catch (SecurityException e) {
            enrr k2 = a.k();
            k2.W(1, TimeUnit.MINUTES);
            k2.Y(csux.t, Integer.valueOf(this.d));
            ((enrr) ((enrr) k2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfM", "getSubscriberId", 77, "TelephonySubscriptionInfoAsOfM.java")).q("TelephonySubscriptionInfoAsOfM: failed to get subscriberId, is Messages the default SMS app?");
            return "";
        }
    }
}
