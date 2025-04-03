package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddf implements cdce {
    public static final entd e = entd.c("BugleCmsBatchBackup");
    static final cfup f = cfvl.e(cfvl.b, "cms_batch_back_up_retry_limit_per_scheduling_request", 4);
    public final axkm g;
    public final errl h;
    public final errl i;
    public final cfyt j;
    public final cdbo k;
    public final cdbo l;
    public final cdbo m;
    public final cdba n;
    public final dtuu o;
    public final ccbt p;
    public final ccun q;
    public final ccun r;
    public final ccun s;
    public final cdih t;
    public final asjt u;
    public final cqoh v;
    public final AtomicInteger w = new AtomicInteger(0);
    private final akzt x;

    public cddf(axkm axkmVar, cdbo cdboVar, cdbo cdboVar2, cdbo cdboVar3, cfyt cfytVar, akzt akztVar, cdba cdbaVar, dtuu dtuuVar, ccbt ccbtVar, ccun ccunVar, ccun ccunVar2, ccun ccunVar3, cdih cdihVar, asjt asjtVar, cqoh cqohVar, errl errlVar, errl errlVar2) {
        this.g = axkmVar;
        this.k = cdboVar;
        this.l = cdboVar2;
        this.m = cdboVar3;
        this.j = cfytVar;
        this.x = akztVar;
        this.n = cdbaVar;
        this.p = ccbtVar;
        this.o = dtuuVar;
        this.q = ccunVar;
        this.r = ccunVar2;
        this.s = ccunVar3;
        this.t = cdihVar;
        this.u = asjtVar;
        this.v = cqohVar;
        this.h = errlVar;
        this.i = errlVar2;
    }

    public static int b(final engr engrVar, final enhd enhdVar, enhk enhkVar, final int i) {
        return enhkVar.size() - ((int) Collection.EL.stream(enhkVar.entrySet()).filter(new Predicate() { // from class: cdda
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entd entdVar = cddf.e;
                ccce ccceVar = (ccce) entry.getKey();
                cckb cckbVar = (cckb) entry.getValue();
                int i2 = ccceVar.h + 1;
                if (!(cckbVar instanceof cckd)) {
                    if (i2 < (cshg.b(Status.c(cckbVar.a)) ? (Integer) csgj.c.e() : (Integer) csgj.d.e()).intValue()) {
                        cccd cccdVar = (cccd) ccceVar.toBuilder();
                        cccdVar.copyOnWrite();
                        ccce ccceVar2 = (ccce) cccdVar.instance;
                        ccceVar2.b |= 32;
                        ccceVar2.h = i2;
                        ccce ccceVar3 = (ccce) cccdVar.build();
                        Duration a = (i2 % 2 == 0 || !((Boolean) cddf.c.e()).booleanValue()) ? cccm.a(i2, i) : Duration.ofMillis(10000L);
                        engr engrVar2 = engrVar;
                        cdau cdauVar = new cdau();
                        cdauVar.b(ccceVar3);
                        cdauVar.a = cdcd.a(ccceVar3, a);
                        engrVar2.h(cdauVar.a());
                        return false;
                    }
                }
                enhdVar.k(ccceVar, cckbVar);
                return true;
            }
        }).count());
    }

    public static elfl c(cdbo cdboVar, final int i, final axeo axeoVar, final int i2, final Optional optional) {
        if (!f()) {
            int i3 = engw.d;
            return elfo.e(enou.a);
        }
        if (i > 0) {
            return elfo.g(new Callable() { // from class: cdej
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Consumer consumer = new Consumer() { // from class: cdeg
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cenl cenlVar = (cenl) obj;
                            long a = cenlVar.a.a();
                            ceni ceniVar = (ceni) ffdx.Q(cenlVar.e);
                            if (ceniVar != null) {
                                ceniVar.b = a;
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    Optional optional2 = Optional.this;
                    optional2.ifPresent(consumer);
                    final long j = axeoVar.e;
                    buxo d = MessagesTable.d();
                    d.z("getEligibleMessageIds");
                    d.h(new Function() { // from class: cdee
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.x(j);
                            buxzVar.h();
                            buxzVar.j(csgg.w);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.x(i);
                    d.d(new buxl(MessagesTable.c.i, false));
                    bsob e2 = bsom.e();
                    e2.i(new Function() { // from class: cdef
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            bsolVar.f();
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.D(dtvz.i(e2.b(), bsom.c.a, MessagesTable.c.b).g());
                    HashSet hashSet = new HashSet(d.b().g());
                    optional2.ifPresent(new Consumer() { // from class: cdeh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cenl cenlVar = (cenl) obj;
                            long a = cenlVar.a.a();
                            ceni ceniVar = (ceni) ffdx.Q(cenlVar.e);
                            if (ceniVar != null) {
                                ceniVar.c = a;
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    });
                    Stream stream = Collection.EL.stream(hashSet);
                    final int i4 = i2;
                    Stream map = stream.map(new Function() { // from class: cdei
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return cdbn.a(1, ((MessageIdType) obj).b(), ccue.a(17), i4);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i5 = engw.d;
                    return (engw) map.collect(endq.a);
                }
            }, ((cdek) cdboVar).a);
        }
        int i4 = engw.d;
        return elfo.e(enou.a);
    }

    public static void d(Map map, int i, ccun ccunVar) {
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            try {
                engw engwVar = (engw) map.get(valueOf);
                engwVar.getClass();
                ccunVar.b(engwVar, csgg.SCHEDULED_BY_BATCH_BACKUP);
            } catch (ccwp unused) {
            }
        }
    }

    public static elfl e(cdbo cdboVar, final int i, final axeo axeoVar, final int i2) {
        if (!f()) {
            int i3 = engw.d;
            return elfo.e(enou.a);
        }
        if (i > 0) {
            return elfo.g(new Callable() { // from class: cdea
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final long j = axeoVar.d;
                    bsob e2 = bsom.e();
                    e2.z("getEligibleConversationIds");
                    e2.g(new Function() { // from class: cdec
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bskp) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e2.v(bsom.c.a);
                    e2.i(new Function() { // from class: cded
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            bsolVar.u(j);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e2.w(new dtzq("count($V{p})=count($V{p})", new Object[]{ParticipantsTable.c.E, ParticipantsTable.c.a}));
                    String[] strArr = bsdr.a;
                    bsdm bsdmVar = new bsdm(bsdr.a);
                    bsdmVar.u();
                    bvvn e3 = ParticipantsTable.e();
                    e3.u();
                    dtvy i4 = dtvz.i(e3.b(), ParticipantsTable.c.a, bsdr.c.b);
                    ((dtrd) i4).e = "p";
                    bsdmVar.F(i4);
                    dtvy i5 = dtvz.i(bsdmVar.b(), bsdr.c.a, bsom.c.a);
                    ((dtrd) i5).e = "cpt";
                    e2.G(i5.g());
                    HashSet hashSet = new HashSet(e2.b().f());
                    bsob e4 = bsom.e();
                    e4.z("+ConversationBatchBackupScheduler#getConversationsToBackup");
                    bsol bsolVar = new bsol();
                    bsolVar.t(hashSet);
                    enip enipVar = csgg.w;
                    int intValue = bsom.g().intValue();
                    if (intValue < 58210) {
                        dtub.w("cms_life_cycle", intValue);
                    }
                    final int i6 = i2;
                    int i7 = i;
                    bsolVar.aq(new dtrw("conversations.cms_life_cycle", 3, bsol.at((Iterable) enqc.a(enipVar).map(new Function() { // from class: bsok
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((csgg) obj).ordinal());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new bsoh()))), true));
                    bsolVar.g();
                    e4.h(bsolVar);
                    e4.e(new bsny(bsom.c.a, false));
                    e4.x(i7);
                    Stream map = Collection.EL.stream(e4.b().f()).map(new Function() { // from class: cddz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return cdbn.a(2, ((ConversationIdType) obj).a(), ccue.a(17), i6);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i8 = engw.d;
                    return (engw) map.collect(endq.a);
                }
            }, ((cdeb) cdboVar).a);
        }
        int i4 = engw.d;
        return elfo.e(enou.a);
    }

    private static boolean f() {
        bvvn e2 = ParticipantsTable.e();
        e2.z("isDefaultSelfBackedUp");
        e2.h(new Function() { // from class: cdcu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                entd entdVar = cddf.e;
                bvvwVar.w(-1);
                bvvwVar.f();
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return e2.b().T();
    }

    @Override // defpackage.cdce
    public final elfl a(final int i, final cdbj cdbjVar, final engw engwVar, final Optional optional, final boolean z) {
        final int i2 = this.w.get();
        if (i2 > ((Integer) f.e()).intValue()) {
            ((ensz) ((ensz) e.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 176, "CmsBatchBackupSchedulerImpl.java")).q("Scheduling failed after max number of retry");
            this.x.c("Bugle.Cms.BatchBackup.Abort.SchedulerFailure");
            return this.t.b(2).h(new emwl() { // from class: cdcq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = cddf.e;
                    int i3 = engw.d;
                    return enou.a;
                }
            }, erpp.a);
        }
        ((ensz) e.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 186, "CmsBatchBackupSchedulerImpl.java")).q("Schedule Next batch");
        int i3 = engw.d;
        final engr engrVar = new engr();
        return this.g.k().i(new eroh() { // from class: cdcr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final elfl h;
                axez axezVar = (axez) obj;
                final int i4 = i2;
                Consumer consumer = new Consumer() { // from class: cdcg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        cenl cenlVar = (cenl) obj2;
                        cqoh cqohVar = cenlVar.a;
                        entd entdVar = cddf.e;
                        cenlVar.e.add(new ceni(cqohVar.a(), i4 + 1));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                Optional optional2 = optional;
                optional2.ifPresent(consumer);
                final cddf cddfVar = cddf.this;
                axkl axklVar = cddfVar.g.n;
                boolean e2 = axkl.e(axezVar);
                final Optional optional3 = optional2;
                final engr engrVar2 = engrVar;
                if (!e2) {
                    ((ensz) cddf.e.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", BasePaymentResult.ERROR_REQUEST_FAILED, "CmsBatchBackupSchedulerImpl.java")).q("Feature disabled, stop scheduling");
                    return elfo.e(engrVar2.g());
                }
                if ((axezVar.b & 65536) == 0) {
                    ((ensz) ((ensz) cddf.e.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 209, "CmsBatchBackupSchedulerImpl.java")).q("Batch backup scheduling metadata does not exist. Batch backup terminated");
                    return cddfVar.t.b(2).h(new emwl() { // from class: cdch
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cddf.e;
                            return engr.this.g();
                        }
                    }, erpp.a);
                }
                axeo axeoVar = axezVar.t;
                if (axeoVar == null) {
                    axeoVar = axeo.a;
                }
                final axeo axeoVar2 = axeoVar;
                final int i5 = i;
                final engw engwVar2 = engwVar;
                cdbj cdbjVar2 = cdbjVar;
                enhd enhdVar = new enhd();
                cdax cdaxVar = (cdax) cdbjVar2;
                int b = cddf.b(engrVar2, enhdVar, cdaxVar.a, 3);
                int b2 = cddf.b(engrVar2, enhdVar, cdaxVar.b, 2);
                int b3 = cddf.b(engrVar2, enhdVar, cdaxVar.c, 1);
                if (((Boolean) cdce.b.e()).booleanValue()) {
                    boolean z2 = z;
                    Stream map = Collection.EL.stream(engwVar2).map(new Function() { // from class: cdci
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return cdcd.b((ccce) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i6 = engw.d;
                    final engw engwVar3 = (engw) map.collect(endq.a);
                    cfba a = cfbf.a();
                    a.z("CmsBatchBackupScheduleImpl#scheduleNextBatch");
                    final String str = true != z2 ? "cms_batch_backup" : "cms_batch_backup_foreground";
                    a.e(new Function() { // from class: cdcj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cfbe cfbeVar = (cfbe) obj2;
                            entd entdVar = cddf.e;
                            cfbeVar.j(str);
                            cfbeVar.b(engwVar3);
                            return cfbeVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final int intValue = (((((Integer) cdce.d.e()).intValue() - a.b().i()) - b) - b2) - b3;
                    emxf.d(intValue >= 0, "Scheduling logic broken, remaining quota is < 0. Remaining quota = %s", intValue);
                    h = intValue == 0 ? elfo.e(engrVar2) : cddfVar.k.a(intValue, axeoVar2, i5).h(new emwl() { // from class: cdcw
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            engw engwVar4 = (engw) obj2;
                            entd entdVar = cddf.e;
                            engr.this.j(engwVar4);
                            return Integer.valueOf(intValue - engwVar4.size());
                        }
                    }, cddfVar.h).i(new eroh() { // from class: cdcx
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final Integer num = (Integer) obj2;
                            int intValue2 = num.intValue();
                            axeo axeoVar3 = axeoVar2;
                            int i7 = i5;
                            cddf cddfVar2 = cddf.this;
                            elfl e3 = cddf.e(cddfVar2.l, intValue2, axeoVar3, i7);
                            final engr engrVar3 = engrVar2;
                            return e3.h(new emwl() { // from class: cddc
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    engw engwVar4 = (engw) obj3;
                                    entd entdVar = cddf.e;
                                    engr.this.j(engwVar4);
                                    return Integer.valueOf(num.intValue() - engwVar4.size());
                                }
                            }, cddfVar2.h);
                        }
                    }, cddfVar.i).i(new eroh() { // from class: cdcy
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return cddf.c(cddf.this.m, ((Integer) obj2).intValue(), axeoVar2, i5, optional3);
                        }
                    }, cddfVar.i).h(new emwl() { // from class: cdcn
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            engr engrVar3 = engr.this;
                            engrVar3.j((engw) obj2);
                            return engrVar3;
                        }
                    }, cddfVar.h);
                } else {
                    int intValue2 = ((Integer) cddf.a.e()).intValue() - b;
                    final int intValue3 = ((Integer) cddf.a.e()).intValue() - b2;
                    final int intValue4 = ((Integer) cddf.a.e()).intValue() - b3;
                    elfl h2 = cddfVar.k.a(intValue2, axeoVar2, i5).h(new emwl() { // from class: cdcn
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            engr engrVar3 = engr.this;
                            engrVar3.j((engw) obj2);
                            return engrVar3;
                        }
                    }, cddfVar.h).i(new eroh() { // from class: cdco
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return cddf.e(cddf.this.l, intValue3, axeoVar2, i5);
                        }
                    }, cddfVar.i).h(new emwl() { // from class: cdcn
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            engr engrVar3 = engr.this;
                            engrVar3.j((engw) obj2);
                            return engrVar3;
                        }
                    }, cddfVar.h);
                    eroh erohVar = new eroh() { // from class: cdcp
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return cddf.c(cddf.this.m, intValue4, axeoVar2, i5, optional3);
                        }
                    };
                    axeoVar2 = axeoVar2;
                    i5 = i5;
                    optional3 = optional3;
                    h = h2.i(erohVar, cddfVar.i).h(new emwl() { // from class: cdcn
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            engr engrVar3 = engr.this;
                            engrVar3.j((engw) obj2);
                            return engrVar3;
                        }
                    }, cddfVar.h);
                }
                enhk c = enhdVar.c();
                cddfVar.v.f().toEpochMilli();
                Stream map2 = Collection.EL.stream(c.entrySet()).map(new Function() { // from class: cdct
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Map.Entry entry = (Map.Entry) obj2;
                        ccce ccceVar = (ccce) entry.getKey();
                        return cddf.this.p.b(ccceVar, ((cckb) entry.getValue()).a, true, ccceVar.h);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i7 = engw.d;
                elfl h3 = elfo.a((Iterable) map2.collect(endq.a)).h(new emwl() { // from class: cdcv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = cddf.e;
                        return null;
                    }
                }, cddfVar.h).i(new eroh() { // from class: cdck
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        entd entdVar = cddf.e;
                        return elfl.this;
                    }
                }, cddfVar.h).h(new emwl() { // from class: cdcl
                    /* JADX WARN: Type inference failed for: r6v30, types: [comc, java.lang.Object] */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        int i8;
                        int i9;
                        int i10;
                        int i11;
                        long j;
                        long j2;
                        engw g = ((engr) obj2).g();
                        engw engwVar4 = engwVar2;
                        cddf cddfVar2 = cddf.this;
                        if (!cddfVar2.n.a(g, engwVar4)) {
                            return g;
                        }
                        final int i12 = i5;
                        final axeo axeoVar3 = axeoVar2;
                        ((ensz) cddf.e.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", 327, "CmsBatchBackupSchedulerImpl.java")).q("Nothing to batch, initial backup completes");
                        cdba cdbaVar = cddfVar2.n;
                        axeoVar3.getClass();
                        final cdbf cdbfVar = (cdbf) cdbaVar;
                        cdbfVar.b.d("CmsBatchBackupCompletionProcessorImpl#markBatchBackupComplete", new Runnable() { // from class: cdbe
                            @Override // java.lang.Runnable
                            public final void run() {
                                final cdbf cdbfVar2 = cdbf.this;
                                cdbfVar2.m.d();
                                if (((Boolean) cdbfVar2.l.b()).booleanValue()) {
                                    ((alrv) cdbfVar2.k.b()).f(alrv.Q);
                                }
                                int i13 = i12;
                                cdyb cdybVar = cdbfVar2.d;
                                cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
                                cdvwVar.getClass();
                                cdvv.b(i13, cdvwVar);
                                cdvx a2 = cdvv.a(cdvwVar);
                                cetp cetpVar = new cetp();
                                cetpVar.b = String.valueOf(i13);
                                cdybVar.a(a2, cetpVar.a());
                                cdeq cdeqVar = cdbfVar2.f;
                                cdvw cdvwVar2 = (cdvw) cdvx.a.createBuilder();
                                cdvwVar2.getClass();
                                cdvv.b(i13, cdvwVar2);
                                ((cevh) cdeqVar.a.b()).a(ceyr.g("cms_drop_unscheduled_item_to_dlq", cdvv.a(cdvwVar2)));
                                cenz cenzVar = cdbfVar2.g;
                                cdvw cdvwVar3 = (cdvw) cdvx.a.createBuilder();
                                cdvwVar3.getClass();
                                cdvv.b(i13, cdvwVar3);
                                ((cevh) cenzVar.a.b()).a(ceyr.g("cms_backup_validation_work_handler", cdvv.a(cdvwVar3)));
                                cdbfVar2.b.g(new dtut() { // from class: cdbc
                                    @Override // defpackage.dtut
                                    public final ekzz a() {
                                        return eleg.f("CBBCPI::markBatchBackupComplete::runAfterCommit");
                                    }
                                }, "CmsBatchBackupCompletionProcessorImpl#markBatchBackupComplete#AfterCommit", new Runnable() { // from class: cdbd
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        cdbf cdbfVar3 = cdbf.this;
                                        if (csgj.a() && ((Boolean) ((cfup) csfu.k.get()).e()).booleanValue()) {
                                            cdbfVar3.o.a(elfo.e(null), csgi.a);
                                        }
                                        cdbfVar3.c.N();
                                    }
                                });
                            }
                        });
                        Duration ofSeconds = Duration.ofSeconds(cdbfVar.e.f().getEpochSecond() - axeoVar3.f);
                        csjb c2 = cdbf.a.c();
                        c2.I("Sync complete");
                        c2.z("backupDurationInMillis", ofSeconds.toMillis());
                        c2.r();
                        if (((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue()) {
                            axkm axkmVar = cdbfVar.c;
                            final eyja d = eykm.d(cdbfVar.e.f().toEpochMilli());
                            efbd.b();
                            axkmVar.e.get().m(new emwl() { // from class: axhu
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    cskc cskcVar = axkm.a;
                                    axep builder = ((axez) obj3).toBuilder();
                                    builder.copyOnWrite();
                                    axez axezVar2 = (axez) builder.instance;
                                    eyja eyjaVar = eyja.this;
                                    eyjaVar.getClass();
                                    axezVar2.S = eyjaVar;
                                    axezVar2.c |= 16384;
                                    return builder.build();
                                }
                            });
                        }
                        if (cdbfVar.n.a()) {
                            axez c3 = cdbfVar.c.c();
                            axky axkyVar = c3.C;
                            if (axkyVar == null) {
                                axkyVar = axky.a;
                            }
                            int i13 = axkyVar.m;
                            axky axkyVar2 = c3.C;
                            int i14 = (axkyVar2 == null ? axky.a : axkyVar2).n;
                            int i15 = (axkyVar2 == null ? axky.a : axkyVar2).i;
                            int i16 = (axkyVar2 == null ? axky.a : axkyVar2).j;
                            long j3 = (axkyVar2 == null ? axky.a : axkyVar2).e;
                            if (axkyVar2 == null) {
                                axkyVar2 = axky.a;
                            }
                            i8 = i13;
                            i9 = i14;
                            i10 = i15;
                            i11 = i16;
                            j = j3;
                            j2 = axkyVar2.f;
                        } else {
                            i8 = 0;
                            i9 = 0;
                            i10 = 0;
                            i11 = 0;
                            j = 0;
                            j2 = 0;
                        }
                        axdf axdfVar = cdbfVar.j;
                        Map c4 = axdw.c(new ffji() { // from class: axdp
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                buxzVar.getClass();
                                buxzVar.x(axeo.this.e);
                                buxzVar.k(csgg.SUCCEED_VIA_BATCH_BACKUP, csgg.FAILED_VIA_BATCH_BACKUP);
                                return buxzVar;
                            }
                        });
                        int intValue5 = ((Number) Map.EL.getOrDefault(c4, axdv.a, 0)).intValue();
                        int intValue6 = ((Number) Map.EL.getOrDefault(c4, axdv.b, 0)).intValue();
                        java.util.Map a2 = axdw.a(new ffji() { // from class: axdt
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                bsol bsolVar = (bsol) obj3;
                                bsolVar.getClass();
                                bsolVar.u(axeo.this.d);
                                bsolVar.h(csgg.SUCCEED_VIA_BATCH_BACKUP, csgg.FAILED_VIA_BATCH_BACKUP);
                                return bsolVar;
                            }
                        });
                        int intValue7 = ((Number) Map.EL.getOrDefault(a2, axdv.a, 0)).intValue();
                        int intValue8 = ((Number) Map.EL.getOrDefault(a2, axdv.b, 0)).intValue();
                        java.util.Map d2 = axdw.d(new ffji() { // from class: axdk
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                bvvw bvvwVar = (bvvw) obj3;
                                bvvwVar.getClass();
                                bvvwVar.n(axeo.this.c);
                                bvvwVar.h(csgg.SUCCEED_VIA_BATCH_BACKUP, csgg.FAILED_VIA_BATCH_BACKUP);
                                return bvvwVar;
                            }
                        });
                        axdx axdxVar = new axdx(intValue5, intValue6, intValue7, intValue8, ((Number) Map.EL.getOrDefault(d2, axdv.a, 0)).intValue(), ((Number) Map.EL.getOrDefault(d2, axdv.b, 0)).intValue(), 0, 0, i8, i9, 0, 0, i10, i11, 0L, 0L, 0L, j, j2);
                        epep epepVar = (epep) epeq.a.createBuilder();
                        epfx c5 = axdfVar.c(epfx.BACKUP);
                        epepVar.copyOnWrite();
                        epeq epeqVar = (epeq) epepVar.instance;
                        epeqVar.c = c5.s;
                        epeqVar.b |= 1;
                        long millis = ofSeconds.toMillis();
                        epepVar.copyOnWrite();
                        epeq epeqVar2 = (epeq) epepVar.instance;
                        epeqVar2.b |= 8;
                        epeqVar2.f = millis;
                        epepVar.copyOnWrite();
                        epeq epeqVar3 = (epeq) epepVar.instance;
                        epeqVar3.d = 8;
                        epeqVar3.b |= 2;
                        epeg epegVar = epeg.NO_FAILURE;
                        epepVar.copyOnWrite();
                        epeq epeqVar4 = (epeq) epepVar.instance;
                        epeqVar4.e = epegVar.bs;
                        epeqVar4.b |= 4;
                        epepVar.a(axdfVar.b());
                        epdx epdxVar = (epdx) epgf.a.createBuilder();
                        epeq epeqVar5 = (epeq) epepVar.build();
                        epdxVar.copyOnWrite();
                        epgf epgfVar = (epgf) epdxVar.instance;
                        epeqVar5.getClass();
                        epgfVar.c = epeqVar5;
                        epgfVar.b |= 1;
                        axdfVar.k((epgf) epdxVar.build(), axdxVar, false);
                        if (((ashm) cdbfVar.q.b()).a()) {
                            try {
                                cdpx cdpxVar = ((cdbf) cdbaVar).h;
                                cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
                                cdvwVar.getClass();
                                cdvv.b(i12, cdvwVar);
                                ((cevh) cdpxVar.a.b()).a(ceyr.g("cms_media_download_queuer_work_handler", cdvv.a(cdvwVar)));
                            } catch (Exception e3) {
                                cdbf.a.o("Failed to queue media download, media will appear as click-to-download icons.", e3);
                            }
                        }
                        if (((ashn) cdbfVar.r.b()).a()) {
                            int i17 = 3;
                            while (i17 > 0) {
                                try {
                                    cdqh cdqhVar = ((cdbf) cdbaVar).i;
                                    cdvw cdvwVar2 = (cdvw) cdvx.a.createBuilder();
                                    cdvwVar2.getClass();
                                    cdvv.b(i12, cdvwVar2);
                                    ((cevh) cdqhVar.a.b()).a(ceyr.g("cms_media_upload_queuer_work_handler", cdvv.a(cdvwVar2)));
                                    i17 = 0;
                                } catch (Exception e4) {
                                    i17--;
                                    cdbf.a.o(a.f(i17, "Failed to queue media upload, ", " retries left."), e4);
                                }
                            }
                        }
                        if (((ersq) ((arkn) cdbfVar.s).a.b()).a("bugle.logs_session_ids_in_cms")) {
                            cdfj cdfjVar = cdbfVar.t;
                            cdvw cdvwVar3 = (cdvw) cdvx.a.createBuilder();
                            cdvwVar3.getClass();
                            cdvv.b(i12, cdvwVar3);
                            ((cevh) cdfjVar.a.b()).a(ceyr.g("upload_previous_cms_session_ids", cdvv.a(cdvwVar3)));
                        }
                        int i18 = engw.d;
                        return enou.a;
                    }
                }, cddfVar.i);
                return optional3.isPresent() ? h3.h(new emwl() { // from class: cdcm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        engw engwVar4 = (engw) obj2;
                        entd entdVar = cddf.e;
                        cenl cenlVar = (cenl) Optional.this.get();
                        cqoh cqohVar = cenlVar.a;
                        List list = cenlVar.e;
                        long a2 = cqohVar.a();
                        ceni ceniVar = (ceni) ffdx.Q(list);
                        if (ceniVar != null) {
                            ceniVar.d = a2;
                        }
                        return engwVar4;
                    }
                }, cddfVar.i) : h3;
            }
        }, this.i).f(Throwable.class, new eroh() { // from class: cdcs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                ((ensz) ((ensz) ((ensz) cddf.e.j()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupSchedulerImpl", "scheduleNextBatch", (char) 373, "CmsBatchBackupSchedulerImpl.java")).q("Schedule next batch failed, will retry");
                cddf cddfVar = cddf.this;
                if (cddfVar.u.a()) {
                    crze.c("Schedule next batch failed, will retry", th);
                } else {
                    cddfVar.j.b(th);
                }
                boolean z2 = z;
                Optional optional2 = optional;
                engw engwVar2 = engwVar;
                cdbj cdbjVar2 = cdbjVar;
                int i4 = i;
                cddfVar.w.addAndGet(1);
                return cddfVar.a(i4, cdbjVar2, engwVar2, optional2, z2);
            }
        }, this.h);
    }
}
