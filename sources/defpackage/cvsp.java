package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsp extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cvsy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsp(cvsy cvsyVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cvsyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvsp cvspVar = new cvsp(this.c, (ffgu) obj3);
        cvspVar.a = (ojf) obj;
        cvspVar.b = (cwir) obj2;
        return cvspVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        return ojz.a((ojf) obj2, new cvso(this.c, (cwir) this.b, null));
    }
}
