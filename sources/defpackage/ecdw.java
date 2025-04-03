package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecdw implements ecdq {
    private final Context a;
    private final Executor b;

    public ecdw(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public static /* synthetic */ dhre d(ecdw ecdwVar, String str, String str2, int i, dhqh dhqhVar) {
        dguc dgucVar = new dguc();
        dgucVar.b(str);
        dgucVar.d(str2);
        dgucVar.c(i);
        return dgvz.c(ecdwVar.a, ecdwVar.b, dgucVar.a()).c(ecdwVar.b, dhqhVar);
    }

    static /* synthetic */ fivj h(eyee eyeeVar, eyee eyeeVar2) {
        fivi fiviVar = (fivi) fivj.a.createBuilder();
        fivn fivnVar = (fivn) fivp.a.createBuilder();
        fivk fivkVar = (fivk) fivm.a.createBuilder();
        fivg fivgVar = (fivg) fivh.a.createBuilder();
        fivgVar.a(eyeeVar2);
        fivh fivhVar = (fivh) fivgVar.build();
        fivkVar.copyOnWrite();
        fivm fivmVar = (fivm) fivkVar.instance;
        fivhVar.getClass();
        fivmVar.c = fivhVar;
        fivmVar.b = 1;
        fivnVar.a("token", (fivm) fivkVar.build());
        fivk fivkVar2 = (fivk) fivm.a.createBuilder();
        fivg fivgVar2 = (fivg) fivh.a.createBuilder();
        fivgVar2.a(eyeeVar);
        fivh fivhVar2 = (fivh) fivgVar2.build();
        fivkVar2.copyOnWrite();
        fivm fivmVar2 = (fivm) fivkVar2.instance;
        fivhVar2.getClass();
        fivmVar2.c = fivhVar2;
        fivmVar2.b = 1;
        fivnVar.a("application_package", (fivm) fivkVar2.build());
        fivp fivpVar = (fivp) fivnVar.build();
        fiviVar.copyOnWrite();
        fivj fivjVar = (fivj) fiviVar.instance;
        fivpVar.getClass();
        fivjVar.c = fivpVar;
        fivjVar.b |= 1;
        return (fivj) fiviVar.build();
    }

    private final void i(final String str, final dhqh dhqhVar) {
        final int intValue = eukl.a(str).intValue();
        erqt.m(new Callable() { // from class: ecdt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ecdw.d(ecdw.this, str, str, intValue, dhqhVar);
            }
        }, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (r3.schedule(r0) == 1) goto L15;
     */
    @Override // defpackage.ecdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(final java.lang.String r10, java.util.List<defpackage.eyee> r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.a
            java.lang.String r0 = r0.getPackageName()
            eyee r0 = defpackage.eyee.A(r0)
            android.content.Context r1 = r9.a
            dgur r1 = defpackage.ecdz.a(r1)
            ecdr r2 = new ecdr
            r2.<init>()
            java.util.List r11 = defpackage.enkr.g(r11, r2)
            dgup r0 = new dgup
            r0.<init>()
            java.util.List r11 = defpackage.enkr.g(r11, r0)
            defpackage.dgur.a(r10)
            android.content.Context r0 = r1.a
            java.lang.Class r2 = r1.d
            long r3 = defpackage.dgui.a
            r3 = 3
            java.lang.String r4 = "ExampleStrDataTtlSvc"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L39
            java.lang.String r3 = "maybeScheduleExampleDataTtl"
            android.util.Log.d(r4, r3)
        L39:
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            if (r3 == 0) goto L9f
            r5 = 216934020(0xcee2684, float:3.6692887E-31)
            android.app.job.JobInfo r6 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r3, r5)
            android.content.ComponentName r7 = new android.content.ComponentName
            r7.<init>(r0, r2)
            android.app.job.JobInfo$Builder r0 = new android.app.job.JobInfo$Builder
            r0.<init>(r5, r7)
            r2 = 1
            android.app.job.JobInfo$Builder r0 = r0.setPersisted(r2)
            android.app.job.JobInfo$Builder r0 = r0.setRequiresCharging(r2)
            long r7 = defpackage.dgui.a
            android.app.job.JobInfo$Builder r0 = r0.setPeriodic(r7)
            android.app.job.JobInfo r0 = r0.build()
            if (r6 == 0) goto L7d
            boolean r5 = r6.isRequireCharging()
            boolean r7 = r0.isRequireCharging()
            if (r5 != r7) goto L7d
            long r5 = r6.getIntervalMillis()
            long r7 = defpackage.dgui.a
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
        L7d:
            int r0 = r3.schedule(r0)     // Catch: java.lang.IllegalArgumentException -> L99
            if (r0 != r2) goto L9f
        L83:
            dguw r0 = r1.b
            dguo r1 = new dguo
            r1.<init>()
            com.google.common.util.concurrent.ListenableFuture r10 = r0.a(r1)
            ecdv r11 = new ecdv
            r11.<init>()
            java.util.concurrent.Executor r0 = r9.b
            defpackage.erqt.r(r10, r11, r0)
            return
        L99:
            r10 = move-exception
            java.lang.String r11 = "Buggy schedule() implementation!"
            android.util.Log.e(r4, r11, r10)
        L9f:
            dguq r10 = new dguq
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecdw.a(java.lang.String, java.util.List):void");
    }

    @Override // defpackage.ecdq
    public void b(String str) {
        i(str, new dhqh() { // from class: ecds
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                dhre a;
                a = ((dgub) dhreVar.i()).a();
                return a;
            }
        });
    }

    @Override // defpackage.ecdq
    public void c(String str) {
        i(str, new dhqh() { // from class: ecdu
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                dhre b;
                b = ((dgub) dhreVar.i()).b();
                return b;
            }
        });
    }
}
