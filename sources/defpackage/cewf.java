package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cewf {
    public static final cskc a = cskc.g("BugleWorkQueue", "WorkQueueCancellationController");
    public final ejoc b;
    public final ceww c;
    public final ffsk d;
    public final emar e;
    private final dtuu f;
    private final cfbt g;
    private final cfjc h;
    private final cfhx i;

    public cewf(dtuu dtuuVar, cfgy cfgyVar, cfbt cfbtVar, cfjc cfjcVar, ejoc ejocVar, cfhx cfhxVar, ceww cewwVar, ffsk ffskVar, ffsk ffskVar2) {
        dtuuVar.getClass();
        cfgyVar.getClass();
        cfbtVar.getClass();
        cfjcVar.getClass();
        ejocVar.getClass();
        cfhxVar.getClass();
        cewwVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.f = dtuuVar;
        this.g = cfbtVar;
        this.h = cfjcVar;
        this.b = ejocVar;
        this.i = cfhxVar;
        this.c = cewwVar;
        this.d = ffskVar2;
        this.e = new emar();
    }

    public final int a(final String str, final String str2) {
        return ((List) this.f.c("cancelPendingByHandlerKeyAndTag", new emyl() { // from class: cevy
            @Override // defpackage.emyl
            public final Object get() {
                final String str3 = str;
                final String str4 = str2;
                ffji ffjiVar = new ffji() { // from class: cewb
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        cfbe cfbeVar = (cfbe) obj;
                        cfbeVar.getClass();
                        cfbeVar.j(str3);
                        int intValue = cfbf.c().intValue();
                        if (intValue < 48020) {
                            dtub.w("cancellation_tag", intValue);
                        }
                        cfbeVar.aq(new dtrt("work_queue.cancellation_tag", 1, str4));
                        return ffcu.a;
                    }
                };
                cewf cewfVar = cewf.this;
                List c = cewfVar.c(ffjiVar);
                csjb c2 = cewf.a.c();
                c2.I("Cancelled rows with handler and tag");
                c2.A("handlerKey", str3);
                c2.A("cancellationTag", str4);
                c2.y("itemCount", c.size());
                c2.r();
                ArrayList arrayList = new ArrayList(ffdx.n(c, 10));
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ceze) it.next()).q());
                }
                cewfVar.e(ffdx.ar(arrayList));
                cewfVar.d(c);
                return c;
            }
        })).size();
    }

    public final engw b(final String str, boolean z) {
        List list = (List) this.f.c("cancelAllPendingByHandlerKey", new emyl() { // from class: cevv
            @Override // defpackage.emyl
            public final Object get() {
                final String str2 = str;
                ffji ffjiVar = new ffji() { // from class: cewa
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        cfbe cfbeVar = (cfbe) obj;
                        cfbeVar.getClass();
                        cfbeVar.j(str2);
                        return ffcu.a;
                    }
                };
                cewf cewfVar = cewf.this;
                List c = cewfVar.c(ffjiVar);
                csjb c2 = cewf.a.c();
                c2.I("Cancelled rows with handler");
                c2.A("handlerKey", str2);
                c2.y("itemCount", c.size());
                c2.r();
                ArrayList arrayList = new ArrayList(ffdx.n(c, 10));
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ceze) it.next()).q());
                }
                cewfVar.e(ffdx.ar(arrayList));
                return c;
            }
        });
        list.getClass();
        d(list);
        if (z) {
            list.getClass();
            return engq.a(list);
        }
        int i = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        return engwVar;
    }

    public final List c(final ffji ffjiVar) {
        Collection values = ((Map) this.h.d.c()).values();
        ArrayList arrayList = new ArrayList(ffdx.n(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((cfir) it.next()).a().b);
        }
        Iterable iterable = ffel.a;
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                iterable = ffdx.ad((List) listIterator.previous(), iterable);
            }
        }
        String[] strArr = cfbf.a;
        cfau cfauVar = new cfau();
        cfauVar.f("cancelPending");
        cfauVar.c(new Function() { // from class: cevz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfbe cfbeVar = (cfbe) obj;
                cfbeVar.getClass();
                ffji.this.invoke(cfbeVar);
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final cfbd cfbdVar = (cfbd) cfauVar.b().b;
        engw engwVar = (engw) cfbf.b().r("work_queue-deleteAndReturnDeletedRows-txn", new emyl() { // from class: cezc
            @Override // defpackage.emyl
            public final Object get() {
                cfba a2 = cfbf.a();
                cfbd cfbdVar2 = cfbd.this;
                a2.k(cfbdVar2);
                a2.z("work_queue-deleteAndReturnDeletedRows-query");
                engw y = a2.b().y();
                cfau cfauVar2 = new cfau();
                cfauVar2.b = cfbdVar2;
                cfauVar2.f("work_queue-deleteAndReturnDeletedRows-delete");
                cfauVar2.b().b();
                return y;
            }
        });
        engwVar.getClass();
        return engwVar;
    }

    public final void d(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            final ceze cezeVar = (ceze) it.next();
            this.g.a(cezeVar.l());
            final ceug ceugVar = this.i.o;
            ceugVar.c(new Runnable() { // from class: cewc
                @Override // java.lang.Runnable
                public final void run() {
                    ceug ceugVar2 = ceug.this;
                    ceze cezeVar2 = cezeVar;
                    ceuc a2 = ceugVar2.a(cezeVar2);
                    ceugVar2.f(cezeVar2, ceyt.k());
                    ceugVar2.e(cezeVar2.l());
                    a2.b();
                    a2.a();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final Iterable iterable) {
        if (!this.f.i()) {
            throw new IllegalStateException("Check failed.");
        }
        cfba a2 = cfbf.a();
        a2.z("cancelScheduledWorkForEmptyQueues remaining items");
        a2.e(new Function() { // from class: cevw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfbe cfbeVar = (cfbe) obj;
                cfbeVar.h(iterable);
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.v(cfbf.c.f);
        a2.c(cfbf.c.f);
        engw y = a2.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(((ceze) it.next()).q());
        }
        final Set e = fffi.e(ffdx.ar(iterable), ffdx.ar(arrayList));
        if (e.isEmpty()) {
            return;
        }
        csjb c = a.c();
        c.I("Cancelling WorkManager associations");
        c.A("queues", e);
        c.r();
        String[] strArr = cfft.a;
        cffj cffjVar = new cffj();
        cffjVar.f("cancelScheduledWorkForEmptyQueues");
        cffjVar.c(new Function() { // from class: cevx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cffs cffsVar = (cffs) obj;
                cffsVar.c(e);
                return cffsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final cffr cffrVar = (cffr) cffjVar.b().b;
        engw engwVar = (engw) cfft.a().r("work_queue_work_manager_ids-deleteAndReturnDeletedRows-txn", new emyl() { // from class: cfdu
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = cfft.a;
                cffo cffoVar = new cffo(cfft.a);
                cffr cffrVar2 = cffr.this;
                cffoVar.k(cffrVar2);
                cffoVar.z("work_queue_work_manager_ids-deleteAndReturnDeletedRows-query");
                engw y2 = cffoVar.b().y();
                cffj cffjVar2 = new cffj();
                cffjVar2.b = cffrVar2;
                cffjVar2.f("work_queue_work_manager_ids-deleteAndReturnDeletedRows-delete");
                cffjVar2.b().b();
                return y2;
            }
        });
        engwVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it2 = engwVar.iterator();
        while (it2.hasNext()) {
            Optional k = ((cfdx) it2.next()).k();
            k.getClass();
            UUID uuid = (UUID) fflm.b(k);
            if (uuid != null) {
                arrayList2.add(uuid);
            }
        }
        axol.k(this.d, null, new cewe(arrayList2, this, null), 3);
    }
}
