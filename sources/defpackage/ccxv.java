package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxv extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccxy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxv(ccxy ccxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ccxyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxv) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
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
        ccxy ccxyVar = this.c;
        this.a = 1;
        Object d = ccxyVar.d(map, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccxv ccxvVar = new ccxv(this.c, ffguVar);
        ccxvVar.b = obj;
        return ccxvVar;
    }
}
