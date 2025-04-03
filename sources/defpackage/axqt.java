package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axqt extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ffjr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axqt(ffjr ffjrVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = ffjrVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        axqt axqtVar = new axqt(this.d, (ffgu) obj3);
        axqtVar.b = (ffcl) obj;
        axqtVar.c = (ffcl) obj2;
        return axqtVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        Object obj3 = this.c;
        ffjr ffjrVar = this.d;
        ffcl ffclVar = (ffcl) obj2;
        Object obj4 = ffclVar.a;
        Object obj5 = ffclVar.b;
        Object obj6 = ffclVar.c;
        ffcl ffclVar2 = (ffcl) obj3;
        Object obj7 = ffclVar2.a;
        Object obj8 = ffclVar2.b;
        Object obj9 = ffclVar2.c;
        this.b = null;
        this.a = 1;
        Object i2 = ffjrVar.i(obj4, obj5, obj6, obj7, obj8, obj9, this);
        return i2 == ffhhVar ? ffhhVar : i2;
    }
}
