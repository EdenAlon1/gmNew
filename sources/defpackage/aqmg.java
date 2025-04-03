package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqmg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqmh b;
    final /* synthetic */ aoku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqmg(aqmh aqmhVar, aoku aokuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqmhVar;
        this.c = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqmg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aqmh aqmhVar = this.b;
        aoku aokuVar = this.c;
        this.a = 1;
        Object e = aqmhVar.e(aokuVar, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqmg(this.b, this.c, ffguVar);
    }
}
