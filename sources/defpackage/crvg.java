package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crvg implements crue {
    public static final cskc a = cskc.g("BugleCms", "CmsBackupManagerImpl");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsBackupManagerImpl");
    public final ccrm A;
    public final cbwj B;
    private final errl C;
    private final Context D;
    public dtve c;
    public final ffbr d;
    public final babm e;
    public final dtuu f;
    public final ffbr g;
    public final ffbr h;
    public final asif i;
    public final akzt j;
    public final axkm k;
    public final ffbr l;
    public final errl m;
    public final axdf n;
    public final cdce o;
    public final cqoh p;
    public final cdcc q;
    public final cdyb r;
    public final cdrc s;
    public final babf t;
    public final axmm u;
    public final ffbr v;
    public final ffbr w;
    public final ejvp x;
    public final asiv y;
    public final ashx z;

    /* compiled from: PG */
    public interface a {
        cebf ct();

        crvt eV();

        cshm fg();
    }

    public crvg(ffbr ffbrVar, ccrm ccrmVar, babm babmVar, dtuu dtuuVar, cbwj cbwjVar, ffbr ffbrVar2, ffbr ffbrVar3, asif asifVar, akzt akztVar, axkm axkmVar, ffbr ffbrVar4, errl errlVar, errl errlVar2, Context context, axdf axdfVar, cdce cdceVar, cdcc cdccVar, cdyb cdybVar, cdrc cdrcVar, babf babfVar, axmm axmmVar, cqoh cqohVar, ffbr ffbrVar5, ffbr ffbrVar6, ejvp ejvpVar, asiv asivVar, ashx ashxVar) {
        this.d = ffbrVar;
        this.A = ccrmVar;
        this.e = babmVar;
        this.f = dtuuVar;
        this.B = cbwjVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = asifVar;
        this.j = akztVar;
        this.k = axkmVar;
        this.l = ffbrVar4;
        this.m = errlVar;
        this.C = errlVar2;
        this.D = context;
        this.n = axdfVar;
        this.o = cdceVar;
        this.q = cdccVar;
        this.r = cdybVar;
        this.s = cdrcVar;
        this.t = babfVar;
        this.u = axmmVar;
        this.p = cqohVar;
        this.v = ffbrVar5;
        this.w = ffbrVar6;
        this.x = ejvpVar;
        this.y = asivVar;
        this.z = ashxVar;
    }

    private final elfl j(final eisx eisxVar, int i, final int i2, final boolean z) {
        csjb c = a.c();
        c.I("Disabling Multi Device feature");
        c.y("reason", i);
        c.r();
        final elfl b2 = this.B.b("CmsBackupManagerImpl#disableCmsBackupForMultiDeviceInternal", new Runnable() { // from class: crus
            @Override // java.lang.Runnable
            public final void run() {
                final crvg crvgVar = crvg.this;
                crvgVar.k.aa(false);
                crvgVar.k.Z(false);
                if (csgj.a() && ((Boolean) ((cfup) csfu.l.get()).e()).booleanValue()) {
                    crvgVar.u.f(false);
                } else {
                    crvgVar.u.e();
                }
                final int i3 = i2;
                final eisx eisxVar2 = eisxVar;
                final boolean z2 = z;
                crvgVar.k.G();
                crvgVar.k.R();
                ((crzf) crvgVar.v.b()).g();
                crvgVar.i();
                ((crzf) crvgVar.v.b()).d();
                crvgVar.f.d("CmsBackupManagerImpl#initiateOptOutFlow", new Runnable() { // from class: cruk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ceal b3;
                        axeu b4;
                        crvg crvgVar2 = crvg.this;
                        try {
                            b4 = crvgVar2.k.b();
                        } catch (eygu e) {
                            csjb e2 = crvg.a.e();
                            e2.I("Reading current feature status failed due to unrecoverable error, will proceed to log out user regardless of current state");
                            e2.s(e);
                        }
                        if (b4.equals(axeu.DISABLING)) {
                            return;
                        }
                        if (b4.equals(axeu.DISABLED)) {
                            return;
                        }
                        int i4 = i3;
                        eisx eisxVar3 = eisxVar2;
                        crvgVar2.k.af(axeu.DISABLING);
                        int a2 = eisxVar3.a();
                        int i5 = i4 - 1;
                        if (i5 == 0) {
                            boolean z3 = z2;
                            engr engrVar = new engr();
                            engrVar.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.TACHYON_UNREGISTER, ceaj.SET_SERVER_STATUS_OFF, ceaj.CLEAR_INITIAL_SYNC_STATUS);
                            if (csgj.a() && !z3) {
                                engrVar.h(ceaj.CLEAR_FEATURE_TYPES);
                            }
                            if (z3) {
                                engrVar.h(ceaj.RESET_BOX);
                            }
                            if (!((Boolean) ((cfup) csfu.d.get()).e()).booleanValue() || !csgj.a() || !z3) {
                                engrVar.h(ceaj.CLEAR_PRIMARY_DEVICE_ID);
                            }
                            engrVar.h(ceaj.COMPLETE_OPT_OUT_MD);
                            b3 = ceam.b(a2, engrVar.g());
                        } else if (i5 != 1) {
                            int i6 = engw.d;
                            engr engrVar2 = new engr();
                            engrVar2.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.COMPLETE_OPT_OUT_MD);
                            b3 = ceam.b(a2, engrVar2.g());
                        } else {
                            int i7 = engw.d;
                            engr engrVar3 = new engr();
                            engrVar3.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.TACHYON_UNREGISTER, ceaj.COMPLETE_OPT_OUT_MD);
                            b3 = ceam.b(a2, engrVar3.g());
                        }
                        ceal g = crvgVar2.g(b3);
                        cead ceadVar = (cead) crvgVar2.l.b();
                        cetp cetpVar = new cetp();
                        cetpVar.b = ceam.d(g);
                        ceadVar.a(g, cetpVar.a());
                        crvgVar2.n.x(2);
                    }
                });
                crvgVar.k.F();
                if (crvgVar.y.a()) {
                    crvgVar.k.Q();
                }
                crvgVar.k.H();
                crvgVar.k.ai(false);
                crvgVar.k.J();
                cbwj cbwjVar = crvgVar.B;
                cbwjVar.a.g(new dtut() { // from class: crui
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        return eleg.f("CRMI::notifyDataChanged4::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: cruj
                    @Override // java.lang.Runnable
                    public final void run() {
                        crvg crvgVar2 = crvg.this;
                        crvgVar2.k.N();
                        if (csgj.a() && ((Boolean) ((cfup) csfu.l.get()).e()).booleanValue()) {
                            crvgVar2.x.a(elfo.e(null), csfv.a);
                            ensk h = crvg.b.h();
                            h.Y(ente.a, "BugleCms");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBackupManagerImpl", "disableCmsBackupForMultiDeviceInternal", 652, "CmsBackupManagerImpl.java")).q("CmsBackupManagerImpl#disableCmsBackupForMultiDeviceInternal: Notify Bnr Settings Ui called.");
                        }
                    }
                });
            }
        });
        if (((Boolean) ((cfup) csfu.m.get()).e()).booleanValue()) {
            b2 = ((crzf) this.v.b()).a().i(new eroh() { // from class: crut
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return elfl.this;
                }
            }, this.C);
        }
        elfr.l(b2, new crvf(this, i), this.m);
        return b2;
    }

    @Override // defpackage.crue
    public final elfl a(final eisx eisxVar, final csfz csfzVar) {
        csjb c = a.c();
        c.I("Start initial backup for sooner path");
        c.r();
        return this.e.b(eisxVar.a()).i(new eroh() { // from class: crup
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final crvg crvgVar = crvg.this;
                final eisx eisxVar2 = eisxVar;
                final csfz csfzVar2 = csfzVar;
                return crvgVar.B.b("CmsBackupManagerImpl#enableInitialBackup", new Runnable() { // from class: cruw
                    /* JADX WARN: Type inference failed for: r0v47, types: [comc, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v57, types: [comc, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r10v1, types: [comc, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        bvvn e = ParticipantsTable.e();
                        e.z("initializeBatchBackupSchedulingMetaData-participants");
                        long k = e.b().k(ParticipantsTable.c.a);
                        bsob e2 = bsom.e();
                        e2.z("initializeBatchBackupSchedulingMetaData-conversations");
                        long k2 = e2.b().k(bsom.c.a);
                        buxo d = MessagesTable.d();
                        d.z("initializeBatchBackupSchedulingMetaData-messages");
                        long k3 = d.b().k(MessagesTable.c.a);
                        final crvg crvgVar2 = crvg.this;
                        long epochSecond = crvgVar2.p.f().getEpochSecond();
                        axen axenVar = (axen) axeo.a.createBuilder();
                        axenVar.copyOnWrite();
                        axeo axeoVar = (axeo) axenVar.instance;
                        axeoVar.b |= 1;
                        axeoVar.c = k;
                        axenVar.copyOnWrite();
                        axeo axeoVar2 = (axeo) axenVar.instance;
                        axeoVar2.b |= 2;
                        axeoVar2.d = k2;
                        axenVar.copyOnWrite();
                        axeo axeoVar3 = (axeo) axenVar.instance;
                        axeoVar3.b |= 4;
                        axeoVar3.e = k3;
                        axenVar.copyOnWrite();
                        axeo axeoVar4 = (axeo) axenVar.instance;
                        axeoVar4.b |= 8;
                        axeoVar4.f = epochSecond;
                        final axeo axeoVar5 = (axeo) axenVar.build();
                        efbd.b();
                        axkm axkmVar = crvgVar2.k;
                        axkmVar.e.get().m(new emwl() { // from class: axjg
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cskc cskcVar = axkm.a;
                                axep builder = ((axez) obj2).toBuilder();
                                builder.copyOnWrite();
                                axez axezVar = (axez) builder.instance;
                                axeo axeoVar6 = axeo.this;
                                axeoVar6.getClass();
                                axezVar.t = axeoVar6;
                                axezVar.b |= 65536;
                                return builder.build();
                            }
                        });
                        axkmVar.N();
                        if (csgj.a() && ((Boolean) ((cfup) csgj.o.get()).e()).booleanValue()) {
                            try {
                                axkm axkmVar2 = crvgVar2.k;
                                efbd.b();
                                if (((axez) axkmVar2.e.get().l()).B) {
                                    buxo d2 = MessagesTable.d();
                                    d2.z("setBackupSyncStatusMetadata1");
                                    long k4 = d2.b().k(MessagesTable.c.i);
                                    final buxz buxzVar = new buxz();
                                    buxzVar.x(k3);
                                    buxzVar.U(k4);
                                    buxzVar.h();
                                    buxzVar.l(csgg.EXCLUDED);
                                    if (!crvgVar2.z.a()) {
                                        buxzVar.M(2);
                                    }
                                    buxo d3 = MessagesTable.d();
                                    d3.z("setBackupSyncStatusMetadata2");
                                    d3.h(new Function() { // from class: cruy
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return buxz.this;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = d3.b().i();
                                    if (crvgVar2.i.a()) {
                                        final bvvw bvvwVar = new bvvw();
                                        bvvwVar.n(k);
                                        bvvw bvvwVar2 = new bvvw();
                                        bvvwVar2.w(-1);
                                        bvvw bvvwVar3 = new bvvw();
                                        bvvwVar3.w(-2);
                                        bvvwVar.ar(bvvwVar2, bvvwVar3);
                                        bvvwVar.g();
                                        bvvwVar.i(csgg.EXCLUDED);
                                        bvvn e3 = ParticipantsTable.e();
                                        e3.z("CmsBackupManagerImpl#getTotalParticipantsToBackup");
                                        e3.h(new Function() { // from class: crum
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return bvvw.this;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        final int i2 = e3.b().i();
                                        final bsol bsolVar = new bsol();
                                        bsolVar.u(k2);
                                        bsolVar.g();
                                        bsolVar.i(csgg.EXCLUDED);
                                        bsob e4 = bsom.e();
                                        e4.z("CmsBackupManagerImpl#getTotalConversationsToBackup");
                                        e4.i(new Function() { // from class: crul
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return bsol.this;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        final int i3 = e4.b().i();
                                        final axkm axkmVar3 = crvgVar2.k;
                                        final long j = i;
                                        efbd.b();
                                        axkmVar3.e.get().m(new emwl() { // from class: axik
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                final axep builder = ((axez) obj2).toBuilder();
                                                final axkm axkmVar4 = axkm.this;
                                                dtuu dtuuVar = (dtuu) axkmVar4.h.b();
                                                final long j2 = j;
                                                final int i4 = i2;
                                                final int i5 = i3;
                                                dtuuVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataTotalCountsToBackupSync", new Runnable() { // from class: axij
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        axep axepVar = builder;
                                                        axky axkyVar = ((axez) axepVar.instance).C;
                                                        if (axkyVar == null) {
                                                            axkyVar = axky.a;
                                                        }
                                                        int i6 = i5;
                                                        int i7 = i4;
                                                        long j3 = j2;
                                                        axkm.this.an(axkyVar.f, 0L, axkyVar.e + j3, "The total messages to backup will be smaller than the backed up message count");
                                                        axkx axkxVar = (axkx) axkyVar.toBuilder();
                                                        int i8 = axkyVar.m + i7;
                                                        axkxVar.copyOnWrite();
                                                        axky axkyVar2 = (axky) axkxVar.instance;
                                                        axkyVar2.b |= 4096;
                                                        axkyVar2.m = i8;
                                                        int i9 = axkyVar.i + i6;
                                                        axkxVar.copyOnWrite();
                                                        axky axkyVar3 = (axky) axkxVar.instance;
                                                        axkyVar3.b |= 256;
                                                        axkyVar3.i = i9;
                                                        long j4 = axkyVar.e + j3;
                                                        axkxVar.copyOnWrite();
                                                        axky axkyVar4 = (axky) axkxVar.instance;
                                                        axkyVar4.b |= 16;
                                                        axkyVar4.e = j4;
                                                        axepVar.copyOnWrite();
                                                        axez axezVar = (axez) axepVar.instance;
                                                        axky axkyVar5 = (axky) axkxVar.build();
                                                        axkyVar5.getClass();
                                                        axezVar.C = axkyVar5;
                                                        axezVar.b |= 1073741824;
                                                    }
                                                });
                                                return builder.build();
                                            }
                                        });
                                    } else {
                                        crvgVar2.k.ac(i);
                                    }
                                }
                            } catch (eygu e5) {
                                csjb e6 = crvg.a.e();
                                e6.I("Can't set backup total message count due to InvalidProtocolBufferException");
                                e6.s(e5);
                            }
                        }
                        if (((Boolean) crvgVar2.h.b()).booleanValue()) {
                            ((alrv) crvgVar2.g.b()).e(alrv.Q);
                        }
                        if (csgj.a() && ((Boolean) ((cfup) csfu.l.get()).e()).booleanValue()) {
                            crvgVar2.u.c(false);
                        } else {
                            crvgVar2.u.c(true);
                        }
                        eisx eisxVar3 = eisxVar2;
                        cdyb cdybVar = crvgVar2.r;
                        cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
                        int a2 = eisxVar3.a();
                        cdvwVar.copyOnWrite();
                        cdvx cdvxVar = (cdvx) cdvwVar.instance;
                        cdvxVar.b |= 1;
                        cdvxVar.c = a2;
                        cdvx cdvxVar2 = (cdvx) cdvwVar.build();
                        cetp cetpVar = new cetp();
                        cetpVar.b = eisxVar3.toString();
                        cdybVar.a(cdvxVar2, cetpVar.a());
                        if (((Boolean) ((cfup) csgj.x.get()).e()).booleanValue()) {
                            cdrc cdrcVar = crvgVar2.s;
                            cdvw cdvwVar2 = (cdvw) cdvx.a.createBuilder();
                            int a3 = eisxVar3.a();
                            cdvwVar2.copyOnWrite();
                            cdvx cdvxVar3 = (cdvx) cdvwVar2.instance;
                            cdvxVar3.b |= 1;
                            cdvxVar3.c = a3;
                            cdvx cdvxVar4 = (cdvx) cdvwVar2.build();
                            cetp cetpVar2 = new cetp();
                            cetpVar2.b = eisxVar3.toString();
                            ((cevh) cdrcVar.a.b()).a(ceyr.h("refresh_cms_server_storage_info", cdvxVar4, cetpVar2.a()));
                        }
                        csfz csfzVar3 = csfzVar2;
                        if (!csgj.a() || csfzVar3 == csfz.MULTI_DEVICE || csfzVar3 == csfz.UNDEFINED) {
                            crvgVar2.k.af(axeu.ENABLED);
                        }
                        if (csgj.a() && ((Boolean) ((cfup) csfu.l.get()).e()).booleanValue()) {
                            crvgVar2.k.T(axeu.ENABLED, false);
                        } else {
                            crvgVar2.k.S(axeu.ENABLED);
                        }
                        if (csgj.a() && csfzVar3 == csfz.BACKUP_AND_RESTORE) {
                            crvgVar2.b();
                        }
                        if (csgj.a()) {
                            crvgVar2.B.a.g(new dtut() { // from class: crun
                                @Override // defpackage.dtut
                                public final ekzz a() {
                                    return eleg.f("CRMI::notifyDataChanged6::runAfterCommit");
                                }
                            }, "CmsBackupManagerImpl#enableInitialBackup", new Runnable() { // from class: cruo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    crvg crvgVar3 = crvg.this;
                                    crvgVar3.k.N();
                                    if (csgj.a() && ((Boolean) ((cfup) csfu.l.get()).e()).booleanValue()) {
                                        crvgVar3.x.a(elfo.e(null), csfv.a);
                                        ensk h = crvg.b.h();
                                        h.Y(ente.a, "BugleCms");
                                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBackupManagerImpl", "enableInitialBackup", 338, "CmsBackupManagerImpl.java")).q("CmsBackupManagerImpl#enableInitialBackup: Notify Bnr Settings Ui called.");
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }, this.C).i(new eroh() { // from class: cruq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                int a2 = eisxVar.a();
                cdbj a3 = cdbj.d().a();
                int i = engw.d;
                engw engwVar = enou.a;
                Optional empty = Optional.empty();
                final crvg crvgVar = crvg.this;
                return crvgVar.o.a(a2, a3, engwVar, empty, false).h(new emwl() { // from class: cruf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        final engw engwVar2 = (engw) obj2;
                        final crvg crvgVar2 = crvg.this;
                        crvgVar2.f.d("CmsBackupManagerImpl#queueBatchWorkItems", new Runnable() { // from class: crve
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                engw engwVar3 = engwVar2;
                                int size = engwVar3.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    crvg crvgVar3 = crvg.this;
                                    cdaz cdazVar = (cdaz) engwVar3.get(i2);
                                    crvgVar3.q.a(cdazVar.a(), cdazVar.b());
                                }
                            }
                        });
                        return null;
                    }
                }, crvgVar.m);
            }
        }, this.m);
    }

    @Override // defpackage.crue
    public final void b() {
        efbd.b();
        a.p("Enabling incremental backup...");
        this.f.d("CmsBackupManagerImpl#enableIncrementalBackup", new Runnable() { // from class: crur
            @Override // java.lang.Runnable
            public final void run() {
                crvg crvgVar = crvg.this;
                ((crzf) crvgVar.v.b()).g();
                if (crvgVar.c == null) {
                    crvgVar.c = (dtve) crvgVar.d.b();
                }
                dtve dtveVar = crvgVar.c;
                try {
                    ccrm ccrmVar = crvgVar.A;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((Set) ccrmVar.a.b()).iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(((cctr) it.next()).a());
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        dtveVar.y((String) it2.next());
                    }
                    crvg.a.q("Created triggers");
                } catch (eygu e) {
                    throw new IllegalStateException("Could not build CMS Backup triggers", e);
                }
            }
        });
    }

    @Override // defpackage.crue
    public final elfl c(eisx eisxVar, int i) {
        csjb c = a.c();
        c.I("Disabling Backup & Restore feature");
        c.r();
        return h(eisxVar, i, false);
    }

    @Override // defpackage.crue
    public final elfl d(eisx eisxVar, int i, int i2) {
        return j(eisxVar, i, i2, false);
    }

    @Override // defpackage.crue
    public final elfl e(final eisx eisxVar) {
        return ((a) ekhv.a(this.D, a.class, eisxVar)).eV().b().h(new emwl() { // from class: crvc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                crvg crvgVar = crvg.this;
                crvgVar.t.c(eisxVar);
                crvgVar.k.S(axeu.ENABLING);
                return null;
            }
        }, this.m).i(new eroh() { // from class: crvd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                csjb c = crvg.a.c();
                c.I("Disabling and deleting Backup & Restore feature");
                c.r();
                return crvg.this.h(eisxVar, 1, true);
            }
        }, this.C);
    }

    @Override // defpackage.crue
    public final elfl f(eisx eisxVar) {
        return j(eisxVar, 4, 1, true);
    }

    public final ceal g(ceal cealVar) {
        ceaf ceafVar = (ceaf) cealVar.toBuilder();
        eyja d = eykm.d(this.p.f().toEpochMilli());
        ceafVar.copyOnWrite();
        ceal cealVar2 = (ceal) ceafVar.instance;
        d.getClass();
        cealVar2.i = d;
        cealVar2.c |= 16;
        return (ceal) ceafVar.build();
    }

    public final elfl h(final eisx eisxVar, final int i, final boolean z) {
        a aVar = (a) ekhv.a(this.D, a.class, eisxVar);
        final cshm fg = aVar.fg();
        final cebf ct = aVar.ct();
        final elfl b2 = this.B.b("CmsBackupManagerImpl#disableCmsBackupFeature", new Runnable() { // from class: cruu
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                ceal a2;
                final crvg crvgVar = crvg.this;
                ((crzf) crvgVar.v.b()).g();
                crvgVar.i();
                try {
                    int a3 = fg.a(5);
                    if (a3 == 3) {
                        z2 = false;
                    } else {
                        if (a3 != 4) {
                            throw new cshj(a.h(a3, "Unrecognized opt-out Bnr command: "));
                        }
                        z2 = true;
                    }
                    int i2 = i;
                    eisx eisxVar2 = eisxVar;
                    boolean z3 = z;
                    int a4 = eisxVar2.a();
                    int i3 = i2 - 1;
                    if (z2) {
                        if (i3 == 0) {
                            engr engrVar = new engr();
                            engrVar.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.TACHYON_UNREGISTER, ceaj.SET_SERVER_STATUS_OFF, ceaj.CLEAR_INITIAL_SYNC_STATUS);
                            if (csgj.a() && !z3) {
                                engrVar.h(ceaj.CLEAR_FEATURE_TYPES);
                            }
                            if (z3) {
                                engrVar.h(ceaj.RESET_BOX);
                            }
                            if (!((Boolean) ((cfup) csfu.d.get()).e()).booleanValue() || !csgj.a() || !z3) {
                                engrVar.h(ceaj.CLEAR_PRIMARY_DEVICE_ID);
                            }
                            engrVar.i(ceaj.COMPLETE_DOWNGRADE_MD_TO_BNR, ceaj.COMPLETE_OPT_OUT_BNR);
                            a2 = ceam.a(a4, engrVar.g(), ceah.BNR_AND_MD_OPT_OUT);
                        } else if (i3 != 1) {
                            int i4 = engw.d;
                            engr engrVar2 = new engr();
                            engrVar2.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.COMPLETE_DOWNGRADE_MD_TO_BNR, ceaj.COMPLETE_OPT_OUT_BNR);
                            a2 = ceam.a(a4, engrVar2.g(), ceah.BNR_AND_MD_OPT_OUT);
                        } else {
                            int i5 = engw.d;
                            engr engrVar3 = new engr();
                            engrVar3.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.TACHYON_UNREGISTER, ceaj.COMPLETE_DOWNGRADE_MD_TO_BNR, ceaj.COMPLETE_OPT_OUT_BNR);
                            a2 = ceam.a(a4, engrVar3.g(), ceah.BNR_AND_MD_OPT_OUT);
                        }
                    } else if (i3 == 0) {
                        engr engrVar4 = new engr();
                        engrVar4.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.TACHYON_UNREGISTER, ceaj.CLEAR_INITIAL_SYNC_STATUS);
                        if (csgj.a() && !z3) {
                            engrVar4.h(ceaj.CLEAR_FEATURE_TYPES);
                        }
                        if (z3) {
                            engrVar4.h(ceaj.RESET_BOX);
                        }
                        if (!((Boolean) ((cfup) csfu.d.get()).e()).booleanValue() || !csgj.a() || !z3) {
                            engrVar4.h(ceaj.CLEAR_PRIMARY_DEVICE_ID);
                        }
                        engrVar4.h(ceaj.COMPLETE_OPT_OUT_BNR);
                        a2 = ceam.a(a4, engrVar4.g(), ceah.BNR_OPT_OUT);
                    } else if (i3 != 1) {
                        int i6 = engw.d;
                        engr engrVar5 = new engr();
                        engrVar5.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.COMPLETE_OPT_OUT_BNR);
                        a2 = ceam.a(a4, engrVar5.g(), ceah.BNR_OPT_OUT);
                    } else {
                        int i7 = engw.d;
                        engr engrVar6 = new engr();
                        engrVar6.i(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, ceaj.TACHYON_UNREGISTER, ceaj.COMPLETE_OPT_OUT_BNR);
                        a2 = ceam.a(a4, engrVar6.g(), ceah.BNR_OPT_OUT);
                    }
                    ceal g = crvgVar.g(a2);
                    cead ceadVar = (cead) crvgVar.l.b();
                    cetp cetpVar = new cetp();
                    cetpVar.b = ceam.d(g);
                    ceadVar.a(g, cetpVar.a());
                    crvgVar.n.x(2);
                    crvgVar.B.a.g(new dtut() { // from class: cruz
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            return eleg.f("CRMI::notifyDataChanged3::runAfterCommit");
                        }
                    }, "CmsBackupManagerImpl#disableCmsBackupFeature", new Runnable() { // from class: crva
                        @Override // java.lang.Runnable
                        public final void run() {
                            crvg crvgVar2 = crvg.this;
                            crvgVar2.k.N();
                            if (csgj.a() && ((Boolean) ((cfup) csfu.l.get()).e()).booleanValue()) {
                                crvgVar2.x.a(elfo.e(null), csfv.a);
                                ensk h = crvg.b.h();
                                h.Y(ente.a, "BugleCms");
                                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBackupManagerImpl", "disableCmsBackupFeatureInternal", 754, "CmsBackupManagerImpl.java")).q("CmsBackupManagerImpl#disableCmsBackupFeatureInternal: Notify Bnr Settings Ui called.");
                            }
                        }
                    });
                } catch (cshj e) {
                    throw new IllegalStateException(e);
                }
            }
        });
        if (((Boolean) ((cfup) csfu.m.get()).e()).booleanValue()) {
            b2 = ((crzf) this.v.b()).a().i(new eroh() { // from class: cruv
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return elfl.this;
                }
            }, this.C);
        }
        return b2.f(Exception.class, new eroh() { // from class: crux
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ceah ceahVar = ceah.BNR_AND_MD_OPT_OUT;
                crvg.a.p("Starting feature overlap error opt out for opt-out flow: ".concat(String.valueOf(String.valueOf(ceahVar))));
                final cebf cebfVar = ct;
                final crvg crvgVar = crvg.this;
                return crvgVar.e.a().i(new eroh() { // from class: crug
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final crvg crvgVar2 = crvg.this;
                        if (!booleanValue) {
                            crvg.a.p("No linked account, clearing local CMS states only.");
                            return ((cena) crvgVar2.w.b()).a();
                        }
                        cebf cebfVar2 = cebfVar;
                        ceah ceahVar2 = ceahVar;
                        ceaf ceafVar = (ceaf) ceal.b.createBuilder();
                        ceafVar.copyOnWrite();
                        ceal cealVar = (ceal) ceafVar.instance;
                        cealVar.h = ceahVar2.e;
                        cealVar.c |= 8;
                        return cebfVar2.a(0, (ceal) ceafVar.build()).i(new eroh() { // from class: crvb
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return ((cena) crvg.this.w.b()).a();
                            }
                        }, crvgVar2.m);
                    }
                }, crvgVar.m).h(new emwl() { // from class: cruh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, erpp.a);
            }
        }, this.m);
    }

    public final void i() {
        ((crzf) this.v.b()).f();
    }
}
