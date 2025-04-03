package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gym extends ffhv implements ffjn {
    /* synthetic */ float a;
    final /* synthetic */ gzl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gym(gzl gzlVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = gzlVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        gym gymVar = new gym(this.b, (ffgu) obj3);
        gymVar.c = (ffsk) obj;
        gymVar.a = floatValue;
        return gymVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ffsk, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffqy.d(this.c, null, null, new gyl(this.b, this.a, null), 3);
        return ffcu.a;
    }
}
