package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azbz extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ azcf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azbz(azcf azcfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = azcfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azbz) c((Set) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Set set = (Set) this.b;
            azci azciVar = (azci) this.c.c.b();
            this.a = 1;
            obj = azciVar.a(set, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        azcf azcfVar = this.c;
        Iterable<azch> iterable = (Iterable) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(iterable, 10)), 16));
        for (azch azchVar : iterable) {
            ffcf ffcfVar = new ffcf(azchVar.c, azchVar.a);
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        azcfVar.b.f(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(iterable, 10)), 16));
        for (Object obj2 : iterable) {
            linkedHashMap2.put(((azch) obj2).a, obj2);
        }
        return linkedHashMap2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azbz azbzVar = new azbz(this.c, ffguVar);
        azbzVar.b = obj;
        return azbzVar;
    }
}
