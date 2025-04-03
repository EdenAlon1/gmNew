package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxu implements fbba {
    public static ekrp a(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar2.getClass();
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("ProfileRefreshSynclet");
        ekroVar.c = ffbrVar;
        ekrg ekrgVar = new ekrg();
        Object b = ffbrVar2.b();
        b.getClass();
        ekrgVar.c(((Number) b).longValue(), TimeUnit.MINUTES);
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
