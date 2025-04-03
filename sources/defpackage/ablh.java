package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ablh extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ int b;

    public ablh(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        ablh ablhVar = new ablh((ffgu) obj3);
        ablhVar.a = (ablm) obj;
        ablhVar.b = intValue;
        return ablhVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        int i = this.b;
        if (obj2 != null) {
            return (cbnd) ffdx.N(((ablm) obj2).b, i);
        }
        return null;
    }
}
