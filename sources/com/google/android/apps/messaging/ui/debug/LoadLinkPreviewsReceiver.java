package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.axol;
import defpackage.cskc;
import defpackage.dawa;
import defpackage.dawf;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.ffdx;
import defpackage.ffhe;
import defpackage.ffip;
import defpackage.ffkj;
import defpackage.ffno;
import defpackage.ffoo;
import defpackage.ffsk;
import defpackage.ffsm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoadLinkPreviewsReceiver extends dawa {
    public static final cskc a = cskc.g("BugleLinkPreviews", "LoadLinkPreviewsReceiver");
    public ffbr b;
    public ffbr c;
    public fazb d;
    public ffbr e;

    @Override // defpackage.cniz
    public final ekzm a() {
        ffbr ffbrVar = this.b;
        if (ffbrVar == null) {
            ffkj.c("traceCreation");
            ffbrVar = null;
        }
        return ((elbx) ffbrVar.b()).b("LoadLinkPreviewsReceiver receive broadcast");
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
        if (!ffkj.e(intent.getAction(), "com.google.android.apps.messaging.load_link_previews")) {
            a.p("Skipping the import, the action " + intent.getAction() + " != com.google.android.apps.messaging.load_link_previews");
            return;
        }
        List af = ffdx.af(ffno.g(ffno.k(ffno.h(ffip.a(new BufferedReader(new InputStreamReader(new FileInputStream((File) LoadMessagesReceiver.c.a(intent, context, "link_previews.csv")), ffoo.a), 8192)), ((Number) LoadMessagesReceiver.b.invoke(intent)).intValue()), ((Number) LoadMessagesReceiver.a.invoke(intent)).intValue())));
        a.p("Number of lines: " + af.size());
        Iterator it = af.iterator();
        ffbr ffbrVar = this.c;
        if (ffbrVar == null) {
            ffkj.c("backgroundScope");
            ffbrVar = null;
        }
        Object b = ffbrVar.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new dawf(this, it, null));
        q("LoadLinkPreviews", c);
    }
}
