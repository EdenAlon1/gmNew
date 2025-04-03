package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qan extends ffkk implements ffji {
    final /* synthetic */ pqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qan(pqt pqtVar) {
        super(1);
        this.a = pqtVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        qad qadVar;
        int i17;
        int i18;
        boolean z;
        int i19;
        boolean z2;
        int i20;
        boolean z3;
        int i21;
        boolean z4;
        int i22;
        WorkDatabase workDatabase = (WorkDatabase) obj;
        workDatabase.getClass();
        afd afdVar = pyj.b;
        pxg z5 = workDatabase.z();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        pqt pqtVar = this.a;
        if (pqtVar.a.isEmpty()) {
            str = " WHERE";
        } else {
            List list = pqtVar.a;
            ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UUID) it.next()).toString());
            }
            sb.append(" WHERE id IN (");
            qai.a(sb, pqtVar.a.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        if (!pqtVar.b.isEmpty()) {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            qai.a(sb, pqtVar.b.size());
            sb.append("))");
            arrayList.addAll(pqtVar.b);
        }
        sb.append(";");
        oxh oxhVar = new oxh(sb.toString(), arrayList.toArray(new Object[0]));
        pxj pxjVar = (pxj) z5;
        pxjVar.a.m();
        Cursor a = ovn.a(pxjVar.a, oxhVar, true);
        try {
            int a2 = ovm.a(a, "id");
            int a3 = ovm.a(a, "state");
            int a4 = ovm.a(a, "output");
            int a5 = ovm.a(a, "initial_delay");
            int a6 = ovm.a(a, "interval_duration");
            int a7 = ovm.a(a, "flex_duration");
            int a8 = ovm.a(a, "run_attempt_count");
            int a9 = ovm.a(a, "backoff_policy");
            int a10 = ovm.a(a, "backoff_delay_duration");
            int a11 = ovm.a(a, "last_enqueue_time");
            int a12 = ovm.a(a, "period_count");
            int a13 = ovm.a(a, "generation");
            int a14 = ovm.a(a, "next_schedule_time_override");
            int a15 = ovm.a(a, "stop_reason");
            int a16 = ovm.a(a, "required_network_type");
            int a17 = ovm.a(a, "required_network_request");
            int a18 = ovm.a(a, "requires_charging");
            int a19 = ovm.a(a, "requires_device_idle");
            int a20 = ovm.a(a, "requires_battery_not_low");
            int a21 = ovm.a(a, "requires_storage_not_low");
            int a22 = ovm.a(a, "trigger_content_update_delay");
            int a23 = ovm.a(a, "trigger_max_content_delay");
            int a24 = ovm.a(a, "content_uri_triggers");
            HashMap hashMap = new HashMap();
            int i23 = a15;
            HashMap hashMap2 = new HashMap();
            while (a.moveToNext()) {
                int i24 = a14;
                String string = a.getString(a2);
                if (hashMap.containsKey(string)) {
                    i22 = a13;
                } else {
                    i22 = a13;
                    hashMap.put(string, new ArrayList());
                }
                String string2 = a.getString(a2);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList());
                }
                a14 = i24;
                a13 = i22;
            }
            int i25 = a14;
            int i26 = a13;
            a.moveToPosition(-1);
            ((pxj) z5).b(hashMap);
            ((pxj) z5).a(hashMap2);
            ArrayList arrayList3 = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                String string3 = a2 == -1 ? null : a.getString(a2);
                pqp f = a3 == -1 ? null : pzn.f(a.getInt(a3));
                pot c = a4 == -1 ? null : pot.c(a.getBlob(a4));
                long j2 = a5 == -1 ? 0L : a.getLong(a5);
                long j3 = a6 == -1 ? 0L : a.getLong(a6);
                long j4 = a7 == -1 ? 0L : a.getLong(a7);
                int i27 = a8 == -1 ? 0 : a.getInt(a8);
                poa d = a9 == -1 ? null : pzn.d(a.getInt(a9));
                long j5 = a10 == -1 ? 0L : a.getLong(a10);
                long j6 = a11 == -1 ? 0L : a.getLong(a11);
                if (a12 == -1) {
                    int i28 = i26;
                    i = a12;
                    i2 = i28;
                    i3 = 0;
                } else {
                    int i29 = a.getInt(a12);
                    int i30 = i26;
                    i = a12;
                    i2 = i30;
                    i3 = i29;
                }
                if (i2 == -1) {
                    int i31 = i25;
                    i4 = i2;
                    i5 = i31;
                    i6 = 0;
                } else {
                    int i32 = a.getInt(i2);
                    int i33 = i25;
                    i4 = i2;
                    i5 = i33;
                    i6 = i32;
                }
                if (i5 == -1) {
                    int i34 = i23;
                    i7 = i5;
                    i8 = i34;
                    j = 0;
                } else {
                    j = a.getLong(i5);
                    int i35 = i23;
                    i7 = i5;
                    i8 = i35;
                }
                if (i8 == -1) {
                    int i36 = a16;
                    i9 = i8;
                    i10 = i36;
                    i11 = 0;
                } else {
                    int i37 = a.getInt(i8);
                    int i38 = a16;
                    i9 = i8;
                    i10 = i38;
                    i11 = i37;
                }
                if (i10 == -1) {
                    int i39 = a17;
                    i12 = i10;
                    i13 = i39;
                    i14 = 0;
                } else {
                    int l = pzn.l(a.getInt(i10));
                    int i40 = a17;
                    i12 = i10;
                    i13 = i40;
                    i14 = l;
                }
                if (i13 == -1) {
                    int i41 = a18;
                    i15 = i13;
                    i16 = i41;
                    qadVar = null;
                } else {
                    qad g = pzn.g(a.getBlob(i13));
                    int i42 = a18;
                    i15 = i13;
                    i16 = i42;
                    qadVar = g;
                }
                if (i16 == -1 || a.getInt(i16) == 0) {
                    i17 = i16;
                    i18 = a19;
                    z = false;
                } else {
                    i17 = i16;
                    i18 = a19;
                    z = true;
                }
                if (i18 == -1 || a.getInt(i18) == 0) {
                    a19 = i18;
                    i19 = a20;
                    z2 = false;
                } else {
                    a19 = i18;
                    i19 = a20;
                    z2 = true;
                }
                if (i19 == -1 || a.getInt(i19) == 0) {
                    a20 = i19;
                    i20 = a21;
                    z3 = false;
                } else {
                    a20 = i19;
                    i20 = a21;
                    z3 = true;
                }
                if (i20 == -1 || a.getInt(i20) == 0) {
                    a21 = i20;
                    i21 = a22;
                    z4 = false;
                } else {
                    a21 = i20;
                    i21 = a22;
                    z4 = true;
                }
                long j7 = i21 == -1 ? 0L : a.getLong(i21);
                a22 = i21;
                int i43 = a23;
                long j8 = i43 != -1 ? a.getLong(i43) : 0L;
                a23 = i43;
                int i44 = a24;
                arrayList3.add(new pyi(string3, f, c, j2, j3, j4, new poj(qadVar, i14, z, z2, z3, z4, j7, j8, i44 == -1 ? null : pzn.h(a.getBlob(i44))), i27, d, j5, j6, i3, i6, j, i11, (ArrayList) hashMap.get(a.getString(a2)), (ArrayList) hashMap2.get(a.getString(a2))));
                a24 = i44;
                a12 = i;
                i26 = i4;
                i25 = i7;
                i23 = i9;
                a16 = i12;
                a17 = i15;
                a18 = i17;
            }
            a.close();
            Object a25 = afdVar.a(arrayList3);
            a25.getClass();
            return a25;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
