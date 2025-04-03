package defpackage;

import android.os.PowerManager;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqf extends diyb {
    public static final diyy d = dizd.a(168944779);
    public static final diyy e = dizd.a(177952078);
    public static final diyy f = dizd.a(185722655);
    public static final diyy g = dizd.a(186900101);
    public static final diyy h = dizd.a(187006179);
    static final diyy i = diyv.b("clear_termination_reason_on_start");
    static final diyy j = diyv.b("set_timeout_for_connecting_state");
    static final diyy k = diyv.b("reset_network_callback_listener_when_callback_is_not_registered");
    final AtomicReference A;
    djkr B;
    public final String C;
    public dilc D;
    public int E;
    int F;
    public final djng G;
    public long H;
    public final djtr I;
    public final int J;
    final djla K;
    public final djqr L;
    public final ctvb M;
    public final djne N;
    public final List O;
    public final List P;
    public final djjq Q;
    final ScheduledExecutorService R;
    public final PowerManager S;
    public final dkvq T;
    public final boolean U;
    public final AtomicBoolean V;
    final djop W;
    final djop X;
    final djop Y;
    final djop Z;
    final djop aa;
    final djop ab;
    final djop ac;
    final djop ad;
    final djop ae;
    final djop af;
    final djop ag;
    final djop ah;
    final djop ai;
    final djop aj;
    final djop ak;
    final djop al;
    private final dkvt am;
    private final eeih an;
    private final dkur ao;
    private final diod ap;
    private final dkii aq;
    private final dkpf ar;
    private final AtomicReference as;
    private final enip at;
    private final enip au;
    private final int av;
    public final boolean l;
    public final dktn m;
    public final String n;
    public final int o;
    public final eehs p;
    public final djkq q;
    public final dkvp r;
    public final djky s;
    public final eehz t;
    public final eenq u;
    eehr v;
    volatile djjt w;
    eeno x;
    String y;
    List z;

    public djqf(String str, int i2, eehz eehzVar, djky djkyVar, eehs eehsVar, djkq djkqVar, djqr djqrVar, djla djlaVar, djtr djtrVar, int i3, String str2, dkii dkiiVar, djjq djjqVar, djng djngVar, ctvb ctvbVar, dktn dktnVar, diod diodVar, dkpf dkpfVar, ScheduledExecutorService scheduledExecutorService, eenq eenqVar, dkur dkurVar, djne djneVar, PowerManager powerManager, dkvq dkvqVar, dkvp dkvpVar, dkvt dkvtVar, boolean z) {
        super("RegistrationStateMachine");
        int i4 = engw.d;
        this.z = enou.a;
        this.A = new AtomicReference();
        this.B = null;
        this.D = dilc.UNKNOWN;
        this.H = 0L;
        this.O = new CopyOnWriteArrayList();
        this.P = new CopyOnWriteArrayList();
        this.V = new AtomicBoolean();
        djpy djpyVar = new djpy(this);
        this.W = djpyVar;
        djpl djplVar = new djpl(this);
        this.X = djplVar;
        djqe djqeVar = new djqe(this);
        this.Y = djqeVar;
        djpe djpeVar = new djpe(this);
        this.Z = djpeVar;
        djpr djprVar = new djpr(this);
        this.aa = djprVar;
        djpn djpnVar = new djpn(this);
        this.ab = djpnVar;
        djqa djqaVar = new djqa(this);
        this.ac = djqaVar;
        djpz djpzVar = new djpz(this);
        this.ad = djpzVar;
        djpt djptVar = new djpt(this);
        this.ae = djptVar;
        djps djpsVar = new djps(this);
        this.af = djpsVar;
        djpi djpiVar = new djpi(this);
        this.ag = djpiVar;
        djpg djpgVar = new djpg(this);
        this.ah = djpgVar;
        djpm djpmVar = new djpm(this);
        this.ai = djpmVar;
        djpx djpxVar = new djpx(this);
        this.aj = djpxVar;
        djpw djpwVar = new djpw(this);
        this.ak = djpwVar;
        djpj djpjVar = new djpj(this);
        this.al = djpjVar;
        enhd enhdVar = new enhd();
        enhdVar.k("StoppedState", djpyVar);
        enhdVar.k("ReadyState", djplVar);
        enhdVar.k("WaitForNetworkState", djqeVar);
        enhdVar.k("ConnectingState", djpeVar);
        enhdVar.k("RegisteringState", djprVar);
        enhdVar.k("RegisteredState", djpnVar);
        enhdVar.k("SubscribingState", djqaVar);
        enhdVar.k("SubscribedState", djpzVar);
        enhdVar.k("ReregisteringState", djptVar);
        enhdVar.k("ReregisteredState", djpsVar);
        enhdVar.k("DeregisteringState", djpiVar);
        enhdVar.k("DeregisteredState", djpgVar);
        enhdVar.k("ReconfigurationRequiredState", djpmVar);
        enhdVar.k("SimRemovedState", djpxVar);
        enhdVar.k("RetryState", djpwVar);
        enhdVar.k("DisabledState", djpjVar);
        enhdVar.c();
        this.at = enip.u(djpnVar, djptVar, djpsVar, djqaVar, djpzVar);
        this.au = enip.t(djplVar, djqeVar, djpeVar, djprVar);
        this.m = dktnVar;
        this.n = str;
        this.o = i2;
        this.ap = diodVar;
        this.p = eehsVar;
        this.s = djkyVar;
        this.q = djkqVar;
        this.K = djlaVar;
        this.I = djtrVar;
        this.J = i3;
        this.C = str2;
        this.av = 1;
        this.aq = dkiiVar;
        this.Q = djjqVar;
        this.L = djqrVar;
        this.G = djngVar;
        this.M = ctvbVar;
        this.R = scheduledExecutorService;
        this.as = new AtomicReference();
        this.t = eehzVar;
        this.ar = dkpfVar;
        this.u = eenqVar;
        this.ao = dkurVar;
        this.U = z;
        this.an = new eeih(dktnVar, diodVar);
        this.N = djneVar;
        this.S = powerManager;
        this.T = dkvqVar;
        this.r = dkvpVar;
        this.am = dkvtVar;
        this.l = ((Boolean) djao.p().a.y.a()).booleanValue();
    }

    public final void A() {
        eehy eehyVar = this.t.a;
        if (eehyVar != eeib.f) {
            dkty.d(this.m, "Resetting SipStack.", new Object[0]);
            eehyVar.a.clear();
            eehyVar.c().c();
            this.t.a();
        }
    }

    public final void B(dilc dilcVar) {
        dkty.d(this.m, "deregister: reason=%s", dilcVar);
        if (dilc.DISABLED.equals(dilcVar)) {
            this.G.c();
        }
        if (Q() && dilc.FCM_TICKLE_KEEP_ALIVE.equals(dilcVar)) {
            dkty.d(this.m, "Registration is in progress. Ignore tickle messages.", new Object[0]);
        } else {
            s(8, dilcVar);
        }
    }

    public final void C(String str, Throwable th) {
        eeno eenoVar = this.x;
        if (Objects.isNull(eenoVar) || Objects.isNull(str) || Objects.isNull(th)) {
            return;
        }
        dkty.d(this.m, "SIP transport error from %s - %s", str, th.getMessage());
        if (!str.equals(eenoVar.d())) {
            dkty.d(this.m, "Ignore transport error from other network interfaces.", new Object[0]);
        } else {
            N(dilc.NETWORK_ERROR);
            w(this.ah);
        }
    }

    public final void D(final dilc dilcVar) {
        dkty.d(this.m, "Notify Failed. reason=%s", dilcVar);
        this.R.execute(new Runnable() { // from class: djom
            @Override // java.lang.Runnable
            public final void run() {
                Collection.EL.stream(djqf.this.P).forEach(new Consumer() { // from class: djnw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        diyy diyyVar = djqf.d;
                        ((djjv) obj).m();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
        this.R.execute(new Runnable() { // from class: djon
            @Override // java.lang.Runnable
            public final void run() {
                Stream stream = Collection.EL.stream(djqf.this.O);
                final dilc dilcVar2 = dilcVar;
                stream.forEach(new Consumer() { // from class: djns
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        diyy diyyVar = djqf.d;
                        ((djkh) obj).g(dilc.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    public final void E() {
        dkty.d(this.m, "Notify ReconfigurationRequired.", new Object[0]);
        this.R.execute(new Runnable() { // from class: djny
            @Override // java.lang.Runnable
            public final void run() {
                Collection.EL.stream(djqf.this.P).forEach(new Consumer() { // from class: djoa
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        diyy diyyVar = djqf.d;
                        ((djjv) obj).i();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    final void F(Runnable runnable) {
        s(EnergyProfile.EVCONNECTOR_TYPE_OTHER, runnable);
    }

    public final void G(boolean z) {
        if (djak.o()) {
            if (z) {
                this.V.set(true);
                q(16);
            } else {
                this.V.set(false);
                q(17);
            }
        }
    }

    public final void H(djjv djjvVar) {
        this.P.add(djjvVar);
    }

    public final void I() {
        this.v = null;
    }

    public final void J(Runnable runnable, long j2, TimeUnit timeUnit) {
        z();
        this.as.set(this.R.schedule(runnable, j2, timeUnit));
    }

    public final void K() {
        int i2 = this.F;
        long j2 = i2 > 1200 ? i2 - 600 : i2 >> 1;
        p(14);
        if (j2 > 0) {
            dkty.d(this.m, "Scheduling Refresh registration in %ds", Long.valueOf(j2));
            J(new Runnable() { // from class: djoh
                @Override // java.lang.Runnable
                public final void run() {
                    djqf.this.q(14);
                }
            }, j2, TimeUnit.SECONDS);
        }
    }

    protected final void L() {
        eehr eehrVar = this.v;
        if (Objects.isNull(eehrVar)) {
            throw new eejg("Null SipDialogPath. Can't send De-REGISTER.");
        }
        eehy eehyVar = this.t.a;
        if (Objects.isNull(eehyVar)) {
            throw new djkg("Null SipStack. Can't send De-REGISTER.");
        }
        eehrVar.a();
        eenk y = y(eehyVar, eehrVar, 0, this.I.a(), false, false, null);
        dkty.d(this.m, "sending SIP deregistration request: %s", y);
        R(eehyVar, y);
    }

    protected final void M() {
        eehr eehrVar;
        eehy eehyVar = this.t.a;
        if (eehyVar.v()) {
            throw new djkg("Null SipStack. Can't send REGISTER.");
        }
        eehr eehrVar2 = this.v;
        if (eehrVar2 == null) {
            djtr djtrVar = this.I;
            String w = eehy.w();
            String n = djtrVar.n();
            String w2 = djtrVar.w();
            if (Objects.isNull(w2)) {
                throw new eejg("Empty public identity in ImsConfiguration.");
            }
            if (eehyVar.d.isEmpty()) {
                try {
                    eehyVar.b();
                    eeiq c = eehk.c(eehyVar.m().f(), eehyVar.m().b(), eehyVar.p());
                    eehyVar.b();
                    eehyVar.d.add(new eelg(eehk.a(c)));
                } catch (eeje e2) {
                    dkty.i(e2, "Can't create default Route header", new Object[0]);
                }
            }
            eehr eehrVar3 = new eehr(w, 1, "sip:".concat(n), w2, w2, eehyVar.d);
            this.v = eehrVar3;
            eehrVar = eehrVar3;
        } else {
            eehrVar2.a();
            eehrVar = eehrVar2;
        }
        int i2 = this.E;
        if (i2 <= 0) {
            i2 = this.F;
        }
        int i3 = i2;
        if (Objects.isNull(this.y)) {
            this.y = this.I.w();
        }
        djtr djtrVar2 = this.I;
        eenk y = y(eehyVar, eehrVar, i3, djtrVar2.a(), djtrVar2.B(), ((Boolean) djao.p().a.p.a()).booleanValue(), this.ar.a);
        dkty.d(this.m, "sending SIP registration request: %s", y);
        R(eehyVar, y);
    }

    final void N(Object obj) {
        this.D = obj instanceof dilc ? (dilc) obj : dilc.UNKNOWN;
    }

    public final void O() {
        djnn djnnVar = (djnn) this.A.getAndSet(null);
        if (djnnVar != null) {
            this.r.h(djnnVar);
        }
        this.B = null;
    }

    public final boolean P() {
        dixy d2 = d();
        if (d2 == null) {
            return false;
        }
        return this.at.contains(d2);
    }

    public final boolean Q() {
        dixy d2 = d();
        if (d2 == null) {
            return false;
        }
        return this.au.contains(d2);
    }

    protected final void R(eehy eehyVar, eenk eenkVar) {
        try {
            eeif k2 = eehyVar.k(eenkVar, new djoo(this, eenkVar));
            int f2 = this.I.f() * 60;
            dkty.d(this.m, "Set SIP request timeout to %dms", Integer.valueOf(f2));
            long j2 = f2;
            diyn diynVar = this.b;
            if (diynVar != null) {
                diynVar.sendMessageDelayed(b(3, k2), j2);
            }
            dkty.d(this.m, "Wait SIP response for %s, CallId=%s", eenkVar.z(), eenkVar.y().h());
            Optional.of(k2);
        } catch (eejg e2) {
            s(2, e2);
            Optional.empty();
        }
    }

    final eehy x(eejk eejkVar, eeno eenoVar, eehs eehsVar) {
        int i2 = engw.d;
        engr engrVar = new engr();
        if (this.l) {
            djkr djkrVar = this.B;
            djkrVar.getClass();
            engrVar.h(new dkun(djkrVar, this.am));
        } else {
            engrVar.h(new dkum(this.av, this.w));
        }
        engrVar.h(new dkfz());
        try {
            engrVar.h(new dkuw(dkut.f(this.ao.b.a())));
        } catch (eeje e2) {
            dkty.g("Can't add UserAgentHeaderMessageFilter. %s", e2.getMessage());
        }
        djtr djtrVar = this.I;
        eeig a = this.an.a(eenoVar, new eeiv(djtrVar.f(), djtrVar.g(), djtrVar.h()));
        dktn dktnVar = this.m;
        eeia x = eeib.x();
        x.c(dktnVar);
        eehl eehlVar = (eehl) x;
        eehlVar.a = this.I.x();
        eehlVar.b = this.I.n();
        eehlVar.c = a;
        x.e(eejkVar);
        x.d(this.C);
        eehlVar.b(engrVar.g());
        eeib a2 = x.a();
        if (eehsVar != null) {
            a2.r(eehsVar);
        }
        a2.b = this.L;
        a2.u();
        return a2;
    }

    final eenk y(eehy eehyVar, eehr eehrVar, int i2, float f2, boolean z, boolean z2, String str) {
        eehk eehkVar = dkut.a;
        dkur dkurVar = this.ao;
        try {
            String str2 = eehrVar.f;
            String str3 = eehrVar.a;
            String str4 = eehrVar.g;
            String str5 = eehrVar.h;
            dkur.m(str3, str4, str5);
            eeit d2 = eehk.d(str2);
            eekh b = eene.b(str3);
            eekg a = eene.a(eehrVar.b, "REGISTER");
            eeio b2 = eehk.b(str4);
            eekt f3 = eene.f(b2, eehrVar.d);
            eell i3 = eene.i(eehk.b(str5), null);
            eelo j2 = eene.j(eehyVar.n(), eehyVar.i(), eehyVar.p(), dkut.p());
            if (z) {
                j2.f();
            }
            if (z2) {
                j2.o();
            }
            j2.g();
            ArrayList arrayList = new ArrayList();
            arrayList.add(j2);
            eelw a2 = eehq.a(d2, "REGISTER", b, a, f3, i3, arrayList, dkut.g());
            eekk a3 = dkur.a(eehyVar, true, new String[0]);
            a3.j(new eejc("expires", Integer.valueOf(i2)));
            if (f2 > 0.0f && f2 <= 1.0f) {
                a3.j(new eejc("q", Float.valueOf(f2)));
            }
            a2.k(a3);
            a2.k(eene.g("Supported", "path,gruu"));
            a2.k(eene.g("P-Preferred-Identity", b2.c()));
            a2.k(dkut.f(dkurVar.b.a()));
            a2.k(dkut.F());
            a2.k(eene.c(0));
            eenk eenkVar = new eenk(a2);
            dkhz.e(eenkVar.b(), this.aq.b(), this.U);
            djla djlaVar = this.K;
            String str6 = djlaVar.c;
            String str7 = djlaVar.d;
            String str8 = djlaVar.e;
            if (dktk.d(str6)) {
                dkty.q("Empty username for security header.", new Object[0]);
            }
            if (dktk.d(str7)) {
                dkty.q("Empty password for security header.", new Object[0]);
            }
            if (dktk.d(str8)) {
                dkty.q("Empty realm for security header.", new Object[0]);
            }
            dkqc dkqcVar = ((djkz) djlaVar).a;
            if (dkqcVar.d == null) {
                eenkVar.r("Authorization: Digest username=\"" + str6 + "\",uri=\"" + eenkVar.A() + "\",algorithm=MD5,realm=\"" + str8 + "\",nonce=\"\",response=\"\"");
            } else {
                try {
                    dkqcVar.c();
                    String b3 = ((djkz) djlaVar).a.b(str6, str7, eenkVar.z(), eenkVar.A(), ((djkz) djlaVar).a.a(), eenkVar.g());
                    String A = eenkVar.A();
                    dkqc dkqcVar2 = ((djkz) djlaVar).a;
                    String str9 = "Authorization: Digest username=\"" + str6 + "\",uri=\"" + A + "\",algorithm=MD5,realm=\"" + emxe.b(dkqcVar2.b) + "\",nonce=\"" + emxe.b(dkqcVar2.c) + "\",response=\"" + b3 + "\"";
                    String str10 = ((djkz) djlaVar).a.e;
                    if (str10 != null && str10.startsWith("auth")) {
                        str9 = str9 + ",nc=" + ((djkz) djlaVar).a.a() + ",qop=" + str10 + ",cnonce=\"" + ((djkz) djlaVar).a.a + "\"";
                    }
                    eenkVar.r(str9);
                } catch (Exception e2) {
                    dkty.i(e2, "Can't create the authorization header", new Object[0]);
                    throw new djkg("Can't write the security header".concat(String.valueOf(e2.getMessage())), e2);
                }
            }
            try {
                int i4 = this.av;
                if (((Boolean) djao.p().a.x.a()).booleanValue() && !TextUtils.isEmpty(str)) {
                    if (i4 == 0) {
                        throw null;
                    }
                    eenkVar.q(eene.g("X-Google-Self-Service-Message-ID", str.replace("\n", "").replace("\r", "")));
                    return eenkVar;
                }
            } catch (eeje e3) {
                dkty.j(e3, this.m, "Failed to add SelfServiceMessageId header.", new Object[0]);
            }
            return eenkVar;
        } catch (Exception e4) {
            dkty.i(e4, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP REGISTER message. ", e4);
        }
    }

    public final void z() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.as.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
