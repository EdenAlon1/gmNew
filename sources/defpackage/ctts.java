package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctts {
    public static final ekrp a(final cttu cttuVar) {
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("SuggestionCleanupSynclet");
        ekroVar.c = new ffbr() { // from class: cttr
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return cttu.this;
            }
        };
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(1L, TimeUnit.DAYS);
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }
}
