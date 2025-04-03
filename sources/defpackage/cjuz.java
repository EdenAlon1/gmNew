package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjuz implements fbba {
    public static ekrp a(ffbr ffbrVar) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        emxf.b(timeUnit.toDays(7L) >= 7, "Setting a expireAfterWrite duration shorter than 1 week is not allowed");
        final ejjj ejjjVar = new ejjj(ffbrVar);
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("com.google.android.apps.messaging.shared.profile.data.peopleapi.cache.KeyValueProfileCacheModule_Companion_provideProfileCacheConfig_ExpiredEntrySyncletModule");
        ekroVar.c = new ffbr() { // from class: ekrn
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return ekrm.this;
            }
        };
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(3L, timeUnit);
        ekrgVar.a = true;
        ekri ekriVar = new ekri();
        ekriVar.a = ekrk.ON_CHARGER;
        ekriVar.b(7L, timeUnit);
        ekrgVar.b(ekriVar.a());
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
