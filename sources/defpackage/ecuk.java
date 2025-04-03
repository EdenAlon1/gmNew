package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecuk implements ecul {
    @Override // defpackage.ecul
    public final /* synthetic */ String a(eyhr eyhrVar) {
        return ((fgns) ((fgnq) eyhrVar).instance).c;
    }

    @Override // defpackage.ecul
    public final /* synthetic */ String b(eyhr eyhrVar) {
        return ((fgns) ((fgnq) eyhrVar).instance).e;
    }

    @Override // defpackage.ecul
    public final /* bridge */ /* synthetic */ void c(eyhr eyhrVar, Long l) {
        fgnq fgnqVar = (fgnq) eyhrVar;
        if (l == null) {
            fgnqVar.copyOnWrite();
            fgns fgnsVar = (fgns) fgnqVar.instance;
            fgns fgnsVar2 = fgns.a;
            fgnsVar.b &= -3;
            fgnsVar.d = 0L;
            return;
        }
        long longValue = l.longValue();
        fgnqVar.copyOnWrite();
        fgns fgnsVar3 = (fgns) fgnqVar.instance;
        fgns fgnsVar4 = fgns.a;
        fgnsVar3.b |= 2;
        fgnsVar3.d = longValue;
    }

    @Override // defpackage.ecul
    public final /* synthetic */ void d(eyhr eyhrVar) {
        fgnq fgnqVar = (fgnq) eyhrVar;
        fgnqVar.copyOnWrite();
        fgns fgnsVar = (fgns) fgnqVar.instance;
        fgns fgnsVar2 = fgns.a;
        fgnsVar.b &= -5;
        fgnsVar.e = fgns.a.e;
    }
}
