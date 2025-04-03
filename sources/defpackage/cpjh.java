package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpjh extends cphz {
    static final emwl a = new cpjf();
    static final emwl b = new cpjg();

    @Override // defpackage.cphz
    public final void b(espw espwVar, awty awtyVar) {
        espw espwVar2 = espw.a;
        if (espu.a(espwVar)) {
            awuc awucVar = awuc.FAILED_TRANSIENTLY;
            awtyVar.copyOnWrite();
            awud awudVar = (awud) awtyVar.instance;
            awud awudVar2 = awud.a;
            awudVar.c = awucVar.f;
            awudVar.b |= 1;
            return;
        }
        awuc awucVar2 = awuc.FAILED_PERMANENTLY;
        awtyVar.copyOnWrite();
        awud awudVar3 = (awud) awtyVar.instance;
        awud awudVar4 = awud.a;
        awudVar3.c = awucVar2.f;
        awudVar3.b |= 1;
    }
}
