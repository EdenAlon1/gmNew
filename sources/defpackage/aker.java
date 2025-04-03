package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aker implements fbba {
    public static ekrp a(final akep akepVar) {
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("MessagesRestoreDailySynclet");
        ekroVar.c = new ffbr() { // from class: akeq
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return akep.this;
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
