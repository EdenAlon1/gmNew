package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahjj implements ahik {
    public static final cskc a = cskc.g("BugleSuperSort", "SuperSortSettingsDataServiceImpl");
    public final errl b;
    public final comc c;
    public final cxkb d;
    public final ejvp e;
    public final ffbr f;
    public final cqoh g;
    public final afar h;
    private final ejvb i;

    public ahjj(errl errlVar, ffsk ffskVar, ffsk ffskVar2, comc comcVar, ejvb ejvbVar, ejvp ejvpVar, ffbr ffbrVar, cqoh cqohVar, afar afarVar) {
        this.b = errlVar;
        this.c = comcVar;
        this.i = ejvbVar;
        this.e = ejvpVar;
        this.f = ffbrVar;
        this.g = cqohVar;
        this.h = afarVar;
        this.d = new cxkk(comcVar, new Function() { // from class: ahio
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                akue b = akue.b(((ahib) obj).c);
                return b == null ? akue.UNSET : b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BiFunction() { // from class: ahip
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ahia ahiaVar = (ahia) ((ahib) obj).toBuilder();
                ahiaVar.copyOnWrite();
                ahib ahibVar = (ahib) ahiaVar.instance;
                ahibVar.c = ((akue) obj2).a();
                ahibVar.b |= 1;
                return (ahib) ahiaVar.build();
            }
        }, ffskVar, ffskVar2, Optional.empty());
    }

    public static SuperSortLabel o(ahib ahibVar) {
        eqjv b = eqjv.b(ahibVar.d);
        if (b == null) {
            b = eqjv.UNKNOWN_SUPER_SORT_LABEL;
        }
        SuperSortLabel a2 = aeya.a(b);
        return a2 == SuperSortLabel.UNKNOWN ? aewg.c() : a2;
    }

    public static boolean q(ahib ahibVar) {
        return ahibVar.f > 0;
    }

    @Override // defpackage.ahik
    public final ejuh a() {
        return new ejuy(this.i, new eros() { // from class: ahjb
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                ahjj ahjjVar = ahjj.this;
                return new erph(ahjjVar.c.h().h(new emwl() { // from class: ahiq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ahjj.o((ahib) obj);
                    }
                }, ahjjVar.b));
            }
        }, "super_sort_default_label_key");
    }

    @Override // defpackage.ahik
    public final elfl b() {
        return this.d.b();
    }

    @Override // defpackage.ahik
    public final elfl c() {
        return this.c.j(new emwl() { // from class: ahjc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahib ahibVar = (ahib) obj;
                ahia ahiaVar = (ahia) ahibVar.toBuilder();
                long j = ahibVar.h + 1;
                ahiaVar.copyOnWrite();
                ahib ahibVar2 = (ahib) ahiaVar.instance;
                ahibVar2.b |= 32;
                ahibVar2.h = j;
                return (ahib) ahiaVar.build();
            }
        }).h(new emwl() { // from class: ahjd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl d() {
        return b().h(new emwl() { // from class: ahiu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cxkc cxkcVar = (cxkc) obj;
                boolean z = true;
                if (!cxkcVar.c() && cxkcVar.e()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, erpp.a);
    }

    @Override // defpackage.ahik
    public final elfl e() {
        return this.c.h().i(new eroh() { // from class: ahji
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ahjj ahjjVar = ahjj.this;
                final ahib ahibVar = (ahib) obj;
                cxkc a2 = ahjjVar.d.a(ahibVar);
                if (!aewg.h() || !a2.d() || a2.c() || !ahjj.q(ahibVar)) {
                    return elfo.e(new ahii(a2, ahibVar.h, ahjj.o(ahibVar)));
                }
                ((aexe) ahjjVar.f.b()).b(akue.CONSENT_ENABLED_FEATURE);
                return ((cxkk) ahjjVar.d).c(akue.CONSENT_ENABLED_FEATURE).i(new eroh() { // from class: ahje
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ahjj.this.d.b();
                    }
                }, ahjjVar.b).h(new emwl() { // from class: ahjf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ahib ahibVar2 = ahib.this;
                        return new ahii((cxkc) obj2, ahibVar2.h, ahjj.o(ahibVar2));
                    }
                }, ahjjVar.b);
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl f() {
        return this.c.j(new emwl() { // from class: ahjg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahib ahibVar = (ahib) obj;
                ahia ahiaVar = (ahia) ahibVar.toBuilder();
                long n = ahjj.this.n(ahibVar.f);
                ahiaVar.copyOnWrite();
                ahib ahibVar2 = (ahib) ahiaVar.instance;
                ahibVar2.b |= 8;
                ahibVar2.f = n;
                return (ahib) ahiaVar.build();
            }
        }).h(new emwl() { // from class: ahjh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj.this.p();
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl g() {
        return this.c.j(new emwl() { // from class: ahil
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj ahjjVar = ahjj.this;
                ahib ahibVar = (ahib) obj;
                cxkc a2 = ahjjVar.d.a(ahibVar);
                if (a2.b(akue.CONSENT_ENABLED_FEATURE)) {
                    ((aexe) ahjjVar.f.b()).b(akue.CONSENT_ENABLED_FEATURE);
                }
                ahia ahiaVar = (ahia) ahibVar.toBuilder();
                akue akueVar = akue.CONSENT_ENABLED_FEATURE;
                if (!a2.b(akueVar) && (akueVar = akue.b(ahibVar.c)) == null) {
                    akueVar = akue.UNSET;
                }
                ahiaVar.copyOnWrite();
                ahib ahibVar2 = (ahib) ahiaVar.instance;
                ahibVar2.c = akueVar.a();
                ahibVar2.b |= 1;
                long n = ahjjVar.n(ahibVar.f);
                ahiaVar.copyOnWrite();
                ahib ahibVar3 = (ahib) ahiaVar.instance;
                ahibVar3.b |= 8;
                ahibVar3.f = n;
                return (ahib) ahiaVar.build();
            }
        }).h(new emwl() { // from class: ahiv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj.this.p();
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl h() {
        return this.c.j(new emwl() { // from class: ahiz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj ahjjVar = ahjj.this;
                ahib ahibVar = (ahib) obj;
                cxkc a2 = ahjjVar.d.a(ahibVar);
                akue akueVar = akue.CONSENT_NOTICE_SHOWN;
                if (!a2.b(akueVar)) {
                    return ahibVar;
                }
                akue b = akue.b(ahibVar.c);
                if (b == null) {
                    b = akue.UNSET;
                }
                if (b == akueVar || ahibVar.e > 0) {
                    return ahibVar;
                }
                ((aexe) ahjjVar.f.b()).b(akue.CONSENT_NOTICE_SHOWN);
                ahia ahiaVar = (ahia) ahibVar.toBuilder();
                akue akueVar2 = akue.CONSENT_NOTICE_SHOWN;
                ahiaVar.copyOnWrite();
                ahib ahibVar2 = (ahib) ahiaVar.instance;
                ahibVar2.c = akueVar2.a();
                ahibVar2.b |= 1;
                long epochMilli = ahjjVar.g.f().toEpochMilli();
                ahiaVar.copyOnWrite();
                ahib ahibVar3 = (ahib) ahiaVar.instance;
                ahibVar3.b |= 4;
                ahibVar3.e = epochMilli;
                return (ahib) ahiaVar.build();
            }
        }).h(new emwl() { // from class: ahja
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj.this.p();
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl i(final SuperSortLabel superSortLabel) {
        ((aexe) this.f.b()).c(superSortLabel, 3);
        return this.c.j(new emwl() { // from class: ahim
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahia ahiaVar = (ahia) ((ahib) obj).toBuilder();
                eqjv b = aeya.b(SuperSortLabel.this);
                ahiaVar.copyOnWrite();
                ahib ahibVar = (ahib) ahiaVar.instance;
                ahibVar.d = b.i;
                ahibVar.b |= 2;
                if (aewg.f()) {
                    ahiaVar.copyOnWrite();
                    ahib ahibVar2 = (ahib) ahiaVar.instance;
                    ahibVar2.g = 2;
                    ahibVar2.b |= 16;
                }
                return (ahib) ahiaVar.build();
            }
        }).h(new emwl() { // from class: ahin
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj.this.e.a(elfo.e(null), "super_sort_default_label_key");
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl j() {
        return !aewg.f() ? elfo.e(null) : this.c.j(new emwl() { // from class: ahiw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahib ahibVar = (ahib) obj;
                eqjv b = eqjv.b(ahibVar.d);
                if (b == null) {
                    b = eqjv.UNKNOWN_SUPER_SORT_LABEL;
                }
                ahjj ahjjVar = ahjj.this;
                SuperSortLabel a2 = aeya.a(b);
                if (a2 != SuperSortLabel.UNKNOWN) {
                    int a3 = eqim.a(ahibVar.g);
                    ((aexe) ahjjVar.f.b()).c(a2, a3 != 0 ? a3 : 1);
                    return ahibVar;
                }
                SuperSortLabel c = aewg.c();
                if (c == SuperSortLabel.PERSONAL) {
                    brry a4 = brsd.a();
                    a4.z("setInitialDefaultLabelInternal");
                    a4.d(new Function() { // from class: ahis
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brsc brscVar = (brsc) obj2;
                            brscVar.c(SuperSortLabel.PERSONAL.i);
                            return brscVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (!a4.b().T()) {
                        c = SuperSortLabel.ALL;
                    }
                }
                ((aexe) ahjjVar.f.b()).c(c, 2);
                ahia ahiaVar = (ahia) ahibVar.toBuilder();
                eqjv b2 = aeya.b(c);
                ahiaVar.copyOnWrite();
                ahib ahibVar2 = (ahib) ahiaVar.instance;
                ahibVar2.d = b2.i;
                ahibVar2.b |= 2;
                ahiaVar.copyOnWrite();
                ahib ahibVar3 = (ahib) ahiaVar.instance;
                ahibVar3.g = 1;
                ahibVar3.b |= 16;
                return (ahib) ahiaVar.build();
            }
        }).h(new emwl() { // from class: ahix
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj.this.e.a(elfo.e(null), "super_sort_default_label_key");
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl k() {
        return !aewg.h() ? elfo.e(false) : this.c.h().i(new eroh() { // from class: ahit
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ahjj ahjjVar = ahjj.this;
                ahib ahibVar = (ahib) obj;
                cxkc a2 = ahjjVar.d.a(ahibVar);
                csjb a3 = ahjj.a.a();
                a3.v("Checking whether we need to show notice based on current state");
                a3.A("consentState", a2.a());
                a3.r();
                if (a2.c() || a2.e()) {
                    ahjj.a.m("Feature already enabled, not checking further.");
                    return elfo.e(false);
                }
                if (ahjj.q(ahibVar)) {
                    ahjj.a.m("Notice already dismissed.");
                    return elfo.e(false);
                }
                ahjj.a.m("Consent not shown, checking if enough messages have been categorized.");
                return ahjjVar.h.b();
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl l(boolean z) {
        ((aexe) this.f.b()).b(z ? akue.USER_ENABLED_FEATURE : akue.USER_DISABLED_FEATURE);
        return ((cxkk) this.d).c(z ? akue.USER_ENABLED_FEATURE : akue.USER_DISABLED_FEATURE).h(new emwl() { // from class: ahiy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                ahjj.this.p();
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ahik
    public final elfl m(final int i) {
        return this.c.h().h(new emwl() { // from class: ahir
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ahjj ahjjVar = ahjj.this;
                ahib ahibVar = (ahib) obj;
                cxkc a2 = ahjjVar.d.a(ahibVar);
                if (!a2.d() || !a2.c()) {
                    return false;
                }
                return Boolean.valueOf(Duration.between(Instant.ofEpochMilli(ahibVar.f), ahjjVar.g.f()).compareTo(Duration.ofDays((long) i)) > 0);
            }
        }, this.b);
    }

    public final long n(long j) {
        return j > 0 ? j : this.g.f().toEpochMilli();
    }

    public final void p() {
        this.e.a(elfo.e(null), "super_sort_preference_key");
        this.e.a(elfo.e(null), "ready_status_changed");
    }
}
