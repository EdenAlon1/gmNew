package com.google.android.ims.rcs.engine.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.businessinfo.BusinessInfoEngine;
import com.google.android.ims.jibe.service.connectiontracker.ImsConnectionTrackerEngine;
import com.google.android.ims.jibe.service.contactsmanager.ContactsManager;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.profile.RcsProfileEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.jibe.service.singleregistration.SingleRegistrationVendorImsController;
import com.google.android.ims.jibe.service.transportcontrol.TransportControlEngine;
import com.google.android.ims.messaging.MessagingEngine;
import com.google.android.ims.metrics.PeriodicMetricsJobService;
import com.google.android.ims.network.common.RcsEngine;
import com.google.android.ims.rcs.engine.IRcsEngineController;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.signup.ISignup;
import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import com.google.android.rcs.client.messaging.IMessaging;
import defpackage.ctwb;
import defpackage.dfpi;
import defpackage.dhvo;
import defpackage.dikt;
import defpackage.dikz;
import defpackage.dilc;
import defpackage.dipg;
import defpackage.dips;
import defpackage.diul;
import defpackage.diyy;
import defpackage.dizd;
import defpackage.dizg;
import defpackage.djak;
import defpackage.djjr;
import defpackage.dkcp;
import defpackage.dket;
import defpackage.dkeu;
import defpackage.dkfx;
import defpackage.dkfy;
import defpackage.dkli;
import defpackage.dklp;
import defpackage.dkoo;
import defpackage.dkpe;
import defpackage.dkph;
import defpackage.dkpm;
import defpackage.dkqp;
import defpackage.dkrx;
import defpackage.dksy;
import defpackage.dktl;
import defpackage.dktn;
import defpackage.dkty;
import defpackage.dkuy;
import defpackage.dkvg;
import defpackage.eenk;
import defpackage.eldl;
import defpackage.erqc;
import defpackage.erqt;
import defpackage.errl;
import defpackage.eyvh;
import defpackage.eyvj;
import defpackage.eyvu;
import defpackage.eyvv;
import defpackage.ezjz;
import defpackage.ezkb;
import defpackage.ezkd;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.koa;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsEngineProxyImpl extends IRcsEngineController.Stub implements dket, dikz {
    static final diyy<Boolean> enableLoggingRcsEngineInitializationCall = dizd.a(263232862);
    private dkfy A;
    private final dktn B = dktn.a("RcsEngineProxyImpl");
    private final dhvo C;
    private final fazb a;
    private final ffbr b;
    private final fazb c;
    private final fazb d;
    private final dkpe e;
    private final ffbr f;
    private final fazb g;
    private final fazb h;
    private final fazb i;
    private final fazb j;
    private final fazb k;
    private final errl l;
    private final dfpi m;
    private final fazb n;
    private final fazb o;
    private final ctwb p;
    private final fazb q;
    private final fazb r;
    private final fazb s;
    private final fazb t;
    private final fazb u;
    private final fazb v;
    private final fazb w;
    private final Map x;
    private final Context y;
    private RcsEngine z;

    public static /* synthetic */ void $r8$lambda$gTae8hfuT2tQgdWorI6h2CEm_54(RcsEngineProxyImpl rcsEngineProxyImpl, boolean z) {
        try {
            rcsEngineProxyImpl.a().onSimLoaded(z);
        } catch (IllegalStateException e) {
            dkty.j(e, rcsEngineProxyImpl.B, "RcsEngine is not initialized.", new Object[0]);
        }
        if (z) {
            dkty.l(rcsEngineProxyImpl.B, "onSimLoaded: detected a change", new Object[0]);
            ((dipg) rcsEngineProxyImpl.a.b()).a();
            ((diul) rcsEngineProxyImpl.c.b()).a();
        }
        dkty.l(rcsEngineProxyImpl.B, "onSimLoaded: isSimLoaded: [%b]", Boolean.valueOf(((dkpm) rcsEngineProxyImpl.k.b()).l(rcsEngineProxyImpl.y)));
    }

    public RcsEngineProxyImpl(Context context, Map<dkvg, ffbr<RcsEngine>> map, fazb<SignupEngine> fazbVar, fazb<FileTransferEngine> fazbVar2, fazb<ChatSessionEngine> fazbVar3, fazb<LocationSharingEngine> fazbVar4, fazb<ImsConnectionTrackerEngine> fazbVar5, fazb<TransportControlEngine> fazbVar6, fazb<SingleRegistrationVendorImsController> fazbVar7, fazb<ContactsManager> fazbVar8, fazb<RcsProfileEngine> fazbVar9, fazb<MessagingEngine> fazbVar10, fazb<BusinessInfoEngine> fazbVar11, fazb<dips> fazbVar12, fazb<dkpm> fazbVar13, ffbr<dkcp> ffbrVar, fazb<dkph> fazbVar14, fazb<dipg> fazbVar15, ffbr<dkrx> ffbrVar2, fazb<diul> fazbVar16, dkpe dkpeVar, dfpi dfpiVar, ctwb ctwbVar, errl errlVar, fazb<dikt> fazbVar17, dhvo dhvoVar) {
        this.y = context;
        this.x = map;
        this.g = fazbVar;
        this.h = fazbVar2;
        this.i = fazbVar3;
        this.j = fazbVar4;
        this.n = fazbVar5;
        this.o = fazbVar6;
        this.q = fazbVar7;
        this.r = fazbVar8;
        this.s = fazbVar9;
        this.t = fazbVar10;
        this.u = fazbVar11;
        this.v = fazbVar12;
        this.k = fazbVar13;
        this.f = ffbrVar;
        this.d = fazbVar14;
        this.a = fazbVar15;
        this.b = ffbrVar2;
        this.c = fazbVar16;
        this.e = dkpeVar;
        this.m = dfpiVar;
        this.p = ctwbVar;
        this.l = errlVar;
        this.w = fazbVar17;
        this.C = dhvoVar;
    }

    private final synchronized RcsEngine a() {
        RcsEngine rcsEngine;
        rcsEngine = this.z;
        if (rcsEngine == null) {
            throw new IllegalStateException("RcsEngine is not initialized.");
        }
        return rcsEngine;
    }

    private final synchronized RcsEngineLifecycleServiceResult b(int i, dkvg dkvgVar, Optional optional) {
        final ffbr ffbrVar = (ffbr) this.x.get(dkvgVar);
        if (ffbrVar == null) {
            dkty.h(this.B, "Unknown RCS backend type %s", dkvgVar);
            throw new IllegalArgumentException("Unknown RCS backend type ".concat(String.valueOf(String.valueOf(dkvgVar))));
        }
        dkty.l(this.B, "Initialize RcsEngine. subId=%d backendType=%s", Integer.valueOf(i), dkvgVar);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread("RcsEngineInitThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new Runnable() { // from class: dkfj
            @Override // java.lang.Runnable
            public final void run() {
                RcsEngineProxyImpl.lambda$createAndInitRcsEngine$0(ffbr.this, countDownLatch);
            }
        });
        handlerThread.quitSafely();
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
            final RcsEngine rcsEngine = (RcsEngine) ffbrVar.b();
            rcsEngine.init();
            g(rcsEngine);
            optional.ifPresent(new Consumer() { // from class: dkfk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    RcsEngineProxyImpl.this.A = new dkeu(rcsEngine, (ezjz) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } catch (InterruptedException e) {
            dkty.j(e, this.B, "RCS Engine initialization timeout.", new Object[0]);
            return new RcsEngineLifecycleServiceResult(1);
        }
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final synchronized RcsEngineLifecycleServiceResult c(ezjz ezjzVar) {
        dkty.l(this.B, "RCS engine was destroyed: %b.", Boolean.valueOf(d().succeeded()));
        int i = ezjzVar.c;
        ezkb b = ezkb.b(ezjzVar.d);
        if (b == null) {
            b = ezkb.RCS_TRANSPORT_TYPE_UNKNOWN;
        }
        dkvg dkvgVar = dkvg.UNKNOWN;
        int ordinal = b.ordinal();
        RcsEngineLifecycleServiceResult b2 = b(i, ordinal != 1 ? ordinal != 2 ? dkvg.UNKNOWN : dkvg.SINGLE_REG : dkvg.DUAL_REG, Optional.of(ezjzVar));
        if (!b2.succeeded()) {
            return b2;
        }
        dkfy dkfyVar = this.A;
        dkfyVar.getClass();
        ((dkeu) dkfyVar).a.startRcsStack(ezjzVar.c);
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final synchronized RcsEngineLifecycleServiceResult d() {
        RcsEngine rcsEngine = this.z;
        if (rcsEngine == null) {
            dkty.r(this.B, "RcsEngine hasn't been initialized.", new Object[0]);
            return new RcsEngineLifecycleServiceResult(2);
        }
        dkty.l(this.B, "Destroy RcsEngine", new Object[0]);
        dkqp.a(this.y).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new Consumer() { // from class: dkfl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).clear();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        rcsEngine.shutdown();
        g(null);
        this.A = null;
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final void e() {
        ffbr ffbrVar = (ffbr) this.x.get(dkvg.DUAL_REG);
        ffbrVar.getClass();
        final RcsEngine rcsEngine = (RcsEngine) ffbrVar.b();
        dkqp.a(this.y).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new Consumer() { // from class: dkfm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set(RcsEngine.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        g(rcsEngine);
        a().init();
    }

    private final void f() {
        dkqp a = dkqp.a(this.y);
        a.b(IEvent.class.getName()).ifPresent(new Consumer() { // from class: dkfo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set(((dips) RcsEngineProxyImpl.this.v.b()).b);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IImsConnectionTracker.class.getName()).ifPresent(new Consumer() { // from class: dkfs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.n.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IContactsManagement.class.getName()).ifPresent(new Consumer() { // from class: dkft
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.r.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IFileTransfer.class.getName()).ifPresent(new Consumer() { // from class: dkfu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.h.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IChatSession.class.getName()).ifPresent(new Consumer() { // from class: dkfv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.i.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IRcsProfile.class.getName()).ifPresent(new Consumer() { // from class: dkfw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.s.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(ISignup.class.getName()).ifPresent(new Consumer() { // from class: dkff
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.g.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(ILocationSharing.class.getName()).ifPresent(new Consumer() { // from class: dkfg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.j.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IBusinessInfo.class.getName()).ifPresent(new Consumer() { // from class: dkfh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.u.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IMessaging.class.getName()).ifPresent(new Consumer() { // from class: dkfi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.t.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(ITransportControl.class.getName()).ifPresent(new Consumer() { // from class: dkfp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.o.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(ISingleRegistrationVendorImsController.class.getName()).ifPresent(new Consumer() { // from class: dkfq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set((IBinder) RcsEngineProxyImpl.this.q.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a.b(IRcsEngineController.class.getName()).ifPresent(new Consumer() { // from class: dkfr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).set(RcsEngineProxyImpl.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final synchronized void g(RcsEngine rcsEngine) {
        if (rcsEngine == null) {
            dkty.r(this.B, "setting active RCS engine to null", new Object[0]);
        } else {
            dkty.l(this.B, "setting active RCS Engine to %s instance", rcsEngine.getSipConnectionType().d);
        }
        this.z = rcsEngine;
    }

    private final void h() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) dizg.o().a.a.a()).longValue());
        long millis2 = TimeUnit.MINUTES.toMillis(((Long) dizg.o().a.b.a()).longValue());
        int i = PeriodicMetricsJobService.d;
        Context context = this.y;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(30000, new ComponentName(context, (Class<?>) PeriodicMetricsJobService.class));
        builder.setRequiredNetworkType(1);
        builder.setBackoffCriteria(millis2, 0);
        builder.setPeriodic(millis);
        dkty.o("Started periodic metrics with period %d ms and backoff %d ms, result %d", Long.valueOf(millis), Long.valueOf(millis2), Integer.valueOf(jobScheduler.schedule(builder.build())));
    }

    public static /* synthetic */ void lambda$createAndInitRcsEngine$0(ffbr ffbrVar, CountDownLatch countDownLatch) {
        ffbrVar.b();
        countDownLatch.countDown();
    }

    @Override // defpackage.djgy
    public dklp createIncomingSession(eenk eenkVar) {
        return a().createIncomingSession(eenkVar);
    }

    @Override // defpackage.djgy
    public dkli createOutgoingSession(String str) {
        return a().createOutgoingSession(str);
    }

    @Override // defpackage.djgy
    public dkli createOutgoingSlmSession(String str) {
        return a().createOutgoingSlmSession(str);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult destroy(int i) {
        if (djak.t() && dkuy.i(this.y)) {
            return d();
        }
        dkty.r(this.B, "RCS engine is initialized automatically. Ignore destroy request from Bugle.", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // defpackage.dket
    public void destroyRcsEngine() {
        dkty.l(this.B, "Destroy RCS Engine.", new Object[0]);
        unregisterReceivers();
        int i = PeriodicMetricsJobService.d;
        dkty.o("Stopping periodic metrics.", new Object[0]);
        ((JobScheduler) this.y.getSystemService("jobscheduler")).cancel(30000);
        dkqp.a(this.y).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new Consumer() { // from class: dkfn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((dkqo) obj).clear();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        RcsEngine rcsEngine = this.z;
        if (rcsEngine != null) {
            rcsEngine.shutdown();
            g(null);
        }
    }

    @Override // defpackage.dket
    public void dumpState(PrintWriter printWriter) {
        try {
            a().dumpState(printWriter);
        } catch (IllegalStateException e) {
            dkty.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    public djjr getImsModule() {
        return a().getImsModule();
    }

    @Override // defpackage.dker
    public dkoo getLastRegistrationState() {
        try {
            return a().getLastRegistrationState();
        } catch (IllegalStateException e) {
            dkty.t(e, this.B, "RcsEngine is not initialized.", new Object[0]);
            return dkoo.STATE_UNKNOWN;
        }
    }

    @Override // defpackage.dikz
    public ImsRegistrationState getRegistrationState() {
        try {
            return a().getRegistrationState();
        } catch (IllegalStateException e) {
            dkty.t(e, this.B, "RcsEngine is not initialized.", new Object[0]);
            return new ImsRegistrationState(dkoo.STATE_UNKNOWN);
        }
    }

    @Override // defpackage.dikz
    public boolean hasActiveRegistration() {
        try {
            return a().hasActiveRegistration();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult initialize(int i, int i2) {
        dkty.l(this.B, "received initialization request for %s RcsEngine", dkvg.a(i2).d);
        if (((Boolean) enableLoggingRcsEngineInitializationCall.a()).booleanValue()) {
            dikt diktVar = (dikt) this.w.b();
            Context context = this.y;
            eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
            eyvh eyvhVar = (eyvh) eyvj.a.createBuilder();
            boolean t = djak.t();
            eyvhVar.copyOnWrite();
            eyvj eyvjVar = (eyvj) eyvhVar.instance;
            eyvjVar.b |= 2;
            eyvjVar.d = t;
            RcsEngine rcsEngine = this.z;
            int i3 = rcsEngine == null ? 2 : rcsEngine.getSipConnectionType() == dkvg.SINGLE_REG ? 4 : this.z.getSipConnectionType() == dkvg.DUAL_REG ? 3 : 1;
            eyvhVar.copyOnWrite();
            eyvj eyvjVar2 = (eyvj) eyvhVar.instance;
            eyvjVar2.c = i3 - 1;
            eyvjVar2.b |= 1;
            eyvj eyvjVar3 = (eyvj) eyvhVar.build();
            eyvuVar.copyOnWrite();
            eyvv eyvvVar = (eyvv) eyvuVar.instance;
            eyvjVar3.getClass();
            eyvvVar.d = eyvjVar3;
            eyvvVar.c = 13;
            diktVar.h(context, (eyvv) eyvuVar.build());
        }
        if (djak.t() && dkuy.i(this.y)) {
            RcsEngine rcsEngine2 = this.z;
            dkvg a = dkvg.a(i2);
            if (rcsEngine2 != null) {
                if (rcsEngine2.getSipConnectionType().equals(a)) {
                    dkty.r(this.B, "Already initialized %s RcsEngine instance. Reusing existing instance", dkvg.a(i2).d);
                    return new RcsEngineLifecycleServiceResult(0);
                }
                dkty.r(this.B, "Requested initialization of %s RcsEngine when %s RcsEngine is already initialized. Destroying the %s RcsEngine", a, rcsEngine2.getSipConnectionType(), rcsEngine2.getSipConnectionType());
                destroy(i);
            }
            return b(i, a, Optional.empty());
        }
        dkty.r(this.B, "RCS engine is initialized automatically. Ignore initialization request from Bugle. enableRcsEngineInitializationByBugle:[%s], isRcsEngineInBugle:[%s]", Boolean.valueOf(djak.t()), Boolean.valueOf(dkuy.i(this.y)));
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) {
        ezkb b = ezkb.b(initializeAndStartRcsTransportRequest.a().d);
        if (b == null) {
            b = ezkb.RCS_TRANSPORT_TYPE_UNKNOWN;
        }
        dkty.l(this.B, "initializeAndStartRcsTransport: %s, %s", b, Integer.valueOf(initializeAndStartRcsTransportRequest.a().c));
        ezjz a = initializeAndStartRcsTransportRequest.a();
        dkfy dkfyVar = this.A;
        if (dkfyVar == null || !((dkeu) dkfyVar).b.equals(a)) {
            dkty.l(this.B, "initializeAndStartRcsTransport: creating a new RcsEngine instance", new Object[0]);
            return c(a);
        }
        dkty.l(this.B, "initializeAndStartRcsTransport: correct instance of RcsEngine already exists. Starting RCS stack", new Object[0]);
        return triggerStartRcsStack(a.c);
    }

    @Override // defpackage.dket
    public synchronized void initializeRcsEngineForBugle() {
        Intent c;
        dkty.l(this.B, "Initializing RCS Engine for Bugle host.", new Object[0]);
        ((dkpm) this.k.b()).h();
        f();
        ((dkpm) this.k.b()).i();
        if (djak.t()) {
            dkty.l(this.B, "enableRcsEngineInitializationByBugle is enabled, waiting for Bugle to initialize RcsEngine.", new Object[0]);
        } else {
            dkty.r(this.B, "enableRcsEngineInitializationByBugle is disabled, directly initializing new DUAL_REG RcsEngine", new Object[0]);
            e();
        }
        h();
        if ("com.google.android.apps.messaging".equals(this.y.getPackageName())) {
            dktl.a = "BugleRcsEngine";
        }
        dkty.y(this.y);
        dksy.e(this.y, (dkpm) this.k.b(), this.m, this.p, this.l, this.C);
        dkty.o("Device info: %s %s %s // %s %s", Build.MANUFACTURER, Build.MODEL, Build.DEVICE, Build.BRAND, Build.PRODUCT);
        dkty.o("Running Android %s, API level %d, %s %s", Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.CODENAME, Build.VERSION.INCREMENTAL);
        if (!((Boolean) dizg.o().a.t.a()).booleanValue()) {
            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
            builder.detectNetwork();
            builder.penaltyLog();
            StrictMode.setThreadPolicy(builder.build());
        }
        registerReceivers();
        if (((Boolean) djak.a.b.d.a()).booleanValue() && (c = ((dkpm) this.k.b()).c()) != null && "com.google.android.ims.SIM_LOADED".equals(c.getAction())) {
            dkty.d(this.B, "SIM has been loaded before JibeService.", new Object[0]);
            onSimLoaded(c.getBooleanExtra("SIM_CHANGED", false));
        }
    }

    public void initializeRcsEngineForCsApk() {
        dkty.l(this.B, "Initializing RCS Engine for CsApk host.", new Object[0]);
        f();
        e();
        h();
    }

    @Override // defpackage.dikz
    public boolean isRegistered() {
        try {
            return a().isRegistered();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public void onBackendChanged() {
        try {
            a().onBackendChanged();
        } catch (IllegalStateException e) {
            dkty.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.dket
    public void onSimAbsent() {
        final dkcp dkcpVar = (dkcp) this.f.b();
        final String f = ((dkpm) this.k.b()).f();
        erqt.r(erqc.o(dkcpVar.c.submit(eldl.m(new Callable() { // from class: dkco
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dkcp.this.f(f);
            }
        }))), new dkfx(this), this.l);
    }

    public void onSimAbsentInternal() {
        if (!((dkrx) this.b.b()).t()) {
            ((dipg) this.a.b()).a();
            ((diul) this.c.b()).a();
            dkty.h(this.B, "onSimRemoved: not using a test number at the moment", new Object[0]);
        }
        dkty.l(this.B, "onSimRemoved: isSimLoaded: [%b]", Boolean.valueOf(((dkpm) this.k.b()).l(this.y)));
        try {
            a().onSimRemoved();
        } catch (IllegalStateException e) {
            dkty.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.dket
    public void onSimLoaded(final boolean z) {
        this.l.execute(eldl.l(new Runnable() { // from class: dkfe
            @Override // java.lang.Runnable
            public final void run() {
                RcsEngineProxyImpl.$r8$lambda$gTae8hfuT2tQgdWorI6h2CEm_54(RcsEngineProxyImpl.this, z);
            }
        }));
    }

    protected void registerReceivers() {
        registerSelfServiceMessageReceiver();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD);
            koa.g(this.y, this.e, intentFilter);
        } catch (RuntimeException e) {
            dkty.j(e, this.B, "Failed to register RecurringMetricsUploadReceiver. Already registered?", new Object[0]);
        }
    }

    public void registerSelfServiceMessageReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID);
            intentFilter.addAction(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE);
            koa.g(this.y, (BroadcastReceiver) this.d.b(), intentFilter);
        } catch (RuntimeException e) {
            dkty.j(e, this.B, "Failed to register SelfServiceMessageReceiver. Already registered?", new Object[0]);
        }
    }

    @Override // defpackage.dket
    public void shutdown() {
        try {
            a().shutdown();
        } catch (IllegalStateException e) {
            dkty.j(e, this.B, "RcsEngine is not initialized", new Object[0]);
        }
    }

    @Override // defpackage.dker
    public void startRcsStack(int i) {
        try {
            a().startRcsStack(i);
        } catch (IllegalStateException e) {
            dkty.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.dket
    public void stop(dilc dilcVar) {
        try {
            a().getImsModule().k(dilcVar);
        } catch (IllegalStateException e) {
            dkty.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) {
        ezkd a = stopAllRcsTransportsExceptRequest.a();
        dkfy dkfyVar = this.A;
        if (dkfyVar != null) {
            ezjz ezjzVar = ((dkeu) dkfyVar).b;
            ezkb b = ezkb.b(ezjzVar.d);
            if (b == null) {
                b = ezkb.RCS_TRANSPORT_TYPE_UNKNOWN;
            }
            int i = ezjzVar.c;
            ezkb b2 = ezkb.b(a.d);
            if (b2 == null) {
                b2 = ezkb.RCS_TRANSPORT_TYPE_UNKNOWN;
            }
            if (b2.equals(b) && !a.c.contains(Integer.valueOf(i))) {
                dkty.l(this.B, "stopAllRcsTransportsExcept: trigger the stop of RcsEngine", new Object[0]);
                dkfy dkfyVar2 = this.A;
                dkfyVar2.getClass();
                return triggerStopRcsStack(((dkeu) dkfyVar2).b.c);
            }
        }
        dkty.l(this.B, "stopAllRcsTransportsExcept: ignoring stopping the RcsEngine. RcsEngine is still running", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // defpackage.dker
    public void stopRcsStack(int i) {
        try {
            a().stopRcsStack(i);
        } catch (IllegalStateException e) {
            dkty.j(e, this.B, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) {
        a().startRcsStack(i);
        dkty.l(this.B, "triggerStartRcsStack: RcsEngine started", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) {
        a().stopRcsStack(i);
        dkty.l(this.B, "triggerStopRcsStack: RcsEngine stopped", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    protected void unregisterReceivers() {
        unregisterSelfServiceMessageReceiver();
        try {
            this.y.unregisterReceiver(this.e);
        } catch (RuntimeException e) {
            dkty.j(e, this.B, "Failed to unregister RecurringMetricsUploadReceiver.", new Object[0]);
        }
    }

    public void unregisterSelfServiceMessageReceiver() {
        try {
            this.y.unregisterReceiver((BroadcastReceiver) this.d.b());
        } catch (RuntimeException e) {
            dkty.t(e, this.B, "Failed to unregister SelfServiceMessageReceiver.", new Object[0]);
        }
    }
}
