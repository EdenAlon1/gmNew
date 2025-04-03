package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psa {
    public static final String a = ppt.d("Schedulers");

    public static void a(pod podVar, WorkDatabase workDatabase, List list) {
        otj otjVar;
        otj otjVar2;
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
        if (list == null || list.size() == 0) {
            return;
        }
        pyk D = workDatabase.D();
        workDatabase.n();
        try {
            otb otbVar = ((pzg) D).a;
            otj a2 = otj.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
            otbVar.m();
            Cursor a3 = ovn.a(((pzg) D).a, a2, false);
            try {
                int b12 = ovm.b(a3, "id");
                otjVar = a2;
                try {
                    int b13 = ovm.b(a3, "state");
                    int b14 = ovm.b(a3, "worker_class_name");
                    int b15 = ovm.b(a3, "input_merger_class_name");
                    int b16 = ovm.b(a3, "input");
                    int b17 = ovm.b(a3, "output");
                    int b18 = ovm.b(a3, "initial_delay");
                    int b19 = ovm.b(a3, "interval_duration");
                    int b20 = ovm.b(a3, "flex_duration");
                    int b21 = ovm.b(a3, "run_attempt_count");
                    int b22 = ovm.b(a3, "backoff_policy");
                    int b23 = ovm.b(a3, "backoff_delay_duration");
                    int b24 = ovm.b(a3, "last_enqueue_time");
                    int b25 = ovm.b(a3, "minimum_retention_duration");
                    int b26 = ovm.b(a3, "schedule_requested_at");
                    int b27 = ovm.b(a3, "run_in_foreground");
                    int b28 = ovm.b(a3, "out_of_quota_policy");
                    int b29 = ovm.b(a3, "period_count");
                    int b30 = ovm.b(a3, "generation");
                    int b31 = ovm.b(a3, "next_schedule_time_override");
                    int b32 = ovm.b(a3, "next_schedule_time_override_generation");
                    int b33 = ovm.b(a3, "stop_reason");
                    int b34 = ovm.b(a3, "trace_tag");
                    int b35 = ovm.b(a3, "required_network_type");
                    int b36 = ovm.b(a3, "required_network_request");
                    int b37 = ovm.b(a3, "requires_charging");
                    int b38 = ovm.b(a3, "requires_device_idle");
                    int b39 = ovm.b(a3, "requires_battery_not_low");
                    int b40 = ovm.b(a3, "requires_storage_not_low");
                    int b41 = ovm.b(a3, "trigger_content_update_delay");
                    int b42 = ovm.b(a3, "trigger_max_content_delay");
                    int b43 = ovm.b(a3, "content_uri_triggers");
                    int i = b31;
                    ArrayList arrayList = new ArrayList(a3.getCount());
                    while (a3.moveToNext()) {
                        String string = a3.getString(b12);
                        pqp f = pzn.f(a3.getInt(b13));
                        String string2 = a3.getString(b14);
                        String string3 = a3.getString(b15);
                        pot c = pot.c(a3.getBlob(b16));
                        pot c2 = pot.c(a3.getBlob(b17));
                        long j = a3.getLong(b18);
                        long j2 = a3.getLong(b19);
                        long j3 = a3.getLong(b20);
                        int i2 = a3.getInt(b21);
                        poa d = pzn.d(a3.getInt(b22));
                        long j4 = a3.getLong(b23);
                        long j5 = a3.getLong(b24);
                        int i3 = b25;
                        long j6 = a3.getLong(i3);
                        int i4 = b17;
                        int i5 = b26;
                        long j7 = a3.getLong(i5);
                        b26 = i5;
                        int i6 = b27;
                        boolean z = a3.getInt(i6) != 0;
                        b27 = i6;
                        int i7 = b28;
                        pqg e = pzn.e(a3.getInt(i7));
                        b28 = i7;
                        int i8 = b29;
                        int i9 = a3.getInt(i8);
                        b29 = i8;
                        int i10 = b30;
                        int i11 = a3.getInt(i10);
                        b30 = i10;
                        int i12 = i;
                        long j8 = a3.getLong(i12);
                        i = i12;
                        int i13 = b32;
                        int i14 = a3.getInt(i13);
                        b32 = i13;
                        int i15 = b33;
                        int i16 = a3.getInt(i15);
                        b33 = i15;
                        int i17 = b34;
                        String string4 = a3.isNull(i17) ? null : a3.getString(i17);
                        b34 = i17;
                        int i18 = b35;
                        int l = pzn.l(a3.getInt(i18));
                        b35 = i18;
                        int i19 = b36;
                        qad g = pzn.g(a3.getBlob(i19));
                        b36 = i19;
                        int i20 = b37;
                        boolean z2 = a3.getInt(i20) != 0;
                        b37 = i20;
                        int i21 = b38;
                        boolean z3 = a3.getInt(i21) != 0;
                        b38 = i21;
                        int i22 = b39;
                        boolean z4 = a3.getInt(i22) != 0;
                        b39 = i22;
                        int i23 = b40;
                        boolean z5 = a3.getInt(i23) != 0;
                        b40 = i23;
                        int i24 = b41;
                        long j9 = a3.getLong(i24);
                        b41 = i24;
                        int i25 = b42;
                        long j10 = a3.getLong(i25);
                        b42 = i25;
                        int i26 = b43;
                        b43 = i26;
                        arrayList.add(new pyj(string, f, string2, string3, c, c2, j, j2, j3, new poj(g, l, z2, z3, z4, z5, j9, j10, pzn.h(a3.getBlob(i26))), i2, d, j4, j5, j6, j7, z, e, i9, i11, j8, i14, i16, string4));
                        b17 = i4;
                        b25 = i3;
                    }
                    a3.close();
                    otjVar.j();
                    pqk pqkVar = podVar.l;
                    b(D, arrayList);
                    int i27 = podVar.k;
                    otj a4 = otj.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                    a4.e(1, 20L);
                    ((pzg) D).a.m();
                    Cursor a5 = ovn.a(((pzg) D).a, a4, false);
                    try {
                        b = ovm.b(a5, "id");
                        b2 = ovm.b(a5, "state");
                        b3 = ovm.b(a5, "worker_class_name");
                        b4 = ovm.b(a5, "input_merger_class_name");
                        b5 = ovm.b(a5, "input");
                        b6 = ovm.b(a5, "output");
                        b7 = ovm.b(a5, "initial_delay");
                        b8 = ovm.b(a5, "interval_duration");
                        b9 = ovm.b(a5, "flex_duration");
                        b10 = ovm.b(a5, "run_attempt_count");
                        b11 = ovm.b(a5, "backoff_policy");
                        otjVar2 = a4;
                    } catch (Throwable th) {
                        th = th;
                        otjVar2 = a4;
                    }
                    try {
                        int b44 = ovm.b(a5, "backoff_delay_duration");
                        int b45 = ovm.b(a5, "last_enqueue_time");
                        int b46 = ovm.b(a5, "minimum_retention_duration");
                        int b47 = ovm.b(a5, "schedule_requested_at");
                        int b48 = ovm.b(a5, "run_in_foreground");
                        int b49 = ovm.b(a5, "out_of_quota_policy");
                        int b50 = ovm.b(a5, "period_count");
                        int b51 = ovm.b(a5, "generation");
                        int b52 = ovm.b(a5, "next_schedule_time_override");
                        int b53 = ovm.b(a5, "next_schedule_time_override_generation");
                        int b54 = ovm.b(a5, "stop_reason");
                        int b55 = ovm.b(a5, "trace_tag");
                        int b56 = ovm.b(a5, "required_network_type");
                        int b57 = ovm.b(a5, "required_network_request");
                        int b58 = ovm.b(a5, "requires_charging");
                        int b59 = ovm.b(a5, "requires_device_idle");
                        int b60 = ovm.b(a5, "requires_battery_not_low");
                        int b61 = ovm.b(a5, "requires_storage_not_low");
                        int b62 = ovm.b(a5, "trigger_content_update_delay");
                        int b63 = ovm.b(a5, "trigger_max_content_delay");
                        int b64 = ovm.b(a5, "content_uri_triggers");
                        int i28 = b46;
                        ArrayList arrayList2 = new ArrayList(a5.getCount());
                        while (a5.moveToNext()) {
                            String string5 = a5.getString(b);
                            pqp f2 = pzn.f(a5.getInt(b2));
                            String string6 = a5.getString(b3);
                            String string7 = a5.getString(b4);
                            pot c3 = pot.c(a5.getBlob(b5));
                            pot c4 = pot.c(a5.getBlob(b6));
                            long j11 = a5.getLong(b7);
                            long j12 = a5.getLong(b8);
                            long j13 = a5.getLong(b9);
                            int i29 = a5.getInt(b10);
                            poa d2 = pzn.d(a5.getInt(b11));
                            long j14 = a5.getLong(b44);
                            long j15 = a5.getLong(b45);
                            int i30 = i28;
                            long j16 = a5.getLong(i30);
                            i28 = i30;
                            int i31 = b47;
                            long j17 = a5.getLong(i31);
                            b47 = i31;
                            int i32 = b48;
                            boolean z6 = a5.getInt(i32) != 0;
                            b48 = i32;
                            int i33 = b49;
                            pqg e2 = pzn.e(a5.getInt(i33));
                            b49 = i33;
                            int i34 = b50;
                            int i35 = a5.getInt(i34);
                            b50 = i34;
                            int i36 = b51;
                            int i37 = a5.getInt(i36);
                            b51 = i36;
                            int i38 = b52;
                            long j18 = a5.getLong(i38);
                            b52 = i38;
                            int i39 = b53;
                            int i40 = a5.getInt(i39);
                            b53 = i39;
                            int i41 = b54;
                            int i42 = a5.getInt(i41);
                            b54 = i41;
                            int i43 = b55;
                            String string8 = a5.isNull(i43) ? null : a5.getString(i43);
                            b55 = i43;
                            int i44 = b56;
                            int l2 = pzn.l(a5.getInt(i44));
                            b56 = i44;
                            int i45 = b57;
                            qad g2 = pzn.g(a5.getBlob(i45));
                            b57 = i45;
                            int i46 = b58;
                            boolean z7 = a5.getInt(i46) != 0;
                            b58 = i46;
                            int i47 = b59;
                            boolean z8 = a5.getInt(i47) != 0;
                            b59 = i47;
                            int i48 = b60;
                            boolean z9 = a5.getInt(i48) != 0;
                            b60 = i48;
                            int i49 = b61;
                            boolean z10 = a5.getInt(i49) != 0;
                            b61 = i49;
                            int i50 = b62;
                            long j19 = a5.getLong(i50);
                            b62 = i50;
                            int i51 = b63;
                            long j20 = a5.getLong(i51);
                            b63 = i51;
                            int i52 = b64;
                            b64 = i52;
                            arrayList2.add(new pyj(string5, f2, string6, string7, c3, c4, j11, j12, j13, new poj(g2, l2, z7, z8, z9, z10, j19, j20, pzn.h(a5.getBlob(i52))), i29, d2, j14, j15, j16, j17, z6, e2, i35, i37, j18, i40, i42, string8));
                        }
                        a5.close();
                        otjVar2.j();
                        pqk pqkVar2 = podVar.l;
                        b(D, arrayList2);
                        arrayList2.addAll(arrayList);
                        List k = D.k();
                        workDatabase.q();
                        workDatabase.o();
                        if (arrayList2.size() > 0) {
                            pyj[] pyjVarArr = (pyj[]) arrayList2.toArray(new pyj[arrayList2.size()]);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                prx prxVar = (prx) it.next();
                                if (prxVar.d()) {
                                    prxVar.c(pyjVarArr);
                                }
                            }
                        }
                        if (k.size() > 0) {
                            pyj[] pyjVarArr2 = (pyj[]) k.toArray(new pyj[k.size()]);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                prx prxVar2 = (prx) it2.next();
                                if (!prxVar2.d()) {
                                    prxVar2.c(pyjVarArr2);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a5.close();
                        otjVar2.j();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a3.close();
                    otjVar.j();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                otjVar = a2;
            }
        } catch (Throwable th5) {
            workDatabase.o();
            throw th5;
        }
    }

    private static void b(pyk pykVar, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pykVar.l(((pyj) it.next()).c, currentTimeMillis);
            }
        }
    }
}
