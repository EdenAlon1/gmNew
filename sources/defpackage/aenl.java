package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aenl extends ffhv implements ffjn {
    final /* synthetic */ aenq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenl(aenq aenqVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.a = aenqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new aenl(this.a, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.compareAndSet(true, false);
        return ffcu.a;
    }
}
