package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghq extends ffhv implements ffjn {
    /* synthetic */ float a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghq(ffji ffjiVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        ghq ghqVar = new ghq(this.b, (ffgu) obj3);
        ghqVar.a = floatValue;
        return ghqVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.b.invoke(new Float(this.a));
        return ffcu.a;
    }
}
