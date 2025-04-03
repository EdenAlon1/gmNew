package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cczr extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cdaf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cczr(cdaf cdafVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cdafVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cczr) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
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
        ccum ccumVar = this.c.d;
        this.a = 1;
        Object d = ccumVar.d(map);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cczr cczrVar = new cczr(this.c, ffguVar);
        cczrVar.b = obj;
        return cczrVar;
    }
}
