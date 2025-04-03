package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarTimeZone;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddx {
    public static final entd a = entd.c("BugleCmsBatchBackup");
    static final cfup b = cfvl.f(cfvl.b, "retry_delay_millis_cms_batch_backup_work_handler", 10000);
    public final cdce c;
    public final cdcc d;
    public final errl e;
    public final cdih f;
    public final cdba g;
    public final axkm h;
    public final cfyt i;
    public final cenb j;
    public final cqoh k;
    public final errl l;
    public final asjt m;
    public final cdbk n;
    public final dtuu o;
    public final cdcb p;
    private final asju q;

    static {
        cfvl.f(cfvl.b, "max_initial_backup_foreground_service_duration_seconds", Duration.ofHours(1L).getSeconds());
    }

    public cddx(cdcb cdcbVar, cdce cdceVar, cdcc cdccVar, cdbk cdbkVar, cdih cdihVar, cdba cdbaVar, axkm axkmVar, cfyt cfytVar, asjt asjtVar, cenb cenbVar, asju asjuVar, cqoh cqohVar, dtuu dtuuVar, errl errlVar, errl errlVar2) {
        this.p = cdcbVar;
        this.c = cdceVar;
        this.d = cdccVar;
        this.n = cdbkVar;
        this.f = cdihVar;
        this.g = cdbaVar;
        this.h = axkmVar;
        this.k = cqohVar;
        this.i = cfytVar;
        this.m = asjtVar;
        this.e = errlVar;
        this.j = cenbVar;
        this.o = dtuuVar;
        this.q = asjuVar;
        this.l = errlVar2;
    }

    public static String c(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl a(final Optional optional, final engw engwVar, final axeo axeoVar, final boolean z) {
        emxf.b(!engwVar.isEmpty(), "PWQ passed in empty requests!");
        final int i = ((ccce) engwVar.get(0)).c;
        final cddf cddfVar = (cddf) this.c;
        return elfo.f(new Runnable() { // from class: cdcz
            @Override // java.lang.Runnable
            public final void run() {
                Stream stream = Collection.EL.stream(engwVar);
                Function function = new Function() { // from class: cddd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((ccce) obj).d);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                Supplier supplier = new Supplier() { // from class: cddb
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new HashMap();
                    }
                };
                Function function2 = new Function() { // from class: cdde
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ccce) obj).e;
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                };
                int i2 = engw.d;
                final Map map = (Map) stream.collect(Collectors.groupingBy(function, supplier, Collectors.mapping(function2, endq.a)));
                final cddf cddfVar2 = cddf.this;
                cddfVar2.o.d("CmsBatchBackupSchedulerImpl#markNextBatchItemAsScheduled", new Runnable() { // from class: cdcf
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map2 = map;
                        cddf cddfVar3 = cddf.this;
                        cddf.d(map2, 3, cddfVar3.q);
                        cddf.d(map2, 2, cddfVar3.r);
                        cddf.d(map2, 1, cddfVar3.s);
                    }
                });
            }
        }, cddfVar.i).i(new eroh() { // from class: cddh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar2;
                engw engwVar3 = engwVar;
                if (engwVar3.isEmpty()) {
                    cdcb.a.r("Work handler passed in empty request!");
                    engwVar2 = enou.a;
                } else {
                    cddx cddxVar = cddx.this;
                    final Optional optional2 = optional;
                    final int i2 = ((ccce) engwVar3.get(0)).c;
                    Stream stream = Collection.EL.stream(((Map) Collection.EL.stream(engwVar3).collect(Collectors.groupingBy(new Function() { // from class: cdbx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return Integer.valueOf(((ccce) obj2).d);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Supplier() { // from class: cdby
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new HashMap();
                        }
                    }, endq.a))).entrySet());
                    final cdcb cdcbVar = cddxVar.p;
                    engwVar2 = (engw) stream.map(new Function() { // from class: cdbz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            Map.Entry entry = (Map.Entry) obj2;
                            final engw engwVar4 = (engw) entry.getValue();
                            final int intValue = ((Integer) entry.getKey()).intValue();
                            csjb c = cdcb.a.c();
                            c.y("type of jobs", intValue);
                            c.y("number of jobs", engwVar4.size());
                            c.r();
                            final cdcb cdcbVar2 = cdcb.this;
                            final Optional optional3 = optional2;
                            elfl h = cdcbVar2.c.b(i2).i(new eroh() { // from class: cdbu
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    final int i3 = intValue;
                                    final engw engwVar5 = engwVar4;
                                    Consumer consumer = new Consumer() { // from class: cdbt
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj4) {
                                            cenl cenlVar = (cenl) obj4;
                                            cqoh cqohVar = cenlVar.a;
                                            int size = engwVar5.size();
                                            long a2 = cqohVar.a();
                                            int i4 = i3;
                                            Integer b2 = cenlVar.b(i4);
                                            if (b2 != null) {
                                                cenlVar.d.set(b2.intValue(), new cenk(a2, i4, size));
                                            }
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                            return Consumer$CC.$default$andThen(this, consumer2);
                                        }
                                    };
                                    Optional optional4 = optional3;
                                    optional4.ifPresent(consumer);
                                    ccjf ccjfVar = (ccjf) ((cdca) ekhv.a(cdcb.this.b, cdca.class, (eisx) obj3)).gy().get(Integer.valueOf(i3));
                                    ccjfVar.getClass();
                                    return ccjfVar.a(engwVar5, optional4);
                                }
                            }, cdcbVar2.d).h(new emwl() { // from class: cdbv
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    ccam ccamVar = (ccam) obj3;
                                    cckh cckhVar = ccamVar.c;
                                    if (cckhVar == null) {
                                        return new ccal(ccamVar.a, (Map) Collection.EL.stream(ccamVar.b.entrySet()).filter(new Predicate() { // from class: cdbq
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
                                            public final boolean test(Object obj4) {
                                                return ((Map.Entry) obj4).getValue() instanceof cckb;
                                            }
                                        }).collect(endq.a(new Function() { // from class: cdbr
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                return (ccce) ((Map.Entry) obj4).getKey();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }, new Function() { // from class: cdbs
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                return (cckb) ((Map.Entry) obj4).getValue();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        })));
                                    }
                                    throw new cdbp(cckhVar.a);
                                }
                            }, cdcbVar2.e);
                            return optional3.isPresent() ? h.h(new emwl() { // from class: cdbw
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    ccal ccalVar = (ccal) obj3;
                                    cenl cenlVar = (cenl) Optional.this.get();
                                    long a2 = cenlVar.a.a();
                                    cenk a3 = cenlVar.a(intValue);
                                    if (a3 != null) {
                                        a3.f = a2;
                                    }
                                    return ccalVar;
                                }
                            }, cdcbVar2.e) : h;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a);
                }
                return elfo.a(engwVar2);
            }
        }, this.e).i(new eroh() { // from class: cddi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cdbi d = cdbj.d();
                for (ccal ccalVar : (List) obj) {
                    int i2 = ccalVar.a;
                    if (i2 == 1) {
                        d.c(enhk.j(ccalVar.b));
                    } else if (i2 != 2) {
                        d.d(enhk.j(ccalVar.b));
                    } else {
                        d.b(enhk.j(ccalVar.b));
                    }
                }
                cddx cddxVar = cddx.this;
                boolean z2 = z;
                Optional optional2 = optional;
                engw engwVar2 = engwVar;
                return cddxVar.c.a(i, d.a(), engwVar2, optional2, z2);
            }
        }, this.e).h(new emwl() { // from class: cddj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final engw engwVar2 = (engw) obj;
                long j = axeoVar.f;
                if (!z) {
                    Stream map = Collection.EL.stream(engwVar2).map(new Function() { // from class: cdds
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cdaz cdazVar = (cdaz) obj2;
                            return ceyr.h("cms_batch_backup", cdazVar.a(), cdazVar.b());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i2 = engw.d;
                    return ceyt.j((engw) map.collect(endq.a));
                }
                final cddx cddxVar = cddx.this;
                cddxVar.o.d("CmsBatchBackupWorkHandlerDelegate#switchFromForegroundToWorkManager", new Runnable() { // from class: cddv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        cddx cddxVar2 = cddx.this;
                        for (cetr cetrVar : ((cevh) cddxVar2.n.a.b()).c("cms_batch_backup_foreground")) {
                            cetp cetpVar = new cetp();
                            String str = cetrVar.b;
                            if (str != null) {
                                cetpVar.b = str;
                            }
                            cddxVar2.d.a((ccce) cetrVar.a, cetpVar.a());
                        }
                        engw engwVar3 = engwVar2;
                        int size = engwVar3.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            cdaz cdazVar = (cdaz) engwVar3.get(i3);
                            cddxVar2.d.a(cdazVar.a(), cdazVar.b());
                        }
                    }
                });
                return ceyt.i();
            }
        }, this.l).f(cdbp.class, new eroh() { // from class: cddk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl e;
                elfl c;
                boolean z2 = ((cdbp) obj).getCause() instanceof csgw;
                cddx cddxVar = cddx.this;
                if (z2) {
                    int i2 = i;
                    cdbf cdbfVar = (cdbf) cddxVar.g;
                    c = axol.c(cdbfVar.p, ffhe.a, ffsm.a, new cdbg(cdbfVar, i2, null));
                    e = c.h(new emwl() { // from class: cddw
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cddx.a;
                            return ceyt.k();
                        }
                    }, cddxVar.e);
                } else {
                    e = elfo.e(ceyt.k());
                }
                Optional optional2 = optional;
                if (!optional2.isPresent()) {
                    return e;
                }
                return cddxVar.b(e, (cenl) optional2.get(), engwVar);
            }
        }, this.e).f(Exception.class, new eroh() { // from class: cddl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Exception exc = (Exception) obj;
                cddx cddxVar = cddx.this;
                if (cddxVar.m.a()) {
                    crze.b("Terminating batch backup", exc);
                } else {
                    cddxVar.i.b(exc);
                }
                Optional optional2 = optional;
                ((ensz) ((ensz) ((ensz) cddx.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupWorkHandlerDelegate", "processPendingWorkItemAsyncInternal", (char) 324, "CmsBatchBackupWorkHandlerDelegate.java")).q("Failed to continue batch backup, terminating the initial sync.");
                elfl h = cddxVar.f.b(2).h(new emwl() { // from class: cddo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = cddx.a;
                        return ceyt.k();
                    }
                }, cddxVar.e);
                if (!optional2.isPresent()) {
                    return h;
                }
                return cddxVar.b(h, (cenl) optional2.get(), engwVar);
            }
        }, this.e);
    }

    public final elfl b(final elfl elflVar, final cenl cenlVar, final engw engwVar) {
        final elfl k = this.h.k();
        return elfo.m(elflVar, k).b(new erog() { // from class: cddr
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl c;
                final ceyt ceytVar = (ceyt) erqt.q(elflVar);
                final axez axezVar = (axez) erqt.q(k);
                Exception d = ceytVar.d();
                final cddx cddxVar = cddx.this;
                cenh cenhVar = (cenh) cddxVar.j;
                c = axol.c(cenhVar.e, ffhe.a, ffsm.a, new ceng(cenhVar, cenlVar, d, null));
                engw c2 = ceytVar.c();
                if (c2 == null || c2.isEmpty()) {
                    final engw engwVar2 = engwVar;
                    c = c.h(new emwl() { // from class: cddt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            int i = engw.d;
                            engw engwVar3 = enou.a;
                            engw engwVar4 = engwVar2;
                            cddx cddxVar2 = cddx.this;
                            if (cddxVar2.g.a(engwVar3, engwVar4)) {
                                axez axezVar2 = axezVar;
                                axeo axeoVar = axezVar2.t;
                                if (axeoVar == null) {
                                    axeoVar = axeo.a;
                                }
                                String str = axezVar2.j;
                                Duration ofSeconds = Duration.ofSeconds(cddxVar2.k.f().minusSeconds(axeoVar.f).getEpochSecond());
                                cenb cenbVar = cddxVar2.j;
                                long j = axeoVar.f * 1000;
                                cqoh cqohVar = cddxVar2.k;
                                String str2 = "\n\nbackupStart: " + cddx.c(j) + " in UTC\nbackupEnd:" + cddx.c(cqohVar.f().toEpochMilli()) + " in UTC\nbackupDuration: " + String.valueOf(ofSeconds) + "\nsessionId: " + str;
                                csjw csjwVar = ((cenh) cenbVar).b.b;
                                if (csjwVar != null) {
                                    csjwVar.b(4, "BugleCmsBackupTiming", str2);
                                }
                                cenh cenhVar2 = (cenh) cddxVar2.j;
                                csjw csjwVar2 = cenhVar2.b.b;
                                if (csjwVar2 != null) {
                                    csjwVar2.close();
                                }
                                cenhVar2.b.b = null;
                            }
                            return ffcu.a;
                        }
                    }, cddxVar.l);
                }
                return c.h(new emwl() { // from class: cddu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = cddx.a;
                        return ceyt.this;
                    }
                }, cddxVar.e);
            }
        }, this.e);
    }

    final elfl d(final engw engwVar, boolean z) {
        final Optional empty;
        if (this.q.a()) {
            int intValue = ((Integer) Collection.EL.stream(engwVar).map(new Function() { // from class: cddm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((ccce) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).max(new Comparator() { // from class: cddn
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Integer.compare(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            }).orElse(0)).intValue();
            cenh cenhVar = (cenh) this.j;
            empty = Optional.of(new cenl(cenhVar.a, intValue, cenhVar.b.a.get()));
        } else {
            empty = Optional.empty();
        }
        elfl i = z ? this.h.k().i(new eroh() { // from class: cddp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                axez axezVar = (axez) obj;
                cddx cddxVar = cddx.this;
                axkl axklVar = cddxVar.h.n;
                if (!axkl.g(axezVar)) {
                    ((ensz) ((ensz) cddx.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupWorkHandlerDelegate", "processPendingWorkItemAsync", 185, "CmsBatchBackupWorkHandlerDelegate.java")).q("Cms feature is disabled, quit the batch flow");
                    return elfo.e(ceyt.i());
                }
                axeo axeoVar = axezVar.t;
                if (axeoVar == null) {
                    axeoVar = axeo.a;
                }
                return cddxVar.a(empty, engwVar, axeoVar, true);
            }
        }, this.e) : this.h.n.b().i(new eroh() { // from class: cddq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    ((ensz) ((ensz) cddx.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/CmsBatchBackupWorkHandlerDelegate", "processPendingWorkItemAsync", 206, "CmsBatchBackupWorkHandlerDelegate.java")).q("Cms feature is disabled, quit the batch flow");
                    return elfo.e(ceyt.i());
                }
                engw engwVar2 = engwVar;
                return cddx.this.a(empty, engwVar2, axeo.a, false);
            }
        }, this.e);
        return empty.isPresent() ? b(i, (cenl) empty.get(), engwVar) : i;
    }
}
