package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dinl extends dimn {
    public static final dktn x = new dktn("RcsMobileConfigurationFlags");
    private final errl A;
    private Optional B = Optional.empty();
    private Optional C = Optional.empty();
    private final AtomicLong D;
    private final Duration E;
    private final Duration F;
    private final dimm G;
    private final dimm H;
    private final dimm I;
    private final dimm J;
    private final dimm K;
    private final dimm L;
    private final dimm M;
    private final dimm N;
    private final dimm O;
    private final dimm P;
    private final dimm Q;
    private dink R;
    private dink S;
    private dink T;
    private dink U;
    private dink V;
    private dink W;
    private dink X;
    private dink Y;
    private dink Z;
    private dink aa;
    private dink ab;
    private dink ac;
    private dink ad;
    private dink ae;
    private dink af;
    private dink ag;
    private dink ah;
    private dink ai;
    private dink aj;
    private final ffbr y;
    private final ffbr z;

    public dinl(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.D = atomicLong;
        this.y = ffbrVar;
        this.z = ffbrVar2;
        this.A = errlVar;
        if (dimn.a == null) {
            dimn.H(((diml) dipp.a(diml.class)).a());
        }
        if (dimn.a == null) {
            throw new IllegalStateException("RcsFlags is not initialized!");
        }
        dimn dimnVar = dimn.a;
        this.G = dimnVar.c();
        this.H = dimnVar.e();
        this.I = dimnVar.h();
        this.J = dimnVar.i();
        this.K = dimnVar.z();
        this.L = dimnVar.k();
        this.M = dimnVar.l();
        this.N = dimnVar.A();
        this.O = dimnVar.B();
        this.P = dimnVar.D();
        this.Q = dimnVar.f();
        Duration ofMillis = Duration.ofMillis(((Long) djai.t().a.Y.a()).longValue());
        this.E = ofMillis;
        Duration ofMillis2 = Duration.ofMillis(((Long) djai.t().a.Z.a()).longValue());
        this.F = ofMillis2;
        atomicLong.set(Instant.now().plus(ofMillis2).minus(ofMillis).toEpochMilli());
    }

    public static final Integer O(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 4 ? 2 : 3;
        }
        return 1;
    }

    private final Optional P() {
        if (N(false)) {
            if (!((Boolean) djai.t().a.W.a()).booleanValue() || efbd.g()) {
                erqt.r(this.A.submit(new Callable() { // from class: dimp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dinl dinlVar = dinl.this;
                        if (!dinlVar.N(true)) {
                            return null;
                        }
                        dinlVar.M();
                        return null;
                    }
                }), new dinj(), erpp.a);
            } else {
                M();
            }
        }
        return this.C;
    }

    @Override // defpackage.dimn
    public final dimm A() {
        return this.N;
    }

    @Override // defpackage.dimn
    public final dimm B() {
        return this.O;
    }

    @Override // defpackage.dimn
    public final dimm C() {
        dink dinkVar = new dink((Integer) P().map(new Function() { // from class: dimw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ewht) obj).k);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(l), "sms_port");
        this.ac = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm D() {
        return this.P;
    }

    @Override // defpackage.dimn
    public final boolean K() {
        return false;
    }

    @Override // defpackage.dimn
    public final int L() {
        return 6;
    }

    public final void M() {
        this.B = Optional.of(((dkpm) this.z.b()).g());
        String f = ((dkpm) this.z.b()).f();
        if (f.isEmpty()) {
            dkty.r(x, "not calling getConfiguration because simId is empty", new Object[0]);
        } else {
            this.C = ((dlqm) this.y.b()).a(cgue.c(f, ewgz.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS).d()).map(new Function() { // from class: dimq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ewgw ewgwVar = (ewgw) obj;
                    return ewgwVar.c == 3 ? (ewht) ewgwVar.d : ewht.c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    public final synchronized boolean N(boolean z) {
        if (!Instant.now().isAfter(Instant.ofEpochMilli(this.D.get()).plus(this.E))) {
            return false;
        }
        if (z) {
            this.D.set(Instant.now().toEpochMilli());
        }
        return true;
    }

    @Override // defpackage.dimn
    public final dimm a() {
        dink dinkVar = new dink((String) P().map(new Function() { // from class: dine
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ewht ewhtVar = (ewht) obj;
                return ewhtVar.e == 2 ? (String) ewhtVar.f : "";
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""), "acs_url");
        this.R = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm b() {
        dink dinkVar = new dink((Boolean) P().map(new Function() { // from class: dina
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ewht) obj).w);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(p), "allow_manual_phone_number_input");
        this.ae = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm c() {
        return this.G;
    }

    @Override // defpackage.dimn
    public final dimm d() {
        dink dinkVar = new dink((Boolean) P().map(new Function() { // from class: dimr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ewht) obj).D);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(o), "allow_seamless_authorized_provisioning");
        this.ad = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm e() {
        return this.H;
    }

    @Override // defpackage.dimn
    public final dimm f() {
        return this.Q;
    }

    @Override // defpackage.dimn
    public final dimm g() {
        dink dinkVar = new dink((Boolean) P().map(new Function() { // from class: dimv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ewht) obj).A);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(r), "enable_instance_id_in_provisioning");
        this.ag = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm h() {
        return this.I;
    }

    @Override // defpackage.dimn
    public final dimm i() {
        return this.J;
    }

    @Override // defpackage.dimn
    public final dimm j() {
        dink dinkVar = new dink((Long) P().map(new Function() { // from class: dimz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eyev eyevVar = ((ewht) obj).J;
                return eyevVar == null ? eyev.a : eyevVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new dinh()).orElse(Long.valueOf(w)), "provisioning_retry_max_delay_in_millis");
        this.S = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm k() {
        return this.L;
    }

    @Override // defpackage.dimn
    public final dimm l() {
        return this.M;
    }

    @Override // defpackage.dimn
    public final dimm m() {
        dink dinkVar = new dink((String) P().map(new Function() { // from class: dini
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ewht ewhtVar = (ewht) obj;
                return ewhtVar.e == 3 ? (String) ewhtVar.f : "";
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""), "mcc_url_format");
        this.T = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm n() {
        dink dinkVar = new dink((Long) P().map(new Function() { // from class: ding
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eyev eyevVar = ((ewht) obj).K;
                return eyevVar == null ? eyev.a : eyevVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new dinh()).orElse(Long.valueOf(v)), "provisioning_retry_min_delay_in_millis");
        this.U = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm o() {
        dink dinkVar = new dink((Boolean) P().map(new Function() { // from class: dinb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ewht) obj).L);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(u), "notify_backend_rcs_is_unavailable");
        this.aj = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm p() {
        dink dinkVar = new dink((String) P().map(new Function() { // from class: dimu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ewht) obj).j;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""), "otp_pattern");
        this.V = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm q() {
        dink dinkVar = new dink((Integer) P().map(new Function() { // from class: dims
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = dinl.x;
                eyev eyevVar = ((ewht) obj).l;
                if (eyevVar == null) {
                    eyevVar = eyev.a;
                }
                return Integer.valueOf((int) eyki.b(eyevVar));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(i), "otp_wait_time_millis");
        this.W = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm r() {
        dink dinkVar = new dink((Integer) P().map(new Function() { // from class: dimx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int c = ewhl.c(((ewht) obj).E);
                if (c == 0) {
                    c = 1;
                }
                return dinl.O(c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(2), "provisioning_imei_format");
        this.X = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm s() {
        dink dinkVar = new dink((Integer) P().map(new Function() { // from class: dind
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int c = ewhl.c(((ewht) obj).F);
                if (c == 0) {
                    c = 1;
                }
                return dinl.O(c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(2), "provisioning_imsi_format");
        this.Y = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm t() {
        Optional P = P();
        if (P.isEmpty()) {
            dink dinkVar = new dink("00101", "rcs_enabled_mcc_mnc");
            this.Z = dinkVar;
            return dinkVar;
        }
        int a = ewhp.a(((ewht) P.get()).g);
        if (a == 0) {
            a = 1;
        }
        if (a - 2 != 1) {
            dink dinkVar2 = new dink("00101", "rcs_enabled_mcc_mnc");
            this.Z = dinkVar2;
            return dinkVar2;
        }
        if (this.B.isEmpty()) {
            dkty.r(x, "Unable to get cached simOperator, get it from simProvider instead.", new Object[0]);
            this.B = Optional.of(((dkpm) this.z.b()).g());
        }
        return new dink(this.B.get(), "rcs_enabled_mcc_mnc");
    }

    @Override // defpackage.dimn
    public final dimm u() {
        dink dinkVar = new dink((String) P().map(new Function() { // from class: dimt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ewht) obj).B;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("UP_T"), "rcs_profile");
        this.aa = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm v() {
        Optional P = P();
        if (P.isEmpty()) {
            dink dinkVar = new dink(t, "rcs_provisioning_enabled");
            this.ai = dinkVar;
            return dinkVar;
        }
        int a = ewhp.a(((ewht) P.get()).g);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i == 1) {
            return new dink(true, "rcs_provisioning_enabled");
        }
        if (i == 2) {
            return new dink(false, "rcs_provisioning_enabled");
        }
        dink dinkVar2 = new dink(t, "rcs_provisioning_enabled");
        this.ai = dinkVar2;
        return dinkVar2;
    }

    @Override // defpackage.dimn
    public final dimm w() {
        dink dinkVar = new dink((String) P().map(new Function() { // from class: dinc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ewht) obj).C;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("5.1B"), "rcs_version");
        this.ab = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm x() {
        dink dinkVar = new dink((Boolean) P().map(new Function() { // from class: dinf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ewht) obj).n);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(q), "show_google_tos");
        this.af = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm y() {
        dink dinkVar = new dink((Boolean) P().map(new Function() { // from class: dimy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ewht) obj).o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(s), "show_rcs_enabled_by_carrier_in_settings");
        this.ah = dinkVar;
        return dinkVar;
    }

    @Override // defpackage.dimn
    public final dimm z() {
        return this.K;
    }
}
