package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivk extends ffkk implements ffix {
    final /* synthetic */ ivm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivk(ivm ivmVar) {
        super(0);
        this.a = ivmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [iqj] */
    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        iqf iqfVar;
        ?? r0;
        iwi iwiVar = this.a.p().v;
        if (iwiVar == null || (r0 = iwiVar.l) == 0) {
            iwx a = ium.a(this.a.o());
            ffji ffjiVar = iqm.a;
            iqfVar = new iqf(a);
        } else {
            iqfVar = r0;
        }
        ivm ivmVar = this.a;
        ffji ffjiVar2 = ivmVar.C;
        iga igaVar = ivmVar.D;
        if (igaVar != null) {
            iqfVar.i(ivmVar.p(), ivmVar.E, igaVar, ivmVar.F);
        } else if (ffjiVar2 == null) {
            iqfVar.f(ivmVar.p(), ivmVar.E, ivmVar.F);
        } else {
            iqfVar.h(ivmVar.p(), ivmVar.E, ivmVar.F, ffjiVar2);
        }
        return ffcu.a;
    }
}
