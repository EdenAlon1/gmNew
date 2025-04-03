package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxt extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccxy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxt(ccxy ccxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ccxyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxt) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
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
        Set keySet = map.keySet();
        this.a = 1;
        Object a = ffra.a(ekxi.a(ccxyVar.e), new ccxp(null, keySet), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccxt ccxtVar = new ccxt(this.c, ffguVar);
        ccxtVar.b = obj;
        return ccxtVar;
    }
}
