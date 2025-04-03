package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfhx implements cfgy {
    public static final cskc a = cskc.g("BugleWorkQueue", "WorkQueueWorkerImpl");
    static final cfva b = cfvl.q(151866670);
    public final ffbr c;
    public final errl d;
    public final errm e;
    public final dtuu f;
    public final fazb g;
    public final cexg h;
    public final cqoh i;
    public final cfyt k;
    public final albq l;
    public final cfbt m;
    public final avdv n;
    final ceug o;
    public final Executor j = erpp.a;
    private final Map p = DesugarCollections.synchronizedMap(new HashMap());

    public cfhx(ffbr ffbrVar, errl errlVar, errm errmVar, dtuu dtuuVar, fazb fazbVar, cexg cexgVar, cqoh cqohVar, cfyt cfytVar, albq albqVar, cfbt cfbtVar, avdv avdvVar) {
        this.c = ffbrVar;
        this.d = errlVar;
        this.e = errmVar;
        this.f = dtuuVar;
        this.g = fazbVar;
        this.h = cexgVar;
        this.i = cqohVar;
        this.k = cfytVar;
        this.l = albqVar;
        this.m = cfbtVar;
        this.n = avdvVar;
        this.o = new ceug(dtuuVar);
    }

    public static int d(engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: cfhn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((ceze) obj).l());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return ((engw) map.collect(endq.a)).hashCode();
    }

    @Override // defpackage.cfgy
    public final elfl a(final String str, final cevi ceviVar) {
        cetl cetlVar = (cetl) ceviVar;
        final int a2 = ((ceww) this.c.b()).a(cetlVar.a);
        csjb d = a.d();
        d.I("startWork");
        d.A("src", str);
        d.A("queue", cetlVar.a);
        d.r();
        erqa erqaVar = (erqa) Map.EL.computeIfAbsent(this.p, cetlVar.a, new Function() { // from class: cfhb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = cfhx.a;
                return new erqa();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cfba a3 = cfbf.a();
        a3.z("WorkQueueWorkerImpl#startWork");
        a3.e(new Function() { // from class: cfhc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfbe cfbeVar = (cfbe) obj;
                cfbeVar.g(((cetl) ceviVar).a);
                cfbeVar.f(new Date(cfhx.this.i.f().toEpochMilli()));
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cfae cfaeVar = cfbf.c;
        a3.d(new cfax(cfaeVar.j), new cfax(cfaeVar.a));
        a3.x(a2);
        final cfay b2 = a3.b();
        return elfl.g(erqaVar.b(eldl.c(new erog() { // from class: cfhd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final cfhx cfhxVar = cfhx.this;
                cfhxVar.o.d();
                final String str2 = str;
                final cevi ceviVar2 = ceviVar;
                final cfay cfayVar = b2;
                final int i = a2;
                return (ListenableFuture) cfhxVar.f.c("WorkQueueWorkerImpl.startWork", new emyl() { // from class: cfhf
                    @Override // defpackage.emyl
                    public final Object get() {
                        String str3 = ((cetl) ceviVar2).a;
                        return cfhx.this.f(str2, str3, cfayVar, i);
                    }
                });
            }
        }), this.d));
    }

    @Override // defpackage.cfgy
    public final elfl b(final String str, final String str2) {
        final int a2 = ((ceww) this.c.b()).a(str2);
        csjb d = a.d();
        d.I("startWork");
        d.A("src", str);
        d.A("queue", str2);
        d.r();
        erqa erqaVar = (erqa) Map.EL.computeIfAbsent(this.p, str2, new Function() { // from class: cfhs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = cfhx.a;
                return new erqa();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cfba a3 = cfbf.a();
        a3.z("WorkQueueWorkerImpl#startWork");
        a3.e(new Function() { // from class: cfht
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfbe cfbeVar = (cfbe) obj;
                cfbeVar.g(str2);
                cfbeVar.f(new Date(cfhx.this.i.f().toEpochMilli()));
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cfae cfaeVar = cfbf.c;
        a3.d(new cfax(cfaeVar.j), new cfax(cfaeVar.a));
        a3.x(a2);
        final cfay b2 = a3.b();
        return elfl.g(erqaVar.b(eldl.c(new erog() { // from class: cfhu
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final cfhx cfhxVar = cfhx.this;
                cfhxVar.o.d();
                final String str3 = str;
                final String str4 = str2;
                final cfay cfayVar = b2;
                final int i = a2;
                return (ListenableFuture) cfhxVar.f.c("WorkQueueWorkerImpl.startWork", new emyl() { // from class: cfhp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return cfhx.this.f(str3, str4, cfayVar, i);
                    }
                });
            }
        }), this.d));
    }

    @Override // defpackage.cfgy
    public final void c(final cetu cetuVar, final Pattern pattern) {
        final ceug ceugVar = this.o;
        ceugVar.c(new Runnable() { // from class: ceuf
            @Override // java.lang.Runnable
            public final void run() {
                cetu cetuVar2 = cetuVar;
                cetuVar2.b("PWQ Execution State:");
                ceug ceugVar2 = ceug.this;
                cett a2 = cetuVar2.a();
                try {
                    for (Map.Entry entry : ceugVar2.c.entrySet()) {
                        Pattern pattern2 = pattern;
                        if (pattern2 == null || pattern2.matcher(((ceuc) entry.getValue()).a).matches()) {
                            cetuVar2.b(String.valueOf(entry.getKey()) + " ==> " + String.valueOf(entry.getValue()));
                        }
                    }
                    a2.close();
                } catch (Throwable th) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    final ceyt e(final ceve ceveVar, final engw engwVar, final ceyt ceytVar, final ceub ceubVar) {
        this.o.d();
        return ceytVar.g() ? ceytVar : (ceyt) this.f.c("WorkQueueWorkerImpl#handleResultInner", new emyl() { // from class: cfhr
            @Override // defpackage.emyl
            public final Object get() {
                final cfhx cfhxVar = cfhx.this;
                boolean a2 = cfhxVar.n.a();
                Boolean valueOf = Boolean.valueOf(a2);
                final engw engwVar2 = engwVar;
                final ceub ceubVar2 = ceubVar;
                final ceyt ceytVar2 = ceytVar;
                final ceve ceveVar2 = ceveVar;
                emyl emylVar = new emyl() { // from class: cfhg
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emyl
                    public final Object get() {
                        ceyt ceytVar3;
                        ceub ceubVar3;
                        cfhx cfhxVar2;
                        csjb d = cfhx.a.d();
                        d.I("tranche execution complete");
                        engw engwVar3 = engwVar2;
                        d.y("trancheId", cfhx.d(engwVar3));
                        d.r();
                        int size = engwVar3.size();
                        int i = 0;
                        while (true) {
                            ceytVar3 = ceytVar2;
                            ceubVar3 = ceubVar2;
                            cfhxVar2 = cfhx.this;
                            if (i >= size) {
                                break;
                            }
                            final ceze cezeVar = (ceze) engwVar3.get(i);
                            if (cfhxVar2.o.g(cezeVar)) {
                                ceuc a3 = cfhxVar2.o.a(cezeVar);
                                if (!a3.d(ceub.CANCELLED)) {
                                    ceve ceveVar3 = ceveVar2;
                                    a3.c(ceubVar3);
                                    if (ceytVar3.e() || !ceytVar3.f() || cezeVar.k() + 1 >= ((cetj) ceveVar3.a()).d || ceubVar3 == ceub.CANCELLED) {
                                        String[] strArr = cfbf.a;
                                        cfau cfauVar = new cfau();
                                        cfauVar.f("WorkQueueWorkerImpl#handleResult#workqueue#delete");
                                        cfauVar.c(new Function() { // from class: cfhq
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                cfbe cfbeVar = (cfbe) obj;
                                                cskc cskcVar = cfhx.a;
                                                cfbeVar.c(ceze.this.l());
                                                return cfbeVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        if (cfauVar.d() == 0) {
                                            csjb e = cfhx.a.e();
                                            e.I("delete returned 0 for row");
                                            e.z("rowId", cezeVar.l());
                                            e.r();
                                        }
                                    } else {
                                        String[] strArr2 = cfbf.a;
                                        cfbc cfbcVar = new cfbc();
                                        cfbcVar.ap("WorkQueueResult#handleResult#workqueue#update");
                                        cfbcVar.a.put("attempts", Integer.valueOf(cezeVar.k() + 1));
                                        cfbcVar.c(cezeVar.l());
                                    }
                                    cfhxVar2.o.f(cezeVar, ceytVar3);
                                    cfhxVar2.m.b(cezeVar.l(), ceytVar3);
                                    if (ceubVar3 == ceub.CANCELLED) {
                                        a3.b();
                                        a3.a();
                                        ceveVar3.g();
                                    }
                                    cfhxVar2.o.e(cezeVar.l());
                                }
                            }
                            i++;
                        }
                        engw c = ceytVar3.c();
                        if (c != null) {
                            boolean z = ceytVar3.e() && ceubVar3 != ceub.CANCELLED;
                            int size2 = c.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ceyr ceyrVar = (ceyr) c.get(i2);
                                csjb d2 = cfhx.a.d();
                                d2.I("found add on");
                                d2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ceyrVar.d());
                                d2.B("skipping", !z);
                                d2.r();
                                if (z) {
                                    ((cevh) cfhxVar2.g.b()).a(ceyrVar);
                                }
                            }
                        }
                        csjb d3 = cfhx.a.d();
                        d3.I("tranche complete");
                        d3.y("trancheId", cfhx.d(engwVar3));
                        d3.r();
                        return (ceytVar3.e() || !ceytVar3.f()) ? ceytVar3 : ceyt.n();
                    }
                };
                valueOf.getClass();
                return (ceyt) (a2 ? cfhxVar.o.b(emylVar) : emylVar.get());
            }
        });
    }

    public final elfl f(final String str, final String str2, final cfay cfayVar, final int i) {
        return (elfl) this.o.b(new emyl() { // from class: cfha
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                enou enouVar;
                final cfhx cfhxVar = cfhx.this;
                ffbr ffbrVar = cfhxVar.c;
                final engw y = cfayVar.y();
                ceuu ceuuVar = new ceuu(cfhxVar.o, (ceww) ffbrVar.b());
                while (true) {
                    int i2 = ceuuVar.e;
                    enouVar = (enou) y;
                    if (i2 >= enouVar.c) {
                        break;
                    }
                    ceze cezeVar = (ceze) y.get(i2);
                    if (ceuuVar.h && !TextUtils.isEmpty(cezeVar.n())) {
                        break;
                    }
                    String str3 = ceuuVar.c;
                    if (str3 == null || str3.equals(cezeVar.r())) {
                        ceuuVar.f.h(cezeVar);
                        ceuuVar.e++;
                        ceuuVar.c = cezeVar.r();
                        ceuuVar.a.a(cezeVar).a = cezeVar.r();
                        int i3 = ceuuVar.g + 1;
                        ceuuVar.g = i3;
                        ceuuVar.h = true;
                        if (i3 >= ((cetj) ceuuVar.b.c(cezeVar.r()).a()).c || cezeVar.n() != null) {
                            ceuuVar.a(null);
                            if (cezeVar.n() != null) {
                                break;
                            }
                        }
                    } else {
                        ceuuVar.a(cezeVar.r());
                    }
                }
                if (ceuuVar.g > 0) {
                    ceuuVar.d.h(ceuuVar.f.g());
                }
                final String str4 = str2;
                engw g = ceuuVar.d.g();
                csjb d = cfhx.a.d();
                d.I("initiateExecution");
                d.A("queue", str4);
                d.y("rows", enouVar.c);
                enou enouVar2 = (enou) g;
                d.y("tranches", enouVar2.c);
                d.r();
                if (g.isEmpty()) {
                    return elfo.e(cfgx.NO_RETRY);
                }
                elfl e = elfo.e(ceyt.i());
                int i4 = enouVar2.c;
                int i5 = 0;
                elfl elflVar = e;
                int i6 = 0;
                while (i6 < i4) {
                    final engw engwVar = (engw) g.get(i6);
                    ceze cezeVar2 = (ceze) engwVar.get(i5);
                    cfhxVar.g(engwVar, ceub.SUBMITTED);
                    final ceve c = ((ceww) cfhxVar.c.b()).c(cezeVar2.r());
                    cetj cetjVar = (cetj) c.a();
                    eogt eogtVar = cetjVar.h;
                    akzw a2 = eogtVar != null ? cfhxVar.l.a("Bugle.DataModel.ActionBreakdown.Execution.Latency", eogtVar, String.valueOf(cezeVar2.l())) : null;
                    final cfhw cfhwVar = new cfhw(cfhxVar, cezeVar2, str, engwVar, c);
                    final Duration duration = cetjVar.i;
                    if (duration != null && duration.compareTo(Duration.ZERO) > 0) {
                        elflVar = elflVar.i(new eroh() { // from class: cfho
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                return cfhx.this.e.schedule(new eroi((ceyt) obj), duration.toMillis(), TimeUnit.MILLISECONDS);
                            }
                        }, erpp.a);
                    }
                    final elfl elflVar2 = elflVar;
                    final akzw akzwVar = a2;
                    elflVar = elflVar2.i(new eroh() { // from class: cfhh
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final ceyt ceytVar = (ceyt) obj;
                            final cfhx cfhxVar2 = cfhx.this;
                            final elfl elflVar3 = elflVar2;
                            final engw engwVar2 = engwVar;
                            Optional optional = (Optional) cfhxVar2.o.b(new emyl() { // from class: cfhk
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.emyl
                                public final Object get() {
                                    cfhx cfhxVar3 = cfhx.this;
                                    engw engwVar3 = engwVar2;
                                    if (cfhxVar3.n.a() && (elflVar3.isCancelled() || !cfhxVar3.o.g((ceze) engwVar3.get(0)))) {
                                        throw new CancellationException();
                                    }
                                    ceyt ceytVar2 = ceytVar;
                                    if (!ceytVar2.e() && ceytVar2.f()) {
                                        return Optional.of(ceyt.n());
                                    }
                                    if (ceytVar2.g()) {
                                        return Optional.of(ceyt.n());
                                    }
                                    if (cfhxVar3.o.a((ceze) engwVar3.get(0)).d(ceub.CANCELLED)) {
                                        return Optional.of(ceytVar2);
                                    }
                                    csjb d2 = cfhx.a.d();
                                    d2.I("executing tranche");
                                    d2.y("trancheId", cfhx.d(engwVar3));
                                    d2.A("queue", ((ceze) engwVar3.get(0)).q());
                                    d2.z("delay", cfhxVar3.i.f().toEpochMilli() - ((ceze) engwVar3.get(0)).m());
                                    d2.r();
                                    cfhxVar3.g(engwVar3, ceub.EXECUTING);
                                    return Optional.empty();
                                }
                            });
                            if (optional.isPresent()) {
                                return elfo.e((ceyt) optional.get());
                            }
                            final ceve ceveVar = c;
                            cqoh cqohVar = cfhxVar2.i;
                            ekzz b2 = ceveVar.b();
                            final long epochMilli = cqohVar.f().toEpochMilli();
                            cexg cexgVar = cfhxVar2.h;
                            synchronized (cexgVar.d) {
                                cexgVar.e.add(new cexf(cexgVar.b.f().toEpochMilli(), 6, new cexe(cexgVar, ceveVar, (Long[]) Collection.EL.stream(engwVar2).map(new Function() { // from class: cexa
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        cfva cfvaVar = cexg.a;
                                        return Long.valueOf(((ceze) obj2).l());
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).toArray(new IntFunction() { // from class: cexb
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i7) {
                                        cfva cfvaVar = cexg.a;
                                        return new Long[i7];
                                    }
                                }), null)));
                            }
                            final ceuw ceuwVar = cfhwVar;
                            elfl r = ceveVar.r(ceuwVar, engwVar2);
                            b2.b(r);
                            final elfl h = r.h(new emwl() { // from class: cfhl
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    ceyt ceytVar2 = (ceyt) obj2;
                                    csjb d2 = cfhx.a.d();
                                    d2.I("handler execution");
                                    engw engwVar3 = engwVar2;
                                    d2.y("trancheId", cfhx.d(engwVar3));
                                    ceve ceveVar2 = ceveVar;
                                    d2.A("handlerName", ceveVar2.e());
                                    d2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ((ceze) engwVar3.get(0)).r());
                                    cfhx cfhxVar3 = cfhx.this;
                                    d2.z("duration", cfhxVar3.i.f().toEpochMilli() - epochMilli);
                                    d2.y("attemptCount", ((cetk) ((cfhw) ceuwVar).b).c);
                                    d2.y("maxAttempts", ((cetj) ceveVar2.a()).d);
                                    d2.r();
                                    cexg cexgVar2 = cfhxVar3.h;
                                    synchronized (cexgVar2.d) {
                                        cexgVar2.e.add(new cexf(cexgVar2.b.f().toEpochMilli(), 7, new cexe(cexgVar2, ceveVar2, (Long[]) Collection.EL.stream(engwVar3).map(new Function() { // from class: cewy
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                cfva cfvaVar = cexg.a;
                                                return Long.valueOf(((ceze) obj3).l());
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).toArray(new IntFunction() { // from class: cewz
                                            @Override // java.util.function.IntFunction
                                            public final Object apply(int i7) {
                                                cfva cfvaVar = cexg.a;
                                                return new Long[i7];
                                            }
                                        }), ceytVar2)));
                                    }
                                    return ceytVar2;
                                }
                            }, cfhxVar2.e);
                            int size = engwVar2.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                final ceze cezeVar3 = (ceze) engwVar2.get(i7);
                                cfhxVar2.o.b(new emyl() { // from class: cfhe
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        ceze cezeVar4 = cezeVar3;
                                        cfhx cfhxVar3 = cfhx.this;
                                        if (cfhxVar3.n.a() && !cfhxVar3.o.g(cezeVar4)) {
                                            throw new CancellationException();
                                        }
                                        cfhxVar3.o.a(cezeVar4).c = h;
                                        return null;
                                    }
                                });
                            }
                            akzw akzwVar2 = akzwVar;
                            if (akzwVar2 == null) {
                                return h;
                            }
                            h.k(new cfhv(akzwVar2), erpp.a);
                            return h;
                        }
                    }, cfhxVar.d).e(Throwable.class, new emwl() { // from class: cfhi
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            engw engwVar2 = engwVar;
                            Throwable th = (Throwable) obj;
                            ceyt k = ceyt.k();
                            String r = ((ceze) engwVar2.get(0)).r();
                            boolean z = th instanceof CancellationException;
                            cfhx cfhxVar2 = cfhx.this;
                            if (z) {
                                csjb e2 = cfhx.a.e();
                                e2.I("got CancellationException");
                                e2.y("trancheId", cfhx.d(engwVar2));
                                e2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, r);
                                e2.r();
                                k = ceyt.m();
                            } else if (th instanceof TimeoutException) {
                                csjb e3 = cfhx.a.e();
                                e3.I("got TimeoutException");
                                e3.y("trancheId", cfhx.d(engwVar2));
                                e3.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, r);
                                e3.r();
                                k = ceyt.m();
                            } else {
                                csjb b2 = cfhx.a.b();
                                b2.I("got throwable executing work");
                                b2.y("trancheId", cfhx.d(engwVar2));
                                b2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, r);
                                b2.A("exception", th.getClass().getName());
                                b2.s(th);
                                if (((Boolean) cfhx.b.e()).booleanValue()) {
                                    cfhxVar2.k.b(th);
                                }
                            }
                            ceve ceveVar = c;
                            csjb e4 = cfhx.a.e();
                            e4.I(Log.getStackTraceString(th));
                            e4.r();
                            return cfhxVar2.e(ceveVar, engwVar2, k, ceub.COMPLETED);
                        }
                    }, cfhxVar.d).h(new emwl() { // from class: cfhj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return cfhx.this.e(c, engwVar, (ceyt) obj, ceub.COMPLETED);
                        }
                    }, cfhxVar.j);
                    i6++;
                    i5 = 0;
                }
                final int i7 = i;
                return elflVar.h(new emwl() { // from class: cfhm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ceyt ceytVar = (ceyt) obj;
                        csjb d2 = cfhx.a.d();
                        d2.I("completion");
                        d2.A("queue", str4);
                        d2.A("result", ceytVar);
                        d2.r();
                        if (ceytVar.e() || !ceytVar.f()) {
                            return ((enou) y).c == i7 ? cfgx.CONTINUE : cfgx.NO_RETRY;
                        }
                        return cfgx.RETRY;
                    }
                }, cfhxVar.j);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(engw engwVar, ceub ceubVar) {
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            this.o.a((ceze) engwVar.get(i)).c(ceubVar);
        }
    }
}
