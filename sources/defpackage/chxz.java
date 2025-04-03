package defpackage;

import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chxz implements ciin {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler");
    public static final chig b = chig.c("Bugle.PhoneRegistrationRpc.Response");
    public static final cfup c = cfvl.i(cfvl.b, "tachyon_fail_invalid_rcs_token", true);
    public static final cfup d = cfvl.i(cfvl.b, "skip_rcs_token", false);
    public static final emyl e = emys.a(new emyl() { // from class: chxx
        @Override // defpackage.emyl
        public final Object get() {
            enru enruVar = chxz.a;
            return Pattern.compile((String) cgyj.e.e());
        }
    });
    public final chih f;
    public final ffbr g;
    private final chzf h;
    private final chhg i;
    private final errl j;
    private final chpz k;
    private final aolr l;
    private final ffbr m;
    private final ciii n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private String r = "";
    private long s = 0;

    public chxz(chzf chzfVar, chhg chhgVar, errl errlVar, chih chihVar, chpz chpzVar, aolr aolrVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ciii ciiiVar) {
        this.h = chzfVar;
        this.i = chhgVar;
        this.j = errlVar;
        this.f = chihVar;
        this.k = chpzVar;
        this.l = aolrVar;
        this.m = ffbrVar;
        this.n = ciiiVar;
        this.q = ffbrVar5;
        this.o = ffbrVar2;
        this.p = ffbrVar3;
        this.g = ffbrVar4;
    }

    public static elfl n(String str) {
        ensk j = a.j();
        j.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "failRegisterRequest", 416, "RegisterPhoneRpcHandler.java")).t("RegisterRequest failed to be created due to %s", str);
        return elfo.d(new fedn(Status.l.d(new IllegalStateException(str))));
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.s;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.n;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(final fcfo fcfoVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createRequest", 184, "RegisterPhoneRpcHandler.java")).t("Phone registration request id: %s", fcfoVar.c);
        this.r = fcfoVar.c;
        aoku m = m();
        chhg chhgVar = this.i;
        String q = q();
        final elfl a2 = chhgVar.a(q);
        chze a3 = this.h.a();
        a3.m(new Callable() { // from class: chxt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enru enruVar = chxz.a;
                return elfl.this;
            }
        });
        a3.j();
        a3.i();
        a3.k = Optional.of(q);
        a3.h();
        a3.g(m, 1);
        a3.e(m);
        a3.f(m);
        final ListenableFuture b2 = a3.b();
        final ListenableFuture submit = this.j.submit(eldl.m(new Callable() { // from class: chxu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Optional o = chxz.this.o();
                if (o.isEmpty()) {
                    ensk j = chxz.a.j();
                    j.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getRcsTachyonAuthToken", 425, "RegisterPhoneRpcHandler.java")).q("getRcsTachyonAuthToken: Unable to retrieve tachyon auth token, configuration is empty.");
                    return "";
                }
                String y = ((djtp) o.get()).y();
                if (y == null) {
                    ensk j2 = chxz.a.j();
                    j2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getRcsTachyonAuthToken", 431, "RegisterPhoneRpcHandler.java")).q("getRcsTachyonAuthToken: Unable to retrieve tachyon auth token, token is null.");
                    return y;
                }
                if (y.isEmpty()) {
                    ensk j3 = chxz.a.j();
                    j3.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getRcsTachyonAuthToken", 434, "RegisterPhoneRpcHandler.java")).q("getRcsTachyonAuthToken: Unable to retrieve tachyon auth token, token is empty.");
                }
                return y;
            }
        }));
        return elfr.d(b2, submit).b(new erog() { // from class: chxv
            @Override // defpackage.erog
            public final ListenableFuture a() {
                fcbq fcbqVar = (fcbq) erqt.q(b2);
                String str = (String) erqt.q(submit);
                fcej fcejVar = (fcej) fcek.a.createBuilder();
                fgtg fgtgVar = fgtg.PHONE_NUMBER;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).b = fgtgVar.a();
                chxz chxzVar = chxz.this;
                String q2 = chxzVar.q();
                fcejVar.copyOnWrite();
                fcek fcekVar = (fcek) fcejVar.instance;
                q2.getClass();
                fcekVar.c = q2;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).d = "RCS";
                fcek fcekVar2 = (fcek) fcejVar.build();
                fcbw fcbwVar = (fcbw) fcbx.a.createBuilder();
                fcbwVar.copyOnWrite();
                fcbx fcbxVar = (fcbx) fcbwVar.instance;
                fcfo fcfoVar2 = fcfoVar;
                fcfoVar2.getClass();
                fcbxVar.c = fcfoVar2;
                fcbxVar.b |= 1;
                fcbwVar.copyOnWrite();
                fcbx fcbxVar2 = (fcbx) fcbwVar.instance;
                fcekVar2.getClass();
                fcbxVar2.d = fcekVar2;
                fcbxVar2.b |= 2;
                fcbwVar.copyOnWrite();
                fcbx fcbxVar3 = (fcbx) fcbwVar.instance;
                fcbr fcbrVar = (fcbr) fcbqVar.build();
                fcbrVar.getClass();
                fcbxVar3.e = fcbrVar;
                fcbxVar3.b |= 4;
                if (((Boolean) chxz.d.e()).booleanValue()) {
                    ensk e2 = chxz.a.e();
                    e2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createPhoneRegisterRequest", 289, "RegisterPhoneRpcHandler.java")).q("Configured to omit RCS token");
                    return elfo.e((fcbx) fcbwVar.build());
                }
                if (TextUtils.isEmpty(str)) {
                    ensk e3 = chxz.a.e();
                    e3.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createPhoneRegisterRequest", 293, "RegisterPhoneRpcHandler.java")).q("No RCS token in RegisterRequest");
                    Optional p = chxzVar.p();
                    if (p.isEmpty()) {
                        if (((asns) chxzVar.g.b()).a()) {
                            chxzVar.r(chxy.UNKNOWN_BACKEND_NO_TOKEN);
                            return elfo.e((fcbx) fcbwVar.build());
                        }
                        chxzVar.r(chxy.UNKNOWN_BACKEND_NO_TOKEN_BLOCKED);
                        return chxz.n("Missing RCS token for unknown backend");
                    }
                    if (((Boolean) p.get()).booleanValue()) {
                        chxzVar.r(chxy.JIBE_NO_TOKEN_BLOCKED);
                        return chxz.n("Missing RCS token for Jibe");
                    }
                    ensk h2 = chxz.a.h();
                    h2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "buildRequestWithoutIdentityProof", 332, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest without RCS token for 3P");
                    chxzVar.r(chxy.THIRD_PARTY_NO_TOKEN);
                    return elfo.e((fcbx) fcbwVar.build());
                }
                Optional p2 = chxzVar.p();
                if (p2.isEmpty()) {
                    ensk h3 = chxz.a.h();
                    h3.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 403, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token. Backend type is unknown.");
                    chxzVar.r(chxy.UNKNOWN_BACKEND_HAS_TOKEN);
                } else if (((Boolean) p2.get()).booleanValue()) {
                    ensk h4 = chxz.a.h();
                    h4.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 406, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token for Jibe");
                    chxzVar.r(chxy.JIBE_HAS_TOKEN);
                } else {
                    ensk j = chxz.a.j();
                    j.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 410, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token for 3P");
                    chxzVar.r(chxy.THIRD_PARTY_HAS_TOKEN);
                }
                Boolean bool = (Boolean) chxz.c.e();
                boolean booleanValue = bool.booleanValue();
                ensk h5 = chxz.a.h();
                h5.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "buildRequestWithIdentityProof", 340, "RegisterPhoneRpcHandler.java")).t("Using RCS token in RegisterRequest, failInvalidToken: %b", bool);
                fbzo fbzoVar = (fbzo) fbzp.a.createBuilder();
                fbzoVar.copyOnWrite();
                fbzp fbzpVar = (fbzp) fbzoVar.instance;
                str.getClass();
                fbzpVar.b = str;
                if (booleanValue) {
                    fbzoVar.copyOnWrite();
                    ((fbzp) fbzoVar.instance).c = 1;
                }
                fcbwVar.copyOnWrite();
                fcbx fcbxVar4 = (fcbx) fcbwVar.instance;
                fbzp fbzpVar2 = (fbzp) fbzoVar.build();
                fbzpVar2.getClass();
                fcbxVar4.f = fbzpVar2;
                fcbxVar4.b |= 64;
                return elfo.e((fcbx) fcbwVar.build());
            }
        }, erpp.a);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(final chrv chrvVar, eyhs eyhsVar) {
        final fcbx fcbxVar = (fcbx) eyhsVar;
        chpy a2 = this.k.a(q());
        fcbr fcbrVar = fcbxVar.e;
        if (fcbrVar == null) {
            fcbrVar = fcbr.a;
        }
        return a2.i(chxh.m(fcbrVar), chxh.p(fcbrVar), chxh.n(fcbrVar), chxh.o(fcbrVar)).i(new eroh() { // from class: chxs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chxz chxzVar = chxz.this;
                aoku m = chxzVar.m();
                cfva cfvaVar = aoqm.a;
                String i = m.i(((Boolean) new emyl() { // from class: aopy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return Boolean.valueOf(ersy.a("bugle.enable_mi_in_tachygram", "bugle"));
                    }
                }.get()).booleanValue());
                i.getClass();
                fcej a3 = cpta.a();
                a3.copyOnWrite();
                fcek fcekVar = (fcek) a3.instance;
                fcek fcekVar2 = fcek.a;
                fcekVar.c = i;
                fgtg fgtgVar = fgtg.PHONE_NUMBER;
                a3.copyOnWrite();
                ((fcek) a3.instance).b = fgtgVar.a();
                fcek fcekVar3 = (fcek) a3.build();
                chrv chrvVar2 = chrvVar;
                return chxzVar.f.a(chxz.b, chrvVar2.d(fcekVar3).e(fcbxVar));
            }
        }, this.j);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fcbz fcbzVar = (fcbz) eyhsVar;
        if (fcbzVar != null) {
            fcfq fcfqVar = fcbzVar.c;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.s = j;
        return erqt.i(fcbzVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "RegisterPhoneRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.r;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    public final aoku m() {
        return this.l.r(q());
    }

    public final Optional o() {
        ffbr ffbrVar = this.p;
        return ((djry) this.o.b()).k(((djrk) ffbrVar.b()).a(q()));
    }

    public final Optional p() {
        Optional o = o();
        if (o.isEmpty()) {
            ensk j = a.j();
            j.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "isJibeBackendOrEmpty", 352, "RegisterPhoneRpcHandler.java")).q("Can not determine backend type due to missing RCS configuration.");
        }
        return o.flatMap(new Function() { // from class: chxw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = chxz.a;
                ImsConfiguration n = ((djtp) obj).n();
                if (n == null) {
                    ensk j2 = chxz.a.j();
                    j2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 377, "RegisterPhoneRpcHandler.java")).q("Null IMS config");
                    return Optional.empty();
                }
                String str = n.mPcscfAddress;
                if (TextUtils.isEmpty(str)) {
                    ensk j3 = chxz.a.j();
                    j3.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 383, "RegisterPhoneRpcHandler.java")).q("Empty PCSCF address");
                    return Optional.empty();
                }
                boolean matches = ((Pattern) chxz.e.get()).matcher(str).matches();
                ensk e2 = chxz.a.e();
                e2.Y(ente.a, "BugleNetwork");
                enrr enrrVar = (enrr) e2;
                enrrVar.Y(csux.R, str);
                enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 391, "RegisterPhoneRpcHandler.java");
                Boolean valueOf = Boolean.valueOf(matches);
                enrrVar2.t("Backend isJibe:%b", valueOf);
                return Optional.of(valueOf);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final String q() {
        chxe chxeVar = (chxe) this.q.b();
        String str = this.n.a;
        chxeVar.a(str, 1);
        return str;
    }

    public final void r(chxy chxyVar) {
        ensk e2 = a.e();
        e2.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 396, "RegisterPhoneRpcHandler.java")).t("RCS token status: %s", chxyVar);
        ((akzt) this.m.b()).e("Bugle.PhoneRegistrationRpc.RcsTokenStatus", chxyVar.i);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
