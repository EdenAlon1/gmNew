package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzg implements pyk {
    public final otb a;
    public final oru b;
    public final ors c;
    public final otr d;
    public final otr e;
    public final otr f;
    public final otr g;
    public final otr h;
    public final otr i;
    private final otr j;
    private final otr k;
    private final otr l;
    private final otr m;
    private final otr n;
    private final otr o;
    private final otr p;

    public pzg(otb otbVar) {
        this.a = otbVar;
        this.b = new pyw(otbVar);
        this.c = new pyy(otbVar);
        this.j = new pyz(otbVar);
        this.k = new pza(otbVar);
        this.d = new pzb(otbVar);
        this.e = new pzc(otbVar);
        this.l = new pzd(otbVar);
        this.m = new pze(otbVar);
        this.f = new pzf(otbVar);
        this.g = new pyn(otbVar);
        new pyo(otbVar);
        this.n = new pyp(otbVar);
        this.o = new pyq(otbVar);
        this.h = new pyr(otbVar);
        this.i = new pys(otbVar);
        new pyt(otbVar);
        this.p = new pyu(otbVar);
    }

    @Override // defpackage.pyk
    public final pqp a(String str) {
        otj a = otj.a("SELECT state FROM workspec WHERE id=?", 1);
        a.g(1, str);
        this.a.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            pqp pqpVar = null;
            if (a2.moveToFirst()) {
                Integer valueOf = a2.isNull(0) ? null : Integer.valueOf(a2.getInt(0));
                if (valueOf != null) {
                    pqpVar = pzn.f(valueOf.intValue());
                }
            }
            return pqpVar;
        } finally {
            a2.close();
            a.j();
        }
    }

    @Override // defpackage.pyk
    public final pyj b(String str) {
        otj otjVar;
        otj a = otj.a("SELECT * FROM workspec WHERE id=?", 1);
        a.g(1, str);
        this.a.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int b = ovm.b(a2, "id");
            int b2 = ovm.b(a2, "state");
            int b3 = ovm.b(a2, "worker_class_name");
            int b4 = ovm.b(a2, "input_merger_class_name");
            int b5 = ovm.b(a2, "input");
            int b6 = ovm.b(a2, "output");
            int b7 = ovm.b(a2, "initial_delay");
            int b8 = ovm.b(a2, "interval_duration");
            int b9 = ovm.b(a2, "flex_duration");
            int b10 = ovm.b(a2, "run_attempt_count");
            int b11 = ovm.b(a2, "backoff_policy");
            int b12 = ovm.b(a2, "backoff_delay_duration");
            int b13 = ovm.b(a2, "last_enqueue_time");
            int b14 = ovm.b(a2, "minimum_retention_duration");
            otjVar = a;
            try {
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
                pyj pyjVar = null;
                if (a2.moveToFirst()) {
                    pyjVar = new pyj(a2.getString(b), pzn.f(a2.getInt(b2)), a2.getString(b3), a2.getString(b4), pot.c(a2.getBlob(b5)), pot.c(a2.getBlob(b6)), a2.getLong(b7), a2.getLong(b8), a2.getLong(b9), new poj(pzn.g(a2.getBlob(b25)), pzn.l(a2.getInt(b24)), a2.getInt(b26) != 0, a2.getInt(b27) != 0, a2.getInt(b28) != 0, a2.getInt(b29) != 0, a2.getLong(b30), a2.getLong(b31), pzn.h(a2.getBlob(b32))), a2.getInt(b10), pzn.d(a2.getInt(b11)), a2.getLong(b12), a2.getLong(b13), a2.getLong(b14), a2.getLong(b15), a2.getInt(b16) != 0, pzn.e(a2.getInt(b17)), a2.getInt(b18), a2.getInt(b19), a2.getLong(b20), a2.getInt(b21), a2.getInt(b22), a2.isNull(b23) ? null : a2.getString(b23));
                }
                a2.close();
                otjVar.j();
                return pyjVar;
            } catch (Throwable th) {
                th = th;
                a2.close();
                otjVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            otjVar = a;
        }
    }

    @Override // defpackage.pyk
    public final List c() {
        otj otjVar;
        otb otbVar = this.a;
        otj a = otj.a("SELECT * FROM workspec WHERE state=1", 0);
        otbVar.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int b = ovm.b(a2, "id");
            int b2 = ovm.b(a2, "state");
            int b3 = ovm.b(a2, "worker_class_name");
            int b4 = ovm.b(a2, "input_merger_class_name");
            int b5 = ovm.b(a2, "input");
            int b6 = ovm.b(a2, "output");
            int b7 = ovm.b(a2, "initial_delay");
            int b8 = ovm.b(a2, "interval_duration");
            int b9 = ovm.b(a2, "flex_duration");
            int b10 = ovm.b(a2, "run_attempt_count");
            int b11 = ovm.b(a2, "backoff_policy");
            int b12 = ovm.b(a2, "backoff_delay_duration");
            int b13 = ovm.b(a2, "last_enqueue_time");
            int b14 = ovm.b(a2, "minimum_retention_duration");
            otjVar = a;
            try {
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                otjVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            otjVar = a;
        }
    }

    @Override // defpackage.pyk
    public final List d() {
        otj otjVar;
        otb otbVar = this.a;
        otj a = otj.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        otbVar.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int b = ovm.b(a2, "id");
            int b2 = ovm.b(a2, "state");
            int b3 = ovm.b(a2, "worker_class_name");
            int b4 = ovm.b(a2, "input_merger_class_name");
            int b5 = ovm.b(a2, "input");
            int b6 = ovm.b(a2, "output");
            int b7 = ovm.b(a2, "initial_delay");
            int b8 = ovm.b(a2, "interval_duration");
            int b9 = ovm.b(a2, "flex_duration");
            int b10 = ovm.b(a2, "run_attempt_count");
            int b11 = ovm.b(a2, "backoff_policy");
            int b12 = ovm.b(a2, "backoff_delay_duration");
            int b13 = ovm.b(a2, "last_enqueue_time");
            int b14 = ovm.b(a2, "minimum_retention_duration");
            otjVar = a;
            try {
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                otjVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            otjVar = a;
        }
    }

    @Override // defpackage.pyk
    public final List e(String str) {
        otj a = otj.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        a.g(1, str);
        this.a.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(new pyg(a2.getString(0), pzn.f(a2.getInt(1))));
            }
            return arrayList;
        } finally {
            a2.close();
            a.j();
        }
    }

    @Override // defpackage.pyk
    public final void f(String str) {
        this.a.m();
        oyf d = this.j.d();
        d.g(1, str);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.j.f(d);
        }
    }

    @Override // defpackage.pyk
    public final void g(String str, int i) {
        this.a.m();
        oyf d = this.n.d();
        d.g(1, str);
        d.e(2, i);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.n.f(d);
        }
    }

    @Override // defpackage.pyk
    public final void h(String str, long j) {
        this.a.m();
        oyf d = this.m.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.m.f(d);
        }
    }

    @Override // defpackage.pyk
    public final void i(String str, pot potVar) {
        this.a.m();
        oyf d = this.l.d();
        d.c(1, poo.a(potVar));
        d.g(2, str);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.l.f(d);
        }
    }

    @Override // defpackage.pyk
    public final void j(String str, int i) {
        this.a.m();
        long j = i;
        oyf d = this.p.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.p.f(d);
        }
    }

    @Override // defpackage.pyk
    public final List k() {
        otj otjVar;
        otj a = otj.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        a.e(1, 200L);
        this.a.m();
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int b = ovm.b(a2, "id");
            int b2 = ovm.b(a2, "state");
            int b3 = ovm.b(a2, "worker_class_name");
            int b4 = ovm.b(a2, "input_merger_class_name");
            int b5 = ovm.b(a2, "input");
            int b6 = ovm.b(a2, "output");
            int b7 = ovm.b(a2, "initial_delay");
            int b8 = ovm.b(a2, "interval_duration");
            int b9 = ovm.b(a2, "flex_duration");
            int b10 = ovm.b(a2, "run_attempt_count");
            int b11 = ovm.b(a2, "backoff_policy");
            int b12 = ovm.b(a2, "backoff_delay_duration");
            int b13 = ovm.b(a2, "last_enqueue_time");
            int b14 = ovm.b(a2, "minimum_retention_duration");
            otjVar = a;
            try {
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                otjVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            otjVar = a;
        }
    }

    @Override // defpackage.pyk
    public final void l(String str, long j) {
        this.a.m();
        oyf d = this.o.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.o.f(d);
        }
    }

    @Override // defpackage.pyk
    public final void m(pqp pqpVar, String str) {
        this.a.m();
        oyf d = this.k.d();
        d.e(1, pzn.c(pqpVar));
        d.g(2, str);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.k.f(d);
        }
    }

    public final void n(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            owa.a(hashMap, new ffji() { // from class: pym
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    pzg.this.n((HashMap) obj);
                    return ffcu.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        owh.a(sb, size);
        sb.append(")");
        otj a = otj.a(sb.toString(), size);
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            a.g(i, (String) it.next());
            i++;
        }
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int a3 = ovm.a(a2, "work_spec_id");
            if (a3 != -1) {
                while (a2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(a2.getString(a3));
                    if (arrayList != null) {
                        arrayList.add(pot.c(a2.getBlob(0)));
                    }
                }
            }
        } finally {
            a2.close();
        }
    }

    public final void o(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            owa.a(hashMap, new ffji() { // from class: pyl
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    pzg.this.o((HashMap) obj);
                    return ffcu.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        owh.a(sb, size);
        sb.append(")");
        otj a = otj.a(sb.toString(), size);
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            a.g(i, (String) it.next());
            i++;
        }
        Cursor a2 = ovn.a(this.a, a, false);
        try {
            int a3 = ovm.a(a2, "work_spec_id");
            if (a3 != -1) {
                while (a2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(a2.getString(a3));
                    if (arrayList != null) {
                        arrayList.add(a2.getString(0));
                    }
                }
            }
        } finally {
            a2.close();
        }
    }
}
