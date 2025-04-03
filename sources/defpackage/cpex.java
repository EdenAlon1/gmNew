package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpex {
    public static final cfva a;
    public static final cfva b;
    public static final cfva c;
    public static final cfva d;

    static {
        emys.a(new emyl() { // from class: cpew
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = cpex.a;
                return cfvl.b("bypass_message_queueing_v2", false);
            }
        });
        a = cfvl.i(cfvl.b, "attach_to_service_after_pull", false);
        b = cfvl.i(cfvl.b, "attach_to_service_v2_after_pull", false);
        c = cfvl.i(cfvl.b, "attach_to_wakelock_v2_after_pull", false);
        d = cfvl.n(cfvl.b, "enable_tachygram_arrived_to_message_delivered_logging", true);
    }
}
