package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoks implements aoku {
    private static final enru h = enru.c("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity");
    public final emyl a;
    public final emyl b;
    public final emyl c;
    public final emyl d;
    public final emyl e;
    public final emyl f;
    final Throwable g;
    private final fazb i;
    private final emyl j;
    private final emyl k;
    private final emyl l;
    private final emyl m;
    private final emyl n;
    private final emyl o;
    private final emyl p;
    private boolean q;

    public aoks(fazb fazbVar, final ffbr ffbrVar, final ffbr ffbrVar2, final aoku aokuVar, emyl emylVar) {
        this.q = false;
        this.i = fazbVar;
        if (aokuVar instanceof aoks) {
            aoks aoksVar = (aoks) aokuVar;
            this.a = aoksVar.a;
            this.c = aoksVar.c;
            this.d = aoksVar.d;
            this.j = aoksVar.j;
            this.e = aoksVar.e;
            this.f = aoksVar.f;
            this.k = aoksVar.k;
            this.l = aoksVar.l;
            this.m = aoksVar.m;
            this.b = emylVar;
            this.g = aoksVar.g;
        } else {
            this.a = new emyl() { // from class: aojv
                @Override // defpackage.emyl
                public final Object get() {
                    String j = aoku.this.j();
                    j.getClass();
                    return j;
                }
            };
            this.c = new emyl() { // from class: aojz
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.G();
                }
            };
            this.d = new emyl() { // from class: aoka
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.c();
                }
            };
            this.j = new emyl() { // from class: aokb
                @Override // defpackage.emyl
                public final Object get() {
                    String l = aoku.this.l();
                    l.getClass();
                    return l;
                }
            };
            this.e = new emyl() { // from class: aokc
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.o();
                }
            };
            this.f = new emyl() { // from class: aojn
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.e();
                }
            };
            this.k = new emyl() { // from class: aojo
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.a();
                }
            };
            this.l = new emyl() { // from class: aojp
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.f();
                }
            };
            this.m = new emyl() { // from class: aojq
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.g();
                }
            };
            this.b = emylVar;
            this.g = new RuntimeException();
        }
        this.n = new emyl() { // from class: aokd
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(((ctvb) ffbrVar.b()).H((String) aoks.this.a.get()));
            }
        };
        this.p = new emyl() { // from class: aojw
            @Override // defpackage.emyl
            public final Object get() {
                return ((cfsk) ffbrVar2.b()).a((String) aoks.this.a.get());
            }
        };
        this.o = new emyl() { // from class: aojy
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(((cfsk) ffbrVar2.b()).b((String) aoks.this.a.get()));
            }
        };
    }

    private final void J(String str, emyl emylVar, emyl emylVar2, Function function) {
        Object apply;
        Object apply2;
        if (!((Boolean) dizg.o().a.ad.a()).booleanValue() || this.q) {
            return;
        }
        Double d = (Double) dizg.o().a.ae.a();
        double doubleValue = d.doubleValue();
        if (doubleValue <= eobe.a) {
            ensk g = h.g();
            g.Y(ente.a, "Bugle");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 643, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging because ratio=%s%%", d);
            return;
        }
        if (doubleValue < 1.0d && ThreadLocalRandom.current().nextDouble() <= doubleValue) {
            ensk g2 = h.g();
            g2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) g2).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 646, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging (ratio=%s%%)", d);
            return;
        }
        String str2 = (String) emylVar.get();
        String str3 = (String) emylVar2.get();
        apply = function.apply(str2);
        apply2 = function.apply(str3);
        if (Objects.equals(apply, apply2)) {
            ensk g3 = h.g();
            g3.Y(ente.a, "Bugle");
            ((enrr) ((enrr) g3).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 653, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging because both returned %s", str2);
            return;
        }
        this.q = true;
        final aolq aolqVar = (aolq) this.i.b();
        ayvm a = ((ayvn) aolqVar.c.b()).a();
        List m = ((ctwb) aolqVar.d.b()).m();
        Stream map = Collection.EL.stream(m).map(new Function() { // from class: aoln
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aolq.this.a(((ctwi) obj).p());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        engw engwVar2 = (engw) Collection.EL.stream(m).map(new Function() { // from class: aolo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aolq.this.a(((ctwi) obj).s());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }).collect(endq.a);
        Locale c = ctid.c(aolqVar.b);
        String upperCase = c != null ? c.getCountry().toUpperCase(c) : "";
        String a2 = ((ctve) aolqVar.e.b()).a();
        ctvf a3 = aolqVar.a(((ctvb) aolqVar.f.b()).r());
        ensk j = aolq.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) ((enrr) j).g(this.g);
        enrrVar.aa(ensy.SMALL);
        enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentityDifferenceReporter", "logDifference", 112, "MessagingIdentityDifferenceReporter.java");
        evhq evhqVar = new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, str);
        evhq b = aolq.b(a, str2);
        evhq b2 = aolq.b(a, str3);
        evhq b3 = aolq.b(a, n());
        evhq evhqVar2 = new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, (String) f().map(new Function() { // from class: aolp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ctvf) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }).orElse(null));
        String name = a().name();
        evhp evhpVar = evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA;
        enrrVar2.P("LazyMessagingIdentity#%s has different with flag on than flag off: off=[%s], on=[%s], raw=[%s], country=[%s], type=[%s],  localeCountryCode=[%s], networkCountryCodeDeprecated=[%s], simCallCodes=[%s], networkCallCodes=[%s], settingsCallCodeCode=[%s]", evhqVar, b, b2, b3, evhqVar2, new evhq(evhpVar, name), new evhq(evhpVar, upperCase), new evhq(evhpVar, a2), new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, String.valueOf(engwVar2)), new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, String.valueOf(engwVar)), new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, a3.toString()));
    }

    @Override // defpackage.aoku
    public final boolean A() {
        return aoqz.PENPAL_BOT.equals(a());
    }

    @Override // defpackage.aoku
    public final boolean B() {
        return aoqz.BOT.equals(a());
    }

    @Override // defpackage.aoku
    public final boolean C() {
        return a().equals(aoqz.SATELLITE_ESP);
    }

    @Override // defpackage.aoku
    public final boolean D() {
        aoqz a = a();
        return aoqz.PHONE_SHORT_WITH_COUNTRY.equals(a) || aoqz.PHONE_SHORT_NO_COUNTRY.equals(a);
    }

    @Override // defpackage.aoku
    public final boolean E() {
        return a().equals(aoqz.UNKNOWN_SENDER) || x();
    }

    @Override // defpackage.aoku
    public final boolean F() {
        aoqz a = a();
        return (a == aoqz.UNKNOWN_SENDER || a == aoqz.UNKNOWN_DESTINATION_TYPE || a == aoqz.PHONE_INVALID_TOO_SHORT || a == aoqz.PHONE_INVALID_TOO_LONG || a == aoqz.PHONE_INVALID_LENGTH || a == aoqz.PHONE_INVALID_COUNTRY_CODE || a == aoqz.UNRECOGNIZED || a == aoqz.UNKNOWN_DIALABLE || x()) ? false : true;
    }

    @Override // defpackage.aoku
    @Deprecated
    public final aokr G() {
        return (aokr) this.c.get();
    }

    @Override // defpackage.aoku
    public final aokr H(boolean z) {
        q("getDisplayDestination", this.b, new emyl() { // from class: aokg
            @Override // defpackage.emyl
            public final Object get() {
                return ((aokr) aoks.this.c.get()).a;
            }
        });
        return z ? (aokr) this.c.get() : new aokr((String) this.b.get());
    }

    @Override // defpackage.aoku
    public final void I() {
        j();
        n();
        G();
        c();
        o();
        e();
        a();
        f();
        g();
    }

    @Override // defpackage.aoku
    public final aoqz a() {
        return (aoqz) this.k.get();
    }

    @Override // defpackage.aoku
    public final Optional b() {
        return (Optional) this.p.get();
    }

    @Override // defpackage.aoku
    @Deprecated
    public final Optional c() {
        return (Optional) this.d.get();
    }

    @Override // defpackage.aoku
    public final Optional d(boolean z) {
        q("getInternationalDestination", this.b, new emyl() { // from class: aokf
            @Override // defpackage.emyl
            public final Object get() {
                return (String) ((Optional) aoks.this.d.get()).orElse(null);
            }
        });
        return z ? (Optional) this.d.get() : Optional.ofNullable((String) this.b.get());
    }

    @Override // defpackage.aoku
    public final Optional e() {
        return (Optional) this.f.get();
    }

    @Override // defpackage.aoku
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aoku) {
            return Objects.equals(o(), ((aoku) obj).o());
        }
        return false;
    }

    @Override // defpackage.aoku
    public final Optional f() {
        return (Optional) this.l.get();
    }

    @Override // defpackage.aoku
    public final Optional g() {
        return (Optional) this.m.get();
    }

    @Override // defpackage.aoku
    @Deprecated
    public final String h() {
        q("getLegacyFallbackRcsDestination", this.b, new emyl() { // from class: aokj
            @Override // defpackage.emyl
            public final Object get() {
                return (String) ((Optional) aoks.this.f.get()).map(new aoju()).orElse(null);
            }
        });
        Optional optional = (Optional) this.f.get();
        return optional.isPresent() ? ((awui) optional.get()).d : (String) this.b.get();
    }

    @Override // defpackage.aoku
    public final int hashCode() {
        return o().hashCode();
    }

    @Override // defpackage.aoku
    public final String i(boolean z) {
        if (z) {
            return h();
        }
        q("getLegacyFallbackRcsDestination", this.b, new emyl() { // from class: aoke
            @Override // defpackage.emyl
            public final Object get() {
                aoks aoksVar = aoks.this;
                return (String) ((Optional) aoksVar.f.get()).map(new aoju()).orElse((String) aoksVar.b.get());
            }
        });
        return (String) this.b.get();
    }

    @Override // defpackage.aoku
    @Deprecated
    public final String j() {
        return (String) this.a.get();
    }

    @Override // defpackage.aoku
    public final String k(boolean z) {
        q("getLocalDestination", this.b, this.a);
        return (String) (z ? this.a : this.b).get();
    }

    @Override // defpackage.aoku
    public final String l() {
        q("getNormalizedDestination", this.b, this.j);
        return (String) this.j.get();
    }

    @Override // defpackage.aoku
    public final String m(boolean z) {
        q("getNormalizedDestination", this.b, this.j);
        return z ? (String) this.j.get() : (String) this.b.get();
    }

    @Override // defpackage.aoku
    public final String n() {
        return (String) this.b.get();
    }

    @Override // defpackage.aoku
    @Deprecated
    public final String o() {
        String str = (String) this.e.get();
        return str == null ? emxe.b((String) this.b.get()) : str;
    }

    @Override // defpackage.aoku
    public final String p(boolean z) {
        q("getSerializationContextFormat", this.b, this.e);
        return !z ? (String) this.b.get() : o();
    }

    public final void q(String str, emyl emylVar, emyl emylVar2) {
        J(str, emylVar, emylVar2, Function$CC.identity());
    }

    @Override // defpackage.aoku
    public final boolean r() {
        aoqz a = a();
        switch (a) {
            case UNKNOWN_DESTINATION_TYPE:
            case EMAIL:
            case BOT:
            case UNKNOWN_SENDER:
            case SATELLITE_ESP:
            case PENPAL_BOT:
            case ALPHA_SHORT_NO_COUNTRY:
            case ALPHA_SHORT_WITH_COUNTRY:
            case UNRECOGNIZED:
                return false;
            case PHONE_E164:
            case PHONE_SHORT_NO_COUNTRY:
            case PHONE_SHORT_WITH_COUNTRY:
            case PHONE_EMERGENCY:
            case PHONE_LOCAL_WITH_COUNTRY:
            case PHONE_LOCAL_NO_COUNTRY:
            case PHONE_NATIONAL:
            case PHONE_WITH_COUNTRY:
            case PHONE_WITH_IDD:
            case PHONE_WITH_PLUS:
            case PHONE_INVALID_TOO_SHORT:
            case PHONE_INVALID_TOO_LONG:
            case PHONE_INVALID_LENGTH:
            case PHONE_INVALID_COUNTRY_CODE:
            case UNKNOWN_DIALABLE:
                return true;
            default:
                throw new IllegalArgumentException("unknown destination type ".concat(String.valueOf(a.name())));
        }
    }

    @Override // defpackage.aoku
    public final boolean s() {
        aoqz a = a();
        switch (a) {
            case UNKNOWN_DESTINATION_TYPE:
            case EMAIL:
            case BOT:
            case UNKNOWN_SENDER:
            case PHONE_SHORT_NO_COUNTRY:
            case PHONE_SHORT_WITH_COUNTRY:
            case PHONE_EMERGENCY:
            case PHONE_LOCAL_WITH_COUNTRY:
            case PHONE_LOCAL_NO_COUNTRY:
            case SATELLITE_ESP:
            case ALPHA_SHORT_NO_COUNTRY:
            case ALPHA_SHORT_WITH_COUNTRY:
            case PHONE_INVALID_TOO_SHORT:
            case PHONE_INVALID_TOO_LONG:
            case PHONE_INVALID_LENGTH:
            case PHONE_INVALID_COUNTRY_CODE:
            case UNKNOWN_DIALABLE:
            case UNRECOGNIZED:
                return false;
            case PHONE_E164:
            case PHONE_NATIONAL:
            case PENPAL_BOT:
            case PHONE_WITH_COUNTRY:
            case PHONE_WITH_IDD:
            case PHONE_WITH_PLUS:
                return true;
            default:
                throw new IllegalArgumentException("unknown destination type ".concat(String.valueOf(a.name())));
        }
    }

    @Override // defpackage.aoku
    public final boolean t() {
        aoqz a = a();
        return a.equals(aoqz.ALPHA_SHORT_WITH_COUNTRY) || a.equals(aoqz.ALPHA_SHORT_NO_COUNTRY);
    }

    @Override // defpackage.aoku
    public final String toString() {
        return o();
    }

    @Override // defpackage.aoku
    public final boolean u() {
        return aoqz.EMAIL.equals(a());
    }

    @Override // defpackage.aoku
    public final boolean v() {
        return ((Boolean) this.n.get()).booleanValue();
    }

    @Override // defpackage.aoku
    public final boolean w() {
        return ((Boolean) this.o.get()).booleanValue();
    }

    @Override // defpackage.aoku
    @Deprecated
    public final boolean x() {
        return TextUtils.isEmpty((CharSequence) this.a.get());
    }

    @Override // defpackage.aoku
    public final boolean y(boolean z) {
        J("isEmpty", this.b, this.a, new Function() { // from class: aokh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                return Boolean.valueOf(str != null ? str.isEmpty() : true);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return z ? TextUtils.isEmpty((CharSequence) this.a.get()) : TextUtils.isEmpty((CharSequence) this.b.get());
    }

    @Override // defpackage.aoku
    public final boolean z() {
        aoqz a = a();
        return a == aoqz.PHONE_E164 || a == aoqz.PHONE_WITH_COUNTRY || a == aoqz.PHONE_WITH_IDD || a == aoqz.PHONE_WITH_PLUS;
    }

    @Deprecated
    public aoks(fazb fazbVar, final ffbr ffbrVar, final ffbr ffbrVar2, final aoku aokuVar, final String str) {
        this.q = false;
        this.i = fazbVar;
        if (aokuVar instanceof aoks) {
            aoks aoksVar = (aoks) aokuVar;
            this.a = aoksVar.a;
            this.c = aoksVar.c;
            this.d = aoksVar.d;
            this.j = aoksVar.j;
            this.e = aoksVar.e;
            this.f = aoksVar.f;
            this.k = aoksVar.k;
            this.l = aoksVar.l;
            this.m = aoksVar.m;
            this.b = new emyl() { // from class: aojm
                @Override // defpackage.emyl
                public final Object get() {
                    return str;
                }
            };
            this.g = aoksVar.g;
        } else {
            this.a = new emyl() { // from class: aokm
                @Override // defpackage.emyl
                public final Object get() {
                    String j = aoku.this.j();
                    j.getClass();
                    return j;
                }
            };
            this.c = new emyl() { // from class: aokn
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.G();
                }
            };
            this.d = new emyl() { // from class: aoko
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.c();
                }
            };
            this.j = new emyl() { // from class: aokp
                @Override // defpackage.emyl
                public final Object get() {
                    String l = aoku.this.l();
                    l.getClass();
                    return l;
                }
            };
            this.e = new emyl() { // from class: aokq
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.o();
                }
            };
            this.f = new emyl() { // from class: aojn
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.e();
                }
            };
            this.k = new emyl() { // from class: aojo
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.a();
                }
            };
            this.l = new emyl() { // from class: aojp
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.f();
                }
            };
            this.m = new emyl() { // from class: aojq
                @Override // defpackage.emyl
                public final Object get() {
                    return aoku.this.g();
                }
            };
            this.b = new emyl() { // from class: aojx
                @Override // defpackage.emyl
                public final Object get() {
                    return str;
                }
            };
            this.g = new RuntimeException();
        }
        this.n = new emyl() { // from class: aoki
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(((ctvb) ffbrVar.b()).H((String) aoks.this.a.get()));
            }
        };
        this.p = new emyl() { // from class: aokk
            @Override // defpackage.emyl
            public final Object get() {
                return ((cfsk) ffbrVar2.b()).a((String) aoks.this.a.get());
            }
        };
        this.o = new emyl() { // from class: aokl
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(((cfsk) ffbrVar2.b()).b((String) aoks.this.a.get()));
            }
        };
    }

    public aoks(fazb fazbVar, final ffbr ffbrVar, final ffbr ffbrVar2, final emyl emylVar, emyl emylVar2, emyl emylVar3, emyl emylVar4, emyl emylVar5, emyl emylVar6, emyl emylVar7, emyl emylVar8, emyl emylVar9, emyl emylVar10) {
        this.q = false;
        this.i = fazbVar;
        this.a = emylVar;
        this.b = emylVar2;
        this.c = emylVar7;
        this.d = emylVar3;
        this.j = emylVar4;
        this.e = emylVar5;
        this.f = emylVar6;
        this.k = emylVar8;
        this.l = emylVar9;
        this.m = emylVar10;
        this.n = new emyl() { // from class: aojr
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(((ctvb) ffbr.this.b()).H((String) emylVar.get()));
            }
        };
        this.p = new emyl() { // from class: aojs
            @Override // defpackage.emyl
            public final Object get() {
                return ((cfsk) ffbr.this.b()).a((String) emylVar.get());
            }
        };
        this.o = new emyl() { // from class: aojt
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(((cfsk) ffbr.this.b()).b((String) emylVar.get()));
            }
        };
        this.g = new RuntimeException();
    }
}
