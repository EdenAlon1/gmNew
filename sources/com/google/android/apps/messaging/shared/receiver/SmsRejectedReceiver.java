package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.alkf;
import defpackage.alkg;
import defpackage.alkw;
import defpackage.altk;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.cins;
import defpackage.cnfz;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.ephv;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SmsRejectedReceiver extends cnfz {
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    private static final cskc g = cskc.g("Bugle", "SmsRejectedReceiver");
    public static final cfva a = cfvl.i(cfvl.b, "enable_sms_rejected_receiver", false);
    public static final cfva b = cfvl.i(cfvl.b, "enable_sms_rejected_receiver_to_post_notification", false);

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.c.b()).b("SmsRejectedReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        ekzz f = eleg.f("SmsRejectedReceiver.executeAction");
        if (intent != null) {
            try {
                String action = intent.getAction();
                cskc cskcVar = g;
                csjb e = cskcVar.e();
                e.I(intent);
                e.r();
                if ("android.provider.Telephony.SMS_REJECTED".equals(action)) {
                    int intExtra = intent.getIntExtra("result", 1);
                    int intExtra2 = intent.getIntExtra("subId", -1);
                    csjb e2 = cskcVar.e();
                    e2.I("SMS_REJECTED_ACTION");
                    e2.y("result", intExtra);
                    e2.r();
                    ((altk) this.d.b()).Y(intExtra, intExtra2);
                    alkw alkwVar = (alkw) this.f.b();
                    alkf alkfVar = (alkf) alkg.a.createBuilder();
                    alkfVar.copyOnWrite();
                    alkg alkgVar = (alkg) alkfVar.instance;
                    alkgVar.c = 1;
                    alkgVar.b = 1 | alkgVar.b;
                    alkfVar.copyOnWrite();
                    alkg alkgVar2 = (alkg) alkfVar.instance;
                    alkgVar2.b |= 16;
                    alkgVar2.g = intExtra;
                    alkwVar.e((alkg) alkfVar.build());
                    if (((Boolean) b.e()).booleanValue()) {
                        ((cins) this.e.b()).X(ephv.SMS_REJECTED, context.getResources().getString(R.string.report_receive_issue_notification_message));
                    }
                }
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        f.close();
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 6;
    }
}
