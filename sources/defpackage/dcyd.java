package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcyd extends ffhv implements ffjm {
    final /* synthetic */ dcyg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcyd(dcyg dcygVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dcygVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dcyd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cmem a = this.a.k.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dcyd(this.a, ffguVar);
    }
}
