package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkc implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eybi eybiVar = (eybi) obj;
        evyt evytVar = (evyt) evyu.a.createBuilder();
        if ((eybiVar.b & 1) != 0) {
            boolean z = eybiVar.c;
            evytVar.copyOnWrite();
            evyu evyuVar = (evyu) evytVar.instance;
            evyuVar.b |= 1;
            evyuVar.c = z;
        }
        if ((eybiVar.b & 2) != 0) {
            emwl emwlVar = dvlz.a;
            eyaj eyajVar = eybiVar.d;
            if (eyajVar == null) {
                eyajVar = eyaj.a;
            }
            Object apply = emwlVar.apply(eyajVar);
            evytVar.copyOnWrite();
            evyu evyuVar2 = (evyu) evytVar.instance;
            apply.getClass();
            evyuVar2.d = (evxu) apply;
            evyuVar2.b |= 2;
        }
        if ((eybiVar.b & 8) != 0) {
            emwl emwlVar2 = dvlz.b;
            eybg eybgVar = eybiVar.e;
            if (eybgVar == null) {
                eybgVar = eybg.b;
            }
            Object apply2 = emwlVar2.apply(eybgVar);
            evytVar.copyOnWrite();
            evyu evyuVar3 = (evyu) evytVar.instance;
            apply2.getClass();
            evyuVar3.e = (evys) apply2;
            evyuVar3.b |= 8;
        }
        return (evyu) evytVar.build();
    }
}
