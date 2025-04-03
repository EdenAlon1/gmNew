package com.google.android.apps.messaging.shared.datamodel.worker.cloudstore;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.CmsInitialBackupSchedulerWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axdf;
import defpackage.axmm;
import defpackage.baan;
import defpackage.babm;
import defpackage.ccdg;
import defpackage.ccjw;
import defpackage.cqoh;
import defpackage.crtz;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.eisx;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.emwl;
import defpackage.emxf;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.poa;
import defpackage.poh;
import defpackage.poj;
import defpackage.pot;
import defpackage.ppa;
import defpackage.ppr;
import defpackage.ppv;
import defpackage.ppw;
import defpackage.pqr;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CmsInitialBackupSchedulerWorker extends ppr {
    public static final cskc e = cskc.g("BugleCms", "CmsInitialBackupSchedulerWorker");
    public static final Duration f = Duration.ofSeconds(5);
    public final Context g;
    public final ccdg h;
    public final axdf i;
    public final ffbr j;
    public final axmm k;
    public final cqoh l;
    private final babm m;
    private final errl n;
    private final elbx o;

    /* compiled from: PG */
    public interface a {
        ccjw bv();

        crtz eU();
    }

    /* compiled from: PG */
    public interface b {
        Context Q();

        axdf aG();

        babm aJ();

        elbx b();

        ccdg bQ();

        ffbr gC();

        axmm h();

        errl p();

        cqoh v();
    }

    public CmsInitialBackupSchedulerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        b bVar = (b) ekhw.a(context, b.class);
        this.g = bVar.Q();
        this.m = bVar.aJ();
        this.n = bVar.p();
        this.o = bVar.b();
        this.h = bVar.bQ();
        this.i = bVar.aG();
        this.j = bVar.gC();
        this.k = bVar.h();
        this.l = bVar.v();
    }

    public static int c(pot potVar, String str) {
        int a2 = potVar.a(str, -2);
        emxf.b(a2 != -2, "Missing int input data.");
        return a2;
    }

    public static long k(pot potVar, String str) {
        long b2 = potVar.b(str, -2L);
        emxf.b(b2 != -2, "Missing long input data.");
        return b2;
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        csjb a2 = e.a();
        a2.I("startWork");
        a2.r();
        elbx elbxVar = this.o;
        final pot f2 = f();
        ekzm b2 = elbxVar.b("CmsInitialBackupSchedulerWorker.startWork");
        try {
            elfl f3 = this.m.b(f2.a("account_id", -1)).i(new eroh() { // from class: ccjy
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:101:0x059a  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0454  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x02ff  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0255  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x030a  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x03b8  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x045c  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0500  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x059f  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x05fc  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0621  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x05a2  */
                @Override // defpackage.eroh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r48) {
                    /*
                        Method dump skipped, instructions count: 1757
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ccjy.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.n).e(baan.class, new emwl() { // from class: ccjz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    CmsInitialBackupSchedulerWorker.e.s("Account not linked", (baan) obj);
                    return new ppn();
                }
            }, erpp.a).f(Throwable.class, new eroh() { // from class: ccka
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    cskc cskcVar = CmsInitialBackupSchedulerWorker.e;
                    return elfo.e(new ppo());
                }
            }, erpp.a);
            b2.close();
            return f3;
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ppr
    public final void d() {
        csjb a2 = e.a();
        a2.I("Stopped.");
        a2.r();
    }

    public final void l(eisx eisxVar, pot potVar) {
        poh pohVar = new poh();
        pohVar.c(4);
        poj a2 = pohVar.a();
        ppv ppvVar = new ppv(CmsInitialBackupSchedulerWorker.class);
        ppvVar.d("CmsPwqInitWorkRequest");
        ppvVar.d(String.valueOf(eisxVar.a()));
        ppvVar.f(poa.LINEAR, 1L, TimeUnit.SECONDS);
        ppvVar.g(a2);
        ppvVar.j(potVar);
        ppvVar.h(f.getSeconds(), TimeUnit.SECONDS);
        pqr.a(this.g).g("CmsInitialWork", ppa.REPLACE, (ppw) ppvVar.b());
    }
}
