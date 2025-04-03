package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqn extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ bvpo b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqn(ffgu ffguVar, bara baraVar, bvpo bvpoVar) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = bvpoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((crrm) this.a.A.b()).e(this.b.f));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqn baqnVar = new baqn(ffguVar, this.a, this.b);
        baqnVar.c = obj;
        return baqnVar;
    }
}
