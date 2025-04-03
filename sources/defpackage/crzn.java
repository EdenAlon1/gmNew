package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crzn implements crzf {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsLocalStateCleanupProxyImpl");
    private final asiv A;
    private final ffsk B;
    private final axcn C;
    private final cdrh D;
    private final cdri E;
    private final cdrk F;
    private final cdrq G;
    private final cdrm H;
    private final cdro I;
    private final akzt J;
    private final aszz K;
    private final cefc L;
    private final cdhd M;
    private final cdgw N;
    private final cdyp O;
    private final cdyj P;
    private final ceol Q;
    private final ccrm R;
    private final dtve b;
    private final cccl c;
    private final cefm d;
    private final cegb e;
    private final cejp f;
    private final cefu g;
    private final cegh h;
    private final cdxt i;
    private final cdiv j;
    private final cdcc k;
    private final cdyb l;
    private final cedy m;
    private final cdeq n;
    private final cbzo o;
    private final ceib p;
    private final cegs q;
    private final cehz r;
    private final ashs s;
    private final babf t;
    private final axkm u;
    private final cead v;
    private final cdyu w;
    private final dtuu x;
    private final cdkg y;
    private final axeb z;

    public crzn(dtve dtveVar, ccrm ccrmVar, cccl ccclVar, cefm cefmVar, cegb cegbVar, cejp cejpVar, cefu cefuVar, cegh ceghVar, cdxt cdxtVar, cdiv cdivVar, cdcc cdccVar, cdyb cdybVar, cedy cedyVar, cdeq cdeqVar, cbzo cbzoVar, ceib ceibVar, cegs cegsVar, cehz cehzVar, crud crudVar, csct csctVar, ashs ashsVar, babf babfVar, axkm axkmVar, cead ceadVar, cdyu cdyuVar, dtuu dtuuVar, cdkg cdkgVar, axeb axebVar, asiv asivVar, ffsk ffskVar, axcn axcnVar, cdrh cdrhVar, cdri cdriVar, cdrk cdrkVar, cdrq cdrqVar, cdrm cdrmVar, cdro cdroVar, akzt akztVar, aszz aszzVar, cefc cefcVar, cdhd cdhdVar, cdgw cdgwVar, cdyp cdypVar, cdyj cdyjVar, ceol ceolVar) {
        dtveVar.getClass();
        ccclVar.getClass();
        ceibVar.getClass();
        cehzVar.getClass();
        crudVar.getClass();
        csctVar.getClass();
        ashsVar.getClass();
        babfVar.getClass();
        axkmVar.getClass();
        ceadVar.getClass();
        dtuuVar.getClass();
        cdkgVar.getClass();
        ffskVar.getClass();
        axcnVar.getClass();
        cdrhVar.getClass();
        cdriVar.getClass();
        cdrkVar.getClass();
        cdrqVar.getClass();
        cdrmVar.getClass();
        cdroVar.getClass();
        akztVar.getClass();
        cefcVar.getClass();
        cdhdVar.getClass();
        cdgwVar.getClass();
        cdypVar.getClass();
        cdyjVar.getClass();
        this.b = dtveVar;
        this.R = ccrmVar;
        this.c = ccclVar;
        this.d = cefmVar;
        this.e = cegbVar;
        this.f = cejpVar;
        this.g = cefuVar;
        this.h = ceghVar;
        this.i = cdxtVar;
        this.j = cdivVar;
        this.k = cdccVar;
        this.l = cdybVar;
        this.m = cedyVar;
        this.n = cdeqVar;
        this.o = cbzoVar;
        this.p = ceibVar;
        this.q = cegsVar;
        this.r = cehzVar;
        this.s = ashsVar;
        this.t = babfVar;
        this.u = axkmVar;
        this.v = ceadVar;
        this.w = cdyuVar;
        this.x = dtuuVar;
        this.y = cdkgVar;
        this.z = axebVar;
        this.A = asivVar;
        this.B = ffskVar;
        this.C = axcnVar;
        this.D = cdrhVar;
        this.E = cdriVar;
        this.F = cdrkVar;
        this.G = cdrqVar;
        this.H = cdrmVar;
        this.I = cdroVar;
        this.J = akztVar;
        this.K = aszzVar;
        this.L = cefcVar;
        this.M = cdhdVar;
        this.N = cdgwVar;
        this.O = cdypVar;
        this.P = cdyjVar;
        this.Q = ceolVar;
    }

    @Override // defpackage.crzf
    public final elfl a() {
        elfl c;
        c = axol.c(this.B, ffhe.a, ffsm.a, new crzm(this, null));
        return c;
    }

    @Override // defpackage.crzf
    public final Object b(ffgu ffguVar) {
        Object c = fgfz.c(this.w.a(0, ceal.b), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    @Override // defpackage.crzf
    public final Object c(ffgu ffguVar) {
        Object b = ctzl.b(this.z.a, new ffji() { // from class: axea
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((axed) obj).clear();
                return ffcu.a;
            }
        }, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    @Override // defpackage.crzf
    public final void d() {
        if (!this.x.i()) {
            throw new IllegalStateException("cancelCmsPersistentWorkQueuesForMultiDeviceOnly called outside of transaction");
        }
        ((cevh) this.i.a.b()).f("cms_set_feature_enabled_on_server");
    }

    @Override // defpackage.crzf
    public final void e() {
        if (!this.x.i()) {
            throw new IllegalStateException("clearStateUsedByOptOutFlow called outside of transaction");
        }
        this.t.b();
        this.u.P();
        if (this.A.a()) {
            this.u.Q();
        }
        ((cevh) this.v.a.b()).f("cms_multi_device_opt_out");
    }

    @Override // defpackage.crzf
    public final void f() {
        if (!this.x.i()) {
            throw new IllegalStateException("deleteCmsBackupReferences called outside of transaction");
        }
        if (!this.x.i()) {
            throw new IllegalStateException("deleteCmsTablesAndQueuedItems called outside of transaction");
        }
        String[] strArr = bqws.a;
        bqwh bqwhVar = new bqwh();
        bqwhVar.e();
        bqwhVar.f("deleteCmsTablesAndQueuedItems#cms");
        bqwhVar.d();
        String[] strArr2 = bqrp.a;
        bqri bqriVar = new bqri();
        bqriVar.e();
        bqriVar.f("deleteCmsTablesAndQueuedItems#cmsnotifications");
        bqriVar.d();
        String[] strArr3 = bqpw.a;
        bqpp bqppVar = new bqpp();
        bqppVar.e();
        bqppVar.f("deleteCmsTablesAndQueuedItems#cmsmedianotifications");
        bqppVar.d();
        String[] strArr4 = bqvb.a;
        bquu bquuVar = new bquu();
        bquuVar.e();
        bquuVar.f("deleteCmsTablesAndQueuedItems#cmsstatus");
        bquuVar.d();
        String[] strArr5 = bqii.a;
        bqib bqibVar = new bqib();
        bqibVar.e();
        bqibVar.f("deleteCmsTablesAndQueuedItems#cmsblobspendingdelete");
        bqibVar.d();
        String[] strArr6 = btki.a;
        btjx btjxVar = new btjx();
        btjxVar.f("deleteCmsGenericWorkQueues#genericworkerqueue1");
        btjxVar.a(new Function() { // from class: crzg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btkh btkhVar = (btkh) obj;
                btkhVar.getClass();
                btkhVar.j(32);
                return btkhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btjxVar.d();
        btjx btjxVar2 = new btjx();
        btjxVar2.f("deleteCmsGenericWorkQueues#genericworkerqueue2");
        btjxVar2.a(new Function() { // from class: crzh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btkh btkhVar = (btkh) obj;
                btkhVar.getClass();
                btkhVar.j(64);
                return btkhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btjxVar2.d();
        btjx btjxVar3 = new btjx();
        btjxVar3.f("deleteCmsGenericWorkQueues#genericworkerqueue3");
        btjxVar3.a(new Function() { // from class: crzi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btkh btkhVar = (btkh) obj;
                btkhVar.getClass();
                btkhVar.j(128);
                return btkhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btjxVar3.d();
        this.J.e("Bugle.Cms.OptOut.PendingBackupItemsCount", ((cevh) this.c.a.b()).c("cms_backup").size());
        ((cevh) this.O.a.b()).f("turn_on_bnr");
        ((cevh) this.P.a.b()).f("disable_multi_device_on_server_when_enable_bnr");
        ((cevh) this.d.a.b()).f("cms_restore_backup_key");
        ((cevh) this.e.a.b()).f("cms_restore_encryption_key");
        ((cevh) this.f.a.b()).f("cms_restore_participants");
        ((cevh) this.g.a.b()).f("cms_restore_conversations");
        ((cevh) this.h.a.b()).f("cms_restore_messages");
        ((cevh) this.j.a.b()).f("cms_key_sync");
        ((cevh) this.Q.a.b()).f("cms_restore_validation_work_handler");
        ((cevh) this.k.a.b()).f("cms_batch_backup");
        ((cevh) this.l.a.b()).f("cms_set_initial_sync_status_on_server");
        ((cevh) this.n.a.b()).f("cms_drop_unscheduled_item_to_dlq");
        ((cevh) this.o.a.b()).f("backup_self_participant");
        ((cevh) this.q.a.b()).f("cms_restore_page_background");
        ((cevh) this.r.a.b()).f("cms_restore_page_foreground");
        ((cevh) this.p.a.b()).f("cms_restore_page");
        ((cevh) this.m.a.b()).f("block_on_telephony_sync");
        this.y.c();
        this.J.e("Bugle.Cms.OptOut.PendingMediaUploadItemsCount", this.D.a().size() + this.E.a().size() + this.F.a().size() + this.G.a().size() + this.H.a().size() + this.I.a().size());
        this.M.a();
        this.N.a();
        String[] strArr7 = bqkv.a;
        bqkj bqkjVar = new bqkj();
        bqkjVar.e();
        bqkjVar.f("deleteCmsDeadLetterQueue");
        bqkjVar.d();
        this.C.a();
        if (this.K.a()) {
            this.L.d();
        }
        if (this.s.a() && csgj.a()) {
            efbd.b();
            String[] strArr8 = bqhg.a;
            bqgz bqgzVar = new bqgz();
            bqgzVar.e();
            bqgzVar.f("CmsBackupDependencyCacheDatabaseOperations#deleteAllRows");
            bqgzVar.d();
            efbd.b();
            String[] strArr9 = bqth.a;
            bqta bqtaVar = new bqta();
            bqtaVar.e();
            bqtaVar.f("CmsBackupDependencyCacheDatabaseOperations#deleteAllRows");
            bqtaVar.d();
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsLocalStateCleanupProxyImpl", "deleteCmsTablesAndQueuedItems", 258, "CmsLocalStateCleanupProxyImpl.kt")).q("Cleared local references to CMS data");
        if (!this.x.i()) {
            throw new IllegalStateException("deleteCmsColumns called outside of transaction");
        }
        bvvr f = ParticipantsTable.f();
        f.ap("deleteCmsColumns");
        f.ak();
        f.h();
        f.i(csgg.UNKNOWN);
        f.a.putNull("profile_photo_blob_id");
        f.a.putNull("profile_photo_encryption_key");
        f.V(new Function() { // from class: crzj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.getClass();
                bvvwVar.i(csgg.EXCLUDED);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.b().e();
        String[] strArr10 = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("deleteCmsColumns-conversations#update");
        bsoeVar.ak();
        bsoeVar.ak();
        bsoeVar.a.putNull("cms_id");
        bsoeVar.a.putNull("cms_correlation_id");
        bsoeVar.l(csgg.UNKNOWN);
        bsoeVar.ad(new Function() { // from class: crzk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.getClass();
                bsolVar.i(csgg.EXCLUDED);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsoeVar.b().e();
        String[] strArr11 = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("deleteCmsColumns-messages#update");
        buxrVar.ak();
        buxrVar.a.putNull("cms_id");
        buxrVar.m(csgg.UNKNOWN);
        buxrVar.a.putNull("cms_correlation_id");
        buxrVar.Y(new Function() { // from class: crzl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.getClass();
                buxzVar.l(csgg.EXCLUDED);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.b().e();
        String[] strArr12 = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("deleteCmsColumns-parts#update");
        bwdiVar.ak();
        bwdiVar.a.putNull("cms_compressed_blob_id");
        bwdiVar.a.putNull("cms_compressed_media_encryption_key");
        bwdiVar.a.putNull("cms_full_size_blob_id");
        bwdiVar.a.putNull("cms_media_encryption_key");
        bwdiVar.b().e();
    }

    @Override // defpackage.crzf
    public final void g() {
        if (!this.x.i()) {
            throw new IllegalStateException("dropCMSBackupTriggers called outside of transaction");
        }
        ccrm ccrmVar = this.R;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Set) ccrmVar.a.b()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((cctr) it.next()).b());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.b.y((String) it2.next());
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsLocalStateCleanupProxyImpl", "dropCmsBackupTriggers", 155, "CmsLocalStateCleanupProxyImpl.kt")).q("Removed triggers");
    }
}
