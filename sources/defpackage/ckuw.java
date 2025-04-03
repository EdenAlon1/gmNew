package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckuw {
    public static final ekrp a(ffbr ffbrVar) {
        ffbrVar.getClass();
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("MmsGroupUpgradeSynclet");
        ekroVar.c = ffbrVar;
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(3L, TimeUnit.HOURS);
        ekri ekriVar = new ekri();
        ekriVar.a = ekrk.ON_NETWORK_CONNECTED;
        ekrgVar.b(ekriVar.a());
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }
}
