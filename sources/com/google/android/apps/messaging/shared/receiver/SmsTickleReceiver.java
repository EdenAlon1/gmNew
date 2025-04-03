package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import androidx.car.app.hardware.info.EnergyProfile;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.cfyh;
import defpackage.cnga;
import defpackage.ctvs;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.fcjy;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SmsTickleReceiver extends cnga {
    public ffbr b;
    public ffbr c;
    public ffbr d;
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver");
    public static final cfva a = cfvl.e(cfvl.b, "sms_tickle_receiver_port", 8901);

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.b.b()).b("SmsTickleReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SmsTickleReceiver.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 19;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SmsTickleReceiver.Latency";
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        int length;
        enru enruVar = e;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "doInBackground", 92, "SmsTickleReceiver.java")).t("processBroadcast %s", intent);
        int intValue = ((Integer) a.e()).intValue();
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "BugleSatellite");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "getSmsPort", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SmsTickleReceiver.java")).r("getSmsPort from flag: %d", intValue);
        Uri data = intent.getData();
        if (data == null) {
            ensk j = enruVar.j();
            j.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 108, "SmsTickleReceiver.java")).q("processSmsIntent, uri is null, ignoring");
            return;
        }
        int port = data.getPort();
        if (intValue != port) {
            ensk j2 = enruVar.j();
            j2.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 113, "SmsTickleReceiver.java")).u("processSmsIntent, port not matching, ignoring. expectedPort: %d actual port: %d", intValue, port);
            return;
        }
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        if (messagesFromIntent != null && (length = messagesFromIntent.length) > 0) {
            char c = 0;
            SmsMessage smsMessage = messagesFromIntent[0];
            if (smsMessage != null) {
                byte[] userData = smsMessage.getUserData();
                ensk e3 = enruVar.e();
                e3.Y(ente.a, "BugleSatellite");
                ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 127, "SmsTickleReceiver.java")).r("Received Message Count: %d", length);
                try {
                    fcjy fcjyVar = (fcjy) eyfy.parseFrom(fcjy.a, userData, eyfc.a());
                    if (fcjyVar != null) {
                        int i = fcjyVar.d;
                        if (i == 0) {
                            c = 2;
                        } else if (i == 1) {
                            c = 3;
                        }
                        if (c == 0 || c != 3) {
                            ensk j3 = enruVar.j();
                            j3.Y(ente.a, "BugleSatellite");
                            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 138, "SmsTickleReceiver.java")).r("processSmsIntent, skipping because of unexpected tickle type: %d", fcjyVar.d);
                            return;
                        }
                    }
                    ((cfyh) this.d.b()).a(fcjyVar);
                    return;
                } catch (eygu e4) {
                    ensk i2 = e.i();
                    i2.Y(ente.a, "BugleSatellite");
                    ((enrr) ((enrr) ((enrr) i2).g(e4)).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", (char) 133, "SmsTickleReceiver.java")).q("processSmsIntent: couldn't parse payload into an SmsTickle, skipping");
                    return;
                }
            }
        }
        ensk i3 = enruVar.i();
        i3.Y(ente.a, "BugleSatellite");
        ((enrr) ((enrr) i3).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 122, "SmsTickleReceiver.java")).q("Received SMS data intent could not be parsed");
    }

    @Override // defpackage.cnhy
    public final boolean h(Context context, Intent intent) {
        enru enruVar = e;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "onPreExecute", 82, "SmsTickleReceiver.java")).q("SmsTickle feature enabled");
        if (((ctvs) this.c.b()).d()) {
            return true;
        }
        ensk j = enruVar.j();
        j.Y(ente.a, "BugleSatellite");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "onPreExecute", 84, "SmsTickleReceiver.java")).q("SmsTickle not default sms app");
        return false;
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }
}
