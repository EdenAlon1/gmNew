package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avzi extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ avzn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avzi(avzn avznVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = avznVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        avzi avziVar = new avzi(this.c, (ffgu) obj3);
        avziVar.d = (avzq) obj;
        avziVar.b = (ceuw) obj2;
        return avziVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ceuw, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.d;
        ?? r1 = this.b;
        avzn avznVar = this.c;
        obj2.getClass();
        this.d = null;
        this.a = 1;
        Object b = avznVar.b((avzq) obj2, r1, this);
        return b == ffhhVar ? ffhhVar : b;
    }
}
