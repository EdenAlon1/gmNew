package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpce implements cpcc {
    public static final cfva a = cfvl.g(cfvl.b, "server_side_carrier_config_override", eymw.a);
    private final cpbi b;

    public cpce(cpbi cpbiVar) {
        this.b = cpbiVar;
    }

    @Override // defpackage.cpcc
    public final Bundle a(int i) {
        cfva cfvaVar = a;
        cfvaVar.getClass();
        if (this.b.a.a() > 1) {
            return new Bundle();
        }
        Object e = cfvaVar.e();
        e.getClass();
        eymw eymwVar = (eymw) e;
        return ffkj.e(eymwVar, ((cfun) cfvaVar).c) ? new Bundle() : cpbh.a(eymwVar);
    }
}
