package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cphz implements emwl {
    @Override // defpackage.emwl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awud apply(espw espwVar) {
        awty awtyVar = (awty) awud.a.createBuilder();
        b(espwVar, awtyVar);
        Object apply = cpjh.a.apply(espwVar.b);
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.d = ((awua) apply).v;
        awudVar.b |= 2;
        Object apply2 = cpjh.b.apply(espwVar.c);
        awtyVar.copyOnWrite();
        awud awudVar2 = (awud) awtyVar.instance;
        awudVar2.e = ((awyd) apply2).g;
        awudVar2.b |= 4;
        return (awud) awtyVar.build();
    }

    public abstract void b(espw espwVar, awty awtyVar);
}
