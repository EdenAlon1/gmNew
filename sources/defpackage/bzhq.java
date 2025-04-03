package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhq implements fbba {
    public static ekrp a(final ffbr ffbrVar) {
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("DisableGaiaDevicePairingOnNonPrimarySynclet");
        ekroVar.c = new ffbr() { // from class: bzhp
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return (ekrm) ffbr.this.b();
            }
        };
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(1L, TimeUnit.DAYS);
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
