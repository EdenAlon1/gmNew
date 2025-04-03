package com.google.android.apps.messaging.shared.net.tachyonrefresh;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.chbx;
import defpackage.chru;
import defpackage.cimk;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppp;
import defpackage.ppr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class TachyonRefreshWorker extends ppr {
    public static final cskc e = cskc.g("BugleNetwork", "TachyonRefreshWorker");
    public static final cfup f = cfvl.f(cfvl.b, "refresh_initial_delay_seconds", 10);
    private final Context g;

    /* compiled from: PG */
    public interface a {
        elbx b();

        Optional fd();
    }

    public TachyonRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        elfl e2;
        a aVar = (a) ekhw.a(this.g, a.class);
        if (aVar.fd().isEmpty()) {
            e.m("Skip refresh due to absent TachyonRefreshWorkerHelper");
            return elfo.e(new ppp());
        }
        pot f2 = f();
        String d = f2.d("tachyon_refresh_app");
        String d2 = f2.d("tachyon_refresh_id");
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(d2)) {
            e.m("Skip refresh due to empty parameter");
            return elfo.e(new ppn());
        }
        ekzm b = aVar.b().b("TachyonRefreshWorker.startWork");
        try {
            Object obj = aVar.fd().get();
            int e3 = e();
            csjb c = cimk.a.c();
            c.I("TachyonRefreshWorkerHelper started");
            c.A("app", d);
            c.y("runAttemptCount", e3);
            c.r();
            if (e3 > ((Integer) cimk.b.e()).intValue()) {
                cimk.a.p("Failed due to exceeeding max run attempt count");
                e2 = elfo.e(new ppn());
            } else if (TextUtils.equals(d, "RCS")) {
                if (chru.a()) {
                    cimk.a.p("Handling phone number TachyonRefresh retry");
                    e2 = ((chbx) ((cimk) obj).c.b()).c(d2).i(new eroh() { // from class: cimh
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return ((chbu) obj2).w();
                        }
                    }, ((cimk) obj).d).h(new emwl() { // from class: cimi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            cskc cskcVar = cimk.a;
                            return new ppp();
                        }
                    }, erpp.a).e(Throwable.class, new emwl() { // from class: cimj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            cskc cskcVar = cimk.a;
                            if (chfh.d(th)) {
                                cimk.a.s("TachyonRefreshWorker failed with a retriable error", th);
                                return new ppo();
                            }
                            cimk.a.s("TachyonRefreshWorker failed with a non-retriable error", th);
                            return new ppn();
                        }
                    }, ((cimk) obj).d);
                } else {
                    cimk.a.m("Skip refresh work. Phone registration is not enabled.");
                    e2 = elfo.e(new ppp());
                }
            } else {
                csjb c2 = cimk.a.c();
                c2.I("Skip refresh work. Unrecognized app name");
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
