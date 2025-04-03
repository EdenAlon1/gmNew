package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyw extends oru {
    public pyw(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.oru
    protected final /* synthetic */ void b(oyf oyfVar, Object obj) {
        pyj pyjVar = (pyj) obj;
        oyfVar.g(1, pyjVar.c);
        oyfVar.e(2, pzn.c(pyjVar.d));
        oyfVar.g(3, pyjVar.e);
        oyfVar.g(4, pyjVar.f);
        pot potVar = pyjVar.g;
        pot potVar2 = pot.a;
        oyfVar.c(5, poo.a(potVar));
        oyfVar.c(6, poo.a(pyjVar.h));
        oyfVar.e(7, pyjVar.i);
        oyfVar.e(8, pyjVar.j);
        oyfVar.e(9, pyjVar.k);
        oyfVar.e(10, pyjVar.m);
        oyfVar.e(11, pzn.a(pyjVar.n));
        oyfVar.e(12, pyjVar.o);
        oyfVar.e(13, pyjVar.p);
        oyfVar.e(14, pyjVar.q);
        oyfVar.e(15, pyjVar.r);
        oyfVar.e(16, pyjVar.s ? 1L : 0L);
        oyfVar.e(17, pzn.b(pyjVar.t));
        oyfVar.e(18, pyjVar.u);
        oyfVar.e(19, pyjVar.v);
        oyfVar.e(20, pyjVar.w);
        oyfVar.e(21, pyjVar.x);
        oyfVar.e(22, pyjVar.y);
        String str = pyjVar.z;
        if (str == null) {
            oyfVar.f(23);
        } else {
            oyfVar.g(23, str);
        }
        poj pojVar = pyjVar.l;
        oyfVar.e(24, pzn.k(pojVar.j));
        oyfVar.c(25, pzn.i(pojVar.b));
        oyfVar.e(26, pojVar.c ? 1L : 0L);
        oyfVar.e(27, pojVar.d ? 1L : 0L);
        oyfVar.e(28, pojVar.e ? 1L : 0L);
        oyfVar.e(29, pojVar.f ? 1L : 0L);
        oyfVar.e(30, pojVar.g);
        oyfVar.e(31, pojVar.h);
        oyfVar.c(32, pzn.j(pojVar.i));
    }

    @Override // defpackage.otr
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
