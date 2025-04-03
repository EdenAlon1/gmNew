package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwr {
    public static ekrp a(ffbr ffbrVar) {
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("CobaltSynclet");
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(Duration.ofHours(((Integer) alwj.d.e()).intValue()).toHours(), TimeUnit.HOURS);
        ekroVar.b = ekrgVar.a();
        ekroVar.c = ffbrVar;
        return ekroVar.a();
    }
}
