package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzlc {
    public static final ekrp a(final ffbr ffbrVar) {
        ffbrVar.getClass();
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("RemoveStalePairingsSynclet");
        ekroVar.c = new ffbr() { // from class: bzlb
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
}
