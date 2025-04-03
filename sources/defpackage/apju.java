package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apju extends ffhv implements ffjm {
    final /* synthetic */ apjz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apju(apjz apjzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apjzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apju) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.d.a());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apju(this.a, ffguVar);
    }
}
