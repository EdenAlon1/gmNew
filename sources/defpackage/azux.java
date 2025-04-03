package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azux extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new azuw(this);
    }

    public final void b() {
        int intValue = azuy.c().intValue();
        if (intValue < 59450) {
            dtub.w("my_identity_token", intValue);
        }
        aq(new dtrx("subscriptions.my_identity_token", 6));
    }

    public final void c(String str) {
        aq(new dtrt("subscriptions.sim_serial_number", 1, String.valueOf(str)));
    }

    public final void d(int i) {
        aq(new dtwe("subscriptions.sub_id", 1, Integer.valueOf(i)));
    }
}
