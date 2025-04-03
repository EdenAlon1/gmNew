package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsw implements fbba {
    public static ekrp a(final tst tstVar) {
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("CmsDailySynclet");
        ekroVar.c = new ffbr() { // from class: tsv
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return tst.this;
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
