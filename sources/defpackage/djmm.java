package defpackage;

import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.DelegateRequest;
import android.telephony.ims.ImsException;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.SipDelegateManager;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmm extends diyb {
    public static final /* synthetic */ int L = 0;
    public final RcsUceAdapter A;
    public final dkur B;
    public final dikj C;
    public SipDelegateConnection D;
    public SipDelegateConfiguration E;
    public djmv F;
    public String G;
    public RcsUceAdapter.OnPublishStateChangedListener H;
    public final Optional I;
    public final UUID J;
    public final djnd K;
    private final djmt N;
    private final djly O;
    private final eehz P;
    private final eeih Q;

    @Deprecated
    private final djts R;

    @Deprecated
    private final InstantMessageConfiguration S;
    private final ImsRcsManager T;
    private final AtomicInteger U;
    private final RcsUceAdapter.OnPublishStateChangedListener V;
    private final djtl W;
    private djkx X;
    private SettableFuture Y;
    private enip Z;
    private final djjo aa;
    public final dktn i;
    final djma j;
    final djma k;
    final djma l;
    final djma m;
    final djma n;
    final djma o;
    final djma p;
    final djma q;
    final djma r;
    final djma s;
    final djma t;
    final enip u;
    public final djkh v;
    public final eehs w;
    public final djky x;
    public final SipDelegateManager y;
    public final errm z;
    static final diyy d = dizd.a(190037064);
    static final diyy e = dizd.a(190018698);
    static final diyy f = dizd.a(172413462);
    static final diyy g = dizd.a(189380557);
    static final diyy h = diyv.b("enable_processing_registering_feature_tags");
    private static final String M = dkhz.c();

    public djmm(RcsUceAdapter rcsUceAdapter, djkh djkhVar, eehz eehzVar, djky djkyVar, eehs eehsVar, dktn dktnVar, SipDelegateManager sipDelegateManager, errm errmVar, djjo djjoVar, djts djtsVar, djtl djtlVar, InstantMessageConfiguration instantMessageConfiguration, diod diodVar, djmt djmtVar, ImsRcsManager imsRcsManager, djlj djljVar, dkur dkurVar, Optional optional, dikj dikjVar, final djlk djlkVar) {
        super("SingleRegistrationStatemachine");
        djme djmeVar = new djme(this);
        this.j = djmeVar;
        djmb djmbVar = new djmb(this);
        this.k = djmbVar;
        djmh djmhVar = new djmh(this);
        this.l = djmhVar;
        djmg djmgVar = new djmg(this);
        this.m = djmgVar;
        djmj djmjVar = new djmj(this);
        this.n = djmjVar;
        djmi djmiVar = new djmi(this);
        this.o = djmiVar;
        djmf djmfVar = new djmf(this);
        this.p = djmfVar;
        djmc djmcVar = new djmc(this);
        this.q = djmcVar;
        djmd djmdVar = new djmd(this);
        this.r = djmdVar;
        djmk djmkVar = new djmk(this);
        this.s = djmkVar;
        djml djmlVar = new djml(this);
        this.t = djmlVar;
        this.u = P() ? enip.s(djmbVar, djmjVar, djmiVar) : enip.r(djmbVar, djmjVar);
        new CopyOnWriteArrayList();
        this.U = new AtomicInteger(0);
        this.Z = enpd.a;
        this.A = rcsUceAdapter;
        this.v = djkhVar;
        this.i = dktnVar.b("[SRRSM]");
        this.w = eehsVar;
        this.P = eehzVar;
        this.x = djkyVar;
        this.y = sipDelegateManager;
        this.z = errmVar;
        this.aa = djjoVar;
        this.R = djtsVar;
        this.W = djtlVar;
        this.S = instantMessageConfiguration;
        this.N = djmtVar;
        this.T = imsRcsManager;
        this.O = new djly(djljVar);
        this.B = dkurVar;
        this.I = optional;
        this.C = dikjVar;
        this.J = UUID.randomUUID();
        this.Q = new eeih(dktnVar, diodVar);
        this.K = new djnd();
        this.V = new RcsUceAdapter.OnPublishStateChangedListener() { // from class: djlr
            public final void onPublishStateChange(int i) {
                String uuid = djmm.this.J.toString();
                eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
                eyvuVar.copyOnWrite();
                eyvv eyvvVar = (eyvv) eyvuVar.instance;
                int i2 = 7;
                eyvvVar.f = 7;
                eyvvVar.b |= 2;
                eyvuVar.copyOnWrite();
                eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
                eyvvVar2.g = 2;
                eyvvVar2.b |= 4;
                eyux eyuxVar = (eyux) eyuz.a.createBuilder();
                eyuxVar.copyOnWrite();
                eyuz eyuzVar = (eyuz) eyuxVar.instance;
                uuid.getClass();
                eyuzVar.b |= 1;
                eyuzVar.c = uuid;
                switch (i) {
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        break;
                    case 7:
                        i2 = 8;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                djlk djlkVar2 = djlkVar;
                eyuxVar.copyOnWrite();
                eyuz eyuzVar2 = (eyuz) eyuxVar.instance;
                eyuzVar2.d = i2 - 1;
                eyuzVar2.b |= 2;
                eyvuVar.copyOnWrite();
                eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
                eyuz eyuzVar3 = (eyuz) eyuxVar.build();
                eyuzVar3.getClass();
                eyvvVar3.d = eyuzVar3;
                eyvvVar3.c = 10;
                djlkVar2.a.h(djlkVar2.b, (eyvv) eyvuVar.build());
            }
        };
        e(djmeVar);
        e(djmbVar);
        e(djmjVar);
        e(djmgVar);
        e(djmhVar);
        e(djmiVar);
        f(djmfVar, djmiVar);
        e(djmdVar);
        e(djmcVar);
        e(djmkVar);
        e(djmlVar);
        u(djmeVar);
    }

    public static boolean P() {
        return (dizg.H() || ((Boolean) dizg.o().a.n.a()).booleanValue()) && ((Boolean) g.a()).booleanValue();
    }

    private final void Q() {
        String t;
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        djtq i = dizg.J() ? this.W.a.m().i() : this.R.a.i();
        String homeDomain = sipDelegateConfiguration.getHomeDomain();
        homeDomain.getClass();
        i.k(homeDomain);
        int port = sipDelegateConfiguration.getSipServerAddress().getPort();
        emxf.a(port > 0);
        i.l(port);
        String homeDomain2 = sipDelegateConfiguration.getHomeDomain();
        homeDomain2.getClass();
        i.f(homeDomain2);
        String z = z();
        try {
            eemq eemqVar = new eemq();
            eemqVar.a = new eemn("charLexer", z);
            eeit eeitVar = eelz.a(eemqVar).b;
            if (eeitVar.l()) {
                t = ((eeiq) eeitVar).e();
                if (emxe.c(t)) {
                    throw new IllegalArgumentException(a.t(z, "Given public identity does not have a user part: "));
                }
            } else {
                eeir eeirVar = (eeir) eeitVar;
                String a = eeirVar.a();
                t = eeirVar.e() ? a.t(a, "+") : a;
            }
            i.r(z);
            i.z(t);
            int i2 = dizg.J() ? this.W.b : this.R.b;
            if (!dizg.J()) {
                this.R.a(i.a(), i2);
                return;
            }
            djtp djtpVar = this.W.a;
            djtpVar.C(ImsConfiguration.a(i.a()));
            this.W.a(djtpVar, i2);
        } catch (eeje e2) {
            throw new IllegalArgumentException("Can't parse: ".concat(String.valueOf(z)), e2);
        }
    }

    private final void R(eehy eehyVar) {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        String str = (String) Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new djlp()).orElse("");
        if (TextUtils.isEmpty(str)) {
            dkty.d(this.i, "Security-Verify header in configuration is null or empty", new Object[0]);
        } else {
            eehyVar.e = Optional.ofNullable(str);
        }
    }

    private final void S(eehy eehyVar) {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        String sipServiceRouteHeader = sipDelegateConfiguration.getSipServiceRouteHeader();
        if (TextUtils.isEmpty(sipServiceRouteHeader)) {
            dkty.d(this.i, "Route header in configuration is null or empty", new Object[0]);
            return;
        }
        List<String> i = emye.b(',').i(sipServiceRouteHeader);
        ArrayList arrayList = new ArrayList();
        for (String str : i) {
            try {
                eeku g2 = eene.g("Route", str);
                dkty.d(this.i, "service route headers are %s", dktx.IP_ADDRESS.c(str));
                arrayList.add((eelg) g2);
            } catch (eeje e2) {
                dkty.j(e2, this.i, "Invalid ServiceRoute header: %s", dktx.IP_ADDRESS.c(str));
            }
        }
        eehyVar.t(arrayList);
    }

    final String A() {
        return this.J.toString();
    }

    public final void B() {
        if (this.D != null) {
            dkty.l(this.i, "Already connected", new Object[0]);
            return;
        }
        int incrementAndGet = this.U.incrementAndGet();
        String uuid = UUID.randomUUID().toString();
        String A = A();
        enip x = x();
        DelegateRequest delegateRequest = new DelegateRequest(x);
        this.Y = SettableFuture.create();
        djlw djlwVar = new djlw(this, this.N, uuid, this.Y);
        djlt djltVar = new djlt(this, this.N, uuid);
        t(16, TimeUnit.SECONDS.toMillis(((Long) djao.p().a.D.a()).longValue()));
        dkty.d(this.i, "creating SipDelegate for instanceId:[%s], featureTags:[%s]", uuid, x);
        try {
            this.y.createSipDelegate(delegateRequest, this.z, djlwVar, djltVar);
            if (((Boolean) d.a()).booleanValue()) {
                djmt djmtVar = this.N;
                eywg eywgVar = (eywg) eywh.a.createBuilder();
                eywgVar.copyOnWrite();
                eywh eywhVar = (eywh) eywgVar.instance;
                A.getClass();
                eywhVar.b |= 2;
                eywhVar.d = A;
                eywgVar.copyOnWrite();
                eywh eywhVar2 = (eywh) eywgVar.instance;
                uuid.getClass();
                eywhVar2.b |= 1;
                eywhVar2.c = uuid;
                eyvz eyvzVar = (eyvz) eywb.a.createBuilder();
                eyvzVar.copyOnWrite();
                eywb eywbVar = (eywb) eyvzVar.instance;
                eywbVar.b |= 1;
                eywbVar.c = incrementAndGet;
                eyvzVar.copyOnWrite();
                eywb eywbVar2 = (eywb) eyvzVar.instance;
                eywbVar2.d = 1;
                eywbVar2.b |= 2;
                eywgVar.copyOnWrite();
                eywh eywhVar3 = (eywh) eywgVar.instance;
                eywb eywbVar3 = (eywb) eyvzVar.build();
                eywbVar3.getClass();
                eywhVar3.i = eywbVar3;
                eywhVar3.b |= 64;
                djmtVar.b((eywh) eywgVar.build());
            }
        } catch (ImsException e2) {
            int min = Math.min(incrementAndGet * 3, 3600);
            if (((Boolean) d.a()).booleanValue()) {
                this.N.a(A, uuid, incrementAndGet);
            }
            dkty.j(e2, this.i, "Error while creating delegate connection. Reconnecting in %s", Integer.valueOf(min));
            I(djlz.RESET_FROM_CONNECT_IMS_EXCEPTION);
            w(this.j);
            t(3, TimeUnit.SECONDS.toMillis(min));
        } catch (Exception e3) {
            if (((Boolean) d.a()).booleanValue()) {
                this.N.a(A, uuid, incrementAndGet);
            }
            dkty.j(e3, this.i, "Error while creating delegate connection. Terminating state machine.", new Object[0]);
            w(this.t);
        }
    }

    public final void C(int i) {
        this.D = null;
        if (i == 2) {
            w(this.t);
        } else {
            w(this.s);
        }
    }

    public final void D() {
        engw g2;
        try {
            this.U.set(0);
            Q();
            SipDelegateConfiguration sipDelegateConfiguration = this.E;
            sipDelegateConfiguration.getClass();
            SipDelegateConnection sipDelegateConnection = this.D;
            sipDelegateConnection.getClass();
            djmv djmvVar = new djmv(sipDelegateConnection, sipDelegateConfiguration);
            this.F = djmvVar;
            SipDelegateConfiguration sipDelegateConfiguration2 = this.E;
            if (sipDelegateConfiguration2 == null) {
                throw new IllegalStateException("No IMS configuration available");
            }
            String sipContactUserParameter = sipDelegateConfiguration2.getSipContactUserParameter();
            sipContactUserParameter.getClass();
            String homeDomain = sipDelegateConfiguration2.getHomeDomain();
            homeDomain.getClass();
            String imei = sipDelegateConfiguration2.getImei();
            imei.getClass();
            String b = dkvb.b(imei);
            this.G = b;
            SipDelegateConfiguration sipDelegateConfiguration3 = this.E;
            sipDelegateConfiguration3.getClass();
            M(sipDelegateConfiguration3);
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h(new eeht() { // from class: djls
                @Override // defpackage.eeht
                public final void a(eenj eenjVar) {
                    djmm djmmVar = djmm.this;
                    SipDelegateConfiguration sipDelegateConfiguration4 = djmmVar.E;
                    sipDelegateConfiguration4.getClass();
                    String sipPaniHeader = sipDelegateConfiguration4.getSipPaniHeader();
                    if (TextUtils.isEmpty(sipPaniHeader)) {
                        dkty.l(djmmVar.i, "No PANI header in configuration", new Object[0]);
                    } else {
                        try {
                            eenjVar.q(eene.g("P-Access-Network-Info", sipPaniHeader));
                        } catch (eeje e2) {
                            dkty.j(e2, djmmVar.i, "Exception while adding PANI header", new Object[0]);
                        }
                    }
                    SipDelegateConfiguration sipDelegateConfiguration5 = djmmVar.E;
                    sipDelegateConfiguration5.getClass();
                    String sipPlaniHeader = sipDelegateConfiguration5.getSipPlaniHeader();
                    if (TextUtils.isEmpty(sipPlaniHeader)) {
                        dkty.l(djmmVar.i, "No PLANI header in configuration", new Object[0]);
                    } else {
                        try {
                            eenjVar.q(eene.g("P-Last-Access-Network-Info", sipPlaniHeader));
                        } catch (eeje e3) {
                            dkty.j(e3, djmmVar.i, "Exception while adding PLANI header", new Object[0]);
                        }
                    }
                    SipDelegateConfiguration sipDelegateConfiguration6 = djmmVar.E;
                    sipDelegateConfiguration6.getClass();
                    String sipUserAgentHeader = sipDelegateConfiguration6.getSipUserAgentHeader();
                    if (TextUtils.isEmpty(sipUserAgentHeader)) {
                        dkty.l(djmmVar.i, "No User-Agent header in configuration", new Object[0]);
                        return;
                    }
                    dkur dkurVar = djmmVar.B;
                    String str = sipUserAgentHeader + ((String) dizg.o().a.F.a()) + dkuv.c(dkurVar.b.b());
                    try {
                        if (((Boolean) djmm.f.a()).booleanValue()) {
                            eenjVar.t("User-Agent");
                            eenjVar.q(dkut.f(str));
                        } else {
                            if (eenjVar.v("User-Agent")) {
                                return;
                            }
                            eenjVar.q(dkut.f(str));
                        }
                    } catch (eeje e4) {
                        dkty.j(e4, djmmVar.i, "Exception while adding User-Agent header", new Object[0]);
                    }
                }
            });
            engrVar.h(new dkul(this.x));
            if (dizg.H()) {
                engrVar.h(new dkuo(new enpx("INVITE")));
                g2 = engrVar.g();
            } else {
                g2 = engrVar.g();
            }
            djtr m = dizg.J() ? this.W.a.m() : this.R.a;
            eeig a = this.Q.a(djmvVar, new eeiv(m.f(), m.g(), m.h()));
            eeia x = eeib.x();
            x.c(this.i);
            ((eehl) x).a = sipContactUserParameter;
            ((eehl) x).b = homeDomain;
            ((eehl) x).c = a;
            x.e(eejk.TCP);
            x.d(b);
            ((eehl) x).b(g2);
            eeib a2 = x.a();
            eehs eehsVar = this.w;
            if (eehsVar != null) {
                a2.r(eehsVar);
            }
            a2.u();
            S(a2);
            R(a2);
            this.P.a = a2;
            SipDelegateConfiguration sipDelegateConfiguration4 = this.E;
            sipDelegateConfiguration4.getClass();
            InetSocketAddress localAddress = sipDelegateConfiguration4.getLocalAddress();
            this.aa.b(localAddress.getHostString());
            dkty.d(this.i, "IMS PDN addresses: %s", dktx.IP_ADDRESS.c(localAddress.getHostString()));
            w(this.o);
        } catch (Exception e2) {
            dkty.j(e2, this.i, "Error while starting SIP stack!", new Object[0]);
            w(this.t);
        }
    }

    public final void E() {
        djkh djkhVar = this.v;
        if (djkhVar != null) {
            djkhVar.g(dilc.UNKNOWN);
        }
        w(this.s);
    }

    public final void F() {
        q(4);
        SettableFuture settableFuture = this.Y;
        if (settableFuture != null) {
            try {
                if (((SipDelegateConnection) settableFuture.get(10L, TimeUnit.SECONDS)) == null) {
                    dkty.q("Timeout on waiting for callback.", new Object[0]);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                dkty.q("Interrupted waiting for connection termination.", new Object[0]);
            }
        }
        try {
            this.A.removeOnPublishStateChangedListener(this.V);
        } catch (ImsException e2) {
            dkty.j(e2, this.i, "Failed to unregister publish state change listener logger", new Object[0]);
        }
    }

    public final void G(dilc dilcVar) {
        djkh djkhVar = this.v;
        if (djkhVar != null) {
            djkhVar.i(dilcVar);
        }
    }

    public final void H() {
        p(16);
    }

    public final void I(djlz djlzVar) {
        String str = this.D != null ? "with-connection" : "without-connection";
        djlz djlzVar2 = djlz.RESET_FROM_STATE_RETRY;
        dkty.d(this.i, "stateMachine#resetStateMachine [%s] with reason: [%s]", str, djlzVar.c);
        SipDelegateConnection sipDelegateConnection = this.D;
        if (sipDelegateConnection != null) {
            this.y.destroySipDelegate(sipDelegateConnection, 2);
            this.D = null;
        }
        H();
        this.E = null;
        this.F = null;
        this.P.a();
    }

    public final void J(int i) {
        if (i < 100 || i > 699) {
            dkty.h(this.i, "Invalid sipCode %d", Integer.valueOf(i));
            return;
        }
        SipDelegateConnection sipDelegateConnection = this.D;
        if (sipDelegateConnection != null) {
            this.y.triggerFullNetworkRegistration(sipDelegateConnection, i, (String) null);
        }
    }

    public final synchronized void K(SipDelegateConfiguration sipDelegateConfiguration) {
        Optional map = Optional.ofNullable(this.E).map(new Function() { // from class: djlq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = djmm.L;
                return Long.valueOf(((SipDelegateConfiguration) obj).getVersion());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        long version = sipDelegateConfiguration.getVersion();
        if (map.isPresent() && version < ((Long) map.get()).longValue()) {
            dkty.r(this.i, "invalid configuration downgrade from version[%d] to version[%d], ignoring configuration update", map.get(), Long.valueOf(version));
            return;
        }
        dkty.l(this.i, "updating configuration from version %d -> %d", map.orElse(-1L), Long.valueOf(version));
        this.E = sipDelegateConfiguration;
        eehy eehyVar = this.P.a;
        R(eehyVar);
        S(eehyVar);
        Q();
        this.aa.b(sipDelegateConfiguration.getLocalAddress().getHostString());
        djmv djmvVar = this.F;
        if (djmvVar != null) {
            dkty.l(djmv.a, "updating SipTransport configuration from version %d -> %d", Long.valueOf(djmvVar.c.getVersion()), Long.valueOf(sipDelegateConfiguration.getVersion()));
            djmvVar.c = sipDelegateConfiguration;
        }
    }

    public final void L(DelegateRegistrationState delegateRegistrationState) {
        this.Z = enip.o(delegateRegistrationState.getRegisteredFeatureTags());
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        if (sipDelegateConfiguration != null) {
            M(sipDelegateConfiguration);
        }
    }

    public final void M(SipDelegateConfiguration sipDelegateConfiguration) {
        String imei = sipDelegateConfiguration.getImei();
        imei.getClass();
        this.G = dkvb.b(imei);
        eejk eejkVar = sipDelegateConfiguration.getTransportType() == 1 ? eejk.TCP : eejk.UDP;
        djkw i = djkx.i();
        djku djkuVar = (djku) i;
        djkuVar.a = Optional.ofNullable(sipDelegateConfiguration.getPublicGruuUri() != null ? String.valueOf(sipDelegateConfiguration.getPublicGruuUri()) : null);
        String sipContactUserParameter = sipDelegateConfiguration.getSipContactUserParameter();
        sipContactUserParameter.getClass();
        djkuVar.b = sipContactUserParameter;
        String hostAddress = sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        i.g(hostAddress);
        i.e(eejkVar);
        i.c(sipDelegateConfiguration.getLocalAddress().getPort());
        i.b(emxe.b(this.G));
        djkuVar.c = Optional.of(emxe.b(sipDelegateConfiguration.getSipPaniHeader()));
        i.f(this.Z);
        djkx a = i.a();
        this.X = a;
        this.x.a = a;
    }

    public final boolean N() {
        dixy d2 = d();
        return P() ? d2 == this.p : d2 == this.o || d2 == this.p;
    }

    public final boolean O() {
        return this.u.contains(d());
    }

    @Override // defpackage.diyb
    public final void v() {
        super.v();
        dkty.l(this.i, "starting SingleRegistrationRegistrationStateMachine[%s]", A());
        eehs eehsVar = this.w;
        if (eehsVar != null) {
            eehsVar.d();
        }
        if (((Boolean) e.a()).booleanValue()) {
            try {
                this.T.registerImsRegistrationCallback(this.z, this.O);
            } catch (ImsException e2) {
                dkty.j(e2, this.i, "Failed to register ImsRegistrationCallback.", new Object[0]);
            }
        }
        try {
            this.A.addOnPublishStateChangedListener(this.z, this.V);
        } catch (ImsException e3) {
            dkty.j(e3, this.i, "Failed to register publish state change listener logger", new Object[0]);
        }
    }

    final enip x() {
        enip y = y();
        if (!y.contains(dkmn.b)) {
            return y;
        }
        enin eninVar = new enin();
        eninVar.j(y);
        eninVar.i(dkmn.e, dkmn.f);
        if (((Boolean) dizg.o().a.u.a()).booleanValue()) {
            eninVar.c(dkmn.g);
        }
        if (((Boolean) djao.p().a.K.a()).booleanValue()) {
            eninVar.i(dkmn.h, !TextUtils.isEmpty(djao.q()) ? String.format("+g.gsma.rcs.botversion=\"%s\"", djao.q()) : M);
        }
        if (dizg.J() ? this.W.a.r().mStandaloneMsgAuth : dizg.E()) {
            eninVar.i(dkmn.c, dkmn.d);
        }
        return eninVar.g();
    }

    final enip y() {
        InstantMessageConfiguration o = dizg.J() ? this.W.a.o() : this.S;
        eehk eehkVar = dkut.a;
        return new enpx(o.a() ? dkmn.b : "+g.oma.sip-im");
    }

    final String z() {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        engw a = this.K.a(sipDelegateConfiguration);
        Optional findFirst = Collection.EL.stream(a).filter(new Predicate() { // from class: djnb
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
                return ((String) obj).startsWith("tel:");
            }
        }).findFirst();
        if (findFirst.isPresent()) {
            return (String) findFirst.get();
        }
        final String b = emxe.b(sipDelegateConfiguration.getHomeDomain());
        Optional findFirst2 = !b.isEmpty() ? Collection.EL.stream(a).filter(new Predicate() { // from class: djmz
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
                String str = b;
                String str2 = (String) obj;
                try {
                    eeit e2 = new eenb(str2).e();
                    if (e2.l()) {
                        return str.equals(((eeiq) e2).b());
                    }
                    return false;
                } catch (eeje e3) {
                    dkty.j(e3, djnd.a, "Exception while trying to parse Uri: %s", str2);
                    return false;
                }
            }
        }).filter(new Predicate() { // from class: djna
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
                return ((String) obj).startsWith("sip:+");
            }
        }).findFirst() : Optional.empty();
        if (findFirst2.isPresent()) {
            return (String) findFirst2.get();
        }
        Optional findFirst3 = Collection.EL.stream(a).filter(new Predicate() { // from class: djnc
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
                return ((String) obj).startsWith("sip:");
            }
        }).findFirst();
        if (findFirst3.isPresent()) {
            return (String) findFirst3.get();
        }
        String publicUserIdentifier = sipDelegateConfiguration.getPublicUserIdentifier();
        if (emxe.c(publicUserIdentifier)) {
            throw new IllegalStateException("No proper public identity can be calculated.");
        }
        return publicUserIdentifier;
    }
}
