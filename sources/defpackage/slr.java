package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class slr extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ slu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slr(slu sluVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = sluVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        slr slrVar = new slr(this.c, (ffgu) obj3);
        slrVar.d = (slz) obj;
        slrVar.b = (ceuw) obj2;
        return slrVar.b(ffcu.a);
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
        slu sluVar = this.c;
        obj2.getClass();
        this.d = null;
        this.a = 1;
        Object a = sluVar.a((slz) obj2, r1, this);
        return a == ffhhVar ? ffhhVar : a;
    }
}
