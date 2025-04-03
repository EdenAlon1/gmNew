package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdlm implements fdll {
    public static final ecwj a;
    public static final ecwj b;

    static {
        ecwh a2 = new ecwh(ecvd.a("com.google.android.ims.library")).a();
        a = a2.m("PhenotypeRcsFlags__bugle_max_typing_send_frequency_milliseconds", 4000L);
        b = a2.m("PhenotypeRcsFlags__bugle_stopped_typing_send_timeout_milliseconds", 10000L);
        a2.o("PhenotypeRcsFlags__save_all_logs", false);
    }

    @Override // defpackage.fdll
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdll
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}
