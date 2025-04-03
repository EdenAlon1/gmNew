package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tds extends ffhv implements ffjm {
    final /* synthetic */ ted a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ byte[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tds(ffgu ffguVar, ted tedVar, byte[] bArr, byte[] bArr2) {
        super(2, ffguVar);
        this.a = tedVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tds) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            return crvx.b(this.b, this.c);
        } catch (Exception e) {
            throw new crvw("Unable to encrypt content", e);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        tds tdsVar = new tds(ffguVar, this.a, this.b, this.c);
        tdsVar.d = obj;
        return tdsVar;
    }
}
