package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccym extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccyq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccym(ccyq ccyqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ccyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccym) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Map map = (Map) this.b;
        ffhd a = ekxi.a(this.c.c);
        ccyl ccylVar = new ccyl(null, map);
        this.a = 1;
        Object a2 = ffra.a(a, ccylVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccym ccymVar = new ccym(this.c, ffguVar);
        ccymVar.b = obj;
        return ccymVar;
    }
}
