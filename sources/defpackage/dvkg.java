package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkg implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exxb exxbVar = (exxb) obj;
        evwn evwnVar = (evwn) evwp.a.createBuilder();
        if ((exxbVar.b & 1) != 0) {
            boolean z = exxbVar.e;
            evwnVar.copyOnWrite();
            evwp evwpVar = (evwp) evwnVar.instance;
            evwpVar.b |= 1;
            evwpVar.e = z;
        }
        if (exxbVar.c == 2 && exxa.a(2) == 3) {
            Object apply = dvmf.b.apply((exxg) exxbVar.d);
            evwnVar.copyOnWrite();
            evwp evwpVar2 = (evwp) evwnVar.instance;
            apply.getClass();
            evwpVar2.d = apply;
            evwpVar2.c = 2;
        }
        if (exxbVar.c == 3 && exxa.a(3) == 4) {
            Object apply2 = dvmf.a.apply((exwt) exxbVar.d);
            evwnVar.copyOnWrite();
            evwp evwpVar3 = (evwp) evwnVar.instance;
            apply2.getClass();
            evwpVar3.d = apply2;
            evwpVar3.c = 3;
        }
        if (exxbVar.c == 5 && exxa.a(5) == 6) {
            Object apply3 = dvmf.c.apply((exwn) exxbVar.d);
            evwnVar.copyOnWrite();
            evwp evwpVar4 = (evwp) evwnVar.instance;
            apply3.getClass();
            evwpVar4.d = apply3;
            evwpVar4.c = 5;
        }
        return (evwp) evwnVar.build();
    }
}
