package com.google.android.ims.rcs.engine.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.network.common.RcsEngine;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import defpackage.a;
import defpackage.aojk;
import defpackage.csix;
import defpackage.ctvb;
import defpackage.diib;
import defpackage.diil;
import defpackage.dijk;
import defpackage.dikx;
import defpackage.dila;
import defpackage.dilc;
import defpackage.dimn;
import defpackage.dioc;
import defpackage.diog;
import defpackage.dipa;
import defpackage.dipf;
import defpackage.dipg;
import defpackage.dips;
import defpackage.diqo;
import defpackage.diru;
import defpackage.ditk;
import defpackage.diua;
import defpackage.diyp;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.dizc;
import defpackage.dizd;
import defpackage.dizg;
import defpackage.djak;
import defpackage.djao;
import defpackage.djau;
import defpackage.djav;
import defpackage.djck;
import defpackage.djgx;
import defpackage.djiv;
import defpackage.djix;
import defpackage.djjc;
import defpackage.djji;
import defpackage.djjw;
import defpackage.djjx;
import defpackage.djjz;
import defpackage.djkc;
import defpackage.djkd;
import defpackage.djky;
import defpackage.djqt;
import defpackage.djtp;
import defpackage.djtt;
import defpackage.dkcp;
import defpackage.dkel;
import defpackage.dkez;
import defpackage.dkfb;
import defpackage.dkfc;
import defpackage.dkga;
import defpackage.dkgw;
import defpackage.dkhc;
import defpackage.dkhx;
import defpackage.dkib;
import defpackage.dkic;
import defpackage.dkie;
import defpackage.dkif;
import defpackage.dkiw;
import defpackage.dkjh;
import defpackage.dkjq;
import defpackage.dkkq;
import defpackage.dkli;
import defpackage.dklp;
import defpackage.dkls;
import defpackage.dklx;
import defpackage.dkly;
import defpackage.dklz;
import defpackage.dkmu;
import defpackage.dkmv;
import defpackage.dkoo;
import defpackage.dkou;
import defpackage.dkpf;
import defpackage.dkph;
import defpackage.dkpp;
import defpackage.dkqd;
import defpackage.dkrp;
import defpackage.dkrx;
import defpackage.dksb;
import defpackage.dksr;
import defpackage.dkst;
import defpackage.dksu;
import defpackage.dktn;
import defpackage.dktx;
import defpackage.dkty;
import defpackage.dkuj;
import defpackage.dkuk;
import defpackage.dkur;
import defpackage.dkvd;
import defpackage.dkvg;
import defpackage.dkvo;
import defpackage.dkvu;
import defpackage.dkxc;
import defpackage.dkyp;
import defpackage.dlpw;
import defpackage.dvvv;
import defpackage.eeft;
import defpackage.eefw;
import defpackage.eehy;
import defpackage.eehz;
import defpackage.eenk;
import defpackage.engw;
import defpackage.errl;
import defpackage.errm;
import defpackage.eytb;
import defpackage.eytc;
import defpackage.eytd;
import defpackage.eyte;
import defpackage.eyti;
import defpackage.ezel;
import defpackage.ffbr;
import j$.net.URLEncoder;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsEngineImpl extends IRcsEngineTemporaryController.Stub implements RcsEngine {
    public static final int[] VPN_DEPRIORITIZED_NETWORK_REGISTRATION_ORDER = {1, 0, 17};
    private static final diyy a = dizd.a(156458435);
    private static final diyy b = dizd.a(189858511);
    private static final diyy c = dizd.a(177065032);
    static final diyy<Boolean> reinitializeImsServicesWhenEmpty = diyv.b("reinitialize_ims_services_when_empty");
    static final diyy<Boolean> setRcsEngineStateNullOnStop = diyv.b("set_rcs_engine_state_null_on_stop");
    private final FileTransferEngine A;
    private final ChatSessionEngine B;
    private final LocationSharingEngine C;
    private final dkpp D;
    private final diyp E;
    private final errl F;
    private final errm G;
    private final ctvb H;
    private final diru I;
    private final ditk J;
    private final djjc K;
    private final dkcp L;
    private final djtt M;
    private final dkib N;
    private final dkgw O;
    private final eehz P;
    private final dkrp Q;
    private final ffbr R;
    private final djix S;
    private final dkxc T;
    private final dkou U;
    private final djav V;
    private final dlpw W;
    private final dkyp X;
    private final dikx Y;
    private final djky Z;
    private final aojk aa;
    private djji ab;
    private dkhc ac;
    private final HandlerThread af;
    private final Handler ag;
    private final djkd ai;
    private final dklz aj;
    private final dkvu d;
    private final dkic e;
    private final eeft f;
    private final djqt g;
    private final djjx h;
    private final dkif i;
    private dijk j;
    private diqo k;
    private djau l;
    final diog loggingController;
    private final dktn m;
    private final Context n;
    private final BusinessInfoDatabase o;
    private final diib p;
    private final dkel q;
    private final dipa r;
    private final dkhx s;
    private final dipf t;
    private final dioc u;
    private final dkrx v;
    private final dkmv w;
    private final dips x;
    private final dkph y;
    private final dkpf z;
    private dilc ad = dilc.UNKNOWN;
    private dkoo ae = dkoo.STATE_UNKNOWN;
    private final CopyOnWriteArrayList ah = new CopyOnWriteArrayList();

    /* renamed from: $r8$lambda$lIdnFHL6R-jcHCNq8eNjbUAiuqE, reason: not valid java name */
    public static /* synthetic */ void m286$r8$lambda$lIdnFHL6RjcHCNq8eNjbUAiuqE(RcsEngineImpl rcsEngineImpl, Context context) {
        dkty.k("Notify Bugle of ZERO_SESSION_ID", new Object[0]);
        rcsEngineImpl.notifyBugleOfZeroSessionId(context);
    }

    public RcsEngineImpl(final Context context, BusinessInfoDatabase businessInfoDatabase, dipa dipaVar, dipf dipfVar, dioc diocVar, dkhx dkhxVar, dkrx dkrxVar, dips dipsVar, dkph dkphVar, dkmv dkmvVar, FileTransferEngine fileTransferEngine, ChatSessionEngine chatSessionEngine, LocationSharingEngine locationSharingEngine, dkpp dkppVar, diyp diypVar, diib diibVar, dkel dkelVar, errl errlVar, errm errmVar, diog diogVar, ctvb ctvbVar, djtt djttVar, dipg dipgVar, ditk ditkVar, djjc djjcVar, eeft eeftVar, djqt djqtVar, dkib dkibVar, dkly dklyVar, dkcp dkcpVar, dkga dkgaVar, djjz djjzVar, dkgw dkgwVar, eehz eehzVar, dkrp dkrpVar, SignupEngine signupEngine, djix djixVar, ffbr<djck> ffbrVar, dkpf dkpfVar, dkxc dkxcVar, dkou dkouVar, djav djavVar, dlpw dlpwVar, dkyp dkypVar, djkd djkdVar, dikx dikxVar, dila dilaVar, djky djkyVar, aojk aojkVar, dkvg dkvgVar, djjx djjxVar, diru diruVar, dkif dkifVar) {
        dkty.k("RcsEngine SipConnectionType set to %s", dkvgVar.name());
        dilaVar.a = dkvgVar;
        dktn a2 = dktn.a(String.format("RcsEngineImpl[%s]", dkvgVar.d));
        this.m = a2;
        dkty.l(a2, "instantiated in package: %s", context.getPackageName());
        if ("com.google.android.ims".equals(context.getPackageName())) {
            if (djak.x()) {
                dkmvVar.b(getClass().getSimpleName(), new dkmu() { // from class: dkew
                    @Override // defpackage.dkmu
                    public final void a() {
                        RcsEngineImpl.m286$r8$lambda$lIdnFHL6RjcHCNq8eNjbUAiuqE(RcsEngineImpl.this, context);
                    }
                });
            } else if (dkrxVar.x()) {
                notifyBugleOfZeroSessionId(context);
                dkrxVar.c();
            }
        }
        this.n = context;
        this.d = dilaVar;
        this.v = dkrxVar;
        this.w = dkmvVar;
        this.x = dipsVar;
        this.o = businessInfoDatabase;
        this.p = diibVar;
        this.q = dkelVar;
        this.r = dipaVar;
        this.s = dkhxVar;
        this.t = dipfVar;
        this.u = diocVar;
        this.y = dkphVar;
        this.A = fileTransferEngine;
        this.B = chatSessionEngine;
        this.C = locationSharingEngine;
        this.D = dkppVar;
        this.F = errlVar;
        this.G = errmVar;
        this.loggingController = diogVar;
        this.J = ditkVar;
        HandlerThread handlerThread = new HandlerThread("RCS Engine Handler");
        this.af = handlerThread;
        handlerThread.start();
        this.ag = new dkfc(handlerThread.getLooper(), this, djjcVar);
        this.E = diypVar;
        this.H = ctvbVar;
        this.aj = new dklz(context, this);
        this.e = dklyVar;
        this.M = djttVar;
        this.I = diruVar;
        this.K = djjcVar;
        this.z = dkpfVar;
        this.f = eeftVar;
        this.g = djqtVar;
        this.N = dkibVar;
        this.L = dkcpVar;
        this.O = dkgwVar;
        this.P = eehzVar;
        this.Q = dkrpVar;
        this.R = ffbrVar;
        this.S = djixVar;
        this.h = djjxVar;
        this.T = dkxcVar;
        this.U = dkouVar;
        this.V = djavVar;
        this.W = dlpwVar;
        this.X = dkypVar;
        this.ai = djkdVar;
        this.Y = dikxVar;
        this.Z = djkyVar;
        this.i = dkifVar;
        this.aa = aojkVar;
    }

    private final dkkq a() {
        dkkq dkkqVar = (dkkq) this.O.a(dkkq.class);
        if (dkkqVar != null) {
            return dkkqVar;
        }
        throw new djgx();
    }

    private final void b(djtp djtpVar, dkur dkurVar) {
        djji djjiVar = this.ab;
        if (djjiVar == null) {
            dkty.h(this.m, "imsModule is null, unable to add RCS services", new Object[0]);
            return;
        }
        dkls dklsVar = new dkls(djjiVar, this.ac, this.P, this.H, this.N, dkurVar, this.T, this.X);
        dkie a2 = this.i.a(this.ab, this.ac, dkurVar, djtpVar, dklsVar, this.n);
        if (!dizg.Q()) {
            this.O.e(dklsVar);
            this.O.e(a2);
        } else if (dkvg.DUAL_REG.equals(this.d.a(this.D.b()))) {
            this.O.e(a2);
        }
        this.O.e(new dkiw(this.ab, this.ac, this.P, dkurVar));
        dkrp dkrpVar = this.Q;
        try {
            dkrpVar.e = a.v(URLEncoder.encode(djtpVar.m().w(), StandardCharsets.UTF_8.name()), "_groupsessions.xml");
            dkty.k("Using filename for group state: %s", dktx.FILE.c(dkrpVar.e));
        } catch (UnsupportedEncodingException e) {
            dkty.i(e, "URLEncoder does not support UTF-8 encoding", new Object[0]);
        }
        final dkrp dkrpVar2 = this.Q;
        if (djak.x()) {
            dkrpVar2.d.b(dkrpVar2.getClass().getSimpleName(), new dkmu() { // from class: dkro
                @Override // defpackage.dkmu
                public final void a() {
                    dkty.k("Clearing GroupInfo.", new Object[0]);
                    dkrp dkrpVar3 = dkrp.this;
                    synchronized (dkrpVar3.b) {
                        dkrpVar3.b.clear();
                        try {
                            dkrpVar3.d();
                        } catch (IOException e2) {
                            dkty.g("Failed to clear GroupInfo. %s.", e2.getMessage());
                        }
                    }
                }
            });
        }
        if (((Boolean) dkrp.a.a()).booleanValue()) {
            this.Q.b();
        }
        this.O.e(new dkjq(this.ab, this.ac, this.P, this.H, dkurVar, this.Q));
        this.O.e(new dkkq(this.n, this.ab, this.ac, this.P, this.H, this.f, this.N, this.loggingController, dkurVar, this.Q, new dkjh(), this.Y, this.Z));
        dkty.l(this.m, "completed adding RCS services to imsServiceManager", new Object[0]);
    }

    private final void c() {
        dkuk.c(this.n, RcsIntents.ACTION_DEBUG_OPTION_RESET_RCS_CONFIG_RESPONSE, null, dkuj.RCS_ENGINE_IMPL);
    }

    private final void d(final djtp djtpVar) {
        Collection.EL.stream(this.ah).forEach(new Consumer() { // from class: dkfa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((djtm) obj).u(djtp.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final void e() {
        if (((Boolean) setRcsEngineStateNullOnStop.a()).booleanValue()) {
            dkty.l(this.m, "resetting RcsEngine internal state", new Object[0]);
            this.ab = null;
            this.j = null;
            this.l = null;
            this.k = null;
            this.ah.clear();
        }
    }

    private final void f() {
        dkty.l(this.m, "Triggering reconfiguration", new Object[0]);
        updateRcsImsState(dkoo.STATE_UNKNOWN, dilc.RECONFIGURATION_REQUIRED);
        if (g()) {
            dkty.l(this.m, "Shutting down RCS stack for reconfiguration", new Object[0]);
            djji djjiVar = this.ab;
            if (djjiVar != null) {
                djjiVar.k(dilc.RECONFIGURATION_REQUIRED);
            }
        } else {
            this.ag.sendEmptyMessage(1);
            c();
        }
        new Bundle().putString(RcsIntents.EXTRA_SIM_ID, this.D.l());
        dkuk.b(this.n, new Intent(RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dkuj.RCS_ENGINE_IMPL);
    }

    private final boolean g() {
        djji djjiVar = this.ab;
        if (djjiVar == null) {
            dkty.l(this.m, "imsModule is null, shutdown not required", new Object[0]);
            return false;
        }
        dkty.d(this.m, "ImsModule is started:[%s]", String.valueOf(djjiVar.n()));
        return this.ab.n();
    }

    public static int[] getNetworkRegistrationOrder() {
        return djak.n() ? VPN_DEPRIORITIZED_NETWORK_REGISTRATION_ORDER : RcsEngine.DEFAULT_NETWORK_REGISTRATION_ORDER;
    }

    private final dkli h(String str, int i) {
        dkkq a2 = a();
        try {
            dkli dkliVar = new dkli(this.n, a2, this.P, str, this.f, this.Q, this.loggingController, a2.f, a2.t, i, this.Y);
            dkliVar.T = this.Z;
            return dkliVar;
        } catch (eefw e) {
            throw new djgx("Unable to create originating session", e);
        }
    }

    public static /* synthetic */ IllegalStateException lambda$onImsModuleStarted$0() {
        return new IllegalStateException("RCS Configuration is empty.");
    }

    public void createImsProviders(Optional<djtp> optional, dkur dkurVar) {
        dkjq dkjqVar = (dkjq) this.O.a(dkjq.class);
        if (this.j == null) {
            dijk dijkVar = new dijk(this.n, this.P, (dkkq) this.O.a(dkkq.class), dkjqVar, this.Q, this.B, this.s, this.x, this.r, this.H, this.f, this.M, this.loggingController, dkurVar, this.W, this.Y);
            this.j = dijkVar;
            this.ah.add(dijkVar);
        }
        if (this.l == null) {
            djau djauVar = new djau(this.n, (dkjq) this.O.a(dkjq.class), this.Q, this.j, this.v, this.U, this.V);
            this.l = djauVar;
            this.ah.add(djauVar);
        }
        if (TextUtils.isEmpty((String) optional.map(new Function() { // from class: dkex
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InstantMessageConfiguration o;
                o = ((djtp) obj).o();
                return o;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: dkey
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str;
                str = ((InstantMessageConfiguration) obj).mFtHttpContentServerUri;
                return str;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null))) {
            if (this.k == null) {
                dkty.j(new dkfb(), this.m, "ftHttpContentServerUri is empty from config - file transfer provider is null and will not be initialized", new Object[0]);
            }
        } else if (this.k == null) {
            Context context = this.n;
            InstantMessageConfiguration d = this.ab.d();
            dijk dijkVar2 = this.j;
            diqo diqoVar = new diqo(context, d, dijkVar2, dijkVar2, this.A, this.s, this.x, this.g, this.I, this.J, new dkez(this));
            this.k = diqoVar;
            this.ah.add(diqoVar);
        }
    }

    @Override // defpackage.djgy
    public dklp createIncomingSession(eenk eenkVar) {
        dkkq a2 = a();
        try {
            dklp dklpVar = new dklp(this.n, a2, this.P, eenkVar, this.f, this.Q, this.loggingController, a2.f, a2.t, this.Y);
            dklpVar.T = this.Z;
            return dklpVar;
        } catch (eefw e) {
            throw new djgx("Unable to create terminating session", e);
        }
    }

    @Override // defpackage.djgy
    public dkli createOutgoingSession(String str) {
        return h(str, 1);
    }

    @Override // defpackage.djgy
    public dkli createOutgoingSlmSession(String str) {
        return h(str, 2);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void dumpState(PrintWriter printWriter) {
        String str;
        printWriter.println("-- RCS Engine State --");
        printWriter.println("  SipConnectionType: ".concat(String.valueOf(String.valueOf(this.d.a(this.D.b())))));
        printWriter.println(" - Clearcut Uptime Tracker State -");
        djjc djjcVar = this.K;
        printWriter.printf("  Instance ID: %s\n", djjcVar.e);
        printWriter.printf("  Instantiated: %s [%s],\n", Long.valueOf(djjcVar.f), Instant.ofEpochMilli(djjcVar.f));
        printWriter.printf("  Sequence No: %s,\n", Long.valueOf(djjcVar.g));
        printWriter.printf("  Previous state: %s,\n", djjcVar.f(djjcVar.m));
        printWriter.printf("  Current state: %s,\n", djjcVar.f(djjcVar.n));
        Object d = djjcVar.o.d();
        int a2 = ezel.a(((Integer) djjcVar.o.d()).intValue());
        String str2 = "NETWORK_TYPE_UNKNOWN";
        if (a2 != 0) {
            switch (a2 - 1) {
                case 1:
                    str2 = "LTE";
                    break;
                case 2:
                    str2 = "CDMA";
                    break;
                case 3:
                    str2 = "GSM";
                    break;
                case 4:
                    str2 = "WIFI";
                    break;
                case 5:
                    str2 = "LAN";
                    break;
                case 6:
                    str2 = "CELLULAR";
                    break;
                case 7:
                    str2 = "GPRS";
                    break;
                case 8:
                    str2 = "EDGE";
                    break;
                case 9:
                    str2 = "UMTS";
                    break;
                case 10:
                    str2 = "EVDO";
                    break;
                case 11:
                    str2 = "HSPA";
                    break;
                case 12:
                    str2 = "IDEN";
                    break;
                case 13:
                    str2 = "EHRPD";
                    break;
                case 14:
                    str2 = "VPN";
                    break;
                case 15:
                    str2 = "NR";
                    break;
                case 16:
                    str2 = "ONEXRTT";
                    break;
            }
        }
        printWriter.printf("  Last registered network: %s [%s],\n", d, str2);
        printWriter.printf("  Registered timestamp: %s [%s],\n", djjcVar.h.d(), djjcVar.e(djjcVar.h));
        printWriter.printf("  Unregistered timestamp: %s [%s],\n", djjcVar.i.d(), djjcVar.e(djjcVar.i));
        printWriter.printf("  Ignored timestamp: %s [%s],\n", djjcVar.j.d(), djjcVar.e(djjcVar.j));
        switch (djjcVar.d(djjcVar.k).ordinal()) {
            case 1:
                str = "RCS_UPTIME_IGNORE_NO_VALID_CONFIG";
                break;
            case 2:
                str = "RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY";
                break;
            case 3:
                str = "RCS_UPTIME_IGNORE_NO_SIM";
                break;
            case 4:
                str = "RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES";
                break;
            case 5:
                str = "RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN";
                break;
            case 6:
                str = "RCS_UPTIME_IGNORE_MISSING_PERMISSION";
                break;
            case 7:
                str = "RCS_UPTIME_IGNORE_BLOCKED_NETWORK";
                break;
            case 8:
                str = "RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE";
                break;
            default:
                str = "RCS_UPTIME_IGNORE_REASON_UNKNOWN";
                break;
        }
        printWriter.printf("  Ignored reason: %s,\n", str);
        djji djjiVar = this.ab;
        if (djjiVar != null) {
            printWriter.println(" - IMS Module ".concat(String.valueOf(String.valueOf(djjiVar.l))));
            djjw djjwVar = djjiVar.b;
            if (djjwVar != null) {
                djjwVar.f(printWriter);
            }
        }
    }

    public djjc getClearcutUptimeTracker() {
        return this.K;
    }

    public Looper getHandlerThreadLooper() {
        return this.af.getLooper();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public djji getImsModule() {
        return this.ab;
    }

    public dkgw getImsServiceManager() {
        return this.O;
    }

    @Override // defpackage.dker
    public dkoo getLastRegistrationState() {
        return this.ae;
    }

    public djiv getProvisioningEngineV2StateReporter() {
        return this.q;
    }

    @Override // defpackage.dikz
    public ImsRegistrationState getRegistrationState() {
        if (this.ab == null) {
            if (!((Boolean) djjc.b.a()).booleanValue() || !dkoo.REGISTRATION_DISABLED_BY_BUGLE.equals(this.ae)) {
                if (!((Boolean) setRcsEngineStateNullOnStop.a()).booleanValue()) {
                    return new ImsRegistrationState(dkoo.STATE_UNKNOWN);
                }
            }
            return new ImsRegistrationState(this.ae);
        }
        djji djjiVar = this.ab;
        if (djjiVar != null && djjiVar.m()) {
            return new ImsRegistrationState(dkoo.REGISTRATION_SUCCESSFUL);
        }
        if (this.ae.equals(dkoo.REGISTRATION_TERMINATED) || this.ae.equals(dkoo.REGISTRATION_FAILED)) {
            return new ImsRegistrationState(this.ae, this.ad);
        }
        return new ImsRegistrationState(this.ae);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public dkvg getSipConnectionType() {
        return this.d.a(this.D.b());
    }

    public ffbr<eehy> getSipStackProvider() {
        return this.P;
    }

    @Override // defpackage.dikz
    public boolean hasActiveRegistration() {
        djjw djjwVar;
        djji djjiVar = this.ab;
        if (djjiVar == null || !djjiVar.n() || (djjwVar = this.ab.b) == null) {
            return false;
        }
        return djjwVar.k();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void init() {
        dkty.l(this.m, "Initializing RcsEngine.", new Object[0]);
        this.y.b(this, eytd.REQUEST_RECONFIGURATION);
        this.y.b(this, eytd.RESET_PROVISIONING_ENGINE);
        this.y.b(this, eytd.SEND_KEEPALIVE);
        this.E.a.add(this);
        this.E.a();
        dkty.c("Start listening for network changes", new Object[0]);
        dkty.c("Listen for network callbacks", new Object[0]);
        djkd djkdVar = this.ai;
        try {
            dkvo f = dkvo.f(djkdVar.a);
            djkc djkcVar = djkdVar.c;
            djkcVar.getClass();
            f.g(djkcVar);
        } catch (dkvd e) {
            dkty.i(e, "Could not register network callback.", new Object[0]);
        }
        this.ai.a(this);
        this.K.r = Optional.of(this);
        dkty.l(this.m, "Initializing RBM resource permissions.", new Object[0]);
        engw<String> rbmBotIds = this.o.getRbmBotIds();
        int size = rbmBotIds.size();
        for (int i = 0; i < size; i++) {
            String str = rbmBotIds.get(i);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(this.o, this.n, str, 0);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(this.o, this.n, str, 1);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(this.o, this.n, str, 2);
        }
    }

    @Override // defpackage.dikz
    public boolean isRegistered() {
        djji djjiVar = this.ab;
        if (djjiVar == null) {
            return false;
        }
        return djjiVar.m();
    }

    public void notifyBugleOfZeroSessionId(Context context) {
        Intent intent = new Intent("com.google.android.ims.ZERO_SESSION_ID");
        dkqd.c(context, intent);
        intent.setPackage("com.google.android.apps.messaging");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onBackendChanged() {
        dkty.d(this.m, "Backend has changed. Performing re-provisioning!", new Object[0]);
        onResettingReconfiguration();
    }

    @Override // defpackage.djjk
    public void onConnectivityChange(Context context, int i) {
        dkty.d(this.m, "onConnectivityChange: RcsEngine received connectivity change event", new Object[0]);
        this.ag.sendEmptyMessage(2);
    }

    @Override // defpackage.diyo
    public synchronized void onCsLibPhenotypeUpdated() {
        djji djjiVar = this.ab;
        if (djjiVar != null) {
            dkty.d(djjiVar.l, "Phenotype flags updated.", new Object[0]);
        }
    }

    @Override // defpackage.djjq
    public void onForbidden(boolean z) {
        if (!z) {
            dkty.r(this.m, "IMS registration is rejected because user is not found", new Object[0]);
        } else {
            dkty.r(this.m, "IMS registration is forbidden for the user", new Object[0]);
            onReconfigurationRequested();
        }
    }

    @Override // defpackage.djjq
    public void onImsModuleInitialized() {
        dkty.l(this.m, "IMS module has been initialized", new Object[0]);
        this.x.b(new ImsEvent(30105, 0L), dkuj.RCS_ENGINE_IMPL);
    }

    @Override // defpackage.djjq
    public void onImsModuleStartFailed(dilc dilcVar) {
        updateRcsImsState(dkoo.REGISTRATION_FAILED, dilcVar);
        this.x.a(new ImsEvent(30101, dilcVar.ordinal()), dkuj.RCS_ENGINE_IMPL);
        this.x.b(new ImsEvent(30106, 0, EnergyProfile.EVCONNECTOR_TYPE_OTHER), dkuj.RCS_ENGINE_IMPL);
        if (dilcVar == dilc.RECONFIGURATION_REQUIRED) {
            f();
        }
    }

    @Override // defpackage.djjq
    public void onImsModuleStarted() {
        dkty.l(this.m, "IMS module has started", new Object[0]);
        if (djak.x()) {
            this.w.a();
        }
        updateRcsImsState(dkoo.REGISTRATION_SUCCESSFUL, dilc.UNKNOWN);
        registerImsProviders();
        dioc diocVar = this.u;
        ImsConfiguration c2 = this.ab.c();
        if (((Boolean) dioc.a.a()).booleanValue() && c2.rcsVolteSingleRegistration) {
            dkty.c("Disabling ImsContactsDiscovery in single regstration mode.", new Object[0]);
        } else if (((Boolean) dioc.b.a()).booleanValue()) {
            dkty.k("Address Book Scan is disabled.", new Object[0]);
        } else {
            synchronized (diocVar.l) {
                diocVar.i = false;
                dipf dipfVar = diocVar.d;
                dipfVar.d.add(diocVar.s);
                if (diocVar.r.e()) {
                    dkty.c("Discovery is already waiting for polling period to expire", new Object[0]);
                } else if (diocVar.e.w()) {
                    diocVar.d();
                } else {
                    diocVar.c();
                }
            }
        }
        this.s.d.set(true);
        djtp djtpVar = (djtp) this.M.a().orElseThrow(new Supplier() { // from class: dkev
            @Override // java.util.function.Supplier
            public final Object get() {
                return RcsEngineImpl.lambda$onImsModuleStarted$0();
            }
        });
        if (((Boolean) b.a()).booleanValue()) {
            ImsConfiguration c3 = this.ab.c();
            if (c3.rcsVolteSingleRegistration) {
                dkty.l(this.m, "Single registration is enabled, save the ImsConfiguration.", new Object[0]);
                djtpVar.C(c3);
                this.ab.l(djtpVar);
                this.L.t(this.D.l(), djtpVar);
                dkty.l(this.m, "Sending intent to initiate jibe de-provisioning.", new Object[0]);
                dkuk.b(this.n, new Intent(RcsIntents.ACTION_JIBE_DEPROVISION).putExtra(RcsIntents.EXTRA_SUB_ID, this.D.b()).putExtra(RcsIntents.EXTRA_SIM_ID, this.D.l()), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dkuj.RCS_ENGINE_IMPL);
            }
        }
        d(djtpVar);
        this.x.a(new ImsEvent(30100, 0L), dkuj.RCS_ENGINE_IMPL);
        this.x.b(new ImsEvent(30106, 100L), dkuj.RCS_ENGINE_IMPL);
        diqo diqoVar = this.k;
        if (diqoVar != null) {
            dkty.c("Retry all failed file transfers", new Object[0]);
            dkty.c("Trigger all retries immediately", new Object[0]);
            dkst dkstVar = diqoVar.g;
            ScheduledFuture scheduledFuture = dkstVar.c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled() && !dkstVar.c.isDone()) {
                dkty.c("Immediate retry already pending.", new Object[0]);
                return;
            }
            synchronized (dkstVar.b) {
                Iterator it = dkstVar.b.values().iterator();
                while (it.hasNext()) {
                    ((ScheduledFuture) it.next()).cancel(false);
                }
                dkstVar.b.clear();
            }
            dkstVar.c = dksu.a(new dksr(dkstVar), 0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.djjq
    public void onImsModuleStopped(dilc dilcVar) {
        dkty.l(this.m, "IMS module has stopped: %s", dilcVar);
        updateRcsImsState(dkoo.REGISTRATION_TERMINATED, dilcVar);
        this.B.unregisterProvider((diil) this.j);
        this.C.unregisterProvider((dvvv) this.l);
        this.A.unregisterProvider((diua) this.k);
        this.u.f();
        this.t.b();
        this.s.f();
        this.x.a(new ImsEvent(30102, 0L), dkuj.RCS_ENGINE_IMPL);
        this.x.b(new ImsEvent(30106, 101L), dkuj.RCS_ENGINE_IMPL);
        if (dilcVar == dilc.RECONFIGURATION_REQUIRED) {
            f();
            c();
        }
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onReconfigurationRequested() {
        f();
    }

    public void onResettingReconfiguration() {
        this.r.i();
        this.ag.sendEmptyMessage(2);
        f();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onSimLoaded(boolean z) {
        dkty.l(this.m, "SIM is loaded. Changed: %b", Boolean.valueOf(z));
        this.ag.sendEmptyMessage(2);
        dizc.m();
        dimn.I(this.n);
        if (z) {
            dkty.d(this.m, "SIM has changed. Shutting down IMS module !", new Object[0]);
            shutDownImsModule();
        } else {
            if (this.D.t() && g()) {
                dkty.h(this.m, "Unexpected SIM LOADED. Stopping ImsModule.", new Object[0]);
                this.ab.i(dilc.NETWORK_UNAVAILABLE);
            }
            dkty.d(this.m, "Ignoring SIM LOADED for unchanged SIM in RCS Engine", new Object[0]);
        }
        this.ag.sendEmptyMessage(3);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onSimRemoved() {
        dkty.l(this.m, "SIM has been removed.", new Object[0]);
        djji djjiVar = this.ab;
        if (djjiVar != null) {
            djjiVar.k(dilc.NETWORK_UNAVAILABLE);
        }
        dimn.I(this.n);
        this.ag.sendEmptyMessage(3);
    }

    @Override // defpackage.dkpg
    public void onTickle(eyte eyteVar) {
        djjw djjwVar;
        if (dkvg.SINGLE_REG.equals(getSipConnectionType())) {
            dkty.l(this.m, "ignoring FCM tickle message for single-registration RcsEngine instance", new Object[0]);
            return;
        }
        dkty.l(this.m, "Self-service message received by RcsEngine. Self service message ID: %s", eyteVar.c);
        eytd b2 = eytd.b(eyteVar.b);
        if (b2 == null) {
            b2 = eytd.UNRECOGNIZED;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                dkty.l(this.m, "Reconfiguration requested by self-service message.", new Object[0]);
                onReconfigurationRequested();
                return;
            } else {
                if (ordinal != 3) {
                    dkty.r(this.m, "Unexpected self-service message: %s", this.y.a(eyteVar));
                    return;
                }
                return;
            }
        }
        dkty.l(this.m, "SIP keep alive tickle requested by self-service message.", new Object[0]);
        if (!((Boolean) djao.p().a.z.a()).booleanValue()) {
            dkty.l(this.m, "Ignoring keep alive tickle. Disabled from SipSettings.", new Object[0]);
            return;
        }
        djji imsModule = getImsModule();
        if (imsModule == null || !imsModule.n()) {
            dkty.h(this.m, "Cannot process keep alive tickle. ImsModule is not initialized or not started", new Object[0]);
            return;
        }
        this.z.a = eyteVar.c;
        djjc djjcVar = this.K;
        dkty.c("FCM tickle received. Reporting uptime", new Object[0]);
        eyti eytiVar = (eyti) djjcVar.a().build();
        eytb eytbVar = (eytb) eyteVar.toBuilder();
        eytbVar.copyOnWrite();
        ((eyte) eytbVar.instance).g = eytc.a(3);
        djjcVar.d.g(djjcVar.c, (eyte) eytbVar.build(), eytiVar);
        djji djjiVar = this.ab;
        dklx dklxVar = new dklx(eyteVar, djjiVar, this.K, djjiVar.m);
        djjiVar.f(dklxVar);
        this.ab.m.b(dklxVar);
        if (isRegistered()) {
            dkty.d(this.m, "Client might be registered. Scheduling keep-alive due to keep alive self service message %s", eyteVar);
            imsModule.m.c();
            imsModule.m.i(0);
            return;
        }
        djji djjiVar2 = this.ab;
        if (djjiVar2 != null && djjiVar2.n() && (djjwVar = this.ab.b) != null && djjwVar.m()) {
            dkty.d(this.m, "Registration currently in progress. Ignoring keep alive self service message %s", eyteVar);
        } else {
            dkty.d(this.m, "Client is not registered. Restarting registration due to keep alive self service message %s", eyteVar);
            imsModule.i(dilc.FCM_TICKLE_KEEP_ALIVE);
        }
    }

    public void registerImsProviders() {
        dkty.d(this.m, "Registering IMS providers", new Object[0]);
        this.B.registerProvider((diil) this.j);
        this.C.registerProvider((dvvv) this.l);
        this.A.registerProvider((diua) this.k);
    }

    void setChatSessionProvider(dijk dijkVar) {
        csix.j();
        this.j = dijkVar;
    }

    void setHttpFileTransferProvider(diqo diqoVar) {
        csix.j();
        this.k = diqoVar;
        this.ah.add(diqoVar);
    }

    void setImsModule(djji djjiVar) {
        csix.j();
        this.ab = djjiVar;
    }

    @Override // defpackage.djjk
    public boolean shouldTriggerOnCapabilitiesChanged() {
        return true;
    }

    public void shutDownImsModule() {
        this.r.i();
        this.ag.sendEmptyMessage(2);
        updateRcsImsState(dkoo.STATE_UNKNOWN, dilc.RECONFIGURATION_REQUIRED);
        if (g()) {
            dkty.c("Shutting down IMS module", new Object[0]);
            this.ab.k(dilc.RECONFIGURATION_REQUIRED);
        }
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public synchronized void shutdown() {
        this.y.f(eytd.REQUEST_RECONFIGURATION);
        this.y.f(eytd.RESET_PROVISIONING_ENGINE);
        this.y.f(eytd.SEND_KEEPALIVE);
        this.E.a.remove(this);
        this.E.b();
        this.t.b();
        this.u.f();
        this.s.f();
        djji djjiVar = this.ab;
        if (djjiVar != null) {
            djjiVar.k(dilc.SHUTDOWN);
            this.ai.c(this.ab.b.a());
            this.ab.b.e();
        }
        dkgw dkgwVar = this.O;
        dkgwVar.g(dilc.SHUTDOWN);
        dkgwVar.a.clear();
        this.ai.c(this);
        djkd djkdVar = this.ai;
        dkty.c("Stop listening for network changes", new Object[0]);
        try {
            dkvo f = dkvo.f(djkdVar.a);
            djkc djkcVar = djkdVar.c;
            djkcVar.getClass();
            f.h(djkcVar);
        } catch (IllegalArgumentException unused) {
            dkty.c("NewConnectivityMonitor: defaultNetworkCallback is not registered.", new Object[0]);
        }
        djkdVar.b.clear();
        e();
    }

    public void startDatabaseSyncerIfNeeded(djtp djtpVar) {
        if (djtpVar == null || djtpVar.h() == null) {
            dkty.d(this.m, "startDatabaseSyncerIfNeeded: Can't check initial address book scan for null config", new Object[0]);
        } else if (((Boolean) dioc.b.a()).booleanValue() || djtpVar.h().disableInitialAddressBookScan) {
            dkty.d(this.m, "startDatabaseSyncerIfNeeded: Initial address book scan disabled", new Object[0]);
        } else {
            dkty.d(this.m, "startDatabaseSyncerIfNeeded: Initial address book scan enabled", new Object[0]);
            this.t.a();
        }
    }

    @Override // defpackage.dker
    public void startRcsStack(int i) {
        dkty.l(this.m, "startRcsStack for subId:%d", Integer.valueOf(i));
        this.ag.sendEmptyMessage(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0240 A[Catch: all -> 0x03f0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:7:0x0020, B:9:0x0030, B:13:0x0040, B:15:0x006a, B:18:0x0071, B:21:0x0081, B:23:0x0087, B:26:0x0097, B:28:0x00b4, B:30:0x00c9, B:31:0x00d9, B:33:0x01a9, B:35:0x01c2, B:37:0x0207, B:41:0x0240, B:42:0x025a, B:43:0x0376, B:45:0x0382, B:47:0x039d, B:48:0x03b0, B:49:0x03b2, B:51:0x03c6, B:53:0x03d3, B:54:0x03e3, B:57:0x0249, B:60:0x0211, B:63:0x021e, B:64:0x0227, B:65:0x01bd, B:66:0x0272, B:68:0x029b, B:70:0x0343, B:72:0x0360, B:74:0x036a, B:75:0x036d, B:76:0x02b9, B:78:0x02cb, B:79:0x02ef, B:81:0x0305, B:82:0x030d, B:84:0x0323, B:85:0x032b, B:87:0x0339, B:89:0x001a), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0249 A[Catch: all -> 0x03f0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:7:0x0020, B:9:0x0030, B:13:0x0040, B:15:0x006a, B:18:0x0071, B:21:0x0081, B:23:0x0087, B:26:0x0097, B:28:0x00b4, B:30:0x00c9, B:31:0x00d9, B:33:0x01a9, B:35:0x01c2, B:37:0x0207, B:41:0x0240, B:42:0x025a, B:43:0x0376, B:45:0x0382, B:47:0x039d, B:48:0x03b0, B:49:0x03b2, B:51:0x03c6, B:53:0x03d3, B:54:0x03e3, B:57:0x0249, B:60:0x0211, B:63:0x021e, B:64:0x0227, B:65:0x01bd, B:66:0x0272, B:68:0x029b, B:70:0x0343, B:72:0x0360, B:74:0x036a, B:75:0x036d, B:76:0x02b9, B:78:0x02cb, B:79:0x02ef, B:81:0x0305, B:82:0x030d, B:84:0x0323, B:85:0x032b, B:87:0x0339, B:89:0x001a), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void startRcsStackInternal() {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcs.engine.impl.RcsEngineImpl.startRcsStackInternal():void");
    }

    @Override // defpackage.dker
    public void stopRcsStack(int i) {
        dkty.l(this.m, "stopRcsStack for subId:%d", Integer.valueOf(i));
        this.ag.sendEmptyMessage(4);
    }

    public void stopRcsStackInternal() {
        this.ae = ((Boolean) djjc.b.a()).booleanValue() ? dkoo.REGISTRATION_DISABLED_BY_BUGLE : dkoo.CONFIGURATION_DISABLED;
        this.ag.sendEmptyMessage(2);
        this.S.e(null);
        if (g()) {
            dkty.l(this.m, "Shutting down IMS module", new Object[0]);
            this.ab.k(dilc.DISABLED);
        } else {
            dkty.l(this.m, "skipping imsModule.stop", new Object[0]);
        }
        e();
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStartRcsStack(String str) {
        dkty.l(this.m, "triggerStartRcsStack for msisdn:%s", dktx.PHONE_NUMBER.c(str));
        this.ag.sendEmptyMessage(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStopRcsStack(String str) {
        dkty.l(this.m, "triggerStopRcsStack for msisdn:%s", dktx.PHONE_NUMBER.c(str));
        this.ag.sendEmptyMessage(4);
    }

    public void updateRcsConfig() {
        boolean z;
        dkpp dkppVar = this.D;
        dkcp dkcpVar = this.L;
        String l = dkppVar.l();
        if (dkcpVar.y()) {
            try {
                z = dkcpVar.b.k("com.google.android.ims.provisioning.engine.bugle_default_sms_app", false, "BuglePhoneNumberUtils");
            } catch (dksb e) {
                dkty.j(e, dkcp.a, "Error while retrieving if Bugle is default SMS app", new Object[0]);
                z = false;
            }
            dkty.l(dkcp.a, "Bugle is default SMS app: %s", Boolean.valueOf(z));
            if (z && dkcpVar.z(l)) {
                if (isRegistered()) {
                    dkty.d(this.m, "updateRcsConfig: Already registered, skipping config update request", new Object[0]);
                } else {
                    this.ag.sendEmptyMessage(2);
                }
            }
        }
    }

    public void updateRcsImsState(dkoo dkooVar, dilc dilcVar) {
        dkty.l(this.m, "IMS registration state change [%s -> %s] reason: %s", this.ae.toString(), dkooVar.toString(), dilcVar.name());
        this.ae = dkooVar;
        this.ad = dilcVar;
    }
}
