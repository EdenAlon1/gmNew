package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohe extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ofz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohe(ofz ofzVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ofzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ohe oheVar = new ohe(this.c, (ffgu) obj3);
        oheVar.a = (oeo) obj;
        oheVar.b = (oeo) obj2;
        return oheVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        obj3.getClass();
        obj2.getClass();
        ofz ofzVar = this.c;
        ofzVar.getClass();
        oeo oeoVar = (oeo) obj3;
        int i = oeoVar.a;
        oeo oeoVar2 = (oeo) obj2;
        int i2 = oeoVar2.a;
        return i > i2 ? true : i < i2 ? false : oeu.a(oeoVar.b, oeoVar2.b, ofzVar) ? obj3 : obj2;
    }
}
