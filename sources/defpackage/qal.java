package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qal extends ffkk implements ffji {
    public qal() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        WorkDatabase workDatabase = (WorkDatabase) obj;
        workDatabase.getClass();
        afd afdVar = pyj.b;
        pyk D = workDatabase.D();
        otj a = otj.a("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        a.g(1, "com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim");
        pzg pzgVar = (pzg) D;
        pzgVar.a.m();
        pzgVar.a.n();
        try {
            Cursor a2 = ovn.a(((pzg) D).a, a, true);
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (a2.moveToNext()) {
                    String string = a2.getString(0);
                    if (!hashMap.containsKey(string)) {
                        hashMap.put(string, new ArrayList());
                    }
                    String string2 = a2.getString(0);
                    if (!hashMap2.containsKey(string2)) {
                        hashMap2.put(string2, new ArrayList());
                    }
                }
                a2.moveToPosition(-1);
                ((pzg) D).o(hashMap);
                ((pzg) D).n(hashMap2);
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string3 = a2.getString(0);
                    pqp f = pzn.f(a2.getInt(1));
                    pot c = pot.c(a2.getBlob(2));
                    int i = a2.getInt(3);
                    int i2 = a2.getInt(4);
                    arrayList.add(new pyi(string3, f, c, a2.getLong(14), a2.getLong(15), a2.getLong(16), new poj(pzn.g(a2.getBlob(6)), pzn.l(a2.getInt(5)), a2.getInt(7) != 0, a2.getInt(8) != 0, a2.getInt(9) != 0, a2.getInt(10) != 0, a2.getLong(11), a2.getLong(12), pzn.h(a2.getBlob(13))), i, pzn.d(a2.getInt(17)), a2.getLong(18), a2.getLong(19), a2.getInt(20), i2, a2.getLong(21), a2.getInt(22), (ArrayList) hashMap.get(a2.getString(0)), (ArrayList) hashMap2.get(a2.getString(0))));
                }
                ((pzg) D).a.q();
                pzgVar.a.o();
                Object a3 = afdVar.a(arrayList);
                a3.getClass();
                return a3;
            } finally {
                a2.close();
                a.j();
            }
        } catch (Throwable th) {
            pzgVar.a.o();
            throw th;
        }
    }
}
