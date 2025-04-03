package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvjx implements emwl {
    public abstract void a(exxg exxgVar, evwz evwzVar);

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exxg exxgVar = (exxg) obj;
        evwz evwzVar = (evwz) evxa.a.createBuilder();
        a(exxgVar, evwzVar);
        if ((exxgVar.b & 1) != 0) {
            int i = exxgVar.e;
            evwzVar.copyOnWrite();
            evxa evxaVar = (evxa) evwzVar.instance;
            evxaVar.b |= 1;
            evxaVar.d = i;
        }
        if ((exxgVar.b & 2) != 0) {
            int i2 = exxgVar.f;
            evwzVar.copyOnWrite();
            evxa evxaVar2 = (evxa) evwzVar.instance;
            evxaVar2.b |= 2;
            evxaVar2.e = i2;
        }
        return (evxa) evwzVar.build();
    }
}
