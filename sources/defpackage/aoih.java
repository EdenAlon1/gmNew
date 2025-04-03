package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoih implements aobh {
    public final fazb a;
    public final fazb b;
    public final fazb c;
    public final fazb d;
    public final fazb e;
    private final fazb f;
    private final fazb g;

    public aoih(fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5, fazb fazbVar6, fazb fazbVar7) {
        this.a = fazbVar;
        this.b = fazbVar2;
        this.c = fazbVar3;
        this.d = fazbVar4;
        this.f = fazbVar5;
        this.g = fazbVar6;
        this.e = fazbVar7;
    }

    private final aoku C(final aoku aokuVar, final String str, final boolean z) {
        aoks a = ((aokt) this.g.b()).a(aokuVar, new emyl() { // from class: aogv
            @Override // defpackage.emyl
            public final Object get() {
                String d = cuxt.d(emxe.b(aokuVar.n()));
                if (aoqw.h(d)) {
                    return d;
                }
                if (!z && aoqw.j(d)) {
                    return d;
                }
                String str2 = str;
                aoih aoihVar = aoih.this;
                return ((ctvb) aoihVar.b.b()).v(((aoqw) aoihVar.a.b()).e(d), str2);
            }
        });
        a.I();
        return a;
    }

    private final emyl D(final emyl emylVar, final emyl emylVar2, final emyl emylVar3, emyl emylVar4) {
        return emys.a(new emyl() { // from class: aohg
            @Override // defpackage.emyl
            public final Object get() {
                String str = (String) emylVar2.get();
                if (str == null) {
                    return "";
                }
                emyl emylVar5 = emylVar;
                switch (((aoif) emylVar5.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return str;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        emyl emylVar6 = emylVar3;
                        aoih aoihVar = aoih.this;
                        aoig aoigVar = (aoig) emylVar6.get();
                        if (aoigVar == null) {
                            aoihVar.A();
                            return str;
                        }
                        String m = ((ctvb) aoihVar.b.b()).m(aoigVar.a(), esfi.E164);
                        aoihVar.A();
                        return m;
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar5.get()).name())));
                }
            }
        });
    }

    static final String t(String str, String str2) {
        return u(str) ? str2 : str;
    }

    public static boolean u(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    public static boolean x(esfh esfhVar) {
        return esfhVar.e() && esfhVar.f() != 5 && ((esfp) esfhVar).a.h.startsWith("+");
    }

    public final void A() {
        ((aojk) this.e.b()).f();
    }

    public final void B() {
        ((aojk) this.e.b()).g();
    }

    @Override // defpackage.aobh
    public final aoku a(final String str) {
        return ((aokt) this.g.b()).c(new emyl() { // from class: aohk
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, new emyl() { // from class: aohm
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, new emyl() { // from class: aohn
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(str);
            }
        }, new emyl() { // from class: aoho
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, new emyl() { // from class: aohp
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, emys.a(new emyl() { // from class: aohq
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((avkc) aoih.this.d.b()).b(str));
            }
        }), new emyl() { // from class: aohr
            @Override // defpackage.emyl
            public final Object get() {
                return new aokr(str);
            }
        }, new emyl() { // from class: aohs
            @Override // defpackage.emyl
            public final Object get() {
                return aoqz.BOT;
            }
        }, new aogw(), new aogw());
    }

    @Override // defpackage.aobh
    public final aoku b(awui awuiVar) {
        awuh awuhVar = awuh.BOT;
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        return awuhVar.equals(b) ? a(awuiVar.d) : c(awuiVar.d, new aogw());
    }

    @Override // defpackage.aobh
    public final aoku c(final String str, emyl emylVar) {
        final emyl emylVar2 = new emyl() { // from class: aogh
            @Override // defpackage.emyl
            public final Object get() {
                return ((aoqw) aoih.this.a.b()).e(str);
            }
        };
        final emyl m = m(new emyl() { // from class: aogr
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, false);
        final emyl s = s(new emyl() { // from class: aohc
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, emylVar, m);
        A();
        emyl n = n(m, s);
        emyl r = r(n, s);
        emyl D = D(m, new emyl() { // from class: aohl
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, s, n);
        emyl l = l(m, new emyl() { // from class: aohw
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, s);
        aokt aoktVar = (aokt) this.g.b();
        final aogu aoguVar = new aogu(str);
        return aoktVar.c(emys.a(new emyl() { // from class: aohy
            @Override // defpackage.emyl
            public final Object get() {
                String str2 = ((aogu) aoguVar).a;
                if (str2 == null) {
                    return "";
                }
                emyl emylVar3 = m;
                switch (((aoif) emylVar3.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return str2;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        emyl emylVar4 = emylVar2;
                        emyl emylVar5 = s;
                        aoih aoihVar = aoih.this;
                        aoig aoigVar = (aoig) emylVar5.get();
                        if (aoigVar == null) {
                            return (String) ((aoqw) aoihVar.a.b()).b((String) emylVar4.get()).orElse(str2);
                        }
                        if (aoih.x(aoigVar.a())) {
                            return (aoigVar.c() == 2 || aoigVar.c() == 4) ? ((ctvb) aoihVar.b.b()).u(aoigVar.a()) : emylVar3.get() == aoif.E164_LIKE ? ((esfl) aoihVar.c.b()).b(aoigVar.a(), esfi.E164) : (String) ((aoqw) aoihVar.a.b()).b((String) emylVar4.get()).orElse(emylVar4.get());
                        }
                        if (!((Boolean) dizg.o().a.ar.a()).booleanValue()) {
                            return emylVar4.get();
                        }
                        return ((Pattern) aoqw.a.get()).matcher(aoqw.d(str2)).replaceAll("");
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar3.get()).name())));
                }
            }
        }), new emyl() { // from class: aoia
            @Override // defpackage.emyl
            public final Object get() {
                return str;
            }
        }, o(m, str, s, D), p(m, str, emylVar2, s), D, q(m, str, s, D), emys.a(new emyl() { // from class: aohf
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar3 = m;
                aoif aoifVar = (aoif) emylVar3.get();
                String str2 = str;
                if (aoifVar == aoif.BOT || aoifVar == aoif.PENPAL_BOT || aoifVar == aoif.EMAIL || aoifVar == aoif.UNKNOWN_SENDER || aoifVar == aoif.WAP_PUSH_SI || aoifVar == aoif.INVALID || aoifVar == aoif.SATELLITE_ESP) {
                    return new aokr(str2);
                }
                emyl emylVar4 = s;
                aoih aoihVar = aoih.this;
                aoig aoigVar = (aoig) emylVar4.get();
                if (aoigVar == null) {
                    return aoihVar.z(str2);
                }
                ctvb ctvbVar = (ctvb) aoihVar.b.b();
                String r2 = ((ctvb) aoihVar.b.b()).r();
                if (aoifVar == aoif.ALPHA_CODE_OR_PHONEWORD) {
                    aoihVar.B();
                    if (aoigVar.c() == 1 || aoigVar.c() == 2) {
                        return new aokr(((esfl) ctvbVar.c.b()).c(aoigVar.a(), r2));
                    }
                    return aoihVar.z(str2);
                }
                if (aoihVar.w(aoigVar)) {
                    return aoihVar.z(ctvbVar.m(aoigVar.a(), esfi.NATIONAL));
                }
                if (aoifVar != aoif.E164_LIKE && aoifVar != aoif.NATIONAL_OR_LOCAL) {
                    aoihVar.B();
                    throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar3.get()).name())));
                }
                if (aoigVar.c() != 1 && aoigVar.c() != 2 && !aoihVar.v(aoigVar)) {
                    return aoihVar.z((String) emylVar2.get());
                }
                ctvf ctvfVar = new ctvf(aoigVar.a().a());
                ctvf c = ctvbVar.c(r2);
                return aoihVar.z(ctvbVar.m(aoigVar.a(), (c.a() || !ctvfVar.equals(c)) ? esfi.INTERNATIONAL : esfi.NATIONAL));
            }
        }), l, n, r);
    }

    @Override // defpackage.aobh
    public final aoku d(djrj djrjVar) {
        return c(djrjVar.a, new aogw());
    }

    @Override // defpackage.aobh
    public final aoku e(String str, String str2, String str3, boolean z, final String str4, final emyl emylVar) {
        final String e;
        String str5;
        String t = t(str, str2);
        if (((Boolean) aoqm.c.e()).booleanValue()) {
            str3.getClass();
            t.getClass();
            str4.getClass();
        }
        if (u(t)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            e = str5;
        } else {
            e = ((aoqw) this.a.b()).e(t);
            str5 = str3;
        }
        final aokr aokrVar = (!u(str5) || e.equals("ʼUNKNOWN_SENDER!ʼ")) ? new aokr(emxe.b(str5)) : new aokr(((ctvb) this.b.b()).p(e));
        emyl m = m(new emyl() { // from class: aogs
            @Override // defpackage.emyl
            public final Object get() {
                return e;
            }
        }, z);
        final String str6 = (String) Optional.ofNullable(str2).filter(new Predicate() { // from class: aoib
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
                return !aoih.u((String) obj);
            }
        }).orElse("ʼUNKNOWN_SENDER!ʼ");
        emyl m2 = m(new emyl() { // from class: aogi
            @Override // defpackage.emyl
            public final Object get() {
                return str6;
            }
        }, z);
        emyl s = s(new emyl() { // from class: aogj
            @Override // defpackage.emyl
            public final Object get() {
                return str6;
            }
        }, new emyl() { // from class: aogk
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of((String) emyl.this.get());
            }
        }, m2);
        A();
        emyl n = n(m2, s);
        emyl r = r(n, s);
        emyl D = D(m2, new emyl() { // from class: aohe
            @Override // defpackage.emyl
            public final Object get() {
                return str6;
            }
        }, s, n);
        emyl o = o(m2, str6, s, D);
        emyl p = p(m2, str6, new emyl() { // from class: aogl
            @Override // defpackage.emyl
            public final Object get() {
                return str6;
            }
        }, s);
        emyl s2 = s(new emyl() { // from class: aogm
            @Override // defpackage.emyl
            public final Object get() {
                return e;
            }
        }, new emyl() { // from class: aogn
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of((String) emyl.this.get());
            }
        }, m);
        aokt aoktVar = (aokt) this.g.b();
        emyl emylVar2 = p;
        emyl emylVar3 = new emyl() { // from class: aogo
            @Override // defpackage.emyl
            public final Object get() {
                return e;
            }
        };
        emyl emylVar4 = new emyl() { // from class: aogp
            @Override // defpackage.emyl
            public final Object get() {
                return str4;
            }
        };
        if (((Boolean) new aopv().get()).booleanValue()) {
            emylVar2 = new emyl() { // from class: aoic
                @Override // defpackage.emyl
                public final Object get() {
                    return str6;
                }
            };
        }
        return aoktVar.c(emylVar3, emylVar4, o, emylVar2, D, q(m2, str6, s, D), new emyl() { // from class: aoid
            @Override // defpackage.emyl
            public final Object get() {
                return aokr.this;
            }
        }, l(m, new emyl() { // from class: aoie
            @Override // defpackage.emyl
            public final Object get() {
                return e;
            }
        }, s2), n, r);
    }

    @Override // defpackage.aobh
    public final aoku f() {
        return ((aokt) this.g.b()).c(new emyl() { // from class: aogx
            @Override // defpackage.emyl
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new emyl() { // from class: aogy
            @Override // defpackage.emyl
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new aogw(), new emyl() { // from class: aogz
            @Override // defpackage.emyl
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new emyl() { // from class: aoha
            @Override // defpackage.emyl
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new aogw(), new emyl() { // from class: aohb
            @Override // defpackage.emyl
            public final Object get() {
                return new aokr("ʼUNKNOWN_SENDER!ʼ");
            }
        }, new emyl() { // from class: aohd
            @Override // defpackage.emyl
            public final Object get() {
                return aoqz.UNKNOWN_SENDER;
            }
        }, new aogw(), new aogw());
    }

    @Override // defpackage.aobh
    public final aoku g(aoku aokuVar, emyl emylVar) {
        return ((aokt) this.g.b()).a(aokuVar, emylVar);
    }

    @Override // defpackage.aobh
    public final aoku h(aoku aokuVar, String str) {
        return ((aokt) this.g.b()).b(aokuVar, str);
    }

    @Override // defpackage.aobh
    public final aoku i(final aoku aokuVar, boolean z) {
        return z ? ((aokt) this.g.b()).a(aokuVar, new emyl() { // from class: aogt
            @Override // defpackage.emyl
            public final Object get() {
                return ((ctvb) aoih.this.b.b()).p(aokuVar.n());
            }
        }) : aokuVar;
    }

    @Override // defpackage.aobh
    public final aoku j(aoku aokuVar, int i) {
        return C(aokuVar, ((ctve) this.f.b()).b(i), false);
    }

    @Override // defpackage.aobh
    public final aoku k(aoku aokuVar) {
        return C(aokuVar, ((ctvb) this.b.b()).r(), true);
    }

    final emyl l(final emyl emylVar, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aogq
            @Override // defpackage.emyl
            public final Object get() {
                String str = (String) emylVar2.get();
                if (str == null) {
                    return aoqz.UNKNOWN_SENDER;
                }
                aoih aoihVar = aoih.this;
                if (((ctvb) aoihVar.b.b()).H(str)) {
                    return aoqz.PHONE_EMERGENCY;
                }
                emyl emylVar4 = emylVar;
                switch (((aoif) emylVar4.get()).ordinal()) {
                    case 0:
                        return aoqz.BOT;
                    case 1:
                        return aoqz.PENPAL_BOT;
                    case 2:
                        return aoqz.EMAIL;
                    case 3:
                        return aoqz.UNKNOWN_SENDER;
                    case 4:
                    case 9:
                        return aoqz.UNKNOWN_DESTINATION_TYPE;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        aoig aoigVar = (aoig) emylVar3.get();
                        if (aoigVar == null) {
                            aoihVar.B();
                            return aoqz.UNKNOWN_DESTINATION_TYPE;
                        }
                        boolean x = aoih.x(aoigVar.a());
                        if (aoihVar.w(aoigVar)) {
                            return x ? aoqz.PHONE_SHORT_WITH_COUNTRY : aoqz.PHONE_SHORT_NO_COUNTRY;
                        }
                        int c = aoigVar.c();
                        if (c == 1) {
                            if (!((aojk) aoihVar.e.b()).c()) {
                                return x ? aoqz.PHONE_E164 : aoqz.PHONE_NATIONAL;
                            }
                            int f = aoigVar.a().f() - 1;
                            return f != 1 ? f != 2 ? f != 3 ? aoqz.PHONE_NATIONAL : aoqz.PHONE_WITH_COUNTRY : aoqz.PHONE_WITH_IDD : ((ctvb) aoihVar.b.b()).M(str) ? aoqz.PHONE_E164 : aoqz.PHONE_WITH_PLUS;
                        }
                        if (c == 2) {
                            return x ? aoqz.PHONE_LOCAL_WITH_COUNTRY : aoqz.PHONE_LOCAL_NO_COUNTRY;
                        }
                        if (!((aojk) aoihVar.e.b()).c()) {
                            return aoqz.UNKNOWN_DESTINATION_TYPE;
                        }
                        int i = c - 1;
                        return i != 3 ? i != 4 ? i != 5 ? aoqz.PHONE_INVALID_COUNTRY_CODE : aoqz.PHONE_INVALID_TOO_LONG : aoqz.PHONE_INVALID_LENGTH : aoqz.PHONE_INVALID_TOO_SHORT;
                    case 10:
                        return aoqz.SATELLITE_ESP;
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar4.get()).name())));
                }
            }
        });
    }

    final emyl m(final emyl emylVar, final boolean z) {
        return emys.a(new emyl() { // from class: aohj
            @Override // defpackage.emyl
            public final Object get() {
                if (z) {
                    return aoif.BOT;
                }
                String str = (String) emylVar.get();
                if (str == null) {
                    return aoif.UNKNOWN_SENDER;
                }
                if (((Boolean) ctjd.bu.e()).booleanValue() && (aojl.a(str) || aojl.b(str))) {
                    return aoif.SATELLITE_ESP;
                }
                aoih aoihVar = aoih.this;
                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((aoqw) aoihVar.a.b()).i(str)) {
                    return aoif.PENPAL_BOT;
                }
                if (aoqw.h(str)) {
                    return aoif.EMAIL;
                }
                if (str.equals("ʼWAP_PUSH_SI!ʼ")) {
                    return aoif.WAP_PUSH_SI;
                }
                if (str.equals("ʼUNKNOWN_SENDER!ʼ") || str.isEmpty()) {
                    return aoif.UNKNOWN_SENDER;
                }
                String replace = str.replace("\\s+|-", "");
                if (!TextUtils.isEmpty(replace)) {
                    for (int i = 0; i < replace.length(); i++) {
                        if (Character.isAlphabetic(Character.codePointAt(replace, i))) {
                            return aoif.ALPHA_CODE_OR_PHONEWORD;
                        }
                    }
                }
                if (!str.isEmpty() && str.charAt(0) == '+') {
                    for (int i2 = 1; i2 < str.length(); i2++) {
                        if (Character.isDigit(str.charAt(i2))) {
                        }
                    }
                    return aoif.E164_LIKE;
                }
                return ((aoqw) aoihVar.a.b()).k(str) ? aoif.NATIONAL_OR_LOCAL : aoif.INVALID;
            }
        });
    }

    final emyl n(final emyl emylVar, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aohi
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar3 = emylVar;
                switch (((aoif) emylVar3.get()).ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return Optional.empty();
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        aoig aoigVar = (aoig) emylVar2.get();
                        if (aoigVar == null) {
                            return Optional.empty();
                        }
                        aoih aoihVar = aoih.this;
                        esfh a = aoigVar.a();
                        return aoihVar.w(aoigVar) ? aoih.x(a) ? Optional.of(new ctvf(a.a())) : Optional.empty() : a.d() ? Optional.of(new ctvf(a.a())) : Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar3.get()).name())));
                }
            }
        });
    }

    final emyl o(final emyl emylVar, final String str, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aoht
            @Override // defpackage.emyl
            public final Object get() {
                String str2 = str;
                if (str2 == null) {
                    return Optional.empty();
                }
                emyl emylVar4 = emylVar;
                switch (((aoif) emylVar4.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 10:
                        return Optional.of(str2);
                    case 3:
                    case 4:
                    case 9:
                        return Optional.empty();
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        aoig aoigVar = (aoig) emylVar2.get();
                        return aoigVar == null ? Optional.empty() : aoigVar.c() == 1 ? Optional.of((String) emylVar3.get()) : ((ctvb) aoih.this.b.b()).H(str2) ? Optional.of(str2) : Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar4.get()).name())));
                }
            }
        });
    }

    final emyl p(final emyl emylVar, final String str, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aohz
            @Override // defpackage.emyl
            public final Object get() {
                String str2 = str;
                if (str2 == null) {
                    return "";
                }
                emyl emylVar4 = emylVar;
                switch (((aoif) emylVar4.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return str2;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        emyl emylVar5 = emylVar2;
                        aoig aoigVar = (aoig) emylVar3.get();
                        if (aoigVar == null) {
                            return (String) emylVar5.get();
                        }
                        aoih aoihVar = aoih.this;
                        return aoigVar.c() == 1 ? ((ctvb) aoihVar.b.b()).m(aoigVar.a(), esfi.E164) : emylVar4.get() == aoif.ALPHA_CODE_OR_PHONEWORD ? (String) emylVar5.get() : aoigVar.c() == 2 ? ((ctvb) aoihVar.b.b()).u(aoigVar.a()) : aoihVar.v(aoigVar) ? ((ctvb) aoihVar.b.b()).u(aoigVar.a()) : (String) emylVar5.get();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar4.get()).name())));
                }
            }
        });
    }

    final emyl q(final emyl emylVar, final String str, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aohv
            @Override // defpackage.emyl
            public final Object get() {
                String str2 = str;
                emyl emylVar4 = emylVar3;
                if (str2 == null) {
                    return Optional.empty();
                }
                emyl emylVar5 = emylVar;
                aoih aoihVar = aoih.this;
                switch (((aoif) emylVar5.get()).ordinal()) {
                    case 0:
                        return Optional.of(((avkc) aoihVar.d.b()).b(str2));
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        if (((aoig) emylVar2.get()) == null) {
                            return Optional.empty();
                        }
                        try {
                            return Optional.of(((avkc) aoihVar.d.b()).a((String) emylVar4.get(), false));
                        } catch (avkg unused) {
                            return Optional.empty();
                        }
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar5.get()).name())));
                }
            }
        });
    }

    final emyl r(final emyl emylVar, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aohx
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar3 = emylVar;
                if (((Optional) emylVar3.get()).isEmpty()) {
                    return Optional.empty();
                }
                aoig aoigVar = (aoig) emylVar2.get();
                if (aoigVar == null) {
                    return Optional.empty();
                }
                aoih aoihVar = aoih.this;
                String f = ((esfl) aoihVar.c.b()).f(aoigVar.a());
                if (emxe.c(f)) {
                    f = ((esfl) aoihVar.c.b()).e(((ctvf) ((Optional) emylVar3.get()).get()).a);
                }
                return emxe.c(f) ? Optional.empty() : Optional.of(f);
            }
        });
    }

    final emyl s(final emyl emylVar, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aohh
            @Override // defpackage.emyl
            public final Object get() {
                final emyl emylVar4 = emylVar3;
                int ordinal = ((aoif) emylVar4.get()).ordinal();
                final aoih aoihVar = aoih.this;
                final emyl emylVar5 = emylVar;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        throw new IllegalStateException("Parse not supported for destination format: ".concat(String.valueOf(((aoif) emylVar4.get()).toString())));
                    case 1:
                    case 5:
                    case 6:
                        String str = (String) emylVar5.get();
                        aoig y = aoihVar.y(str, null);
                        if (y != null) {
                            aobg aobgVar = (aobg) y;
                            if (aoih.x(aobgVar.a) || aobgVar.b == 1) {
                                return y;
                            }
                        }
                        break;
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((aoif) emylVar4.get()).name())));
                }
                aoig aoigVar = (aoig) ((Optional) emylVar2.get()).map(new Function() { // from class: aohu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String str2 = (String) emylVar5.get();
                        return aoih.this.y(str2, (String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
                if (aoigVar == null || aoigVar.c() != 1) {
                    String str2 = (String) emylVar5.get();
                    aoig y2 = aoihVar.y(str2, ((ctvb) aoihVar.b.b()).r());
                    if ((y2 != null && ((aobg) y2).b == 1) || ((aoigVar == null || aoigVar.c() != 2) && ((y2 != null && ((aobg) y2).b == 2) || aoigVar == null))) {
                        return y2;
                    }
                }
                return aoigVar;
            }
        });
    }

    public final boolean v(aoig aoigVar) {
        B();
        return ((ctvb) this.b.b()).J(aoigVar.a());
    }

    public final boolean w(aoig aoigVar) {
        B();
        return v(aoigVar) && aoigVar.c() == 4;
    }

    public final aoig y(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            esfh e = ((ctvb) this.b.b()).e(str, str2);
            int N = ((ctvb) this.b.b()).N(e);
            B();
            return new aobg(e, N, str2);
        } catch (esfg unused) {
            return null;
        }
    }

    public final aokr z(String str) {
        A();
        return new aokr(str);
    }
}
