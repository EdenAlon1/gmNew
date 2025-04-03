package com.google.android.apps.messaging.shared.receiver.search;

import android.content.Context;
import android.content.Intent;
import defpackage.akxl;
import defpackage.cbto;
import defpackage.cetw;
import defpackage.cevh;
import defpackage.ceyr;
import defpackage.cnky;
import defpackage.coke;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.eolt;
import defpackage.eolu;
import defpackage.eolv;
import defpackage.epcu;
import defpackage.epcw;
import defpackage.epcx;
import defpackage.epyw;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class IcingIndexingUpdateReceiver extends cnky {
    private static final cskc e = cskc.g("BugleAction", "IcingIndexingUpdateReceiver");
    public ffbr a;
    public elbx b;
    public cbto c;
    public ffbr d;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("IcingIndexingUpdateReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.IncomingIcingEvent.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        if (intent == null || !"com.google.firebase.appindexing.UPDATE_INDEX".equals(intent.getAction())) {
            return;
        }
        int intExtra = intent.getIntExtra("com.google.firebase.appindexing.extra.REASON", 0);
        csjb c = e.c();
        c.I("schedule the job to update index due to icing event:");
        c.I(intExtra != 1 ? intExtra != 2 ? "unknown" : "refresh" : "rebuild");
        c.r();
        int a = epcw.a(intExtra);
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.ICING_INDEX_UPDATE_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        epcu epcuVar = (epcu) epcx.a.createBuilder();
        epcuVar.copyOnWrite();
        epcx epcxVar = (epcx) epcuVar.instance;
        if (a == 0) {
            throw null;
        }
        epcxVar.c = a - 1;
        epcxVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epcx epcxVar2 = (epcx) epcuVar.build();
        epcxVar2.getClass();
        eolvVar2.ah = epcxVar2;
        eolvVar2.d = 1 | eolvVar2.d;
        akxlVar.k(eoluVar, epyw.ICING_INDEX_UPDATE_EVENT);
        if (intExtra == 0) {
            return;
        }
        ((coke) this.d.b()).c();
        ((cevh) this.c.a.b()).g(ceyr.g("icing_index_rebuild_handler", cetw.a));
    }
}
