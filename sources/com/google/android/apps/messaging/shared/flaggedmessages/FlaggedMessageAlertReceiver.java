package com.google.android.apps.messaging.shared.flaggedmessages;

import android.content.Context;
import android.content.Intent;
import defpackage.cgbi;
import defpackage.cgcg;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class FlaggedMessageAlertReceiver extends cgbi {
    private static final cskc c = cskc.g("Bugle", "FlaggedMessageAlertReceiver");
    public cgcg a;
    public elbx b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("FlaggedMessageAlertReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.MessageFlaggerAlert.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        if (action.hashCode() == 1527016992 && action.equals("com.google.android.apps.messaging.shared.flaggedmessages.ALERT_EXPIRED_FLAGGED_MESSAGES")) {
            q("FlaggedMessageAlertReceiver", this.a.a());
            return;
        }
        csjb e = c.e();
        e.I("Unexpected Intent action sent to FlaggedMessageAlertReceiver:");
        e.I(action);
        e.r();
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
