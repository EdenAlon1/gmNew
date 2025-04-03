package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alhk {
    public final ctyx a;

    public alhk(ctyx ctyxVar) {
        this.a = ctyxVar;
    }

    private final Optional g(String str) {
        long e = this.a.e(str, -1L);
        return e == -1 ? Optional.empty() : Optional.of(Long.valueOf(e));
    }

    public final Optional a() {
        int d = this.a.d("first_provisioning_ui_event_ui_type", -1);
        return d == -1 ? Optional.empty() : Optional.of(epgt.b(d));
    }

    public final Optional b() {
        return g("first_time_rcs_accepted_millis");
    }

    public final Optional c() {
        return g("first_time_rcs_declined_millis");
    }

    public final Optional d() {
        return g("first_time_rcs_provisioned_millis");
    }

    public final Optional e() {
        return g("first_rcs_provisioning_ui_event_time");
    }

    public final Optional f() {
        return g("first_rcs_eligibility_time");
    }
}
