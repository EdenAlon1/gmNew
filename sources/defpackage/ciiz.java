package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciiz implements ciio {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl");
    public final chhw b;
    public final cgwn c;
    public final Map d;
    public final akzt e;
    public final cnq f;
    public final errl g;
    public final chga h;
    public final cqoh i;
    private final Map j;
    private final ffbr k;
    private final ffsk l;

    public ciiz(Map map, Map map2, chga chgaVar, errm errmVar, ffsk ffskVar, cqoh cqohVar, akzt akztVar, ffbr ffbrVar, chhw chhwVar, cgwn cgwnVar) {
        new AtomicReference();
        this.f = new cnq(100);
        this.b = chhwVar;
        this.c = cgwnVar;
        this.d = map;
        this.j = map2;
        this.h = chgaVar;
        this.g = errmVar;
        this.l = ffskVar;
        this.i = cqohVar;
        this.e = akztVar;
        this.k = ffbrVar;
        for (fbzs fbzsVar : map.keySet()) {
            ensk g = a.g();
            g.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "<init>", 116, "InboxMessageDispatcherImpl.java")).r("InboxMessageDispatcherImpl: Registered InboxMessageHandler type: %d", fbzsVar.a());
        }
    }

    @Override // defpackage.ciio
    public final elfl a(final fbzt fbztVar) {
        ffss a2;
        ekzz f = eleg.f("InboxMessageDispatcherImpl::handleInboxMessage");
        try {
            azah azahVar = (azah) this.k.b();
            Map map = this.j;
            fbzs b = fbzs.b(fbztVar.d);
            if (b == null) {
                b = fbzs.UNRECOGNIZED;
            }
            String a3 = ((ayzt) Map.EL.getOrDefault(map, b, new ayzt() { // from class: ciip
                @Override // defpackage.ayzt
                public final String a(Object obj) {
                    return "default key for parallel execution";
                }
            })).a(fbztVar);
            ffsk ffskVar = this.l;
            azag azagVar = new azag(new erog() { // from class: ciiq
                /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 431
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ciiq.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, null);
            if (ffkj.e(a3, "default key for parallel execution")) {
                ffhe ffheVar = ffhe.a;
                a2 = ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new azaf(azagVar, null));
            } else {
                ConcurrentHashMap concurrentHashMap = azahVar.a;
                final ffji ffjiVar = new ffji() { // from class: azad
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((String) obj).getClass();
                        return new emar();
                    }
                };
                Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, a3, new Function() { // from class: azae
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                computeIfAbsent.getClass();
                a2 = emau.a(ffskVar, (emar) computeIfAbsent, azagVar);
            }
            elfl i = axol.a(a2).i(new eroh() { // from class: ciir
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    fbzt fbztVar2 = fbztVar;
                    Boolean bool = (Boolean) obj;
                    String str = fbztVar2.c;
                    ensk h = ciiz.a.h();
                    h.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "handleInboxMessageWithinSpan", 156, "InboxMessageDispatcherImpl.java")).D("InboxMessageDispatcherImpl: Handled message messageId: %s shouldAck: %s", str, bool);
                    if (!bool.booleanValue()) {
                        return elfo.e(null);
                    }
                    fcek fcekVar = fbztVar2.i;
                    if (fcekVar == null) {
                        fcekVar = fcek.a;
                    }
                    fbzr b2 = fbzr.b(fbztVar2.k);
                    if (b2 == null) {
                        b2 = fbzr.UNRECOGNIZED;
                    }
                    return ciiz.this.c(str, fcekVar, b2);
                }
            }, this.g);
            f.b(i);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ciio
    public final boolean b(engi engiVar) {
        LinkedHashMap linkedHashMap;
        synchronized (this.f) {
            cnq cnqVar = this.f;
            synchronized (cnqVar.b) {
                linkedHashMap = new LinkedHashMap(cnqVar.a.c().size());
                for (Map.Entry entry : cnqVar.a.c()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap.keySet().containsAll(engiVar);
    }

    public final elfl c(final String str, final fcek fcekVar, final fbzr fbzrVar) {
        return this.c.k().i(new eroh() { // from class: ciis
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fcdu fcduVar = (fcdu) obj;
                if (fbzr.EPHEMERAL.equals(fbzrVar)) {
                    return elfo.e(null);
                }
                fcek fcekVar2 = fcekVar;
                final String str2 = str;
                ciiz ciizVar = ciiz.this;
                fcff fcffVar = (fcff) fcfg.a.createBuilder();
                fcffVar.copyOnWrite();
                fcfg fcfgVar = (fcfg) fcffVar.instance;
                str2.getClass();
                fcfgVar.c = str2;
                fcffVar.copyOnWrite();
                fcfg fcfgVar2 = (fcfg) fcffVar.instance;
                fcekVar2.getClass();
                fcfgVar2.d = fcekVar2;
                fcfgVar2.b |= 1;
                fcfg fcfgVar3 = (fcfg) fcffVar.build();
                ensk g = ciiz.a.g();
                g.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequest", 315, "InboxMessageDispatcherImpl.java")).t("InboxMessageDispatcherImpl: acking message messageId: %s", str2);
                String j = ciizVar.c.j();
                fbyf fbyfVar = (fbyf) fbyg.a.createBuilder();
                fbyfVar.a(fcfgVar3);
                fcfn a2 = ciizVar.h.a(j);
                eyee eyeeVar = fcduVar.b;
                a2.copyOnWrite();
                fcfo fcfoVar = (fcfo) a2.instance;
                fcfo fcfoVar2 = fcfo.a;
                eyeeVar.getClass();
                fcfoVar.f = eyeeVar;
                fbyfVar.copyOnWrite();
                fbyg fbygVar = (fbyg) fbyfVar.instance;
                fcfo fcfoVar3 = (fcfo) a2.build();
                fcfoVar3.getClass();
                fbygVar.c = fcfoVar3;
                fbygVar.b |= 1;
                return ciizVar.b.a((fbyg) fbyfVar.build()).h(new emwl() { // from class: ciiy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ensk h = ciiz.a.h();
                        h.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequest", 328, "InboxMessageDispatcherImpl.java")).t("InboxMessageDispatcherImpl: Acked message messageId: %s", str2);
                        return null;
                    }
                }, erpp.a);
            }
        }, this.g).e(Throwable.class, new emwl() { // from class: ciix
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j = ciiz.a.j();
                j.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) ((enrr) j).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequestCatchingThrowable", 285, "InboxMessageDispatcherImpl.java")).D("InboxMessageDispatcherImpl: Failed to ack message messageId: %s messageClass: %s", str, fbzrVar);
                return null;
            }
        }, erpp.a);
    }
}
