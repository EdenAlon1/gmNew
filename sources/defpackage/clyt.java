package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clyt {
    public static final cskc a = cskc.g("Bugle", "GoogleTosUiPresenter");
    public static final Comparator b = Comparator.CC.comparing(new Function() { // from class: clym
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            eyja eyjaVar = ((clxy) obj).f;
            return eyjaVar == null ? eyja.a : eyjaVar;
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new java.util.Comparator() { // from class: clyn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            eyja eyjaVar = eykm.a;
            return eykl.a((eyja) obj, (eyja) obj2);
        }
    });
    public final cmel c;
    public final errl d;
    public final errl e;
    public final cqoh f;
    private final crln g;
    private final crll h;

    public clyt(cmel cmelVar, crln crlnVar, crll crllVar, errl errlVar, errl errlVar2, cqoh cqohVar) {
        this.c = cmelVar;
        this.g = crlnVar;
        this.h = crllVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.f = cqohVar;
    }

    public static long a(engw engwVar, Predicate predicate) {
        return Collection.EL.stream(engwVar).filter(predicate).count();
    }

    public static long b(engw engwVar, int i) {
        return a(engwVar, new Predicate() { // from class: clye
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
                clxy clxyVar = (clxy) obj;
                if (!clyt.g(clxyVar)) {
                    return false;
                }
                clxx b2 = clxx.b(clxyVar.d);
                if (b2 == null) {
                    b2 = clxx.UNRECOGNIZED;
                }
                return b2.equals(clxx.BANNER);
            }
        }) + i;
    }

    public static Optional f(engw engwVar) {
        return Collection.EL.stream(engwVar).filter(new Predicate() { // from class: clyq
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
                return clyt.g((clxy) obj);
            }
        }).max(b).map(new Function() { // from class: clyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = clyt.a;
                eyja eyjaVar = ((clxy) obj).f;
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

    public static boolean g(clxy clxyVar) {
        int a2;
        int a3 = clxw.a(clxyVar.c);
        return a3 != 0 && a3 == 3 && (a2 = clxv.a(clxyVar.e)) != 0 && a2 == 6;
    }

    public final elfl c(final clxx clxxVar) {
        return e().i(new eroh() { // from class: clyf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Integer num = (Integer) obj;
                final clxx clxxVar2 = clxxVar;
                clyt clytVar = clyt.this;
                return clytVar.c.d().h(new emwl() { // from class: clyd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        final engw engwVar = (engw) obj2;
                        cskc cskcVar = clyt.a;
                        long b2 = clyt.b(engwVar, num.intValue());
                        final clxx clxxVar3 = clxxVar2;
                        return new clxn(b2, clyt.a(engwVar, new Predicate() { // from class: clyb
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
                                int a2;
                                clxy clxyVar = (clxy) obj3;
                                long longValue = ((Long) clyt.f(engwVar).orElse(0L)).longValue();
                                int a3 = clxw.a(clxyVar.c);
                                if (a3 == 0 || a3 != 3 || (a2 = clxv.a(clxyVar.e)) == 0 || a2 != 4) {
                                    return false;
                                }
                                clxx b3 = clxx.b(clxyVar.d);
                                if (b3 == null) {
                                    b3 = clxx.UNRECOGNIZED;
                                }
                                if (!clxx.this.equals(b3)) {
                                    return false;
                                }
                                eyja eyjaVar = clxyVar.f;
                                if (eyjaVar == null) {
                                    eyjaVar = eyja.a;
                                }
                                return eykl.a(eyjaVar, eykm.d(longValue)) > 0;
                            }
                        }));
                    }
                }, clytVar.e);
            }
        }, this.e);
    }

    public final elfl d() {
        elfl e;
        elfl h;
        final crll crllVar = this.h;
        if (djai.z() && djai.ac()) {
            h = elfo.g(new Callable() { // from class: crli
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    if (crll.c()) {
                        ensk d = crll.a.d();
                        d.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) d).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 85, "UpsellLogic.java")).q("Show Google Tos due to logic override");
                        return Optional.of(clxx.BOTTOMSHEET);
                    }
                    final crll crllVar2 = crll.this;
                    if (!Collection.EL.stream(crllVar2.d.o()).anyMatch(new Predicate() { // from class: crlh
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
                            return crll.this.e.c(djrn.a((djrm) obj).a).n;
                        }
                    })) {
                        ensk d2 = crll.a.d();
                        d2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) d2).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 90, "UpsellLogic.java")).q("Do not show Google Tos as showGoogleTos is false");
                        return Optional.empty();
                    }
                    if (Collection.EL.stream(crllVar2.d.o()).anyMatch(new Predicate() { // from class: crlk
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
                            return crll.this.e.c(djrn.a((djrm) obj).a).u;
                        }
                    })) {
                        ensk d3 = crll.a.d();
                        d3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) d3).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 95, "UpsellLogic.java")).q("ToS prompting is disabled.");
                        return Optional.empty();
                    }
                    if (!crllVar2.d()) {
                        ensk d4 = crll.a.d();
                        d4.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) d4).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 100, "UpsellLogic.java")).q("Not ready to show Google Tos");
                        return Optional.empty();
                    }
                    Iterator it = crllVar2.d.o().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (crllVar2.f.a(djrn.a((djrm) it.next()).a)) {
                            if (crllVar2.b.q("should_show_rcs_default_on_prompt", false)) {
                                ensk d5 = crll.a.d();
                                d5.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) d5).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 105, "UpsellLogic.java")).q("Do not show Google Tos as Legal FYI is requested");
                                return Optional.empty();
                            }
                        }
                    }
                    if (crllVar2.b()) {
                        ensk d6 = crll.a.d();
                        d6.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) d6).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 110, "UpsellLogic.java")).q("Show Google Tos as Constellation requested");
                        return Optional.of(clxx.BOTTOMSHEET);
                    }
                    if (!crllVar2.a()) {
                        return Optional.of(clxx.BOTTOMSHEET);
                    }
                    ensk d7 = crll.a.d();
                    d7.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) d7).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 115, "UpsellLogic.java")).q("Don't Show Google Tos as user already accepted");
                    return Optional.empty();
                }
            }, crllVar.g).h(new emwl() { // from class: crlj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Optional) obj).isPresent());
                }
            }, crllVar.h);
        } else {
            if (crll.c()) {
                ensk d = crll.a.d();
                d.Y(ente.a, "Bugle");
                ((enrr) ((enrr) d).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 126, "UpsellLogic.java")).q("Show Google Tos due to logic override");
                e = elfo.e(Optional.of(clxx.BOTTOMSHEET));
            } else if (((Boolean) crlm.a.e()).booleanValue()) {
                ensk d2 = crll.a.d();
                d2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) d2).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 131, "UpsellLogic.java")).q("ToS prompting is disabled.");
                e = elfo.e(Optional.empty());
            } else if (crllVar.d()) {
                ensk d3 = crll.a.d();
                d3.Y(ente.a, "Bugle");
                ((enrr) ((enrr) d3).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "isLegalFyiFlowRequested", 183, "UpsellLogic.java")).q("Using enableLegalFyiFlow flag from phenotype instead.");
                if (djai.G() && crllVar.b.q("should_show_rcs_default_on_prompt", false)) {
                    ensk d4 = crll.a.d();
                    d4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) d4).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 141, "UpsellLogic.java")).q("Do not show Google Tos as Legal FYI is requested");
                    e = elfo.e(Optional.empty());
                } else if (crllVar.b()) {
                    ensk d5 = crll.a.d();
                    d5.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) d5).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 146, "UpsellLogic.java")).q("Show Google Tos as Constellation requested");
                    e = elfo.e(Optional.of(clxx.BOTTOMSHEET));
                } else if (crllVar.a()) {
                    ensk d6 = crll.a.d();
                    d6.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) d6).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 151, "UpsellLogic.java")).q("Don't Show Google Tos as user already accepted");
                    e = elfo.e(Optional.empty());
                } else {
                    e = elfo.e(Optional.of(clxx.BOTTOMSHEET));
                }
            } else {
                ensk d7 = crll.a.d();
                d7.Y(ente.a, "Bugle");
                ((enrr) ((enrr) d7).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 136, "UpsellLogic.java")).q("Not ready to show Google Tos");
                e = elfo.e(Optional.empty());
            }
            h = e.h(new emwl() { // from class: crlj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Optional) obj).isPresent());
                }
            }, crllVar.c);
        }
        final elfl elflVar = h;
        final elfl e2 = e();
        final crln crlnVar = this.g;
        crlnVar.getClass();
        final elfl h2 = elfo.g(new Callable() { // from class: clyg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return crln.this.b();
            }
        }, this.d).h(new emwl() { // from class: clyh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cskc cskcVar = clyt.a;
                return optional.isPresent() ? Optional.of(Long.valueOf(((Date) optional.get()).getTime())) : Optional.empty();
            }
        }, this.e);
        final elfl d8 = this.c.d();
        return elfo.m(elflVar, e2, h2, d8).a(new Callable() { // from class: clyk
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
            
                if (r0 != false) goto L59;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 402
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.clyk.call():java.lang.Object");
            }
        }, this.e);
    }

    public final elfl e() {
        final crln crlnVar = this.g;
        crlnVar.getClass();
        return elfo.g(new Callable() { // from class: clyl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(crln.this.a());
            }
        }, this.d);
    }
}
