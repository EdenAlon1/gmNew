package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drts extends ffhv implements ffjm {
    int a;
    final /* synthetic */ doxj b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drts(doxj doxjVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doxjVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drts) c((edfo) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        edfo edfoVar = (edfo) this.d;
        doxj doxjVar = this.b;
        List<String> list = this.c;
        edfc edfcVar = (edfc) edfd.a.createBuilder();
        edfcVar.getClass();
        edfcVar.copyOnWrite();
        edfd edfdVar = (edfd) edfcVar.instance;
        edfdVar.b |= 1;
        edfdVar.c = doxjVar.a;
        DesugarCollections.unmodifiableList(edfdVar.d).getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (String str : list) {
            edev edevVar = (edev) edew.a.createBuilder();
            edevVar.getClass();
            edex.b(str, edevVar);
            arrayList.add(edex.a(edevVar));
        }
        edfcVar.copyOnWrite();
        edfd edfdVar2 = (edfd) edfcVar.instance;
        eygr eygrVar = edfdVar2.d;
        if (!eygrVar.c()) {
            edfdVar2.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(arrayList, edfdVar2.d);
        eyfy build = edfcVar.build();
        build.getClass();
        this.a = 1;
        Object d = edfoVar.d((edfd) build, new febo(), this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drts drtsVar = new drts(this.b, this.c, ffguVar);
        drtsVar.d = obj;
        return drtsVar;
    }
}
