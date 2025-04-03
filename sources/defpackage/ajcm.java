package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajcm implements fbba {
    public static ekrp a(ffbr ffbrVar) {
        ffbrVar.getClass();
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("PenpalConversationAutoCleanupSynclet");
        ekroVar.c = ffbrVar;
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(1L, TimeUnit.DAYS);
        ekri ekriVar = new ekri();
        ekriVar.a = ekrk.ON_CHARGER;
        ekrgVar.b(ekriVar.a());
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
