package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecuj implements ecul {
    @Override // defpackage.ecul
    public final /* synthetic */ String a(eyhr eyhrVar) {
        return ((fgky) ((fgkv) eyhrVar).instance).f;
    }

    @Override // defpackage.ecul
    public final /* synthetic */ String b(eyhr eyhrVar) {
        return ((fgky) ((fgkv) eyhrVar).instance).e;
    }

    @Override // defpackage.ecul
    public final /* bridge */ /* synthetic */ void c(eyhr eyhrVar, Long l) {
        fgkv fgkvVar = (fgkv) eyhrVar;
        if (l == null) {
            fgkvVar.copyOnWrite();
            fgky fgkyVar = (fgky) fgkvVar.instance;
            fgky fgkyVar2 = fgky.a;
            fgkyVar.b &= -3;
            fgkyVar.d = 0L;
            return;
        }
        long longValue = l.longValue();
        fgkvVar.copyOnWrite();
        fgky fgkyVar3 = (fgky) fgkvVar.instance;
        fgky fgkyVar4 = fgky.a;
        fgkyVar3.b |= 2;
        fgkyVar3.d = longValue;
    }

    @Override // defpackage.ecul
    public final /* synthetic */ void d(eyhr eyhrVar) {
        fgkv fgkvVar = (fgkv) eyhrVar;
        fgkvVar.copyOnWrite();
        fgky fgkyVar = (fgky) fgkvVar.instance;
        fgky fgkyVar2 = fgky.a;
        fgkyVar.b &= -5;
        fgkyVar.e = fgky.a.e;
    }
}
