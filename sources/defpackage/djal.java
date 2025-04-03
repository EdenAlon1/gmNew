package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djal {
    public final diza a;
    public final diza b;
    public final diza c;
    public final diza d;
    public final diza e;

    public djal(djam djamVar) {
        this.a = djamVar.g("sim_state_changed_delay_seconds", 0L);
        this.b = djamVar.g("sim_state_changed_delay_max_attempts", 1L);
        this.c = djamVar.g("multi_sim_state_changed_delay_seconds", 0L);
        this.d = djamVar.i("enable_iccid_binding", false);
        this.e = djamVar.i("enable_logging_subscription_changed_event", false);
    }
}
