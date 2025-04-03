package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqo extends ffhv implements ffjm {
    final /* synthetic */ bdfy a;
    final /* synthetic */ bara b;
    final /* synthetic */ bvpo c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cpbd e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqo(ffgu ffguVar, bdfy bdfyVar, bara baraVar, bvpo bvpoVar, boolean z, cpbd cpbdVar) {
        super(2, ffguVar);
        this.a = bdfyVar;
        this.b = baraVar;
        this.c = bvpoVar;
        this.d = z;
        this.e = cpbdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a != null) {
            return ((bdmq) this.b.g.b()).F(this.a.a(), this.c.f, this.d, false);
        }
        bdmq bdmqVar = (bdmq) this.b.g.b();
        cpbd cpbdVar = this.e;
        cpbdVar.getClass();
        bvpo bvpoVar = this.c;
        return bdmqVar.E(cpbdVar.a, bvpoVar.f, this.d, cpbdVar.b.size() > 1);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqo baqoVar = new baqo(ffguVar, this.a, this.b, this.c, this.d, this.e);
        baqoVar.f = obj;
        return baqoVar;
    }
}
