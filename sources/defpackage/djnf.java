package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djnf {
    public final deva a;
    public final deva b;
    public final deva c;
    public final deva d;
    private final devc e;

    public djnf(String str) {
        devc devcVar = new devc(str);
        this.e = devcVar;
        this.a = new deuy(devcVar, "retries", 0);
        this.b = new deuy(devcVar, "throttle_counter", 0);
        this.c = new deuv(devcVar, "last_throttle_counter_reset_timestamp", 0L);
        this.d = new deuw(devcVar, "last_registration_engine_id", "");
    }

    public final long a() {
        return ((Long) this.c.d()).longValue();
    }

    public final void b(int i) {
        this.a.e(Integer.valueOf(i));
    }

    public final void c(int i) {
        this.b.e(Integer.valueOf(i));
    }
}
