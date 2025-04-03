package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cijy extends ceuj {
    public static final cskc a = cskc.g("BugleJobs", "DittoConversationRetryHandler");
    public final fazb b;
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    public final ffbr f;
    public final ffbr g;
    public final chww h;
    private final ffbr i;
    private final fazb j;
    private final ffbr k;
    private final fazb l;
    private final chqc m;
    private final errl n;

    public cijy(chww chwwVar, fazb fazbVar, ffbr ffbrVar, fazb fazbVar2, ffbr ffbrVar2, ffbr ffbrVar3, fazb fazbVar3, chqc chqcVar, ffbr ffbrVar4, errl errlVar, errl errlVar2, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.h = chwwVar;
        this.b = fazbVar;
        this.i = ffbrVar;
        this.j = fazbVar2;
        this.k = ffbrVar2;
        this.c = ffbrVar3;
        this.l = fazbVar3;
        this.m = chqcVar;
        this.d = ffbrVar4;
        this.e = errlVar;
        this.n = errlVar2;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.c(5);
        l.f(poa.EXPONENTIAL);
        l.g(TimeUnit.SECONDS.toMillis(((Integer) bzaq.f.e()).intValue()));
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DittoConversationRetryHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cila.a.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceuj
    public final elfl j(final ceuw ceuwVar, final engw engwVar) {
        elfl i;
        engw engwVar2 = ((cetk) ceuwVar.a()).d;
        int size = engwVar2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Integer) engwVar2.get(i2)).intValue() == 0) {
                ((akzt) this.d.b()).c("Bugle.Ditto.ConversationRetryHandler.Execution.Count");
            }
        }
        if (((bzef) this.j.b()).o()) {
            final fcek fcekVar = ((cila) engwVar.get(0)).c;
            if (fcekVar == null) {
                fcekVar = fcek.a;
            }
            if (!((bzgd) this.l.b()).w(fcekVar)) {
                a.m("Skipping retry because desktop is not active.");
                i = elfo.e(ceyt.k());
            } else if (((Optional) this.i.b()).isEmpty()) {
                a.r("DittoForegroundService is not supported on this device.");
                i = elfo.d(new UnsupportedOperationException("DittoForegroundService is not supported on this device."));
            } else {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                final erux eruxVar = (erux) eruy.a.createBuilder();
                int i3 = ((enou) engwVar).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    try {
                        erxi erxiVar = (erxi) eyfy.parseFrom(erxi.a, ((cila) engwVar.get(i4)).f, eyfc.a());
                        int i5 = erxiVar.b;
                        if (erxh.a(i5) == 3) {
                            Iterator<E> it = (i5 == 2 ? (eruy) erxiVar.c : eruy.a).b.iterator();
                            while (it.hasNext()) {
                                ConversationIdType b = bdgq.b(((erur) it.next()).c);
                                if (hashSet.add(b)) {
                                    final bcyk a2 = ((azwh) this.k.b()).a(b);
                                    if (a2 == null) {
                                        eruxVar.b(((cgzv) this.c.b()).k(b));
                                    } else {
                                        arrayList.add(this.m.b(a2.Q()).i(new eroh() { // from class: cijv
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj) {
                                                return ((cgzv) cijy.this.c.b()).e(a2, (engw) obj);
                                            }
                                        }, this.e));
                                    }
                                }
                            }
                        }
                    } catch (eygu e) {
                        a.o("Failed to parse GetUpdatesResponse while retrying conversation update.", e);
                    }
                }
                i = elfo.a(arrayList).h(new emwl() { // from class: cijt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final erux eruxVar2 = erux.this;
                        eruxVar2.getClass();
                        Iterable$EL.forEach((List) obj, new Consumer() { // from class: cijx
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                erux.this.b((erur) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return (eruy) eruxVar2.build();
                    }
                }, this.e).i(new eroh() { // from class: ciju
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        eruy eruyVar = (eruy) obj;
                        return ((Boolean) ((cfup) bzaq.o.get()).e()).booleanValue() ? ((chrr) cijy.this.f.b()).a(eruyVar) : elfo.e(eruyVar);
                    }
                }, this.e).i(new eroh() { // from class: cijw
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        chwv a3;
                        eruy eruyVar = (eruy) obj;
                        if (eruyVar.b.size() == 0) {
                            return elfo.e(ceyt.i());
                        }
                        final fcek fcekVar2 = fcekVar;
                        engw engwVar3 = engwVar;
                        cijy cijyVar = cijy.this;
                        final String str = ((cila) engwVar3.get(0)).e;
                        String str2 = ((cila) engwVar3.get(0)).o;
                        if (((cgcu) cijyVar.g.b()).a()) {
                            chwu b2 = cijyVar.h.b((cila) engwVar3.get(0), esaa.GET_UPDATES);
                            b2.c = str;
                            erxg erxgVar = (erxg) erxi.a.createBuilder();
                            erxgVar.copyOnWrite();
                            erxi erxiVar2 = (erxi) erxgVar.instance;
                            eruyVar.getClass();
                            erxiVar2.c = eruyVar;
                            erxiVar2.b = 2;
                            b2.b(erxgVar.build());
                            fbzr b3 = fbzr.b(((cila) engwVar3.get(0)).g);
                            if (b3 == null) {
                                b3 = fbzr.UNRECOGNIZED;
                            }
                            b2.i = b3;
                            b2.d = str2;
                            a3 = b2.a();
                        } else {
                            chwu c = cijyVar.h.c(fcekVar2, Optional.empty(), esaa.GET_UPDATES);
                            c.c = str;
                            erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                            erxgVar2.copyOnWrite();
                            erxi erxiVar3 = (erxi) erxgVar2.instance;
                            eruyVar.getClass();
                            erxiVar3.c = eruyVar;
                            erxiVar3.b = 2;
                            c.b(erxgVar2.build());
                            fbzr b4 = fbzr.b(((cila) engwVar3.get(0)).g);
                            if (b4 == null) {
                                b4 = fbzr.UNRECOGNIZED;
                            }
                            c.i = b4;
                            c.d = str2;
                            a3 = c.a();
                        }
                        elfl b5 = ((cikg) cijyVar.b.b()).b(a3);
                        a3.q(b5);
                        return b5.h(new emwl() { // from class: cijp
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                csjb a4 = cijy.a.a();
                                a4.I("Ditto Conversation Update RPC retry succeeded");
                                a4.A("desktopId", fcek.this);
                                a4.A("requestId", str);
                                a4.r();
                                return ceyt.i();
                            }
                        }, cijyVar.e).e(fedn.class, new emwl() { // from class: cijq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                fedn fednVar = (fedn) obj2;
                                boolean d = chfh.d(fednVar);
                                fcek fcekVar3 = fcek.this;
                                String str3 = str;
                                if (d) {
                                    csjb e2 = cijy.a.e();
                                    e2.I("Ditto Conversation Update RPC retry failed with retryable gRPC error");
                                    e2.A("status", Status.c(fednVar));
                                    e2.A("desktopId", fcekVar3);
                                    e2.A("requestId", str3);
                                    e2.r();
                                    return ceyt.m();
                                }
                                csjb e3 = cijy.a.e();
                                e3.I("Ditto Conversation Update RPC retry failed with non-retryable gRPC error");
                                e3.A("status", Status.c(fednVar));
                                e3.A("desktopId", fcekVar3);
                                e3.A("requestId", str3);
                                e3.r();
                                return ceyt.k();
                            }
                        }, cijyVar.e);
                    }
                }, this.n);
            }
        } else {
            a.m("Skipping retry because not registered.");
            i = elfo.e(ceyt.k());
        }
        return i.h(new emwl() { // from class: cijr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                boolean equals = ceytVar.equals(ceyt.i());
                cijy cijyVar = cijy.this;
                ceuw ceuwVar2 = ceuwVar;
                int i6 = 0;
                if (equals) {
                    engw engwVar3 = ((cetk) ceuwVar2.a()).d;
                    int size2 = engwVar3.size();
                    while (i6 < size2) {
                        ((akzt) cijyVar.d.b()).e("Bugle.Ditto.ConversationRetryHandler.Success.Count", ((Integer) engwVar3.get(i6)).intValue());
                        i6++;
                    }
                } else {
                    if (ceytVar.equals(ceyt.k())) {
                        cijyVar.k(ceuwVar2);
                        return ceytVar;
                    }
                    if (ceytVar.equals(ceyt.m())) {
                        while (i6 < ((enou) engwVar).c) {
                            if (!ceuwVar2.d(i6)) {
                                cijyVar.l(5);
                            }
                            i6++;
                        }
                    }
                }
                return ceytVar;
            }
        }, this.e).f(Exception.class, new eroh() { // from class: cijs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cijy.this.k(ceuwVar);
                return elfo.d((Exception) obj);
            }
        }, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(ceuw ceuwVar) {
        engw engwVar = ((cetk) ceuwVar.a()).d;
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            l(((Integer) engwVar.get(i)).intValue());
        }
    }

    public final void l(int i) {
        ((akzt) this.d.b()).e("Bugle.Ditto.ConversationRetryHandler.Failure.Count", i);
    }
}
