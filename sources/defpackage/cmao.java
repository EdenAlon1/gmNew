package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmao {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter");
    public static final cskc b = cskc.g("Bugle", "PhoneNumberInputUIPresenter");
    public final ejvo c;
    public final ejvo d;
    public final ejvb e;
    public final cqoh f;
    public final csjk g;
    public final errl h;
    public final errl i;
    public final ctyx j;
    public final ejvp k;
    public final cort l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    private final cmel q;
    private final errl r;
    private final AtomicReference s = new AtomicReference(Optional.empty());
    public final AtomicBoolean p = new AtomicBoolean(false);

    public cmao(cmel cmelVar, ejvo ejvoVar, ejvo ejvoVar2, ejvb ejvbVar, cqoh cqohVar, csjk csjkVar, errl errlVar, errl errlVar2, errl errlVar3, ctyx ctyxVar, ejvp ejvpVar, cort cortVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.q = cmelVar;
        this.c = ejvoVar;
        this.d = ejvoVar2;
        this.e = ejvbVar;
        this.f = cqohVar;
        this.g = csjkVar;
        this.r = errlVar;
        this.h = errlVar2;
        this.i = errlVar3;
        this.j = ctyxVar;
        this.k = ejvpVar;
        this.l = cortVar;
        this.m = ffbrVar;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
    }

    public static int a(final engw engwVar, final clze clzeVar) {
        int a2 = ermn.a(c(engwVar, new Predicate() { // from class: clzr
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
                int b2;
                clzf clzfVar = (clzf) obj;
                long longValue = ((Long) cmao.j(engwVar).orElse(0L)).longValue();
                int b3 = clzd.b(clzfVar.c);
                if (b3 == 0 || b3 != 3) {
                    return false;
                }
                clze b4 = clze.b(clzfVar.h);
                if (b4 == null) {
                    b4 = clze.UNRECOGNIZED;
                }
                if (!clze.this.equals(b4) || (b2 = clzb.b(clzfVar.d)) == 0 || b2 != 4) {
                    return false;
                }
                eyja eyjaVar = clzfVar.e;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                return eykm.b(eyjaVar) > longValue;
            }
        }));
        b.m(String.format("countImpressions: Counted %s impressions of %s UiVariant.", String.valueOf(a2), clzeVar));
        return a2;
    }

    public static int b(engw engwVar) {
        int a2 = ermn.a(c(engwVar, new cmai()));
        b.m(String.format("countRepromptNumber: Counted %s already completed PhoneNumberInput reprompts.", String.valueOf(a2)));
        return a2;
    }

    public static long c(engw engwVar, Predicate predicate) {
        return Collection.EL.stream(engwVar).filter(predicate).count();
    }

    public static Optional g(engw engwVar, Predicate predicate) {
        return Collection.EL.stream(engwVar).filter(predicate).max(Comparator.CC.comparing(new Function() { // from class: cmab
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eyja eyjaVar = ((clzf) obj).e;
                return eyjaVar == null ? eyja.a : eyjaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new java.util.Comparator() { // from class: cmac
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                eyja eyjaVar = eykm.a;
                return eykl.a((eyja) obj, (eyja) obj2);
            }
        }));
    }

    public static Optional i(engw engwVar, Predicate predicate) {
        return g(engwVar, predicate).map(new Function() { // from class: clzi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eyja eyjaVar = ((clzf) obj).e;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                return Long.valueOf(eykm.b(eyjaVar));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static Optional j(engw engwVar) {
        return i(engwVar, new cmai());
    }

    public final elfl d(final String str) {
        return this.q.e().h(new emwl() { // from class: cmde
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                String str2 = str;
                cmbm cmbmVar = cmbm.a;
                str2.getClass();
                eyhm eyhmVar = ((cmbx) obj).g;
                if (eyhmVar.containsKey(str2)) {
                    cmbmVar = (cmbm) eyhmVar.get(str2);
                }
                return engw.n(cmbmVar.b);
            }
        }, erpp.a);
    }

    public final elfl e() {
        return this.l.c().i(new eroh() { // from class: clzv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Stream map = Collection.EL.stream((Set) obj).map(new Function() { // from class: cmae
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return djrn.a((djrm) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final cmao cmaoVar = cmao.this;
                Stream map2 = map.map(new Function() { // from class: cmaf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cmao cmaoVar2 = cmao.this;
                        final String str = (String) obj2;
                        return cmaoVar2.f(str).h(new emwl() { // from class: clzs
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                final String str2 = str;
                                return ((Optional) obj3).map(new Function() { // from class: cmaj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return new clxp(str2, (clze) obj4);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            }
                        }, cmaoVar2.i);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return elfo.i((engw) map2.collect(endq.a)).h(new emwl() { // from class: cmag
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Stream filter = Collection.EL.stream((List) obj2).filter(new Predicate() { // from class: clzw
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
                                return Objects.nonNull((Optional) obj3);
                            }
                        });
                        int i2 = engw.d;
                        return Collection.EL.stream((engw) filter.collect(endq.a)).filter(new Predicate() { // from class: clzx
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
                                return ((Optional) obj3).isPresent();
                            }
                        }).map(new Function() { // from class: clzy
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return (cman) ((Optional) obj3).get();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).findFirst();
                    }
                }, cmaoVar.i);
            }
        }, this.h);
    }

    public final elfl f(final String str) {
        return !this.p.get() ? elfo.e(Optional.empty()) : elfl.g(this.h.submit(eldl.m(new Callable() { // from class: clzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cmao cmaoVar = cmao.this;
                djtc djtcVar = new djtc(((ckge) cmaoVar.g.a()).w(new djro(str)));
                boolean z = true;
                if (!djtcVar.a.equals(eqwf.CARRIER_SETUP_PENDING) && (!((aunc) cmaoVar.o.b()).a() || !djtcVar.b())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }))).i(new eroh() { // from class: clzo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPhoneNumberInputUIFuture", 432, "PhoneNumberInputUIPresenter.java")).q("Not prompting PhoneNumberInputUI: RcsAvailability is not CARRIER_SETUP_PENDING");
                    return elfo.e(false);
                }
                final String str2 = str;
                final cmao cmaoVar = cmao.this;
                return cmaoVar.d(str2).h(new emwl() { // from class: clzj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cmao cmaoVar2 = cmao.this;
                        engw engwVar = (engw) obj2;
                        boolean z = false;
                        if (cmaoVar2.j.q("is_manual_msisdn_shown_or_dismissed", false) && cmao.b(engwVar) == 0) {
                            cmao.b.m("Not prompting PhoneNumberInputUI: User has already seen the legacy UI.");
                        } else if (engwVar.isEmpty()) {
                            cmao.b.m(String.format("shouldPromptPhoneNumberInputUI: Returning defaultValue of %b, because there are no PhoneNumberInputUIEvents", false));
                        } else {
                            Optional j = cmao.j(engwVar);
                            Optional i = cmao.i(engwVar, new Predicate() { // from class: clzz
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
                                    int b2;
                                    clzf clzfVar = (clzf) obj3;
                                    int b3 = clzd.b(clzfVar.c);
                                    return b3 != 0 && b3 == 3 && (b2 = clzb.b(clzfVar.d)) != 0 && b2 == 3;
                                }
                            });
                            if (i.isEmpty()) {
                                cmao.b.m("Not prompting PhoneNumberInputUI: PE has never requested it.");
                            } else if (j.isPresent() && ((Long) j.get()).longValue() > ((Long) i.get()).longValue()) {
                                cmao.b.m("Not prompting PhoneNumberInputUI: Already prompted for most recent request from PE.");
                            } else if (j.isPresent() && cmaoVar2.f.f().toEpochMilli() - ((Long) j.get()).longValue() <= Duration.ofSeconds(((Long) djai.t().a.M.a()).longValue()).toMillis()) {
                                cmao.b.m("Not prompting PhoneNumberInputUI: Not enough duration since last prompt.");
                            } else if (cmao.c(engwVar, new cmai()) >= ((cguo) cmaoVar2.n.b()).c(str2).z) {
                                cmao.b.m("Not prompting PhoneNumberInputUI: Max number of remprompts.");
                            } else if (!"phone_number_ui_variant_promo_banner".equals(djai.w()) || djai.c() <= 0 || cmao.a(engwVar, clze.PROMO_BANNER) < djai.c()) {
                                cmao.b.m("Prompting PhoneNumberInputUI");
                                z = true;
                            } else {
                                cmao.b.m("Not prompting PhoneNumberInputUI: Max number of banner impressions.");
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }, erpp.a);
            }
        }, this.r).i(new eroh() { // from class: cmal
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(Optional.empty());
                }
                String str2 = str;
                cmao cmaoVar = cmao.this;
                return cmaoVar.d(str2).h(new emwl() { // from class: clzu
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
                    
                        if (r6 == 10) goto L41;
                     */
                    @Override // defpackage.emwl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r6) {
                        /*
                            r5 = this;
                            engw r6 = (defpackage.engw) r6
                            java.lang.String r0 = defpackage.djai.w()
                            int r1 = r0.hashCode()
                            r2 = -1957840740(0xffffffff8b4db89c, float:-3.9620449E-32)
                            r3 = 2
                            r4 = 1
                            if (r1 == r2) goto L30
                            r2 = -694512988(0xffffffffd69a92a4, float:-8.4977304E13)
                            if (r1 == r2) goto L26
                            r2 = 755425503(0x2d06e0df, float:7.6669495E-12)
                            if (r1 == r2) goto L1c
                            goto L3a
                        L1c:
                            java.lang.String r1 = "phone_number_ui_variant_input_bottomsheet"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L3a
                            r0 = r4
                            goto L3b
                        L26:
                            java.lang.String r1 = "phone_number_ui_variant_promo_bottomsheet"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L3a
                            r0 = 0
                            goto L3b
                        L30:
                            java.lang.String r1 = "phone_number_ui_variant_promo_banner"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L3a
                            r0 = r3
                            goto L3b
                        L3a:
                            r0 = -1
                        L3b:
                            if (r0 == 0) goto Lcc
                            if (r0 == r4) goto Lbe
                            if (r0 == r3) goto L4f
                            cskc r6 = defpackage.cmao.b
                            java.lang.String r0 = "Decided input fullscreen from experiment configuration or default."
                            r6.m(r0)
                            clze r6 = defpackage.clze.INPUT_FULLSCREEN
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        L4f:
                            int r0 = defpackage.cmao.b(r6)
                            djai r1 = defpackage.djai.t()
                            djah r1 = r1.a
                            diza r1 = r1.ao
                            java.lang.Object r1 = r1.a()
                            java.lang.Integer r1 = (java.lang.Integer) r1
                            int r1 = r1.intValue()
                            if (r0 < r1) goto Lb0
                            clze r0 = defpackage.clze.PROMO_BANNER
                            clzl r1 = new clzl
                            r1.<init>()
                            j$.util.Optional r6 = defpackage.cmao.g(r6, r1)
                            boolean r1 = r6.isEmpty()
                            if (r1 == 0) goto L79
                            goto La2
                        L79:
                            java.lang.Object r1 = r6.get()
                            clzf r1 = (defpackage.clzf) r1
                            int r1 = r1.h
                            clze r1 = defpackage.clze.b(r1)
                            if (r1 != 0) goto L89
                            clze r1 = defpackage.clze.UNRECOGNIZED
                        L89:
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto La2
                            java.lang.Object r6 = r6.get()
                            clzf r6 = (defpackage.clzf) r6
                            int r6 = r6.d
                            int r6 = defpackage.clzb.b(r6)
                            if (r6 == 0) goto La2
                            r0 = 10
                            if (r6 != r0) goto La2
                            goto Lb0
                        La2:
                            cskc r6 = defpackage.cmao.b
                            java.lang.String r0 = "Decided promo banner from experiment configuration."
                            r6.m(r0)
                            clze r6 = defpackage.clze.PROMO_BANNER
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        Lb0:
                            cskc r6 = defpackage.cmao.b
                            java.lang.String r0 = "Decided input popup because has not reached max, or user accepted promo."
                            r6.m(r0)
                            clze r6 = defpackage.clze.INPUT_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        Lbe:
                            cskc r6 = defpackage.cmao.b
                            java.lang.String r0 = "Decided input popup from experiment configuration."
                            r6.m(r0)
                            clze r6 = defpackage.clze.INPUT_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        Lcc:
                            int r6 = defpackage.cmao.b(r6)
                            if (r6 != 0) goto Le0
                            cskc r6 = defpackage.cmao.b
                            java.lang.String r0 = "Decided input popup because initial prompt."
                            r6.m(r0)
                            clze r6 = defpackage.clze.INPUT_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        Le0:
                            cskc r6 = defpackage.cmao.b
                            java.lang.String r0 = "Decided promo popup from experiment configuration."
                            r6.m(r0)
                            clze r6 = defpackage.clze.PROMO_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.clzu.apply(java.lang.Object):java.lang.Object");
                    }
                }, cmaoVar.i);
            }
        }, this.i);
    }

    public final Optional h() {
        return (Optional) this.s.get();
    }

    public final void k() {
        this.s.set(Optional.empty());
    }

    public final void l(String str) {
        this.s.set(Optional.of(str));
    }
}
