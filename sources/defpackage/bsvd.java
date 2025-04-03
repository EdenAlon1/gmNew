package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsvd extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bsvc(this);
    }

    public final void b(String str) {
        aq(new dtrt("desktop.desktop_id", 1, String.valueOf(str)));
    }

    public final void c() {
        int intValue = bsve.c().intValue();
        if (intValue < 58010) {
            dtub.w("is_active", intValue);
        }
        aq(new dtwe("desktop.is_active", 1, 1));
    }

    public final void d(byzd byzdVar) {
        int intValue = bsve.c().intValue();
        if (intValue < 58960) {
            dtub.w("pairing_type", intValue);
        }
        aq(new dtwe("desktop.pairing_type", 1, Integer.valueOf(byzdVar == null ? 0 : byzdVar.ordinal())));
    }

    public final void e() {
        int intValue = bsve.c().intValue();
        if (intValue < 58010) {
            dtub.w("request_id", intValue);
        }
        aq(new dtrx("desktop.request_id", 6));
    }

    public final void f() {
        int intValue = bsve.c().intValue();
        if (intValue < 58010) {
            dtub.w("request_id", intValue);
        }
        aq(new dtrt("desktop.request_id", 2, ""));
    }
}
