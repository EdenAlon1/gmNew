package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akvz;
import defpackage.akxl;
import defpackage.bbfd;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.cnfn;
import defpackage.crnc;
import defpackage.csux;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eokv;
import defpackage.eokw;
import defpackage.eolt;
import defpackage.eolu;
import defpackage.eolv;
import defpackage.epyw;
import defpackage.fbqp;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class CopyOtpReceiver extends cnfn {
    private static final entd f = entd.c("Bugle");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.c.b()).b("CopyOtpReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.CopyOtp.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("otp_code");
        ConversationIdType b = bdgq.b(intent.getStringExtra("conversation_id"));
        MessageIdType b2 = bdhb.b(intent.getStringExtra("message_id"));
        if (!b.b()) {
            ensz enszVar = (ensz) f.h();
            enszVar.Y(csux.o, b.toString());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/receiver/CopyOtpReceiver", "processBroadcast", 77, "CopyOtpReceiver.java")).q("Starting CopyOtpReceiver");
            ((bbfd) this.b.b()).f(b, b2, false).r(this);
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_CONVERSATION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        if (!b.b()) {
            eokv eokvVar = (eokv) eokw.a.createBuilder();
            long b3 = ((akvz) this.e.b()).b(b);
            eokvVar.copyOnWrite();
            eokw eokwVar = (eokw) eokvVar.instance;
            eokwVar.b |= 65536;
            eokwVar.r = b3;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eokw eokwVar2 = (eokw) eokvVar.build();
            eokwVar2.getClass();
            eolvVar2.m = eokwVar2;
            eolvVar2.b |= 8;
        }
        ((akxl) this.d.b()).k(eoluVar, epyw.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE);
        q("copy-otp", ((crnc) this.a.b()).a(stringExtra, b2, fbqp.NOTIFICATION_VIEW));
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
