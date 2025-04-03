package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcyo extends ffhv implements ffjm {
    final /* synthetic */ dcyp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcyo(dcyp dcypVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dcypVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dcyo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dcyp dcypVar = this.a;
        dcypVar.b.k(dcypVar.a.fe(), true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dcyo(this.a, ffguVar);
    }
}
