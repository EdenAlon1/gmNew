package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlao implements dlcl {
    public final pqs a;
    private final enru b;

    public dlao(Context context, Optional optional) {
        context.getClass();
        optional.isPresent();
        this.a = pqr.a(context);
        this.b = enru.c("com/google/android/libraries/abuse/hades/moirai/download/DefaultWorkManagerWrapper");
    }

    @Override // defpackage.dlcl
    public final Object a(String str, ppw ppwVar, ppa ppaVar, boolean z, ffgu ffguVar) {
        ((enrr) this.b.h().h("com/google/android/libraries/abuse/hades/moirai/download/DefaultWorkManagerWrapper", "beginUniqueWork", 62, "WorkManagerWrapper.kt")).t("PersephoneDownloadWorker is scheduled for request %s.", ppwVar.a);
        pql j = this.a.j(str, ppaVar, ppwVar);
        j.a();
        if (z) {
            psm psmVar = (psm) j;
            pte pteVar = psmVar.a;
            pyk D = pteVar.e.D();
            List list = psmVar.f;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
            int size = list.size();
            owh.a(sb, size);
            sb.append(")");
            otj a = otj.a(sb.toString(), size);
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                a.g(i, (String) it.next());
                i++;
            }
            pzg pzgVar = (pzg) D;
            osg b = pzgVar.a.b();
            String[] strArr = {"WorkTag", "WorkProgress", "workspec"};
            pyv pyvVar = new pyv(pzgVar, a);
            b.b.f(strArr);
            orx orxVar = b.g;
            osr osrVar = new osr(orxVar.a, orxVar, strArr, pyvVar);
            afd afdVar = pyj.b;
            qbc qbcVar = pteVar.m;
            Object obj = new Object();
            llf llfVar = new llf();
            llfVar.p(osrVar, new qac(qbcVar, obj, afdVar, llfVar));
            Object a2 = ffsl.a(new dlcp(llfVar, new dlan(null), null), ffguVar);
            if (a2 == ffhh.a) {
                return a2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.dlcl
    public final Object b(String str) {
        this.a.b(str);
        return ffcu.a;
    }
}
