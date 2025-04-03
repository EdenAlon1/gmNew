package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdkm extends ffhv implements ffjm {
    final /* synthetic */ cdkp a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdkm(ffgu ffguVar, cdkp cdkpVar, String str, int i, boolean z, boolean z2) {
        super(2, ffguVar);
        this.a = cdkpVar;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdkm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d(this.b, this.c, this.d, this.e);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdkm cdkmVar = new cdkm(ffguVar, this.a, this.b, this.c, this.d, this.e);
        cdkmVar.f = obj;
        return cdkmVar;
    }
}
