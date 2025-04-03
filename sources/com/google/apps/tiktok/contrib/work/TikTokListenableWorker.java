package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.ecgi;
import defpackage.ecgk;
import defpackage.ejok;
import defpackage.ejqn;
import defpackage.ekzz;
import defpackage.elae;
import defpackage.elav;
import defpackage.elbx;
import defpackage.eldl;
import defpackage.eleg;
import defpackage.emxf;
import defpackage.enrr;
import defpackage.enru;
import defpackage.erpp;
import defpackage.erqt;
import defpackage.ffbr;
import defpackage.ppr;
import j$.util.Map;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TikTokListenableWorker extends ppr {
    private final elbx g;
    private final Map h;
    private final ffbr i;
    private final WorkerParameters j;
    private final elae k;
    private ejok l;
    private boolean m;
    private static final enru f = enru.c("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    public static final ecgi e = new ecgk("UNKNOWN");

    public TikTokListenableWorker(Context context, elbx elbxVar, Map<String, ecgi> map, ffbr<ejok> ffbrVar, WorkerParameters workerParameters, elae elaeVar) {
        super(context, workerParameters);
        this.l = null;
        this.m = false;
        this.h = map;
        this.i = ffbrVar;
        this.g = elbxVar;
        this.j = workerParameters;
        this.k = elaeVar;
    }

    public static /* synthetic */ void c(ListenableFuture listenableFuture, ecgi ecgiVar) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException unused) {
            ((enrr) ((enrr) f.j()).h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 182, "TikTokListenableWorker.java")).t("TikTokListenableWorker was cancelled while running client worker: %s", ecgiVar);
        } catch (ExecutionException e2) {
            ((enrr) ((enrr) ((enrr) f.i()).g(e2.getCause())).h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 177, "TikTokListenableWorker.java")).t("TikTokListenableWorker encountered an exception while running client worker: %s", ecgiVar);
        }
    }

    @Override // defpackage.ppr
    public final ListenableFuture a() {
        String c = ejqn.c(this.j);
        elav f2 = this.g.f("WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            ekzz g = eleg.g(a.v(c, " getForegroundInfoAsync()"), this.k);
            try {
                emxf.m(this.l == null, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                ejok ejokVar = (ejok) this.i.b();
                this.l = ejokVar;
                ListenableFuture a = ejokVar.a(this.j);
                g.b(a);
                g.close();
                f2.close();
                return a;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        String c = ejqn.c(this.j);
        elav f2 = this.g.f("WorkManager:TikTokListenableWorker startWork");
        try {
            ekzz g = eleg.g(a.v(c, " startWork()"), this.k);
            try {
                String c2 = ejqn.c(this.j);
                ekzz f3 = eleg.f(String.valueOf(c2).concat(" startWork()"));
                try {
                    emxf.m(!this.m, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.m = true;
                    if (this.l == null) {
                        this.l = (ejok) this.i.b();
                    }
                    final ListenableFuture b = this.l.b(this.j);
                    final ecgi ecgiVar = (ecgi) Map.EL.getOrDefault(this.h, c2, e);
                    b.b(eldl.l(new Runnable() { // from class: ejoa
                        @Override // java.lang.Runnable
                        public final void run() {
                            TikTokListenableWorker.c(ListenableFuture.this, ecgiVar);
                        }
                    }), erpp.a);
                    f3.b(b);
                    f3.close();
                    g.b(b);
                    g.close();
                    f2.close();
                    return b;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
