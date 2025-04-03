package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvls extends dvjx {
    static final emwl a = new dvmn();
    static final emwl b = new dvlj();

    @Override // defpackage.dvjx
    public final void a(exxg exxgVar, evwz evwzVar) {
        int i = exxgVar.c;
        if (i == 1) {
            evwr evwrVar = (evwr) evwt.a.createBuilder();
            Object apply = b.apply(exxgVar.c == 1 ? (exwv) exxgVar.d : exwv.a);
            evwrVar.copyOnWrite();
            evwt evwtVar = (evwt) evwrVar.instance;
            apply.getClass();
            evwtVar.c = apply;
            evwtVar.b = 1;
            evwzVar.a(evwrVar);
            return;
        }
        if (i == 2) {
            evwr evwrVar2 = (evwr) evwt.a.createBuilder();
            Object apply2 = a.apply(exxgVar.c == 2 ? (exzj) exxgVar.d : exzj.a);
            evwrVar2.copyOnWrite();
            evwt evwtVar2 = (evwt) evwrVar2.instance;
            apply2.getClass();
            evwtVar2.c = apply2;
            evwtVar2.b = 2;
            evwzVar.a(evwrVar2);
        }
    }
}
