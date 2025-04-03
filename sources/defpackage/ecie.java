package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecie extends ecid {
    public static final ecie a = new ecie();

    private ecie() {
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs a(String str, Object obj) {
        HealthStats m93m = afg$$ExternalSyntheticApiModelOutline0.m93m(obj);
        fgll fgllVar = (fgll) fglm.a.createBuilder();
        int a2 = (int) ecig.a(m93m, 50001);
        if (a2 != 0) {
            fgllVar.copyOnWrite();
            fglm fglmVar = (fglm) fgllVar.instance;
            fglmVar.b |= 1;
            fglmVar.c = a2;
        }
        int a3 = (int) ecig.a(m93m, 50002);
        if (a3 != 0) {
            fgllVar.copyOnWrite();
            fglm fglmVar2 = (fglm) fgllVar.instance;
            fglmVar2.b |= 2;
            fglmVar2.d = a3;
        }
        if (str != null) {
            fgle d = ecig.d(str);
            fgllVar.copyOnWrite();
            fglm fglmVar3 = (fglm) fgllVar.instance;
            d.getClass();
            fglmVar3.e = d;
            fglmVar3.b |= 4;
        }
        fglm fglmVar4 = (fglm) fgllVar.build();
        if (ecig.k(fglmVar4)) {
            return null;
        }
        return fglmVar4;
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs b(eyhs eyhsVar, eyhs eyhsVar2) {
        int i;
        int i2;
        fglm fglmVar = (fglm) eyhsVar;
        fglm fglmVar2 = (fglm) eyhsVar2;
        if (fglmVar == null || fglmVar2 == null) {
            return fglmVar;
        }
        fgll fgllVar = (fgll) fglm.a.createBuilder();
        if ((fglmVar.b & 1) != 0 && (i2 = fglmVar.c - fglmVar2.c) != 0) {
            fgllVar.copyOnWrite();
            fglm fglmVar3 = (fglm) fgllVar.instance;
            fglmVar3.b |= 1;
            fglmVar3.c = i2;
        }
        if ((fglmVar.b & 2) != 0 && (i = fglmVar.d - fglmVar2.d) != 0) {
            fgllVar.copyOnWrite();
            fglm fglmVar4 = (fglm) fgllVar.instance;
            fglmVar4.b |= 2;
            fglmVar4.d = i;
        }
        fgle fgleVar = fglmVar.e;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        fgllVar.copyOnWrite();
        fglm fglmVar5 = (fglm) fgllVar.instance;
        fgleVar.getClass();
        fglmVar5.e = fgleVar;
        fglmVar5.b |= 4;
        fglm fglmVar6 = (fglm) fgllVar.build();
        if (ecig.k(fglmVar6)) {
            return null;
        }
        return fglmVar6;
    }

    @Override // defpackage.ecid
    public final /* bridge */ /* synthetic */ String c(eyhs eyhsVar) {
        fgle fgleVar = ((fglm) eyhsVar).e;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        return fgleVar.d;
    }
}
