package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class culv extends ffhv implements ffjm {
    final /* synthetic */ culw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public culv(culw culwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = culwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((culv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.e());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new culv(this.a, ffguVar);
    }
}
