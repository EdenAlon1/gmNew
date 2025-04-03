package com.google.android.ims.service;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.receiver.sip.DebugOptionsReceiver;
import com.google.android.ims.service.JibeService;
import defpackage.csix;
import defpackage.ctid;
import defpackage.dijt;
import defpackage.dikq;
import defpackage.dimn;
import defpackage.diom;
import defpackage.dipm;
import defpackage.dipo;
import defpackage.dipr;
import defpackage.diyy;
import defpackage.dizc;
import defpackage.dizd;
import defpackage.djai;
import defpackage.dkeq;
import defpackage.dket;
import defpackage.dkpm;
import defpackage.dkpp;
import defpackage.dkqa;
import defpackage.dkqb;
import defpackage.dkqe;
import defpackage.dkql;
import defpackage.dkqp;
import defpackage.dktn;
import defpackage.dkty;
import defpackage.dkuy;
import defpackage.ecwj;
import defpackage.eldl;
import defpackage.errl;
import defpackage.fazb;
import defpackage.ffbr;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class JibeService extends Service implements Thread.UncaughtExceptionHandler {
    public static final dktn a = new dktn("JibeService");
    private static final diyy k;
    private static final diyy l;
    public final AtomicReference b = new AtomicReference(dkql.STOPPED);
    public Thread.UncaughtExceptionHandler c;
    public fazb d;
    public errl e;
    public ffbr f;
    public dket g;
    public ffbr h;
    public dipr i;
    public fazb j;
    private dikq m;

    static {
        new WeakReference(null);
        k = dizd.a(179710499);
        l = dizd.a(193752012);
    }

    public static void a(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) JibeService.class);
        intent.setAction(str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if ("com.google.android.apps.tycho".equals(context.getPackageName())) {
            dkty.d(a, "Ignoring start action because we are running in Tycho", new Object[0]);
            return;
        }
        if (dkuy.i(context) && dkuy.a(context) == 2) {
            dkty.r(a, "Ignoring start action because JibeService is running in CS.apk.", new Object[0]);
        } else if (dkuy.d(context)) {
            context.startService(intent);
        } else {
            dkty.r(a, "Ignoring start action: %s", str);
        }
    }

    private final void c() {
        fazb fazbVar = this.d;
        if (fazbVar == null) {
            return;
        }
        dkpm dkpmVar = (dkpm) fazbVar.b();
        if (Objects.isNull(dkpmVar)) {
            return;
        }
        dkpmVar.j();
    }

    private final boolean d(Intent intent) {
        String action = intent.getAction();
        if ("action.bootCompleted".equals(action)) {
            dkty.d(a, "Handling boot completed. No action.", new Object[0]);
            return true;
        }
        if ("action.upgraded".equals(action)) {
            dkty.d(a, "Handling app upgraded. No action.", new Object[0]);
            return true;
        }
        if ("com.google.android.ims.SIM_LOADED".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("SIM_CHANGED", false);
            if (this.g != null) {
                dkty.l(a, "Handling SIM loaded; changed: %b", Boolean.valueOf(booleanExtra));
                this.g.onSimLoaded(booleanExtra);
            } else {
                dkty.r(a, "unable to handle ACTION_SIM_LOADED event, with null rcsEngineProxy", new Object[0]);
            }
            return true;
        }
        if (!"com.google.android.ims.SIM_ABSENT".equals(action)) {
            return false;
        }
        if (this.g != null) {
            dkty.l(a, "Handling SIM absent", new Object[0]);
            this.g.onSimAbsent();
        } else {
            dkty.r(a, "unable to handle ACTION_SIM_ABSENT event, with null rcsEngineProxy", new Object[0]);
        }
        return true;
    }

    public final void b(dkql dkqlVar) {
        this.b.set(dkqlVar);
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        printWriter.println("** Carrier Services Lib Log **");
        errl errlVar = this.e;
        if (Objects.isNull(errlVar)) {
            printWriter.printf("  Not initialized. (state=%s)%n", this.b.get());
        } else {
            try {
                errlVar.submit(eldl.l(new Runnable() { // from class: dkqj
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrintWriter printWriter2 = printWriter;
                        JibeService jibeService = JibeService.this;
                        if (jibeService.b.get() != dkql.STARTED) {
                            printWriter2.printf("  Not initialized. (state=%s)%n", jibeService.b.get());
                            return;
                        }
                        ffbr ffbrVar = jibeService.h;
                        if (ffbrVar != null) {
                            diuk diukVar = (diuk) ffbrVar.b();
                            dkpm dkpmVar = (dkpm) diukVar.b.b();
                            String i = ((dkdw) diukVar.e.b()).i(dkpmVar.f());
                            String str = dikk.c;
                            printWriter2.println("- IMS Diagnostics Sender");
                            printWriter2.println(" Session ID: ".concat(String.valueOf(dikk.c)));
                            printWriter2.println(" Sequence Number: ".concat(String.valueOf(String.valueOf(dikk.d))));
                            printWriter2.println(" Provisioning Session ID: ".concat(String.valueOf(i)));
                            dkpmVar.a.l(printWriter2);
                            ((dket) diukVar.c.b()).dumpState(printWriter2);
                            dkrx dkrxVar = (dkrx) diukVar.d.b();
                            printWriter2.println("- Private Jibe Data -");
                            dkrxVar.l("sessionid", printWriter2);
                            dkrxVar.l("requestid", printWriter2);
                            dkrxVar.l("first_time_discovery_finished", printWriter2);
                            dkrxVar.l("provisioning_acs_url_override", printWriter2);
                            dkrxVar.l("provisioning_sms_port_override", printWriter2);
                            dkrxVar.l("provisioning_last_attempt", printWriter2);
                            dkrxVar.l("send_error_result_from_engine", printWriter2);
                            dkrxVar.l("capabilities_pidf_etag", printWriter2);
                            printWriter2.println("======== Carrier Services Phenotype Feature Flags ========");
                            diyr.a().k(printWriter2);
                            dizg.o().k(printWriter2);
                            dizi.a().k(printWriter2);
                            dizk.a().k(printWriter2);
                            dizm.a().k(printWriter2);
                            dizq.c().k(printWriter2);
                            dizs.a().k(printWriter2);
                            dizu.a().k(printWriter2);
                            dizw.a().k(printWriter2);
                            dizy.a().k(printWriter2);
                            if (djaa.a == null) {
                                djaa.a();
                            }
                            djaa.a.k(printWriter2);
                            djac.a().k(printWriter2);
                            djae.c().k(printWriter2);
                            djag.a().k(printWriter2);
                            djai.t().k(printWriter2);
                            djak.a().k(printWriter2);
                            djao.p().k(printWriter2);
                            djaq.a().k(printWriter2);
                            djas.c().k(printWriter2);
                            djam.a().k(printWriter2);
                            dizo.a().k(printWriter2);
                            printWriter2.println("======== End Carrier Services Phenotype Feature Flags ========");
                            String str2 = dimn.E().L() == 6 ? "MobileConfiguration" : dimn.E().L() == 5 ? "Phenotype" : "GServices";
                            printWriter2.printf("======== Carrier Services %s Rcs Flags ========%n", str2);
                            Iterator it = dimn.E().G().iterator();
                            while (it.hasNext()) {
                                printWriter2.println((dimm) it.next());
                            }
                            printWriter2.printf("======== End Carrier Services %s Rcs Flags ========%n", str2);
                            printWriter2.println("======== Carrier Services Kill Switches ========");
                            dizd.c().k(printWriter2);
                            printWriter2.println("======== End Carrier Services Kill Switches ========");
                            printWriter2.println("======== Carrier Services Allow Switches ========");
                            if (diyv.b != null) {
                                diyv.a().k(printWriter2);
                            }
                            printWriter2.println("======== End Carrier Services Allow Switches ========");
                            printWriter2.flush();
                            Context context = diukVar.a;
                            String[] strArr2 = dkuy.a;
                            StringBuilder sb = new StringBuilder("Carrier Services GServices flags:\n");
                            try {
                                for (Map.Entry entry : digu.d(context.getApplicationContext().getContentResolver(), "carrier_services_").entrySet()) {
                                    sb.append("   ");
                                    sb.append((String) entry.getKey());
                                    sb.append(": ");
                                    sb.append((String) entry.getValue());
                                    sb.append("\n");
                                }
                                sb.append("====================\n");
                            } catch (Exception e) {
                                sb.append("Error: Cannot get GServices values.\n");
                                sb.append(e);
                            }
                            printWriter2.print(sb.toString());
                            dkty.f(printWriter2);
                        }
                    }
                })).get(5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                dkty.h(a, "Unable to dump report on JibeService: %s", e.getMessage());
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                dkty.h(a, "Unable to dump report on JibeService: %s", e2.getMessage());
            } catch (TimeoutException e3) {
                dkty.h(a, "Timed out while dumping RCS bugreport: %s", e3.getMessage());
            }
        }
        printWriter.println("** End Carrier Services Lib Log **");
        printWriter.flush();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ffbr ffbrVar;
        String action = intent.getAction();
        dktn dktnVar = a;
        dkql dkqlVar = (dkql) this.b.get();
        dkql dkqlVar2 = dkql.STOPPED;
        dkty.l(dktnVar, "onBind in state %s, intent action = %s", dkqlVar.e, action);
        if (ctid.h(this)) {
            dkty.r(dktnVar, "Running as secondary user - binding not allowed!", new Object[0]);
            dikq dikqVar = this.m;
            dikqVar.getClass();
            dikqVar.a(4);
            return null;
        }
        if (!((Boolean) l.a()).booleanValue() && (this.b.get() == dkql.STOPPING || this.b.get() == dkql.STOPPED)) {
            dkty.h(dktnVar, "onBind should never be called while in state %s", this.b);
            dikq dikqVar2 = this.m;
            dikqVar2.getClass();
            dikqVar2.a(3);
            return null;
        }
        if (!d(intent)) {
            if ("csapk.created".equals(action)) {
                dkty.d(dktnVar, "onBind: CS apk created", new Object[0]);
            } else if ("com.google.android.ims.JibeServiceBase".equals(action)) {
                dkty.d(dktnVar, "onBind: JibeServiceBase", new Object[0]);
            } else {
                if (((Boolean) k.a()).booleanValue() && (ffbrVar = this.f) != null) {
                    ((dkeq) ffbrVar.b()).a();
                }
                String action2 = intent.getAction();
                if (action2 != null) {
                    if (dkqp.a(getApplicationContext()).b(action2).isPresent()) {
                        return (IBinder) dkqp.a(getApplicationContext()).b(action2).get();
                    }
                    dkty.r(dktnVar, "[BUG] Can't find a IBinder for %s. This should not happen.", action2);
                    dikq dikqVar3 = this.m;
                    dikqVar3.getClass();
                    dikqVar3.a(7);
                    return null;
                }
            }
        }
        dkty.r(dktnVar, "onBind: JibeService not returning binder", new Object[0]);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dipm a2 = dipo.a(this);
        ecwj.f(getApplicationContext());
        dizc.m();
        dkpp r = a2.r();
        dijt i = a2.i();
        dimn.I(this);
        dktn dktnVar = a;
        dkty.d(dktnVar, "onCreate:", new Object[0]);
        if (dkuy.i(getApplicationContext()) && dkuy.a(getApplicationContext()) == 2) {
            dkty.r(dktnVar, "RCS Engine is supposed to run in CS.apk.", new Object[0]);
        }
        dkqp.a(getApplicationContext());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            dkty.u("must be called from the main thread!", new Object[0]);
        }
        dkty.d(dktnVar, "Starting JibeService.", new Object[0]);
        if (this.b.get() == dkql.STARTED || this.b.get() == dkql.STARTING) {
            dkty.d(dktnVar, "Already started. state=%s", this.b);
        } else if (!csix.n() && ctid.h(this)) {
            dkty.r(dktnVar, "Running as secondary user - stopping service!", new Object[0]);
            stopSelf();
        } else if (djai.T() || dipo.a(getApplicationContext()).c().k()) {
            b(dkql.STARTING);
            HandlerThread handlerThread = new HandlerThread("JibeServiceInitThread");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new Runnable() { // from class: dkqh
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [dkqi] */
                @Override // java.lang.Runnable
                public final void run() {
                    dkqm dkqmVar;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
                    dkty.d(JibeService.a, "Initialize JibeService.", new Object[0]);
                    JibeService jibeService = JibeService.this;
                    try {
                        dkvx.a();
                        if (!csix.n() && !ActivityManager.isUserAMonkey() && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != jibeService) {
                            jibeService.c = defaultUncaughtExceptionHandler;
                            Thread.setDefaultUncaughtExceptionHandler(jibeService);
                        }
                        Context applicationContext = jibeService.getApplicationContext();
                        synchronized (dkqe.a) {
                            if (dkqe.b == null) {
                                dkty.k("Creating JibeServiceComponent", new Object[0]);
                                dkqe.b = new dkqg(dipo.a(applicationContext.getApplicationContext()));
                            }
                            dkqmVar = dkqe.b;
                        }
                        jibeService.d = fbaz.a(((dkqg) dkqmVar).c);
                        jibeService.e = (errl) ((dkqg) dkqmVar).d.b();
                        ((dkqg) dkqmVar).a.f().getClass();
                        ((dkqg) dkqmVar).a.e().getClass();
                        jibeService.f = ((dkqg) dkqmVar).f;
                        jibeService.g = (dket) ((dkqg) dkqmVar).S.b();
                        jibeService.h = ((dkqg) dkqmVar).bm;
                        jibeService.i = (dipr) ((dkqg) dkqmVar).bn.b();
                        jibeService.j = fbaz.a(((dkqg) dkqmVar).bo);
                        ((dkqg) dkqmVar).a.g().getClass();
                        ((dkpm) jibeService.d.b()).h();
                        jibeService.i.a();
                        jibeService.g.initializeRcsEngineForBugle();
                        ((dkqb) jibeService.j.b()).b(jibeService.getApplicationContext(), ((dkpm) jibeService.d.b()).c(), new Object() { // from class: dkqi
                        });
                        jibeService.b(dkql.STARTED);
                    } catch (Exception e) {
                        dkty.j(e, JibeService.a, "Initialization failed - stopping service! ", new Object[0]);
                        jibeService.b(dkql.STOPPED);
                        jibeService.stopSelf();
                    }
                }
            });
            handlerThread.quitSafely();
        } else {
            dkty.r(dktnVar, "Missing required permissions - stopping service!", new Object[0]);
            stopSelf();
        }
        new WeakReference(this);
        this.m = new dikq(getApplicationContext(), r, i);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        dkty.l(a, "onDestroy: stopping service", new Object[0]);
        if (this.b.get() == dkql.STOPPED) {
            return;
        }
        new WeakReference(null);
        b(dkql.STOPPING);
        try {
            try {
                dket dketVar = this.g;
                if (dketVar != null) {
                    dketVar.destroyRcsEngine();
                    dkqb dkqbVar = (dkqb) this.j.b();
                    if (!Objects.isNull(dkqbVar)) {
                        dkqbVar.a();
                    }
                }
                Context applicationContext = getApplicationContext();
                DebugOptionsReceiver.b(applicationContext);
                dkqa.b(applicationContext);
                if ("com.google.android.apps.messaging".equals(applicationContext.getPackageName())) {
                    boolean z = diom.a;
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (diom.b.get(applicationContext2.hashCode(), false)) {
                        applicationContext2.unregisterReceiver(diom.d);
                        applicationContext2.unregisterReceiver(diom.e);
                        diom.b.delete(applicationContext2.hashCode());
                    }
                }
            } catch (Exception e) {
                dkty.j(e, a, "onDestroy() unregister factory exception", new Object[0]);
            }
        } finally {
            dkqp.a(getApplicationContext()).c();
            dkqe.b();
            c();
            b(dkql.STOPPED);
        }
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        ffbr ffbrVar;
        dkty.d(a, "onRebind(), intent=%s", intent);
        if (((Boolean) k.a()).booleanValue() && IChatSession.class.getName().equals(intent.getAction()) && (ffbrVar = this.f) != null) {
            ((dkeq) ffbrVar.b()).a();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return super.onStartCommand(null, i, i2);
        }
        if (this.b.get() != dkql.STARTED) {
            return super.onStartCommand(intent, i, i2);
        }
        d(intent);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        dkty.d(a, "onUnbind(), intent=%s", intent);
        return ((Boolean) k.a()).booleanValue() && IChatSession.class.getName().equals(intent.getAction());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(final Thread thread, final Throwable th) {
        Runnable runnable = new Runnable() { // from class: dkqk
            @Override // java.lang.Runnable
            public final void run() {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = JibeService.this.c;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        };
        if (getMainLooper().getThread() != thread) {
            dkty.j(th, a, "Uncaught exception in background thread %s", thread);
            new Handler(getMainLooper()).post(runnable);
        } else {
            dkty.j(th, a, "Uncaught exception in primary thread %s", thread);
            runnable.run();
        }
    }
}
