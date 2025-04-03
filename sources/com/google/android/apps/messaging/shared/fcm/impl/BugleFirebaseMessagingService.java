package com.google.android.apps.messaging.shared.fcm.impl;

import android.text.TextUtils;
import defpackage.akxl;
import defpackage.akzt;
import defpackage.axnw;
import defpackage.cfvv;
import defpackage.cfwz;
import defpackage.cpes;
import defpackage.cpeu;
import defpackage.cpev;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.djrv;
import defpackage.eaio;
import defpackage.ealq;
import defpackage.ecda;
import defpackage.ecqk;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.enhk;
import defpackage.eolt;
import defpackage.eolu;
import defpackage.eolv;
import defpackage.euxg;
import defpackage.faug;
import defpackage.fauh;
import defpackage.faui;
import defpackage.fauj;
import defpackage.ffbr;
import defpackage.fgth;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class BugleFirebaseMessagingService extends cfwz {
    private static final cskc h = cskc.g("BugleNetwork", "BugleFirebaseMessagingService");
    public Map a;
    public akzt b;
    public elbx c;
    public ffbr d;
    public ffbr e;
    public ffbr f;

    public BugleFirebaseMessagingService() {
        ecqk.a.d(ecda.b(getClass()));
    }

    private final void h(String str, int i, String str2) {
        ekzz f = eleg.f("BugleFirebaseMessagingService::logTickle");
        try {
            fauh fauhVar = (fauh) faui.a.createBuilder();
            fauhVar.copyOnWrite();
            ((faui) fauhVar.instance).b = i;
            if (str != null) {
                fauhVar.copyOnWrite();
                ((faui) fauhVar.instance).c = str;
            }
            faug faugVar = (faug) fauj.a.createBuilder();
            faugVar.copyOnWrite();
            ((fauj) faugVar.instance).f = fgth.a(96);
            faugVar.copyOnWrite();
            ((fauj) faugVar.instance).d = 1;
            faugVar.copyOnWrite();
            ((fauj) faugVar.instance).e = 28;
            faugVar.copyOnWrite();
            fauj faujVar = (fauj) faugVar.instance;
            faui fauiVar = (faui) fauhVar.build();
            fauiVar.getClass();
            faujVar.g = fauiVar;
            faujVar.b |= 1;
            if (str2 != null) {
                faugVar.copyOnWrite();
                ((fauj) faugVar.instance).c = str2;
            }
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.BUGLE_TACHYON_TRANSPORT_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            fauj faujVar2 = (fauj) faugVar.build();
            faujVar2.getClass();
            eolvVar2.U = faujVar2;
            eolvVar2.c |= 262144;
            ((akxl) this.d.b()).j(eoluVar);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void a(euxg euxgVar) {
        ekzm b = this.c.b("BugleFirebaseMessagingService.onMessageReceived");
        try {
            String str = "";
            String str2 = (euxgVar.c() == null || !euxgVar.c().containsKey("event")) ? "" : (String) euxgVar.c().get("event");
            if (euxgVar.c() != null && euxgVar.c().containsKey("tickle")) {
                str = (String) euxgVar.c().get("tickle");
            }
            if (ealq.a(eaio.b(euxgVar), euxgVar.d(), eaio.a(euxgVar))) {
                str2 = "gnp_chime_message";
            }
            cpev cpevVar = (cpev) this.f.b();
            if (((Boolean) cpev.l.e()).booleanValue() && !((ConcurrentHashMap) cpevVar.u.get(cpeu.TACHYGRAM_MESSAGE_ARRIVED.ordinal())).containsKey(str)) {
                cpevVar.b(cpeu.TICKLE_ARRIVED, str, new cpes(cpevVar));
            }
            axnw.h(((djrv) this.e.b()).h());
            ffbr ffbrVar = (ffbr) this.a.get(str2);
            csjb a = ffbrVar != null ? h.a() : h.e();
            a.I("Received firebase message");
            a.A("with event", str2);
            a.A("with data", euxgVar.c());
            a.A("handler", ffbrVar);
            a.r();
            if (ffbrVar != null) {
                h(str2, ((cfvv) ffbrVar.b()).a(euxgVar), str);
                ((cfvv) ffbrVar.b()).b(euxgVar);
            } else {
                h(str2, 0, str);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void b(String str) {
        ekzm b = this.c.b("BugleFirebaseMessagingService.onNewToken");
        try {
            this.b.c("Bugle.Ditto.NewFcmToken.Counts");
            if (TextUtils.isEmpty(str)) {
                h.r("Received empty new token.");
            } else {
                for (ffbr ffbrVar : ((enhk) this.a).values()) {
                    csjb a = ffbrVar != null ? h.a() : h.b();
                    a.I("Received new token");
                    a.A("handler", ffbrVar);
                    a.r();
                    if (ffbrVar != null) {
                        ((cfvv) ffbrVar.b()).c();
                    }
                }
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
