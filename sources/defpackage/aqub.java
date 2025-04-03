package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqub extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aque b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqub(aque aqueVar, boolean z, boolean z2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqueVar;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqub) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            arag aragVar = (arag) this.b.f.b();
            aque aqueVar = this.b;
            this.a = 1;
            obj = aragVar.b(aqueVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ((aqzv) this.b.g.b()).a(this.c ? alxi.GROUP : alxi.ONE_ON_ONE, this.d, (araf) obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqub(this.b, this.c, this.d, ffguVar);
    }
}
