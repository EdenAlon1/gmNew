package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxb {
    public static final ekrp a(final ffbr ffbrVar) {
        ffbrVar.getClass();
        int i = ekrp.b;
        ekro ekroVar = new ekro();
        ekroVar.a = ekrl.a("DanglingPartsSynclet");
        ekrg ekrgVar = new ekrg();
        ekrgVar.c(((Number) cpwz.b.e()).intValue(), TimeUnit.DAYS);
        ekroVar.b = ekrgVar.a();
        ekroVar.c = new ffbr() { // from class: cpxa
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return (ekrm) ffbr.this.b();
            }
        };
        return ekroVar.a();
    }
}
