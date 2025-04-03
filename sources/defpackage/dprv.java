package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprv extends ffhv implements ffjm {
    final /* synthetic */ dprw a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprv(dprw dprwVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dprwVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.play(this.b - 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dprv(this.a, this.b, ffguVar);
    }
}
