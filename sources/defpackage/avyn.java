package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avyn extends ffhv implements ffjm {
    final /* synthetic */ avzh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avyn(avzh avzhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = avzhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avyn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.h.c());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new avyn(this.a, ffguVar);
    }
}
