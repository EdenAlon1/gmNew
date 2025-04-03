package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azoh extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new azog(this);
    }

    public final void b(String str) {
        int intValue = azoi.c().intValue();
        if (intValue < 59990) {
            dtub.w("provisioning_id", intValue);
        }
        aq(new dtrt("my_identities.provisioning_id", 1, String.valueOf(str)));
    }

    public final void c(azsu azsuVar) {
        aq(new dtrt("my_identities.token", 1, azsv.b(azsuVar)));
    }
}
