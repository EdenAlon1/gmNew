package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.otj;
import defpackage.ovm;
import defpackage.ovn;
import defpackage.poa;
import defpackage.poj;
import defpackage.pot;
import defpackage.ppp;
import defpackage.ppq;
import defpackage.ppt;
import defpackage.pqg;
import defpackage.pqk;
import defpackage.pqp;
import defpackage.pte;
import defpackage.pxm;
import defpackage.pxu;
import defpackage.pyj;
import defpackage.pyk;
import defpackage.pzg;
import defpackage.pzj;
import defpackage.pzn;
import defpackage.qad;
import defpackage.qbq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final ppq c() {
        otj otjVar;
        int b;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        pxm pxmVar;
        pxu pxuVar;
        pzj pzjVar;
        pte m = pte.m(this.a);
        WorkDatabase workDatabase = m.e;
        workDatabase.getClass();
        pyk D = workDatabase.D();
        pxu B = workDatabase.B();
        pzj E = workDatabase.E();
        pxm A = workDatabase.A();
        pqk pqkVar = m.d.l;
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        otj a = otj.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        a.e(1, currentTimeMillis);
        pzg pzgVar = (pzg) D;
        pzgVar.a.m();
        Cursor a2 = ovn.a(pzgVar.a, a, false);
        try {
            b = ovm.b(a2, "id");
            b2 = ovm.b(a2, "state");
            b3 = ovm.b(a2, "worker_class_name");
            b4 = ovm.b(a2, "input_merger_class_name");
            b5 = ovm.b(a2, "input");
            b6 = ovm.b(a2, "output");
            b7 = ovm.b(a2, "initial_delay");
            b8 = ovm.b(a2, "interval_duration");
            b9 = ovm.b(a2, "flex_duration");
            b10 = ovm.b(a2, "run_attempt_count");
            b11 = ovm.b(a2, "backoff_policy");
            otjVar = a;
        } catch (Throwable th) {
            th = th;
            otjVar = a;
        }
        try {
            int b12 = ovm.b(a2, "backoff_delay_duration");
            int b13 = ovm.b(a2, "last_enqueue_time");
            int b14 = ovm.b(a2, "minimum_retention_duration");
            int b15 = ovm.b(a2, "schedule_requested_at");
            int b16 = ovm.b(a2, "run_in_foreground");
            int b17 = ovm.b(a2, "out_of_quota_policy");
            int b18 = ovm.b(a2, "period_count");
            int b19 = ovm.b(a2, "generation");
            int b20 = ovm.b(a2, "next_schedule_time_override");
            int b21 = ovm.b(a2, "next_schedule_time_override_generation");
            int b22 = ovm.b(a2, "stop_reason");
            int b23 = ovm.b(a2, "trace_tag");
            int b24 = ovm.b(a2, "required_network_type");
            int b25 = ovm.b(a2, "required_network_request");
            int b26 = ovm.b(a2, "requires_charging");
            int b27 = ovm.b(a2, "requires_device_idle");
            int b28 = ovm.b(a2, "requires_battery_not_low");
            int b29 = ovm.b(a2, "requires_storage_not_low");
            int b30 = ovm.b(a2, "trigger_content_update_delay");
            int b31 = ovm.b(a2, "trigger_max_content_delay");
            int b32 = ovm.b(a2, "content_uri_triggers");
            int i = b14;
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                String string = a2.getString(b);
                pqp f = pzn.f(a2.getInt(b2));
                String string2 = a2.getString(b3);
                String string3 = a2.getString(b4);
                pot c = pot.c(a2.getBlob(b5));
                pot c2 = pot.c(a2.getBlob(b6));
                long j = a2.getLong(b7);
                long j2 = a2.getLong(b8);
                long j3 = a2.getLong(b9);
                int i2 = a2.getInt(b10);
                poa d = pzn.d(a2.getInt(b11));
                long j4 = a2.getLong(b12);
                long j5 = a2.getLong(b13);
                int i3 = i;
                long j6 = a2.getLong(i3);
                int i4 = b;
                int i5 = b15;
                long j7 = a2.getLong(i5);
                b15 = i5;
                int i6 = b16;
                boolean z = a2.getInt(i6) != 0;
                b16 = i6;
                int i7 = b17;
                pqg e = pzn.e(a2.getInt(i7));
                b17 = i7;
                int i8 = b18;
                int i9 = a2.getInt(i8);
                b18 = i8;
                int i10 = b19;
                int i11 = a2.getInt(i10);
                b19 = i10;
                int i12 = b20;
                long j8 = a2.getLong(i12);
                b20 = i12;
                int i13 = b21;
                int i14 = a2.getInt(i13);
                b21 = i13;
                int i15 = b22;
                int i16 = a2.getInt(i15);
                b22 = i15;
                int i17 = b23;
                String string4 = a2.isNull(i17) ? null : a2.getString(i17);
                b23 = i17;
                int i18 = b24;
                int l = pzn.l(a2.getInt(i18));
                b24 = i18;
                int i19 = b25;
                qad g = pzn.g(a2.getBlob(i19));
                b25 = i19;
                int i20 = b26;
                boolean z2 = a2.getInt(i20) != 0;
                b26 = i20;
                int i21 = b27;
                boolean z3 = a2.getInt(i21) != 0;
                b27 = i21;
                int i22 = b28;
                boolean z4 = a2.getInt(i22) != 0;
                b28 = i22;
                int i23 = b29;
                boolean z5 = a2.getInt(i23) != 0;
                b29 = i23;
                int i24 = b30;
                long j9 = a2.getLong(i24);
                b30 = i24;
                int i25 = b31;
                long j10 = a2.getLong(i25);
                b31 = i25;
                int i26 = b32;
                b32 = i26;
                arrayList.add(new pyj(string, f, string2, string3, c, c2, j, j2, j3, new poj(g, l, z2, z3, z4, z5, j9, j10, pzn.h(a2.getBlob(i26))), i2, d, j4, j5, j6, j7, z, e, i9, i11, j8, i14, i16, string4));
                b = i4;
                i = i3;
            }
            a2.close();
            otjVar.j();
            List c3 = D.c();
            List k = D.k();
            if (arrayList.isEmpty()) {
                pxmVar = A;
                pxuVar = B;
                pzjVar = E;
            } else {
                ppt.c();
                Log.i(qbq.a, "Recently completed work:\n\n");
                ppt.c();
                pxmVar = A;
                pxuVar = B;
                pzjVar = E;
                Log.i(qbq.a, qbq.a(pxuVar, pzjVar, pxmVar, arrayList));
            }
            if (!c3.isEmpty()) {
                ppt.c();
                Log.i(qbq.a, "Running work:\n\n");
                ppt.c();
                Log.i(qbq.a, qbq.a(pxuVar, pzjVar, pxmVar, c3));
            }
            if (!k.isEmpty()) {
                ppt.c();
                Log.i(qbq.a, "Enqueued work:\n\n");
                ppt.c();
                Log.i(qbq.a, qbq.a(pxuVar, pzjVar, pxmVar, k));
            }
            return new ppp();
        } catch (Throwable th2) {
            th = th2;
            a2.close();
            otjVar.j();
            throw th;
        }
    }
}
