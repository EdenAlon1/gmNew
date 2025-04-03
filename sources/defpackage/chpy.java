package defpackage;

import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chpy {
    public static final cskc a = cskc.g("BugleProtoData", "TachyonPhoneDataService");
    public final comc b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final String g;
    private final Set h;
    private final ffbr i;

    public chpy(comy comyVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, ffbr ffbrVar4, String str) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.i = ffbrVar4;
        this.g = str;
        this.c = errlVar;
        comu c = comv.c();
        c.d(comb.TACHYON_PHONE);
        c.g(str);
        c.f(chod.a);
        c.c(new Supplier() { // from class: choi
            @Override // java.util.function.Supplier
            public final Object get() {
                return new choe();
            }
        });
        c.b(true);
        this.b = comyVar.a(c.a());
        this.h = new CopyOnWriteArraySet((Collection) fazbVar.b());
    }

    public static epac k(chob chobVar) {
        int ordinal = chobVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? epac.UNKNOWN_PREKEY_STATE : epac.LOW_PREKEYS : epac.SUFFICIENT_PREKEYS;
    }

    public static epae l(choc chocVar) {
        int ordinal = chocVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? epae.UNKNOWN_TACHYON_STATE : epae.REGISTERED_WITH_PREKEYS : epae.REGISTERED_WITHOUT_PREKEYS : epae.NOT_REGISTERED;
    }

    public final elfl a() {
        return this.b.h();
    }

    public final elfl b() {
        return this.b.h().h(new emwl() { // from class: chpj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chod) obj).f.I();
            }
        }, erpp.a);
    }

    public final elfl c() {
        return this.b.h().h(new emwl() { // from class: chol
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chod) obj).d.I();
            }
        }, erpp.a);
    }

    public final elfl d() {
        return this.b.h().h(new emwl() { // from class: chow
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                choc b = choc.b(((chod) obj).i);
                return b == null ? choc.UNRECOGNIZED : b;
            }
        }, erpp.a);
    }

    public final elfl e() {
        return this.b.h().h(new emwl() { // from class: chox
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chod) obj).h.I();
            }
        }, erpp.a);
    }

    public final elfl f() {
        return this.b.j(new emwl() { // from class: chpn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                choa choaVar = (choa) ((chod) obj).toBuilder();
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).r = 0;
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).q = 0L;
                return (chod) choaVar.build();
            }
        }).h(new emwl() { // from class: chpo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final elfl g() {
        a.p("Resetting registration state");
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new emwl() { // from class: chpk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chod chodVar = (chod) obj;
                atomicReference.set(chodVar);
                choa choaVar = (choa) chodVar.toBuilder();
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).h = chod.a.h;
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).d = chod.a.d;
                choc chocVar = choc.NOT_REGISTERED;
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).i = chocVar.a();
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).k = 0;
                return (chod) choaVar.build();
            }
        }).i(new eroh() { // from class: chpl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                choc b = choc.b(((chod) atomicReference2.get()).i);
                if (b == null) {
                    b = choc.UNRECOGNIZED;
                }
                chpy chpyVar = chpy.this;
                chpyVar.p(b, choc.NOT_REGISTERED, 2);
                choc b2 = choc.b(((chod) atomicReference2.get()).i);
                if (b2 == null) {
                    b2 = choc.UNRECOGNIZED;
                }
                return chpyVar.o(b2, choc.NOT_REGISTERED, 2);
            }
        }, this.c);
    }

    public final elfl h(final chob chobVar) {
        csjb c = a.c();
        c.I("Tachyon PrekeyState set for phone number");
        c.A("state", chobVar);
        c.r();
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new emwl() { // from class: chpw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chod chodVar = (chod) obj;
                atomicReference.set(chodVar);
                choa choaVar = (choa) chodVar.toBuilder();
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).j = chobVar.a();
                return (chod) choaVar.build();
            }
        }).h(new emwl() { // from class: chpx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chob b = chob.b(((chod) atomicReference.get()).j);
                if (b == null) {
                    b = chob.UNRECOGNIZED;
                }
                chob chobVar2 = chobVar;
                epac k = chpy.k(b);
                epac k2 = chpy.k(chobVar2);
                if (k == k2) {
                    return null;
                }
                chpy chpyVar = chpy.this;
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_E2EE_STATE_TRANSITION;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                epkf epkfVar = (epkf) epkg.a.createBuilder();
                epkfVar.copyOnWrite();
                epkg epkgVar = (epkg) epkfVar.instance;
                epkgVar.c = k.d;
                epkgVar.b |= 1;
                epkfVar.copyOnWrite();
                epkg epkgVar2 = (epkg) epkfVar.instance;
                epkgVar2.d = k2.d;
                epkgVar2.b |= 2;
                epkg epkgVar3 = (epkg) epkfVar.build();
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                epkgVar3.getClass();
                eolvVar2.aa = epkgVar3;
                eolvVar2.c |= 16777216;
                ((akxl) chpyVar.d.b()).j(eoluVar);
                return null;
            }
        }, this.c);
    }

    public final elfl i(final choc chocVar, final Optional optional, final Optional optional2, final Optional optional3) {
        csjb c = a.c();
        c.I("Setting probationary values");
        c.A("state", chocVar);
        if (optional.isPresent()) {
            c.A("client feature flags", ((fcee) optional.get()).c.toString());
        }
        if (optional2.isPresent()) {
            c.A("client capabilities extension", ((fceb) optional2.get()).b.toString());
        }
        if (optional3.isPresent()) {
            c.A("client caps", ((fcks) optional3.get()).b.toString());
        }
        c.r();
        return this.b.j(new emwl() { // from class: chot
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final choa choaVar = (choa) ((chod) obj).toBuilder();
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).k = choc.this.a();
                choaVar.getClass();
                optional.ifPresent(new Consumer() { // from class: chpa
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        choa choaVar2 = choa.this;
                        fcee fceeVar = (fcee) obj2;
                        choaVar2.copyOnWrite();
                        chod chodVar = (chod) choaVar2.instance;
                        chod chodVar2 = chod.a;
                        fceeVar.getClass();
                        chodVar.l = fceeVar;
                        chodVar.b |= 1;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                optional2.ifPresent(new Consumer() { // from class: chpb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        choa choaVar2 = choa.this;
                        fceb fcebVar = (fceb) obj2;
                        choaVar2.copyOnWrite();
                        chod chodVar = (chod) choaVar2.instance;
                        chod chodVar2 = chod.a;
                        fcebVar.getClass();
                        chodVar.n = fcebVar;
                        chodVar.b |= 4;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                optional3.ifPresent(new Consumer() { // from class: chpc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        choa choaVar2 = choa.this;
                        fcks fcksVar = (fcks) obj2;
                        choaVar2.copyOnWrite();
                        chod chodVar = (chod) choaVar2.instance;
                        chod chodVar2 = chod.a;
                        fcksVar.getClass();
                        chodVar.s = fcksVar;
                        chodVar.b |= 16;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return (chod) choaVar.build();
            }
        }).h(new emwl() { // from class: chou
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final elfl j(final byte[] bArr) {
        return this.b.j(new emwl() { // from class: chon
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                choa choaVar = (choa) ((chod) obj).toBuilder();
                eyee x = eyee.x(bArr);
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).h = x;
                return (chod) choaVar.build();
            }
        }).h(new emwl() { // from class: choo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final Optional m(String str) {
        try {
            cfva cfvaVar = aoqm.a;
            return ((Boolean) new aopi().get()).booleanValue() ? Optional.of(((avkc) this.i.b()).a(str, false)) : Optional.empty();
        } catch (avkg unused) {
            csjb c = a.c();
            c.I("Could not create ChatEndpoint from ");
            c.M("phone number", str);
            c.r();
            return Optional.empty();
        }
    }

    public final elfl n(final int i) {
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new emwl() { // from class: chop
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chod chodVar = (chod) obj;
                csjb c = chpy.a.c();
                c.I("Setting probationary values");
                choc b = choc.b(chodVar.k);
                if (b == null) {
                    b = choc.UNRECOGNIZED;
                }
                c.A("state", b);
                fcee fceeVar = chodVar.l;
                if (fceeVar == null) {
                    fceeVar = fcee.b;
                }
                c.A("client feature flags", fceeVar.c.toString());
                fceb fcebVar = chodVar.n;
                if (fcebVar == null) {
                    fcebVar = fceb.a;
                }
                c.A("client capabilities extension", fcebVar.b.toString());
                if ((chodVar.b & 16) != 0) {
                    fcks fcksVar = chodVar.s;
                    if (fcksVar == null) {
                        fcksVar = fcks.a;
                    }
                    c.A("client caps", fcksVar.b.toString());
                }
                c.r();
                choa choaVar = (choa) chodVar.toBuilder();
                choc b2 = choc.b(chodVar.k);
                if (b2 == null) {
                    b2 = choc.UNRECOGNIZED;
                }
                if (b2 != choc.UNSET_TACHYON_STATE) {
                    atomicReference.set(chodVar);
                    choc b3 = choc.b(chodVar.k);
                    if (b3 == null) {
                        b3 = choc.UNRECOGNIZED;
                    }
                    choaVar.copyOnWrite();
                    ((chod) choaVar.instance).i = b3.a();
                    choaVar.copyOnWrite();
                    ((chod) choaVar.instance).k = 0;
                } else {
                    chpy.a.n("Committing probationary state without the probationary state being set in the first place. Ignoring the commit.");
                }
                if ((chodVar.b & 1) != 0) {
                    fcee fceeVar2 = chodVar.l;
                    if (fceeVar2 == null) {
                        fceeVar2 = fcee.b;
                    }
                    choaVar.copyOnWrite();
                    chod chodVar2 = (chod) choaVar.instance;
                    fceeVar2.getClass();
                    chodVar2.m = fceeVar2;
                    chodVar2.b |= 2;
                    choaVar.copyOnWrite();
                    chod chodVar3 = (chod) choaVar.instance;
                    chodVar3.l = null;
                    chodVar3.b &= -2;
                } else {
                    chpy.a.m("No probationary client feature flags. Skipping commit");
                }
                if ((chodVar.b & 4) != 0) {
                    fceb fcebVar2 = chodVar.n;
                    if (fcebVar2 == null) {
                        fcebVar2 = fceb.a;
                    }
                    choaVar.copyOnWrite();
                    chod chodVar4 = (chod) choaVar.instance;
                    fcebVar2.getClass();
                    chodVar4.o = fcebVar2;
                    chodVar4.b |= 8;
                    choaVar.copyOnWrite();
                    chod chodVar5 = (chod) choaVar.instance;
                    chodVar5.n = null;
                    chodVar5.b &= -5;
                } else {
                    chpy.a.m("No probationary client capabilities. Skipping commit");
                }
                if ((chodVar.b & 16) != 0) {
                    fcks fcksVar2 = chodVar.s;
                    if (fcksVar2 == null) {
                        fcksVar2 = fcks.a;
                    }
                    choaVar.copyOnWrite();
                    chod chodVar6 = (chod) choaVar.instance;
                    fcksVar2.getClass();
                    chodVar6.t = fcksVar2;
                    chodVar6.b |= 32;
                    choaVar.copyOnWrite();
                    chod chodVar7 = (chod) choaVar.instance;
                    chodVar7.s = null;
                    chodVar7.b &= -17;
                }
                return (chod) choaVar.build();
            }
        }).i(new eroh() { // from class: choq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                chod chodVar = (chod) obj;
                if (atomicReference2.get() == null) {
                    return elfo.e(null);
                }
                choc b = choc.b(((chod) atomicReference2.get()).i);
                if (b == null) {
                    b = choc.UNRECOGNIZED;
                }
                choc b2 = choc.b(chodVar.i);
                if (b2 == null) {
                    b2 = choc.UNRECOGNIZED;
                }
                int i2 = i;
                chpy chpyVar = chpy.this;
                chpyVar.p(b, b2, i2);
                choc b3 = choc.b(((chod) atomicReference2.get()).i);
                if (b3 == null) {
                    b3 = choc.UNRECOGNIZED;
                }
                choc b4 = choc.b(chodVar.i);
                if (b4 == null) {
                    b4 = choc.UNRECOGNIZED;
                }
                return chpyVar.o(b3, b4, i2);
            }
        }, this.c);
    }

    public final elfl o(choc chocVar, choc chocVar2, int i) {
        a.m("Notifying tachyon phone data store listeners");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((cije) it.next()).l(this.g, chocVar2, chocVar, i));
        }
        return elfo.j(arrayList).a(new Callable() { // from class: chpi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, erpp.a);
    }

    public final void p(choc chocVar, choc chocVar2, int i) {
        epae l = l(chocVar);
        epae l2 = l(chocVar2);
        if (l == l2) {
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_E2EE_STATE_TRANSITION;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        epkh epkhVar = (epkh) epkj.a.createBuilder();
        epkhVar.copyOnWrite();
        epkj epkjVar = (epkj) epkhVar.instance;
        epkjVar.c = l.e;
        epkjVar.b |= 1;
        epkhVar.copyOnWrite();
        epkj epkjVar2 = (epkj) epkhVar.instance;
        epkjVar2.d = l2.e;
        epkjVar2.b |= 2;
        epkhVar.copyOnWrite();
        epkj epkjVar3 = (epkj) epkhVar.instance;
        epkjVar3.e = i - 1;
        epkjVar3.b |= 4;
        epkj epkjVar4 = (epkj) epkhVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epkjVar4.getClass();
        eolvVar2.ab = epkjVar4;
        eolvVar2.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        ((akxl) this.d.b()).j(eoluVar);
    }
}
