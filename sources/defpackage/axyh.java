package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axyh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyh(axyy axyyVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axyyVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        Object y = axyyVar.y(list, this);
        return y == ffhhVar ? ffhhVar : y;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axyh(this.b, this.c, ffguVar);
    }
}
