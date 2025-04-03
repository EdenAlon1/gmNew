package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.albq;
import defpackage.atkz;
import defpackage.bbbz;
import defpackage.bbch;
import defpackage.bbci;
import defpackage.bbcj;
import defpackage.bbcw;
import defpackage.bbdc;
import defpackage.bbdd;
import defpackage.bbdv;
import defpackage.bbdz;
import defpackage.bbef;
import defpackage.cful;
import defpackage.cfuu;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.cmh;
import defpackage.csix;
import defpackage.csjb;
import defpackage.csjg;
import defpackage.cskc;
import defpackage.csly;
import defpackage.ecda;
import defpackage.ecrh;
import defpackage.ecrj;
import defpackage.enrr;
import defpackage.ensk;
import defpackage.ente;
import defpackage.errl;
import defpackage.ersb;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ActionExecutorImpl implements bbbz, bbch, bbdd {
    public static final cfva a = cfvl.c(cfvl.b, "action_runnable_primes_timer_ratio", 1.0d);
    public static final cskc b = cskc.g("BugleDataModel", "ActionExecutorImpl");
    public final Context c;
    public final albq d;
    public final ecrj e;
    public final errl f;
    public final errl g;
    public final ffbr h;
    public final Queue i;
    public final csjg j;
    public final csjg k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final Map o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final Runnable r;
    public final bbef s;
    private final Intent t;
    private final csly u;
    private boolean v;

    /* compiled from: PG */
    public static final class EmptyService extends Service {
        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public final void onDestroy() {
            ActionExecutorImpl.b.m("ActionExecutor Empty Service destroyed.");
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            ActionExecutorImpl.b.m("ActionExecutor Empty Service started.");
            return super.onStartCommand(intent, i, i2);
        }
    }

    public ActionExecutorImpl(Context context, albq albqVar, cfuu cfuuVar, ecrj ecrjVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, bbef bbefVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        csly cslyVar = new csly();
        final PriorityQueue priorityQueue = new PriorityQueue(11, new bbcw());
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.v = false;
        cfuuVar.a();
        this.c = context;
        this.d = albqVar;
        this.t = new Intent(context, (Class<?>) EmptyService.class);
        this.u = cslyVar;
        this.e = ecrjVar;
        this.i = priorityQueue;
        this.f = errlVar2;
        this.g = errlVar;
        this.o = new cmh();
        this.r = new Runnable() { // from class: bbcu
            @Override // java.lang.Runnable
            public final void run() {
                bbdc bbdcVar;
                Queue queue = priorityQueue;
                synchronized (ActionExecutorImpl.this.o) {
                    bbdcVar = (bbdc) queue.poll();
                }
                bbdcVar.getClass();
                bbdcVar.run();
            }
        };
        ersb ersbVar = new ersb(errlVar);
        ersb ersbVar2 = new ersb(errlVar);
        this.j = new csjg(ersbVar);
        this.k = new csjg(ersbVar2);
        this.l = ffbrVar;
        this.m = ffbrVar2;
        this.s = bbefVar;
        this.n = ffbrVar3;
        this.h = ffbrVar4;
    }

    private final ListenableFuture j(bbcj bbcjVar, Action action, boolean z, boolean z2) {
        synchronized (this.o) {
            boolean z3 = true;
            if (!this.v) {
                try {
                    b.m("Starting ActionService");
                    this.c.startService(this.t);
                    this.v = true;
                    csly cslyVar = this.u;
                    Context context = this.c;
                    Intent intent = this.t;
                    synchronized (cslyVar.b) {
                        if (cslyVar.e == null) {
                            cslyVar.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, cslyVar.c);
                        }
                    }
                    cslyVar.e.acquire();
                    intent.putExtra("pid", cslyVar.d);
                } catch (IllegalStateException e) {
                    z3 = false;
                    if (z2) {
                        csjb e2 = b.e();
                        e2.I("Action started execution, but we can't guarantee it will complete, the app may be killed.");
                        e2.A("Action", action);
                        e2.s(e);
                    }
                }
            }
            if (z && !z3) {
                return null;
            }
            this.o.put(Integer.valueOf(bbcjVar.a), bbcjVar);
            bbcjVar.e = this;
            return bbcjVar.b(action);
        }
    }

    @Override // defpackage.bbbz
    public final ListenableFuture a(bbcj bbcjVar, Action action) {
        ListenableFuture j = j(bbcjVar, action, false, !bbcjVar.g);
        j.getClass();
        return j;
    }

    @Override // defpackage.bbbz
    public final ListenableFuture b(bbcj bbcjVar, Action action) {
        return j(bbcjVar, action, true, false);
    }

    @Override // defpackage.bbbz
    public final void c(int i) {
        synchronized (this.o) {
            if (((bbcj) this.o.get(Integer.valueOf(i))) == null) {
                csjb e = b.e();
                e.I("Tried to cancel job");
                e.G(i);
                e.I("that can't be found. already finished?");
                e.r();
            }
        }
    }

    @Override // defpackage.bbdd
    public final void d(String str, Action action) {
        csjb c = b.c();
        c.I(str);
        c.v(action.getClass().getSimpleName());
        c.r();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [bbch, bbdd] */
    @Override // defpackage.bbdd
    public final void e(Action action, bbcj bbcjVar) {
        bbci bbciVar;
        List<Action> list = action.u;
        action.u = new ArrayList();
        bbcj bbcjVar2 = action.v;
        if (bbcjVar2 == null || (bbcjVar2.c() && ((Boolean) cful.B.e()).booleanValue())) {
            bbef bbefVar = this.s;
            ArrayList arrayList = new ArrayList(list);
            bbdv bbdvVar = (bbdv) bbefVar.a.b();
            bbdvVar.getClass();
            new DeferBackgroundWorkAction(bbdvVar, arrayList).y(127, 0L);
        } else {
            for (Action action2 : list) {
                if (bbcjVar2.c()) {
                    csjb a2 = b.a();
                    a2.I("Adding");
                    a2.I(action2.s);
                    a2.I("background work for");
                    a2.I(bbcjVar2.b);
                    a2.r();
                }
                bbcjVar2.d.add(action2);
                action2.z(bbcjVar2);
                csix.l(bbcjVar2.e);
                ?? r5 = bbcjVar2.e;
                if (r5 != 0) {
                    ActionExecutorImpl actionExecutorImpl = (ActionExecutorImpl) r5;
                    bbdz bbdzVar = new bbdz(bbcjVar2, action2, r5, ((atkz) actionExecutorImpl.h.b()).a() ? actionExecutorImpl.g : actionExecutorImpl.f, actionExecutorImpl.l, actionExecutorImpl.m, actionExecutorImpl.n);
                    bbdzVar.c(actionExecutorImpl.d.a("Bugle.DataModel.ActionBreakdown.BackgroundQueue.Latency", action2.w, action2.s));
                    synchronized (actionExecutorImpl.o) {
                        ((ActionExecutorImpl) r5).k.a(bbdzVar);
                    }
                    actionExecutorImpl.d("ACTION_BACKGROUND_QUEUED_", action2);
                }
            }
        }
        this.q.decrementAndGet();
        bbcjVar.d.remove(action);
        if (bbcjVar.d.isEmpty() && (bbciVar = bbcjVar.c) != null) {
            bbciVar.a();
        }
        if (bbcjVar.d.isEmpty()) {
            synchronized (this.o) {
                this.o.remove(Integer.valueOf(bbcjVar.a));
                if (this.o.isEmpty() && this.v) {
                    csly cslyVar = this.u;
                    Intent intent = this.t;
                    if (cslyVar.d == intent.getIntExtra("pid", -1)) {
                        try {
                            cslyVar.e.release();
                        } catch (RuntimeException unused) {
                            ensk i = csly.a.i();
                            i.Y(ente.a, "BugleDataModel");
                            enrr enrrVar = (enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/util/common/WakeLockHelper", "release", 96, "WakeLockHelper.java");
                            String action3 = intent.getAction();
                            PowerManager.WakeLock wakeLock = cslyVar.e;
                            enrrVar.L("KeepAliveService.onHandleIntent exit crash %s %s opcode: %d wakeLock: %s isHeld: %s", intent, action3, 0, wakeLock, wakeLock == null ? "(null)" : Boolean.valueOf(wakeLock.isHeld()));
                            if (!Debug.isDebuggerConnected()) {
                                csix.c("WakeLock no longer held at end of handler");
                            }
                        }
                    }
                    b.m("Stopping ActionService");
                    this.c.stopService(this.t);
                    this.v = false;
                }
            }
        }
        i();
    }

    @Override // defpackage.bbdd
    public final void f(bbdc bbdcVar, String str) {
        i();
        this.q.incrementAndGet();
        Action action = bbdcVar.f;
        bbdcVar.c(this.d.a(str, action.w, action.s));
        synchronized (this.o) {
            this.i.add(bbdcVar);
            this.j.a(this.r);
        }
    }

    @Override // defpackage.bbdd
    public final void g(Optional optional, final ecda ecdaVar, final ecrh ecrhVar) {
        optional.ifPresent(new Consumer() { // from class: bbcv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ActionExecutorImpl.this.e.f((ecri) obj, ecdaVar, null, ecrhVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.bbdd
    public final void h(String str, String str2) {
        this.d.p(str, str2);
    }

    public final void i() {
        this.q.get();
    }
}
