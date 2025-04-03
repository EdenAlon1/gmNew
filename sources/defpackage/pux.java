package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pux implements prx {
    public static final String a = ppt.d("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final puw d;
    private final WorkDatabase e;
    private final pod f;

    public pux(Context context, WorkDatabase workDatabase, pod podVar) {
        JobScheduler a2 = puv.a(context);
        puw puwVar = new puw(context);
        this.b = context;
        this.c = a2;
        this.d = puwVar;
        this.e = workDatabase;
        this.f = podVar;
    }

    public static pxs a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new pxs(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b = puv.b(jobScheduler);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ppt.c();
            Log.e(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.prx
    public final void b(String str) {
        ArrayList arrayList;
        List<JobInfo> e = e(this.b, this.c);
        if (e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : e) {
                pxs a2 = a(jobInfo);
                if (a2 != null && str.equals(a2.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(this.c, ((Integer) it.next()).intValue());
        }
        pxm A = this.e.A();
        pxq pxqVar = (pxq) A;
        pxqVar.a.m();
        oyf d = pxqVar.c.d();
        d.g(1, str);
        try {
            ((pxq) A).a.n();
            try {
                d.a();
                ((pxq) A).a.q();
            } finally {
                ((pxq) A).a.o();
            }
        } finally {
            pxqVar.c.f(d);
        }
    }

    @Override // defpackage.prx
    public final void c(pyj... pyjVarArr) {
        int intValue;
        WorkDatabase workDatabase;
        final pzz pzzVar = new pzz(this.e);
        for (pyj pyjVar : pyjVarArr) {
            this.e.n();
            try {
                pyj b = this.e.D().b(pyjVar.c);
                if (b == null) {
                    ppt.c();
                    Log.w(a, "Skipping scheduling " + pyjVar.c + " because it's no longer in the DB");
                    this.e.q();
                    workDatabase = this.e;
                } else if (b.d != pqp.ENQUEUED) {
                    ppt.c();
                    Log.w(a, "Skipping scheduling " + pyjVar.c + " because it is no longer enqueued");
                    this.e.q();
                    workDatabase = this.e;
                } else {
                    pxs a2 = pzh.a(pyjVar);
                    pxk a3 = pxl.a(this.e.A(), a2);
                    if (a3 != null) {
                        intValue = a3.c;
                    } else {
                        pod podVar = this.f;
                        final int i = podVar.i;
                        final int i2 = podVar.j;
                        Object f = pzzVar.a.f(new Callable() { // from class: pzy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                pzz pzzVar2 = pzz.this;
                                WorkDatabase workDatabase2 = pzzVar2.a;
                                int i3 = i;
                                int a4 = qaa.a(workDatabase2, "next_job_scheduler_id");
                                if (i3 > a4 || a4 > i2) {
                                    qaa.b(pzzVar2.a, "next_job_scheduler_id", i3 + 1);
                                } else {
                                    i3 = a4;
                                }
                                return Integer.valueOf(i3);
                            }
                        });
                        f.getClass();
                        intValue = ((Number) f).intValue();
                    }
                    if (a3 == null) {
                        this.e.A().a(pxr.a(a2, intValue));
                    }
                    g(pyjVar, intValue);
                    this.e.q();
                    workDatabase = this.e;
                }
                workDatabase.o();
            } catch (Throwable th) {
                this.e.o();
                throw th;
            }
        }
    }

    @Override // defpackage.prx
    public final boolean d() {
        return true;
    }

    public final void g(pyj pyjVar, int i) {
        int i2;
        String str;
        poj pojVar = pyjVar.l;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pyjVar.c);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pyjVar.v);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pyjVar.f());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.d.b).setRequiresCharging(pojVar.c).setRequiresDeviceIdle(pojVar.d).setExtras(persistableBundle);
        NetworkRequest a2 = pojVar.a();
        if (Build.VERSION.SDK_INT < 28 || a2 == null) {
            int i3 = pojVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        i2 = 2;
                        if (i4 != 2) {
                            i2 = 3;
                            if (i4 != 3) {
                                i2 = 4;
                                if (i4 != 4) {
                                    ppt c = ppt.c();
                                    String str2 = puw.a;
                                    Objects.toString(ppu.a(i3));
                                    c.a(str2, "API version too low. Cannot convert network type value ".concat(ppu.a(i3)));
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(a2);
        }
        if (!pojVar.d) {
            extras.setBackoffCriteria(pyjVar.o, pyjVar.n == poa.LINEAR ? 0 : 1);
        }
        long max = Math.max(pyjVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pyjVar.s) {
            extras.setImportantWhileForeground(true);
        }
        if (pojVar.b()) {
            for (poi poiVar : pojVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(poiVar.a, poiVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(pojVar.g);
            extras.setTriggerContentMaxDelay(pojVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(pojVar.e);
        extras.setRequiresStorageNotLow(pojVar.f);
        int i5 = pyjVar.m;
        if (Build.VERSION.SDK_INT >= 31 && pyjVar.s && i5 <= 0 && max <= 0) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = pyjVar.z) != null) {
            extras.setTraceTag(str);
        }
        JobInfo build = extras.build();
        ppt c2 = ppt.c();
        String str3 = a;
        c2.a(str3, "Scheduling work ID " + pyjVar.c + "Job ID " + i);
        try {
            if (this.c.schedule(build) == 0) {
                ppt.c();
                Log.w(str3, "Unable to schedule work ID " + pyjVar.c);
                if (pyjVar.s && pyjVar.t == pqg.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pyjVar.s = false;
                    ppt.c().a(str3, String.format("Scheduling a non-expedited job (work ID %s)", pyjVar.c));
                    g(pyjVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.b;
            WorkDatabase workDatabase = this.e;
            int i6 = puv.a;
            int size = workDatabase.D().d().size();
            String str4 = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler a3 = puv.a(context);
                List b = puv.b(a3);
                if (b != null) {
                    List e2 = e(context, a3);
                    int size2 = e2 != null ? b.size() - e2.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List e3 = e(context, (JobScheduler) systemService);
                    int size3 = e3 != null ? e3.size() : 0;
                    str4 = ffdx.aA(ffdo.J(new String[]{b.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                List e4 = e(context, puv.a(context));
                if (e4 != null) {
                    str4 = e4.size() + " jobs from WorkManager";
                }
            }
            String str6 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + str4 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            ppt.c();
            Log.e(a, str6);
            throw new IllegalStateException(str6, e);
        } catch (Throwable th) {
            ppt.c();
            String str7 = a;
            Objects.toString(pyjVar);
            Log.e(str7, "Unable to schedule ".concat(String.valueOf(pyjVar)), th);
        }
    }
}
