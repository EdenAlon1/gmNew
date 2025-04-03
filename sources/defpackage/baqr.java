package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqr extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ lh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqr(ffgu ffguVar, bara baraVar, byte[] bArr, lh lhVar) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = bArr;
        this.c = lhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.M.d(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqr baqrVar = new baqr(ffguVar, this.a, this.b, this.c);
        baqrVar.d = obj;
        return baqrVar;
    }
}
