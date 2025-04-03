package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprp {
    public static final ekrp a(final cprn cprnVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ekrg ekrgVar = new ekrg();
        Object b = ffbrVar.b();
        b.getClass();
        ekrgVar.c(((Number) b).longValue(), TimeUnit.MINUTES);
        if (!((Boolean) ffbrVar2.b()).booleanValue()) {
            ekri ekriVar = new ekri();
            ekriVar.a = ekrk.ON_NETWORK_CONNECTED;
            ekrgVar.b(ekriVar.a());
        }
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("TachygramPullMessagesSynclet");
        ekroVar.c = new ffbr() { // from class: cpro
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return cprn.this;
            }
        };
        ekroVar.b = ekrgVar.a();
        return ekroVar.a();
    }
}
