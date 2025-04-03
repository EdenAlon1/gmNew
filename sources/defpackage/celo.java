package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class celo implements cctm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter");
    public final crty b;
    public final axdf c;
    public final axkm d;
    public final ffbr e;
    public final ffbr f;
    public final asif g;
    public final asiv h;
    public final axmm i;
    public final cqoh j;
    public final asjh k;
    public final bdfm l;
    public final azei m;
    public final cefc n;
    private final ccml o;
    private final errl p;
    private final errl q;
    private final asik r;
    private final aszz s;
    private final cbwj t;

    public celo(crty crtyVar, ccml ccmlVar, axdf axdfVar, axkm axkmVar, cqoh cqohVar, cbwj cbwjVar, axmm axmmVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, asif asifVar, asiv asivVar, asik asikVar, asjh asjhVar, bdfm bdfmVar, azei azeiVar, aszz aszzVar, cefc cefcVar) {
        this.b = crtyVar;
        this.o = ccmlVar;
        this.c = axdfVar;
        this.d = axkmVar;
        this.j = cqohVar;
        this.t = cbwjVar;
        this.i = axmmVar;
        this.p = errlVar;
        this.q = errlVar2;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = asifVar;
        this.h = asivVar;
        this.r = asikVar;
        this.k = asjhVar;
        this.l = bdfmVar;
        this.m = azeiVar;
        this.s = aszzVar;
        this.n = cefcVar;
    }

    @Override // defpackage.cctm
    public final axew a() {
        return axew.MESSAGES;
    }

    @Override // defpackage.cctm
    public final bqkx b() {
        return bqkx.MESSAGE_OBJECT;
    }

    @Override // defpackage.cctm
    public final ccdx c() {
        return this.o;
    }

    @Override // defpackage.cctm
    public final elfl d(String str) {
        return i(str, this.s.a());
    }

    @Override // defpackage.cctm
    public final elfl e(final pot potVar) {
        elfl h = this.t.b("CmsRestoreMessagesWorkerAdapter#onAllItemsRestored", new Runnable() { // from class: celj
            @Override // java.lang.Runnable
            public final void run() {
                celo celoVar = celo.this;
                if (!celoVar.k.a()) {
                    celoVar.i.h();
                }
                ensk h2 = celo.a.h();
                h2.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "onAllItemsRestored", 238, "CmsRestoreMessagesWorkerAdapter.java")).q("Scheduling Conversation Metadata Full Sync in the background");
                bdfm bdfmVar = celoVar.l;
                eyex eyexVar = eyex.a;
                cetp cetpVar = new cetp();
                cetpVar.b = "cms";
                ((cevh) bdfmVar.a.b()).a(ceyr.h("conversation_metadata_full_sync", eyexVar, cetpVar.a()));
            }
        }).h(new emwl() { // from class: celk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                celo.this.m.d(new Consumer() { // from class: cela
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ((ceeu) obj2).r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.p);
        return this.k.a() ? h : h.i(new eroh() { // from class: cell
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return celo.this.j(potVar);
            }
        }, erpp.a);
    }

    @Override // defpackage.cctm
    public final epfx f() {
        return epfx.RESTORE_MESSAGE;
    }

    @Override // defpackage.cctm
    public final /* synthetic */ String g(Object obj) {
        return ((eszz) obj).c;
    }

    @Override // defpackage.cctm
    public final String h() {
        return "Messages";
    }

    public final elfl i(final String str, final boolean z) {
        if (this.s.a()) {
            elfl b = this.n.b(str, eszz.class);
            if (b == null) {
                b = null;
            } else if (z) {
                b = this.n.a(b, new ffji() { // from class: celd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return celo.this.i((String) obj, false);
                    }
                }, eszz.class);
            }
            if (b != null) {
                return b;
            }
        }
        if (this.r.a()) {
            return this.d.m().i(new eroh() { // from class: celb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    eyja eyjaVar = (eyja) obj;
                    boolean equals = eyjaVar.equals(eykm.c);
                    final celo celoVar = celo.this;
                    String str2 = str;
                    boolean z2 = z;
                    if (equals) {
                        ensk h = celo.a.h();
                        h.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "listCmsItems", 183, "CmsRestoreMessagesWorkerAdapter.java")).q("CmsRestoreMessagesWorkerAdapter: Cms Delta sync timestamp is not present.");
                        elfl J = celoVar.b.J(str2);
                        return !z2 ? J : celoVar.n.a(J, new ffji() { // from class: celi
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                return celo.this.i((String) obj2, false);
                            }
                        }, eszz.class);
                    }
                    ensk h2 = celo.a.h();
                    h2.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "listCmsItems", 169, "CmsRestoreMessagesWorkerAdapter.java")).t("CmsRestoreMessagesWorkerAdapter: Passing delta sync timestamp %s in ListMessageObjects.", eykm.i(eyjaVar));
                    elfl K = celoVar.b.K(str2, eyjaVar);
                    return !z2 ? K : celoVar.n.a(K, new ffji() { // from class: celh
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            return celo.this.i((String) obj2, false);
                        }
                    }, eszz.class);
                }
            }, this.p);
        }
        elfl J = this.b.J(str);
        return z ? this.n.a(J, new ffji() { // from class: celc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return celo.this.i((String) obj, false);
            }
        }, eszz.class) : J;
    }

    public final elfl j(final pot potVar) {
        return elfo.g(new Callable() { // from class: cele
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(teq.b());
            }
        }, this.q).h(new emwl() { // from class: celf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                bqkn a2 = bqkv.a();
                a2.z("onAllItemsRestored");
                a2.c(new Function() { // from class: cekz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqku bqkuVar = (bqku) obj2;
                        bqkuVar.b(bqkw.INITIAL_RESTORE_MAX_RETRIED, bqkw.INITIAL_RESTORE_NON_RETRIABLE);
                        return bqkuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = a2.b().i();
                celo celoVar = celo.this;
                if (!celoVar.g.a()) {
                    return celn.j(num.intValue(), i);
                }
                try {
                    axez c = celoVar.d.c();
                    cekx cekxVar = new cekx();
                    cekxVar.j(num.intValue());
                    cekxVar.i(i);
                    axky axkyVar = c.C;
                    if (axkyVar == null) {
                        axkyVar = axky.a;
                    }
                    cekxVar.h(axkyVar.k);
                    axky axkyVar2 = c.C;
                    if (axkyVar2 == null) {
                        axkyVar2 = axky.a;
                    }
                    cekxVar.g(axkyVar2.l);
                    axky axkyVar3 = c.C;
                    if (axkyVar3 == null) {
                        axkyVar3 = axky.a;
                    }
                    cekxVar.d(axkyVar3.g);
                    axky axkyVar4 = c.C;
                    if (axkyVar4 == null) {
                        axkyVar4 = axky.a;
                    }
                    cekxVar.c(axkyVar4.h);
                    axky axkyVar5 = c.C;
                    if (axkyVar5 == null) {
                        axkyVar5 = axky.a;
                    }
                    cekxVar.f(axkyVar5.c);
                    axky axkyVar6 = c.C;
                    if (axkyVar6 == null) {
                        axkyVar6 = axky.a;
                    }
                    cekxVar.e(axkyVar6.d);
                    if (celoVar.h.a()) {
                        axkv axkvVar = c.G;
                        if (axkvVar == null) {
                            axkvVar = axkv.a;
                        }
                        epel epelVar = (epel) epem.a.createBuilder();
                        long j = axkvVar.e;
                        epelVar.copyOnWrite();
                        epem epemVar = (epem) epelVar.instance;
                        epemVar.b |= 4;
                        epemVar.e = j;
                        long j2 = axkvVar.d;
                        epelVar.copyOnWrite();
                        epem epemVar2 = (epem) epelVar.instance;
                        epemVar2.b |= 2;
                        epemVar2.d = j2;
                        long j3 = axkvVar.c;
                        epelVar.copyOnWrite();
                        epem epemVar3 = (epem) epelVar.instance;
                        epemVar3.b |= 1;
                        epemVar3.c = j3;
                        long j4 = axkvVar.g;
                        epelVar.copyOnWrite();
                        epem epemVar4 = (epem) epelVar.instance;
                        epemVar4.b |= 8;
                        epemVar4.f = j4;
                        cekxVar.b((epem) epelVar.build());
                    } else {
                        cekxVar.b(epem.a);
                    }
                    return cekxVar.a();
                } catch (eygu e) {
                    ensk j5 = celo.a.j();
                    j5.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) ((enrr) j5).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "createClearcutLoggingInfoFromSettingsData", (char) 364, "CmsRestoreMessagesWorkerAdapter.java")).q("CmsRestoreMessagesWorkerAdapter: Skipping getting initial sync counts in clearcut events");
                    return celn.j(num.intValue(), i);
                }
            }
        }, this.q).h(new emwl() { // from class: celg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i;
                celn celnVar = (celn) obj;
                int f = celnVar.f();
                int e = celnVar.e();
                celo celoVar = celo.this;
                long epochMilli = celoVar.j.f().toEpochMilli();
                long b = epochMilli - potVar.b("restore_start_time_millis", epochMilli);
                Duration ofMillis = b > 0 ? Duration.ofMillis(b) : Duration.ZERO;
                axdf axdfVar = celoVar.c;
                int d = celnVar.d();
                int c = celnVar.c();
                int b2 = celnVar.b();
                int a2 = celnVar.a();
                long h = celnVar.h();
                long g = celnVar.g();
                int intValue = ((Number) Map.EL.getOrDefault(axdw.c(new ffji() { // from class: axdh
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        buxzVar.getClass();
                        buxzVar.k(csgg.RESTORED_FROM_CMS, csgg.MERGED_FROM_CMS);
                        return buxzVar;
                    }
                }), axdv.a, 0)).intValue();
                int b3 = axdw.b(bqkx.MESSAGE_OBJECT);
                int intValue2 = ((Number) Map.EL.getOrDefault(axdw.a(new ffji() { // from class: axdm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        bsol bsolVar = (bsol) obj2;
                        bsolVar.getClass();
                        bsolVar.h(csgg.RESTORED_FROM_CMS, csgg.MERGED_FROM_CMS);
                        return bsolVar;
                    }
                }), axdv.a, 0)).intValue();
                int b4 = axdw.b(bqkx.CONVERSATION);
                int intValue3 = ((Number) Map.EL.getOrDefault(axdw.d(new ffji() { // from class: axdq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        bvvw bvvwVar = (bvvw) obj2;
                        bvvwVar.getClass();
                        bvvwVar.h(csgg.RESTORED_FROM_CMS, csgg.MERGED_FROM_CMS);
                        return bvvwVar;
                    }
                }), axdv.a, 0)).intValue();
                int b5 = axdw.b(bqkx.PARTICIPANT);
                if (ersy.a("bugle.records_merged_message_count_in_initial_sync_database_profile", "bugle")) {
                    buxo d2 = MessagesTable.d();
                    d2.z("createMetadataForRestore");
                    d2.r();
                    d2.h(new Function() { // from class: axdl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar = (buxz) obj2;
                            buxzVar.i(csgg.MERGED_FROM_CMS);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    i = d2.b().i();
                } else {
                    i = -1;
                }
                axdx axdxVar = new axdx(intValue, b3, intValue2, b4, intValue3, b5, d, c, 0, 0, b2, a2, 0, 0, h, g, i, 0L, 0L);
                epem i2 = celnVar.i();
                epfx c2 = axdfVar.c(epfx.RESTORE);
                epep epepVar = (epep) epeq.a.createBuilder();
                epfx c3 = axdfVar.c(c2);
                epepVar.copyOnWrite();
                epeq epeqVar = (epeq) epepVar.instance;
                epeqVar.c = c3.s;
                epeqVar.b |= 1;
                long millis = ofMillis.toMillis();
                epepVar.copyOnWrite();
                epeq epeqVar2 = (epeq) epepVar.instance;
                epeqVar2.b |= 8;
                epeqVar2.f = millis;
                epepVar.copyOnWrite();
                epeq epeqVar3 = (epeq) epepVar.instance;
                epeqVar3.d = 2;
                epeqVar3.b = 2 | epeqVar3.b;
                epeg epegVar = epeg.NO_FAILURE;
                epepVar.copyOnWrite();
                epeq epeqVar4 = (epeq) epepVar.instance;
                epeqVar4.e = epegVar.bs;
                epeqVar4.b |= 4;
                epepVar.copyOnWrite();
                epeq epeqVar5 = (epeq) epepVar.instance;
                epeqVar5.b |= 64;
                epeqVar5.i = f;
                epepVar.copyOnWrite();
                epeq epeqVar6 = (epeq) epepVar.instance;
                epeqVar6.b |= 128;
                epeqVar6.j = e;
                if (axdfVar.j.a() && !i2.equals(epem.a)) {
                    epepVar.copyOnWrite();
                    epeq epeqVar7 = (epeq) epepVar.instance;
                    epeqVar7.n = i2;
                    epeqVar7.b |= 1024;
                }
                if (c2.equals(epfx.OPTIMIZED_RESTORE)) {
                    efbd.b();
                    epea epeaVar = (epea) epeb.a.createBuilder();
                    try {
                        axez c4 = axdfVar.d.c();
                        if (axdfVar.k.a()) {
                            eyja eyjaVar = c4.I;
                            if (eyjaVar == null) {
                                eyjaVar = eyja.a;
                            }
                            if (!Objects.equals(eyjaVar, eykm.c)) {
                                eyja eyjaVar2 = c4.I;
                                if (eyjaVar2 == null) {
                                    eyjaVar2 = eyja.a;
                                }
                                long j = eyjaVar2.b * 1000;
                                epeaVar.copyOnWrite();
                                epeb epebVar = (epeb) epeaVar.instance;
                                epebVar.b |= 1;
                                epebVar.c = j;
                            }
                        }
                    } catch (eygu e2) {
                        ensk j2 = axdf.a.j();
                        j2.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/cloudstore/clearcutlogging/CmsClearcutLogger", "getDeltaSyncTimestamps", (char) 1394, "CmsClearcutLogger.java")).q("Failed to CmsSettingsData for delta sync. Do not log DeltaSyncTimestamps.");
                    }
                    epeb epebVar2 = (epeb) epeaVar.build();
                    epepVar.copyOnWrite();
                    epeq epeqVar8 = (epeq) epepVar.instance;
                    epebVar2.getClass();
                    epeqVar8.p = epebVar2;
                    epeqVar8.b |= 4096;
                }
                epepVar.a(axdfVar.b());
                epdx epdxVar = (epdx) epgf.a.createBuilder();
                epeq epeqVar9 = (epeq) epepVar.build();
                epdxVar.copyOnWrite();
                epgf epgfVar = (epgf) epdxVar.instance;
                epeqVar9.getClass();
                epgfVar.c = epeqVar9;
                epgfVar.b |= 1;
                axdfVar.k((epgf) epdxVar.build(), axdxVar, true);
                if (((Boolean) celoVar.f.b()).booleanValue()) {
                    ((alrv) celoVar.e.b()).f(alrv.P);
                }
                ensk h2 = celo.a.h();
                h2.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/messages/CmsRestoreMessagesWorkerAdapter", "logRestoreSuccessEvent", 316, "CmsRestoreMessagesWorkerAdapter.java")).J("CmsRestoreMessagesWorkerAdapter: Restore complete, unknownSenderCount: %d, restoreSkippedItemCount: %d, restoreDuration: %s", Integer.valueOf(f), Integer.valueOf(e), ofMillis);
                return null;
            }
        }, erpp.a);
    }
}
