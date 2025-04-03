package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drtq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ doxj b;
    final /* synthetic */ List c;
    final /* synthetic */ drtt d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drtq(doxj doxjVar, List list, drtt drttVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doxjVar;
        this.c = list;
        this.d = drttVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drtq) c((edfo) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            edfo edfoVar = (edfo) this.e;
            doxj doxjVar = this.b;
            List<String> list = this.c;
            edec edecVar = (edec) eded.a.createBuilder();
            edecVar.getClass();
            edecVar.copyOnWrite();
            eded ededVar = (eded) edecVar.instance;
            ededVar.b |= 1;
            ededVar.c = doxjVar.a;
            DesugarCollections.unmodifiableList(ededVar.d).getClass();
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            for (String str : list) {
                edev edevVar = (edev) edew.a.createBuilder();
                edevVar.getClass();
                edex.b(str, edevVar);
                arrayList.add(edex.a(edevVar));
            }
            edecVar.copyOnWrite();
            eded ededVar2 = (eded) edecVar.instance;
            eygr eygrVar = ededVar2.d;
            if (!eygrVar.c()) {
                ededVar2.d = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(arrayList, ededVar2.d);
            edecVar.copyOnWrite();
            eded ededVar3 = (eded) edecVar.instance;
            ededVar3.e = 1;
            ededVar3.b |= 2;
            eyfy build = edecVar.build();
            build.getClass();
            this.a = 1;
            obj = edfoVar.c((eded) build, new febo(), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        edel edelVar = ((edef) obj).b;
        if (edelVar == null) {
            edelVar = edel.a;
        }
        return edelVar.c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drtq drtqVar = new drtq(this.b, this.c, this.d, ffguVar);
        drtqVar.e = obj;
        return drtqVar;
    }
}
