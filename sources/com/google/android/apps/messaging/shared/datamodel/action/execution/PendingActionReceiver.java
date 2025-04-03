package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akuv;
import defpackage.alrv;
import defpackage.bbbz;
import defpackage.bbcj;
import defpackage.bbdv;
import defpackage.bbei;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.cskc;
import defpackage.ctie;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.emyl;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PendingActionReceiver extends bbei {
    static final emyl a = cfvl.x(169455120, "pending_action_receiver_async");
    private static final cskc f = cskc.g("BugleDataModel", "PendingActionReceiver");
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;

    public static PendingIntent l(Context context, Action action, int i, boolean z, int i2, Uri uri, bbdv bbdvVar) {
        Intent a2 = akuv.c(context.getApplicationContext(), PendingActionReceiver.class, "android.intent.action.VIEW").a();
        if (uri != null) {
            a2.setData(uri);
        }
        a2.putExtra("datamodel_action_bundle", bbdvVar.a(action));
        a2.putExtra("job_id", i);
        if (z) {
            a2.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        return PendingIntent.getBroadcast(context, i, a2, ctie.a(i2));
    }

    private final void m(Intent intent) {
        if (intent == null) {
            f.n("received no intent.");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("datamodel_action_bundle");
        if (bundleExtra == null) {
            f.n("received intent with no Bundle.");
            return;
        }
        try {
            Action c = ((bbdv) this.c.b()).c(bundleExtra);
            if (c == null) {
                f.n("received intent with no Action.");
                return;
            }
            int i = bundleExtra.getInt("job_id", bbcj.a(c));
            if (c.w == eogt.MARK_AS_READ_ACTION) {
                ((alrv) this.b.b()).e(alrv.o);
            }
            bbcj bbcjVar = new bbcj(c.s, i, null, this, true);
            bbcjVar.b = toString();
            q("PendingActionReceiver", ((bbbz) this.e.b()).a(bbcjVar, c));
        } catch (BadParcelableException e) {
            f.o("Failed to unparcel action.", e);
        }
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.d.b()).b("PendingActionReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.PendingActionReceiver.Latency";
    }

    @Override // defpackage.cnhy
    protected final void g(Context context, Intent intent) {
        m(intent);
    }

    @Override // defpackage.cnhy
    public final boolean h(Context context, Intent intent) {
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            return true;
        }
        this.J = true;
        m(intent);
        return false;
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return ((Boolean) ((cfup) a.get()).e()).booleanValue();
    }
}
