package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccdu implements cbyl {
    public final cqoh b;
    public final AtomicReference c;
    public final axkm d;
    public final cdgx e;
    private final ccdo g;
    private final ffbr h;
    private final errl i;
    private static final cskc f = cskc.g("BugleCms", "CmsBackupWorker");
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupWorker");

    public ccdu(ccdo ccdoVar, cqoh cqohVar, ffbr ffbrVar, errl errlVar, AtomicReference atomicReference, axkm axkmVar, cdgx cdgxVar) {
        this.g = ccdoVar;
        this.b = cqohVar;
        this.h = ffbrVar;
        this.i = errlVar;
        this.c = atomicReference;
        this.d = axkmVar;
        this.e = cdgxVar;
    }

    @Override // defpackage.cbyl
    public final elfl a(final btih btihVar) {
        elfl b;
        emxf.a(d(btihVar));
        if (btihVar.s() == null) {
            csjb c = f.c();
            c.I("Null work item id");
            c.y("workType", btihVar.o());
            c.y("itemType", btihVar.m());
            c.y("flags", btihVar.l());
            c.r();
            return elfo.e(true);
        }
        if (!((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue()) {
            return c(btihVar);
        }
        if (this.c.get() == null) {
            ensk h = a.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupWorker", "process", 102, "CmsBackupWorker.java")).q("Fi MD FES cache not set. Setting the cache");
            b = this.d.r().i(new eroh() { // from class: ccds
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ccdu ccduVar = ccdu.this;
                    axeu axeuVar = (axeu) obj;
                    ccduVar.c.set(axeuVar);
                    axkl axklVar = ccduVar.d.n;
                    boolean f2 = axkl.f(axeuVar);
                    btih btihVar2 = btihVar;
                    if (!f2) {
                        ccduVar.e.c(btihVar2.k());
                        return ccduVar.b(btihVar2);
                    }
                    ensk h2 = ccdu.a.h();
                    h2.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupWorker", "process", 111, "CmsBackupWorker.java")).q("Fi MD is enabled, enqueue incremental work immediately.");
                    return ccduVar.c(btihVar2);
                }
            }, erpp.a);
        } else {
            axkl axklVar = this.d.n;
            if (axkl.f((axeu) this.c.get())) {
                ensk h2 = a.h();
                h2.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupWorker", "process", 130, "CmsBackupWorker.java")).q("Fi MD is enabled, enqueue incremental work immediately.");
                b = c(btihVar);
            } else {
                ensk h3 = a.h();
                h3.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupWorker", "process", 133, "CmsBackupWorker.java")).q("Fi MD is disabled, delay incremental work.");
                b = b(btihVar);
            }
        }
        return b.e(Exception.class, new emwl() { // from class: ccdt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j = ccdu.a.j();
                j.Y(ente.a, "BugleCms");
                enrr enrrVar = (enrr) ((enrr) ((enrr) j).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupWorker", "process", 139, "CmsBackupWorker.java");
                btih btihVar2 = btih.this;
                enrrVar.J("Failed to save incremental work, table_type = %d, operation = %d, bugle_id = %s", Integer.valueOf(btihVar2.m()), Integer.valueOf(btihVar2.m()), btihVar2.s());
                return false;
            }
        }, erpp.a);
    }

    public final elfl b(final btih btihVar) {
        return elfl.g(this.i.submit(eldl.m(new Callable() { // from class: ccdr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = bqon.a;
                bqna bqnaVar = new bqna();
                btih btihVar2 = btihVar;
                bqnaVar.i(btihVar2.m());
                bqnaVar.h(btihVar2.l());
                String s = btihVar2.s();
                s.getClass();
                bqnaVar.e(s);
                bqnaVar.f(ccdu.this.b.f().toEpochMilli());
                bqnaVar.c();
                return true;
            }
        })));
    }

    public final elfl c(btih btihVar) {
        int o = btihVar.o();
        cccd cccdVar = (cccd) ccce.a.createBuilder();
        int k = btihVar.k();
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccceVar.b |= 1;
        ccceVar.c = k;
        int m = btihVar.m();
        cccdVar.copyOnWrite();
        ccce ccceVar2 = (ccce) cccdVar.instance;
        ccceVar2.b |= 2;
        ccceVar2.d = m;
        String s = btihVar.s();
        s.getClass();
        cccdVar.copyOnWrite();
        ccce ccceVar3 = (ccce) cccdVar.instance;
        ccceVar3.b |= 4;
        ccceVar3.e = s;
        int l = btihVar.l();
        cccdVar.copyOnWrite();
        ccce ccceVar4 = (ccce) cccdVar.instance;
        ccceVar4.b |= 8;
        ccceVar4.f = l;
        cccdVar.copyOnWrite();
        ccce ccceVar5 = (ccce) cccdVar.instance;
        ccceVar5.b |= 16;
        ccceVar5.g = o == 64;
        if (btihVar.q() > 0) {
            ((akzt) this.h.b()).g("Bugle.Cms.IncrementalBackup.SchedulingDelay", this.b.f().toEpochMilli() - btihVar.q());
        }
        eyja d = eykm.d(this.b.f().toEpochMilli());
        cccdVar.copyOnWrite();
        ccce ccceVar6 = (ccce) cccdVar.instance;
        d.getClass();
        ccceVar6.i = d;
        ccceVar6.b |= 64;
        if (!emxe.c(btihVar.t())) {
            String t = btihVar.t();
            cccdVar.copyOnWrite();
            ccce ccceVar7 = (ccce) cccdVar.instance;
            t.getClass();
            ccceVar7.b |= 128;
            ccceVar7.j = t;
        }
        this.g.c((ccce) cccdVar.build());
        return elfo.e(true);
    }

    @Override // defpackage.cbyl
    public final boolean d(btih btihVar) {
        return btihVar.o() == 32 || btihVar.o() == 64;
    }
}
