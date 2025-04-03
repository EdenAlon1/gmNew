package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chbu extends chdj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider");
    static final cfup b = cfvl.r(159662717, "new_rcs_token_resets_otp_backoff");
    static final cfup c = cfvl.f(cfvl.b, "tachyon_otp_retry_multiplier_in_millis", 3600000);
    static final cfup d = cfvl.c(cfvl.b, "tachyon_otp_retry_backoff_base", 2.0d);
    static final cfup e = cfvl.e(cfvl.b, "tachyon_otp_retry_max_exponent", 7);
    static final cfup f = cfvl.e(cfvl.b, "tachyon_otp_wait_seconds", (int) TimeUnit.MINUTES.toSeconds(30));
    private final ctwb A;
    private final ctvb B;
    private final ffbr C;
    private final errl D;
    private final Object E;
    private chpy F;
    public final chhg g;
    public final ffbr h;
    public final ffbr i;
    public final ciii j;
    public final errm k;
    public final errl l;
    public final ffbr m;
    public final Object n;
    public kfb o;
    private final chya x;
    private final chxi y;
    private final ffbr z;

    public chbu(errl errlVar, errm errmVar, errl errlVar2, chrv chrvVar, chga chgaVar, cqoh cqohVar, Optional optional, chya chyaVar, chxi chxiVar, chhg chhgVar, ffbr ffbrVar, ctwb ctwbVar, ctvb ctvbVar, ffbr ffbrVar2, ffbr ffbrVar3, errm errmVar2, ffbr ffbrVar4, ffbr ffbrVar5, ciii ciiiVar) {
        super(errlVar, errmVar, chrvVar, cqohVar, chgaVar, optional);
        this.n = new Object();
        this.E = new Object();
        this.k = errmVar;
        this.g = chhgVar;
        this.x = chyaVar;
        this.y = chxiVar;
        this.z = ffbrVar;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ciiiVar;
        this.l = errlVar2;
        this.A = ctwbVar;
        this.B = ctvbVar;
        this.m = ffbrVar2;
        this.C = ffbrVar3;
        this.D = errmVar2;
    }

    @Override // defpackage.chdj
    protected final chye a(long j) {
        ensk e2 = a.e();
        e2.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "createRegisterRefreshRpcHandler", 189, "PhoneRegistrationProvider.java")).q("Creating phone register refresh RPC handler");
        Optional of = Optional.of(this.j.a);
        Callable callable = new Callable() { // from class: chaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                chbu chbuVar = chbu.this;
                return chbuVar.g.a(chbuVar.j.a);
            }
        };
        Supplier supplier = new Supplier() { // from class: chba
            @Override // java.util.function.Supplier
            public final Object get() {
                return chbu.this.r();
            }
        };
        chxi chxiVar = this.y;
        chyd chydVar = (chyd) chxiVar.a.b();
        chydVar.getClass();
        chpz chpzVar = (chpz) chxiVar.b.b();
        chpzVar.getClass();
        chih chihVar = (chih) chxiVar.c.b();
        chihVar.getClass();
        aolr aolrVar = (aolr) chxiVar.d.b();
        aolrVar.getClass();
        ((areq) chxiVar.f.b()).getClass();
        ((errl) chxiVar.h.b()).getClass();
        ((cibe) chxiVar.i.b()).getClass();
        return new chxh(chydVar, chpzVar, chihVar, aolrVar, chxiVar.e, chxiVar.g, j, of, callable, supplier, this.j);
    }

    @Override // defpackage.chdj
    public final /* synthetic */ ciil b() {
        return this.j;
    }

    @Override // defpackage.chdj
    public final synchronized elfl c() {
        return m().g();
    }

    @Override // defpackage.chdj
    protected final elfl d() {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 220, "PhoneRegistrationProvider.java")).q("doing first time phone tachyon registration");
        if (!this.A.r()) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 223, "PhoneRegistrationProvider.java")).q("SIM is not present. Do not perform first-time Tachyon phone registration.");
            return elfo.d(new fedn(Status.l.d(new IllegalStateException("SIM is not present"))));
        }
        if (!this.B.G()) {
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 232, "PhoneRegistrationProvider.java")).q("Not default SMS app. Do not perform first-time Tachyon phone registration.");
            return elfo.d(new fedn(Status.l.d(new IllegalStateException("Not default SMS app"))));
        }
        chya chyaVar = this.x;
        ciii ciiiVar = this.j;
        chzf chzfVar = (chzf) chyaVar.a.b();
        chzfVar.getClass();
        chhg chhgVar = (chhg) chyaVar.b.b();
        chhgVar.getClass();
        errl errlVar = (errl) chyaVar.c.b();
        errlVar.getClass();
        chih chihVar = (chih) chyaVar.d.b();
        chihVar.getClass();
        chpz chpzVar = (chpz) chyaVar.e.b();
        chpzVar.getClass();
        aolr aolrVar = (aolr) chyaVar.f.b();
        aolrVar.getClass();
        ((areq) chyaVar.h.b()).getClass();
        ((cibe) chyaVar.m.b()).getClass();
        final chxz chxzVar = new chxz(chzfVar, chhgVar, errlVar, chihVar, chpzVar, aolrVar, chyaVar.g, chyaVar.i, chyaVar.j, chyaVar.k, chyaVar.l, ciiiVar);
        return m().g().i(new eroh() { // from class: chac
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chbu chbuVar = chbu.this;
                if (((djrv) chbuVar.m.b()).w(chbuVar.j.a)) {
                    ensk h4 = chbu.a.h();
                    h4.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRcsAvailability", 273, "PhoneRegistrationProvider.java")).q("Phone number to register is provisioned for RCS");
                    return elfo.e(null);
                }
                ensk j = chbu.a.j();
                j.Y(ente.a, "BugleNetwork");
                enrr enrrVar = (enrr) j;
                enrrVar.aa(ensy.MEDIUM);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRcsAvailability", 277, "PhoneRegistrationProvider.java")).q("Phone number to register is not provisioned for RCS");
                return elfo.d(new fedn(Status.l.withDescription("Phone number to register is not provisioned for RCS")));
            }
        }, this.D).i(new eroh() { // from class: chad
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chxzVar.c((fcfo) chbu.this.u.a("RCS").build());
            }
        }, this.q).i(new eroh() { // from class: chae
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final chbu chbuVar = chbu.this;
                final fcbx fcbxVar = (fcbx) obj;
                final chpy m = chbuVar.m();
                fbzp fbzpVar = fcbxVar.f;
                if (fbzpVar == null) {
                    fbzpVar = fbzp.a;
                }
                final String str = fbzpVar.b;
                return chbuVar.m().a().i(new eroh() { // from class: chau
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        chod chodVar = (chod) obj2;
                        int i = chodVar.r;
                        if (((Boolean) chbu.b.e()).booleanValue()) {
                            String str2 = str;
                            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(chodVar.p, str2)) {
                                chpy chpyVar = m;
                                ensk h4 = chbu.a.h();
                                h4.Y(ente.a, "BugleNetwork");
                                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRetryBackoffIfNeeded", 317, "PhoneRegistrationProvider.java")).r("New RCS token, skips back-off. retryCount: %d", i);
                                return chpyVar.f();
                            }
                        }
                        long j = chodVar.q;
                        if (i != 0) {
                            long epochMilli = chbu.this.t.f().toEpochMilli();
                            if (epochMilli >= j) {
                                long longValue = ((long) (((Long) chbu.c.e()).longValue() * Math.pow(((Double) chbu.d.e()).doubleValue(), Math.min(i - 1, ((Integer) chbu.e.e()).intValue())))) + j;
                                if (epochMilli < longValue) {
                                    ensk j2 = chbu.a.j();
                                    j2.Y(ente.a, "BugleNetwork");
                                    enrr enrrVar = (enrr) j2;
                                    enrrVar.aa(ensy.MEDIUM);
                                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "isTimeToRetry", 348, "PhoneRegistrationProvider.java")).K("Registration throttled due to consecutive OTP failure. current: %d, retryCount:%d, lastTimestamp: %d, earliestTimeToRetry:%d", Long.valueOf(epochMilli), Integer.valueOf(i), Long.valueOf(j), Long.valueOf(longValue));
                                    return elfo.d(new fedn(Status.l.d(new chbt())));
                                }
                            }
                        }
                        return elfo.e(null);
                    }
                }, chbuVar.l).i(new eroh() { // from class: chav
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        enru enruVar2 = chbu.a;
                        comc comcVar = chpy.this.b;
                        final String str2 = str;
                        return comcVar.j(new emwl() { // from class: chor
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                choa choaVar = (choa) ((chod) obj3).toBuilder();
                                choaVar.copyOnWrite();
                                chod chodVar = (chod) choaVar.instance;
                                String str3 = str2;
                                str3.getClass();
                                chodVar.p = str3;
                                return (chod) choaVar.build();
                            }
                        }).h(new emwl() { // from class: chos
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, erpp.a);
                    }
                }, chbuVar.l).h(new emwl() { // from class: chaw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enru enruVar2 = chbu.a;
                        return fcbx.this;
                    }
                }, erpp.a);
            }
        }, this.l).i(new eroh() { // from class: chaf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chxzVar.d(chbu.this.s, (fcbx) obj);
            }
        }, this.l).i(new eroh() { // from class: chag
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ciin.this.e((fcbz) obj);
            }
        }, this.l).h(new emwl() { // from class: chai
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fcbz fcbzVar = (fcbz) obj;
                if (fcbzVar == null) {
                    throw new IllegalArgumentException("Tachyon phone register response was null");
                }
                if ((fcbzVar.b & 8) != 0) {
                    fcfi fcfiVar = fcbzVar.f;
                    if (fcfiVar == null) {
                        fcfiVar = fcfi.a;
                    }
                    chbu.y(fcfiVar);
                }
                if ((fcbzVar.b & 2) != 0) {
                    return fcbzVar;
                }
                throw new IllegalArgumentException("Tachyon phone register response has no auth token");
            }
        }, this.l).i(new eroh() { // from class: chaj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final fcbz fcbzVar = (fcbz) obj;
                boolean z = fcbzVar.d;
                chbu chbuVar = chbu.this;
                if (z) {
                    return chbuVar.m().f().h(new emwl() { // from class: chbo
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            enru enruVar2 = chbu.a;
                            return fcbz.this;
                        }
                    }, erpp.a);
                }
                chpy m = chbuVar.m();
                final long epochMilli = chbuVar.t.f().toEpochMilli();
                return m.b.j(new emwl() { // from class: choy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        chod chodVar = (chod) obj2;
                        choa choaVar = (choa) chodVar.toBuilder();
                        int i = chodVar.r + 1;
                        choaVar.copyOnWrite();
                        ((chod) choaVar.instance).r = i;
                        choaVar.copyOnWrite();
                        ((chod) choaVar.instance).q = epochMilli;
                        return (chod) choaVar.build();
                    }
                }).h(new emwl() { // from class: choz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, erpp.a).h(new emwl() { // from class: chbp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enru enruVar2 = chbu.a;
                        return fcbz.this;
                    }
                }, erpp.a);
            }
        }, this.l).i(new eroh() { // from class: chak
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fcbz fcbzVar = (fcbz) obj;
                boolean z = fcbzVar.d;
                final chbu chbuVar = chbu.this;
                if (z) {
                    ensk h4 = chbu.a.h();
                    h4.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 260, "PhoneRegistrationProvider.java")).q("Registration request is completed and verified.");
                    final fcdu fcduVar = fcbzVar.e;
                    if (fcduVar == null) {
                        fcduVar = fcdu.a;
                    }
                    return elfl.g(elfr.d(chbuVar.x(fcduVar), chbuVar.q(fcbzVar.g), chbuVar.m().n(3)).a(new Callable() { // from class: chal
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            enru enruVar2 = chbu.a;
                            return fcdu.this;
                        }
                    }, erpp.a));
                }
                ensk h5 = chbu.a.h();
                h5.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "handleUnverifiedResponse", 464, "PhoneRegistrationProvider.java")).q("Received a valid unverified Tachyon RegisterResponse. Waiting for OTP.");
                chpy m = chbuVar.m();
                fcdu fcduVar2 = fcbzVar.e;
                if (fcduVar2 == null) {
                    fcduVar2 = fcdu.a;
                }
                return elfl.g(m.j(fcduVar2.b.I())).i(new eroh() { // from class: chax
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        chbu chbuVar2 = chbu.this;
                        return elfl.g(kfg.a(new chbs(chbuVar2))).j(((Integer) chbu.f.e()).intValue(), TimeUnit.SECONDS, chbuVar2.k);
                    }
                }, chbuVar.k).f(TimeoutException.class, new eroh() { // from class: chay
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        enru enruVar2 = chbu.a;
                        return elfo.d(new fedn(Status.f.d((TimeoutException) obj2)));
                    }
                }, erpp.a);
            }
        }, this.q);
    }

    @Override // defpackage.chdj
    protected final elfl e() {
        return m().c();
    }

    @Override // defpackage.chdj
    protected final elfl f() {
        return m().b.h().h(new emwl() { // from class: chpd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((chod) obj).e);
            }
        }, erpp.a);
    }

    @Override // defpackage.chdj
    protected final elfl g(final byte[] bArr) {
        return m().b.j(new emwl() { // from class: choj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                choa choaVar = (choa) ((chod) obj).toBuilder();
                eyee x = eyee.x(bArr);
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).d = x;
                return (chod) choaVar.build();
            }
        }).h(new emwl() { // from class: chok
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chdj
    protected final elfl h(final long j) {
        return m().b.j(new emwl() { // from class: chpu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                choa choaVar = (choa) ((chod) obj).toBuilder();
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).e = j;
                return (chod) choaVar.build();
            }
        }).h(new emwl() { // from class: chpv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chdj
    protected final elfl i(fcbv fcbvVar) {
        fcdu fcduVar = fcbvVar.d;
        if (fcduVar == null) {
            fcduVar = fcdu.a;
        }
        return elfl.g(elfr.d(x(fcduVar), q(fcbvVar.h)).b(new erog() { // from class: chbb
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return chbu.this.m().n(5);
            }
        }, erpp.a));
    }

    @Override // defpackage.cgwn
    public final String j() {
        return "RCS";
    }

    public final chpy m() {
        chpy chpyVar;
        synchronized (this.E) {
            if (this.F == null) {
                this.F = ((chpz) this.z.b()).a(this.j.a);
            }
            chpyVar = this.F;
        }
        return chpyVar;
    }

    public final elfl o(final String str) {
        final chwy chwyVar = new chwy(this.h, this.j, str);
        final chpy m = m();
        return elfl.g(m.c()).i(new eroh() { // from class: chbh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    throw new chdk("Phone registration is not ready.");
                }
                chwy chwyVar2 = chwyVar;
                chbu chbuVar = chbu.this;
                fcfn a2 = chbuVar.u.a("RCS");
                eyee x = eyee.x(bArr);
                a2.copyOnWrite();
                fcfo fcfoVar = (fcfo) a2.instance;
                fcfo fcfoVar2 = fcfo.a;
                fcfoVar.f = x;
                fcek r = chbuVar.r();
                a2.copyOnWrite();
                fcfo fcfoVar3 = (fcfo) a2.instance;
                r.getClass();
                fcfoVar3.h = r;
                fcfoVar3.b |= 2;
                return chwyVar2.c((fcfo) a2.build());
            }
        }, this.l).i(new eroh() { // from class: chbi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chwyVar.d(chbu.this.s, (fbzz) obj);
            }
        }, this.q).i(new eroh() { // from class: chbj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chwy.this.e((fcab) obj);
            }
        }, this.l).i(new eroh() { // from class: chbk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enru enruVar = chbu.a;
                comc comcVar = chpy.this.b;
                final String str2 = str;
                return comcVar.j(new emwl() { // from class: chpq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        choa choaVar = (choa) ((chod) obj2).toBuilder();
                        choaVar.copyOnWrite();
                        chod chodVar = (chod) choaVar.instance;
                        String str3 = str2;
                        str3.getClass();
                        chodVar.b |= 64;
                        chodVar.u = str3;
                        return (chod) choaVar.build();
                    }
                }).h(new emwl() { // from class: chpr
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, erpp.a);
            }
        }, this.l).h(new emwl() { // from class: chbl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = chbu.a;
                return null;
            }
        }, erpp.a);
    }

    public final elfl p(String str) {
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "provideOtpCode", 587, "PhoneRegistrationProvider.java")).q("Received OTP code");
        final chzj chzjVar = new chzj(((akkd) this.C.b()).a.a.a.G, this.j, str);
        return elfl.g(m().e()).i(new eroh() { // from class: chbn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    ensk h2 = chbu.a.h();
                    h2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "provideOtpCode", 595, "PhoneRegistrationProvider.java")).q("No auth token for Verify. Skip this OTP code.");
                    return elfo.e(false);
                }
                final chzj chzjVar2 = chzjVar;
                final chbu chbuVar = chbu.this;
                fcfn a2 = chbuVar.u.a("RCS");
                eyee x = eyee.x(bArr);
                a2.copyOnWrite();
                fcfo fcfoVar = (fcfo) a2.instance;
                fcfo fcfoVar2 = fcfo.a;
                fcfoVar.f = x;
                return elfl.g(chzjVar2.c((fcfo) a2.build())).i(new eroh() { // from class: cham
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return chzjVar2.d(chbu.this.s, (fcdq) obj2);
                    }
                }, chbuVar.q).i(new eroh() { // from class: chan
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return chzj.this.e((fcds) obj2);
                    }
                }, chbuVar.k).i(new eroh() { // from class: chao
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final fcds fcdsVar = (fcds) obj2;
                        if ((fcdsVar.b & 2) == 0) {
                            return elfo.d(new IllegalStateException("Verify response has no token"));
                        }
                        if (fcdsVar.e.H()) {
                            return elfo.d(new IllegalStateException("Verify response has no registration Id"));
                        }
                        ensk h3 = chbu.a.h();
                        h3.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "handleVerifyResponse", 632, "PhoneRegistrationProvider.java")).q("VerifyResponse contains valid token. Updating data store.");
                        fcdu fcduVar = fcdsVar.d;
                        if (fcduVar == null) {
                            fcduVar = fcdu.a;
                        }
                        final chbu chbuVar2 = chbu.this;
                        return elfo.m(chbuVar2.x(fcduVar), chbuVar2.q(fcdsVar.e)).b(new erog() { // from class: chbq
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                return chbu.this.m().n(4);
                            }
                        }, erpp.a).i(new eroh() { // from class: chbr
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return chbu.this.m().j(new byte[0]);
                            }
                        }, chbuVar2.l).i(new eroh() { // from class: cgzx
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return chbu.this.m().f();
                            }
                        }, chbuVar2.l).h(new emwl() { // from class: cgzy
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                enru enruVar = chbu.a;
                                fcdu fcduVar2 = fcds.this.d;
                                return fcduVar2 == null ? fcdu.a : fcduVar2;
                            }
                        }, erpp.a);
                    }
                }, chbuVar.q).h(new emwl() { // from class: chap
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        kfb kfbVar;
                        fcdu fcduVar = (fcdu) obj2;
                        chbu chbuVar2 = chbu.this;
                        synchronized (chbuVar2.n) {
                            kfbVar = chbuVar2.o;
                            chbuVar2.o = null;
                        }
                        if (kfbVar != null) {
                            ensk h3 = chbu.a.h();
                            h3.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFuture", 659, "PhoneRegistrationProvider.java")).q("OTP is processed and pending OTP completer is completed.");
                            kfbVar.b(fcduVar);
                        } else {
                            ensk h4 = chbu.a.h();
                            h4.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFuture", 662, "PhoneRegistrationProvider.java")).q("OTP is processed successfully without awaiting completer.");
                        }
                        return true;
                    }
                }, chbuVar.k).f(Throwable.class, new eroh() { // from class: chaq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        kfb kfbVar;
                        final Throwable th = (Throwable) obj2;
                        ensk j = chbu.a.j();
                        j.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFutureWithFailure", (char) 668, "PhoneRegistrationProvider.java")).q("Failed to handle OTP, failing awaiting futures.");
                        chbu chbuVar2 = chbu.this;
                        synchronized (chbuVar2.n) {
                            kfbVar = chbuVar2.o;
                            chbuVar2.o = null;
                        }
                        if (kfbVar != null) {
                            kfbVar.c(th);
                        }
                        return elfl.g(chbuVar2.m().j(new byte[0])).i(new eroh() { // from class: chab
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                enru enruVar = chbu.a;
                                return elfo.d(th);
                            }
                        }, erpp.a);
                    }
                }, erpp.a);
            }
        }, this.q);
    }

    public final elfl q(eyee eyeeVar) {
        chpy m = m();
        final String E = eyeeVar.E();
        return m.b.j(new emwl() { // from class: chof
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                choa choaVar = (choa) ((chod) obj).toBuilder();
                choaVar.copyOnWrite();
                ((chod) choaVar.instance).c = E;
                return (chod) choaVar.build();
            }
        }).h(new emwl() { // from class: chom
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final fcek r() {
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fgtg fgtgVar = fgtg.PHONE_NUMBER;
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).b = fgtgVar.a();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).d = "RCS";
        fcejVar.copyOnWrite();
        fcek fcekVar = (fcek) fcejVar.instance;
        String str = this.j.a;
        str.getClass();
        fcekVar.c = str;
        return (fcek) fcejVar.build();
    }

    @Override // defpackage.chdj
    protected final elfl z(final byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return elfo.e(bArr);
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkAlternativeIfNeeded", 288, "PhoneRegistrationProvider.java")).q("Check if data exists for alternative.");
        final chpy m = m();
        return m.b.g().i(new eroh() { // from class: chpm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enhk enhkVar = (enhk) obj;
                chpy chpyVar = chpy.this;
                chod chodVar = (chod) enhkVar.get(chpyVar.g);
                if (chodVar != null && !chodVar.c.isEmpty() && !chodVar.d.H()) {
                    chpy.a.m("Phone registration data exists.");
                    return elfo.e(Optional.of(chodVar));
                }
                Optional m2 = chpyVar.m(chpyVar.g);
                enqu listIterator = enhkVar.entrySet().listIterator();
                String str = null;
                long j = 0;
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    String str2 = (String) entry.getKey();
                    if (!chpyVar.g.equals(str2)) {
                        cfva cfvaVar = aoqm.a;
                        if (!((Boolean) new aopi().get()).booleanValue()) {
                            ctvb ctvbVar = (ctvb) chpyVar.f.b();
                            if (((esfl) ctvbVar.c.b()).l(chpyVar.g, str2) == 5) {
                                if (((chod) entry.getValue()).d.d() > 0) {
                                    long j2 = ((chod) entry.getValue()).e;
                                    csjb c2 = chpy.a.c();
                                    c2.I("Found alternative phone number");
                                    c2.M("alternative", str2);
                                    c2.r();
                                    j = j2;
                                    str = str2;
                                }
                            }
                        } else if (m2.isPresent() && m2.equals(chpyVar.m(str2))) {
                            if (((chod) entry.getValue()).d.d() > 0 && ((chod) entry.getValue()).e >= j) {
                                long j22 = ((chod) entry.getValue()).e;
                                csjb c22 = chpy.a.c();
                                c22.I("Found alternative phone number");
                                c22.M("alternative", str2);
                                c22.r();
                                j = j22;
                                str = str2;
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    chpy.a.m("No alternative phone number exists.");
                    return elfo.e(Optional.empty());
                }
                ((akzt) chpyVar.e.b()).c("Bugle.PhoneRegistration.Alternative.Move.Count");
                chpy.a.p("Reuse existing phone registration data.");
                return chpyVar.b.i(str);
            }
        }, m.c).h(new emwl() { // from class: cgzz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                enru enruVar = chbu.a;
                return optional.isPresent() ? ((chod) optional.get()).d.I() : bArr;
            }
        }, this.l);
    }
}
