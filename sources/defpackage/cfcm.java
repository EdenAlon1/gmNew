package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfcm extends cpdo {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask");
    public final ceyw b;
    public final cexg c;
    public final elfk d = new elfk();
    public final errl e;
    public final Executor f;
    public final cbwj g;
    private final cexi h;
    private final asxd i;

    public cfcm(ceyw ceywVar, errl errlVar, cexg cexgVar, cexi cexiVar, cbwj cbwjVar, asxd asxdVar) {
        this.b = ceywVar;
        this.e = errlVar;
        this.f = new ersb(errlVar);
        this.c = cexgVar;
        this.h = cexiVar;
        this.g = cbwjVar;
        this.i = asxdVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("WorkQueueWorkManagerCleanupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        if (!this.i.a()) {
            return this.h.c(cexh.b).h(new emwl() { // from class: cfch
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    final Collection collection = (Collection) obj;
                    cfba a2 = cfbf.a();
                    a2.z("getUnscheduledItemsQuery");
                    a2.e(new Function() { // from class: cfce
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cfbe cfbeVar = (cfbe) obj2;
                            cfbeVar.i();
                            cfbeVar.k(collection);
                            return cfbeVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    a2.d(new cfax(cfbf.c.a));
                    return (cfag) a2.b().o();
                }
            }, this.e).h(new emwl() { // from class: cfci
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cfag cfagVar = (cfag) obj;
                    int count = cfagVar.getCount();
                    cfagVar.dh();
                    int i = 0;
                    while (cfagVar.moveToNext()) {
                        i++;
                        try {
                            final ceze cezeVar = (ceze) cfagVar.cO();
                            final cfcm cfcmVar = cfcm.this;
                            cexg cexgVar = cfcmVar.c;
                            synchronized (cexgVar.d) {
                                cexgVar.e.add(new cexf(cexgVar.b.f().toEpochMilli(), 5, cezeVar));
                            }
                            elfo.h(new erog() { // from class: cfbu
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    ekzz f = eleg.f("launchToWorkManager");
                                    try {
                                        elfl b = cfcm.this.b.b(cezeVar);
                                        f.b(b);
                                        f.close();
                                        return b;
                                    } catch (Throwable th) {
                                        try {
                                            f.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }, cfcmVar.f).e(ceuv.class, new emwl() { // from class: cfcd
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    ensk j = cfcm.a.j();
                                    j.Y(ente.a, "BugleWorkQueue");
                                    enrr enrrVar = (enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask", "run", 127, "WorkQueueWorkManagerJanitorTask.java");
                                    final ceze cezeVar2 = ceze.this;
                                    enrrVar.t("dropping work: %s", cezeVar2);
                                    String[] strArr = cfbf.a;
                                    cfau cfauVar = new cfau();
                                    cfauVar.f("WorkQueueWorkManagerJanitorTask#run");
                                    cfauVar.c(new Function() { // from class: cfca
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            cfbe cfbeVar = (cfbe) obj3;
                                            cfbeVar.c(ceze.this.l());
                                            return cfbeVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    cfauVar.d();
                                    return pqb.a;
                                }
                            }, cfcmVar.e).k(axnw.b(), erpp.a);
                        } catch (IllegalStateException unused) {
                            ensk j = cfcm.a.j();
                            j.Y(ente.a, "BugleWorkQueue");
                            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask", "run", 107, "WorkQueueWorkManagerJanitorTask.java")).u("breaking WorkQueueManagrJanitorTask loop for IllegalStateException: cursor count is : %d; current position is %d", count, i);
                        }
                    }
                    cfagVar.close();
                    return 1;
                }
            }, this.e);
        }
        ekzz f = eleg.f("WorkQueueWorkManagerJanitorTask#run");
        try {
            elfl d = d(0);
            f.b(d);
            f.close();
            return d;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }

    public final elfl d(final Integer num) {
        return this.h.c(cexh.b).i(new eroh() { // from class: cfcg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Collection collection = (Collection) obj;
                cfba a2 = cfbf.a();
                a2.z("getUnscheduledItemsBatch");
                a2.e(new Function() { // from class: cfcl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cfbe cfbeVar = (cfbe) obj2;
                        cfbeVar.i();
                        cfbeVar.k(collection);
                        return cfbeVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a2.c((cfaf[]) DesugarArrays.stream(cfbf.c.l).filter(new Predicate() { // from class: cfcb
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
                    public final boolean test(Object obj2) {
                        return !Objects.equals(((cfaf) obj2).d(), "rawdata");
                    }
                }).toArray(new IntFunction() { // from class: cfcc
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        return new cfaf[i];
                    }
                }));
                a2.d(new cfax(cfbf.c.a));
                a2.x(100);
                final cfay b = a2.b();
                return elfl.g(b.A(new Supplier() { // from class: dtxx
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return dtyq.this.D();
                    }
                }));
            }
        }, erpp.a).i(new eroh() { // from class: cfcf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ArrayList arrayList = new ArrayList();
                final cfcm cfcmVar = cfcm.this;
                ((Stream) obj).forEach(new Consumer() { // from class: cfbw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        final ceze cezeVar = (ceze) obj2;
                        final cfcm cfcmVar2 = cfcm.this;
                        arrayList.add(elfl.g(cfcmVar2.d.a(new erog() { // from class: cfby
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                final cfcm cfcmVar3 = cfcm.this;
                                final ceze cezeVar2 = cezeVar;
                                return elfo.h(new erog() { // from class: cfcj
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        ekzz f = eleg.f("enqueueScheduleOrDeleteRow#launchToWorkManager");
                                        try {
                                            elfl b = cfcm.this.b.b(cezeVar2);
                                            f.b(b);
                                            f.close();
                                            return b;
                                        } catch (Throwable th) {
                                            try {
                                                f.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                }, cfcmVar3.e).f(ceuv.class, new eroh() { // from class: cfck
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        ensk j = cfcm.a.j();
                                        j.Y(ente.a, "BugleWorkQueue");
                                        enrr enrrVar = (enrr) ((enrr) ((enrr) j).g((ceuv) obj3)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask", "executionSequencerControlledScheduleOrDeleteRow", 216, "WorkQueueWorkManagerJanitorTask.java");
                                        final ceze cezeVar3 = cezeVar2;
                                        enrrVar.t("dropping work: %s", cezeVar3);
                                        return cfcm.this.g.a("sequencedScheduleOrDeleteRow#catching", new emyl() { // from class: cfbv
                                            @Override // defpackage.emyl
                                            public final Object get() {
                                                String[] strArr = cfbf.a;
                                                cfau cfauVar = new cfau();
                                                cfauVar.f("sequencedScheduleOrDeleteRow delete");
                                                final ceze cezeVar4 = ceze.this;
                                                cfauVar.c(new Function() { // from class: cfbz
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj4) {
                                                        cfbe cfbeVar = (cfbe) obj4;
                                                        cfbeVar.c(ceze.this.l());
                                                        return cfbeVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                emxf.l(cfauVar.d() <= 1);
                                                return pqb.a;
                                            }
                                        });
                                    }
                                }, erpp.a);
                            }
                        }, erpp.a)));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                elfn l = elfo.l(arrayList);
                final Integer num2 = num;
                return l.b(new erog() { // from class: cfbx
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        Integer num3 = num2;
                        return arrayList.isEmpty() ? elfo.e(num3) : cfcm.this.d(Integer.valueOf(num3.intValue() + 1));
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }
}
