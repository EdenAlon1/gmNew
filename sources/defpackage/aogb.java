package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aogb implements aobh {
    public static final cfva a = cfvl.i(cfvl.b, "enable_error_for_unknown_destination_format", false);
    static final cfva b = cfvl.i(cfvl.b, "mi_normalizing_eagerly_calculates", false);
    static final cfva c = cfvl.i(cfvl.b, "legacy_uses_supplier", false);
    public static final enru d = enru.c("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3");
    public final fazb e;
    public final fazb f;
    public final fazb g;
    public final fazb h;
    public final fazb i;
    public final fazb j;
    public final fazb k;
    private final fazb l;

    public aogb(fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5, fazb fazbVar6, fazb fazbVar7, fazb fazbVar8) {
        this.e = fazbVar;
        this.f = fazbVar2;
        this.g = fazbVar3;
        this.h = fazbVar4;
        this.l = fazbVar5;
        this.i = fazbVar7;
        this.j = fazbVar6;
        this.k = fazbVar8;
    }

    public static String t(String str, Optional optional, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        if (optional.isEmpty()) {
            return sb.toString();
        }
        if (!str.startsWith("+")) {
            sb.insert(0, "+");
        }
        if (!z) {
            sb.insert(1, ((ctvf) optional.get()).toString());
        }
        sb.insert(((ctvf) optional.get()).toString().length() + 1, " ");
        return sb.toString();
    }

    public static boolean u(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    private final emyl v(final emyl emylVar, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aoet
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar3 = emylVar;
                int ordinal = ((aoga) emylVar3.get()).a().ordinal();
                emyl emylVar4 = emylVar2;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 11:
                    case 12:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return new aokr((String) emylVar4.get());
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        return new aokr(((ctvb) aogb.this.g.b()).p((String) emylVar4.get()));
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoga) emylVar3.get()).a().name())));
                }
            }
        });
    }

    private final emyl w(final emyl emylVar, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aofm
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar4 = emylVar;
                int ordinal = ((aoga) emylVar4.get()).a().ordinal();
                emyl emylVar5 = emylVar2;
                switch (ordinal) {
                    case 0:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 13:
                    case 14:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return Optional.empty();
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                    case 11:
                    case 12:
                        return Optional.of((String) emylVar5.get());
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        return Optional.of((String) aogb.this.n((String) emylVar5.get(), (String) emylVar3.get(), false).get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoga) emylVar4.get()).a().name())));
                }
            }
        });
    }

    @Override // defpackage.aobh
    public final aoku a(final String str) {
        return ((aokt) this.l.b()).c(new emyl() { // from class: aoez
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return str;
            }
        }, new emyl() { // from class: aofa
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return str;
            }
        }, new emyl() { // from class: aofb
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return Optional.of(str);
            }
        }, new emyl() { // from class: aofc
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return str;
            }
        }, new emyl() { // from class: aofd
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return str;
            }
        }, emys.a(new emyl() { // from class: aofe
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((avkc) aogb.this.f.b()).a(str, false));
            }
        }), new emyl() { // from class: aoff
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return new aokr(str);
            }
        }, new emyl() { // from class: aofg
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return aoqz.BOT;
            }
        }, new aofh(), new aofh());
    }

    @Override // defpackage.aobh
    public final aoku b(final awui awuiVar) {
        String str = awuiVar.d;
        emyl emylVar = new emyl() { // from class: aodw
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return awui.this.d;
            }
        };
        final emyl a2 = emys.a(new emyl() { // from class: aodx
            @Override // defpackage.emyl
            public final Object get() {
                return ((ctvb) aogb.this.g.b()).r();
            }
        });
        awuh b2 = awuh.b(awuiVar.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        final emyl p = p(str, emylVar, b2 == awuh.BOT, a2);
        ensk g = d.g();
        g.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) g;
        enrrVar.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "createFromChatEndpoint", 168, "CsMessagingIdentityFactoryImplV3.java")).t("createFromChatEndpoint %s", p.get());
        emyl m = m(p, emylVar, a2, emylVar);
        final emyl r = r(m);
        emyl a3 = emys.a(new emyl() { // from class: aody
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                Optional optional = (Optional) emyl.this.get();
                emyl emylVar2 = a2;
                emylVar2.getClass();
                return (String) optional.orElseGet(new aoes(emylVar2));
            }
        });
        emyl s = s(p, emylVar, a3, m);
        return ((aokt) this.l.b()).c(emylVar, emylVar, w(p, emylVar, a3), o(p, a3, emylVar, s), s, q(p, emylVar, a3), v(p, emylVar), new emyl() { // from class: aodz
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return ((aoga) emyl.this.get()).a();
            }
        }, m, r);
    }

    @Override // defpackage.aobh
    public final aoku c(final String str, emyl emylVar) {
        final ctvb ctvbVar = (ctvb) this.g.b();
        final emyl a2 = emys.a(new emyl() { // from class: aoem
            @Override // defpackage.emyl
            public final Object get() {
                return ((aoqw) aogb.this.e.b()).e(str);
            }
        });
        final emyl p = p(str, a2, false, new emyl() { // from class: aoft
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return "";
            }
        });
        enru enruVar = d;
        ensk g = enruVar.g();
        g.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) g;
        enrrVar.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "createFromDestination", 221, "CsMessagingIdentityFactoryImplV3.java")).t("parsedNoCountry %s", p.get());
        final emyl l = l((String) a2.get(), emylVar, p);
        final emyl a3 = emys.a(new emyl() { // from class: aofw
            @Override // defpackage.emyl
            public final Object get() {
                return ((ctvb) aogb.this.g.b()).c((String) l.get());
            }
        });
        final emyl p2 = p(str, a2, false, l);
        ensk g2 = enruVar.g();
        g2.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) g2;
        enrrVar2.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "createFromDestination", 236, "CsMessagingIdentityFactoryImplV3.java")).t("parsedFromNetwork %s", p2.get());
        final emyl a4 = emys.a(new emyl() { // from class: aofx
            @Override // defpackage.emyl
            public final Object get() {
                String str2 = (String) a2.get();
                final ctvb ctvbVar2 = ctvbVar;
                return (String) aogb.this.l(str2, new emyl() { // from class: aofv
                    @Override // defpackage.emyl
                    public final Object get() {
                        cfva cfvaVar = aogb.a;
                        return Optional.of(ctvb.this.r());
                    }
                }, p).get();
            }
        });
        final emyl a5 = emys.a(new emyl() { // from class: aofy
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return ctvb.this.c((String) a4.get());
            }
        });
        final emyl p3 = p(str, a2, false, a4);
        ensk g3 = enruVar.g();
        g3.Y(ente.a, "Bugle");
        enrr enrrVar3 = (enrr) g3;
        enrrVar3.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "createFromDestination", 257, "CsMessagingIdentityFactoryImplV3.java")).t("parsedFromDevice %s", p3.get());
        final emyl emylVar2 = new emyl() { // from class: aofz
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                aoqz a6 = ((aoga) emyl.this.get()).a();
                emyl emylVar3 = p2;
                boolean z = false;
                if (!a6.equals(((aoga) emylVar3.get()).a())) {
                    emyl emylVar4 = a4;
                    String str2 = (String) l.get();
                    aoga aogaVar = (aoga) emylVar3.get();
                    String str3 = (String) emylVar4.get();
                    boolean z2 = aogaVar.a() == aoqz.UNKNOWN_DESTINATION_TYPE || aogaVar.a() == aoqz.UNRECOGNIZED || aogaVar.a() == aoqz.PHONE_INVALID_TOO_SHORT || aogaVar.a() == aoqz.PHONE_INVALID_TOO_LONG || aogaVar.a() == aoqz.PHONE_INVALID_LENGTH || aogaVar.a() == aoqz.PHONE_INVALID_COUNTRY_CODE || aogaVar.a() == aoqz.UNKNOWN_DIALABLE;
                    if (((Boolean) aoqm.b.e()).booleanValue() && !str2.equals(str3) && z2) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        final emyl emylVar3 = new emyl() { // from class: aodr
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return (aoga) (true != ((Boolean) emyl.this.get()).booleanValue() ? p2 : p3).get();
            }
        };
        emyl emylVar4 = new emyl() { // from class: aods
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return ((Boolean) emyl.this.get()).booleanValue() ? (String) a4.get() : (String) l.get();
            }
        };
        final emyl emylVar5 = new emyl() { // from class: aodt
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return Optional.of(((Boolean) emyl.this.get()).booleanValue() ? (ctvf) a5.get() : (ctvf) a3.get());
            }
        };
        emyl s = s(emylVar3, a2, emylVar4, emylVar5);
        emyl o = o(emylVar3, emylVar4, a2, s);
        emyl emylVar6 = new emyl() { // from class: aodu
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return ((aoga) emyl.this.get()).a().equals(aoqz.EMAIL) ? Optional.empty() : emylVar5.get();
            }
        };
        return ((aokt) this.l.b()).c(a2, new emyl() { // from class: aoex
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return str;
            }
        }, w(emylVar3, a2, emylVar4), o, s, q(emylVar3, a2, emylVar4), v(emylVar3, o), new emyl() { // from class: aofi
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return ((aoga) emyl.this.get()).a();
            }
        }, emylVar6, r(emylVar6));
    }

    @Override // defpackage.aobh
    public final aoku d(djrj djrjVar) {
        return c(djrjVar.a, new aofh());
    }

    @Override // defpackage.aobh
    public final aoku e(String str, String str2, String str3, boolean z, final String str4, final emyl emylVar) {
        final String e;
        String str5;
        String str6 = true == u(str) ? str2 : str;
        if (((Boolean) aoqm.c.e()).booleanValue()) {
            str3.getClass();
            str6.getClass();
            str4.getClass();
        }
        if (u(str6)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            e = str5;
        } else {
            e = ((aoqw) this.e.b()).e(str6);
            str5 = str3;
        }
        final aokr aokrVar = (!u(str5) || e.equals("ʼUNKNOWN_SENDER!ʼ")) ? new aokr(emxe.b(str5)) : new aokr(((ctvb) this.g.b()).p(e));
        final emyl p = p(str6, new emyl() { // from class: aoey
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return e;
            }
        }, z, emylVar);
        enru enruVar = d;
        ensk g = enruVar.g();
        g.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) g;
        enrrVar.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "createFromPrecalculated", 352, "CsMessagingIdentityFactoryImplV3.java")).t("createFromPrecalculated %s", p.get());
        final String b2 = emxe.b(str2);
        if (true == u(b2)) {
            b2 = "ʼUNKNOWN_SENDER!ʼ";
        }
        if (((Boolean) new aopv().get()).booleanValue()) {
            b2 = (String) Optional.ofNullable(str2).filter(new Predicate() { // from class: aoec
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
                    return !aogb.u((String) obj);
                }
            }).orElse("ʼUNKNOWN_SENDER!ʼ");
        }
        emyl p2 = p(str2, new emyl() { // from class: aoeg
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return b2;
            }
        }, z, emylVar);
        ensk g2 = enruVar.g();
        g2.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) g2;
        enrrVar2.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "createFromPrecalculatedCore", 389, "CsMessagingIdentityFactoryImplV3.java")).t("normalizedParsed %s", p2.get());
        emyl m = m(p2, new emyl() { // from class: aoeh
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return b2;
            }
        }, emylVar, new emyl() { // from class: aoei
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return b2;
            }
        });
        final emyl r = r(m);
        emyl a2 = emys.a(new emyl() { // from class: aoej
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return (String) ((Optional) emyl.this.get()).orElseGet(new aoes(emylVar));
            }
        });
        emyl w = w(p2, new emyl() { // from class: aoer
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return b2;
            }
        }, a2);
        emyl s = s(p2, new emyl() { // from class: aoek
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return b2;
            }
        }, a2, m);
        emyl o = o(p2, a2, new emyl() { // from class: aoel
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return e;
            }
        }, s);
        aokt aoktVar = (aokt) this.l.b();
        emyl emylVar2 = new emyl() { // from class: aoen
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return e;
            }
        };
        emyl emylVar3 = new emyl() { // from class: aoeo
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return str4;
            }
        };
        if (((Boolean) new aopv().get()).booleanValue()) {
            o = new emyl() { // from class: aoep
                @Override // defpackage.emyl
                public final Object get() {
                    cfva cfvaVar = aogb.a;
                    return b2;
                }
            };
        }
        return aoktVar.c(emylVar2, emylVar3, w, o, s, q(p2, new emyl() { // from class: aoed
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return b2;
            }
        }, a2), new emyl() { // from class: aoee
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return aokr.this;
            }
        }, new emyl() { // from class: aoef
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return ((aoga) emyl.this.get()).a();
            }
        }, m, r);
    }

    @Override // defpackage.aobh
    public final aoku f() {
        return ((aokt) this.l.b()).c(new emyl() { // from class: aofn
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new emyl() { // from class: aofo
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new aofh(), new emyl() { // from class: aofp
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new emyl() { // from class: aofq
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new aofh(), new emyl() { // from class: aofr
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return new aokr("ʼUNKNOWN_SENDER!ʼ");
            }
        }, new emyl() { // from class: aofs
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aogb.a;
                return aoqz.UNKNOWN_SENDER;
            }
        }, new aofh(), new aofh());
    }

    @Override // defpackage.aobh
    public final aoku g(aoku aokuVar, emyl emylVar) {
        return ((aokt) this.l.b()).a(aokuVar, emylVar);
    }

    @Override // defpackage.aobh
    public final aoku h(aoku aokuVar, String str) {
        aoks b2 = ((aokt) this.l.b()).b(aokuVar, str);
        if (((Boolean) b.e()).booleanValue()) {
            b2.I();
        }
        return b2;
    }

    @Override // defpackage.aobh
    public final aoku i(aoku aokuVar, boolean z) {
        return z ? ((aokt) this.l.b()).b(aokuVar, ((ctvb) this.g.b()).p(aokuVar.n())) : aokuVar;
    }

    @Override // defpackage.aobh
    public final aoku j(final aoku aokuVar, final int i) {
        emyl emylVar = new emyl() { // from class: aoea
            @Override // defpackage.emyl
            public final Object get() {
                String d2 = cuxt.d(emxe.b(aokuVar.n()));
                if (aoqw.h(d2) || aoqw.j(d2)) {
                    return d2;
                }
                int i2 = i;
                aogb aogbVar = aogb.this;
                return ((ctvb) aogbVar.g.b()).v(((aoqw) aogbVar.e.b()).e(d2), ((ctve) aogbVar.h.b()).b(i2));
            }
        };
        aoks a2 = ((Boolean) c.e()).booleanValue() ? ((aokt) this.l.b()).a(aokuVar, emylVar) : ((aokt) this.l.b()).b(aokuVar, (String) emylVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            a2.I();
        }
        return a2;
    }

    @Override // defpackage.aobh
    public final aoku k(final aoku aokuVar) {
        emyl emylVar = new emyl() { // from class: aodv
            @Override // defpackage.emyl
            public final Object get() {
                String b2 = emxe.b(aokuVar.n());
                aogb aogbVar = aogb.this;
                fazb fazbVar = aogbVar.g;
                String d2 = cuxt.d(b2);
                return aoqw.h(d2) ? d2 : ((ctvb) fazbVar.b()).x(((aoqw) aogbVar.e.b()).e(d2));
            }
        };
        aoks a2 = ((Boolean) c.e()).booleanValue() ? ((aokt) this.l.b()).a(aokuVar, emylVar) : ((aokt) this.l.b()).b(aokuVar, (String) emylVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            a2.I();
        }
        return a2;
    }

    public final emyl l(final String str, final emyl emylVar, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aoew
            @Override // defpackage.emyl
            public final Object get() {
                aoqz a2 = ((aoga) emylVar2.get()).a();
                if (a2 == aoqz.EMAIL || a2 == aoqz.BOT || a2 == aoqz.UNKNOWN_SENDER || a2 == aoqz.SATELLITE_ESP || a2 == aoqz.PENPAL_BOT) {
                    return "US";
                }
                String str2 = str;
                ctvb ctvbVar = (ctvb) aogb.this.g.b();
                if (str2.startsWith("+")) {
                    Optional g = ctvbVar.g(str2, null);
                    if (g.isPresent() && !((ctvf) g.get()).a()) {
                        return ctvbVar.z((ctvf) g.get());
                    }
                }
                emyl emylVar3 = emylVar;
                return (!((Optional) emylVar3.get()).isPresent() || ((String) ((Optional) emylVar3.get()).get()).isEmpty()) ? ctvbVar.r() : (String) ((Optional) emylVar3.get()).get();
            }
        });
    }

    final emyl m(final emyl emylVar, final emyl emylVar2, final emyl emylVar3, final emyl emylVar4) {
        return emys.a(new emyl() { // from class: aodq
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar5 = emylVar;
                int ordinal = ((aoga) emylVar5.get()).a().ordinal();
                final aogb aogbVar = aogb.this;
                emyl emylVar6 = emylVar2;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 7:
                    case 11:
                    case 12:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return Optional.empty();
                    case 1:
                    case 8:
                        return ((ctvb) aogbVar.g.b()).f((String) emylVar6.get());
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                        final emyl emylVar7 = emylVar3;
                        return ((ctvb) aogbVar.g.b()).f((String) emylVar4.get()).or(new Supplier() { // from class: aoeb
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return Optional.of(((ctvb) aogb.this.g.b()).c((String) emylVar7.get()));
                            }
                        });
                    case 6:
                    case 14:
                        return ((aoqw) aogbVar.e.b()).a((String) emylVar6.get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoga) emylVar5.get()).a().name())));
                }
            }
        });
    }

    public final emyl n(final String str, final String str2, final boolean z) {
        return emys.a(new emyl() { // from class: aoev
            @Override // defpackage.emyl
            public final Object get() {
                ctvb ctvbVar = (ctvb) aogb.this.g.b();
                String str3 = str2;
                String str4 = str;
                return ctvbVar.w(str4, str4, str3, z);
            }
        });
    }

    final emyl o(final emyl emylVar, final emyl emylVar2, final emyl emylVar3, final emyl emylVar4) {
        return emys.a(new emyl() { // from class: aofj
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar5 = emylVar;
                int ordinal = ((aoga) emylVar5.get()).a().ordinal();
                aogb aogbVar = aogb.this;
                emyl emylVar6 = emylVar3;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return (String) emylVar6.get();
                    case 1:
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        return (String) emylVar4.get();
                    case 6:
                    case 14:
                        return (String) ((aoqw) aogbVar.e.b()).b((String) emylVar6.get()).orElse((String) emylVar6.get());
                    case 8:
                        return (String) aogbVar.n((String) ((aoqw) aogbVar.e.b()).b((String) emylVar6.get()).orElse((String) emylVar6.get()), (String) emylVar2.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoga) emylVar5.get()).a().name())));
                }
            }
        });
    }

    final emyl p(final String str, final emyl emylVar, final boolean z, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aofu
            @Override // defpackage.emyl
            public final Object get() {
                aoqz aoqzVar;
                String str2 = (String) emylVar.get();
                emyl emylVar3 = emylVar2;
                if (z) {
                    return new aobf(str2, aoqz.BOT, "", null, 0, null, null);
                }
                if (aoqw.h(str2)) {
                    return new aobf(str2, aoqz.EMAIL, "", null, 0, null, null);
                }
                if (str2.equals("ʼUNKNOWN_SENDER!ʼ") || str2.isEmpty()) {
                    return new aobf(str2, aoqz.UNKNOWN_SENDER, "", null, 0, null, null);
                }
                if (aojl.a(str2) || aojl.b(str2)) {
                    return new aobf(str2, aoqz.SATELLITE_ESP, "", null, 0, null, null);
                }
                aogb aogbVar = aogb.this;
                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((aoqw) aogbVar.e.b()).i(str2)) {
                    return new aobf(str2, aoqz.PENPAL_BOT, "", null, 0, null, null);
                }
                if (!((aojk) aogbVar.k.b()).c() && ((ctvb) aogbVar.g.b()).L(str2)) {
                    return new aobf(str2, aoqz.PHONE_E164, "", null, 0, null, null);
                }
                if (((aoqw) aogbVar.e.b()).k(str2)) {
                    try {
                        String str3 = (String) emylVar3.get();
                        esfh e = ((ctvb) aogbVar.g.b()).e(str2, str3);
                        int N = ((ctvb) aogbVar.g.b()).N(e);
                        if (N == 4) {
                            if (((ctvb) aogbVar.g.b()).J(e)) {
                                return new aobf(str2, ((aoqw) aogbVar.e.b()).l(str2) ? aoqz.PHONE_SHORT_WITH_COUNTRY : aoqz.PHONE_SHORT_NO_COUNTRY, str3, e, 4, str3, null);
                            }
                            N = 4;
                        }
                        if (N == 1) {
                            if (((aojk) aogbVar.k.b()).c()) {
                                e.getClass();
                                int f = e.f() - 1;
                                if (f != 1) {
                                    aoqzVar = f != 2 ? f != 3 ? f != 4 ? aoqz.UNKNOWN_DIALABLE : aoqz.PHONE_NATIONAL : aoqz.PHONE_WITH_COUNTRY : aoqz.PHONE_WITH_IDD;
                                } else {
                                    String str4 = str;
                                    aoqzVar = (str4 == null || !((ctvb) aogbVar.g.b()).M(str4)) ? aoqz.PHONE_WITH_PLUS : aoqz.PHONE_E164;
                                }
                            } else {
                                aoqzVar = aoqz.PHONE_NATIONAL;
                            }
                            return new aobf(str2, aoqzVar, str3, e, 1, str3, null);
                        }
                        if (N == 2) {
                            Optional f2 = ((ctvb) aogbVar.g.b()).f(str2);
                            return new aobf(str2, f2.isPresent() ? aoqz.PHONE_LOCAL_WITH_COUNTRY : aoqz.PHONE_LOCAL_NO_COUNTRY, str3, e, 2, null, (ctvf) f2.orElse(null));
                        }
                        if (((aojk) aogbVar.k.b()).c()) {
                            int i = N - 1;
                            return i != 3 ? i != 4 ? i != 5 ? new aobf(str2, aoqz.PHONE_INVALID_COUNTRY_CODE, "", null, 0, null, null) : new aobf(str2, aoqz.PHONE_INVALID_TOO_LONG, "", null, 0, null, null) : new aobf(str2, aoqz.PHONE_INVALID_LENGTH, "", null, 0, null, null) : new aobf(str2, aoqz.PHONE_INVALID_TOO_SHORT, "", null, 0, null, null);
                        }
                    } catch (esfg e2) {
                        if (((Boolean) aogb.a.e()).booleanValue()) {
                            throw new IllegalStateException("Unknown destination format", e2);
                        }
                        return new aobf(str2, ((aojk) aogbVar.k.b()).c() ? aoqz.UNKNOWN_DIALABLE : aoqz.UNKNOWN_DESTINATION_TYPE, "", null, 0, null, null);
                    }
                }
                if (((Boolean) aogb.a.e()).booleanValue()) {
                    throw new IllegalStateException("Unknown destination format");
                }
                return new aobf(str2, aoqz.UNKNOWN_DESTINATION_TYPE, "", null, 0, null, null);
            }
        });
    }

    final emyl q(final emyl emylVar, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aofk
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar4 = emylVar;
                int ordinal = ((aoga) emylVar4.get()).a().ordinal();
                aogb aogbVar = aogb.this;
                emyl emylVar5 = emylVar2;
                emyl emylVar6 = emylVar3;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 4:
                    case 11:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        return Optional.empty();
                    case 1:
                    case 3:
                    case 12:
                        return Optional.of(((avkc) aogbVar.f.b()).a((String) emylVar5.get(), false));
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 13:
                    case 14:
                    case 23:
                        return (((aojk) aogbVar.i.b()).b() && ((cfsk) aogbVar.j.b()).b((String) emylVar5.get())) ? Optional.of(((avkc) aogbVar.f.b()).d((String) emylVar5.get())) : Optional.empty();
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        try {
                            return Optional.of(((avkc) aogbVar.f.b()).a((String) aogbVar.n((String) emylVar5.get(), (String) emylVar6.get(), true).get(), false));
                        } catch (IllegalArgumentException e) {
                            ensk j = aogb.d.j();
                            j.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getRcsIdentifier", (char) 838, "CsMessagingIdentityFactoryImplV3.java")).q("Phone number could not be normalized");
                            return Optional.empty();
                        }
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoga) emylVar4.get()).a().name())));
                }
            }
        });
    }

    final emyl r(final emyl emylVar) {
        return emys.a(new emyl() { // from class: aofl
            @Override // defpackage.emyl
            public final Object get() {
                Optional optional = (Optional) emylVar.get();
                final aogb aogbVar = aogb.this;
                return optional.map(new Function() { // from class: aoeu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ctvb) aogb.this.g.b()).z((ctvf) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
    }

    final emyl s(final emyl emylVar, final emyl emylVar2, final emyl emylVar3, final emyl emylVar4) {
        return emys.a(new emyl() { // from class: aoeq
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar5 = emylVar;
                int ordinal = ((aoga) emylVar5.get()).a().ordinal();
                aogb aogbVar = aogb.this;
                emyl emylVar6 = emylVar2;
                emyl emylVar7 = emylVar4;
                switch (ordinal) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return (String) emylVar6.get();
                    case 8:
                        if (((Boolean) aoqm.a.e()).booleanValue()) {
                            return aogb.t((String) emylVar6.get(), (!((Optional) emylVar7.get()).isPresent() || ((ctvf) ((Optional) emylVar7.get()).get()).a()) ? ((ctvb) aogbVar.g.b()).f((String) emylVar6.get()) : ((ctvb) aogbVar.g.b()).g((String) emylVar6.get(), ((ctvf) ((Optional) emylVar7.get()).get()).toString()), true);
                        }
                        return (String) emylVar6.get();
                    case 9:
                        if (((Boolean) aoqm.a.e()).booleanValue()) {
                            return aogb.t((String) emylVar6.get(), (Optional) emylVar7.get(), false);
                        }
                        return (String) emylVar6.get();
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        return (String) aogbVar.n((String) emylVar6.get(), (String) emylVar3.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoga) emylVar5.get()).a().name())));
                }
            }
        });
    }
}
