package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xet extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public xet(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xet xetVar = new xet((ffgu) obj3);
        xetVar.a = (ffcf) obj;
        xetVar.b = (dnmx) obj2;
        return xetVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = ((ffcf) this.a).a;
        Object obj3 = this.b;
        Object obj4 = (dnmx) obj2;
        if (obj3 != null) {
            obj4 = obj3;
        }
        return new ffcf(obj4, Boolean.valueOf(obj3 != null));
    }
}
