package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgwk extends chdj {
    public static final cskc a = cskc.g("BugleNetwork", "AnonymousRegistrationProvider");
    public final ffbr b;
    public final fazb c;
    private final ffbr d;
    private final chrz e;
    private final chhg f;
    private final errl g;

    public cgwk(errl errlVar, errl errlVar2, errl errlVar3, chrv chrvVar, chga chgaVar, ffbr ffbrVar, cqoh cqohVar, chrz chrzVar, Optional optional, fazb fazbVar, ffbr ffbrVar2, chhg chhgVar) {
        super(errlVar, errlVar2, chrvVar, cqohVar, chgaVar, optional);
        this.e = chrzVar;
        this.c = fazbVar;
        this.f = chhgVar;
        this.d = ffbrVar2;
        this.b = ffbrVar;
        this.g = errlVar3;
    }

    @Override // defpackage.chdj
    protected final chye a(long j) {
        a.m("Creating anonymous register refresh RPC handler");
        final chhg chhgVar = this.f;
        Optional empty = Optional.empty();
        chhgVar.getClass();
        Callable callable = new Callable() { // from class: cgwg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                chhg chhgVar2 = chhg.this;
                return ((chmx) chhgVar2.b.b()).a.h().h(new emwl() { // from class: chgy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        chlp chlpVar = (chlp) obj;
                        byte[] I = chlpVar.f.I();
                        byte[] I2 = chlpVar.e.I();
                        if (I == null || I2 == null || I.length <= 0 || I2.length <= 0) {
                            ensk j2 = chhg.a.j();
                            j2.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 119, "CryptoHelper.java")).q("Missing stored KeyPair");
                            return Optional.empty();
                        }
                        ensk e = chhg.a.e();
                        e.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 108, "CryptoHelper.java")).q("Returning stored KeyPair");
                        try {
                            return Optional.of(new fiwb(fivy.b(I2), new fivz(I)));
                        } catch (fivx e2) {
                            ensk i = chhg.a.i();
                            i.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) ((enrr) i).g(e2)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 's', "CryptoHelper.java")).q("Cannot find valid Curve25519 key pair");
                            return Optional.empty();
                        }
                    }
                }, chhgVar2.c);
            }
        };
        elfl h = ((chmx) this.b.b()).a.h().h(new emwl() { // from class: chmg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chlp) obj).b;
            }
        }, erpp.a).h(new emwl() { // from class: cgwc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional ofNullable = Optional.ofNullable((String) obj);
                fcej fcejVar = (fcej) fcek.a.createBuilder();
                fgtg fgtgVar = fgtg.DEVICE_ID;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).b = fgtgVar.a();
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).d = "Bugle";
                if (ofNullable.isEmpty()) {
                    cgwk.a.p("Tachyon Anonymous registration Id is not available");
                } else {
                    String str = (String) ofNullable.get();
                    fcejVar.copyOnWrite();
                    ((fcek) fcejVar.instance).c = str;
                }
                return (fcek) fcejVar.build();
            }
        }, this.r);
        chrz chrzVar = this.e;
        ffbr ffbrVar = chrzVar.a;
        ciil ciilVar = ciil.c;
        chyd chydVar = (chyd) ffbrVar.b();
        chydVar.getClass();
        errl errlVar = (errl) chrzVar.b.b();
        errlVar.getClass();
        return new chry(chydVar, errlVar, j, empty, callable, h, ciilVar);
    }

    @Override // defpackage.chdj
    protected final ciil b() {
        return ciil.c;
    }

    @Override // defpackage.chdj
    public final synchronized elfl c() {
        return ((chmx) this.b.b()).a();
    }

    @Override // defpackage.chdj
    protected final elfl d() {
        a.m("doing first time anonymous tachyon registration");
        final ciin ciinVar = (ciin) this.d.b();
        return elfl.g(ciinVar.c((fcfo) this.u.a("Bugle").build())).i(new eroh() { // from class: cgwh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ciinVar.d(cgwk.this.s, (fcbn) obj);
            }
        }, this.g).i(new eroh() { // from class: cgwi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ciin.this.e((fcbp) obj);
            }
        }, this.r).i(new eroh() { // from class: cgwj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final fcbp fcbpVar = (fcbp) obj;
                cgwk.a.m("Received Tachyon registration");
                if (fcbpVar == null) {
                    cgwk.a.n("Tachyon anonymous register response was null");
                    throw new IllegalArgumentException("Tachyon anonymous register response was null");
                }
                final cgwk cgwkVar = cgwk.this;
                if ((fcbpVar.b & 4) != 0) {
                    fcfi fcfiVar = fcbpVar.e;
                    if (fcfiVar == null) {
                        fcfiVar = fcfi.a;
                    }
                    cgwk.y(fcfiVar);
                }
                if ((fcbpVar.b & 2) == 0) {
                    cgwk.a.n("Tachyon anonymous register response has no auth token");
                    throw new IllegalArgumentException("Tachyon anonymous register response has no auth token");
                }
                final fcdu fcduVar = fcbpVar.d;
                if (fcduVar == null) {
                    fcduVar = fcdu.a;
                }
                return cgwkVar.x(fcduVar).i(new eroh() { // from class: cgwe
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        fcbp fcbpVar2 = fcbpVar;
                        if ((fcbpVar2.b & 8) == 0) {
                            cgwk.a.p("Anonymous registration response does not contain Id.");
                            return elfo.e(null);
                        }
                        fcek fcekVar = fcbpVar2.f;
                        if (fcekVar == null) {
                            fcekVar = fcek.a;
                        }
                        final String str = fcekVar.c;
                        if (TextUtils.isEmpty(str)) {
                            cgwk.a.p("Anonymous registration response contains empty Id.");
                            return elfo.e(null);
                        }
                        final cgwk cgwkVar2 = cgwk.this;
                        chmx chmxVar = (chmx) cgwkVar2.b.b();
                        chmxVar.b.l("tachyon_registration_id", str);
                        return chmxVar.a.j(new emwl() { // from class: chmp
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                chlo chloVar = (chlo) ((chlp) obj3).toBuilder();
                                chloVar.copyOnWrite();
                                chlp chlpVar = (chlp) chloVar.instance;
                                String str2 = str;
                                str2.getClass();
                                chlpVar.b = str2;
                                return (chlp) chloVar.build();
                            }
                        }).h(new emwl() { // from class: chmq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, erpp.a).h(new emwl() { // from class: cgwd
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                Iterator it = ((Set) cgwk.this.c.b()).iterator();
                                while (it.hasNext()) {
                                    ((cijg) it.next()).c(str);
                                }
                                return null;
                            }
                        }, cgwkVar2.q);
                    }
                }, cgwkVar.r).h(new emwl() { // from class: cgwf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return fcdu.this;
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }

    @Override // defpackage.chdj
    protected final elfl e() {
        return ((chmx) this.b.b()).c();
    }

    @Override // defpackage.chdj
    protected final elfl f() {
        return ((chmx) this.b.b()).a.h().h(new emwl() { // from class: chmo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((chlp) obj).d);
            }
        }, erpp.a);
    }

    @Override // defpackage.chdj
    protected final elfl g(final byte[] bArr) {
        return ((chmx) this.b.b()).a.j(new emwl() { // from class: chmj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlo chloVar = (chlo) ((chlp) obj).toBuilder();
                eyee x = eyee.x(bArr);
                chloVar.copyOnWrite();
                ((chlp) chloVar.instance).c = x;
                return (chlp) chloVar.build();
            }
        }).h(new emwl() { // from class: chmk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chdj
    protected final elfl h(long j) {
        return ((chmx) this.b.b()).d(j);
    }

    @Override // defpackage.chdj
    protected final elfl i(fcbv fcbvVar) {
        fcdu fcduVar = fcbvVar.d;
        if (fcduVar == null) {
            fcduVar = fcdu.a;
        }
        return x(fcduVar);
    }

    @Override // defpackage.cgwn
    public final String j() {
        return "Bugle";
    }
}
