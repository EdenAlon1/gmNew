package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumz {
    public static final ekrp a(final cumx cumxVar) {
        cumxVar.getClass();
        ekrg ekrgVar = new ekrg();
        Object e = cumo.f.e();
        e.getClass();
        ekrgVar.c(((Number) e).longValue(), TimeUnit.MINUTES);
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("TemplateFetcherSynclet");
        ekroVar.c = new ffbr() { // from class: cumy
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return cumx.this;
            }
        };
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }
}
