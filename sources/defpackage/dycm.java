package defpackage;

import android.content.Context;
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycm implements dwxk {
    private final Context a;
    private final effy b;

    public dycm(Context context, effy effyVar) {
        this.a = context.getApplicationContext();
        this.b = effyVar;
    }

    @Override // defpackage.dwxk
    public final void a(final String str, final long j, final int i, final emxc emxcVar) {
        dxth.d("%s: Scheduling periodic tasks for MDD lib %s %d", "WorkManagerTaskScheduler", str, Long.valueOf(j));
        elfr.l(this.b.b(new emwl() { // from class: dyck
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dycj dycjVar = (dycj) obj;
                eyhm eyhmVar = dycjVar.b;
                String str2 = str;
                long longValue = eyhmVar.containsKey(str2) ? ((Long) eyhmVar.get(str2)).longValue() : -1L;
                emxc emxcVar2 = emxcVar;
                int i2 = i;
                long j2 = j;
                long j3 = longValue;
                dycm dycmVar = dycm.this;
                boolean z = j2 != j3;
                dycmVar.b(str2, j2, i2, z, emxcVar2);
                if (!z) {
                    return dycjVar;
                }
                dych dychVar = (dych) dycjVar.toBuilder();
                dychVar.copyOnWrite();
                ((dycj) dychVar.instance).a().remove(str2);
                dychVar.copyOnWrite();
                ((dycj) dychVar.instance).a().put(str2, Long.valueOf(j2));
                return (dycj) dychVar.build();
            }
        }, erpp.a), new dycl(this, str, j, i, emxcVar), erpp.a);
    }

    public final void b(String str, long j, int i, boolean z, emxc emxcVar) {
        pon ponVar = new pon();
        ponVar.e("MDD_TASK_TAG_KEY", str);
        ponVar.h("MDD_TASK_PERIOD_HOURS_KEY", j / 3600);
        ponVar.e("MDD_TASK_NETWORK_STATE_KEY", dwxj.a(i));
        ponVar.f("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY", ((Boolean) emxcVar.b(new emwl() { // from class: dycn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dwxi) obj).a());
            }
        }).e(false)).booleanValue());
        int i2 = 1;
        ponVar.f("MDD_TASK_REQUIRES_CHARGING_KEY", ((Boolean) emxcVar.b(new emwl() { // from class: dyco
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dwxi) obj).b());
            }
        }).e(true)).booleanValue());
        ponVar.f("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY", ((Boolean) emxcVar.b(new emwl() { // from class: dycp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dwxi) obj).c());
            }
        }).e(true)).booleanValue());
        pot a = ponVar.a();
        pqh pqhVar = new pqh(PeriodicWorker.class, j, TimeUnit.SECONDS);
        pqhVar.d(str);
        poh pohVar = new poh();
        pohVar.b = emxcVar.g() ? ((dwxi) emxcVar.c()).c() : true;
        pohVar.a = emxcVar.g() ? ((dwxi) emxcVar.c()).b() : true;
        pohVar.c = emxcVar.g() ? ((dwxi) emxcVar.c()).a() : false;
        int i3 = i - 1;
        if (i3 == 0) {
            i2 = 2;
        } else if (i3 != 2) {
            i2 = 3;
        }
        pohVar.c(i2);
        pqhVar.g(pohVar.a());
        pqhVar.j(a);
        pqhVar.k(str);
        pqr.a(this.a).f(str, z ? poz.UPDATE : poz.KEEP, (pqi) pqhVar.b());
    }
}
