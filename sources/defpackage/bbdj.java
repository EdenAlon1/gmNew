package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionWorkManagerScheduler;
import com.google.android.apps.messaging.shared.datamodel.action.execution.PendingActionReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbdj implements bbcf {
    public static final cfup b = cfvl.i(cfvl.b, "pwqSchedulingWaitsForAllActions", false);
    private static final cskc d = cskc.g("BugleAction", "ActionSchedulerImpl");
    public final ffbr c;
    private final Context e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final cqoh i;

    public bbdj(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cqoh cqohVar) {
        this.e = context;
        this.c = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = cqohVar;
    }

    private final ListenableFuture k(Action action, Action action2, int i) {
        bbcj bbcjVar;
        ListenableFuture listenableFuture = null;
        if (action2 != null && (bbcjVar = action2.v) != null && (bbcjVar.f == null || !action.fV())) {
            if (bbcjVar.c()) {
                csjb c = d.c();
                c.I("Adding");
                c.I(action.s);
                c.I("after");
                c.I(action2.s);
                c.I("for");
                c.I(bbcjVar.b);
                c.r();
            }
            listenableFuture = bbcjVar.b(action);
        }
        if (listenableFuture != null) {
            return listenableFuture;
        }
        ListenableFuture b2 = ((bbbz) this.c.b()).b(new bbcj(action.s, i, null, null, false), action);
        if (b2 != null) {
            return b2;
        }
        csjb c2 = d.c();
        c2.I(action);
        c2.I("deferred since it was started from unsafe context");
        c2.r();
        g(action, i, 1L);
        return erqt.g();
    }

    @Override // defpackage.bbcf
    public final PendingIntent a(Context context, Action action, int i, boolean z, Uri uri) {
        return PendingActionReceiver.l(context, action, i, z, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, uri, (bbdv) this.f.b());
    }

    @Override // defpackage.bbcf
    public final elfl b(final Action action) {
        if (!((Boolean) b.e()).booleanValue()) {
            return elfl.g(j(action));
        }
        final AtomicReference atomicReference = new AtomicReference();
        return elfl.g(kfg.a(new kfd() { // from class: bbdi
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final AtomicReference atomicReference2 = atomicReference;
                bbci bbciVar = new bbci() { // from class: bbdh
                    @Override // defpackage.bbci
                    public final void a() {
                        cfup cfupVar = bbdj.b;
                        AtomicReference atomicReference3 = atomicReference2;
                        boolean isCancelled = ((ListenableFuture) atomicReference3.get()).isCancelled();
                        kfb kfbVar2 = kfbVar;
                        if (isCancelled) {
                            kfbVar2.d();
                        }
                        try {
                            kfbVar2.b(erqt.q((Future) atomicReference3.get()));
                        } catch (Throwable th) {
                            kfbVar2.c(th);
                        }
                    }
                };
                Action action2 = action;
                atomicReference2.set(((bbbz) bbdj.this.c.b()).a(new bbcj(action2.s, bbcj.a(action2), bbciVar, null, true), action2));
                return "Start" + action2.c() + "FromPWQ";
            }
        }));
    }

    @Override // defpackage.bbcf
    public final ListenableFuture c(Action action, cniz cnizVar, int i) {
        if (cnizVar == null) {
            return k(action, null, i);
        }
        final SettableFuture create = SettableFuture.create();
        bbcj bbcjVar = new bbcj(action.s, i, new bbci() { // from class: bbdg
            @Override // defpackage.bbci
            public final void a() {
                cfup cfupVar = bbdj.b;
                SettableFuture.this.set(null);
            }
        }, cnizVar, true);
        bbcjVar.b = cnizVar.toString();
        ((bbbz) this.c.b()).a(bbcjVar, action);
        cnizVar.q(action.s, create);
        return create;
    }

    @Override // defpackage.bbcf
    public final ListenableFuture d(Action action) {
        return ((Boolean) b.e()).booleanValue() ? b(action) : j(action);
    }

    @Override // defpackage.bbcf
    public final ListenableFuture e(Action action) {
        return k(action, null, bbcj.a(action));
    }

    @Override // defpackage.bbcf
    public final void f(Action action, int i) {
        if (((Boolean) cful.C.e()).booleanValue()) {
            pqr.a(((ActionWorkManagerScheduler) this.h.b()).c).b(Integer.toString(i));
        }
        JobScheduler jobScheduler = (JobScheduler) ((bbcy) this.g.b()).b.getSystemService(JobScheduler.class);
        jobScheduler.getClass();
        jobScheduler.cancel(i);
        Context context = this.e;
        bbdv bbdvVar = (bbdv) this.f.b();
        if (PendingActionReceiver.l(context, action, i, false, 536870912, null, bbdvVar) != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingActionReceiver.l(context, action, i, false, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES, null, bbdvVar));
        }
    }

    @Override // defpackage.bbcf
    public final void g(final Action action, int i, long j) {
        if (j <= 0) {
            k(action, null, i);
            return;
        }
        if (((Boolean) cful.C.e()).booleanValue()) {
            ActionWorkManagerScheduler actionWorkManagerScheduler = (ActionWorkManagerScheduler) this.h.b();
            bbdv bbdvVar = (bbdv) actionWorkManagerScheduler.b.b();
            final pon ponVar = new pon();
            ponVar.e("bundle_action_name", action.getClass().getName());
            ponVar.e("bundle_action_key", action.s);
            if (((arej) bbdvVar.b.b()).a()) {
                action.t.j().flatMap(new Function() { // from class: bbdk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        PersistableBundle persistableBundle = (PersistableBundle) obj;
                        if (!ctid.d) {
                            return Optional.empty();
                        }
                        eyee eyeeVar = eyee.b;
                        eyed eyedVar = new eyed();
                        try {
                            persistableBundle.writeToStream(eyedVar);
                            return Optional.of(eyedVar.b().I());
                        } catch (IOException e) {
                            csjb e2 = bbdv.a.e();
                            e2.I("IOException serializing PersistableBundle");
                            e2.s(e);
                            return Optional.empty();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).ifPresentOrElse(new Consumer() { // from class: bbdm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        pon.this.d("persistable_bundle_action_params_serialized", (byte[]) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: bbdn
                    @Override // java.lang.Runnable
                    public final void run() {
                        pon.this.e("bundle_action_serialized_params", bbdv.e(action.t));
                    }
                });
            } else {
                ponVar.e("bundle_action_serialized_params", bbdv.e(action.t));
            }
            pot a = ponVar.a();
            long min = Math.min(j, bbcf.a);
            ppv ppvVar = new ppv(ActionWorkManagerScheduler.ActionWorker.class);
            ppvVar.h(j, TimeUnit.MILLISECONDS);
            ppvVar.f(poa.LINEAR, min, TimeUnit.MILLISECONDS);
            ppvVar.j(a);
            pqr.a(actionWorkManagerScheduler.c).g(Integer.toString(i), ppa.APPEND, (ppw) ppvVar.b());
            return;
        }
        if (!action.fV()) {
            Context context = this.e;
            ((AlarmManager) context.getSystemService("alarm")).set(2, this.i.a() + j, PendingActionReceiver.l(context, action, i, false, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES, null, (bbdv) this.f.b()));
            return;
        }
        bbcy bbcyVar = (bbcy) this.g.b();
        bbdv bbdvVar2 = (bbdv) this.f.b();
        JobScheduler jobScheduler = (JobScheduler) bbcyVar.b.getSystemService(JobScheduler.class);
        jobScheduler.getClass();
        ComponentName componentName = new ComponentName(bbcyVar.b, (Class<?>) ActionJobService.class);
        final PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("bundle_action_name", action.getClass().getName());
        persistableBundle.putString("bundle_action_key", action.s);
        persistableBundle.putString("bundle_action_serialized_params", bbdv.e(action.t));
        if (((arej) bbdvVar2.b.b()).a()) {
            action.t.j().ifPresent(new Consumer() { // from class: bbdo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    persistableBundle.putPersistableBundle("persistable_bundle_action_params", (PersistableBundle) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        try {
            if (jobScheduler.schedule(new JobInfo.Builder(i, componentName).setExtras(persistableBundle).setMinimumLatency(j).setOverrideDeadline(j + Math.min(j, bbcf.a)).build()) != 1) {
                throw new IllegalArgumentException("Invalid parameter was supplied. This can occur if the run-time for your job is too short, or perhaps the system can't resolve the requisite JobService in your package.");
            }
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder("failed to schedule job: ");
            sb.append(action.getClass().getName());
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs == null || allPendingJobs.isEmpty()) {
                bbcy.a.n("Failed to retrieve JobScheduler pending jobs. Cancelling everything");
                jobScheduler.cancelAll();
                allPendingJobs = Collections.EMPTY_LIST;
            }
            HashMap hashMap = new HashMap();
            int i2 = 0;
            for (JobInfo jobInfo : allPendingJobs) {
                Action d2 = bbdvVar2.d(jobInfo.getExtras());
                String name = d2 != null ? d2.getClass().getName() : "unknown";
                AtomicInteger atomicInteger = (AtomicInteger) hashMap.get(name);
                if (atomicInteger == null) {
                    hashMap.put(name, new AtomicInteger(1));
                } else {
                    atomicInteger.incrementAndGet();
                }
                if (d2 != null) {
                    jobScheduler.cancel(jobInfo.getId());
                    i2++;
                }
            }
            csjb b2 = bbcy.a.b();
            b2.I("Dropped");
            b2.G(i2);
            b2.I("excess jobs.");
            b2.r();
            ((akzt) bbcyVar.c.b()).g("Bugle.DataModel.Scheduler.DroppedExcessJobs.Count", i2);
            for (Map.Entry entry : hashMap.entrySet()) {
                sb.append("\n  ");
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append(((AtomicInteger) entry.getValue()).get());
            }
            bbcy.a.o(sb.toString(), e);
            throw e;
        }
    }

    @Override // defpackage.bbcf
    public final void h(Action action, Action action2) {
        k(action, action2, bbcj.a(action)).isCancelled();
    }

    @Override // defpackage.bbcf
    public final bbdf i(final Action action, long j) {
        Runnable l = eldl.l(new Runnable() { // from class: bbde
            @Override // java.lang.Runnable
            public final void run() {
                bbdj.this.j(action);
            }
        });
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(l, j);
        return new bbdf(handler, l);
    }

    final ListenableFuture j(Action action) {
        return ((bbbz) this.c.b()).a(new bbcj(action.s, bbcj.a(action), null, null, false), action);
    }
}
