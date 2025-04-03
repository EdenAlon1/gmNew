package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkaw implements djry, djrv, dkay {
    public static final enru a = enru.c("com/google/android/ims/provisioning/manager/RcsProvisioningManager");
    public final ffbr c;
    public final djsz d;
    public final djtn e;
    public final cort f;
    public final dkvu g;
    public final clwo h;
    public final azpo i;
    private final List l;
    private final errl m;
    private final errl n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    public final dksp b = new dksp();
    private final dksp j = new dksp();
    private final AtomicBoolean k = new AtomicBoolean();

    public dkaw(ffbr ffbrVar, final errl errlVar, errl errlVar2, Set set, Set set2, Set set3, Optional optional, List list, djsz djszVar, djtn djtnVar, ffbr ffbrVar2, ffbr ffbrVar3, cort cortVar, dkvu dkvuVar, clwo clwoVar, Set set4, azpo azpoVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.c = ffbrVar;
        this.l = list;
        this.m = errlVar;
        this.n = errlVar2;
        this.d = djszVar;
        this.e = djtnVar;
        this.o = ffbrVar2;
        this.p = ffbrVar3;
        this.f = cortVar;
        this.g = dkvuVar;
        this.h = clwoVar;
        this.i = azpoVar;
        this.q = ffbrVar4;
        this.r = ffbrVar5;
        optional.ifPresent(new Consumer() { // from class: djzo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Optional empty = Optional.empty();
                dkaw dkawVar = dkaw.this;
                dkap dkapVar = new dkap((djrx) obj, empty, new djzl(dkawVar));
                dksn f = dkso.f(dkapVar, errlVar);
                f.c(false);
                f.b(dkapVar.a);
                ((dksd) f).c = new Function() { // from class: djzn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return true;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                };
                dkawVar.b.a(f.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final dkap dkapVar = new dkap((djrx) it.next(), Optional.empty(), new djzl(this));
            dksp dkspVar = this.b;
            dksn f = dkso.f(dkapVar, errlVar);
            f.c(false);
            f.b(dkapVar.a);
            ((dksd) f).c = new Function() { // from class: djzw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    dkaq dkaqVar = (dkaq) obj;
                    boolean z = false;
                    if (dkaqVar != null) {
                        dkap dkapVar2 = dkap.this;
                        if (dkapVar2.b.isEmpty() || ((String) dkapVar2.b.get()).equals(dkaqVar.b())) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dkspVar.a(f.a());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            H(Optional.empty(), (djru) it2.next(), errlVar);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            djrl djrlVar = (djrl) it3.next();
            dkao dkaoVar = new dkao(djrlVar, djszVar);
            dkar dkarVar = new dkar(dkaoVar);
            dksp dkspVar2 = this.j;
            dksn f2 = dkso.f(dkarVar, errlVar);
            f2.c(false);
            f2.b(djrlVar);
            ((dksd) f2).c = new Function() { // from class: djzh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return true;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dkspVar2.a(f2.a());
            dkau dkauVar = new dkau(dkaoVar);
            dksp dkspVar3 = this.b;
            dksn f3 = dkso.f(dkauVar, errlVar);
            f3.c(false);
            f3.b(djrlVar);
            ((dksd) f3).c = new Function() { // from class: dkah
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return true;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dkspVar3.a(f3.a());
        }
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            azle azleVar = (azle) it4.next();
            dkav dkavVar = new dkav(azleVar, new djzx(this), new Function() { // from class: djzt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return dkaw.this.j((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, this.f, this.h);
            dksp dkspVar4 = this.j;
            dksn f4 = dkso.f(dkavVar, errlVar);
            f4.c(false);
            f4.b(azleVar);
            ((dksd) f4).c = new Function() { // from class: djzu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return true;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            };
            dkspVar4.a(f4.a());
        }
    }

    private final Optional G(int i) {
        return this.f.g(i, true).map(new dkab());
    }

    private final void H(Optional optional, djru djruVar, Executor executor) {
        final dkal dkalVar = new dkal(djruVar, optional);
        dksn f = dkso.f(dkalVar, executor);
        f.c(false);
        f.b(djruVar);
        ((dksd) f).c = new Function() { // from class: djzy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
            
                if (((java.lang.String) r1.a.get()).equals(r5.b()) != false) goto L8;
             */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r5) {
                /*
                    r4 = this;
                    dkam r5 = (defpackage.dkam) r5
                    r0 = 0
                    if (r5 == 0) goto L23
                    dkal r1 = defpackage.dkal.this
                    j$.util.Optional r2 = r1.a
                    boolean r2 = r2.isEmpty()
                    r3 = 1
                    if (r2 != 0) goto L22
                    j$.util.Optional r1 = r1.a
                    java.lang.Object r1 = r1.get()
                    java.lang.String r5 = r5.b()
                    java.lang.String r1 = (java.lang.String) r1
                    boolean r5 = r1.equals(r5)
                    if (r5 == 0) goto L23
                L22:
                    r0 = r3
                L23:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.djzy.apply(java.lang.Object):java.lang.Object");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        this.j.a(f.a());
    }

    private final void I(Optional optional, final djrm djrmVar) {
        final cosz coszVar = (cosz) this.f.j(djrn.a(djrmVar)).orElse(null);
        if (coszVar == null) {
            ensk j = a.j();
            j.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addIdentityMapping", 903, "RcsProvisioningManager.java")).t("No SimSubscriptionInfo for sim with id: %s", dktx.SIM_ID.c(djrn.a(djrmVar)));
        } else {
            ensk h = a.h();
            h.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addIdentityMapping", 908, "RcsProvisioningManager.java")).H("Configuration is empty: %s for simId: %s", optional.isEmpty(), dktx.SIM_ID.c(djrn.a(djrmVar)));
            optional.filter(new Predicate() { // from class: djzm
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
                public final boolean test(Object obj) {
                    return !((djtp) obj).S();
                }
            }).flatMap(new djzx(this)).ifPresentOrElse(new Consumer() { // from class: dkaf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    dkaw.this.d.v(djrmVar, (djrj) obj, coszVar.d);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: dkag
                @Override // java.lang.Runnable
                public final void run() {
                    dkaw dkawVar = dkaw.this;
                    dkvu dkvuVar = dkawVar.g;
                    cosz coszVar2 = coszVar;
                    if (dkvuVar.b(coszVar2.d)) {
                        dkawVar.d.v(djrmVar, null, coszVar2.d);
                    } else {
                        ensk h2 = dkaw.a.h();
                        h2.Y(ente.a, "RcsProvisioningManager");
                        ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addIdentityMappingWithoutPhoneNumberIfSingleRegistration", 929, "RcsProvisioningManager.java")).w("Called addIdentityMappingWithoutPhoneNumberIfSingleRegistration and isSingleRegistration is false for sub id: %s and simId %s", coszVar2.d, dktx.SIM_ID.c(coszVar2.c));
                    }
                }
            });
        }
    }

    private final void J(final int i) {
        final elfl c;
        if (i <= 0) {
            ensk h = a.h();
            h.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "logProvisioningApisComparisonEvent", 1009, "RcsProvisioningManager.java")).r("subId is invalid: %s", i);
        } else {
            azow azowVar = (azow) this.r.b();
            c = axol.c(azowVar.b, ffhe.a, ffsm.a, new azos(azowVar, i, null));
            final elfl g = ((azow) this.r.b()).g(i);
            axnw.f(elfo.k(c, g).b(new erog() { // from class: djzj
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    azop azopVar;
                    List list = (List) erqt.q(c);
                    elfl elflVar = g;
                    int i2 = i;
                    try {
                        azopVar = (azop) erqt.q(elflVar);
                    } catch (ExecutionException e) {
                        ensk j = dkaw.a.j();
                        j.Y(ente.a, "RcsProvisioningManager");
                        ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "logProvisioningApisComparisonEvent", 1027, "RcsProvisioningManager.java")).r("Failed to get myIdentity for subId: %s", i2);
                        azopVar = null;
                    }
                    dkaw dkawVar = dkaw.this;
                    if (list.isEmpty() && azopVar == null) {
                        return dkawVar.E(25, i2, false);
                    }
                    if (list.size() > 1) {
                        return dkawVar.E(27, i2, true);
                    }
                    if (list.isEmpty()) {
                        ensk h2 = dkaw.a.h();
                        h2.Y(ente.a, "RcsProvisioningManager");
                        ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "logProvisioningApisComparisonEvent", 1045, "RcsProvisioningManager.java")).r("No active myIdentity found for subId: %s", i2);
                    }
                    boolean z = list.size() == 1;
                    Optional d = z ? dkawVar.i.a((azop) list.get(0)).d() : azopVar != null ? dkawVar.i.a(azopVar).d() : Optional.empty();
                    Optional o = d.isPresent() ? dkawVar.o((String) d.get()) : Optional.empty();
                    Optional z2 = dkawVar.z(i2);
                    if (o.isEmpty()) {
                        boolean isPresent = z2.isPresent();
                        if (z) {
                            return dkawVar.E(true != isPresent ? 28 : 26, i2, false);
                        }
                        return dkawVar.E(true != isPresent ? 29 : 18, i2, false);
                    }
                    if (z2.isEmpty()) {
                        return dkawVar.E(18, i2, true);
                    }
                    if (((UUID) z2.get()).equals(o.get())) {
                        return dkawVar.E(23, i2, z);
                    }
                    dkawVar.h.f(19, Integer.valueOf(i2), null, ((UUID) o.get()).toString(), ((UUID) z2.get()).toString(), z);
                    return elfo.e(null);
                }
            }, this.n), "Failed to log provisioning apis comparison event for subId");
        }
    }

    private final void K(final djrj djrjVar) {
        elfl c;
        awuf awufVar = (awuf) awui.a.createBuilder();
        awufVar.copyOnWrite();
        awui awuiVar = (awui) awufVar.instance;
        awuiVar.b |= 2;
        awuiVar.d = djrjVar.a;
        awuh awuhVar = awuh.PHONE;
        awufVar.copyOnWrite();
        awui awuiVar2 = (awui) awufVar.instance;
        awuiVar2.c = awuhVar.f;
        awuiVar2.b |= 1;
        awui awuiVar3 = (awui) awufVar.build();
        azow azowVar = (azow) this.r.b();
        awuiVar3.getClass();
        c = axol.c(azowVar.b, ffhe.a, ffsm.a, new azor(azowVar, awuiVar3, null));
        axnw.f(c.i(new eroh() { // from class: dkad
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                djrj djrjVar2 = djrjVar;
                dkaw dkawVar = dkaw.this;
                azop azopVar = (azop) obj;
                if (azopVar == null) {
                    return dkawVar.F(25, djrjVar2, false);
                }
                Optional d = dkawVar.i.a(azopVar).d();
                Optional o = d.isPresent() ? dkawVar.o((String) d.get()) : Optional.empty();
                Integer num = (Integer) dkawVar.i.a(azopVar).a().listIterator().next();
                if (num == null) {
                    throw new IllegalStateException("No subId found for my identity mapping from phone number.");
                }
                Optional z = dkawVar.z(num.intValue());
                if (o.isEmpty()) {
                    return dkawVar.F(true != z.isPresent() ? 28 : 26, djrjVar2, false);
                }
                if (z.isEmpty()) {
                    return dkawVar.F(18, djrjVar2, true);
                }
                if (((UUID) z.get()).equals(o.get())) {
                    return dkawVar.F(24, djrjVar2, true);
                }
                dkawVar.h.f(20, null, djrjVar2, ((UUID) o.get()).toString(), ((UUID) z.get()).toString(), true);
                return elfo.e(null);
            }
        }, this.n), "Failed to log provisioning apis comparison event for phone number");
    }

    public final Set A() {
        return this.d.m();
    }

    public final void B(cosz coszVar) {
        ekzz f = eleg.f("RcsProvisioningManager#addAvailabilityToIdentityMapForSim");
        try {
            final djro djroVar = new djro(coszVar.c);
            Optional n = n(coszVar.c);
            enru enruVar = a;
            ensk h = enruVar.h();
            h.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForSim", 613, "RcsProvisioningManager.java")).t("qualifiedProvisioningEngineAdapter is present: %s", Boolean.valueOf(n.isPresent()));
            djtc djtcVar = (djtc) n.map(new Function() { // from class: dkai
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new djtc(((ckge) ((cmmu) obj).a.a()).w(djro.this));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null);
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForSim", 622, "RcsProvisioningManager.java")).t("getAvailabilityForRcsProvisioningIdSync: %s", djtcVar);
            if (djtcVar == null) {
                ensk h3 = enruVar.h();
                h3.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h3).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForSim", 625, "RcsProvisioningManager.java")).t("Cannot get provisioning adapter for simId: %s", coszVar.c);
            } else {
                s(djroVar.a, djtcVar);
            }
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

    public final synchronized void C() {
        ekzz f;
        ekzz f2 = eleg.f("RcsProvisioningManager#doPopulateRcsAvailableIdentityMapIfEmpty");
        try {
            if (!this.d.o()) {
                ensk h = a.h();
                h.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "doPopulateRcsAvailableIdentityMapIfEmpty", 538, "RcsProvisioningManager.java")).q("Identity mapping not empty. Backfill not required.");
                this.d.u();
            } else if (this.k.get()) {
                ensk h2 = a.h();
                h2.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "doPopulateRcsAvailableIdentityMapIfEmpty", 544, "RcsProvisioningManager.java")).q("Skipping backfill of identity mapping.");
            } else {
                enru enruVar = a;
                ensk h3 = enruVar.h();
                h3.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h3).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "doPopulateRcsAvailableIdentityMapIfEmpty", 548, "RcsProvisioningManager.java")).q("Calculating availability");
                if (((Boolean) this.p.b()).booleanValue()) {
                    f = eleg.f("RcsProvisioningManager#addAvailabilityToIdentityMapForAllSims");
                    try {
                        ensk h4 = enruVar.h();
                        h4.Y(ente.a, "RcsProvisioningManager");
                        ((enrr) ((enrr) h4).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForAllSims", 587, "RcsProvisioningManager.java")).q("Computing availability for all sims.");
                        Iterator it = this.f.q().iterator();
                        while (it.hasNext()) {
                            B((cosz) it.next());
                        }
                        f.close();
                    } finally {
                    }
                } else {
                    f = eleg.f("RcsProvisioningManager#addAvailabilityToIdentityMapForDefaultSim");
                    try {
                        ensk h5 = enruVar.h();
                        h5.Y(ente.a, "RcsProvisioningManager");
                        ((enrr) ((enrr) h5).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForDefaultSim", 574, "RcsProvisioningManager.java")).q("Computing availability for default call sim.");
                        this.f.h(cors.a).ifPresentOrElse(new Consumer() { // from class: djzz
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                dkaw.this.B((cosz) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Runnable() { // from class: dkaa
                            @Override // java.lang.Runnable
                            public final void run() {
                                ensk h6 = dkaw.a.h();
                                h6.Y(ente.a, "RcsProvisioningManager");
                                ((enrr) ((enrr) h6).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "addAvailabilityToIdentityMapForDefaultSim", 580, "RcsProvisioningManager.java")).q("No default call sim to calculate availability.");
                            }
                        });
                        f.close();
                    } finally {
                    }
                }
                this.d.u();
                this.k.set(true);
            }
            f2.close();
        } finally {
        }
    }

    final boolean D() {
        return this.k.get();
    }

    public final elfl E(int i, int i2, boolean z) {
        this.h.e(i, Integer.valueOf(i2), null, z);
        return elfo.e(null);
    }

    public final elfl F(int i, djrj djrjVar, boolean z) {
        this.h.e(i, null, djrjVar, z);
        return elfo.e(null);
    }

    @Override // defpackage.djrv
    public final djtc a(djrj djrjVar) {
        if (((Boolean) this.q.b()).booleanValue()) {
            K(djrjVar);
        }
        return (djtc) this.d.h(djrjVar).map(new dkab()).map(new Function() { // from class: dkac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dkaw.this.b(((djro) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new djtc(eqwf.DISABLED_SIM_ABSENT));
    }

    @Override // defpackage.djrv
    public final djtc b(String str) {
        Optional n = n(str);
        return n.isEmpty() ? new djtc(eqwf.BUGLE_LOADING_AVAILABILITY_EXCEPTION) : ((cmmu) n.get()).a(str);
    }

    @Override // defpackage.djrv
    @Deprecated
    public final djtc c() {
        return b(((dkpp) this.c.b()).l());
    }

    @Override // defpackage.djrv
    public final djtc d(int i) {
        djtc djtcVar;
        ekzz f = eleg.f("RcsProvisioningManager#getCachedRcsAvailabilityForSubId");
        try {
            if (((Boolean) this.q.b()).booleanValue()) {
                J(i);
            }
            if (i < 0) {
                ensk h = a.h();
                h.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getCachedRcsAvailabilityForSubIdInTrace", 309, "RcsProvisioningManager.java")).r("getCachedRcsAvailabilityForSubId called with an invalid sub id: %s", i);
                djtcVar = new djtc(eqwf.BUGLE_LOADING_AVAILABILITY_EXCEPTION);
            } else {
                djtcVar = (djtc) G(i).map(new djzf()).map(new djzg(this)).orElse(new djtc(eqwf.BUGLE_LOADING_AVAILABILITY_EXCEPTION));
            }
            f.close();
            return djtcVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.djrv
    public final elfl e(final int i) {
        ekzz f = eleg.f("RcsProvisioningManager#getRcsAvailabilityForSubIdAsync");
        try {
            if (((Boolean) this.q.b()).booleanValue()) {
                J(i);
            }
            elfl h = elfl.g(h()).h(new emwl() { // from class: djzs
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i2 = i;
                    if (i2 < 0) {
                        ensk j = dkaw.a.j();
                        j.Y(ente.a, "RcsProvisioningManager");
                        ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getRcsAvailabilityForSubId", 331, "RcsProvisioningManager.java")).r("getRcsAvailabilityForSubId called with an invalid sub id: %s", i2);
                        return new djtc(eqwf.BUGLE_LOADING_AVAILABILITY_EXCEPTION);
                    }
                    dkaw dkawVar = dkaw.this;
                    Optional map = dkawVar.f.i(i2).map(new Function() { // from class: dkak
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((cosz) obj2).c;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: djzd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new djro((String) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (map.isEmpty()) {
                        ensk j2 = dkaw.a.j();
                        j2.Y(ente.a, "RcsProvisioningManager");
                        ((enrr) ((enrr) j2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getSimIdFromSubId", 835, "RcsProvisioningManager.java")).r("getSimIdFromSubId for subId: %s returned no mapping.", i2);
                    }
                    return (djtc) map.map(new djzf()).map(new djzg(dkawVar)).orElse(new djtc(eqwf.BUGLE_LOADING_AVAILABILITY_EXCEPTION));
                }
            }, this.m);
            f.b(h);
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

    @Override // defpackage.djrv
    public final elfl f() {
        ekzz f = eleg.f("RcsProvisioningManager#getRcsAvailablePhoneNumbersAsync");
        try {
            elfl h = elfl.g(h()).h(new emwl() { // from class: djzi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return dkaw.this.A();
                }
            }, this.n);
            f.b(h);
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

    @Override // defpackage.djrv
    public final elfl g(String str) {
        try {
            final djrj a2 = ((djrk) this.o.b()).a(str);
            return f().h(new emwl() { // from class: djzv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Set) obj).contains(djrj.this));
                }
            }, this.m);
        } catch (IllegalArgumentException unused) {
            return elfo.e(false);
        }
    }

    @Override // defpackage.djrv
    public final ListenableFuture h() {
        if (!this.d.o()) {
            ensk h = a.h();
            h.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "populateRcsAvailableIdentityMapIfEmpty", 515, "RcsProvisioningManager.java")).q("Identity mapping not empty. Backfill not required.");
            this.d.u();
            return erre.a;
        }
        if (this.k.get()) {
            ensk h2 = a.h();
            h2.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "populateRcsAvailableIdentityMapIfEmpty", 521, "RcsProvisioningManager.java")).q("Skipping backfill of identity mapping.");
            return erre.a;
        }
        ensk h3 = a.h();
        h3.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) h3).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "populateRcsAvailableIdentityMapIfEmpty", 525, "RcsProvisioningManager.java")).q("Scheduling identity mapping backfill.");
        return this.m.submit(eldl.m(new Callable() { // from class: djzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dkaw.this.C();
                return null;
            }
        }));
    }

    @Override // defpackage.djry
    public final Optional i(djrm djrmVar) {
        return j(djrn.a(djrmVar).a);
    }

    @Override // defpackage.djry
    public final Optional j(String str) {
        ekzz f = eleg.f("RcsProvisioningManager#getConfiguration");
        try {
            Optional n = n(str);
            Optional empty = n.isEmpty() ? Optional.empty() : ((cmmu) n.get()).b(str);
            f.close();
            return empty;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.djry
    public final Optional k(djrj djrjVar) {
        ekzz f = eleg.f("RcsProvisioningManager#getConfigurationByPhoneNumber");
        try {
            Optional map = this.d.h(djrjVar).map(new Function() { // from class: dkaj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (djtp) dkaw.this.j(djrn.a((djrm) obj).a).orElse(null);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (((Boolean) this.q.b()).booleanValue()) {
                K(djrjVar);
            }
            f.close();
            return map;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.djry
    public final Optional l(int i) {
        ekzz f = eleg.f("RcsProvisioningManager#getConfigurationBySubscriptionId");
        try {
            if (((Boolean) this.q.b()).booleanValue()) {
                J(i);
            }
            Optional flatMap = this.d.q(i).flatMap(new Function() { // from class: djze
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return dkaw.this.i((djrm) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.close();
            return flatMap;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.djry
    @Deprecated
    public final Optional m() {
        return j(((dkpp) this.c.b()).l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Optional n(String str) {
        enqv it = ((engw) this.l).iterator();
        if (it.hasNext()) {
            return Optional.of((cmmu) it.next());
        }
        ensk j = a.j();
        j.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "findProvisioningEngineAdapter", 788, "RcsProvisioningManager.java")).t("ProvisioningEngineAdapter not found for SIM %s", dktx.SIM_ID.c(str));
        return Optional.empty();
    }

    public final Optional o(String str) {
        Optional map = this.f.j(new djro(str)).map(new djzp()).map(new djzq());
        if (map.isEmpty()) {
            ensk j = a.j();
            j.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getLoggableSimIdFromProvisioningId", 859, "RcsProvisioningManager.java")).t("getLoggableSimIdFromProvisioningId for provisioningId: %s returned no mapping.", str);
        }
        return map;
    }

    @Override // defpackage.djrv
    public final Set p() {
        ekzz f = eleg.f("RcsProvisioningManager#getRcsAvailablePhoneNumbers");
        try {
            if (!D() && !efbd.g() && this.d.m().isEmpty()) {
                C();
            }
            Set A = A();
            f.close();
            return A;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.djrv
    public final Set q() {
        if (!D() && !efbd.g() && this.d.t().isEmpty()) {
            C();
        }
        djsz djszVar = this.d;
        ffbr ffbrVar = this.p;
        Set t = djszVar.t();
        if (((Boolean) ffbrVar.b()).booleanValue() || t.size() <= 1) {
            return t;
        }
        ensk j = a.j();
        j.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getRcsAvailableProvisioningIds", 396, "RcsProvisioningManager.java")).q("DSDR is disabled and multiple sims RCS available, returning only the default SIM.");
        return (Set) Collection.EL.stream(t).filter(new Predicate() { // from class: djzc
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
            public final boolean test(Object obj) {
                return ((djrm) obj).equals(new djro(((dkpp) dkaw.this.c.b()).l()));
            }
        }).collect(endq.b);
    }

    @Override // defpackage.djrv
    public final void r(String str, djru djruVar, Executor executor) {
        H(Optional.of(str), djruVar, executor);
    }

    @Override // defpackage.dkay
    public final void s(String str, djtc djtcVar) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsAvailabilityUpdate", 742, "RcsProvisioningManager.java")).D("Receive onRcsAvailabilityUpdate, SIM = %s, availability = %s", dktx.SIM_ID.c(str), djtcVar);
        if (djtcVar.c()) {
            djro djroVar = new djro(str);
            Optional i = i(djroVar);
            if (i.isEmpty()) {
                ensk h2 = enruVar.h();
                h2.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsAvailabilityUpdate", 750, "RcsProvisioningManager.java")).t("onRcsAvailabilityUpdate: Configuration is empty for SIM = %s", dktx.SIM_ID.c(str));
            }
            I(i, djroVar);
        } else {
            djsz djszVar = this.d;
            final djro djroVar2 = new djro(str);
            ReentrantReadWriteLock reentrantReadWriteLock = djszVar.e;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                ensk e = djsz.a.e();
                e.Y(ente.a, "BugleRcs");
                ((enrr) e.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "removeIdentifierMapping", 449, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Removing identity mapping {ProvisioningId: %s}", dktx.SIM_ID.c(djrn.a(djroVar2).a));
                List list = djszVar.g;
                final ffji ffjiVar = new ffji() { // from class: djsp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        djrz djrzVar = (djrz) obj;
                        djrzVar.getClass();
                        return Boolean.valueOf(ffkj.e(djrzVar.a, djrm.this));
                    }
                };
                Collection.EL.removeIf(list, new Predicate() { // from class: djsq
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
                    public final boolean test(Object obj) {
                        return ((Boolean) ffji.this.invoke(obj)).booleanValue();
                    }
                });
                djszVar.u();
            } finally {
                while (i2 < readHoldCount) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        this.j.b(new djza(str, djtcVar));
    }

    @Override // defpackage.dkay
    public final void t(String str, Optional optional) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsConfigurationUpdate", 765, "RcsProvisioningManager.java")).D("Receive onRcsConfigurationUpdate, SIM = %s, configuration = %s", dktx.SIM_ID.c(str), optional.map(new Function() { // from class: dkae
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((djtp) obj).x();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("<empty>"));
        if (optional.isEmpty()) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) h2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "onRcsConfigurationUpdate", 771, "RcsProvisioningManager.java")).t("onRcsConfigurationUpdate: Configuration is empty for SIM = %s", dktx.SIM_ID.c(str));
        }
        I(optional, new djro(str));
        this.b.b(new djzb(str, optional));
    }

    @Override // defpackage.djrv
    public final void u(djru djruVar) {
        this.j.d(djruVar);
    }

    @Override // defpackage.djrv
    public final boolean v(djrj djrjVar) {
        return p().contains(djrjVar);
    }

    @Override // defpackage.djrv
    public final boolean w(String str) {
        try {
            return v(((djrk) this.o.b()).a(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.djrv
    public final boolean x(int i) {
        boolean equals;
        ekzz f = eleg.f("RcsProvisioningManager#isRcsAvailableForSubId");
        try {
            if (i < 0) {
                ensk h = a.h();
                h.Y(ente.a, "RcsProvisioningManager");
                ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "isRcsAvailableForSubIdInTrace", 808, "RcsProvisioningManager.java")).r("isRcsAvailableForSubId called with an invalid sub id: %s", i);
                equals = false;
            } else {
                equals = ((eqwf) G(i).map(new djzf()).map(new djzg(this)).map(new Function() { // from class: djzr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((djtc) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(eqwf.BUGLE_LOADING_AVAILABILITY_EXCEPTION)).equals(eqwf.AVAILABLE);
            }
            f.close();
            return equals;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.djrv
    public final boolean y(int i) {
        int ordinal = d(i).a.ordinal();
        if (ordinal != 1 && ordinal != 6 && ordinal != 10 && ordinal != 13 && ordinal != 21) {
            switch (ordinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final Optional z(int i) {
        Optional map = this.f.i(i).map(new djzp()).map(new djzq());
        if (map.isEmpty()) {
            ensk j = a.j();
            j.Y(ente.a, "RcsProvisioningManager");
            ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "getLoggableSimIdFromSubId", 847, "RcsProvisioningManager.java")).r("getLoggableSimIdFromSubId for subId: %s returned no mapping.", i);
        }
        return map;
    }
}
