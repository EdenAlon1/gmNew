package com.google.android.apps.messaging.contacts.corp;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akzt;
import defpackage.bvpo;
import defpackage.cbfs;
import defpackage.cfvl;
import defpackage.cpdg;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.csqw;
import defpackage.ekhw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emyl;
import defpackage.errl;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.ppr;
import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CorpContactsRefreshWorker extends ppr {
    public static final emyl e = cfvl.w("block_ditto_content_observer_if_large_updates");
    public static final cskc f = cskc.g("Bugle", "CorpContactsRefreshWorker");
    public static final Duration g = Duration.ofHours(24);
    public final csqw h;
    public final ffbr i;
    public final cqoh j;
    public final cbfs k;
    public final fazb l;
    public final ffbr m;
    public final ffbr n;
    public long o;
    private final akzt p;
    private final errl q;
    private final elbx r;

    /* compiled from: PG */
    public interface a {
        ffbr A();

        ffbr B();

        elbx b();

        akzt s();

        cbfs t();

        cpdg u();

        cqoh v();

        csqw w();

        errl x();

        fazb y();

        ffbr z();
    }

    public CorpContactsRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.h = aVar.w();
        aVar.u();
        this.i = aVar.z();
        this.p = aVar.s();
        this.j = aVar.v();
        this.k = aVar.t();
        this.q = aVar.x();
        this.r = aVar.b();
        this.l = aVar.y();
        this.m = aVar.A();
        this.n = aVar.B();
        csjb a2 = f.a();
        a2.I("Created CorpContactsRefreshWorker.");
        a2.r();
    }

    public static String c(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        ekzm b = this.r.b("CorpContactsRefreshWorker#startWork");
        try {
            elfl g2 = elfo.g(new Callable() { // from class: tuj
                /* JADX WARN: Removed duplicated region for block: B:106:0x0098 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:108:0x003e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00ae A[Catch: all -> 0x0293, TryCatch #1 {all -> 0x0293, blocks: (B:3:0x0039, B:4:0x003e, B:6:0x0044, B:9:0x0052, B:11:0x005a, B:14:0x0062, B:16:0x0085, B:104:0x0092, B:73:0x01d5, B:19:0x009a, B:21:0x00ae, B:22:0x011a, B:23:0x013d, B:25:0x0143, B:27:0x0149, B:46:0x01b0, B:53:0x01c0, B:59:0x01bd, B:66:0x01c4, B:70:0x01cf, B:78:0x00b3, B:90:0x0101, B:81:0x0113, B:82:0x0116, B:101:0x0110, B:100:0x010d, B:109:0x008c, B:117:0x01dc, B:119:0x01e2, B:121:0x0209, B:122:0x0221, B:124:0x0227, B:126:0x0235, B:132:0x0252, B:151:0x026b, B:150:0x0268, B:152:0x026c, B:128:0x023b, B:131:0x024f, B:142:0x0260, B:141:0x025d, B:130:0x0244, B:137:0x0258, B:84:0x00cb, B:86:0x00d1, B:88:0x00d7, B:89:0x00f9, B:146:0x0263, B:96:0x0108), top: B:2:0x0039, inners: #0, #3, #5, #8, #10 }] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0143 A[Catch: all -> 0x0293, TRY_LEAVE, TryCatch #1 {all -> 0x0293, blocks: (B:3:0x0039, B:4:0x003e, B:6:0x0044, B:9:0x0052, B:11:0x005a, B:14:0x0062, B:16:0x0085, B:104:0x0092, B:73:0x01d5, B:19:0x009a, B:21:0x00ae, B:22:0x011a, B:23:0x013d, B:25:0x0143, B:27:0x0149, B:46:0x01b0, B:53:0x01c0, B:59:0x01bd, B:66:0x01c4, B:70:0x01cf, B:78:0x00b3, B:90:0x0101, B:81:0x0113, B:82:0x0116, B:101:0x0110, B:100:0x010d, B:109:0x008c, B:117:0x01dc, B:119:0x01e2, B:121:0x0209, B:122:0x0221, B:124:0x0227, B:126:0x0235, B:132:0x0252, B:151:0x026b, B:150:0x0268, B:152:0x026c, B:128:0x023b, B:131:0x024f, B:142:0x0260, B:141:0x025d, B:130:0x0244, B:137:0x0258, B:84:0x00cb, B:86:0x00d1, B:88:0x00d7, B:89:0x00f9, B:146:0x0263, B:96:0x0108), top: B:2:0x0039, inners: #0, #3, #5, #8, #10 }] */
                /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[Catch: all -> 0x0293, TRY_LEAVE, TryCatch #1 {all -> 0x0293, blocks: (B:3:0x0039, B:4:0x003e, B:6:0x0044, B:9:0x0052, B:11:0x005a, B:14:0x0062, B:16:0x0085, B:104:0x0092, B:73:0x01d5, B:19:0x009a, B:21:0x00ae, B:22:0x011a, B:23:0x013d, B:25:0x0143, B:27:0x0149, B:46:0x01b0, B:53:0x01c0, B:59:0x01bd, B:66:0x01c4, B:70:0x01cf, B:78:0x00b3, B:90:0x0101, B:81:0x0113, B:82:0x0116, B:101:0x0110, B:100:0x010d, B:109:0x008c, B:117:0x01dc, B:119:0x01e2, B:121:0x0209, B:122:0x0221, B:124:0x0227, B:126:0x0235, B:132:0x0252, B:151:0x026b, B:150:0x0268, B:152:0x026c, B:128:0x023b, B:131:0x024f, B:142:0x0260, B:141:0x025d, B:130:0x0244, B:137:0x0258, B:84:0x00cb, B:86:0x00d1, B:88:0x00d7, B:89:0x00f9, B:146:0x0263, B:96:0x0108), top: B:2:0x0039, inners: #0, #3, #5, #8, #10 }] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 670
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.tuj.call():java.lang.Object");
                }
            }, this.q);
            b.close();
            return g2;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ppr
    public final void d() {
        csjb a2 = f.a();
        a2.I("Execution of CorpContactsRefreshWorker was stopped.");
        a2.r();
        k("Bugle.CorpContactsRefreshWorker.Stopped.Latency");
    }

    public final void k(String str) {
        this.p.g(str, this.j.a() - this.o);
    }

    public final boolean l(bvpo bvpoVar) {
        if (bvpoVar.r == null || bvpoVar.q != -2) {
            return false;
        }
        bvpoVar.u(null);
        bvpoVar.D(null);
        bvpoVar.N(null);
        bvpoVar.p(-1L);
        this.k.b(bvpoVar.a());
        return true;
    }
}
