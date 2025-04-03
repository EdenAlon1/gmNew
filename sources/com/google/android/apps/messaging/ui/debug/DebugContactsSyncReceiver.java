package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.axol;
import defpackage.cskc;
import defpackage.dact;
import defpackage.davl;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.ffbr;
import defpackage.ffhe;
import defpackage.ffkj;
import defpackage.ffsk;
import defpackage.ffsm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugContactsSyncReceiver extends davl {
    public static final cskc a = cskc.g("BugleContacts", "ContactsSyncReceiver");
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;

    @Override // defpackage.cniz
    public final ekzm a() {
        ffbr ffbrVar = this.b;
        if (ffbrVar == null) {
            ffkj.c("traceCreation");
            ffbrVar = null;
        }
        return ((elbx) ffbrVar.b()).b("ContactsSyncReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        elfl c;
        context.getClass();
        intent.getClass();
        if (!ffkj.e(intent.getAction(), "com.google.android.apps.messaging.contacts_sync")) {
            a.p("Skipping the import, the action " + intent.getAction() + " != ACTION_CONTACTS_SYNC");
            return;
        }
        a.p("Forcing a contacts import to Bugle DB");
        ffbr ffbrVar = this.d;
        if (ffbrVar == null) {
            ffkj.c("backgroundScope");
            ffbrVar = null;
        }
        Object b = ffbrVar.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new dact(this, null));
        q("DebugContactsSync", c);
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    public final ffbr f() {
        ffbr ffbrVar = this.g;
        if (ffbrVar != null) {
            return ffbrVar;
        }
        ffkj.c("contactsSyncDataService");
        return null;
    }

    public final ffbr g() {
        ffbr ffbrVar = this.e;
        if (ffbrVar != null) {
            return ffbrVar;
        }
        ffkj.c("settingsStore");
        return null;
    }
}
