package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.bapk;
import defpackage.bbfu;
import defpackage.cnfr;
import defpackage.cpdl;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctid;
import defpackage.ctvb;
import defpackage.ctwb;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class MmsWapPushDeliverReceiver extends cnfr {
    private static final cskc h = cskc.g("Bugle", "MmsWapPushDeliverReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.f.b()).b("MmsWapPushDeliverReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.MmsWapPushDeliver.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 7;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.MmsWapPushDeliver.Latency";
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        Action a;
        TelephonyManager createForSubscriptionId;
        int simCarrierId;
        if ("android.provider.Telephony.WAP_PUSH_DELIVER".equals(intent.getAction()) || "com.google.android.apps.messaging.TestAction".equals(intent.getAction())) {
            if (!((ctvb) this.b.b()).K()) {
                h.p("Ignoring 'mms received' because SMS is not enabled");
                return;
            }
            String type = intent.getType();
            if ("application/vnd.wap.mms-message".equals(type) || "application/vnd.wap.sic".equals(type)) {
                int a2 = ((ctwb) this.c.b()).h(intent.getIntExtra("subscription", -1)).a();
                int i = 0;
                int max = Math.max(((Integer) Optional.ofNullable(((ctwb) this.c.b()).h(a2).v()).map(new Function() { // from class: cngj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ermn.h((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(0)).intValue(), 0);
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && ctid.b) {
                    createForSubscriptionId = telephonyManager.createForSubscriptionId(a2);
                    simCarrierId = createForSubscriptionId.getSimCarrierId();
                    i = Math.max(simCarrierId, 0);
                }
                int i2 = i;
                byte[] byteArrayExtra = intent.getByteArrayExtra(GroupManagementRequest.DATA_TAG);
                if (byteArrayExtra == null) {
                    h.n("Received wap push has empty data");
                    return;
                }
                long longExtra = intent.getLongExtra("messageId", 0L);
                if ("application/vnd.wap.mms-message".equals(type)) {
                    cskc cskcVar = h;
                    csjb c = cskcVar.c();
                    c.I("Received MMS WAP Push");
                    c.w(longExtra);
                    c.r();
                    cskcVar.l("MMS receiving START");
                    a = ((bapk) this.d.b()).a(a2, byteArrayExtra, longExtra, max, i2);
                } else {
                    if (!((cpdl) this.a.b()).c(a2)) {
                        h.m("WAP Push SI message ignored because the feature disabled");
                        return;
                    }
                    csjb c2 = h.c();
                    c2.I("Received WAP Push SI");
                    c2.w(longExtra);
                    c2.r();
                    a = ((bbfu) this.e.b()).a(a2, byteArrayExtra, longExtra);
                }
                a.r(this);
            }
        }
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.incoming_message_foreground_notification_text);
    }
}
