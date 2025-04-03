package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aodp implements aobh {
    public static final cfva a = cfvl.i(cfvl.b, "enable_error_for_unknown_destination_format", false);
    static final cfva b = cfvl.i(cfvl.b, "mi_normalizing_eagerly_calculates", false);
    static final cfva c = cfvl.i(cfvl.b, "legacy_uses_supplier", false);
    public static final cskc d = cskc.g("Bugle", "CsMessagingIdentityFactoryImpl");
    public final fazb e;
    public final fazb f;
    public final fazb g;
    public final fazb h;
    private final fazb i;

    public aodp(fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5) {
        this.e = fazbVar;
        this.f = fazbVar2;
        this.g = fazbVar3;
        this.h = fazbVar4;
        this.i = fazbVar5;
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

    static final String u(String str, String str2) {
        return v(str) ? str2 : str;
    }

    public static boolean v(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    private final emyl w(final emyl emylVar, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aodb
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar3 = emylVar;
                int ordinal = ((aoqz) emylVar3.get()).ordinal();
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
                        return new aokr(((ctvb) aodp.this.g.b()).p((String) emylVar4.get()));
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoqz) emylVar3.get()).name())));
                }
            }
        });
    }

    private final emyl x(final emyl emylVar, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aobi
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar4 = emylVar;
                int ordinal = ((aoqz) emylVar4.get()).ordinal();
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
                        return Optional.of((String) aodp.this.o((String) emylVar5.get(), (String) emylVar3.get(), false).get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoqz) emylVar4.get()).name())));
                }
            }
        });
    }

    @Override // defpackage.aobh
    public final aoku a(final String str) {
        return ((aokt) this.i.b()).c(new emyl() { // from class: aobp
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return str;
            }
        }, new emyl() { // from class: aobq
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return str;
            }
        }, new emyl() { // from class: aobr
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return Optional.of(str);
            }
        }, new emyl() { // from class: aobs
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return str;
            }
        }, new emyl() { // from class: aobu
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return str;
            }
        }, emys.a(new emyl() { // from class: aobv
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((avkc) aodp.this.f.b()).a(str, false));
            }
        }), new emyl() { // from class: aobw
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return new aokr(str);
            }
        }, new emyl() { // from class: aobx
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return aoqz.BOT;
            }
        }, new aoby(), new aoby());
    }

    @Override // defpackage.aobh
    public final aoku b(final awui awuiVar) {
        emyl emylVar = new emyl() { // from class: aode
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return awui.this.d;
            }
        };
        final emyl a2 = emys.a(new emyl() { // from class: aodf
            @Override // defpackage.emyl
            public final Object get() {
                return ((ctvb) aodp.this.g.b()).r();
            }
        });
        awuh b2 = awuh.b(awuiVar.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        emyl n = n(emylVar, b2 == awuh.BOT, a2);
        emyl m = m(n, emylVar, a2, emylVar);
        final emyl r = r(m);
        emyl a3 = emys.a(new emyl() { // from class: aodg
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                Optional optional = (Optional) emyl.this.get();
                emyl emylVar2 = a2;
                emylVar2.getClass();
                return (String) optional.orElseGet(new aock(emylVar2));
            }
        });
        emyl s = s(n, emylVar, a3, m);
        return ((aokt) this.i.b()).c(emylVar, emylVar, x(n, emylVar, a3), p(n, a3, emylVar, s), s, q(n, emylVar, a3), w(n, emylVar), n, m, r);
    }

    @Override // defpackage.aobh
    public final aoku c(final String str, emyl emylVar) {
        final ctvb ctvbVar = (ctvb) this.g.b();
        final emyl a2 = emys.a(new emyl() { // from class: aobt
            @Override // defpackage.emyl
            public final Object get() {
                return ((aoqw) aodp.this.e.b()).e(str);
            }
        });
        final emyl n = n(a2, false, new emyl() { // from class: aocp
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return "";
            }
        });
        final emyl l = l((String) a2.get(), emylVar, n);
        final emyl a3 = emys.a(new emyl() { // from class: aoda
            @Override // defpackage.emyl
            public final Object get() {
                return ((ctvb) aodp.this.g.b()).c((String) l.get());
            }
        });
        final emyl n2 = n(a2, false, l);
        final emyl a4 = emys.a(new emyl() { // from class: aodk
            @Override // defpackage.emyl
            public final Object get() {
                String str2 = (String) a2.get();
                final ctvb ctvbVar2 = ctvbVar;
                return (String) aodp.this.l(str2, new emyl() { // from class: aodc
                    @Override // defpackage.emyl
                    public final Object get() {
                        cfva cfvaVar = aodp.a;
                        return Optional.of(ctvb.this.r());
                    }
                }, n).get();
            }
        });
        final emyl a5 = emys.a(new emyl() { // from class: aodl
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return ctvb.this.c((String) a4.get());
            }
        });
        final emyl n3 = n(a2, false, a4);
        final emyl emylVar2 = new emyl() { // from class: aodm
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                aoqz aoqzVar = (aoqz) emyl.this.get();
                emyl emylVar3 = n2;
                boolean z = false;
                if (!aoqzVar.equals(emylVar3.get())) {
                    emyl emylVar4 = a4;
                    String str2 = (String) l.get();
                    aoqz aoqzVar2 = (aoqz) emylVar3.get();
                    String str3 = (String) emylVar4.get();
                    if (((Boolean) aoqm.b.e()).booleanValue() && !str2.equals(str3) && aoqzVar2 == aoqz.UNKNOWN_DESTINATION_TYPE) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        final emyl emylVar3 = new emyl() { // from class: aodn
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return ((Boolean) emyl.this.get()).booleanValue() ? (aoqz) n3.get() : (aoqz) n2.get();
            }
        };
        emyl emylVar4 = new emyl() { // from class: aodo
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return ((Boolean) emyl.this.get()).booleanValue() ? (String) a4.get() : (String) l.get();
            }
        };
        final emyl emylVar5 = new emyl() { // from class: aobj
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return Optional.of(((Boolean) emyl.this.get()).booleanValue() ? (ctvf) a5.get() : (ctvf) a3.get());
            }
        };
        emyl s = s(emylVar3, a2, emylVar4, emylVar5);
        emyl p = p(emylVar3, emylVar4, a2, s);
        emyl emylVar6 = new emyl() { // from class: aobk
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return ((aoqz) emyl.this.get()).equals(aoqz.EMAIL) ? Optional.empty() : emylVar5.get();
            }
        };
        return ((aokt) this.i.b()).c(a2, new emyl() { // from class: aoce
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return str;
            }
        }, x(emylVar3, a2, emylVar4), p, s, q(emylVar3, a2, emylVar4), w(emylVar3, p), emylVar3, emylVar6, r(emylVar6));
    }

    @Override // defpackage.aobh
    public final aoku d(djrj djrjVar) {
        return c(djrjVar.a, new aoby());
    }

    @Override // defpackage.aobh
    public final aoku e(String str, String str2, String str3, boolean z, final String str4, final emyl emylVar) {
        final String e;
        String str5;
        String u = u(str, str2);
        if (((Boolean) aoqm.c.e()).booleanValue()) {
            str3.getClass();
            u.getClass();
            str4.getClass();
        }
        if (v(u)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            e = str5;
        } else {
            e = ((aoqw) this.e.b()).e(u);
            str5 = str3;
        }
        final aokr aokrVar = (!v(str5) || e.equals("ʼUNKNOWN_SENDER!ʼ")) ? new aokr(emxe.b(str5)) : new aokr(((ctvb) this.g.b()).p(e));
        emyl n = n(new emyl() { // from class: aobo
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return e;
            }
        }, z, emylVar);
        final String b2 = emxe.b(str2);
        if (true == v(b2)) {
            b2 = "ʼUNKNOWN_SENDER!ʼ";
        }
        if (((Boolean) new aopv().get()).booleanValue()) {
            b2 = (String) Optional.ofNullable(str2).filter(new Predicate() { // from class: aocl
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
                    return !aodp.v((String) obj);
                }
            }).orElse("ʼUNKNOWN_SENDER!ʼ");
        }
        emyl n2 = n(new emyl() { // from class: aoco
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return b2;
            }
        }, z, emylVar);
        emyl m = m(n2, new emyl() { // from class: aocq
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return b2;
            }
        }, emylVar, new emyl() { // from class: aocr
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return b2;
            }
        });
        final emyl r = r(m);
        emyl a2 = emys.a(new emyl() { // from class: aocs
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return (String) ((Optional) emyl.this.get()).orElseGet(new aock(emylVar));
            }
        });
        emyl x = x(n2, new emyl() { // from class: aocj
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return b2;
            }
        }, a2);
        emyl s = s(n2, new emyl() { // from class: aoct
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return b2;
            }
        }, a2, m);
        emyl p = p(n2, a2, new emyl() { // from class: aocu
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return e;
            }
        }, s);
        aokt aoktVar = (aokt) this.i.b();
        emyl emylVar2 = p;
        emyl emylVar3 = new emyl() { // from class: aocv
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return e;
            }
        };
        emyl emylVar4 = new emyl() { // from class: aocw
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return str4;
            }
        };
        if (((Boolean) new aopv().get()).booleanValue()) {
            emylVar2 = new emyl() { // from class: aocx
                @Override // defpackage.emyl
                public final Object get() {
                    cfva cfvaVar = aodp.a;
                    return b2;
                }
            };
        }
        return aoktVar.c(emylVar3, emylVar4, x, emylVar2, s, q(n2, new emyl() { // from class: aocm
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return b2;
            }
        }, a2), new emyl() { // from class: aocn
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return aokr.this;
            }
        }, n, m, r);
    }

    @Override // defpackage.aobh
    public final aoku f() {
        return ((aokt) this.i.b()).c(new emyl() { // from class: aocc
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new emyl() { // from class: aocd
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new aoby(), new emyl() { // from class: aocf
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new emyl() { // from class: aocg
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new aoby(), new emyl() { // from class: aoch
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return new aokr("ʼUNKNOWN_SENDER!ʼ");
            }
        }, new emyl() { // from class: aoci
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = aodp.a;
                return aoqz.UNKNOWN_SENDER;
            }
        }, new aoby(), new aoby());
    }

    @Override // defpackage.aobh
    public final aoku g(aoku aokuVar, emyl emylVar) {
        return ((aokt) this.i.b()).a(aokuVar, emylVar);
    }

    @Override // defpackage.aobh
    public final aoku h(aoku aokuVar, String str) {
        aoks b2 = ((aokt) this.i.b()).b(aokuVar, str);
        if (((Boolean) b.e()).booleanValue()) {
            b2.I();
        }
        return b2;
    }

    @Override // defpackage.aobh
    public final aoku i(aoku aokuVar, boolean z) {
        return z ? ((aokt) this.i.b()).b(aokuVar, ((ctvb) this.g.b()).p(aokuVar.n())) : aokuVar;
    }

    @Override // defpackage.aobh
    public final aoku j(final aoku aokuVar, final int i) {
        emyl emylVar = new emyl() { // from class: aodh
            @Override // defpackage.emyl
            public final Object get() {
                String d2 = cuxt.d(emxe.b(aokuVar.n()));
                if (aoqw.h(d2) || aoqw.j(d2)) {
                    return d2;
                }
                int i2 = i;
                aodp aodpVar = aodp.this;
                return ((ctvb) aodpVar.g.b()).v(((aoqw) aodpVar.e.b()).e(d2), ((ctve) aodpVar.h.b()).b(i2));
            }
        };
        aoks a2 = ((Boolean) c.e()).booleanValue() ? ((aokt) this.i.b()).a(aokuVar, emylVar) : ((aokt) this.i.b()).b(aokuVar, (String) emylVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            a2.I();
        }
        return a2;
    }

    @Override // defpackage.aobh
    public final aoku k(final aoku aokuVar) {
        emyl emylVar = new emyl() { // from class: aocb
            @Override // defpackage.emyl
            public final Object get() {
                String b2 = emxe.b(aokuVar.n());
                aodp aodpVar = aodp.this;
                fazb fazbVar = aodpVar.g;
                String d2 = cuxt.d(b2);
                return aoqw.h(d2) ? d2 : ((ctvb) fazbVar.b()).x(((aoqw) aodpVar.e.b()).e(d2));
            }
        };
        aoks a2 = ((Boolean) c.e()).booleanValue() ? ((aokt) this.i.b()).a(aokuVar, emylVar) : ((aokt) this.i.b()).b(aokuVar, (String) emylVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            a2.I();
        }
        return a2;
    }

    public final emyl l(final String str, final emyl emylVar, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aocy
            @Override // defpackage.emyl
            public final Object get() {
                aoqz aoqzVar = (aoqz) emylVar2.get();
                if (aoqzVar == aoqz.EMAIL || aoqzVar == aoqz.BOT || aoqzVar == aoqz.UNKNOWN_SENDER || aoqzVar == aoqz.SATELLITE_ESP || aoqzVar == aoqz.PENPAL_BOT) {
                    return "US";
                }
                String str2 = str;
                ctvb ctvbVar = (ctvb) aodp.this.g.b();
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
        return emys.a(new emyl() { // from class: aobl
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar5 = emylVar;
                int ordinal = ((aoqz) emylVar5.get()).ordinal();
                final aodp aodpVar = aodp.this;
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
                        return ((ctvb) aodpVar.g.b()).f((String) emylVar6.get());
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                        final emyl emylVar7 = emylVar3;
                        return ((ctvb) aodpVar.g.b()).f((String) emylVar4.get()).or(new Supplier() { // from class: aobm
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return Optional.of(((ctvb) aodp.this.g.b()).c((String) emylVar7.get()));
                            }
                        });
                    case 6:
                    case 14:
                        return ((aoqw) aodpVar.e.b()).a((String) emylVar6.get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoqz) emylVar5.get()).name())));
                }
            }
        });
    }

    final emyl n(final emyl emylVar, final boolean z, final emyl emylVar2) {
        return emys.a(new emyl() { // from class: aocz
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar3 = emylVar2;
                if (z) {
                    return aoqz.BOT;
                }
                String str = (String) emylVar.get();
                if (aoqw.h(str)) {
                    return aoqz.EMAIL;
                }
                if (str.equals("ʼUNKNOWN_SENDER!ʼ") || str.isEmpty()) {
                    return aoqz.UNKNOWN_SENDER;
                }
                if (aojl.a(str) || aojl.b(str)) {
                    return aoqz.SATELLITE_ESP;
                }
                aodp aodpVar = aodp.this;
                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((aoqw) aodpVar.e.b()).i(str)) {
                    return aoqz.PENPAL_BOT;
                }
                if (((ctvb) aodpVar.g.b()).L(str)) {
                    return aoqz.PHONE_E164;
                }
                if (((aoqw) aodpVar.e.b()).k(str)) {
                    try {
                        esfh e = ((ctvb) aodpVar.g.b()).e(str, (String) emylVar3.get());
                        int N = ((ctvb) aodpVar.g.b()).N(e);
                        if (N == 4) {
                            if (((ctvb) aodpVar.g.b()).J(e)) {
                                return ((aoqw) aodpVar.e.b()).l(str) ? aoqz.PHONE_SHORT_WITH_COUNTRY : aoqz.PHONE_SHORT_NO_COUNTRY;
                            }
                            N = 4;
                        }
                        if (N == 1) {
                            return aoqz.PHONE_NATIONAL;
                        }
                        if (N == 2) {
                            return ((ctvb) aodpVar.g.b()).f(str).isPresent() ? aoqz.PHONE_LOCAL_WITH_COUNTRY : aoqz.PHONE_LOCAL_NO_COUNTRY;
                        }
                    } catch (esfg e2) {
                        if (((Boolean) aodp.a.e()).booleanValue()) {
                            throw new IllegalStateException("Unknown destination format", e2);
                        }
                        return aoqz.UNKNOWN_DESTINATION_TYPE;
                    }
                }
                if (((Boolean) aodp.a.e()).booleanValue()) {
                    throw new IllegalStateException("Unknown destination format");
                }
                return aoqz.UNKNOWN_DESTINATION_TYPE;
            }
        });
    }

    public final emyl o(final String str, final String str2, final boolean z) {
        return emys.a(new emyl() { // from class: aodi
            @Override // defpackage.emyl
            public final Object get() {
                ctvb ctvbVar = (ctvb) aodp.this.g.b();
                String str3 = str2;
                String str4 = str;
                return ctvbVar.w(str4, str4, str3, z);
            }
        });
    }

    final emyl p(final emyl emylVar, final emyl emylVar2, final emyl emylVar3, final emyl emylVar4) {
        return emys.a(new emyl() { // from class: aodd
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar5 = emylVar;
                int ordinal = ((aoqz) emylVar5.get()).ordinal();
                aodp aodpVar = aodp.this;
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
                        return (String) ((aoqw) aodpVar.e.b()).b((String) emylVar6.get()).orElse((String) emylVar6.get());
                    case 8:
                        return (String) aodpVar.o((String) ((aoqw) aodpVar.e.b()).b((String) emylVar6.get()).orElse((String) emylVar6.get()), (String) emylVar2.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoqz) emylVar5.get()).name())));
                }
            }
        });
    }

    final emyl q(final emyl emylVar, final emyl emylVar2, final emyl emylVar3) {
        return emys.a(new emyl() { // from class: aobz
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar4 = emylVar;
                int ordinal = ((aoqz) emylVar4.get()).ordinal();
                aodp aodpVar = aodp.this;
                emyl emylVar5 = emylVar2;
                emyl emylVar6 = emylVar3;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
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
                    case 3:
                    case 12:
                        return Optional.of(((avkc) aodpVar.f.b()).a((String) emylVar5.get(), false));
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        try {
                            return Optional.of(((avkc) aodpVar.f.b()).a((String) aodpVar.o((String) emylVar5.get(), (String) emylVar6.get(), true).get(), false));
                        } catch (IllegalArgumentException e) {
                            aodp.d.s("Phone number could not be normalized", e);
                            return Optional.empty();
                        }
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoqz) emylVar4.get()).name())));
                }
            }
        });
    }

    final emyl r(final emyl emylVar) {
        return emys.a(new emyl() { // from class: aoca
            @Override // defpackage.emyl
            public final Object get() {
                Optional optional = (Optional) emylVar.get();
                final aodp aodpVar = aodp.this;
                return optional.map(new Function() { // from class: aobn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ctvb) aodp.this.g.b()).z((ctvf) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
    }

    final emyl s(final emyl emylVar, final emyl emylVar2, final emyl emylVar3, final emyl emylVar4) {
        return emys.a(new emyl() { // from class: aodj
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar5 = emylVar;
                int ordinal = ((aoqz) emylVar5.get()).ordinal();
                aodp aodpVar = aodp.this;
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
                            return aodp.t((String) emylVar6.get(), (!((Optional) emylVar7.get()).isPresent() || ((ctvf) ((Optional) emylVar7.get()).get()).a()) ? ((ctvb) aodpVar.g.b()).f((String) emylVar6.get()) : ((ctvb) aodpVar.g.b()).g((String) emylVar6.get(), ((ctvf) ((Optional) emylVar7.get()).get()).toString()), true);
                        }
                        return (String) emylVar6.get();
                    case 9:
                        if (((Boolean) aoqm.a.e()).booleanValue()) {
                            return aodp.t((String) emylVar6.get(), (Optional) emylVar7.get(), false);
                        }
                        return (String) emylVar6.get();
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        return (String) aodpVar.o((String) emylVar6.get(), (String) emylVar3.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((aoqz) emylVar5.get()).name())));
                }
            }
        });
    }
}
