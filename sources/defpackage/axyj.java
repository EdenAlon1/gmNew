package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyj(ffgu ffguVar, axyy axyyVar, List list) {
        super(2, ffguVar);
        this.b = axyyVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        axyy axyyVar = this.b;
        List list = this.c;
        this.a = 1;
        Object z = axyyVar.z(list, this);
        return z == ffhhVar ? ffhhVar : z;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axyj axyjVar = new axyj(ffguVar, this.b, this.c);
        axyjVar.d = obj;
        return axyjVar;
    }
}
