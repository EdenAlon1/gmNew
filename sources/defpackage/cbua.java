package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbua extends ceut {
    public static final entd a = entd.c("BugleJobs");
    public final errl b;
    public final fazb c;
    public final ffbr d;
    public final cbpl e;
    public final cbth f;
    private final errl g;
    private final cbtp h;

    public cbua(errl errlVar, errl errlVar2, fazb fazbVar, ffbr ffbrVar, cbpl cbplVar, cbth cbthVar, cbtp cbtpVar) {
        this.g = errlVar;
        this.b = errlVar2;
        this.c = fazbVar;
        this.d = ffbrVar;
        this.e = cbplVar;
        this.f = cbthVar;
        this.h = cbtpVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        poh pohVar = new poh();
        pohVar.d = true;
        pohVar.c = true;
        pohVar.b = true;
        pohVar.a = true;
        cetx l = cety.l();
        l.c(3);
        l.f(poa.EXPONENTIAL);
        ((ceti) l).a = pohVar.a();
        l.b(cevc.WORKMANAGER_ONLY);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IcingIndexRebuildSingleWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cbtd.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cbtd cbtdVar = (cbtd) eyhsVar;
        if (cbtdVar.d <= cbtdVar.e) {
            final long intValue = ((Integer) cful.K.e()).intValue();
            final long j = cbtdVar.d;
            final long j2 = j + intValue;
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cbrm.h, Integer.valueOf(cbtdVar.b));
            enszVar.Y(cbrm.m, Long.valueOf(j));
            enszVar.Y(cbrm.n, Long.valueOf(j2));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 115, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild runs on a table.");
            return elfo.g(new Callable() { // from class: cbtt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cbua.this.e.o(cbtdVar.b, j, j2);
                }
            }, this.g).i(new eroh() { // from class: cbtu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    elfl d;
                    cbtd cbtdVar2 = cbtdVar;
                    Set set = (Set) obj;
                    if (set == null || set.isEmpty()) {
                        return elfo.d(new IllegalStateException("No data to index for table type: " + cbtdVar2.b));
                    }
                    cbua cbuaVar = cbua.this;
                    ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                    int i = cbtdVar2.b;
                    Stream map = Collection.EL.stream(set).map(new Function() { // from class: cbtx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((Long) obj2).toString();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i2 = engw.d;
                    engw engwVar = (engw) map.collect(endq.a);
                    if (i == 1) {
                        d = ((cbrn) cbuaVar.c.b()).d((List) Collection.EL.stream(engwVar).map(new Function() { // from class: cbty
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return bdhb.b((String) obj2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: cbtz
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        })));
                    } else if (i == 2) {
                        d = ((cbrn) cbuaVar.c.b()).b(engw.n((java.util.Collection) Collection.EL.stream(engwVar).map(new bdgl()).collect(Collectors.toCollection(new bdgm()))));
                    } else if (i == 3) {
                        d = ((cbrn) cbuaVar.c.b()).e(engwVar);
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Unknown table type while updating index asynchronously.");
                        }
                        d = ((cbrn) cbuaVar.c.b()).c(engwVar);
                    }
                    listenableFutureArr[0] = d;
                    final Long valueOf = Long.valueOf(cbtdVar2.f);
                    listenableFutureArr[1] = cbuaVar.f.a().h(new emwl() { // from class: cbts
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(valueOf.equals((Long) obj2));
                        }
                    }, cbuaVar.b);
                    return elfo.b(listenableFutureArr);
                }
            }, this.g).h(new emwl() { // from class: cbtv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    list.getClass();
                    emxf.a(list.size() == 2);
                    boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
                    boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
                    cbtd cbtdVar2 = cbtd.this;
                    if (!booleanValue2) {
                        ensz enszVar2 = (ensz) cbua.a.j();
                        enszVar2.Y(cbrm.h, Integer.valueOf(cbtdVar2.b));
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 144, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild job is outdated. Stops the job without retry.");
                        return ceyt.k();
                    }
                    if (!booleanValue) {
                        ensz enszVar3 = (ensz) cbua.a.j();
                        enszVar3.Y(cbrm.h, Integer.valueOf(cbtdVar2.b));
                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 152, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild failing on updating index. Retry later.");
                        return ceyt.m();
                    }
                    long j3 = intValue;
                    ceys h = ceyt.h();
                    cbtc cbtcVar = (cbtc) cbtdVar2.toBuilder();
                    long j4 = cbtdVar2.d + j3;
                    cbtcVar.copyOnWrite();
                    ((cbtd) cbtcVar.instance).d = j4;
                    ((cetn) h).a = engw.r(cbub.a((cbtd) cbtcVar.build()));
                    h.b(true);
                    h.c(true);
                    return h.a();
                }
            }, this.b).e(Throwable.class, new emwl() { // from class: cbtw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = cbua.a;
                    return ceyt.m();
                }
            }, erpp.a);
        }
        entd entdVar = a;
        ensz enszVar2 = (ensz) entdVar.h();
        enszVar2.Y(cbrm.h, Integer.valueOf(cbtdVar.b));
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 99, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild completed for a table.");
        cbtp cbtpVar = this.h;
        long j3 = cbtdVar.f;
        synchronized (cbtpVar.a) {
            if (j3 != cbtpVar.d) {
                cbtpVar.b.a(5, Long.toString(j3));
            } else {
                int i = cbtpVar.c - 1;
                cbtpVar.c = i;
                if (i == 0) {
                    cbtpVar.b.a(4, Long.toString(j3));
                    ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildSingleWorkHandler", "processPendingWorkItemAsync", 102, "IcingIndexRebuildSingleWorkHandler.java")).q("Icing index rebuild job is fully completed.");
                }
            }
        }
        return elfo.e(ceyt.i());
    }
}
