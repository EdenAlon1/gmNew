package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyi implements ejuh, ayhb, crgg {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper");
    public final ffbr b;
    public final errl c;
    public final azei e;
    public final azei f;
    public final ffbr g;
    public final ConversationIdType h;
    public final ejvp i;
    public final AtomicInteger j;
    public final cqoh k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final azaw o;
    public final ffbr p;
    private final emyl r;
    private final ffbr s;
    private final errl t;
    private final lkk u;
    private final ejvb v;
    private final ffbr x;
    private final AtomicReference y;
    public final Object d = new Object();
    private final erqa w = new erqa();
    public ejug q = ejug.a;

    public tyi(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, azei azeiVar, azei azeiVar2, ffbr ffbrVar3, ejvb ejvbVar, cqoh cqohVar, ejvp ejvpVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, azaw azawVar, ffbr ffbrVar8, ffbr ffbrVar9, final lkk lkkVar, final ConversationIdType conversationIdType, final int i) {
        this.s = ffbrVar2;
        this.l = ffbrVar4;
        this.o = azawVar;
        this.p = ffbrVar5;
        this.n = ffbrVar7;
        this.m = ffbrVar6;
        this.b = ffbrVar9;
        this.y = new AtomicReference(((crgh) ffbrVar.b()).d());
        this.c = errlVar;
        this.t = errlVar2;
        this.u = lkkVar;
        this.e = azeiVar;
        this.f = azeiVar2;
        this.g = ffbrVar3;
        this.h = conversationIdType;
        this.v = ejvbVar;
        this.i = ejvpVar;
        this.j = new AtomicInteger(i);
        this.k = cqohVar;
        this.x = ffbrVar8;
        this.r = emys.a(new emyl() { // from class: tyd
            @Override // defpackage.emyl
            public final Object get() {
                ensk h = tyi.a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "unlatchAndFetchCapabilitiesDataSource", 240, "RcsCapabilitiesDataSourceWrapper.java")).r("UCC Data Source created with subId=%d.", i);
                final tyi tyiVar = tyi.this;
                final ConversationIdType conversationIdType2 = conversationIdType;
                emyq emyqVar = new emyq(new emwl() { // from class: tya
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Optional map = ((Optional) obj).map(new Function() { // from class: txw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return engw.r((aoku) obj2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i2 = engw.d;
                        return (Iterable) map.orElse(enou.a);
                    }
                }, emys.a(new emyl() { // from class: txz
                    @Override // defpackage.emyl
                    public final Object get() {
                        bvvn e = ParticipantsTable.e();
                        e.z("createOtherParticipantDestinationQuery");
                        e.e(new Function() { // from class: txr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvtg bvtgVar = (bvtg) obj;
                                return new bvth[]{bvtgVar.f, bvtgVar.g, bvtgVar.z};
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final ConversationIdType conversationIdType3 = conversationIdType2;
                        e.h(new Function() { // from class: txs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                bvvwVar.w(-2);
                                bvvwVar.l(txt.a(ConversationIdType.this));
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvti bvtiVar = (bvti) e.b().o();
                        tyi tyiVar2 = tyi.this;
                        try {
                            if (bvtiVar.moveToFirst()) {
                                String s = bvtiVar.s();
                                cskc cskcVar = cpdg.a;
                                if (!aoqw.h(s) && bvtiVar.e() != 1) {
                                    Optional ofNullable = Optional.ofNullable(bvtiVar.r());
                                    final aolr aolrVar = (aolr) tyiVar2.n.b();
                                    aolrVar.getClass();
                                    Optional map = ofNullable.map(new Function() { // from class: tye
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return aolr.this.n((String) obj);
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bvtiVar.close();
                                    return map;
                                }
                            }
                            bvtiVar.close();
                            return Optional.empty();
                        } catch (Throwable th) {
                            try {
                                bvtiVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }));
                akfs akfsVar = (akfs) tyiVar.m.b();
                avov avovVar = new avov((cvlf) akfsVar.a.b.bg.b(), akfsVar.a.a.b.bv(), conversationIdType2);
                akft akftVar = (akft) tyiVar.b.b();
                tyb tybVar = new tyb(tyiVar);
                return new ejuu(new avpd((azei) akftVar.a.a.a.gd.b(), (ejvp) akftVar.a.a.aR.b(), (ffsk) akftVar.a.a.a.q.b(), (cqoh) akftVar.a.a.cz.b(), tyiVar.o, avovVar, tybVar, emyqVar, lkkVar), new emwl() { // from class: tyc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        enhk enhkVar = (enhk) obj;
                        if (enhkVar == null || enhkVar.isEmpty()) {
                            return Optional.empty();
                        }
                        tyi tyiVar2 = tyi.this;
                        return Optional.of(((aqgi) tyiVar2.l.b()).b(Collection.EL.stream(enhkVar.values()).findAny(), tyiVar2.d()));
                    }
                }, tyiVar.c);
            }
        });
        lkkVar.c(new tyh(this));
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#RcsCapabilitiesDataSourceWrapper#LoadData");
        try {
            erph e = ((ejuh) this.r.get()).a().e(eldl.g(new erow() { // from class: tyf
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    ejug ejugVar;
                    ejug ejugVar2 = (ejug) obj;
                    tyi tyiVar = tyi.this;
                    synchronized (tyiVar.d) {
                        if (ejugVar2.f()) {
                            tyiVar.q = ejug.a((Optional) ejugVar2.e(), tyiVar.k.f());
                        }
                        ejugVar = tyiVar.q;
                    }
                    return ejugVar;
                }
            }), this.c);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        elfl h;
        ekzz f = eleg.f("MessageDataSource#RcsCapabilitiesDataSourceWrapper#FetchAndStoreData");
        try {
            final int d = d();
            if (d < 0) {
                synchronized (this.d) {
                    this.q = ejug.a(Optional.empty(), this.k.f());
                    ensk h2 = a.h();
                    h2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "fetchAndStoreData", 175, "RcsCapabilitiesDataSourceWrapper.java")).r("fetchAndStoreData called with subId=%d", d);
                }
                h = elfo.e(null);
            } else {
                final ejuh ejuhVar = (ejuh) this.r.get();
                ejvb ejvbVar = this.v;
                ListenableFuture b = ejuhVar.b();
                ejvbVar.a.a(b, ejuhVar.c());
                h = elfl.g(erny.f(b, new emwn(null), erpp.a)).i(new eroh() { // from class: tyg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ejuh.this.a().g();
                    }
                }, this.c).h(new emwl() { // from class: txx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        tyi tyiVar = tyi.this;
                        Object obj2 = tyiVar.d;
                        int i = d;
                        ejug ejugVar = (ejug) obj;
                        synchronized (obj2) {
                            ensk h3 = tyi.a.h();
                            h3.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "fetchAndStoreData", 186, "RcsCapabilitiesDataSourceWrapper.java")).r("fetchAndStoreData updating cache result with subId: %d", i);
                            tyiVar.q = ejugVar;
                        }
                        return null;
                    }
                }, this.c);
                f.b(h);
            }
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return "rcs_capabilities";
    }

    public final int d() {
        int i = this.j.get();
        if (i >= 0 || !((asrb) this.s.b()).a()) {
            return i;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.t, Integer.valueOf(i));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "getCurrentlySelectedSubId", 232, "RcsCapabilitiesDataSourceWrapper.java")).q("Coercing invalid subId to the system default");
        return ((ctwb) this.x.b()).f();
    }

    @Override // defpackage.crgg
    public final void e(crgf crgfVar) {
        this.y.set(crgfVar.f);
        this.i.b(elfo.e(null), "rcs_capabilities");
    }

    @Override // defpackage.ayhb
    public final void f(final SelfIdentityId selfIdentityId, final int i) {
        ekzz f = eleg.f("MessageDataSource#RcsCapabilitiesDataSourceWrapper#UpdateSubId");
        try {
            ListenableFuture a2 = this.w.a(eldl.m(new Callable() { // from class: txy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    tyi tyiVar = tyi.this;
                    AtomicInteger atomicInteger = tyiVar.j;
                    int i2 = i;
                    atomicInteger.set(i2);
                    ensk h = tyi.a.h();
                    h.Y(ente.a, "Bugle");
                    enrr enrrVar = (enrr) ((enrr) h).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "notifyRemoteStateChange", 316, "RcsCapabilitiesDataSourceWrapper.java");
                    SelfIdentityId selfIdentityId2 = selfIdentityId;
                    enrrVar.B("notifyRemoteStateChange called with selfId: %s and subId: %d", selfIdentityId2, i2);
                    tyiVar.i.b(elfo.e(null), "rcs_capabilities");
                    ensk e = tyi.a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "updateCurrentSubIdInDatabase", 321, "RcsCapabilitiesDataSourceWrapper.java")).D("Updating conversation %s entry with selfId = %s", tyiVar.h.a(), selfIdentityId2);
                    ((bczy) tyiVar.g.b()).al(tyiVar.h, selfIdentityId2);
                    return null;
                }
            }), this.t);
            f.b(a2);
            axnw.h(a2);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
