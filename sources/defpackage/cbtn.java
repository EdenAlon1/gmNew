package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtn extends ceuj {
    public static final entd a = entd.c("BugleJobs");
    public final cbpl b;
    public final cbth c;
    public final errl d;
    public final errl e;
    public final cbtp f;
    public final cbta g;

    public cbtn(cbpl cbplVar, cbth cbthVar, errl errlVar, errl errlVar2, cbtp cbtpVar, cbta cbtaVar) {
        this.b = cbplVar;
        this.c = cbthVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.f = cbtpVar;
        this.g = cbtaVar;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        poh pohVar = new poh();
        pohVar.d = true;
        pohVar.c = true;
        pohVar.b = true;
        pohVar.a = true;
        cetx l = cety.l();
        l.c(3);
        l.d(10);
        l.f(poa.EXPONENTIAL);
        ((ceti) l).a = pohVar.a();
        l.b(cevc.WORKMANAGER_ONLY);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IcingIndexRebuildHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, engw engwVar) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cbrm.g, "IcingIndexRebuildHandler");
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildHandler", "processPendingWorkItemAsync", 85, "IcingIndexRebuildHandler.java")).q("Icing index rebuild job starts.");
        return this.c.a().i(new eroh() { // from class: cbti
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Long l = (Long) obj;
                if (l == null) {
                    return elfo.d(new NullPointerException("Couldn't get last index rebuild version."));
                }
                cbtn cbtnVar = cbtn.this;
                final long longValue = l.longValue() + 1;
                return elfl.g(cbtnVar.c.a.b(new emwl() { // from class: cbte
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cbtq cbtqVar = (cbtq) ((cbtr) obj2).toBuilder();
                        cbtqVar.copyOnWrite();
                        ((cbtr) cbtqVar.instance).b = longValue;
                        return (cbtr) cbtqVar.build();
                    }
                }, erpp.a)).h(new emwl() { // from class: cbtf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Long.valueOf(longValue);
                    }
                }, erpp.a);
            }
        }, this.e).i(new eroh() { // from class: cbtj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Long l = (Long) obj;
                if (l == null) {
                    return elfo.d(new NullPointerException("Couldn't set next index rebuild version."));
                }
                int i = engw.d;
                engr engrVar = new engr();
                engrVar.h(Pair.create(1, engw.r("internal.3p:Message_no_gsa")));
                engrVar.h(Pair.create(3, engw.r("internal.3p:Person_no_gsa")));
                engrVar.h(Pair.create(2, engw.r("internal.3p:Conversation_no_gsa")));
                if (((Boolean) cful.I.e()).booleanValue()) {
                    engrVar.h(Pair.create(4, engw.s("internal.3p:DigitalDocument_no_gsa", "internal.3p:LocalBusiness_no_gsa")));
                }
                final cbtn cbtnVar = cbtn.this;
                engw g = engrVar.g();
                cbtp cbtpVar = cbtnVar.f;
                long longValue = l.longValue();
                int i2 = ((enou) g).c;
                synchronized (cbtpVar.a) {
                    cbtpVar.c = i2;
                    cbtpVar.d = longValue;
                }
                cbtnVar.g.a(2, Long.toString(l.longValue()));
                engr engrVar2 = new engr();
                enqv it = g.iterator();
                while (it.hasNext()) {
                    final Pair pair = (Pair) it.next();
                    engrVar2.h(elfo.g(new Callable() { // from class: cbtl
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(cbtn.this.b.a(((Integer) pair.first).intValue()));
                        }
                    }, cbtnVar.e).h(new emwl() { // from class: cbtm
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Long l2 = (Long) obj2;
                            entd entdVar = cbtn.a;
                            cbtc cbtcVar = (cbtc) cbtd.a.createBuilder();
                            long longValue2 = l2 == null ? 0L : l2.longValue();
                            Long l3 = l;
                            Pair pair2 = pair;
                            cbtcVar.copyOnWrite();
                            ((cbtd) cbtcVar.instance).e = longValue2;
                            int intValue = ((Integer) pair2.first).intValue();
                            cbtcVar.copyOnWrite();
                            ((cbtd) cbtcVar.instance).b = intValue;
                            cbtcVar.copyOnWrite();
                            ((cbtd) cbtcVar.instance).d = 0L;
                            long longValue3 = l3.longValue();
                            cbtcVar.copyOnWrite();
                            ((cbtd) cbtcVar.instance).f = longValue3;
                            Iterable iterable = (Iterable) pair2.second;
                            cbtcVar.copyOnWrite();
                            cbtd cbtdVar = (cbtd) cbtcVar.instance;
                            eygr eygrVar = cbtdVar.c;
                            if (!eygrVar.c()) {
                                cbtdVar.c = eyfy.mutableCopy(eygrVar);
                            }
                            eydl.addAll(iterable, cbtdVar.c);
                            return (cbtd) cbtcVar.build();
                        }
                    }, cbtnVar.d));
                }
                return elfo.a(engrVar2.g());
            }
        }, this.e).h(new emwl() { // from class: cbtk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw g;
                List list = (List) obj;
                ceys h = ceyt.h();
                if (list == null) {
                    ensz enszVar2 = (ensz) cbtn.a.j();
                    enszVar2.Y(cbrm.g, "IcingIndexRebuildHandler");
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexRebuildHandler", "createIndexingWorkQueueRequests", 179, "IcingIndexRebuildHandler.java")).q("Couldn't get lastIds from the tables.");
                    int i = engw.d;
                    g = enou.a;
                } else {
                    int i2 = engw.d;
                    engr engrVar = new engr();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        engrVar.h(cbub.a((cbtd) it.next()));
                    }
                    g = engrVar.g();
                }
                ((cetn) h).a = g;
                h.c(false);
                h.b(true);
                return h.a();
            }
        }, this.d);
    }
}
