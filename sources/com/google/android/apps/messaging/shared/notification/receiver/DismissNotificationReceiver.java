package com.google.android.apps.messaging.shared.notification.receiver;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import defpackage.altk;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.cinj;
import defpackage.cins;
import defpackage.cirf;
import defpackage.eepf;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.enhk;
import defpackage.eoqn;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DismissNotificationReceiver extends cirf {
    static final cfup a = cfvl.i(cfvl.b, "disable_logging_spam_auto_reply_conversation_observer", false);
    private static final enhk e = enhk.l(cinj.AUTOMOVED_SPAM, eoqn.AUTOMOVED_SPAM_NOTIFICATION);
    public cins b;
    public elbx c;
    public ffbr d;

    public static PendingIntent f(Context context, cinj cinjVar) {
        Intent intent = new Intent(context, (Class<?>) DismissNotificationReceiver.class);
        intent.setAction("com.google.android.apps.messaging.dismiss_notification");
        intent.putExtra("NOTIFICATION_ID", cinjVar.G);
        ClipData clipData = eepf.a;
        return eepf.d(context, 136, intent, 335544320);
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.c.b("DismissReceiver Receive Broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.DismissNotificationReceiver.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        cinj cinjVar;
        int intExtra = intent.getIntExtra("NOTIFICATION_ID", -1);
        if (intExtra == -1) {
            return;
        }
        cinj[] values = cinj.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cinjVar = null;
                break;
            }
            cinjVar = values[i];
            if (cinjVar.G == intExtra) {
                break;
            } else {
                i++;
            }
        }
        if (cinjVar != null) {
            this.b.j(cinjVar);
            if (((Boolean) a.e()).booleanValue()) {
                return;
            }
            ((altk) this.d.b()).aQ((eoqn) e.getOrDefault(cinjVar, eoqn.UNKNOWN_NOTIFICATION));
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
