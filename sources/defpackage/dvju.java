package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvju implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eyby eybyVar = (eyby) obj;
        evwx evwxVar = (evwx) evwy.a.createBuilder();
        if (eybyVar.b == 1 && eybw.a(1) == 2) {
            evzf evzfVar = (evzf) dvlo.a.fP((eyco) eybyVar.c);
            evwxVar.copyOnWrite();
            evwy evwyVar = (evwy) evwxVar.instance;
            evzfVar.getClass();
            evwyVar.c = evzfVar;
            evwyVar.b = 1;
        }
        if (eybyVar.b == 2 && eybw.a(2) == 3) {
            Object apply = dvlo.b.apply((eybv) eybyVar.c);
            evwxVar.copyOnWrite();
            evwy evwyVar2 = (evwy) evwxVar.instance;
            apply.getClass();
            evwyVar2.c = apply;
            evwyVar2.b = 2;
        }
        int i = eybyVar.b;
        return (evwy) evwxVar.build();
    }
}
