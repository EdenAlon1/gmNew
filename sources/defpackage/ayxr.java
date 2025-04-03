package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayxr implements fbba {
    public static ekrp a(final ayxp ayxpVar) {
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("ConversationDedupingSynclet");
        ekroVar.c = new ffbr() { // from class: ayxq
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return ayxp.this;
            }
        };
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(86400000L, TimeUnit.MILLISECONDS);
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
