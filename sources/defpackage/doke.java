package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doke extends ffhv implements ffjm {
    final /* synthetic */ dojy a;
    final /* synthetic */ hjz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doke(dojy dojyVar, hjz hjzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dojyVar;
        this.b = hjzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doke) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.b.i(this.a.b);
        this.a.c.invoke((dokl) this.a.a.get(this.b.c()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new doke(this.a, this.b, ffguVar);
    }
}
