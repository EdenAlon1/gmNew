package com.google.android.apps.messaging.shared.net.tachyonreceiver;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.chru;
import defpackage.ciap;
import defpackage.cilc;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.fcej;
import defpackage.fcek;
import defpackage.fgtg;
import defpackage.poh;
import defpackage.pon;
import defpackage.pot;
import defpackage.ppa;
import defpackage.ppn;
import defpackage.ppp;
import defpackage.ppr;
import defpackage.ppv;
import defpackage.ppw;
import defpackage.pqr;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class PullMessagesWorker extends ppr {
    private static final cskc e = cskc.g("BugleNetwork", "PullMessagesWorker");
    private static final cfup f = cfvl.f(cfvl.b, "initialDelaySeconds", 10);
    private final Context g;

    /* compiled from: PG */
    public interface a {
        elbx b();

        Optional fc();
    }

    public PullMessagesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    public static void c(Context context, fcek fcekVar) {
        csjb a2 = e.a();
        a2.I("Scheduling pull retry");
        a2.A("app", fcekVar.d);
        a2.r();
        poh pohVar = new poh();
        pohVar.c(2);
        ppv ppvVar = new ppv(PullMessagesWorker.class);
        ppvVar.d("pull_messages_worker");
        ppvVar.g(pohVar.a());
        pon ponVar = new pon();
        ponVar.e("pull_messages_app", fcekVar.d);
        ponVar.e("pull_messages_id", fcekVar.c);
        ppvVar.j(ponVar.a());
        ppvVar.h(((Long) f.e()).longValue(), TimeUnit.SECONDS);
        ppw ppwVar = (ppw) ppvVar.b();
        pqr.a(context).g("pull_messages_" + fcekVar.d + fcekVar.c, ppa.REPLACE, ppwVar);
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        elfl e2;
        a aVar = (a) ekhw.a(this.g, a.class);
        if (aVar.fc().isEmpty()) {
            e.m("Skip pull messages due to absent PullMessagesWorkerHelper");
            return elfo.e(new ppp());
        }
        pot f2 = f();
        String d = f2.d("pull_messages_app");
        String d2 = f2.d("pull_messages_id");
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(d2)) {
            e.m("Skip pull messages due to empty parameter");
            return elfo.e(new ppn());
        }
        ekzm b = aVar.b().b("PullMessagesWorker.startWork");
        try {
            Object obj = aVar.fc().get();
            csjb c = cilc.a.c();
            c.I("PullMessagesWorkerHelper started");
            c.A("app", d);
            c.r();
            if (TextUtils.equals(d, "RCS")) {
                if (chru.a()) {
                    cilc.a.p("Handling phone number PullMessages retry");
                    fcej fcejVar = (fcej) fcek.a.createBuilder();
                    fgtg fgtgVar = fgtg.PHONE_NUMBER;
                    fcejVar.copyOnWrite();
                    ((fcek) fcejVar.instance).b = fgtgVar.a();
                    fcejVar.copyOnWrite();
                    ((fcek) fcejVar.instance).d = "RCS";
                    fcejVar.copyOnWrite();
                    fcek fcekVar = (fcek) fcejVar.instance;
                    d2.getClass();
                    fcekVar.c = d2;
                    e2 = ((cilc) obj).b.c((fcek) fcejVar.build());
                } else {
                    cilc.a.m("Skip pull work. Phone registration is not enabled.");
                    e2 = elfo.e(new ppp());
                }
            } else if (((cilc) obj).c.containsKey(d)) {
                ciap ciapVar = (ciap) ((cilc) obj).c.get(d);
                if (ciapVar == null) {
                    cilc.a.m(defpackage.a.a(d, "Skip pull work. ", " GAIA bind manager is not enabled."));
                    e2 = elfo.e(new ppp());
                } else {
                    cilc.a.p(defpackage.a.a(d, "Handling ", " PullMessages retry"));
                    fcej fcejVar2 = (fcej) fcek.a.createBuilder();
                    fgtg fgtgVar2 = fgtg.EMAIL;
                    fcejVar2.copyOnWrite();
                    ((fcek) fcejVar2.instance).b = fgtgVar2.a();
                    fcejVar2.copyOnWrite();
                    fcek fcekVar2 = (fcek) fcejVar2.instance;
                    d.getClass();
                    fcekVar2.d = d;
                    fcejVar2.copyOnWrite();
                    fcek fcekVar3 = (fcek) fcejVar2.instance;
                    d2.getClass();
                    fcekVar3.c = d2;
                    e2 = ciapVar.c((fcek) fcejVar2.build());
                }
            } else {
                csjb c2 = cilc.a.c();
                c2.I("Skip pull work. Unrecognized app name");
                c2.A("app", d);
                c2.r();
                e2 = elfo.e(new ppp());
            }
            b.close();
            return e2;
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
