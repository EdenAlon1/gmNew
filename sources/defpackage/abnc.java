package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abnc extends ffhv implements ffjm {
    final /* synthetic */ abng a;
    final /* synthetic */ aawu b;
    final /* synthetic */ srd c;
    final /* synthetic */ zpd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abnc(srd srdVar, abng abngVar, aawu aawuVar, zpd zpdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = srdVar;
        this.a = abngVar;
        this.b = aawuVar;
        this.d = zpdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((abnc) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.isPresent();
        aawu aawuVar = this.b;
        ?? r7 = this.a.a.get();
        abnb abnbVar = new abnb(aawuVar.a());
        srd srdVar = this.c;
        src srcVar = (src) srdVar.a.b();
        srcVar.getClass();
        ssm ssmVar = (ssm) srdVar.b.b();
        ssmVar.getClass();
        ssm ssmVar2 = (ssm) srdVar.c.b();
        ssmVar2.getClass();
        ffsk ffskVar = (ffsk) srdVar.e.b();
        ffskVar.getClass();
        return new srp(srcVar, ssmVar, ssmVar2, srdVar.d, ffskVar, r7, abnbVar, this.d.b).d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abnc(this.c, this.a, this.b, this.d, ffguVar);
    }
}
