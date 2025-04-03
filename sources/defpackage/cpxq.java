package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxq {
    public static final ekrp a(final cpxo cpxoVar) {
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("SmsSubjectSynclet");
        ekroVar.c = new ffbr() { // from class: cpxp
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return cpxo.this;
            }
        };
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(7L, TimeUnit.DAYS);
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }
}
