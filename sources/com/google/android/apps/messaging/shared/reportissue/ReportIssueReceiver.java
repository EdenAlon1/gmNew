package com.google.android.apps.messaging.shared.reportissue;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.alsi;
import defpackage.cins;
import defpackage.cnmn;
import defpackage.cnmx;
import defpackage.cnne;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctid;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfr;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.ephv;
import defpackage.ephx;
import defpackage.erpp;
import defpackage.ffbr;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ReportIssueReceiver extends cnmn {
    public static final cskc a = cskc.g("Bugle", "ReportIssueReceiver");
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.d.b()).b("ReportIssueReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.ReportIssue.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        char c;
        Throwable th;
        String action = intent.getAction();
        action.getClass();
        int hashCode = action.hashCode();
        if (hashCode == -520019562) {
            if (action.equals("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION_ACTION")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -101202989) {
            if (hashCode == 546235615 && action.equals("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.apps.messaging.shared.reportissue.DISMISS_NOTIFICATION")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            ((cins) this.b.b()).l();
        } else {
            if (c != 1) {
                if (c == 2) {
                    ((alsi) this.e.b()).a(((cnmx) this.c.b()).f(intent, "report_issue_event_type", 5));
                    return;
                }
                csjb e = a.e();
                e.I("Unexpected Intent action sent to ReportIssueReceiver:");
                e.I(action);
                e.r();
                return;
            }
            if (!ctid.e) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
        Serializable serializableExtra = intent.getSerializableExtra("throwable");
        enhk enhkVar = null;
        if (serializableExtra instanceof Throwable) {
            th = (Throwable) serializableExtra;
        } else {
            if (serializableExtra != null) {
                csjb e2 = a.e();
                e2.I("Unable to deserialize");
                e2.A("throwable", serializableExtra);
                e2.r();
            }
            th = null;
        }
        Bundle bundleExtra = intent.getBundleExtra("psd_map");
        if (bundleExtra != null && bundleExtra.size() != 0) {
            enhd enhdVar = new enhd();
            for (String str : bundleExtra.keySet()) {
                String string = bundleExtra.getString(str);
                if (string != null) {
                    enhdVar.k(str, string);
                }
            }
            enhk c2 = enhdVar.c();
            if (!c2.isEmpty()) {
                enhkVar = c2;
            }
        }
        ephx f = ((cnmx) this.c.b()).f(intent, "report_issue_event_type", 3);
        if (th != null) {
            csjb c3 = a.c();
            c3.I("Messages automatically detected an error. User tapped notification, launching feedback:");
            c3.s(th);
        }
        cnmx cnmxVar = (cnmx) this.c.b();
        ephv b = ephv.b(f.d);
        if (b == null) {
            b = ephv.UNKNOWN_ISSUE_TYPE;
        }
        elfl e3 = cnmxVar.e(b, th, enhkVar);
        e3.getClass();
        elfr.l(e3, new cnne(this, f), erpp.a);
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
