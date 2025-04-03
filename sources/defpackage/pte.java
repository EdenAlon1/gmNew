package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pte extends pqs {
    public Context c;
    public pod d;
    public WorkDatabase e;
    public List f;
    public prv g;
    public qaf h;
    public boolean i = false;
    public BroadcastReceiver.PendingResult j;
    public volatile qbu k;
    public final pws l;
    public qbc m;
    private final ffsk p;
    public static final String a = ppt.d("WorkManagerImpl");
    private static pte n = null;
    private static pte o = null;
    public static final Object b = new Object();

    public pte(Context context, final pod podVar, qbc qbcVar, WorkDatabase workDatabase, final List list, prv prvVar, pws pwsVar) {
        boolean isDeviceProtectedStorage;
        Context applicationContext = context.getApplicationContext();
        isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
        if (isDeviceProtectedStorage) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        pps ppsVar = new pps(podVar.h);
        synchronized (ppt.b) {
            if (ppt.c == null) {
                ppt.c = ppsVar;
            }
        }
        this.c = applicationContext;
        this.m = qbcVar;
        this.e = workDatabase;
        this.g = prvVar;
        this.l = pwsVar;
        this.d = podVar;
        this.f = list;
        qbcVar.getClass();
        ffsd ffsdVar = qbcVar.b;
        ffsdVar.getClass();
        ffsk b2 = ffsl.b(ffsdVar);
        this.p = b2;
        final WorkDatabase workDatabase2 = this.e;
        this.h = new qaf(workDatabase2);
        prv prvVar2 = this.g;
        final qak qakVar = qbcVar.a;
        String str = psa.a;
        prvVar2.c(new prh() { // from class: pry
            @Override // defpackage.prh
            public final void a(final pxs pxsVar, boolean z) {
                String str2 = psa.a;
                final pod podVar2 = podVar;
                final List list2 = list;
                final WorkDatabase workDatabase3 = workDatabase2;
                qakVar.execute(new Runnable() { // from class: prz
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = psa.a;
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((prx) it.next()).b(pxsVar.a);
                        }
                        psa.a(podVar2, workDatabase3, list3);
                    }
                });
            }
        });
        this.m.a(new ForceStopRunnable(applicationContext, this));
        Context context2 = this.c;
        String str2 = psk.a;
        context2.getClass();
        if (qag.a(context2, podVar)) {
            pzg pzgVar = (pzg) workDatabase.D();
            final pyx pyxVar = new pyx(pzgVar, otj.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0));
            ffji ffjiVar = new ffji() { // from class: oro
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((ouz) obj).getClass();
                    return ((pyx) pyxVar).call();
                }
            };
            otb otbVar = pzgVar.a;
            osg b3 = otbVar.b();
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            strArr.getClass();
            ffcf f = b3.b.f(strArr);
            String[] strArr2 = (String[]) f.a;
            int[] iArr = (int[]) f.b;
            our ourVar = b3.b;
            strArr2.getClass();
            iArr.getClass();
            fgcp fgcpVar = new fgcp(new ouh(ourVar, iArr, strArr2, null));
            osi osiVar = b3.h;
            ffyk.d(new fgbt(ffyy.a(ffyo.a(new ffzp(new oux(ffyo.a(fgcpVar), otbVar, ffjiVar), new psi(null)))), new psj(context2, null)), b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pte m(Context context) {
        pte pteVar;
        Object obj = b;
        synchronized (obj) {
            synchronized (obj) {
                pteVar = n;
                if (pteVar == null) {
                    pteVar = o;
                }
            }
            return pteVar;
        }
        if (pteVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof poc)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            n(applicationContext, ((poc) applicationContext).a());
            pteVar = m(applicationContext);
        }
        return pteVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r3 = r13.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (defpackage.pte.o != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r3.getClass();
        r5 = new defpackage.qbc(r14.c);
        r13 = r3.getApplicationContext();
        r13.getClass();
        r0 = r5.a;
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r3.getResources().getBoolean(com.google.android.apps.messaging.R.bool.workmanager_test_configuration) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r6 = new defpackage.osy(r13, androidx.work.impl.WorkDatabase.class, null);
        r6.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r6.e(r0);
        r6.a.add(new defpackage.prf());
        r6.b(defpackage.prm.c);
        r6.b(new defpackage.prw(r13, 2, 3));
        r6.b(defpackage.prn.c);
        r6.b(defpackage.pro.c);
        r6.b(new defpackage.prw(r13, 5, 6));
        r6.b(defpackage.prp.c);
        r6.b(defpackage.prq.c);
        r6.b(defpackage.prr.c);
        r6.b(new defpackage.pth(r13));
        r6.b(new defpackage.prw(r13, 10, 11));
        r6.b(defpackage.pri.c);
        r6.b(defpackage.prj.c);
        r6.b(defpackage.prk.c);
        r6.b(defpackage.prl.c);
        r6.b(new defpackage.prw(r13, 21, 22));
        r6.f = false;
        r6.g = true;
        r6 = (androidx.work.impl.WorkDatabase) r6.a();
        r8 = r3.getApplicationContext();
        r8.getClass();
        r13 = r8.getApplicationContext();
        r13.getClass();
        r9 = new defpackage.pwd(r13, r5);
        r13 = r8.getApplicationContext();
        r13.getClass();
        r10 = new defpackage.pwf(r13, r5);
        r13 = r8.getApplicationContext();
        r13.getClass();
        r0 = defpackage.pwp.a;
        r11 = new defpackage.pwo(r13, r5);
        r13 = r8.getApplicationContext();
        r13.getClass();
        r7 = new defpackage.pws(r8, r9, r10, r11, new defpackage.pwq(r13, r5));
        r8 = new defpackage.prv(r3.getApplicationContext(), r14, r5, r6);
        r2 = defpackage.ptf.a;
        r6.getClass();
        defpackage.pte.o = new defpackage.pte(r3.getApplicationContext(), r14, r5, r6, r2.a(r3, r14, r5, r6, r7, r8), r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r6 = defpackage.osq.a(r13, androidx.work.impl.WorkDatabase.class, "androidx.work.workdb");
        r6.c = new defpackage.psn(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x017a, code lost:
    
        defpackage.pte.n = defpackage.pte.o;
     */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(android.content.Context r13, defpackage.pod r14) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pte.n(android.content.Context, pod):void");
    }

    @Override // defpackage.pqs
    public final pqb a(String str) {
        str.getClass();
        pof pofVar = this.d.m;
        qak qakVar = this.m.a;
        qakVar.getClass();
        return pqf.a(pofVar, "CancelWorkByTag_".concat(str), qakVar, new pzt(this, str));
    }

    @Override // defpackage.pqs
    public final pqb b(String str) {
        str.getClass();
        pof pofVar = this.d.m;
        qak qakVar = this.m.a;
        qakVar.getClass();
        return pqf.a(pofVar, "CancelWorkByName_".concat(str), qakVar, new pzr(str, this));
    }

    @Override // defpackage.pqs
    public final pqb c(UUID uuid) {
        return pzu.a(uuid, this);
    }

    @Override // defpackage.pqs
    public final pqb e(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new psm(this, null, ppa.KEEP, list, null).a();
    }

    @Override // defpackage.pqs
    public final pqb f(String str, poz pozVar, pqi pqiVar) {
        if (pozVar != poz.UPDATE) {
            return new psm(this, str, pozVar == poz.KEEP ? ppa.KEEP : ppa.REPLACE, Collections.singletonList(pqiVar)).a();
        }
        pof pofVar = this.d.m;
        qak qakVar = this.m.a;
        qakVar.getClass();
        return pqf.a(pofVar, "enqueueUniquePeriodic_".concat(str), qakVar, new ptl(this, str, pqiVar));
    }

    @Override // defpackage.pqs
    public final pqb h(String str, ppa ppaVar, List list) {
        return new psm(this, str, ppaVar, list).a();
    }

    @Override // defpackage.pqs
    public final pqb i() {
        WorkDatabase workDatabase = this.e;
        pod podVar = this.d;
        qbc qbcVar = this.m;
        workDatabase.getClass();
        podVar.getClass();
        qbcVar.getClass();
        qak qakVar = qbcVar.a;
        qakVar.getClass();
        return pqf.a(podVar.m, "PruneWork", qakVar, new qah(workDatabase));
    }

    @Override // defpackage.pqs
    public final pql k(String str, ppa ppaVar, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new psm(this, str, ppaVar, list);
    }

    @Override // defpackage.pqs
    public final ListenableFuture l(pqt pqtVar) {
        WorkDatabase workDatabase = this.e;
        qbc qbcVar = this.m;
        workDatabase.getClass();
        qbcVar.getClass();
        return qap.a(workDatabase, qbcVar, new qan(pqtVar));
    }

    public final void o() {
        synchronized (b) {
            this.i = true;
            BroadcastReceiver.PendingResult pendingResult = this.j;
            if (pendingResult != null) {
                pendingResult.finish();
                this.j = null;
            }
        }
    }

    public final void p() {
        pof pofVar = this.d.m;
        ffix ffixVar = new ffix() { // from class: ptd
            @Override // defpackage.ffix
            public final Object invoke() {
                pte pteVar = pte.this;
                Context context = pteVar.c;
                String str = pux.a;
                if (Build.VERSION.SDK_INT >= 34) {
                    puv.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List e = pux.e(context, jobScheduler);
                if (e != null && !e.isEmpty()) {
                    Iterator it = e.iterator();
                    while (it.hasNext()) {
                        pux.f(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                pyk D = pteVar.e.D();
                pzg pzgVar = (pzg) D;
                pzgVar.a.m();
                oyf d = pzgVar.h.d();
                try {
                    ((pzg) D).a.n();
                    try {
                        d.a();
                        ((pzg) D).a.q();
                        pzgVar.h.f(d);
                        psa.a(pteVar.d, pteVar.e, pteVar.f);
                        return ffcu.a;
                    } finally {
                        ((pzg) D).a.o();
                    }
                } catch (Throwable th) {
                    pzgVar.h.f(d);
                    throw th;
                }
            }
        };
        boolean c = ozg.c();
        if (c) {
            try {
                ozg.a("ReschedulingWork");
            } catch (Throwable th) {
                if (c) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        ffixVar.invoke();
        if (c) {
            Trace.endSection();
        }
    }

    public final void q(pxs pxsVar, int i) {
        this.m.a(new qaq(this.g, new psb(pxsVar), true, i));
    }
}
