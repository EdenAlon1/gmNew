package com.google.android.apps.messaging.shared.rcs.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.ckds;
import defpackage.clfu;
import defpackage.clhc;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.csjy;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.emxe;
import defpackage.ffbr;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class MessagingServiceResponseReceiver extends clfu {
    private static final cskc g = cskc.g("BugleRcs", "MessagingServiceResponseReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;

    @Override // defpackage.cnhy
    protected final String N() {
        return "Bugle.Broadcast.Sequencer.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.a.b()).b("RCS Engine MessagingService receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.MessagingServiceResponseReceiver.Latency";
    }

    @Override // defpackage.cnhy
    protected final boolean h(Context context, Intent intent) {
        return ((ckds) this.b.b()).C(intent);
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    public final elfl j(Context context, Intent intent) {
        elfl e;
        String b = emxe.b(intent.getAction());
        cskc cskcVar = g;
        csjb c = cskcVar.c();
        c.I("Intent received");
        c.A(GroupManagementRequest.ACTION_TAG, b);
        c.r();
        ffbr ffbrVar = (ffbr) ((Map) this.c.b()).get(b);
        if (ffbrVar == null) {
            csjb b2 = cskcVar.b();
            b2.I("Ignoring intent with unknown action");
            b2.A(GroupManagementRequest.ACTION_TAG, b);
            b2.r();
            return elfo.e(null);
        }
        final clhc clhcVar = (clhc) ffbrVar.b();
        final Instant ofEpochMilli = Instant.ofEpochMilli(((cqoh) this.d.b()).a());
        try {
            e = clhcVar.a(intent);
        } catch (IllegalArgumentException e2) {
            csjb b3 = g.b();
            b3.I("Ignoring intent with invalid data");
            b3.A(GroupManagementRequest.ACTION_TAG, intent.getAction());
            b3.r();
            csjy.n("BugleRcs", Log.getStackTraceString(e2));
            e = elfo.e(null);
        }
        return e.h(new emwl() { // from class: clhe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                MessagingServiceResponseReceiver messagingServiceResponseReceiver = MessagingServiceResponseReceiver.this;
                ((clhd) messagingServiceResponseReceiver.e.b()).b.g(clhcVar.b(), Duration.between(ofEpochMilli, Instant.ofEpochMilli(((cqoh) messagingServiceResponseReceiver.d.b()).a())).toMillis());
                return null;
            }
        }, (Executor) this.f.b());
    }
}
