package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cakc b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cajq(ffgu ffguVar, cakc cakcVar, List list) {
        super(2, ffguVar);
        this.b = cakcVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cajq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cakk cakkVar = (cakk) this.b.c.b();
        List list = this.c;
        this.a = 1;
        Object b = cakkVar.b(list, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cajq cajqVar = new cajq(ffguVar, this.b, this.c);
        cajqVar.d = obj;
        return cajqVar;
    }
}
