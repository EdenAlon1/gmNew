package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crhb implements crgp {
    private final ffbr a;
    private final csmk b;

    public crhb(ffbr ffbrVar, csmk csmkVar) {
        ffbrVar.getClass();
        csmkVar.getClass();
        this.a = ffbrVar;
        this.b = csmkVar;
    }

    @Override // defpackage.crgp
    public final Object a(Set set, ffgu ffguVar) {
        final cpqo cpqoVar = (cpqo) this.a.b();
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.b(((crgw) it.next()).a));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            str.getClass();
            if (str.length() > 0) {
                arrayList2.add(obj);
            }
        }
        final Set ar = ffdx.ar(arrayList2);
        comu c = comv.c();
        c.d(comb.TACHYON_PHONE);
        c.f(chod.a);
        c.b(true);
        if (((atsg) cpqoVar.h.b()).a()) {
            c.c(new Supplier() { // from class: cpqi
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new cpqp();
                }
            });
        }
        Object c2 = fgfz.c(((comy) cpqoVar.f.b()).a(c.a()).g().i(new eroh() { // from class: cpqj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                Stream stream = Collection.EL.stream(((enhk) obj2).entrySet());
                final Set set2 = ar;
                Stream filter = stream.filter(new Predicate() { // from class: cpqb
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
                        entd entdVar = cpqo.a;
                        return !set2.contains(((Map.Entry) obj3).getKey());
                    }
                }).filter(new Predicate() { // from class: cpqc
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
                        Map.Entry entry = (Map.Entry) obj3;
                        entd entdVar = cpqo.a;
                        return entry.getValue() != null && cpqo.a((chod) entry.getValue());
                    }
                });
                final cpqo cpqoVar2 = cpqo.this;
                Stream map = filter.map(new Function() { // from class: cpqd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        String str2 = (String) ((Map.Entry) obj3).getKey();
                        cpqo cpqoVar3 = cpqo.this;
                        if (cpqoVar3.e.isEmpty()) {
                            ((ensz) ((ensz) cpqo.a.j()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "disable", 170, "TachygramLifecycleManager.java")).q("Tachygram is active but no tachyon receiver manager provided");
                            return elfo.e(null);
                        }
                        ((cilk) cpqoVar3.e.get()).h(str2);
                        return elfo.e(null);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                final engw engwVar = (engw) map.collect(endq.a);
                return elfo.j(engwVar).a(new Callable() { // from class: cpqe
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = cpqo.a;
                        return Boolean.valueOf(!engw.this.isEmpty());
                    }
                }, cpqoVar2.c);
            }
        }, cpqoVar.c), ffguVar);
        return c2 == ffhh.a ? c2 : ffcu.a;
    }

    @Override // defpackage.crgp
    public final Object b(crgw crgwVar, ffgu ffguVar) {
        final String b = this.b.b(crgwVar.a);
        if (b.length() <= 0) {
            throw new IllegalArgumentException("Msisdn in ACS configuration is empty.");
        }
        final cpqo cpqoVar = (cpqo) this.a.b();
        Object c = fgfz.c((TextUtils.isEmpty(b) ? elfo.d(new IllegalStateException("Cannot determine if Tachygram is active. No msisdn available")) : cpqoVar.b.a(b).a().h(new emwl() { // from class: cpqh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(cpqo.a((chod) obj));
            }
        }, cpqoVar.c)).i(new eroh() { // from class: cpqa
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl i;
                if (((Boolean) obj).booleanValue()) {
                    return elfo.e(false);
                }
                final String str = b;
                final cpqo cpqoVar2 = cpqo.this;
                ((ensz) ((ensz) cpqo.a.h()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "enableTransport", 89, "TachygramLifecycleManager.java")).q("Forcing Tachyon phone registration to enable Tachygram.");
                cfva cfvaVar = aoqm.a;
                if (((Boolean) new aopi().get()).booleanValue()) {
                    return cpqoVar2.d.c(((avkc) cpqoVar2.g.b()).a(str, false)).i(new eroh() { // from class: cpqk
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return cpqo.this.b(str);
                        }
                    }, cpqoVar2.c).h(new emwl() { // from class: cpql
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cpqo.a;
                            return true;
                        }
                    }, cpqoVar2.c);
                }
                final chfz chfzVar = cpqoVar2.d;
                if (chfzVar.h()) {
                    chfz.a.m("Tachyon phone registration flag enabled");
                    chfzVar.i.set(true);
                    elfl e = elfo.e(str);
                    if (TextUtils.isEmpty(str)) {
                        chfz.a.r("No phone number provided for registration. Attempting to acquire from profile service");
                        if (chfzVar.d.isConnected()) {
                            ensk j = chfz.b.j();
                            j.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 137, "TachyonPhoneRegistrationManager.java")).q("Forcing Tachyon phone registration for all self identities");
                            i = chfzVar.b();
                        } else {
                            chfz.a.r("Config update received but no phone number could be acquired");
                            i = elfo.e(null);
                        }
                    } else {
                        i = e.i(new eroh() { // from class: chfx
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                chfz chfzVar2 = chfz.this;
                                String str2 = (String) obj2;
                                if (!chfzVar2.h()) {
                                    return elfo.d(new IllegalStateException("Tachyon phone registration flag disabled"));
                                }
                                chfz.a.p("Ensuring Tachyon phone registration");
                                return chfzVar2.c.d(str2, 12).i(new chfr(chfzVar2), chfzVar2.g).h(new emwl() { // from class: chfs
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        cskc cskcVar = chfz.a;
                                        return null;
                                    }
                                }, erpp.a).e(fedn.class, new emwl() { // from class: chft
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        chfz.a.s("Failed to ensure Tachyon registration", (fedn) obj3);
                                        return null;
                                    }
                                }, erpp.a);
                            }
                        }, chfzVar.g);
                    }
                } else {
                    chfz.a.m("Tachyon phone registration flag disabled");
                    i = elfo.e(null);
                }
                return i.i(new eroh() { // from class: cpqm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return cpqo.this.b(str);
                    }
                }, cpqoVar2.c).h(new emwl() { // from class: cpqn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = cpqo.a;
                        return true;
                    }
                }, cpqoVar2.c);
            }
        }, cpqoVar.c).e(cgyb.class, new emwl() { // from class: cpqf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) cpqo.a.j()).g((cgyb) obj)).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "enableTransport", 118, "TachygramLifecycleManager.java")).q("Failed to enable Tachygram for invalid phone number");
                return false;
            }
        }, cpqoVar.c), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    @Override // defpackage.crgp
    public final boolean c(crgw crgwVar) {
        crgwVar.getClass();
        ekzz f = eleg.f("TachygramChatTransportRegistrar#isTransportEligible");
        try {
            djtp djtpVar = crgwVar.a;
            boolean z = false;
            if (djtpVar.N()) {
                if (this.b.b(djtpVar).length() > 0) {
                    z = true;
                }
            }
            ffig.a(f, null);
            return z;
        } finally {
        }
    }
}
