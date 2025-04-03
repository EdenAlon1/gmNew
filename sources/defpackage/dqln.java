package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqln extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dqlp c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqln(dqlp dqlpVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqlpVar;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqln) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = (String) this.b;
        dqlp dqlpVar = this.c;
        aej aejVar = new aej();
        Object[] array = this.d.toArray(new String[0]);
        this.a = 1;
        Object e = dski.e(dqlpVar.b, str, aejVar, array, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqln dqlnVar = new dqln(this.c, this.d, ffguVar);
        dqlnVar.b = obj;
        return dqlnVar;
    }
}
