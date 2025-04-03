package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class isl implements hzc {
    public static final isl a = new isl();
    public static Boolean b;

    private isl() {
    }

    @Override // defpackage.hzc
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.hzc
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        imn.a("canFocus is read before it is written");
        throw new ffbx();
    }

    @Override // defpackage.hzc
    public final /* synthetic */ void b(ffji ffjiVar) {
    }

    @Override // defpackage.hzc
    public final /* synthetic */ void c(ffji ffjiVar) {
    }
}
