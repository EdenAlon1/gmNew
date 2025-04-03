package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypu extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ yqb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypu(yqb yqbVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = yqbVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        ?? r1 = this.c;
        if (!(((atti) this.e.n.b()).a() ? ((aqvj) this.d).a() : ((cnpk) obj2).b()) || (r1 != 0 && r1.s())) {
            List c = ((ysk) this.e.d.b()).c();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : c) {
                if ((!ffkj.e((yrz) obj3, yrv.a)) | z) {
                    arrayList.add(obj3);
                }
            }
            list = arrayList;
        } else {
            list = ffdx.b(yru.a);
        }
        return ((ysk) this.e.d.b()).a(list);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ypu ypuVar = new ypu(this.e, (ffgu) obj5);
        ypuVar.a = (cnpk) obj;
        ypuVar.b = booleanValue;
        ypuVar.c = (aqux) obj3;
        ypuVar.d = (aqvj) obj4;
        return ypuVar.b(ffcu.a);
    }
}
