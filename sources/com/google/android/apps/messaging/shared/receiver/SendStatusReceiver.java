package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.alrv;
import defpackage.altk;
import defpackage.aolr;
import defpackage.baks;
import defpackage.baky;
import defpackage.bbfr;
import defpackage.bdhb;
import defpackage.cfup;
import defpackage.cnfv;
import defpackage.coxk;
import defpackage.cpdg;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.csjy;
import defpackage.cskc;
import defpackage.csrv;
import defpackage.csuu;
import defpackage.dtuu;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.emxe;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SendStatusReceiver extends cnfv {
    private static final cskc i = cskc.g("Bugle", "SendStatusReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.e.b()).b("SendStatusReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SendStatus.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SendStatus.Latency";
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        ekzz ekzzVar;
        int i2;
        int i3;
        ekzz f = eleg.f("SendStatusReceiver.processBroadcast");
        try {
            String action = intent.getAction();
            int i4 = 0;
            int intExtra = intent.getIntExtra("resultCode", 0);
            long longExtra = intent.getLongExtra("messageId", 0L);
            cskc cskcVar = i;
            csjb c = cskcVar.c();
            c.I("processBroadcast.");
            c.A(GroupManagementRequest.ACTION_TAG, action);
            c.y("resultCode", intExtra);
            c.w(longExtra);
            c.r();
            try {
                if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_SENT".equals(action)) {
                    ((alrv) this.f.b()).f(alrv.e);
                    Uri uri = (Uri) intent.getParcelableExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    int intExtra2 = intent.getIntExtra("errorCode", -1);
                    int intExtra3 = intent.getIntExtra("partCnt", 1);
                    int intExtra4 = intent.getIntExtra("partId", -1);
                    ekzzVar = f;
                    int intExtra5 = intent.getIntExtra("subId", -1);
                    String stringExtra = intent.getStringExtra("destination");
                    String stringExtra2 = intent.getStringExtra("format");
                    Boolean bool = (Boolean) intent.getSerializableExtra("ims");
                    ((aolr) this.h.b()).u(emxe.b(stringExtra), intExtra5);
                    if (intExtra == -1) {
                        if (((csrv) this.g.b()).n) {
                            intExtra = -1;
                        } else {
                            if (csjy.q("Bugle", 2)) {
                                csjb d = cskcVar.d();
                                d.I("received sent result.");
                                d.y("partId", intExtra4);
                                d.y("partCount", intExtra3);
                                d.y("resultCode", -1);
                                d.A("messageUri", uri);
                                d.r();
                            }
                            i3 = intExtra2;
                            i2 = -1;
                            ((bbfr) this.c.b()).h(bdhb.b(intent.getStringExtra("message_id")), uri, i2, i3, intExtra5, intExtra3, stringExtra2, bool).r(this);
                        }
                    }
                    csjb b = cskcVar.b();
                    b.I("failure in sending message part.");
                    b.y("partId", intExtra4);
                    b.y("partCount", intExtra3);
                    b.y("resultCode", intExtra);
                    b.y("errorCode", intExtra2);
                    b.A("messageUri", uri);
                    b.w(longExtra);
                    b.r();
                    if (intExtra2 == -1) {
                        csjb a = cskcVar.a();
                        a.I("intent extras:\n");
                        a.I(csjy.a(intent));
                        a.r();
                        intExtra2 = -1;
                    }
                    if (((csrv) this.g.b()).n) {
                        i3 = -1;
                        i2 = 1;
                    } else {
                        i2 = intExtra;
                        i3 = intExtra2;
                    }
                    ((bbfr) this.c.b()).h(bdhb.b(intent.getStringExtra("message_id")), uri, i2, i3, intExtra5, intExtra3, stringExtra2, bool).r(this);
                } else {
                    ekzzVar = f;
                    if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT".equals(action)) {
                        ((alrv) this.f.b()).f(alrv.f);
                        ((bbfr) this.c.b()).b(intExtra, intent.getData(), intent.getExtras()).r(this);
                    } else if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED".equals(action)) {
                        baky bakyVar = (baky) this.b.b();
                        Bundle extras = intent.getExtras();
                        extras.getClass();
                        new ProcessDownloadedMmsAction(bakyVar.a, bakyVar.b, intExtra, extras).r(this);
                    } else if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_DELIVERED".equals(action)) {
                        byte[] byteArrayExtra = intent.getByteArrayExtra("pdu");
                        Integer num = null;
                        if (byteArrayExtra != null) {
                            String stringExtra3 = intent.getStringExtra("format");
                            SmsMessage createFromPdu = stringExtra3 != null ? SmsMessage.createFromPdu(byteArrayExtra, stringExtra3) : SmsMessage.createFromPdu(byteArrayExtra);
                            if (createFromPdu != null) {
                                int status = createFromPdu.getStatus();
                                if (!((Boolean) ((cfup) cpdg.b.get()).e()).booleanValue() || status != 131072) {
                                    i4 = status;
                                }
                                num = Integer.valueOf(i4);
                            }
                        }
                        if (num == null) {
                            cskcVar.n("empty report message");
                        } else {
                            Uri uri2 = (Uri) intent.getParcelableExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                            try {
                                if (uri2 == null) {
                                    cskcVar.n("smsMessageUri is null");
                                } else {
                                    csjb a2 = cskcVar.a();
                                    a2.I("processing SMS delivery report.");
                                    a2.A("smsMessageUri", uri2);
                                    a2.A("status", num);
                                    a2.w(longExtra);
                                    a2.r();
                                    if (csuu.A(uri2)) {
                                        baks baksVar = (baks) this.a.b();
                                        int intValue = num.intValue();
                                        cqoh cqohVar = (cqoh) baksVar.b.b();
                                        cqohVar.getClass();
                                        coxk coxkVar = (coxk) baksVar.c.b();
                                        coxkVar.getClass();
                                        altk altkVar = (altk) baksVar.d.b();
                                        altkVar.getClass();
                                        dtuu dtuuVar = (dtuu) baksVar.e.b();
                                        dtuuVar.getClass();
                                        new ProcessDeliveryReportAction(baksVar.a, cqohVar, coxkVar, altkVar, dtuuVar, uri2, intValue).r(this);
                                    }
                                }
                            } catch (NullPointerException unused) {
                                i.n("NPE inside SmsMessage");
                            }
                        }
                    }
                }
                ekzzVar.close();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    ekzzVar.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            ekzzVar = f;
        }
    }

    @Override // defpackage.cnhy
    public final boolean h(Context context, Intent intent) {
        intent.putExtra("resultCode", getResultCode());
        return true;
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -1366403072:
                if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_SENT")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1070391116:
                if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -246885565:
                if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1022419196:
                if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_DELIVERED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return context.getString(R.string.outgoing_message_foreground_notification_text);
        }
        if (c == 2) {
            return context.getString(R.string.delivered_message_foreground_notification_text);
        }
        if (c != 3) {
            return null;
        }
        return context.getString(R.string.downloaded_mms_foreground_notification_text);
    }
}
