package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecui implements ecul {
    @Override // defpackage.ecul
    public final /* synthetic */ String a(eyhr eyhrVar) {
        return ((fgqx) ((fgqw) eyhrVar).instance).e;
    }

    @Override // defpackage.ecul
    public final /* synthetic */ String b(eyhr eyhrVar) {
        return ((fgqx) ((fgqw) eyhrVar).instance).d;
    }

    @Override // defpackage.ecul
    public final /* bridge */ /* synthetic */ void c(eyhr eyhrVar, Long l) {
        fgqw fgqwVar = (fgqw) eyhrVar;
        if (l == null) {
            fgqwVar.copyOnWrite();
            fgqx fgqxVar = (fgqx) fgqwVar.instance;
            fgqx fgqxVar2 = fgqx.a;
            fgqxVar.b &= -2;
            fgqxVar.c = 0L;
            return;
        }
        long longValue = l.longValue();
        fgqwVar.copyOnWrite();
        fgqx fgqxVar3 = (fgqx) fgqwVar.instance;
        fgqx fgqxVar4 = fgqx.a;
        fgqxVar3.b |= 1;
        fgqxVar3.c = longValue;
    }

    @Override // defpackage.ecul
    public final /* synthetic */ void d(eyhr eyhrVar) {
        fgqw fgqwVar = (fgqw) eyhrVar;
        fgqwVar.copyOnWrite();
        fgqx fgqxVar = (fgqx) fgqwVar.instance;
        fgqx fgqxVar2 = fgqx.a;
        fgqxVar.b &= -3;
        fgqxVar.d = fgqx.a.d;
    }
}
