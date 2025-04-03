package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqh extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqh(ffgu ffguVar, bara baraVar, int i) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.j.g(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqh baqhVar = new baqh(ffguVar, this.a, this.b);
        baqhVar.c = obj;
        return baqhVar;
    }
}
