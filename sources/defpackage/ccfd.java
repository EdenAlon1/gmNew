package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccfd implements ccdx {
    public final ccie c;
    public final ccpg d;
    public final axkm e;
    public final cbeq f;
    public final crty g;
    public final ecrj h;
    public final cdpx i;
    public final eisx j;
    public final ashm k;
    public final asio l;
    private final ffbr n;
    private final errl o;
    private final errl p;
    private final errl q;
    private final ffbr r;
    private final asik s;
    private final ayfy t;
    private final ffbr u;
    private final aszr v;
    private static final cskc m = cskc.g("BugleCms", "CmsConversationConsumer");
    static final ecda a = new ecda("RestoreInitialBlockTimer");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer");

    public ccfd(crty crtyVar, ccie ccieVar, ccpg ccpgVar, axkm axkmVar, cbeq cbeqVar, ffbr ffbrVar, errl errlVar, errl errlVar2, errl errlVar3, ecrj ecrjVar, cdpx cdpxVar, eisx eisxVar, ffbr ffbrVar2, asik asikVar, ashm ashmVar, ayfy ayfyVar, ffbr ffbrVar3, asio asioVar, aszr aszrVar) {
        this.c = ccieVar;
        this.g = crtyVar;
        this.d = ccpgVar;
        this.e = axkmVar;
        this.f = cbeqVar;
        this.n = ffbrVar;
        this.o = errlVar;
        this.p = errlVar2;
        this.q = errlVar3;
        this.h = ecrjVar;
        this.i = cdpxVar;
        this.j = eisxVar;
        this.r = ffbrVar2;
        this.s = asikVar;
        this.k = ashmVar;
        this.t = ayfyVar;
        this.u = ffbrVar3;
        this.l = asioVar;
        this.v = aszrVar;
    }

    public static void i(Exception exc) {
        csjb e = m.e();
        e.I("Exception was thrown during restoring messages immediately after conversation. The restore process will continue");
        e.s(exc);
    }

    private final int j() {
        axky axkyVar = this.e.c().C;
        if (axkyVar == null) {
            axkyVar = axky.a;
        }
        return axkyVar.h;
    }

    private static boolean k(int i) {
        return i == ((Integer) csgj.I.e()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ccdx
    public final elfl a(engw engwVar, final Optional optional, final boolean z) {
        if (engwVar.isEmpty()) {
            return this.v.a() ? elfo.g(new Callable() { // from class: ccel
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        ccfd.this.f.a();
                        return null;
                    } catch (RuntimeException e) {
                        ensk j = ccfd.b.j();
                        j.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreCmsItemDataList", (char) 284, "CmsConversationConsumer.java")).q("ParticipantFullRefresh failed.");
                        return null;
                    }
                }
            }, this.q).h(new emwl() { // from class: ccem
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return enoz.a;
                }
            }, this.p) : elfo.e(enoz.a);
        }
        if (!this.s.a()) {
            return g(engwVar, optional, z);
        }
        final enhd enhdVar = new enhd();
        elfl e = elfo.e(null);
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            final eswr eswrVar = (eswr) engwVar.get(i);
            eyja eyjaVar = eswrVar.l;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            if (eyjaVar.equals(eykm.c)) {
                enhdVar.k(eswrVar, new emxd(false, Optional.empty()));
            } else {
                e = e.i(new eroh() { // from class: ccep
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ccfd.this.f(eswrVar);
                    }
                }, this.q).h(new emwl() { // from class: cceq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Void r4 = (Void) obj;
                        enhd.this.k(eswrVar, new emxd(true, Optional.empty()));
                        return r4;
                    }
                }, erpp.a).e(Exception.class, new emwl() { // from class: ccer
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Exception exc = (Exception) obj;
                        ensk j = ccfd.b.j();
                        j.Y(ente.a, "BugleCms");
                        enrr enrrVar = (enrr) ((enrr) ((enrr) j).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "deleteConversationsIfNeeded", 668, "CmsConversationConsumer.java");
                        eswr eswrVar2 = eswr.this;
                        enrrVar.t("Failed to delete conversation %s", eswrVar2.c);
                        enhdVar.k(eswrVar2, new emxd(true, Optional.of(exc)));
                        return null;
                    }
                }, this.p);
            }
        }
        return e.h(new emwl() { // from class: cces
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return enhd.this.b();
            }
        }, erpp.a).i(new eroh() { // from class: ccen
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                int i2 = engw.d;
                engr engrVar = new engr();
                final enhd enhdVar2 = new enhd();
                enqu listIterator = ((enhk) obj).entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    eswr eswrVar2 = (eswr) entry.getKey();
                    emxd emxdVar = (emxd) entry.getValue();
                    if (!((Boolean) emxdVar.a).booleanValue()) {
                        engrVar.h(eswrVar2);
                    } else if (((Optional) emxdVar.b).isPresent()) {
                        enhdVar2.k(eswrVar2, (Exception) ((Optional) emxdVar.b).get());
                    }
                }
                boolean z2 = z;
                return ccfd.this.g(engrVar.g(), optional, z2).h(new emwl() { // from class: cceo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enhd enhdVar3 = enhd.this;
                        enhdVar3.g((enhk) obj2);
                        return enhdVar3.b();
                    }
                }, erpp.a);
            }
        }, this.q);
    }

    @Override // defpackage.ccdx
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // defpackage.ccdx
    public final boolean c() {
        return ((Boolean) ayhv.a.e()).booleanValue();
    }

    @Override // defpackage.ccdx
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        final eswr eswrVar = (eswr) obj;
        if (this.s.a()) {
            eyja eyjaVar = eswrVar.l;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            if (!eyjaVar.equals(eykm.c)) {
                return f(eswrVar);
            }
        }
        elfl a2 = this.c.a(eswrVar, true);
        if (((Boolean) ((cfup) csgj.U.get()).e()).booleanValue() && ((asif) this.r.b()).a()) {
            try {
                int j = j();
                if (this.l.a()) {
                    j++;
                }
                if (j == 0) {
                    this.h.e(a);
                } else if (k(j)) {
                    this.h.g(a, null, null, ecrh.SUCCESS);
                }
                if (this.k.a() && k(j)) {
                    try {
                        cdpx cdpxVar = this.i;
                        cdvx cdvxVar = cdvx.a;
                        cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
                        int a3 = this.j.a();
                        cdvwVar.copyOnWrite();
                        cdvx cdvxVar2 = (cdvx) cdvwVar.instance;
                        cdvxVar2.b = 1 | cdvxVar2.b;
                        cdvxVar2.c = a3;
                        cdpxVar.a((cdvx) cdvwVar.build());
                    } catch (Exception e) {
                        csjb e2 = m.e();
                        e2.I("Exception when queuing media download after top conversations restore, will continue restoring the rest of the messages.");
                        e2.s(e);
                    }
                }
                if (((Boolean) this.n.b()).booleanValue() && !((Boolean) ((cfup) csgj.U.get()).e()).booleanValue()) {
                    return a2;
                }
                if (((Boolean) ((cfup) csgj.U.get()).e()).booleanValue()) {
                    if (j >= ((Integer) csgj.I.e()).intValue()) {
                        return a2;
                    }
                }
            } catch (eygu e3) {
                csjb e4 = m.e();
                e4.I("Can't determine total conversations restored, skipping listConversationObjects task");
                e4.s(e3);
                return a2;
            }
        } else if (((Boolean) this.n.b()).booleanValue()) {
            return a2;
        }
        if (((ashl) this.u.b()).a()) {
            return a2.i(new eroh() { // from class: ccdz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    return ccfd.this.h(eswrVar, Optional.empty());
                }
            }, this.p);
        }
        return (this.s.a() ? a2.i(new eroh() { // from class: ccek
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ccfd.this.e.i();
            }
        }, this.p).i(new eroh() { // from class: ccev
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                boolean equals = ((eyja) obj2).equals(eykm.c);
                boolean z = false;
                if (((Boolean) ((cfup) csgj.U.get()).e()).booleanValue() && equals) {
                    z = true;
                }
                return ccfd.this.g.A(eswrVar.c, z);
            }
        }, this.o) : a2.i(new eroh() { // from class: ccew
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ccfd.this.g.z(eswrVar.c);
            }
        }, this.o)).i(new eroh() { // from class: ccex
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                Stream filter = Collection.EL.stream((engw) obj2).filter(new Predicate() { // from class: cceg
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
                    public final boolean test(Object obj3) {
                        return !teq.a((eszz) obj3);
                    }
                });
                final ccfd ccfdVar = ccfd.this;
                Stream map = filter.map(new Function() { // from class: cceh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        ccfd ccfdVar2 = ccfd.this;
                        eszz eszzVar = (eszz) obj3;
                        try {
                            boolean z = false;
                            if (csgj.a() && ((Boolean) ((cfup) csgj.o.get()).e()).booleanValue()) {
                                z = true;
                            }
                            return ccfdVar2.d.d(eszzVar, true, z).e(Exception.class, new emwl() { // from class: ccej
                                @Override // defpackage.emwl
                                public final Object apply(Object obj4) {
                                    ccfd.i((Exception) obj4);
                                    return null;
                                }
                            }, erpp.a);
                        } catch (Exception e5) {
                            ccfd.i(e5);
                            return elfo.e(null);
                        }
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return elfo.j((Iterable) map.collect(endq.a)).a(new Callable() { // from class: ccei
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, erpp.a);
            }
        }, this.o);
    }

    public final int e() {
        if (!((Boolean) ((cfup) csgj.U.get()).e()).booleanValue()) {
            return 0;
        }
        try {
            int j = j();
            Integer num = (Integer) csgj.I.e();
            if (j < num.intValue()) {
                return num.intValue() - j;
            }
            return 0;
        } catch (eygu e) {
            ensk j2 = b.j();
            j2.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "remainingTopConversationsWithMessages", (char) 535, "CmsConversationConsumer.java")).q("Can't determine total conversations restored, skipping listConversationObjects task");
            return 0;
        }
    }

    public final elfl f(eswr eswrVar) {
        bseh a2 = bsom.a(eswrVar.c);
        if (a2 == null) {
            return elfo.e(null);
        }
        ayfy ayfyVar = this.t;
        aygb f = aygc.f();
        f.b(a2.C());
        f.f(eoko.CONVERSATION_FROM_DELETION_DURING_CMS_RESTORE_D2D);
        return ayfyVar.a(f.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl g(final engw engwVar, final Optional optional, boolean z) {
        final engw engwVar2;
        elfl i;
        if (engwVar.isEmpty()) {
            return elfo.e(enoz.a);
        }
        if (!((Boolean) ((cfup) csgj.U.get()).e()).booleanValue()) {
            return this.c.b(engwVar, optional);
        }
        final int e = e();
        elfl elflVar = null;
        if (e <= 0) {
            engwVar2 = engwVar;
            engwVar = null;
        } else if (e < engwVar.size()) {
            engw subList = engwVar.subList(0, e);
            engwVar2 = engwVar.subList(e, engwVar.size());
            engwVar = subList;
        } else {
            engwVar2 = null;
        }
        final elfl e2 = elfo.e(enoz.a);
        if (engwVar != null) {
            if (engwVar.isEmpty()) {
                i = elfo.e(enoz.a);
            } else {
                if (z) {
                    this.h.e(a);
                }
                e2 = this.c.b(engwVar, optional);
                int size = engwVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    final eswr eswrVar = (eswr) engwVar.get(i2);
                    if (elflVar == null) {
                        elflVar = e2;
                    }
                    elflVar = elflVar.i(new eroh() { // from class: ccez
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final enhk enhkVar = (enhk) obj;
                            return ccfd.this.h(eswrVar, optional).h(new emwl() { // from class: ccey
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return enhk.this;
                                }
                            }, erpp.a);
                        }
                    }, this.p);
                }
                if (elflVar != null) {
                    i = elflVar.h(new emwl() { // from class: ccfa
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            enhk enhkVar = (enhk) obj;
                            ccfd ccfdVar = ccfd.this;
                            if (((ccfdVar.l.a() && ((Boolean) ((cfup) csgj.U.get()).e()).booleanValue()) ? e - (engwVar.size() - enhkVar.size()) : ccfdVar.e()) <= 0) {
                                ccfdVar.h.g(ccfd.a, null, null, ecrh.SUCCESS);
                                if (ccfdVar.k.a()) {
                                    try {
                                        cdpx cdpxVar = ccfdVar.i;
                                        cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
                                        int a2 = ccfdVar.j.a();
                                        cdvwVar.copyOnWrite();
                                        cdvx cdvxVar = (cdvx) cdvwVar.instance;
                                        cdvxVar.b |= 1;
                                        cdvxVar.c = a2;
                                        cdpxVar.a((cdvx) cdvwVar.build());
                                    } catch (RuntimeException e3) {
                                        ensk j = ccfd.b.j();
                                        j.Y(ente.a, "BugleCms");
                                        ((enrr) ((enrr) ((enrr) j).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreTopConversations", (char) 478, "CmsConversationConsumer.java")).q("Exception when queuing media download after top conversations restore, will continue restoring the rest of the messages.");
                                    }
                                }
                            }
                            return enoz.a;
                        }
                    }, this.q).e(Exception.class, new emwl() { // from class: ccfb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ccfd.i((Exception) obj);
                            return enoz.a;
                        }
                    }, this.p).i(new eroh() { // from class: ccfc
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return elfl.this;
                        }
                    }, this.p);
                }
                if (this.v.a() && z) {
                    e2 = e2.h(new emwl() { // from class: ccea
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            enhk enhkVar = (enhk) obj;
                            try {
                                ccfd.this.f.a();
                                return enhkVar;
                            } catch (RuntimeException e3) {
                                ensk j = ccfd.b.j();
                                j.Y(ente.a, "BugleCms");
                                ((enrr) ((enrr) ((enrr) j).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreTopConversations", (char) 512, "CmsConversationConsumer.java")).q("ParticipantFullRefresh failed.");
                                return enhkVar;
                            }
                        }
                    }, this.q);
                }
            }
            e2 = i;
            if (this.v.a()) {
                e2 = e2.h(new emwl() { // from class: ccea
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        enhk enhkVar = (enhk) obj;
                        try {
                            ccfd.this.f.a();
                            return enhkVar;
                        } catch (RuntimeException e3) {
                            ensk j = ccfd.b.j();
                            j.Y(ente.a, "BugleCms");
                            ((enrr) ((enrr) ((enrr) j).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreTopConversations", (char) 512, "CmsConversationConsumer.java")).q("ParticipantFullRefresh failed.");
                            return enhkVar;
                        }
                    }
                }, this.q);
            }
        }
        return (engwVar2 == null || engwVar2.isEmpty()) ? e2 : e2.i(new eroh() { // from class: ccet
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ccfd.this.c.b(engwVar2, optional);
            }
        }, this.p).i(new eroh() { // from class: cceu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enhk enhkVar = (enhk) obj;
                enhk enhkVar2 = (enhk) erqt.q(elfl.this);
                if (enhkVar2 == null || enhkVar2.isEmpty()) {
                    return elfo.e(enhkVar);
                }
                enhd enhdVar = new enhd();
                enhdVar.g(enhkVar2);
                enhdVar.g(enhkVar);
                return elfo.e(enhdVar.b());
            }
        }, this.p);
    }

    public final elfl h(final eswr eswrVar, final Optional optional) {
        return (this.s.a() ? this.e.i().i(new eroh() { // from class: ccec
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean equals = ((eyja) obj).equals(eykm.c);
                boolean z = false;
                if (((Boolean) ((cfup) csgj.U.get()).e()).booleanValue() && equals) {
                    z = true;
                }
                return ccfd.this.g.A(eswrVar.c, z);
            }
        }, this.p) : this.g.z(eswrVar.c)).i(new eroh() { // from class: cced
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Stream filter = Collection.EL.stream((engw) obj).filter(new Predicate() { // from class: cceb
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
                        return !teq.a((eszz) obj2);
                    }
                });
                int i = engw.d;
                return ccfd.this.d.j((engw) filter.collect(endq.a), optional);
            }
        }, this.p).e(Exception.class, new emwl() { // from class: ccee
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ccfd.i((Exception) obj);
                return enoz.a;
            }
        }, this.p).h(new emwl() { // from class: ccef
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
