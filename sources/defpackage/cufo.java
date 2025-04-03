package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cufr b;
    final /* synthetic */ culh c;
    final /* synthetic */ cugj d;
    final /* synthetic */ cukx e;
    final /* synthetic */ erdy f;
    final /* synthetic */ int g;
    final /* synthetic */ erer h;
    final /* synthetic */ cula i;
    final /* synthetic */ fbcx j;
    final /* synthetic */ cukz k;
    final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cufo(cufr cufrVar, culh culhVar, cugj cugjVar, cukx cukxVar, erdy erdyVar, int i, erer ererVar, cula culaVar, fbcx fbcxVar, cukz cukzVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cufrVar;
        this.c = culhVar;
        this.d = cugjVar;
        this.e = cukxVar;
        this.f = erdyVar;
        this.g = i;
        this.h = ererVar;
        this.i = culaVar;
        this.j = fbcxVar;
        this.k = cukzVar;
        this.l = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cufo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cugi cugiVar = (cugi) this.b.a.b();
            culh culhVar = this.c;
            cugj cugjVar = this.d;
            this.a = 1;
            obj = cugiVar.c(culhVar.c, culhVar.d, cugjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cukx cukxVar = this.e;
        erdy erdyVar = this.f;
        int i2 = this.g;
        erer ererVar = this.h;
        ereo ereoVar = (ereo) obj;
        erdv a = cufr.a(cukxVar, erdyVar, i2);
        a.copyOnWrite();
        erdw erdwVar = (erdw) a.instance;
        erdw erdwVar2 = erdw.a;
        erdwVar.e = ererVar.a();
        erdwVar.b |= 4;
        float a2 = this.i.a();
        a.copyOnWrite();
        erdw erdwVar3 = (erdw) a.instance;
        erdwVar3.b |= 8;
        erdwVar3.f = a2;
        fbcx fbcxVar = this.j;
        a.copyOnWrite();
        erdw erdwVar4 = (erdw) a.instance;
        erdwVar4.g = fbcxVar.a();
        erdwVar4.b |= 16;
        Set set = this.k.a;
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((cukx) it.next()).a());
        }
        a.a(arrayList);
        String str = this.l;
        a.copyOnWrite();
        erdw erdwVar5 = (erdw) a.instance;
        erdwVar5.b |= 128;
        erdwVar5.k = str;
        eyfy build = a.build();
        build.getClass();
        ereoVar.copyOnWrite();
        ereq ereqVar = (ereq) ereoVar.instance;
        ereq ereqVar2 = ereq.a;
        ereqVar.d = (erdw) build;
        ereqVar.c = 4;
        cufu cufuVar = (cufu) this.b.b.b();
        erdk erdkVar = (erdk) erdl.a.createBuilder();
        erdkVar.copyOnWrite();
        erdl erdlVar = (erdl) erdkVar.instance;
        ereq ereqVar3 = (ereq) ereoVar.build();
        ereqVar3.getClass();
        erdlVar.c = ereqVar3;
        erdlVar.b = 1;
        eyfy build2 = erdkVar.build();
        build2.getClass();
        cufuVar.b((erdl) build2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cufo(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, ffguVar);
    }
}
