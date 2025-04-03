package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbok extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public dbok(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dbok dbokVar = new dbok((ffgu) obj3);
        dbokVar.a = (List) obj;
        dbokVar.b = (dbqb) obj2;
        return dbokVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r2 = this.a;
        r2.add(this.b);
        return r2;
    }
}
