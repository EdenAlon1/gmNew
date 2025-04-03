package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkf implements djjy {
    private static final engw a = engw.s(1, 0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.djjy
    public final djjt a(djjt[] djjtVarArr) {
        dkty.c("Selecting non-vpn ImsNetworkInterface.", new Object[0]);
        engw engwVar = a;
        int i = ((enou) engwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            djjt djjtVar = djjtVarArr[((Integer) engwVar.get(i2)).intValue()];
            if (djjtVar != null && djjtVar.l()) {
                return djjtVar;
            }
        }
        return null;
    }
}
