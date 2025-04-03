package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czcn extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public czcn(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        czcn czcnVar = new czcn((ffgu) obj3);
        czcnVar.a = (fbpq) obj;
        czcnVar.b = (czdb) obj2;
        return czcnVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        return obj2 == null ? new czdb(null, 3) : ((czdb) obj3).a == null ? new czdb(Boolean.valueOf(((fbpq) obj2).b), 2) : obj3;
    }
}
