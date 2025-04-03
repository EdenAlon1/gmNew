package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egtu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egub b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egtu(egub egubVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egubVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egtu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffyb ffybVar = new ffyb(new egtt(this.b, null));
            egub egubVar = this.b;
            ffxx b = fgck.b(((egsw) egubVar.a).f, egubVar.f, egubVar.g, ffybVar, new egtr(null));
            egts egtsVar = new egts(this.b);
            this.a = 1;
            if (b.a(egtsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egtu(this.b, ffguVar);
    }
}
