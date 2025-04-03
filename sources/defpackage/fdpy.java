package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpy implements fdpx {
    public static final ecwj a;
    public static final ecwj b;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.o("enable_memory_recording", false);
        b = b2.o("enable_timing", false);
    }

    @Override // defpackage.fdpx
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fdpx
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
