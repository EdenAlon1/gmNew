package com.google.android.ims.binding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Process;
import android.service.carrier.CarrierMessagingClientService;
import com.google.android.ims.binding.SystemBindingService;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.dihn;
import defpackage.diho;
import defpackage.dipo;
import defpackage.dkty;
import defpackage.eldl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.errl;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SystemBindingService extends CarrierMessagingClientService {
    public static final enru a = enru.c("com/google/android/ims/binding/SystemBindingService");
    private errl b;

    private final synchronized errl a() {
        Context applicationContext;
        if (this.b == null) {
            applicationContext = getApplicationContext();
            this.b = dipo.a(applicationContext).v();
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        ensk h = a.h();
        h.Y(ente.a, "CarrierServices");
        ((enrr) ((enrr) h).h("com/google/android/ims/binding/SystemBindingService", "onCreate", 70, "SystemBindingService.java")).q("SystemBindingService onCreate");
        super.onCreate();
        a().execute(eldl.l(new Runnable() { // from class: dihp
            @Override // java.lang.Runnable
            public final void run() {
                SystemBindingService systemBindingService = SystemBindingService.this;
                if (dkuy.h(systemBindingService.getApplicationContext())) {
                    if (!dkuy.k(systemBindingService.getApplicationContext())) {
                        ensk h2 = SystemBindingService.a.h();
                        h2.Y(ente.a, "CarrierServices");
                        ((enrr) ((enrr) h2).h("com/google/android/ims/binding/SystemBindingService", "startJibeService", 110, "SystemBindingService.java")).q("SystemBindingService: Starting JibeService");
                        systemBindingService.startService(new Intent().setComponent(new ComponentName(systemBindingService, "com.google.android.ims.service.JibeService")));
                    }
                    dkuk.b(systemBindingService, new Intent(RcsIntents.ACTION_RCS_SYSTEM_BINDING), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dkuj.SYSTEM_BINDING_SERVICE);
                }
            }
        }));
        a().execute(eldl.l(new Runnable() { // from class: dihq
            @Override // java.lang.Runnable
            public final void run() {
                final diho h2 = dipo.a(SystemBindingService.this.getApplicationContext()).h();
                if (dizg.n() <= 0) {
                    dkty.r(diho.b, "System-Binding monitor disabled by phenotype flags.", new Object[0]);
                    return;
                }
                synchronized (h2) {
                    if (h2.i) {
                        return;
                    }
                    h2.i = true;
                    emyg emygVar = h2.f;
                    emygVar.e();
                    emygVar.f();
                    ConnectivityManager connectivityManager = (ConnectivityManager) h2.c.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        dkty.h(diho.b, "SystemBindingMonitor received a null reference for the ConnectivityManager", new Object[0]);
                    } else {
                        synchronized (h2) {
                            h2.j = new dihn(h2);
                            connectivityManager.registerDefaultNetworkCallback(h2.j);
                        }
                    }
                    Runnable runnable = new Runnable() { // from class: dihm
                        @Override // java.lang.Runnable
                        public final void run() {
                            diho dihoVar = diho.this;
                            final Duration duration = (Duration) enej.a(diho.a, Duration.ofMillis(dihoVar.e.a() - dihoVar.h));
                            final Duration duration2 = (Duration) enej.a(diho.a, Duration.ofMillis(dihoVar.e.a()));
                            final int myPid = Process.myPid();
                            final Duration a2 = dihoVar.a();
                            final Duration b = dihoVar.b();
                            final Duration c = dihoVar.c();
                            final dikg dikgVar = dihoVar.g;
                            final Context context = dihoVar.c;
                            dikgVar.L(new Callable() { // from class: dika
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    eyzk eyzkVar = (eyzk) eyzl.a.createBuilder();
                                    eyzn eyznVar = (eyzn) eyzo.a.createBuilder();
                                    long millis = duration.toMillis();
                                    eyznVar.copyOnWrite();
                                    eyzo eyzoVar = (eyzo) eyznVar.instance;
                                    eyzoVar.b |= 2;
                                    eyzoVar.d = millis;
                                    long millis2 = duration2.toMillis();
                                    eyznVar.copyOnWrite();
                                    eyzo eyzoVar2 = (eyzo) eyznVar.instance;
                                    eyzoVar2.b |= 4;
                                    eyzoVar2.e = millis2;
                                    eyznVar.copyOnWrite();
                                    eyzo eyzoVar3 = (eyzo) eyznVar.instance;
                                    eyzoVar3.b |= 8;
                                    eyzoVar3.f = myPid;
                                    long millis3 = a2.toMillis();
                                    eyznVar.copyOnWrite();
                                    eyzo eyzoVar4 = (eyzo) eyznVar.instance;
                                    eyzoVar4.b |= 16;
                                    eyzoVar4.g = millis3;
                                    long millis4 = b.toMillis();
                                    eyznVar.copyOnWrite();
                                    eyzo eyzoVar5 = (eyzo) eyznVar.instance;
                                    eyzoVar5.b |= 32;
                                    eyzoVar5.h = millis4;
                                    long millis5 = c.toMillis();
                                    eyznVar.copyOnWrite();
                                    eyzo eyzoVar6 = (eyzo) eyznVar.instance;
                                    eyzoVar6.b |= 64;
                                    eyzoVar6.i = millis5;
                                    eyzkVar.copyOnWrite();
                                    eyzl eyzlVar = (eyzl) eyzkVar.instance;
                                    eyzo eyzoVar7 = (eyzo) eyznVar.build();
                                    eyzoVar7.getClass();
                                    eyzlVar.c = eyzoVar7;
                                    eyzlVar.b = 3;
                                    dikg.this.A(context, (eyzl) eyzkVar.build());
                                    return null;
                                }
                            }, new Function() { // from class: dikb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    int i = dikg.b;
                                    dkty.i((Throwable) obj, "Fail to log RCS process uptime to clearcut!", new Object[0]);
                                    return null;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                    };
                    errm errmVar = h2.d;
                    emuu.a(runnable, dizg.n(), TimeUnit.SECONDS, h2.e, errmVar);
                }
            }
        }));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Context applicationContext;
        dihn dihnVar;
        ensk h = a.h();
        h.Y(ente.a, "CarrierServices");
        ((enrr) ((enrr) h).h("com/google/android/ims/binding/SystemBindingService", "onDestroy", 85, "SystemBindingService.java")).q("SystemBindingService onDestroy");
        super.onDestroy();
        applicationContext = getApplicationContext();
        diho h2 = dipo.a(applicationContext).h();
        synchronized (h2) {
            dihnVar = h2.j;
        }
        if (dihnVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) h2.c.getSystemService("connectivity");
            if (connectivityManager == null) {
                dkty.h(diho.b, "SystemBindingMonitor received a null reference for the ConnectivityManager", new Object[0]);
            } else {
                connectivityManager.unregisterNetworkCallback(dihnVar);
            }
        }
    }
}
